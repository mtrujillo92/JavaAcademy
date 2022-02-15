package com.globant.functional.v2_superfunciones_clases.clases;

import com.globant.functional.v2_superfunciones_clases.interfaces.Funcion;

public class AlCuadraro implements Funcion {
    @Override
    public Integer aplicar(Integer valor) {
        return valor*valor;
    }
}
