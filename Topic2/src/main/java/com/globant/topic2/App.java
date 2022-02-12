package com.globant.topic2;

import com.globant.topic2.beans.Printer;
import com.globant.topic2.config.AppConfig;
import com.globant.topic2.service.PrinterService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
        byte selection;
        String document="";
        Scanner in = new Scanner(System.in);

        Printer printer1 = null;
        System.out.println();

        System.out.println("Write the name of the document to print: ");
        document = in.next();
        System.out.println("Write the printer that you want to use\n\tFor black and white select 1\n\tFor black and white and full color select 2: ");
        selection = in.nextByte();
        switch (selection){
            case 1:
                printer1 = (Printer) app.getBean("getBlackWhitePrinter");
                break;
            case 2:
                int inkSelection;
                System.out.print("for print in color select 1, for print in black and white select 2: ");
                inkSelection = in.nextInt();
                if(inkSelection == 1){
                    printer1 = (Printer) app.getBean("getColorPrinter");

                } else if (inkSelection == 2){
                    printer1 = (Printer) app.getBean("getBlackWhitePrinter");
                }
                break;

        }
        PrinterService service = new PrinterService(printer1);

        service.print(document);
    }
}
