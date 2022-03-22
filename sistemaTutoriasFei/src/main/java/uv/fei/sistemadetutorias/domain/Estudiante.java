/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uv.fei.sistemadetutorias.domain;

/**
 *
 * @author oscar
 */
public class Estudiante {
    private String matricula;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String correoPersonal;
    private String correoInstitucional;
    
    /**
     * @return la matrícula
     */
    public String getMatricula(){
        return matricula;
    }
    
    /**
     * @param matricula establece la matricula
     */
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    /**
     * @return el nombre
     */
    public String getNombre(){
        return nombre;
    }
    
    /**
     * @param nombre establece la nombre
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
   
    /**
     * @return el apellidoPaterno
     */
    public String getApellidoPaterno(){
        return apellidoPaterno;
    }
    
    /**
     * @param apellidoPaterno establece la apellidoPaterno
     */
    public void setApellidoPaterno(String apellidoPaterno){
        this.apellidoPaterno = apellidoPaterno;
    }
    
    /**
     * @return el apellidoMaterno
     */
    public String getApellidoMaterno(){
        return apellidoMaterno;
    }
    
    /**
     * @param apellidoMaterno establece la apellidoMaterno
     */
    public void setApellidoMaterno(String apellidoMaterno){
        this.apellidoMaterno = apellidoMaterno;
    }
    
    /**
     * @return el correoPersonal
     */
    public String getCorreoPersonal(){
        return correoPersonal;
    }
    
    /**
     * @param correoPersonal establece la correoPersonal
     */
    public void setCorreoPersonal(String correoPersonal){
        this.correoPersonal = correoPersonal;
    }
    
    /**
     * @return el correoInstitucional
     */
    public String getCorreoInstitucional(){
        return correoInstitucional;
    }
    
    /**
     * @param correoInstitucional establece la correoInstitucional
     */
    public void setCorreoInstitucional(String correoInstitucional){
        this.correoInstitucional = correoInstitucional;
    }
    
}

