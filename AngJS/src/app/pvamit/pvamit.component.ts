import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { AccountserviceService } from '../accountservice.service';
import { AccountPV } from '../account-pv';
import { TotalPV } from '../total-pv';

@Component({
  selector: 'app-pvamit',
  templateUrl: './pvamit.component.html',
  styleUrls: ['./pvamit.component.scss']
})
export class PvamitComponent implements OnInit {
  response:any;
  accountPV : AccountPV[]=[];
  totalPV : TotalPV[]=[];
  dm : string = 'Amit';
 

  
  constructor(private httpClient: HttpClient, private accountserviceService : AccountserviceService)
  {
 
  }
  
  ngOnInit(){

   /* let username = 'user'
    let password = 'pass'
    const headers = new HttpHeaders({ Authorization : 'Basic' + btoa(username +':'+password)}); */
 
   this.httpClient.get("phcvol/phcvol/"+this.dm) //, {headers})
      .subscribe(
       (response)=>
        {
 
         this.response = response; 
         this.accountPV =this.response;
        
        this.httpClient.get("phcvol/phcvol/total/"+this.dm) //, {headers})
         .subscribe(
             (response)=>
              {
       
               this.response = response; 
               this.totalPV=this.response;
              
               
              }); 
         
        });


       
  
  }
 
 }
 

