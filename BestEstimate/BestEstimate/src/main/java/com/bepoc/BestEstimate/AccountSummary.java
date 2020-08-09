package com.bepoc.BestEstimate;

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

    public AccountSummary() {
    }

    public AccountSummary(String accountName, String dm, String da, double dhBE, double pmBE, double rtb, String remarks) {
        this.accountName = accountName;
        this.dm = dm;
        this.da = da;
        this.dhBE = dhBE;
        this.pmBE = pmBE;
        this.rtb = rtb;
        this.remarks = remarks;
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
}
