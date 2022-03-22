/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uv.fei.sistemadetutorias.bussinesslogic;

import java.lang.String;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import uv.fei.sistemadetutorias.dataaccess.DataBaseConnection;
import uv.fei.sistemadetutorias.domain.Academico;
/**
 *
 * @author cashd
 */
public class AcademicoDAO implements IAcademicoDAO{

    /**
     *
     * @param nombre
     * @param apellidoPaterno
     * @param apellidoMaterno
     * @param correoPersonal
     * @param correoInstitucional
     * @param numeroDePersonal
     * @return
     */
    @Override
    public boolean agregarAcademico(Academico academico){
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        int resultado = 0;
        try(Connection connection = dataBaseConnection.getConnection()){
            String query = "INSERT INTO academico (numeroDePersonal, nombre, apellidoPaterno, apellidoMaterno, correoPersonal, correoInstitucional, nrc) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, academico.getNumeroDePersonal());
            statement.setString(2, academico.getNombre());
            statement.setString(3, academico.getApellidoPaterno());
            statement.setString(4, academico.getApellidoMaterno());
            statement.setString(5, academico.getCorreoPersonal());
            statement.setString(6, academico.getCorreoInstitucional());
            statement.setInt(7, academico.getNrc());
            resultado = statement.executeUpdate();
        }
        catch (SQLException ex){
            Logger.getLogger(AcademicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(resultado > 0){
            return true;
        }
        return false;
         
        
    }
}
