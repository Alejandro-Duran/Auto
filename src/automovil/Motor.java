/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automovil;

/**
 *
 * @author richardeuse
 */
public class Motor {
    private String marca;
    private boolean combustionInterna;
    private String modelo;
    
    public Motor(){
        
    }
    
    public Motor(String marca, boolean combustionInterna, String modelo){
        this.marca=marca;
        this.combustionInterna=combustionInterna;
        this.modelo=modelo;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca=marca;
    }
    
    public boolean getCombustionInterna(){
        return combustionInterna;
    }
    
    public void setCombustionInterna(boolean combustionInterna){
        this.combustionInterna=combustionInterna;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    
    public void Encender(){
        System.out.println("El motor esta encendido");
    }
    
    public void Calentarse(){
        System.out.println("El motor ya se ha calentado. Pude empezar a manejar");
    }
}
