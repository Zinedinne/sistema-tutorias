/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.fei.sistemadetutorias.bussinesslogic;

import java.util.List;
import uv.fei.sistemadetutorias.domain.Problematica;

/**
 *
 * @author Zinedinne
 */
public interface IProblematicaDAO {
    void insertarProblematica(Problematica problematica);
    void modificarProblematica(Problematica problematica);
    void eliminarProblematica(Problematica problematica);
    List<Problematica> consultarProblematica();
    Problematica buscarProblematica(int id);
}
