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
public class AutomovilTest {
    public static void main(String[] args) {
        Automovil auto1=new Automovil();
        auto1.setMarca("Ford");
        System.out.println("La marca del automovil es:"+auto1.getMarca());
        auto1.setModelo("Explorer 1995");
        System.out.println("El modelo del automovil es:"+auto1.getModelo());
        auto1.setColor("Gris");
        System.out.println("El color del automovil es:"+auto1.getColor());
        auto1.setRuedas(new Llanta (true,"Michelline",6));
        System.out.print("Las caracteristicas de las llantas son:"+auto1.getRuedas().getCamara()+", ");
        System.out.print(auto1.getRuedas().getMarca()+", ");
        System.out.println(auto1.getRuedas().getMedida());
        auto1.setMotorcito(new Motor ("Ford",true,"V6"));
        System.out.print("Las caracteristicas del motor son:"+auto1.getMotorcito().getMarca()+", ");
        System.out.print(auto1.getMotorcito().getCombustionInterna()+", ");
        System.out.println(auto1.getMotorcito().getModelo());
        auto1.setEsqueleto(new Chasis ("Ford","Adaptable",1736f));
        System.out.print("Las caracteristicas del chasis son:"+auto1.getEsqueleto().getMarca()+", ");
        System.out.print(auto1.getEsqueleto().getResilencia()+", ");
        System.out.println(auto1.getEsqueleto().getPesoCapacidad());
        auto1.EncenderAuto();
        auto1.Acelerar();
        auto1.Apagar();
        auto1.getRuedas().Inflar();
        auto1.getRuedas().Calentarse();
        auto1.getMotorcito().Encender();
        auto1.getMotorcito().Calentarse();
        auto1.getEsqueleto().EvitarDeformación();
        auto1.getEsqueleto().AbsorberImpacto();
    }
    
}
