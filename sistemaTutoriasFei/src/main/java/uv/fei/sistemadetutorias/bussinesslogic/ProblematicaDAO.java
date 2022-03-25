/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.fei.sistemadetutorias.bussinesslogic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import org.openide.util.Exceptions;
import uv.fei.sistemadetutorias.dataaccess.DataBaseConnection;
import uv.fei.sistemadetutorias.domain.Problematica;

/**
 *
 * @author Zinedinne
 */
public class ProblematicaDAO implements IProblematicaDAO {
    
    final String INSERT = "INSERT INTO problematica(idSesion, titulo, descripcion) VALUES (?,?,?)";
    final String UPDATE = "UPDATE problematica SET descripcion = ? WHERE idProblematica = ?";
    final String DELETE = "DELETE FROM problematica WHERE idProblematica = ?";
    final String GETALL = "SELECT idSesion, titulo, descripcion FROM problematica";
    final String GETONE = "SELECT idDeSesion, titulo, descripcion FROM problematica WHERE idProblematica = ?";

    @Override
    public void insertarProblematica(Problematica problematica) {
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        try(Connection connection=dataBaseConnection.getConnection()){
            PreparedStatement stat=connection.prepareStatement(INSERT);
             stat.setInt(1, problematica.getIdSesion());
             stat.setString(2, problematica.getTitulo());
             //stat.setInt(3, problematica.getIdSolucionProblematica());
             stat.setString(3, problematica.getDescripcion());
             
            if (stat.executeUpdate() == 0){
                throw new SQLException("No se pudo ingresar");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProblematicaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    @Override
    public void modificarProblematica(Problematica problematica) {
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        try(Connection connection=dataBaseConnection.getConnection()){
            PreparedStatement stat=connection.prepareStatement(UPDATE);
             stat.setString(1, problematica.getDescripcion());
             stat.setInt(2, problematica.getIdProblematica());
             
            if (stat.executeUpdate() == 0){
                throw new SQLException("No se pudo actualizar");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProblematicaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void eliminarProblematica(Problematica problematica) {
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        try(Connection connection=dataBaseConnection.getConnection()){
            PreparedStatement stat=connection.prepareStatement(DELETE);
             stat.setInt(1, problematica.getIdProblematica());
            
             
            if (stat.executeUpdate() == 0){
                throw new SQLException("No se pudo eliminar");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProblematicaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Problematica> consultarProblematica() {
        
        ArrayList<Problematica> problematicas = new ArrayList<>();                
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        try(Connection connection=dataBaseConnection.getConnection()){
            PreparedStatement statement=connection.prepareStatement(GETALL);
            ResultSet resultSet=statement.executeQuery();
            if (resultSet.next()==false){
                throw new SQLException("no se encontraron problematicas");
            }else{
                int idSesion=0;
                String titulo="";
                String descripcion="";
                do {
                    idSesion= resultSet.getInt("idSesion");
                    titulo=resultSet.getString("titulo");
                    descripcion=resultSet.getString("descripcion");
                    Problematica problematica = new Problematica();
                    problematica.setIdSesion(idSesion);
                    problematica.setTitulo(titulo);
                    problematica.setDescripcion(descripcion);
                    problematicas.add(problematica);
                }while (resultSet.next());
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProblematicaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return problematicas;
    }
    

    @Override
    public Problematica buscarProblematica(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
