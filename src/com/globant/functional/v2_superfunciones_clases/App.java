package com.globant.functional.v2_superfunciones_clases;

import com.globant.functional.v2_superfunciones_clases.clases.SoloImpares;
import com.globant.functional.v2_superfunciones_clases.clases.SoloPares;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        new App();
    }

    public App(){
        List<Integer> numeros = crearLista();
        System.out.println(numeros);
        List<Integer> filtrados = Superfunciones.filtrar(numeros, new SoloImpares());
        System.out.println(filtrados);
        List<Integer> cuadrados = elevarAlCuadrado(filtrados);
        System.out.println(cuadrados);
        List<Integer>mostrados = mostrarLista(cuadrados);
        int total = sumarLista(mostrados);
        System.out.println("Suma de cuadrados: " + total);
    }



    private List<Integer> crearLista(){
        return List.of(0,1,2,3,5,8,13,21,34,55,89,144);
    }
    private List<Integer> filtrarPares(List<Integer> numeros){
        List<Integer> resultado = new ArrayList<>();
        for (Integer numero: numeros) {
            if (numero % 2 == 0){
                resultado.add(numero);
            }
        }
        return resultado;
    }
    private List<Integer> elevarAlCuadrado(List<Integer> pares) {
        List<Integer> resultado = new ArrayList<>();
        for (Integer numero: pares) {
            resultado.add(numero * numero);
        }
        return resultado;
    }
    private List<Integer> mostrarLista(List<Integer> cuadrados) {
        List<Integer> resultado = new ArrayList<>();
        for (Integer numero: cuadrados) {
            System.out.println(numero);
        }
        return cuadrados;
    }
    private int sumarLista(List<Integer> mostrados) {
        int total = 0;
        for (Integer numero: mostrados) {
            total += numero;
        }
        return total;
    }
}
