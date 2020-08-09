import { Component, OnInit, Input, ViewChild, ElementRef  } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { AccountserviceService } from '../accountservice.service';
import { AccountPV } from '../account-pv';
import { TotalPV } from '../total-pv';
import * as XLSX from 'xlsx';

@Component({
  selector: 'app-phc-vol-summary',
  templateUrl: './phc-vol-summary.component.html',
  styleUrls: ['./phc-vol-summary.component.scss']
})
export class PhcVolSummaryComponent implements OnInit {
  
  @ViewChild('table', {static:false}) table: ElementRef;
  response:any;
  @Input() accountPV : AccountPV[]=[];
  @Input() totalPV : TotalPV[]=[];
  @Input() displayDate : Date = new Date();
  //dm: string = 'NP';
 

  
  constructor(private httpClient: HttpClient, private accountserviceService : AccountserviceService)
  {
 
  }
  
  ngOnInit(){

 
  
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
 
