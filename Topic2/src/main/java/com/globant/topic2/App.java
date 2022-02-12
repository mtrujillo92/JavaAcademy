package com.globant.topic2;

import com.globant.topic2.beans.Printer;
import com.globant.topic2.config.AppConfig;
import com.globant.topic2.service.PrinterService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
        Printer impresora = null;
        String seleccion = "bnasd";
        if(seleccion.equals("bn")){
            impresora = (Printer) app.getBean("getImpresoraBN");
        }else {
            impresora = (Printer) app.getBean("getImpresoraColor");
        }

        PrinterService servicio = new PrinterService(impresora);

        servicio.imprimir("Imprimiendo esto");
    }
}
