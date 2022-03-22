/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uv.fei.sistemadetutorias.bussinesslogic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Date;
import uv.fei.sistemadetutorias.dataaccess.DataBaseConnection;
import uv.fei.sistemadetutorias.domain.SesionDeTutoria;

/**
 *
 * @author cashd
 */
public class SesionDeTutoriaDAO implements ISesionDeTutoriaDAO{
    //@Override
    public boolean registrarFechaDeTutoria(int numeroDeSesion, String fechaSesion, String periodo){
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        Connection connection = null;
        int columnasAfectadas = 0;
        try{
            connection = dataBaseConnection.getConnection();
            Date date = Date.valueOf(fechaSesion);
            String query = "Insert into sesiondetutoria(numeroDeSesion, periodo, fechaSesion) values (? ? ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, numeroDeSesion);
            statement.setString(2, periodo);
            statement.setDate(3, date);
            columnasAfectadas=statement.executeUpdate();
        }
        catch(SQLException ex){
          
        }
        finally{
          if(connection != null){
            try{
                if(!connection.isClosed()){
                  connection.close();
                }
            }
            catch (SQLException ex){
                Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
          }  
        }
        if (columnasAfectadas > 0){
            return true;
        }
        return false;
    }
    
    
}
