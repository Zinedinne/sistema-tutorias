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
//import java.util.Date;
import java.sql.Date;
import uv.fei.sistemadetutorias.dataaccess.DataBaseConnection;
import uv.fei.sistemadetutorias.domain.SesionDeTutoria;

/**
 *
 * @author cashd
 */
//public class SesionDeTutoriaDAO implements ISesionDeTutoriaDAO{
    /*
    @Override
    public SesionDeTutoria registrarFechaDeTutoria(int numeroDeSesion, int dia, int mes, int anio, String periodo){
        Date fecha = new Date((long)fecha);
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        try(Connection connection=dataBaseConnection.getConnection()){
            String query="Insert into sesiondetutoria(numeroDeSesion, periodo, fechaSesion) values (? ? ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, numeroDeSesion);
            statement.setString(2, periodo);
            /*  20220822
            TODO:
            Checar documentación setDate
            En SQL el formato Date es YYYY/MM/DD
            */
  /*
            statement.setDate(3, sate); 
            ResultSet resultSet=statement.executeQuery();                
        }catch (SQLException ex){
            
        }
    }
*/
//}
