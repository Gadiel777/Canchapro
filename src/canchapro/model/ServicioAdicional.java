/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package canchapro.model;

/**
 *
 * @author perem
 */
public class ServicioAdicional {
    private String codigo;
    private String nombre;
    private double precio;
    
    public ServicioAdicional () {
    
}
    //Constructor
    public ServicioAdicional (String codigo, String nombre, double precio){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public String getcodigo(){
        return codigo;
    }
    
    public void setcodigo(String codigo){
        this.codigo = codigo;
    }
    
    public String getnombre(){
        return nombre;
    }
    
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    
    public double getprecio(){
        return precio;
    }
    
    public void setprecio(double precio){
        this.precio = precio;
    }
    
    public String aTextoCSV(){
        return codigo + "," + nombre + "," + precio;
        
    }
     
    public static ServicioAdicional desdeTextCSV(String lineaCSV){
        String [] partes = lineaCSV.split(",");
        if (partes.length >= 3){
        String codigo = partes[0].trim();
        String nombre = partes[1].trim();
        double precio = Double.parseDouble(partes[2].trim());
        return new ServicioAdicional (codigo, nombre, precio);
        }
        return null;
    }
    
    @Override
    public String toString(){
        return nombre + "(+Q " + precio + ")";
        
    }
    
}

