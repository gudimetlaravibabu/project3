package com.bepoc.BestEstimate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
//@Table(name="account_summary")
public class AccountSummary implements Serializable {

    @Id
    private String accountName;
    private String dm;
    private String da;
    private double dhBE;
    private double pmBE;
    private double rtb;
    private String remarks;

    @Column(columnDefinition = "double default 0.0")
    private double currmnthdhbe;

    @Column(columnDefinition = "double default 0.0")
    private double currmnthbe;

    @Column(columnDefinition = "double default 0.0")
    private double currmnthrtbr;

    @Column(columnDefinition = "double default 0.0")
    private double m1be;

    @Column(columnDefinition = "double default 0.0")
    private double m2be;

    @Column(columnDefinition = "double default 0.0")
    private double m3be;

    @Column(columnDefinition = "double default 0.0")
    private double m1rtbr;

    @Column(columnDefinition = "double default 0.0")
    private double m2rtbr;

    @Column(columnDefinition = "double default 0.0")
    private double m3rtbr;

    public AccountSummary() {
    }

    public AccountSummary(String accountName, String dm, String da, double dhBE, double pmBE, double rtb, String remarks, double currmnthdhbe, double currmnthbe, double currmnthrtbr, double m1be, double m2be, double m3be, double m1rtbr, double m2rtbr, double m3rtbr) {
        this.accountName = accountName;
        this.dm = dm;
        this.da = da;
        this.dhBE = dhBE;
        this.pmBE = pmBE;
        this.rtb = rtb;
        this.remarks = remarks;
        this.currmnthdhbe = currmnthdhbe;
        this.currmnthbe = currmnthbe;
        this.currmnthrtbr = currmnthrtbr;
        this.m1be = m1be;
        this.m2be = m2be;
        this.m3be = m3be;
        this.m1rtbr = m1rtbr;
        this.m2rtbr = m2rtbr;
        this.m3rtbr = m3rtbr;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
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

    public double getDhBE() {
        return dhBE;
    }

    public void setDhBE(double dhBE) {
        this.dhBE = dhBE;
    }

    public double getPmBE() {
        return pmBE;
    }

    public void setPmBE(double pmBE) {
        this.pmBE = pmBE;
    }

    public double getRtb() {
        return rtb;
    }

    public void setRtb(double rtb) {
        this.rtb = rtb;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public double getCurrmnthdhbe() {
        return currmnthdhbe;
    }

    public void setCurrmnthdhbe(double currmnthdhbe) {
        this.currmnthdhbe = currmnthdhbe;
    }

    public double getCurrmnthbe() {
        return currmnthbe;
    }

    public void setCurrmnthbe(double currmnthbe) {
        this.currmnthbe = currmnthbe;
    }

    public double getCurrmnthrtbr() {
        return currmnthrtbr;
    }

    public void setCurrmnthrtbr(double currmnthrtbr) {
        this.currmnthrtbr = currmnthrtbr;
    }

    public double getM1be() {
        return m1be;
    }

    public void setM1be(double m1be) {
        this.m1be = m1be;
    }

    public double getM2be() {
        return m2be;
    }

    public void setM2be(double m2be) {
        this.m2be = m2be;
    }

    public double getM3be() {
        return m3be;
    }

    public void setM3be(double m3be) {
        this.m3be = m3be;
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
