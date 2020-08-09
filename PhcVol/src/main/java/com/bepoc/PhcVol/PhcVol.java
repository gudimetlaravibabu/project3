package com.bepoc.PhcVol;

import javax.persistence.*;

@Entity
public class PhcVol {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String accountName;
    private String accountTrack;
    private String accountDu;
    private String dm;
    private String da;
    private double phcTarget;
    private double volTarget;
    private double phcAOD;
    private double volAOD;
    private double phcAOL;
    private double volAOL;
    private String remarks;

    @Column(columnDefinition = "boolean default false")
    private boolean showTextbox;

    @Column(columnDefinition = "boolean default false")
    private boolean showUpdatebutton;

    @Column(columnDefinition = "double default 0.0")
    private double nxtMnthOffshoreVol;

    @Column(columnDefinition = "double default 0.0")
    private double nxtMnthOnsiteVol;

    @Column(columnDefinition = "double default 0.0")
    private double nxtMnthTotalVol;

    @Column(columnDefinition = "integer default 0")
    private int nxtMnthPHC;

    private String nxtMnthGapremarks;

    public PhcVol() {
    }

    public PhcVol(int id, String accountName, String accountTrack, String accountDu, String dm, String da, double phcTarget, double volTarget, double phcAOD, double volAOD, double phcAOL, double volAOL, String remarks, boolean showTextbox, boolean showUpdatebutton, double nxtMnthOffshoreVol, double nxtMnthOnsiteVol, double nxtMnthTotalVol, int nxtMnthPHC, String nxtMnthGapremarks) {
        this.id = id;
        this.accountName = accountName;
        this.accountTrack = accountTrack;
        this.accountDu = accountDu;
        this.dm = dm;
        this.da = da;
        this.phcTarget = phcTarget;
        this.volTarget = volTarget;
        this.phcAOD = phcAOD;
        this.volAOD = volAOD;
        this.phcAOL = phcAOL;
        this.volAOL = volAOL;
        this.remarks = remarks;
        this.showTextbox = showTextbox;
        this.showUpdatebutton = showUpdatebutton;
        this.nxtMnthOffshoreVol = nxtMnthOffshoreVol;
        this.nxtMnthOnsiteVol = nxtMnthOnsiteVol;
        this.nxtMnthTotalVol = nxtMnthTotalVol;
        this.nxtMnthPHC = nxtMnthPHC;
        this.nxtMnthGapremarks = nxtMnthGapremarks;
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

    public boolean isShowTextbox() {
        return showTextbox;
    }

    public void setShowTextbox(boolean showTextbox) {
        this.showTextbox = showTextbox;
    }

    public boolean isShowUpdatebutton() {
        return showUpdatebutton;
    }

    public void setShowUpdatebutton(boolean showUpdatebutton) {
        this.showUpdatebutton = showUpdatebutton;
    }

    public double getNxtMnthOffshoreVol() {
        return nxtMnthOffshoreVol;
    }

    public void setNxtMnthOffshoreVol(double nxtMnthOffshoreVol) {
        this.nxtMnthOffshoreVol = nxtMnthOffshoreVol;
    }

    public double getNxtMnthOnsiteVol() {
        return nxtMnthOnsiteVol;
    }

    public void setNxtMnthOnsiteVol(double nxtMnthOnsiteVol) {
        this.nxtMnthOnsiteVol = nxtMnthOnsiteVol;
    }

    public double getNxtMnthTotalVol() {
        return nxtMnthTotalVol;
    }

    public void setNxtMnthTotalVol(double nxtMnthTotalVol) {
        this.nxtMnthTotalVol = nxtMnthTotalVol;
    }

    public int getNxtMnthPHC() {
        return nxtMnthPHC;
    }

    public void setNxtMnthPHC(int nxtMnthPHC) {
        this.nxtMnthPHC = nxtMnthPHC;
    }

    public String getNxtMnthGapremarks() {
        return nxtMnthGapremarks;
    }

    public void setNxtMnthGapremarks(String nxtMnthGapremarks) {
        this.nxtMnthGapremarks = nxtMnthGapremarks;
    }
}
