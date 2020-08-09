import { Component, OnInit, ViewChild, ElementRef, SystemJsNgModuleLoader } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { AccountserviceService } from '../accountservice.service';

import { TotalPHCVolService } from '../total-phcvol.service';
import { TotalPV } from '../total-pv';
import { saveAs } from 'file-saver';
import * as XLSX from 'xlsx';
import { convertPropertyBindingBuiltins } from '@angular/compiler/src/compiler_util/expression_converter';

@Component({
  selector: 'app-all-phc-vol-total',
  templateUrl: './all-phc-vol-total.component.html',
  styleUrls: ['./all-phc-vol-total.component.scss']
})
export class AllPhcVolTotalComponent implements OnInit {

  @ViewChild('table', {static:false}) table: ElementRef;

  response:any;
  
  totPhcVol : TotalPHCVolService[];



  
  constructor(private httpClient: HttpClient, private accountserviceService : AccountserviceService)
  {
 
  }
  
  ngOnInit(){

    /* let username = 'user'
    let password = 'pass'
    const headers = new HttpHeaders({ Authorization : 'Basic' + btoa(username +':'+password)}); */
 

        
        this.httpClient.get("phcvol/phcvoltotals") //, {headers})
         .subscribe(
             (response)=>
              {
       
               this.response = response; 
               this.totPhcVol = this.response;
                     
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
 
