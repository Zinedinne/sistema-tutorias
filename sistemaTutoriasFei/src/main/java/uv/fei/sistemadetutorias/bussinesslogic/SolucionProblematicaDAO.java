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
import java.util.logging.Level;
import java.util.logging.Logger;
import uv.fei.sistemadetutorias.dataaccess.DataBaseConnection;
import uv.fei.sistemadetutorias.domain.SolucionProblematica;

/**
 *
 * @author Zinedinne
 */
public class SolucionProblematicaDAO implements ISolucionProblematicaDAO {
    
    final String INSERT = "INSERT INTO solucionproblematica(idProblematica, descripcionSolucion) VALUES (?,?)";
    final String UPDATE = "UPDATE solucionproblematica SET descripcionSolucion = ? WHERE idProblematica = ?";
    final String GETONE = "SELECT descripcionSolucion FROM solucionproblematica WHERE idProblematica = ?";

    @Override
    public void insertarSolucionProblematica(SolucionProblematica SolucionProblematica) {
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        try(Connection connection=dataBaseConnection.getConnection()){
            PreparedStatement stat=connection.prepareStatement(INSERT);
             stat.setInt(1, SolucionProblematica.getIdProblematica());
             stat.setString(2, SolucionProblematica.getDescripcionSolucion());
             
            if (stat.executeUpdate() == 0){
                throw new SQLException("No se pudo ingresar");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProblematicaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modificarSolucionProblematica(SolucionProblematica SolucionProblematica) {
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        try(Connection connection=dataBaseConnection.getConnection()){
            PreparedStatement stat=connection.prepareStatement(UPDATE);
             stat.setString(1, SolucionProblematica.getDescripcionSolucion());
             stat.setInt(2, SolucionProblematica.getIdProblematica());
             
            if (stat.executeUpdate() == 0){
                throw new SQLException("No se pudo actualizar");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SolucionProblematicaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public SolucionProblematica buscarSolucionProblematica(int idProblematica) {
        SolucionProblematica solucionProblematica = new SolucionProblematica();                
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        try(Connection connection=dataBaseConnection.getConnection()){
            PreparedStatement stat=connection.prepareStatement(GETONE);
            stat.setInt(1, idProblematica);
            ResultSet resultSet=stat.executeQuery();
            if (resultSet.next()==false){
                throw new SQLException("no se encontraron soluciones");
            }else{
                String descripcionSolucion="";
                descripcionSolucion=resultSet.getString("descripcionSolucion");
                solucionProblematica.setDescripcionSolucion(descripcionSolucion);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProblematicaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return solucionProblematica;
    }
    
}
