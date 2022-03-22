package uv.fei.sistemadetutorias.bussinesslogic;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
import uv.fei.sistemadetutorias.domain.ExperienciaEducativa;
import java.util.List;
/**
 *
 * @author cashd
 */
public interface IExperienciaEducativaDAO {
    public List<ExperienciaEducativa> consultarOfertaEducativaPorClaveDeProgramaEducativo (String claveProgramaEducativo);
    public boolean eliminarExperienciaEducativaPorNrc (int nrc);
    public boolean agregarExperienciaEducativa(ExperienciaEducativa experienciaEducativa);
}
