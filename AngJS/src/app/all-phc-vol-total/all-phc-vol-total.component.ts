import { Component, OnInit, Input, ViewChild, ElementRef } from '@angular/core';
import { AccountPV } from '../account-pv';
import { TotalPV } from '../total-pv';
import { TotalPHCVolService } from '../total-phcvol.service';
import { Totaldmpv } from '../totaldmpv';
import { TruncatePipe } from '../truncate.pipe';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Router } from '@angular/router';
import { saveAs } from 'file-saver';
import * as XLSX from 'xlsx';
import { AuthenticationService } from '../authentication.service';

@Component({
  selector: 'app-all-phc-vol-total',
  templateUrl: './all-phc-vol-total.component.html',
  styleUrls: ['./all-phc-vol-total.component.scss']
})
export class AllPhcVolTotalComponent implements OnInit {

  @ViewChild('table', {static:false}) table: ElementRef;


  
  totPhcVol : TotalPHCVolService[];

  totaldmpv : Totaldmpv[]; 


  response : any;
  showTextbox:boolean[] = [];
  showUpdatebutton : boolean[] = [];
  showUpdatebuttonflag : boolean = false;
  phcTarget : number[]=[];
  volTarget : number[]=[];
  remarks : string[]=[];
  url:string;
      
  constructor(private httpClient: HttpClient, private truncatePipe:TruncatePipe, private router: Router, private loginService:AuthenticationService) { 
    
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
               console.log("this.totPhcVol"+this.totPhcVol);
               this.httpClient.get("phcvol/phcvoltotals/total")
               .subscribe(
               (response)=>
                {
         
                 this.response = response; 
                 console.log("this.response"+this.response);
                 this.totaldmpv=this.response;
                 console.log("this.totalsPhcVol"+ this.totaldmpv);
                 //this.router.navigateByUrl('allphcvol');
                
                }); 
                     
              }); 

              
         

                   


                   
        
   

       
  
  }

  toggleTextbox(i:number)
  {
    
    
    if(!this.totPhcVol[i].showTextbox)
    {
      
      this.totPhcVol[i].showTextbox = true;
      this.totPhcVol[i].showUpdatebutton = true;
      this.phcTarget[i] = this.totPhcVol[i].phcTarget;
      this.volTarget[i] = this.totPhcVol[i].volTarget;
      this.remarks[i] = this.totPhcVol[i].remarks;
    
      this.showTextbox[i] = this.totPhcVol[i].showTextbox;
      this.showUpdatebutton[i] = this.totPhcVol[i].showUpdatebutton;

     
    }else
    {
      this.totPhcVol[i].showTextbox = false;
      this.totPhcVol[i].showUpdatebutton = false;
      this.showTextbox[i] = this.totPhcVol[i].showTextbox;
      this.showUpdatebutton[i] = this.totPhcVol[i].showUpdatebutton;
      
    }


    
  }

  toggleUpdatebutton(){
    
    this.showUpdatebuttonflag = false;
    
    this.totPhcVol.forEach((p)=>{
      if(p.showUpdatebutton)
      {
      this.showUpdatebuttonflag = true;
      
      
      
      }
    });
    

  }

  updateAcntBENPBE(i:number)
  {
    this.totPhcVol[i].phcTarget = this.phcTarget[i];
    this.totPhcVol[i].volTarget = this.volTarget[i];
    this.totPhcVol[i].remarks = this.remarks[i];
    
  }

  updateDB(){

    this.totPhcVol.forEach((p)=>{
      
      if(p.showTextbox)
      {
             p.showTextbox = false;
             this.url = 'phcvol/phcvoltotals/'+p.id;
             console.log("url :"+ this.url);
             this.httpClient.put(this.url, p, {
               headers : new HttpHeaders({
                 'Content-Type':'application/json'
               })
             }).subscribe((res)=>
             {
              
               this.httpClient.get("phcvol/phcvoltotals/total")
               .subscribe(
               (response)=>
                {
         
                 this.response = response; 
                 console.log("this.response"+this.response);
                 this.totaldmpv=this.response;
                 console.log("this.totalsPhcVol"+ this.totaldmpv);
                 this.router.navigateByUrl('allphcvol');
                
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
     XLSX.writeFile(wb, 'PHCVol.xlsx');
}
 
 }
 
