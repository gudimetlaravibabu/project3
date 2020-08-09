import { Component } from '@angular/core';
import { AuthenticationService } from './authentication.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
 
 routes =[
  // {label:"Logout", url:"logout"},
  {label:"AllBE", url:"allaccounts"},
  {label:"AllBEPU", url:"allaccountspu"},
   //{label:"All Ravi", url:"allaccountsravi"},
   //{label:"All Ravi PU", url:"allaccountsravipu"},
   //{label:"Sarada", url:"Sarada"},
   //{label:"Tanzeem", url:"Tanzeem"},
   //{label:"Deepa", url:"Deepa"},
   //{label:"Purnima", url:"Purnima"},
   {label:"AllPhcVol", url:"allphcvol"},
   {label:"AllPhcVolPU", url:"allphcvolpu"},
   {label:"AllPhcVolPURemarks", url:"allphcvolpuremarks"},
   {label:"AllPhcVolTotal", url:"allphcvoltotal"},
   {label:"PHCFuture", url:"phcfuture"},
   //{label:"Load MasterData", url:"loadmasterdata"},
   //{label:"Add Account", url:"addAcnt"},
   {label:"NxtMnth PhcVol Trgt", url:"nxtmnthpvtarget"},
   {label:"BottomsUpBE", url:"nbrnp"},
   {label:"logout", url:"logout"}
   
 ]

 routesAdmin =[
  // {label:"Logout", url:"logout"},
  {label:"AllBE", url:"allaccounts"},
  {label:"AllBEPU", url:"allaccountspu"},
   //{label:"All Ravi", url:"allaccountsravi"},
   //{label:"All Ravi PU", url:"allaccountsravipu"},
   //{label:"Sarada", url:"Sarada"},
   //{label:"Tanzeem", url:"Tanzeem"},
   //{label:"Deepa", url:"Deepa"},
   //{label:"Purnima", url:"Purnima"},
   {label:"AllPhcVol", url:"allphcvol"},
   {label:"AllPhcVolPU", url:"allphcvolpu"},
   {label:"AllPhcVolPURemarks", url:"allphcvolpuremarks"},
   {label:"AllPhcVolTotal", url:"allphcvoltotal"},
   {label:"PHCFuture", url:"phcfuture"},
   {label:"Load MasterData", url:"loadmasterdata"},
   {label:"Add Account", url:"addAcnt"},
   {label:"NxtMnth PhcVol Trgt", url:"nxtmnthpvtarget"},
   {label:"BottomsUpBE", url:"nbrnp"},
   {label:"logout", url:"logout"}
   
 ]
 
 constructor(private loginService:AuthenticationService) {

 }
 
 ngOnInit(){

 }
}
