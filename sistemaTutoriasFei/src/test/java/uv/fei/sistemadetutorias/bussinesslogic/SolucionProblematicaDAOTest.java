/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.fei.sistemadetutorias.bussinesslogic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import uv.fei.sistemadetutorias.domain.SolucionProblematica;
import java.sql.SQLException;

/**
 *
 * @author Zinedinne
 */
public class SolucionProblematicaDAOTest {
    
    public SolucionProblematicaDAOTest() {
    }

    /**
     * Test of insertarSolucionProblematica method, of class SolucionProblematicaDAO.
     */
    /*
    @Test
    public void testInsertarSolucionProblematica() {
        System.out.println("insertarSolucionProblematica");
        SolucionProblematica SolucionProblematica = null;
        SolucionProblematicaDAO instance = new SolucionProblematicaDAO();
        instance.insertarSolucionProblematica(SolucionProblematica);
        fail("The test case is a prototype.");
    }
    */
    /**
     * Test of modificarSolucionProblematica method, of class SolucionProblematicaDAO.
     */
    
    /*
    @Test
    public void testModificarSolucionProblematicaSucess() {
        int idProblematica = 8;
        SolucionProblematicaDAO instance = new SolucionProblematicaDAO();
        SolucionProblematica expectedSolucionProblematica = new SolucionProblematica();
        expectedSolucionProblematica.setDescripcionSolucion("Se habló con sus profesores y otorgaron prórroga");
        SolucionProblematica result = instance.buscarSolucionProblematica(idProblematica);
        assertEquals(expectedSolucionProblematica, result);
    }
    
    @Test
    public void testModificarSolucionProblematicaFailed() {
        System.out.println("modificarSolucionProblematica");
        SolucionProblematica SolucionProblematica = null;
        SolucionProblematicaDAO instance = new SolucionProblematicaDAO();
        instance.modificarSolucionProblematica(SolucionProblematica);
        fail("The test case is a prototype.");
    }
    */
    /**
     * Test of buscarSolucionProblematica method, of class SolucionProblematicaDAO.
     */
    @Test
    public void testBuscarSolucionProblematicaSuccess() {
        int idProblematica = 8;
        SolucionProblematicaDAO instance = new SolucionProblematicaDAO();
        SolucionProblematica expectedSolucionProblematica = new SolucionProblematica();
        expectedSolucionProblematica.setDescripcionSolucion("Se habló con sus profesores y otorgaron prórroga");
        SolucionProblematica result = instance.buscarSolucionProblematica(idProblematica);
        assertEquals(expectedSolucionProblematica, result);
    }
    
    @Test
    public void testBuscarSolucionProblematicaFailed(){
        int idProblematica = 9;
        SolucionProblematicaDAO instance = new SolucionProblematicaDAO();
        SolucionProblematica expectedSolucionProblematica = new SolucionProblematica();
        expectedSolucionProblematica.setDescripcionSolucion("");
        SolucionProblematica result = instance.buscarSolucionProblematica(idProblematica);
        assertEquals(expectedSolucionProblematica, result);
    }
    
}
