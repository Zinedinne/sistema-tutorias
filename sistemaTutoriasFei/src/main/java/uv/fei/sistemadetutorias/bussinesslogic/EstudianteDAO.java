/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uv.fei.sistemadetutorias.bussinesslogic;

/**
 *
 * @author oscar
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import uv.fei.sistemadetutorias.dataaccess.DataBaseConnection;
import uv.fei.sistemadetutorias.domain.Estudiante;

public class EstudianteDAO {
    
    public List<Estudiante> buscarEstudiantePorNombre(String buscarNombre){
        ArrayList<Estudiante> estudianteB = new ArrayList<>();
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        return estudianteB;
    }
    
}
