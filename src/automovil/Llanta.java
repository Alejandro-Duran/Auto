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
public class Llanta {
    private boolean camara;
    private String marca;
    private int medida;

    public Llanta() {
    }

    public Llanta(boolean camara, String marca, int medida) {
        this.camara = camara;
        this.marca = marca;
        this.medida = medida;
    }

    public boolean getCamara() {
        return camara;
    }

    public void setCamara(boolean camara) {
        this.camara = camara;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getMedida() {
        return medida;
    }

    public void setMedida(int medida) {
        this.medida = medida;
    }
    
    public void Inflar(){
        System.out.println("Llantas infladas");
    }
    
    public void Calentarse (){
        System.out.println("Las llantas se han calentado demasiado");
    }
}
