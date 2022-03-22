/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package uv.fei.sistemadetutorias.bussinesslogic;

import uv.fei.sistemadetutorias.domain.Academico;
//import java.util.List;
/**
 *
 * @author cashd
 */
public interface IAcademicoDAO {
   // public List<Academico> buscarAcademicoPorNombre(String nombre);
    public boolean agregarAcademico(Academico academicoAAgregar);
    /**
     * sepa como se hace
     * public bool asignarCargo(String cargo);
     * Hacerlo desde roles
     * @param cargo
     * @return 
     */
  //  public String asignarProgramaEducativo(String clavePrograma);
   // public String asignarExperienciaEducativa(String nrc);
    //public List<ExperienciaEducativa> mostrarExperienciasEducativasImpartidas(String numeroDePersonal);
    
}
