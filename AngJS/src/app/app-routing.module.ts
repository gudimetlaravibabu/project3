import { NgModule } from '@angular/core';
import { Route, RouterModule } from '@angular/router';
import { PMAccountComponent } from './pmaccount/pmaccount.component';
import { AllAccountsListComponent } from './all-accounts-list/all-accounts-list.component';
import { Pm2accountComponent } from './pm2account/pm2account.component';
import { Pm3accountComponent } from './pm3account/pm3account.component';
import { Pm4accountComponent } from './pm4account/pm4account.component';
import { AllphcvolComponent } from './allphcvol/allphcvol.component';
import { AllAccountsComponent } from './all-accounts/all-accounts.component';
import { DhRtbrComponent } from './dh-rtbr/dh-rtbr.component';
import { AddAccountComponent } from './add-account/add-account.component';
import { AllAccountsDA1Component } from './all-accounts-da1/all-accounts-da1.component';
import { AllAccountsListDA1Component } from './all-accounts-list-da1/all-accounts-list-da1.component';
import { PhcProdFutComponent } from './phc-prod-fut/phc-prod-fut.component';
import { PhcNonProdFutComponent } from './phc-non-prod-fut/phc-non-prod-fut.component';
import { PhcFutComponent } from './phc-fut/phc-fut.component';
import { PhcVolSummaryComponent } from './phc-vol-summary/phc-vol-summary.component';
import { AllPhcVolRemarksComponent } from './all-phc-vol-remarks/all-phc-vol-remarks.component';
import { AllPhcVolTotalComponent } from './all-phc-vol-total/all-phc-vol-total.component';
import { VolumeTodayComponent } from './volume-today/volume-today.component';
import { PhcTodayLWDComponent } from './phc-today-lwd/phc-today-lwd.component';
import { LoadMasterDataComponent } from './load-master-data/load-master-data.component';
import { LoginComponent } from './login/login.component';
import { LogoutComponent } from './logout/logout.component';
import { AuthGaurdService } from './auth-gaurd.service';
import { PhcVolTargetComponent } from './phc-vol-target/phc-vol-target.component';
import { PhcvolaccountdmComponent } from './phcvolaccountdm/phcvolaccountdm.component';
import { PhcvolaccountamitComponent } from './phcvolaccountamit/phcvolaccountamit.component';
import { PhcvolaccountbinduComponent } from './phcvolaccountbindu/phcvolaccountbindu.component';
import { PhcvolaccountharishComponent } from './phcvolaccountharish/phcvolaccountharish.component';
import { PhcvolaccountnpComponent } from './phcvolaccountnp/phcvolaccountnp.component';
import { PhcvolaccountmukulComponent } from './phcvolaccountmukul/phcvolaccountmukul.component';
import { BeamitComponent } from './beamit/beamit.component';
import { BebinduComponent } from './bebindu/bebindu.component';
import { BeharishComponent } from './beharish/beharish.component';
import { BenpComponent } from './benp/benp.component';
import { BemukulComponent } from './bemukul/bemukul.component';
import { BeraviComponent } from './beravi/beravi.component';
import { BeprashantComponent } from './beprashant/beprashant.component';
import { BesaradaComponent } from './besarada/besarada.component';
import { BenpallComponent } from './benpall/benpall.component';
import { PvamitComponent } from './pvamit/pvamit.component';
import { PvbinduComponent } from './pvbindu/pvbindu.component';
import { PvharishComponent } from './pvharish/pvharish.component';
import { PvnpComponent } from './pvnp/pvnp.component';
import { PvmukulComponent } from './pvmukul/pvmukul.component';
import { PvnpallComponent } from './pvnpall/pvnpall.component';
import { PvraviComponent } from './pvravi/pvravi.component';
import { PvprashantComponent } from './pvprashant/pvprashant.component';
import { PvsaradaComponent } from './pvsarada/pvsarada.component';
import { NxtmnthpvtargetComponent } from './nxtmnthpvtarget/nxtmnthpvtarget.component';
import { NbrnpComponent } from './nbrnp/nbrnp.component';
import { NbrnpallComponent } from './nbrnpall/nbrnpall.component';
import { NbrraviComponent } from './nbrravi/nbrravi.component';
import { NbrprashantComponent } from './nbrprashant/nbrprashant.component';
import { NbrsaradaComponent } from './nbrsarada/nbrsarada.component';
import { CurrconvComponent } from './currconv/currconv.component';
import { M1currconvComponent } from './m1currconv/m1currconv.component';
import { M2currconvComponent } from './m2currconv/m2currconv.component';
import { M3currconvComponent } from './m3currconv/m3currconv.component';
import { M1actualsComponent } from './m1actuals/m1actuals.component';
import { M2actualsComponent } from './m2actuals/m2actuals.component';
import { M3actualsComponent } from './m3actuals/m3actuals.component';


