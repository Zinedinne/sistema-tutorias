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
import uv.fei.sistemadetutorias.bussinesslogic.SolucionProblematicaDAO;
import uv.fei.sistemadetutorias.domain.Problematica;
import uv.fei.sistemadetutorias.domain.SolucionProblematica;
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
        
        
        //Insertar problematica
        /*
        ProblematicaDAO dao = new ProblematicaDAO();
        Problematica problematica = new Problematica();
        problematica.setIdSesion(1);
        problematica.setTitulo("No pudo asistir a clase");
        problematica.setDescripcion("Se enfermó");
        dao.insertarProblematica(problematica);
        */
        
        //consultar problematica
        /*
        ProblematicaDAO problematicaDao = new ProblematicaDAO();
                ArrayList<Problematica> problematicas= (ArrayList<Problematica>) problematicaDao.consultarProblematica();
                for(Problematica problematica : problematicas){
                    System.out.println(String.format("Se encontró: %d %s %s",problematica.getIdSesion(), problematica.getTitulo(), problematica.getDescripcion()));
                        
                }
        */
                
        //Actualizar problematica
        /*
        ProblematicaDAO dao = new ProblematicaDAO();
        Problematica problematica = new Problematica();
        problematica.setIdProblematica(8);
        problematica.setDescripcion("Se enfermó del estómago");
        dao.modificarProblematica(problematica);
        */
        
        //eliminar problematica
        /*
        ProblematicaDAO dao = new ProblematicaDAO();
        Problematica problematica = new Problematica();
        problematica.setIdProblematica(4);
        dao.eliminarProblematica(problematica);
        */
        
        //Insertar solucionProblematica
        /*
        SolucionProblematicaDAO dao = new SolucionProblematicaDAO();
        SolucionProblematica solucionProblematica = new SolucionProblematica();
        solucionProblematica.setIdProblematica(4);
        solucionProblematica.setDescripcionSolucion("Hablar con sus profesores y pedir prórroga");
        dao.insertarSolucionProblematica(solucionProblematica);
        */
        
        //Actualizar solucionProblematica
        /*
        SolucionProblematicaDAO dao = new SolucionProblematicaDAO();
        SolucionProblematica solucionProblematica = new SolucionProblematica();
        solucionProblematica.setIdProblematica(4);
        solucionProblematica.setDescripcionSolucion("Se habló con sus profesores y otorgaron prórroga");
        dao.modificarSolucionProblematica(solucionProblematica);
        */
        
        //consultar solucionProblematica
        /*
        SolucionProblematicaDAO solucionProblematicaDao = new SolucionProblematicaDAO();
        SolucionProblematica solucionProblematica = new SolucionProblematica();
        solucionProblematica = (SolucionProblematica) solucionProblematicaDao.buscarSolucionProblematica(8);
        System.out.println(String.format("Se encontró: %s", solucionProblematica.getDescripcionSolucion()));
        */
        
    }
}
