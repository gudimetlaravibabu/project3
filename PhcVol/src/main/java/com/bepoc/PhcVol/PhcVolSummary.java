package com.bepoc.PhcVol;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PhcVolSummary {

    @Id
    private String accountName;
    private String dm;
    private String da;
    private double phcTarget;
    private double volTarget;
    private double phcAOD;
    private double volAOD;
    private double phcAOL;
    private double volAOL;
    private String remarks;


    public PhcVolSummary() {
    }

    public PhcVolSummary(String accountName, String dm, String da, double phcTarget, double volTarget, double phcAOD, double volAOD, double phcAOL, double volAOL, String remarks) {
        this.accountName = accountName;
        this.dm = dm;
        this.da = da;
        this.phcTarget = phcTarget;
        this.volTarget = volTarget;
        this.phcAOD = phcAOD;
        this.volAOD = volAOD;
        this.phcAOL = phcAOL;
        this.volAOL = volAOL;
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

    public double getPhcTarget() {
        return phcTarget;
    }

    public void setPhcTarget(double phcTarget) {
        this.phcTarget = phcTarget;
    }

    public double getVolTarget() {
        return volTarget;
    }

    public void setVolTarget(double volTarget) {
        this.volTarget = volTarget;
    }

    public double getPhcAOD() {
        return phcAOD;
    }

    public void setPhcAOD(double phcAOD) {
        this.phcAOD = phcAOD;
    }

    public double getVolAOD() {
        return volAOD;
    }

    public void setVolAOD(double volAOD) {
        this.volAOD = volAOD;
    }

    public double getPhcAOL() {
        return phcAOL;
    }

    public void setPhcAOL(double phcAOL) {
        this.phcAOL = phcAOL;
    }

    public double getVolAOL() {
        return volAOL;
    }

    public void setVolAOL(double volAOL) {
        this.volAOL = volAOL;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }


}
