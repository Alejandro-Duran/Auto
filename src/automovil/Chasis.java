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
public class Chasis {
    private String marca;
    private String resilencia;
    private float pesoCapacidad;
    
    public Chasis(){
        
    }

    public Chasis(String marca, String resilencia, float pesoCapacidad) {
        this.marca = marca;
        this.resilencia = resilencia;
        this.pesoCapacidad = pesoCapacidad;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca=marca;
    }

    public String getResilencia() {
        return resilencia;
    }

    public void setResilencia(String resilencia) {
        this.resilencia = resilencia;
    }

    public float getPesoCapacidad() {
        return pesoCapacidad;
    }

    public void setPesoCapacidad(float pesoCapacidad) {
        this.pesoCapacidad = pesoCapacidad;
    }
    
    public void AbsorberImpacto(){
        System.out.println("Ha chocado");
    }
    
    public void EvitarDeformación(){
        System.out.println("El auto tiene buena proporcion");
    }
}
