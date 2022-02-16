package com.globant.functional.v4_superfunciones_genericas;

import com.globant.functional.v4_superfunciones_genericas.interfaces.*;

import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        new App();
    }

    public App(){
        List<Integer> numeros = Superfunciones.proveer(10, new Proveedor<>() {

            Random random = new Random();
            @Override
            public Integer obtener() {
                return random.nextInt(10);
            }
        });
        System.out.println(numeros);

        List<Integer> filtrados = Superfunciones.filtrar(numeros, new Predicado<>() {
            @Override
            public boolean test(Integer valor) {
                return valor % 2 == 0;
            }
        });
        System.out.println(filtrados);

        List<Integer> transformados = Superfunciones.transformar(filtrados, new OperadorUnario<>() {
            @Override
            public Integer aplicar(Integer valor) {
                return valor * valor;
            }
        });
        System.out.println(transformados);

        //obtener cada numero convertido en cadena
        List<String> convertidosEnCadena = Superfunciones.transformar(filtrados, new Funcion<Integer, String>() {
            @Override
            public String aplicar(Integer valor) {
                return "Valor: " + valor;
            }
        });
        System.out.println(convertidosEnCadena);

        Consumidor<Integer> impresor = new Consumidor<>() {
            @Override
            public void aceptar(Integer valor) {
                System.out.println(valor);
            }
        };

        List<Integer> actuados = Superfunciones.actuar(transformados, impresor);

        Superfunciones.consumir(transformados, impresor);

        Integer total = Superfunciones.reducir(actuados, 0, new OperadorBinario<>() {
            @Override
            public Integer aplicar(Integer valor1, Integer valor2) {
                return valor1 + valor2;
            }
        });
        System.out.println("Reducción: " + total);
    }

}
