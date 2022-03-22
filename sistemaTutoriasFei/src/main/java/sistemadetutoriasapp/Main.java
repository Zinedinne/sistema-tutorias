/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadetutoriasapp;

import java.io.*;
import java.lang.*;
import uv.fei.sistemadetutorias.bussinesslogic.AcademicoDAO;
import uv.fei.sistemadetutorias.domain.Academico;
import uv.fei.sistemadetutorias.bussinesslogic.ExperienciaEducativaDAO;
import uv.fei.sistemadetutorias.domain.ExperienciaEducativa;
import java.util.ArrayList;
import uv.fei.sistemadetutorias.bussinesslogic.ProblematicaDAO;
import uv.fei.sistemadetutorias.domain.Problematica;
/**
 *
 * @author cashd
 */
public class Main{
    public static void main(String[] args) {
        /**
         * Método Académico
        */
        
     //   AcademicoDAO academico = new AcademicoDAO(); 
        
        /**
         * Agregar
         */
      //  Academico objetoAcademico = new Academico(78944, "Jorge Octavio", "Ocharan", "Hernandez", "jocharan@gmail.com", "jocharan@uv.mx", 5745);
      //  boolean resultado = academico.agregarAcademico(objetoAcademico);
      //  System.out.println(resultado);
        
        /**
         * Métodos Experiencia Educativa
        */
       // ExperienciaEducativaDAO experienciaEducativaDao = new ExperienciaEducativaDAO();
        
        /**
         * Consultar
        */
      //  ArrayList<ExperienciaEducativa> experiencias= (ArrayList<ExperienciaEducativa>) experienciaEducativaDao.consultarOfertaEducativaPorClaveDeProgramaEducativo("ISOF");
      //  for(ExperienciaEducativa experiencia : experiencias){
      //      System.out.println(String.format("Experiencia encontrada: %d %s %s %s %s %s",experiencia.getNrc(), experiencia.getNombre(), experiencia.getAcademico().getNombre(), experiencia.getAcademico().getApellidoPaterno(), experiencia.getAcademico().getApellidoMaterno(),experiencia.getClaveProgramaEducativo()));
      //  }
        
        /**
         * Eliminar
         * Nrc 5789 corresponde a Principios de construcción de software
         */
       // boolean resultadoEliminar = experienciaEducativaDao.eliminarExperienciaEducativaPorNrc(5789);
       // System.out.println(resultadoEliminar);
        
        /**
         * Agregar
         * NOTA: Dice que no guarda pero sí hace el registro
        */
        /*
        ExperienciaEducativa experienciaEducativa = new ExperienciaEducativa(6987, "Lectura y Redaccion", "TECO");
        experienciaEducativaDao.agregarExperienciaEducativa(experienciaEducativa);
        boolean resultadoAgregar = experienciaEducativaDao.agregarExperienciaEducativa(experienciaEducativa); 
        System.out.println(resultadoAgregar);
        */
        
        
        /*
        
        ProblematicaDAO dao = new ProblematicaDAO();
        Problematica problematica = new Problematica();
        problematica.setIdSesion(1);  
        problematica.setTitulo("Se enfermó");
        problematica.setDescripcion("El estudiante se enfermó");
        problematica.setSolucion("El estudiante va al doctor");
        dao.insertarProblematica(problematica);
        */
    }
}
