package com.globant.functional.v2_superfunciones_clases;

import com.globant.functional.v2_superfunciones_clases.clases.*;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        new App();
    }

    public App(){
        List<Integer> numeros = Superfunciones.proveer(10, new Aleatorio());
        System.out.println(numeros);
        List<Integer> filtrados = Superfunciones.filtrar(numeros, new SoloPares());
        System.out.println(filtrados);
        List<Integer> transformados = Superfunciones.transformar(filtrados, new AlCubo());
        System.out.println(transformados);
        List<Integer> actuados = Superfunciones.actuar(transformados, new Impresor());
        Superfunciones.consumir(transformados, new Impresor());
        int total = Superfunciones.reducir(actuados, 1,new Multiplicador());
        System.out.println("Reducción: " + total);
    }

}
