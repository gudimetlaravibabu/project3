package com.bepoc.BestEstimate;

import javax.persistence.*;

@Entity
public class AccountBE {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String da;
    private String dm;
    private String pm;
    private String accountName;
    private String accountTrack;
    private double dhBE;

    @Column(columnDefinition = "double default 0.0")
    private double pmBE;

    private double rtb;
    private String remarks;
    private String summary;

    @Column(columnDefinition = "boolean default false")
    private boolean showSummary;

    @Column(columnDefinition = "boolean default false")
    private boolean showTextbox;

    @Column(columnDefinition = "boolean default false")
    private boolean showUpdatebutton;

    private String nativecurrency;

    @Column(columnDefinition = "double default 0.0")
    private double nativediscount;

    @Column(columnDefinition = "double default 0.0")
    private double m1usdconversion;

    @Column(columnDefinition = "double default 0.0")
    private double m2usdconversion;

    @Column(columnDefinition = "double default 0.0")
    private double m3usdconversion;

    @Column(columnDefinition = "double default 0.0")
    private double m1native;

    @Column(columnDefinition = "double default 0.0")
    private double m2native;

    @Column(columnDefinition = "double default 0.0")
    private double m3native;

    @Column(columnDefinition = "double default 0.0")
    private double totalnative;

    @Column(columnDefinition = "double default 0.0")
    private double m1be;

    @Column(columnDefinition = "double default 0.0")
    private double m2be;

    @Column(columnDefinition = "double default 0.0")
    private double m3be;

    @Column(columnDefinition = "double default 0.0")
    private double totalbe;

    @Column(columnDefinition = "double default 0.0")
    private double m1rtbr;

    @Column(columnDefinition = "double default 0.0")
    private double m2rtbr;

    @Column(columnDefinition = "double default 0.0")
    private double m3rtbr;

    @Column(columnDefinition = "double default 0.0")
    private double totalrtbr;

    private String m1bertbrremarks;
    private String m2bertbrremarks;
    private String m3bertbrremarks;

    public AccountBE() {

    }

    public AccountBE(int id, String da, String dm, String pm, String accountName, String accountTrack, double dhBE, double pmBE, double rtb, String remarks, String summary, boolean showSummary, boolean showTextbox, boolean showUpdatebutton, String nativecurrency, double nativediscount, double m1usdconversion, double m2usdconversion, double m3usdconversion, double m1native, double m2native, double m3native, double totalnative, double m1be, double m2be, double m3be, double totalbe, double m1rtbr, double m2rtbr, double m3rtbr, double totalrtbr, String m1bertbrremarks, String m2bertbrremarks, String m3bertbrremarks) {
        this.id = id;
        this.da = da;
        this.dm = dm;
        this.pm = pm;
        this.accountName = accountName;
        this.accountTrack = accountTrack;
        this.dhBE = dhBE;
        this.pmBE = pmBE;
        this.rtb = rtb;
        this.remarks = remarks;
        this.summary = summary;
        this.showSummary = showSummary;
        this.showTextbox = showTextbox;
        this.showUpdatebutton = showUpdatebutton;
        this.nativecurrency = nativecurrency;
        this.nativediscount = nativediscount;
        this.m1usdconversion = m1usdconversion;
        this.m2usdconversion = m2usdconversion;
        this.m3usdconversion = m3usdconversion;
        this.m1native = m1native;
        this.m2native = m2native;
        this.m3native = m3native;
        this.totalnative = totalnative;
        this.m1be = m1be;
        this.m2be = m2be;
        this.m3be = m3be;
        this.totalbe = totalbe;
        this.m1rtbr = m1rtbr;
        this.m2rtbr = m2rtbr;
        this.m3rtbr = m3rtbr;
        this.totalrtbr = totalrtbr;
        this.m1bertbrremarks = m1bertbrremarks;
        this.m2bertbrremarks = m2bertbrremarks;
        this.m3bertbrremarks = m3bertbrremarks;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDa() {
        return da;
    }

    public void setDa(String da) {
        this.da = da;
    }

    public String getDm() {
        return dm;
    }

    public void setDm(String dm) {
        this.dm = dm;
    }

    public String getPm() {
        return pm;
    }

    public void setPm(String pm) {
        this.pm = pm;
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

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public boolean isShowSummary() {
        return showSummary;
    }

    public void setShowSummary(boolean showSummary) {
        this.showSummary = showSummary;
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

    public String getNativecurrency() {
        return nativecurrency;
    }

    public void setNativecurrency(String nativecurrency) {
        this.nativecurrency = nativecurrency;
    }

    public double getNativediscount() {
        return nativediscount;
    }

    public void setNativediscount(double nativediscount) {
        this.nativediscount = nativediscount;
    }

    public double getM1usdconversion() {
        return m1usdconversion;
    }

    public void setM1usdconversion(double m1usdconversion) {
        this.m1usdconversion = m1usdconversion;
    }

    public double getM2usdconversion() {
        return m2usdconversion;
    }

    public void setM2usdconversion(double m2usdconversion) {
        this.m2usdconversion = m2usdconversion;
    }

    public double getM3usdconversion() {
        return m3usdconversion;
    }

    public void setM3usdconversion(double m3usdconversion) {
        this.m3usdconversion = m3usdconversion;
    }

    public double getM1native() {
        return m1native;
    }

    public void setM1native(double m1native) {
        this.m1native = m1native;
    }

    public double getM2native() {
        return m2native;
    }

    public void setM2native(double m2native) {
        this.m2native = m2native;
    }

    public double getM3native() {
        return m3native;
    }

    public void setM3native(double m3native) {
        this.m3native = m3native;
    }

    public double getTotalnative() {
        return totalnative;
    }

    public void setTotalnative(double totalnative) {
        this.totalnative = totalnative;
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

    public double getTotalbe() {
        return totalbe;
    }

    public void setTotalbe(double totalbe) {
        this.totalbe = totalbe;
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

    public double getTotalrtbr() {
        return totalrtbr;
    }

    public void setTotalrtbr(double totalrtbr) {
        this.totalrtbr = totalrtbr;
    }

    public String getM1bertbrremarks() {
        return m1bertbrremarks;
    }

    public void setM1bertbrremarks(String m1bertbrremarks) {
        this.m1bertbrremarks = m1bertbrremarks;
    }

    public String getM2bertbrremarks() {
        return m2bertbrremarks;
    }

    public void setM2bertbrremarks(String m2bertbrremarks) {
        this.m2bertbrremarks = m2bertbrremarks;
    }

    public String getM3bertbrremarks() {
        return m3bertbrremarks;
    }

    public void setM3bertbrremarks(String m3bertbrremarks) {
        this.m3bertbrremarks = m3bertbrremarks;
    }
}



