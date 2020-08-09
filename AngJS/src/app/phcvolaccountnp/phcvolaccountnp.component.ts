import { Component, OnInit, ViewChild, ElementRef  } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { AccountserviceService } from '../accountservice.service';
import { AccountPV } from '../account-pv';
import { TotalPV } from '../total-pv';
import * as XLSX from 'xlsx';

@Component({
  selector: 'app-phcvolaccountnp',
  templateUrl: './phcvolaccountnp.component.html',
  styleUrls: ['./phcvolaccountnp.component.scss']
})
export class PhcvolaccountnpComponent implements OnInit {
  
  @ViewChild('table', {static:false}) table: ElementRef;
  response:any;
  accountPV : AccountPV[]=[];
  totalPV : TotalPV[]=[];
  dm: string = 'NP';
 

  
  constructor(private httpClient: HttpClient, private accountserviceService : AccountserviceService)
  {
 
  }
  
  ngOnInit(){

    /* let username = 'user'
    let password = 'pass'
    const headers = new HttpHeaders({ Authorization : 'Basic' + btoa(username +':'+password)}); */
 
   this.httpClient.get("phcvol/allaccountsphcvol/"+this.dm) //, {headers})
      .subscribe(
       (response)=>
        {
 
         this.response = response; 
         this.accountPV =this.response;
        
        this.httpClient.get("phcvol/phcvolsummary/total/"+this.dm) //, {headers})
         .subscribe(
             (response)=>
              {
       
               this.response = response; 
               this.totalPV=this.response;
              
               
              }); 
         
        });


       
  
  }

  ExportTOExcel()
  {
     /*var blob = new Blob([document.getElementById("exportable").innerText], {
          type: "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;charset=utf-8"
        });
     var fileName = 'PHCVol.xls';
     saveAs(blob, fileName); */

   const ws: XLSX.WorkSheet=XLSX.utils.table_to_sheet(this.table.nativeElement);
   const wb: XLSX.WorkBook = XLSX.utils.book_new();
   XLSX.utils.book_append_sheet(wb, ws, 'Sheet1');
  
  // /* save to file */
   XLSX.writeFile(wb, 'PHCVol.xlsx');
  

  }
 
 }
 

