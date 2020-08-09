package com.bepoc.PhcVol;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PhcVolTotal {

    @Id
    private String dm;
    private double phcTarget;
    private double volTarget;
    private double phcAOD;
    private double volAOD;
    private double phcAOL;
    private double phcGap;
    private double volGap;
    private String remarks;

    public PhcVolTotal(){

    }

    public PhcVolTotal(String dm, double phcTarget, double volTarget, double phcAOD, double volAOD, double phcAOL, double phcGap, double volGap, String remarks) {
        this.dm = dm;
        this.phcTarget = phcTarget;
        this.volTarget = volTarget;
        this.phcAOD = phcAOD;
        this.volAOD = volAOD;
        this.phcAOL = phcAOL;
        this.phcGap = phcGap;
        this.volGap = volGap;
        this.remarks = remarks;
    }

    public String getDm() {
        return dm;
    }

    public void setDm(String dm) {
        this.dm = dm;
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

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public double getPhcGap() {
        return phcGap;
    }

    public void setPhcGap(double phcGap) {
        this.phcGap = phcGap;
    }

    public double getVolGap() {
        return volGap;
    }

    public void setVolGap(double volGap) {
        this.volGap = volGap;
    }
}