const routes: Route[] = [
{path: '', redirectTo: '/allphcvoltotal', pathMatch: 'full', canActivate:[AuthGaurdService]},
{path: 'allaccounts', component: AllAccountsComponent, canActivate:[AuthGaurdService]},
{path: 'allaccountspu', 
  component: AllAccountsListComponent, 
  children:[
    {path: 'beamit', component: BeamitComponent, canActivate:[AuthGaurdService]},
    {path: 'bebindu', component: BebinduComponent, canActivate:[AuthGaurdService]},
    {path: 'beharish', component: BeharishComponent, canActivate:[AuthGaurdService]},
    {
      path: 'benp', 
      component: BenpComponent, 
      children:[
        {path: 'benpall', component: BenpallComponent, canActivate:[AuthGaurdService]},
        {path: 'beravi', component: BeraviComponent, canActivate:[AuthGaurdService]},
        {path: 'beprashant', component: BeprashantComponent, canActivate:[AuthGaurdService]},
        {path: 'besarada', component: BesaradaComponent, canActivate:[AuthGaurdService]},
      ]  
    },
    {path: 'bemukul', component: BemukulComponent, canActivate:[AuthGaurdService]}
  ]  
},
//{path: 'allaccountsravi', component: AllAccountsDA1Component, canActivate:[AuthGaurdService]},
//{path: 'allaccountsravipu', component: AllAccountsListDA1Component, canActivate:[AuthGaurdService]},
//{path: 'Sarada', component: PMAccountComponent, canActivate:[AuthGaurdService]},
//{path: 'Ravi', component: Pm2accountComponent, canActivate:[AuthGaurdService]},
//{path: 'Deepa', component: Pm3accountComponent, canActivate:[AuthGaurdService]},
//{path: 'Purnima', component: Pm4accountComponent, canActivate:[AuthGaurdService]},
{path: 'allphcvol', 
  component: PhcvolaccountdmComponent,
  children:[
    {path: 'phcvolaccountamit', component: PhcvolaccountamitComponent, canActivate:[AuthGaurdService]},
    {path: 'phcvolaccountbindu', component: PhcvolaccountbinduComponent, canActivate:[AuthGaurdService]},
    {path: 'phcvolaccountharish', component: PhcvolaccountharishComponent, canActivate:[AuthGaurdService]},
    {path: 'phcvolaccountnp', component: PhcvolaccountnpComponent, canActivate:[AuthGaurdService]},
    {path: 'phcvolaccountmukul', component: PhcvolaccountmukulComponent, canActivate:[AuthGaurdService]}
  ]  
},
{path: 'allphcvolpu', 
  component: AllphcvolComponent, 
  children:[
    {path: 'pvamit', component: PvamitComponent, canActivate:[AuthGaurdService]},
    {path: 'pvbindu', component: PvbinduComponent, canActivate:[AuthGaurdService]},
    {path: 'pvharish', component: PvharishComponent, canActivate:[AuthGaurdService]},
    {
      path: 'pvnp', 
      component: PvnpComponent, 
      children:[
        {path: 'pvnpall', component: PvnpallComponent, canActivate:[AuthGaurdService]},
        {path: 'pvravi', component: PvraviComponent, canActivate:[AuthGaurdService]},
        {path: 'pvprashant', component: PvprashantComponent, canActivate:[AuthGaurdService]},
        {path: 'pvsarada', component: PvsaradaComponent, canActivate:[AuthGaurdService]},
      ]  
    },
    {path: 'pvmukul', component: PvmukulComponent, canActivate:[AuthGaurdService]}
  ]  
},
{path: 'phcfuture', 
  component: PhcFutComponent,
  children:[
    {path: 'PHCProdFuture', component: PhcProdFutComponent, canActivate:[AuthGaurdService]},
    {path: 'PHCNonProdFuture', component: PhcNonProdFutComponent, canActivate:[AuthGaurdService]}
  ]
},
{path: 'allphcvolpuremarks', component: AllPhcVolRemarksComponent, canActivate:[AuthGaurdService]},
{path: 'allphcvoltotal', component: AllPhcVolTotalComponent, canActivate:[AuthGaurdService]},
{path: 'loadmasterdata', 
  component: LoadMasterDataComponent, 
  children:[
    {path: 'dhrtbr', component: DhRtbrComponent, canActivate:[AuthGaurdService]},
    {path: 'volumetoday', component: VolumeTodayComponent, canActivate:[AuthGaurdService]},
    {path: 'phctodaylwd', component: PhcTodayLWDComponent, canActivate:[AuthGaurdService]},
    {path: 'phcvoltarget', component: PhcVolTargetComponent, canActivate:[AuthGaurdService]},
    {path: 'addAcnt', component: AddAccountComponent, canActivate:[AuthGaurdService]},
    {path: 'currconversion', 
     component: CurrconvComponent, 
     children:[
      {path: 'm1currconv', component: M1currconvComponent, canActivate:[AuthGaurdService]},
      {path: 'm2currconv', component: M2currconvComponent, canActivate:[AuthGaurdService]},
      {path: 'm3currconv', component: M3currconvComponent, canActivate:[AuthGaurdService]},
      {path: 'm1actuals', component: M1actualsComponent, canActivate:[AuthGaurdService]},
      {path: 'm2actuals', component: M2actualsComponent, canActivate:[AuthGaurdService]},
      {path: 'm3actuals', component: M3actualsComponent, canActivate:[AuthGaurdService]},
    ]
    }
  ]
},
{path: 'nxtmnthpvtarget', component: NxtmnthpvtargetComponent, canActivate:[AuthGaurdService]},
{path: 'nbrnp', 
      component: NbrnpComponent, 
      children:[
        {path: 'nbrnpall', component: NbrnpallComponent, canActivate:[AuthGaurdService]},
        {path: 'nbrravi', component: NbrraviComponent, canActivate:[AuthGaurdService]},
        {path: 'nbrprashant', component: NbrprashantComponent, canActivate:[AuthGaurdService]},
        {path: 'nbrsarada', component: NbrsaradaComponent, canActivate:[AuthGaurdService]}
      ]
 },
 {path: 'login', component: LoginComponent},
 {path: 'logout', component: LogoutComponent, canActivate:[AuthGaurdService]}
];
/*{
  path: 'pm', 
  component: PMAccountComponent,
 /* children :
  [
    {path: '', redirectTo: 'pmall', pathMatch: 'full'},
    {path: 'pmall', component: AllAccountsListComponent},
  ]
}*/


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
