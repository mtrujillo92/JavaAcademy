package com.globant.functional.v2_superfunciones_clases.clases;

import com.globant.functional.v2_superfunciones_clases.interfaces.Predicado;

public class SoloPares implements Predicado {
    @Override
    public boolean test(Integer valor) {
        return valor % 2 ==0;
    }
}
