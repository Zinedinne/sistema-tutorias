/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uv.fei.sistemadetutorias.bussinesslogic;

import java.util.List;
import java.lang.String;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import uv.fei.sistemadetutorias.domain.ExperienciaEducativa;
import uv.fei.sistemadetutorias.domain.Academico;
import uv.fei.sistemadetutorias.dataaccess.DataBaseConnection;

/**
 *
 * @author cashd
 */
public class ExperienciaEducativaDAO implements IExperienciaEducativaDAO{

    /**
     *
     * @param claveProgramaEducativo 
     * @return List<ExperienciaEducativa>
     */
    @Override
    public List<ExperienciaEducativa> consultarOfertaEducativaPorClaveDeProgramaEducativo(String claveProgramaEducativo){
        ArrayList<ExperienciaEducativa> experienciasEducativas = new ArrayList<>();
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        try(Connection connection = dataBaseConnection.getConnection()){ 
            String consulta = "SELECT ee.nrc, ee.nombre, a.nombre, a. apellidoPaterno, a.apellidomaterno, ee.clavecarrera from experienciaeducativa as ee, academico as a where ee.nrc=a.nrc && ee.claveCarrera= ?";
            PreparedStatement statement = connection.prepareStatement(consulta);
            statement.setString(1, claveProgramaEducativo);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next() == false){
                throw new SQLException ("No se encontraron Experiencias Educativas");
            }
            else{
                int nrc = 0;
                String nombreExperienciaEducativa = "";
                String nombreAcademico = "";
                String apellidoPaterno = "";
                String apellidoMaterno;
                String clave = "";
                do {
                    nrc = resultSet.getInt("nrc");
                    nombreExperienciaEducativa = resultSet.getString("nombre");
                    nombreAcademico = resultSet.getString("a.nombre");
                    apellidoPaterno = resultSet.getString("apellidopaterno");
                    apellidoMaterno = resultSet.getString("apellidoMaterno");
                    claveProgramaEducativo = resultSet.getString("clavecarrera");
                    ExperienciaEducativa experienciaEducativa = new ExperienciaEducativa();
                    Academico academico = new Academico();
                    experienciaEducativa.setNrc(nrc);
                    experienciaEducativa.setNombre(nombreExperienciaEducativa);
                    academico.setNombre(nombreAcademico);
                    academico.setApellidoPaterno(apellidoPaterno);
                    academico.setApellidoMaterno(apellidoMaterno);
                    experienciaEducativa.setClaveProgramaEducativo(claveProgramaEducativo);
                    experienciaEducativa.setAcademico(academico);
                    experienciasEducativas.add(experienciaEducativa);
                } while (resultSet.next());
            }
        }
        catch (SQLException ex){
            Logger.getLogger(ExperienciaEducativaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return experienciasEducativas;
    }
    
    public int buscarExperienciaEducativaPorNrc(int nrc){
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        int resultado = 0;
        try ( Connection connection = dataBaseConnection.getConnection() ){
            String consulta = "Select * FROM experienciaeducativa where nrc=?";
            PreparedStatement statement = connection.prepareStatement(consulta);
            statement.setInt(1, nrc);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next() == false){
                throw new SQLException("No se encontraron Experiencias educativas");
            }
            else{
                do{
                    resultado++;
                }while (resultSet.next());
            }
        }
        catch (SQLException ex){
            Logger.getLogger(ExperienciaEducativaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
    @Override
    public boolean eliminarExperienciaEducativaPorNrc (int nrc){
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        int resultado = 0;
        try ( Connection connection = dataBaseConnection.getConnection() ){
            int numeroDeRegistros;
            numeroDeRegistros = buscarExperienciaEducativaPorNrc(nrc);
            if(numeroDeRegistros == 1){
                String consulta = "DELETE FROM experienciaeducativa where nrc=?";
                PreparedStatement statement = connection.prepareStatement(consulta);
                statement.setInt(1, nrc);
                resultado = statement.executeUpdate();
            }
        }
        catch (SQLException ex){
            Logger.getLogger(ExperienciaEducativaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        boolean registroExitoso;
        if (resultado > 0) {
            registroExitoso = true;
        }
        else {
            registroExitoso = false;
        }
        return registroExitoso;
    }
    public boolean agregarExperienciaEducativa(ExperienciaEducativa experienciaEducativa){
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        int resultado = 0;
        try (Connection connection = dataBaseConnection.getConnection()){
            String consulta = "INSERT INTO experienciaeducativa (nrc, nombre, clavecarrera) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(consulta);
            statement.setInt(1, experienciaEducativa.getNrc());
            statement.setString(2, experienciaEducativa.getNombre());
            statement.setString(3, experienciaEducativa.getClaveProgramaEducativo());
            resultado = statement.executeUpdate();
        }
        catch (SQLException ex){
            Logger.getLogger(ExperienciaEducativaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (resultado > 0) {
            return true;
        }
        return false;
    }
}
