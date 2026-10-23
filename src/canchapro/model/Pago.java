/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package canchapro.model;

/**
 *
 * @author perem
 */
public class Pago {
    private String codigo;
    private double monto;
    private String metodopago;
    private String estado;
    
    public Pago(){
        
    }
      
    
    //Constructor
    public Pago(String codigo, double monto, String metodopago, String estado){
    this.codigo = codigo;
    this.monto = monto;
    this.metodopago = metodopago;
    this.estado  = estado;
    }
    
    public String getcodigo(){
        return codigo;
    }
    
    public void setcodigo (String codigo){
        this.codigo = codigo;
    }
    
    public double getmonto(){
        return monto;
    }
    
    public void setmonto(double monto){
        this.monto = monto;
    }
    
    public String getmetodopago(){
        return metodopago;
    }
    
    public void setmetodopago(String metodopago){
        this.metodopago = metodopago;
    }
    
    public String getestado(){
        return estado;
    }
    
    public void setestado(String estado){
        this.estado = estado;
    }
    
    public String aTextCSV(){
        return codigo + "," + monto + "," + metodopago + "," + estado;
    }
    
    public static Pago desdeTextCSV (String lineaCSV){
        String partes[] = lineaCSV.split(",");
        if (partes.length >= 4){
            String codigo = partes [0].trim();
            double monto = Double.parseDouble(partes[1].trim());
            String metodopago = (partes[2].trim());
            String estado = (partes[3].trim());
            return new Pago(codigo, monto, metodopago, estado);
        }
        return null;
    }
    
    @Override
    public String toString(){
        return "Pago [" + codigo + "] - Q" + monto + "(" + metodopago + ") - " +estado;
    }
}
