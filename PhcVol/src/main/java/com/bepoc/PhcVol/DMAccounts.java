package com.bepoc.PhcVol;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties("dm")
public class DMAccounts {
    private List<String> np;
    private List<String> amit;
    private List<String> harish;
    private List<String> bindu;

    public List<String> getNp() {
        return np;
    }

    public void setNp(List<String> np) {
        this.np = np;
    }

    public List<String> getAmit() {
        return amit;
    }

    public void setAmit(List<String> amit) {
        this.amit = amit;
    }

    public List<String> getHarish() {
        return harish;
    }

    public void setHarish(List<String> harish) {
        this.harish = harish;
    }

    public List<String> getBindu() {
        return bindu;
    }

    public void setBindu(List<String> bindu) {
        this.bindu = bindu;
    }
}
