package com.bepoc.BestEstimate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DHRTBR {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String accountName;
    private String accountTrack;
    private String accountDu;
    private String dm;
    private String da;
    private double dHBE;
    private double rTBR;
    private double m1rtbr;
    private double m2rtbr;
    private double m3rtbr;

    public DHRTBR()
    {

    }

    public DHRTBR(int id, String accountName, String accountTrack, String accountDu, String dm, String da, double dHBE, double rTBR, double m1rtbr, double m2rtbr, double m3rtbr) {
        this.id = id;
        this.accountName = accountName;
        this.accountTrack = accountTrack;
        this.accountDu = accountDu;
        this.dm = dm;
        this.da = da;
        this.dHBE = dHBE;
        this.rTBR = rTBR;
        this.m1rtbr = m1rtbr;
        this.m2rtbr = m2rtbr;
        this.m3rtbr = m3rtbr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountTrack() {
        return accountTrack;
    }

    public void setAccountTrack(String accountTrack) {
        this.accountTrack = accountTrack;
    }

    public String getAccountDu() {
        return accountDu;
    }

    public void setAccountDu(String accountDu) {
        this.accountDu = accountDu;
    }

    public String getDm() {
        return dm;
    }

    public void setDm(String dm) {
        this.dm = dm;
    }

    public String getDa() {
        return da;
    }

    public void setDa(String da) {
        this.da = da;
    }

    public double getdHBE() {
        return dHBE;
    }

    public void setdHBE(double dHBE) {
        this.dHBE = dHBE;
    }

    public double getrTBR() {
        return rTBR;
    }

    public void setrTBR(double rTBR) {
        this.rTBR = rTBR;
    }

    public double getM1rtbr() {
        return m1rtbr;
    }

    public void setM1rtbr(double m1rtbr) {
        this.m1rtbr = m1rtbr;
    }

    public double getM2rtbr() {
        return m2rtbr;
    }

    public void setM2rtbr(double m2rtbr) {
        this.m2rtbr = m2rtbr;
    }

    public double getM3rtbr() {
        return m3rtbr;
    }

    public void setM3rtbr(double m3rtbr) {
        this.m3rtbr = m3rtbr;
    }
}
