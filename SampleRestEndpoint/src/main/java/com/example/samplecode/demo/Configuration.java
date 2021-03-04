package com.example.samplecode.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("currency")
public class Configuration {
    private int inr;
    private int eu;
    private int cad;

    public int getInr() {
        return inr;
    }

    public void setInr(int inr) {
        this.inr = inr;
    }

    public int getEu() {
        return eu;
    }

    public void setEu(int eu) {
        this.eu = eu;
    }

    public int getCad() {
        return cad;
    }

    public void setCad(int cad) {
        this.cad = cad;
    }
}
