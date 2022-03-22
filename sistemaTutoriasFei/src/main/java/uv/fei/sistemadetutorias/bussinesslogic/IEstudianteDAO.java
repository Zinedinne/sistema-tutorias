/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package uv.fei.sistemadetutorias.bussinesslogic;

import uv.fei.sistemadetutorias.domain.Estudiante;
import java.util.List;
/**
 *
 * @author oscar
 */
public interface IEstudianteDAO {
    public List<Estudiante> buscarEstudiantePorNombre(String buscarNombre);
    public List<Estudiante> agregarEstudiantes(String matricula, String nombre, String apellidoPaterno, String apellidoMaterno, String correoPersonal, String correoInstitucional);
}
