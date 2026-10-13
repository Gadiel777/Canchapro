/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package canchapro.model;

public class Cancha {
    private String codigo;
    private String nombre;
    private String tipo;
    private double precioporhora;
    private Estadocancha estado;
    
    public Cancha() {
    this.estado = Estadocancha.Disponible;
    
}   //Constructor
    public Cancha (String codigo, String nombre, String tipo, double precioporhora, Estadocancha estado){
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precioporhora = precioporhora;
        this.estado = estado;
        
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
    
    public String gettipo(){
    return tipo;
    }
    
    public void settipo(String tipo){
    this.tipo = tipo;
    }
    
    public double getprecioporhora(){
    return precioporhora;
    }
    
    public void setprecioporhora(double precioporhora){
    this.precioporhora = precioporhora;
    }
    
    public Estadocancha getestado(){
    return estado;
    }
    
    public void setestado(Estadocancha estado){
    this.estado = estado;
    }
    
    public String aTextoCSV(){
    return codigo + "," + nombre + "," + tipo + "," + precioporhora + "," + estado.name();
    }
    
    public static Cancha desdeTextCSV (String lineaCSV) {
    String[] partes = lineaCSV.split(",");
    if (partes.length >=5){
        String codigo = partes[0].trim();
        String nombre = partes[1].trim();
        String tipo = partes[2].trim();
        double precio = Double.parseDouble(partes[3].trim());
        Estadocancha estado = Estadocancha.valueOf(partes[4].trim());
        return new Cancha(codigo, nombre, tipo, precio, estado);
    }
        return null;
    }
   
    @Override
    public String toString(){
    return nombre + "(" + tipo + " - Q" + precioporhora + "/hr)";
    }
}

