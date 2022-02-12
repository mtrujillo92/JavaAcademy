package com.globant.topic2.config;

import com.globant.topic2.beans.Printer;
import com.globant.topic2.beans.BlackWhitePrinter;
import com.globant.topic2.beans.ColorPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Printer getImpresoraBN(){
        return new BlackWhitePrinter();
    }

    @Bean
    public Printer getImpresoraColor(){
        return new ColorPrinter();
    }

}
