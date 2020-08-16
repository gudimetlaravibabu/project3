package com.bepoc.BestEstimate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping({ "/be"})
public class BEController {

    @Autowired
    private BEService beservice;

    @GetMapping(produces = "application/json")
    @RequestMapping({ "/validateLogin" })
    public UserStatus validateLogin() {
        return new UserStatus("User successfully authenticated");
    }


    @RequestMapping("/data/pu/{dm}")
    public List<AccountBE> getBESummary(@PathVariable String dm) throws IOException {
       return beservice.getBESummary(dm);

    }

    @RequestMapping("/data/pu/betotal/{dm}")
    public List<Number> getTotalBESummary(@PathVariable String dm) throws IOException {
        return beservice.getTotalBESummary(dm);

    }

    @RequestMapping("/data/pu/total/{dm}")
    public List<Number> getTotalSummary(@PathVariable String dm) throws IOException {
        return beservice.getTotalSummary(dm);

    }




    @RequestMapping("/data/pm/total/{pm}")
    public List<Number> getTotalSummaryByPm(@PathVariable String pm) throws IOException {
        return beservice.getTotalSummaryByPm(pm);

    }

    @RequestMapping("/data/da/total/{dm}/{da}")
    public List<Number> getTotalSummaryByDa(@PathVariable String dm, @PathVariable String da) throws IOException {
        return beservice.getTotalSummaryByDa(dm, da);

    }

   // @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/data/pu")
    public void postSummary(@RequestBody List<AccountBE> accountBE)  {
        beservice.postSummary(accountBE);

    }

    @PutMapping("/data/pu/{id}")
    public void putSummary(@PathVariable int id, @RequestBody AccountBE accountBE)  {
        beservice.putSummary(accountBE,id);

    }

    @RequestMapping("/data/account/{account}")
    public List<AccountBE> getSummaryByAccount(@PathVariable String account)  {
        return beservice.getSummaryByAccount(account);

    }

    @RequestMapping("/data/pm/{pm}")
    public List<AccountBE> getSummaryByPM(@PathVariable String pm)  {
        return beservice.getSummaryBypM(pm);

    }

    @RequestMapping("/data/{dm}/{da}")
    public List<AccountBE> getSummaryByDa(@PathVariable String dm, @PathVariable String da)  {
        return beservice.getSummaryByDa(dm, da);

    }

 /*   @RequestMapping("/all")
    public List<Object> getTotalsSummary()  {

        return beservice.getTotalsSummary();
    }

    /*@RequestMapping("/all/pmbe")
    public List<String> getSummaryPmbe() throws IOException {
        return beservice.getSummaryPmbe();

    }*/


   @RequestMapping("/allaccounts/{dm}")
    public List<AccountSummary> allAccounts(@PathVariable String dm) {
        return beservice.allAccounts(dm);

    }




   /* @RequestMapping("/test/{p}")
    public AccountSummary queryAcntBEDB(@PathVariable String p) {
        return beservice.queryAcntBEDB(p);
    }*/




    @RequestMapping("/dhrtbr")
    public List<DHRTBR> getDHRTBR() throws IOException {
        return beservice.getDHRTBR();

    }

   /* @RequestMapping("/test/{p}/{q}")
    public AccountBE test(@PathVariable String p, @PathVariable String q) throws IOException {
        return beservice.test(p,q);

    } */


    @RequestMapping("/currconv/{month}")
    public List<AccountBE> updateCurrConv(@PathVariable String month)  {
        return beservice.updateCurrConv(month);

    }


    @RequestMapping("/actuals/{month}")
    public List<AccountBE> updateActuals(@PathVariable String month)  {
        return beservice.updateActuals(month);

    }





}
