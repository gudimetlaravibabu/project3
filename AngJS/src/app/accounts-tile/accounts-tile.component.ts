import { Component, OnInit, Input, ViewChild, ElementRef } from '@angular/core';
import { AccountBE } from '../account-be';
import { TotalBE } from '../total-be';
import { TruncatePipe } from '../truncate.pipe';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Router } from '@angular/router';
import * as XLSX from 'xlsx';



@Component({
  selector: 'app-accounts-tile',
  templateUrl: './accounts-tile.component.html',
  styleUrls: ['./accounts-tile.component.scss']
})
export class AccountsTileComponent implements OnInit {

  @ViewChild('table', {static:false}) table: ElementRef;

  @Input() accountBE : AccountBE[];
  @Input() totalBE : TotalBE[];
  response : any;
  showTextbox:boolean[] = [];
  showUpdatebutton : boolean[] = [];
  showUpdatebuttonflag : boolean = false;
  npBE : number[]=[];
  pmBE : number[]=[];
  rtb : number[]=[];
  remarks : string[]=[];
  url:string;
      
  constructor(private httpClient: HttpClient, private truncatePipe:TruncatePipe, private router: Router) { 
 
  }

  ngOnChanges(){
   
  }

  ngOnInit() {
   
  }

  

  toggleTextbox(i:number)
  {

    if(!this.accountBE[i].showTextbox)
    {
      
      this.accountBE[i].showTextbox = true;
      this.accountBE[i].showUpdatebutton = true;
      this.pmBE[i] = this.accountBE[i].pmBE;
      this.rtb[i] = this.accountBE[i].rtb;
      this.remarks[i] = this.accountBE[i].remarks;
      this.showTextbox[i] = this.accountBE[i].showTextbox;
      this.showUpdatebutton[i] = this.accountBE[i].showUpdatebutton;
      
    }else
    {
      this.accountBE[i].showTextbox = false;
      this.accountBE[i].showUpdatebutton = false;
      this.showTextbox[i] = this.accountBE[i].showTextbox;
      this.showUpdatebutton[i] = this.accountBE[i].showUpdatebutton;

    }

      
  }

  toggleUpdatebutton(){
    
    this.showUpdatebuttonflag = false;
    this.accountBE.forEach((p)=>{
      if(p.showUpdatebutton)
      {
      this.showUpdatebuttonflag = true;
      
      }
    });
    

  }

  updateAcntBENPBE(i:number)
  {
    this.accountBE[i].pmBE = this.pmBE[i];
    this.accountBE[i].rtb = this.rtb[i];
    this.accountBE[i].remarks = this.remarks[i];
  }

  updateDB(){

    this.accountBE.forEach((p)=>{
      
      if(p.showTextbox)
      {
        
        p.showTextbox = false;     
        this.url = 'be/data/pu/'+p.id;
           
             this.httpClient.put(this.url, p, {
               headers : new HttpHeaders({
                 'Content-Type':'application/json'
               })
             }).subscribe((res)=>
             {
               
               this.httpClient.get("be/data/pu/betotal/"+p.dm)
               .subscribe(
               (response)=>
                {
         
                 this.response = response; 
                 this.totalBE=this.response;
               
                 this.router.navigateByUrl('allaccountspu/benp');
                });
               
             }
             );
             
             
      }      
      
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
       XLSX.writeFile(wb, 'BERTBR.xlsx');
  }

   
}

