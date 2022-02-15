package com.globant.functional.v3_superfunciones_inline_clases;

import com.globant.functional.v2_superfunciones_clases.clases.*;
import com.globant.functional.v3_superfunciones_inline_clases.interfaces.*;

import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        new App();
    }

    public App(){
        List<Integer> numeros = Superfunciones.proveer(10, new Proveedor() {

            Random random = new Random();
            @Override
            public Integer obtener() {
                return random.nextInt(10);
            }
        });
        System.out.println(numeros);

        List<Integer> filtrados = Superfunciones.filtrar(numeros, new Predicado() {
            @Override
            public boolean test(Integer valor) {
                return valor % 2 == 0;
            }
        });
        System.out.println(filtrados);

        List<Integer> transformados = Superfunciones.transformar(filtrados, new Funcion() {
            @Override
            public Integer aplicar(Integer valor) {
                return valor * valor;
            }
        });
        System.out.println(transformados);

        Consumidor impresor = new Consumidor() {
            @Override
            public void aceptar(Integer valor) {
                System.out.println(valor);
            }
        };

        List<Integer> actuados = Superfunciones.actuar(transformados, impresor);

        Superfunciones.consumir(transformados, impresor);

        int total = Superfunciones.reducir(actuados, 1, new FuncionBinaria() {
            @Override
            public Integer aplicar(Integer valor1, Integer valor2) {
                return valor1 + valor2;
            }
        });
        System.out.println("Reducción: " + total);
    }

}
