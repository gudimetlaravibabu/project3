import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { AccountserviceService } from '../accountservice.service';
import { AccountPV } from '../account-pv';
import { TotalPV } from '../total-pv';

@Component({
  selector: 'app-pvsarada',
  templateUrl: './pvsarada.component.html',
  styleUrls: ['./pvsarada.component.scss']
})
export class PvsaradaComponent implements OnInit {

  response:any;
  accountPV : AccountPV[]=[];
  totalPV : TotalPV[]=[];
  dm : string = 'NP';
  da : string = 'Sarada';
 

  
  constructor(private httpClient: HttpClient, private accountserviceService : AccountserviceService)
  {
 
  }
  
  ngOnInit(){

   /* let username = 'user'
    let password = 'pass'
    const headers = new HttpHeaders({ Authorization : 'Basic' + btoa(username +':'+password)}); */
 
   this.httpClient.get("phcvol/phcvol/"+this.dm + "/" + this.da) //, {headers})
      .subscribe(
       (response)=>
        {
 
         this.response = response; 
         this.accountPV =this.response;
        
        this.httpClient.get("phcvol/phcvol/total/"+this.dm  + "/" + this.da) //, {headers})
         .subscribe(
             (response)=>
              {
       
               this.response = response; 
               this.totalPV=this.response;
              
               
              }); 
         
        });


       
  
  }
 
 }
 

