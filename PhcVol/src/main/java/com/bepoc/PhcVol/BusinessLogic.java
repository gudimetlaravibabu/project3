package com.bepoc.PhcVol;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("bl")
public class BusinessLogic {
    private String soa;
    private String api;
    private String pvfile;
    private String phcfile;
    private String pvtfile;

    public String getPvtfile() {
        return pvtfile;
    }

    public void setPvtfile(String pvtfile) {
        this.pvtfile = pvtfile;
    }

    public String getSoa() {
        return soa;
    }

    public void setSoa(String soa) {
        this.soa = soa;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getPvfile() {
        return pvfile;
    }

    public void setPvfile(String pvfile) {
        this.pvfile = pvfile;
    }

    public String getPhcfile() {
        return phcfile;
    }

    public void setPhcfile(String phcfile) {
        this.phcfile = phcfile;
    }
}
