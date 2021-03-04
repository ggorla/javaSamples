package com.example.samplecode.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Converter {

    @Autowired
    private Configuration configuration;

    @GetMapping("/converter/usd/to/{currency}/ammount/{value}")
    public int currencyConverter(@PathVariable String currency, @PathVariable int value){
        int ammount = 0;

        if(currency.equals("INR")){
            return value*configuration.getInr();
        }
        else if(currency.equals("EU")){
            return value*configuration.getEu();
        }
        else if(currency.equals("CAD")){
            return value*configuration.getCad();
        }

        return ammount;
    }

}
