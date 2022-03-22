/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uv.fei.sistemadetutorias.domain;

import uv.fei.sistemadetutorias.domain.Academico;
/**
 *
 * @author cashd
 */
public class ExperienciaEducativa {
    private int nrc = 0;
    private String nombre = "";
    private String claveProgramaEducativo = "";
    private int numeroDePersonalAcademico = 0;
    private Academico academico = null;
    
    public ExperienciaEducativa() {
    }

    public ExperienciaEducativa(int nrc, String nombre, String claveProgramaEducativo) {
        this.nrc = nrc;
        this.nombre = nombre;
        this.claveProgramaEducativo = claveProgramaEducativo;
    }

    public ExperienciaEducativa(int nrc, String nombre, String claveProgramaEducativo, int numeroDePersonalAcademico) {
        this.nrc = nrc;
        this.nombre = nombre;
        this.claveProgramaEducativo = claveProgramaEducativo;
        this.numeroDePersonalAcademico = numeroDePersonalAcademico;
    }

    public int getNrc() {
        return nrc;
    }

    public void setNrc(int nrc) {
        this.nrc = nrc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClaveProgramaEducativo() {
        return claveProgramaEducativo;
    }

    public void setClaveProgramaEducativo(String claveProgramaEducativo) {
        this.claveProgramaEducativo = claveProgramaEducativo;
    }

    public int getNumeroDePersonalAcademico() {
        return numeroDePersonalAcademico;
    }

    public void setNumeroDePersonalAcademico(int numeroDePersonalAcademico) {
        this.numeroDePersonalAcademico = numeroDePersonalAcademico;
    }

    public Academico getAcademico() {
        return academico;
    }

    public void setAcademico(Academico academico) {
        this.academico = academico;
    }
    
    
}
