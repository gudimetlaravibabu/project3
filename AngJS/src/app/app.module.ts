import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AllAccountsListComponent } from './all-accounts-list/all-accounts-list.component';
import { AccountsTileComponent } from './accounts-tile/accounts-tile.component';
import { AccountserviceService } from './accountservice.service';
import { TruncatePipe } from './truncate.pipe';
import { PMAccountComponent } from './pmaccount/pmaccount.component';
import { Pm2accountComponent } from './pm2account/pm2account.component';
import { Pm3accountComponent } from './pm3account/pm3account.component';
import { Pm4accountComponent } from './pm4account/pm4account.component';
import { AllphcvolComponent } from './allphcvol/allphcvol.component';
import { PhcVolTileComponent } from './phc-vol-tile/phc-vol-tile.component';
import { AllAccountsComponent } from './all-accounts/all-accounts.component';
import { AccountsAllTileComponent } from './accounts-all-tile/accounts-all-tile.component';
import { DhRtbrComponent } from './dh-rtbr/dh-rtbr.component';
import { AddAccountComponent } from './add-account/add-account.component';
import { AllAccountsDA1Component } from './all-accounts-da1/all-accounts-da1.component';
import { AllAccountsListDA1Component } from './all-accounts-list-da1/all-accounts-list-da1.component';
import { OnlynumberDirective } from './onlynumber.directive';
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
import { AuthenticationService } from './authentication.service';
import { AuthGaurdService } from './auth-gaurd.service';
import { TotalPHCVolService } from './total-phcvol.service';
import { BasicAuthHttpInterceptorService } from './basic-auth-http-interceptor.service';
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
import { NbrTileComponent } from './nbr-tile/nbr-tile.component';
import { CurrconvComponent } from './currconv/currconv.component';
import { M1currconvComponent } from './m1currconv/m1currconv.component';
import { M2currconvComponent } from './m2currconv/m2currconv.component';
import { M3currconvComponent } from './m3currconv/m3currconv.component';
import { M1actualsComponent } from './m1actuals/m1actuals.component';
import { M2actualsComponent } from './m2actuals/m2actuals.component';
import { M3actualsComponent } from './m3actuals/m3actuals.component';




@NgModule({
  declarations: [
    AppComponent,
    AllAccountsListComponent,
    AccountsTileComponent,
    TruncatePipe,
    PMAccountComponent,
    Pm2accountComponent,
    Pm3accountComponent,
    Pm4accountComponent,
    AllphcvolComponent,
    PhcVolTileComponent,
    AllAccountsComponent,
    AccountsAllTileComponent,
    DhRtbrComponent,
    AddAccountComponent,
    AllAccountsDA1Component,
    AllAccountsListDA1Component,
    OnlynumberDirective,
    PhcProdFutComponent,
    PhcNonProdFutComponent,
    PhcFutComponent,
    PhcVolSummaryComponent,
    AllPhcVolRemarksComponent,
    AllPhcVolTotalComponent,
    VolumeTodayComponent,
    PhcTodayLWDComponent,
    LoadMasterDataComponent,
    LoginComponent,
    LogoutComponent,
    PhcVolTargetComponent,
    PhcvolaccountdmComponent,
    PhcvolaccountamitComponent,
    PhcvolaccountbinduComponent,
    PhcvolaccountharishComponent,
    PhcvolaccountnpComponent,
    PhcvolaccountmukulComponent,
    BeamitComponent,
    BebinduComponent,
    BeharishComponent,
    BenpComponent,
    BemukulComponent,
    BeraviComponent,
    BeprashantComponent,
    BesaradaComponent,
    BenpallComponent,
    PvamitComponent,
    PvbinduComponent,
    PvharishComponent,
    PvnpComponent,
    PvmukulComponent,
    PvnpallComponent,
    PvraviComponent,
    PvprashantComponent,
    PvsaradaComponent,
    NxtmnthpvtargetComponent,
    NbrnpComponent,
    NbrnpallComponent,
    NbrraviComponent,
    NbrprashantComponent,
    NbrsaradaComponent,
    NbrTileComponent,
    CurrconvComponent,
    M1currconvComponent,
    M2currconvComponent,
    M3currconvComponent,
    M1actualsComponent,
    M2actualsComponent,
    M3actualsComponent
    
    
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [AccountserviceService, TotalPHCVolService, TruncatePipe, AuthenticationService, AuthGaurdService,
  { provide: HTTP_INTERCEPTORS, useClass:BasicAuthHttpInterceptorService, multi:true }
],
  bootstrap: [AppComponent]
})
export class AppModule { }
