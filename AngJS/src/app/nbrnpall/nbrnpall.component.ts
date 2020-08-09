import { Component, OnInit, Input } from '@angular/core';
import { AccountBE } from '../account-be';
import { TotalBE } from '../total-be';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { AccountserviceService } from '../accountservice.service';

@Component({
  selector: 'app-nbrnpall',
  templateUrl: './nbrnpall.component.html',
  styleUrls: ['./nbrnpall.component.scss']
})
export class NbrnpallComponent implements OnInit {
  response:any;
  accountBE : AccountBE[]=[];
  totalBE : TotalBE[]=[];
 // npBEText : number[];
  dm : string = 'NP';

  
  constructor(private httpClient: HttpClient, private accountserviceService : AccountserviceService)
  {
 
  }
  
  ngOnInit(){

   /* let username = 'user'
    let password = 'pass'
    const headers = new HttpHeaders({ Authorization : 'Basic' + btoa(username +':'+password)});*/
 
   this.httpClient.get("be/data/pu/"+this.dm) //, {headers})
   //this.httpClient.get("http://localhost:8081/data/pu")
     .subscribe(
       (response)=>
        {
 
         this.response = response; 
         this.accountBE=this.response;
         //console.log("inside accounts list 1st get method :"+ this.accountBE);
         this.httpClient.get("be/data/pu/betotal/"+this.dm) //, {headers})
         //this.httpClient.get("http://localhost:8081/data/pu")
           .subscribe(
             (response)=>
              {
       
               this.response = response; 
               this.totalBE=this.response;
               //console.log("inside accounts list 2nd get method :"+ this.totalBE);
               
              });
         
        });


       
  
  }
 
 }
 
