package com.globant.topic2.service;

import com.globant.topic2.beans.Printer;

public class PrinterService {
    private Printer impresora;

    public PrinterService(Printer impresora) {
        this.impresora = impresora;
    }
    public void imprimir(String texto){
        impresora.print(texto);
    }
}
