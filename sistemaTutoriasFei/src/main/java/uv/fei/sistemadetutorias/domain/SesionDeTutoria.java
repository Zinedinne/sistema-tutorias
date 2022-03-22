package uv.fei.sistemadetutorias.domain;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cashd
 */
public class SesionDeTutoria {
    private String periodo;
    private int numeroDeSesion;
    private String fechaSesion;

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public int getNumeroDeSesion() {
        return numeroDeSesion;
    }

    public void setNumeroDeSesion(int numeroDeSesion) {
        this.numeroDeSesion = numeroDeSesion;
    }

    public String getFechaSesion() {
        return fechaSesion;
    }

    public void setFechaSesion(String fechaSesion) {
        this.fechaSesion = fechaSesion;
    }
}
