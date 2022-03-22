package uv.fei.sistemadetutorias.domain;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cashd
 */
public class Academico {
    private int numeroDePersonal;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String correoPersonal;
    private String correoInstitucional;
    private int nrc;

    public Academico() {
    }

    
    public Academico(int numeroDePersonal, String nombre, String apellidoPaterno, String apellidoMaterno, String correoPersonal, String correoInstitucional, int nrc) {
        this.numeroDePersonal = numeroDePersonal;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.correoPersonal = correoPersonal;
        this.correoInstitucional = correoInstitucional;
        this.nrc = nrc;
    }

    public int getNumeroDePersonal() {
        return numeroDePersonal;
    }

    public void setNumeroDePersonal(int numeroDePersonal) {
        this.numeroDePersonal = numeroDePersonal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getCorreoPersonal() {
        return correoPersonal;
    }

    public void setCorreoPersonal(String correoPersonal) {
        this.correoPersonal = correoPersonal;
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }

    public int getNrc() {
        return nrc;
    }

    public void setNrc(int nrc) {
        this.nrc = nrc;
    }
    
}
