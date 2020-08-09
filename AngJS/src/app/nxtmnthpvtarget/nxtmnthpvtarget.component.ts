import { Component, OnInit, Input, ViewChild, ElementRef } from '@angular/core';
import { AccountPV } from '../account-pv';
import { TotalPV } from '../total-pv';
import { TruncatePipe } from '../truncate.pipe';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Router } from '@angular/router';
import { saveAs } from 'file-saver';
import * as XLSX from 'xlsx';
import { AuthenticationService } from '../authentication.service';

@Component({
  selector: 'app-nxtmnthpvtarget',
  templateUrl: './nxtmnthpvtarget.component.html',
  styleUrls: ['./nxtmnthpvtarget.component.scss']
})
export class NxtmnthpvtargetComponent implements OnInit {
  @ViewChild('table', {static:false}) table: ElementRef;

  response:any;
  accountPV : AccountPV[]=[];
  totalPV : TotalPV[]=[];
  dm : string = 'NP';

  showTextbox:boolean[] = [];
  showUpdatebutton : boolean[] = [];
  showUpdatebuttonflag : boolean = false;
  nxtMnthOffshoreVol : number[]=[];
  nxtMnthOnsiteVol : number[]=[];
  nxtMnthTotalVol : number[]=[];
  nxtMnthPHC : number[]=[];
  nxtMnthGapremarks : string[]=[];
  volgap : number[]=[];
  url:string;
      
  constructor(private httpClient: HttpClient, private truncatePipe:TruncatePipe, private router: Router, private loginService:AuthenticationService) { 
    
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

  toggleTextbox(i:number)
  {
    
      if(!this.accountPV[i].showTextbox)
    {
      
      this.accountPV[i].showTextbox = true;
      this.accountPV[i].showUpdatebutton = true;
      this.nxtMnthOffshoreVol[i] = this.accountPV[i].nxtMnthOffshoreVol;
      this.nxtMnthOnsiteVol[i] = this.accountPV[i].nxtMnthOnsiteVol;
      this.accountPV[i].nxtMnthTotalVol = (this.accountPV[i].nxtMnthOffshoreVol + this.accountPV[i].nxtMnthOnsiteVol);
      
      console.log("this.accountPV[i].nxtMnthTotalVol==>"+ this.accountPV[i].nxtMnthTotalVol);

      this.nxtMnthTotalVol[i] = this.accountPV[i].nxtMnthTotalVol;
      this.nxtMnthPHC[i] = this.accountPV[i].nxtMnthPHC;
      this.nxtMnthGapremarks[i] = this.accountPV[i].nxtMnthGapremarks;
    
      this.showTextbox[i] = this.accountPV[i].showTextbox;
      this.showUpdatebutton[i] = this.accountPV[i].showUpdatebutton;

     
    }else
    {
      this.accountPV[i].showTextbox = false;
      this.accountPV[i].showUpdatebutton = false;
      this.showTextbox[i] = this.accountPV[i].showTextbox;
      this.showUpdatebutton[i] = this.accountPV[i].showUpdatebutton;
      
    }

   
    
  }

  toggleUpdatebutton(){
    
    this.showUpdatebuttonflag = false;
    
    this.accountPV.forEach((p)=>{
      if(p.showUpdatebutton)
      {
      this.showUpdatebuttonflag = true;
      
      
      
      }
    });
    

  }

  updateAcntBENPBE(i:number)
  {
    this.accountPV[i].nxtMnthOffshoreVol = this.nxtMnthOffshoreVol[i];
    this.accountPV[i].nxtMnthOnsiteVol = this.nxtMnthOnsiteVol[i];
    this.nxtMnthTotalVol[i] = parseInt(this.nxtMnthOffshoreVol[i].toString()) + parseInt(this.nxtMnthOnsiteVol[i].toString());
      
    console.log("updateAcntBENPBE= this.nxtMnthTotalVol[i] ==>"+   this.nxtMnthTotalVol[i] );

    this.accountPV[i].nxtMnthTotalVol = this.nxtMnthTotalVol[i];
    this.accountPV[i].nxtMnthPHC = this.nxtMnthPHC[i];
    this.accountPV[i].nxtMnthGapremarks = this.nxtMnthGapremarks[i];

    console.log("updateAcntBENPBE=   this.accountPV[i].nxtMnthTotalVol ==>"+     this.accountPV[i].nxtMnthTotalVol );

    
    this.showTextbox[i] = this.accountPV[i].showTextbox;
    this.showUpdatebutton[i] = this.accountPV[i].showUpdatebutton;
    
  }

  updateDB(){

    this.accountPV.forEach((p)=>{
      
      if(p.showTextbox)
      {
             p.showTextbox = false;
             this.url = 'phcvol/phcvoltarget/'+p.id;
             console.log("url :"+ this.url);
             this.httpClient.put(this.url, p, {
               headers : new HttpHeaders({
                 'Content-Type':'application/json'
               })
             }).subscribe((res)=>
             {
              
               this.httpClient.get("phcvol/phcvol/total/"+p.dm)
               .subscribe(
               (response)=>
                {
         
                 this.response = response; 
                 this.totalPV=this.response;
                 this.router.navigateByUrl('allphcvoltotal');
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
   XLSX.writeFile(wb, 'NxtMonthPHCVolTarget.xlsx');
  

  }
 
   
}


