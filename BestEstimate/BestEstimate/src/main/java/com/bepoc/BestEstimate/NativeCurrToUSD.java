package com.bepoc.BestEstimate;

import javax.persistence.*;

@Entity
public class NativeCurrToUSD {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String nativecurr;

    @Column(columnDefinition = "double default 0.0")
    private double m1usdcurr;

    @Column(columnDefinition = "double default 0.0")
    private double m2usdcurr;

    @Column(columnDefinition = "double default 0.0")
    private double m3usdcurr;

    public NativeCurrToUSD()
    {

    }

    public NativeCurrToUSD(String nativecurr, double m1usdcurr, double m2usdcurr, double m3usdcurr) {
        this.nativecurr = nativecurr;
        this.m1usdcurr = m1usdcurr;
        this.m2usdcurr = m2usdcurr;
        this.m3usdcurr = m3usdcurr;
    }

    public String getNativecurr() {
        return nativecurr;
    }

    public void setNativecurr(String nativecurr) {
        this.nativecurr = nativecurr;
    }

    public double getM1usdcurr() {
        return m1usdcurr;
    }

    public void setM1usdcurr(double m1usdcurr) {
        this.m1usdcurr = m1usdcurr;
    }

    public double getM2usdcurr() {
        return m2usdcurr;
    }

    public void setM2usdcurr(double m2usdcurr) {
        this.m2usdcurr = m2usdcurr;
    }

    public double getM3usdcurr() {
        return m3usdcurr;
    }

    public void setM3usdcurr(double m3usdcurr) {
        this.m3usdcurr = m3usdcurr;
    }
}
