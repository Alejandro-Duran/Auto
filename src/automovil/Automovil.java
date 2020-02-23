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
public class Automovil {
    private String marca;
    private String modelo;
    private String color;
    private Llanta ruedas;
    private Motor motorcito;
    private Chasis esqueleto;

    public Automovil() {
    }

    public Automovil(String marca, String modelo, String color, Llanta ruedas, Motor motorcito, Chasis esqueleto) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.ruedas = ruedas;
        this.motorcito = motorcito;
        this.esqueleto = esqueleto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Llanta getRuedas() {
        return ruedas;
    }

    public void setRuedas(Llanta ruedas) {
        this.ruedas = ruedas;
    }

    public Motor getMotorcito() {
        return motorcito;
    }

    public void setMotorcito(Motor motorcito) {
        this.motorcito = motorcito;
    }

    public Chasis getEsqueleto() {
        return esqueleto;
    }

    public void setEsqueleto(Chasis esqueleto) {
        this.esqueleto = esqueleto;
    }
    
    public void EncenderAuto(){
        System.out.println("El auto esta encendido");
    }
    
    public void Acelerar(){
        System.out.println("El auto esta aumentando la velocidad");
    }
    
    public void Apagar(){
        System.out.println("Apagando auto");
    }
}
