import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { AccountserviceService } from '../accountservice.service';
import { AccountPV } from '../account-pv';
import { TotalPV } from '../total-pv';


@Component({
  selector: 'app-all-phc-vol-remarks',
  templateUrl: './all-phc-vol-remarks.component.html',
  styleUrls: ['./all-phc-vol-remarks.component.scss']
})
export class AllPhcVolRemarksComponent implements OnInit {
  response:any;
  accountPV : AccountPV[]=[];
  totalPV : TotalPV[]=[];
  dm : string = 'NP';
 

  
  constructor(private httpClient: HttpClient, private accountserviceService : AccountserviceService)
  {
 
  }
  
  ngOnInit(){

   /* let username = 'user'
    let password = 'pass'
    const headers = new HttpHeaders({ Authorization : 'Basic' + btoa(username +':'+password)}); */
 
   this.httpClient.get("be/phcvolremarks/"+this.dm) //, {headers})
      .subscribe(
       (response)=>
        {
 
         this.response = response; 
         this.accountPV =this.response;
        
        this.httpClient.get("be/phcvolremarks/total/"+this.dm) //, {headers})
         .subscribe(
             (response)=>
              {
       
               this.response = response; 
               this.totalPV=this.response;
              
               
              }); 
         
        });


       
  
  }

  

 
 }
 
