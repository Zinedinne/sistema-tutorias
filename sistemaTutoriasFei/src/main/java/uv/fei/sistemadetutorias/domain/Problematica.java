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
public class Problematica {
    private int idProblematica;
    private int idSesion;
    private String titulo;
    private String descripcion;

    public int getIdProblematica() {
        return idProblematica;
    }

    public void setIdProblematica(int idProblematica) {
        this.idProblematica = idProblematica;
    }

    public int getIdSesion() {
        return idSesion;
    }

    public void setIdSesion(int idSesion) {
        this.idSesion = idSesion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

   

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
         boolean isEquals=false;
        if (object == this){
            isEquals=true;
        }
        if(object!=null && object instanceof Problematica){
            Problematica other = (Problematica) object;
            isEquals= this.getDescripcion().equals(other.getDescripcion()) && this.getTitulo().equals(other.getTitulo()) && this.getIdSesion()==other.getIdSesion() ;
        }
        return isEquals;
    }

    
    
    @Override
    public String toString() {
        return "Problematica{" + "idProblematica=" + idProblematica + ", idSesion=" + idSesion + ", titulo=" + titulo + ", descripcion=" + descripcion + '}';
    }

    
}
