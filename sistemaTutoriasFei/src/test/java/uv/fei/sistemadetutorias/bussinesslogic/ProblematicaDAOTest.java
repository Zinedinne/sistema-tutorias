/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.fei.sistemadetutorias.bussinesslogic;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import uv.fei.sistemadetutorias.domain.Problematica;

/**
 *
 * @author Zinedinne
 */
public class ProblematicaDAOTest {
    
    public ProblematicaDAOTest() {
    }

    /**
     * Test of insertarProblematica method, of class ProblematicaDAO.
     */
    @Test
    public void testInsertarProblematica() {
        System.out.println("insertarProblematica");
        Problematica problematica = null;
        ProblematicaDAO instance = new ProblematicaDAO();
        instance.insertarProblematica(problematica);
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarProblematica method, of class ProblematicaDAO.
     */
    @Test
    public void testModificarProblematica() {
        System.out.println("modificarProblematica");
        Problematica problematica = null;
        ProblematicaDAO instance = new ProblematicaDAO();
        instance.modificarProblematica(problematica);
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarProblematica method, of class ProblematicaDAO.
     */
    @Test
    public void testEliminarProblematica() {
        System.out.println("eliminarProblematica");
        Problematica problematica = null;
        ProblematicaDAO instance = new ProblematicaDAO();
        instance.eliminarProblematica(problematica);
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarProblematica method, of class ProblematicaDAO.
     */
    @Test
    public void testConsultarProblematicaSuccess() {
        ProblematicaDAO instance = new ProblematicaDAO();
        List<Problematica> expectedResult = new ArrayList<>();
        Problematica expectedProblematica1 = new Problematica();
        Problematica expectedProblematica2 = new Problematica();
        expectedProblematica1.setIdSesion(1);
        expectedProblematica1.setTitulo("No pudo asistir a clase");
        expectedProblematica1.setDescripcion("se enfermó");
        expectedResult.add(expectedProblematica1);
        expectedProblematica2.setIdSesion(3);
        expectedProblematica2.setTitulo("No tiene conexión a internet");
        expectedProblematica2.setDescripcion("No puede tomar clases en línea");
        expectedResult.add(expectedProblematica2);
        List<Problematica> result = instance.consultarProblematica();
        assertEquals(expectedResult, result);
    }
    
    public void testConsultarProblematicaFailed() {
        ProblematicaDAO instance = new ProblematicaDAO();
        List<Problematica> expectedResult = new ArrayList<>();
        Problematica expectedProblematica1 = new Problematica();
        Problematica expectedProblematica2 = new Problematica();
        expectedProblematica1.setIdSesion(1);
        expectedProblematica1.setTitulo("No pudo asistir a clase");
        expectedProblematica1.setDescripcion("enfermó");
        expectedResult.add(expectedProblematica1);
        expectedProblematica2.setIdSesion(3);
        expectedProblematica2.setTitulo("No tiene conexión a internet");
        expectedProblematica2.setDescripcion("No puede tomar clases en línea");
        expectedResult.add(expectedProblematica2);
        List<Problematica> result = instance.consultarProblematica();
        assertNotSame(expectedResult, result);
    }
    /**
     * Test of buscarProblematica method, of class ProblematicaDAO.
     */
    
    
   
    
    @Test
    public void testBuscarProblematica() {
        System.out.println("buscarProblematica");
        int id = 0;
        ProblematicaDAO instance = new ProblematicaDAO();
        Problematica expResult = null;
        Problematica result = instance.buscarProblematica(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
