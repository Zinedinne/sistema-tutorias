/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.fei.sistemadetutorias.domain;

import java.util.Objects;

/**
 *
 * @author Zinedinne
 */
public class SolucionProblematica {
    private int idSolucionProblematica;
    private int idProblematica;
    private String descripcionSolucion;

    public SolucionProblematica() {
        this.descripcionSolucion = "";
    }


    

    public int getIdSolucionProblematica() {
        return idSolucionProblematica;
    }

    public void setIdSolucionProblematica(int idSolucionProblematica) {
        this.idSolucionProblematica = idSolucionProblematica;
    }

    public int getIdProblematica() {
        return idProblematica;
    }

    public void setIdProblematica(int idProblematica) {
        this.idProblematica = idProblematica;
    }
    

    public String getDescripcionSolucion() {
        return descripcionSolucion;
    }

    public void setDescripcionSolucion(String descripcionSolucion) {
        this.descripcionSolucion = descripcionSolucion;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        boolean isEquals=false;
        if (object == this){
            isEquals=true;
        }
        if(object!=null && object instanceof SolucionProblematica){
            SolucionProblematica other = (SolucionProblematica) object;
            isEquals= this.getDescripcionSolucion().equals(other.getDescripcionSolucion());
        }
        return isEquals;
    }
    
    

    @Override
    public String toString() {
        return "SolucionProblematica{" + "idSolucionProblematica=" + idSolucionProblematica + ", descripcionSolucion=" + descripcionSolucion + '}';
    }
}
