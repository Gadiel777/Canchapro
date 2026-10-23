/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package canchapro.model;

/**
 *
 * @author perem
 */
public class Cliente {
    private String codigo;
    private String nombre;
    private String telefono;
    
    public Cliente(){
    }
    
    //Constructor
    
    public Cliente(String codigo, String nombre, String telefono){
        this.codigo = codigo;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    public String getcodigo(){
        return codigo;
    }
    public void setcodigo (String codigo){
        this.codigo = codigo;
    }
    
    public String getnombre(){
        return nombre;
    }
    
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    
    public String gettelefono (){
        return telefono;
    }
    
    public String ClienteaTextCSV(){
        return codigo +"," + nombre + telefono;
    }
    
    public static   Cliente desdeTextCSV(String lineaCSV){
        String[] partes = lineaCSV.split(",");
        if (partes.length >= 3){
            String codigo = partes[0].trim();
            String nombre = partes [1].trim();
            String telefono = partes[2].trim();
            return new Cliente(codigo, nombre, telefono);
            
        }
        return null;
    }
    
    @Override
    public String toString(){
        return nombre + " (" + telefono + ")";
    }
}
