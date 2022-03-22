/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package uv.fei.sistemadetutorias.bussinesslogic;

import uv.fei.sistemadetutorias.domain.SesionDeTutoria;
import java.util.List;

/**
 *
 * @author cashd
 */
public interface ISesionDeTutoriaDAO {
    public boolean registrarFechaDeTutoria(int numeroDeSesion, String fechaTutoria, String periodo);
   // public SesionDeTutoria consultarPorNumeroDeSesion(int numeroDeSesion);
   // public List<SesionDeTutoria> consultarSesionesDeTutoria();
}
