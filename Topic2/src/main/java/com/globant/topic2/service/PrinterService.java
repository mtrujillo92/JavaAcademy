package com.globant.topic2.service;

import com.globant.topic2.beans.Printer;

public class PrinterService {
    private Printer printer;

    public PrinterService(Printer printer) {
        this.printer = printer;
    }
    public void print(String document){
        printer.print(document);
    }
}
