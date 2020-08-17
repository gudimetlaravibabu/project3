package com.bepoc.PhcVol;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class PHC {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String accountName;
    private String accountTrack;
   // private String accountDu;
    private String dm;
    private String empName;
    private Date allocEndDate;
    private Date nextAllocDate;
    private String projType;
    private String lastMCC;
    private String accountMCC;
    private String futExits;

    public PHC() {
    }

    public PHC(int id, String accountName, String accountTrack, String dm, String empName, Date allocEndDate, Date nextAllocDate, String projType, String lastMCC, String accountMCC, String futExits) {
        this.id = id;
        this.accountName = accountName;
        this.accountTrack = accountTrack;
        this.dm = dm;
        this.empName = empName;
        this.allocEndDate = allocEndDate;
        this.nextAllocDate = nextAllocDate;
        this.projType = projType;
        this.lastMCC = lastMCC;
        this.accountMCC = accountMCC;
        this.futExits = futExits;
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

    public String getDm() {
        return dm;
    }

    public void setDm(String dm) {
        this.dm = dm;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Date getAllocEndDate() {
        return allocEndDate;
    }

    public void setAllocEndDate(Date allocEndDate) {
        this.allocEndDate = allocEndDate;
    }

    public Date getNextAllocDate() {
        return nextAllocDate;
    }

    public void setNextAllocDate(Date nextAllocDate) {
        this.nextAllocDate = nextAllocDate;
    }

    public String getProjType() {
        return projType;
    }

    public void setProjType(String projType) {
        this.projType = projType;
    }

    public String getLastMCC() {
        return lastMCC;
    }

    public void setLastMCC(String lastMCC) {
        this.lastMCC = lastMCC;
    }

    public String getAccountMCC() {
        return accountMCC;
    }

    public void setAccountMCC(String accountMCC) {
        this.accountMCC = accountMCC;
    }

    public String getFutExits() {
        return futExits;
    }

    public void setFutExits(String futExits) {
        this.futExits = futExits;
    }
}
