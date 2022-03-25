/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.fei.sistemadetutorias.bussinesslogic;

import uv.fei.sistemadetutorias.domain.SolucionProblematica;

/**
 *
 * @author Zinedinne
 */
public interface ISolucionProblematicaDAO {
    void insertarSolucionProblematica(SolucionProblematica Solucionproblematica);
    void modificarSolucionProblematica(SolucionProblematica Solucionproblematica);
    SolucionProblematica buscarSolucionProblematica(int idProblematica);
}
