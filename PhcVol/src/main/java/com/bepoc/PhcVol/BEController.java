package com.bepoc.PhcVol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping({ "/phcvol"})
public class BEController {

    @Autowired
    private BEService beservice;

    @GetMapping(produces = "application/json")
    @RequestMapping({ "/validateLogin" })
    public UserStatus validateLogin() {
        return new UserStatus("User successfully authenticated");
    }


    @RequestMapping("/allaccountsphcvol/{dm}")
    public List<PhcVolSummary> allAccountsPhcVolSummary(@PathVariable String dm)  {
        return beservice.allAccountsPhcVolSummary(dm);

    }

    @RequestMapping("/phcvoltarget")
    public List<PhcVol> getPhcVolTarget() throws IOException {
        return beservice.getPhcVolTarget();

    }

    @RequestMapping("/volaod")
    public List<PhcVol> getPhcVolAoD() throws IOException {
        return beservice.getPhcVolAoD();

    }


    @RequestMapping("/phc")
    public List<PHC> getPHC() throws IOException {
        return beservice.getPHC();

    }





    @RequestMapping("/prodfut")
    public List<PHC> findProdFut() {
        return beservice.findProdFut();

    }

    @RequestMapping("/nonprodfut")
    public List<PHC> findNonProdFut() {
        return beservice.findNonProdFut();

    }



    @RequestMapping("/phcvol/{dm}")
    public List<PhcVol> getPhcVol(@PathVariable String dm) throws IOException {
        return beservice.getPhcVol(dm);

    }

    @RequestMapping("/phcvol/{dm}/{da}")
    public List<PhcVol> getPhcVol(@PathVariable String dm,@PathVariable String da) throws IOException {
        return beservice.getPhcVol(dm,da);

    }

    @RequestMapping("/phcvolremarks/{dm}")
    public List<PhcVol> getPhcVolRemarks(@PathVariable String dm) throws IOException {
        return beservice.getPhcVolRemarks(dm);

    }

    @RequestMapping("/phcvoltotals")
    public List<PhcVolTotal> getPhcVolTotals() {
        return beservice.getPhcVolTotals();
    }


    @RequestMapping("/phcvol/total/{dm}")
    public List<Double> getTotalPhcVolSummary(@PathVariable String dm) throws IOException {
        return beservice.getTotalPhcVolSummary(dm);

    }

    @RequestMapping("/phcvol/total/{dm}/{da}")
    public List<Double> getTotalPhcVolSummary(@PathVariable String dm, @PathVariable String da) throws IOException {
        return beservice.getTotalPhcVolSummary(dm, da);

    }

    @PostMapping("/addaccount")
    public void addPhcVolAccount(@RequestBody PhcVol phcVol)  {
        beservice.addPhcVolAccount(phcVol);

    }

    @PutMapping("/phcvoltarget/{id}")
    public void putPhcVolTarget(@PathVariable int id, @RequestBody PhcVol phcVol)  {
        beservice.putPhcVolTarget(phcVol,id);

    }

    @RequestMapping("/phcvolsummary/total/{dm}")
    public List<Double> getTotalPhcVolAccountSummary(@PathVariable String dm) throws IOException {
        return beservice.getTotalPhcVolAccountSummary(dm);

    }

    @RequestMapping("/phcvolremarks/total/{dm}")
    public List<Double> getTotalPhcVolRemarks(@PathVariable String dm) throws IOException {
        return beservice.getTotalPhcVolRemarks(dm);

    }



}
