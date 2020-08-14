import { Component, OnInit, Input, ViewChild, ElementRef } from '@angular/core';
import { AccountBE } from '../account-be';
import { TotalBE } from '../total-be';
import { TruncatePipe } from '../truncate.pipe';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Router } from '@angular/router';
import * as XLSX from 'xlsx';


@Component({
  selector: 'app-nbr-tile',
  templateUrl: './nbr-tile.component.html',
  styleUrls: ['./nbr-tile.component.scss']
})
export class NbrTileComponent implements OnInit {
   @ViewChild('table', {static:false}) table: ElementRef;

  @Input() accountBE : AccountBE[];
  @Input() totalBE : TotalBE[];
  response : any;
  showTextbox:boolean[] = [];
  showUpdatebutton : boolean[] = [];
  showUpdatebuttonflag : boolean = false;

  nativecurrency : string[]=[];
  nativediscount : number[]=[];
  m1usdconversion : number[]=[];
  m2usdconversion : number[]=[];
  m3usdconversion : number[]=[];
  m1native : number[]=[];
  m2native : number[]=[];
  m3native : number[]=[];
  totalnative : number[]=[];
  m1be : number[]=[];
  m2be : number[]=[];
  m3be : number[]=[];
  totalbe : number[]=[];
  m1rtbr : number[]=[];
  m2rtbr : number[]=[];
  m3rtbr : number[]=[];
  totalrtbr : number[]=[];
  m1bertbrremarks : string[]=[];
  m2bertbrremarks : string[]=[];
  m3bertbrremarks : string[]=[];
  
  currmnthbe : number[]=[];
  currmnthrtbr : number[]=[];

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
      this.nativecurrency[i] = this.accountBE[i].nativecurrency;
      this.nativediscount[i] = this.accountBE[i].nativediscount;
      this.m1native[i]=this.accountBE[i].m1native;
      this.m2native[i]=this.accountBE[i].m2native;
      this.m3native[i]=this.accountBE[i].m3native;      
      this.m1usdconversion[i] = this.accountBE[i].m1usdconversion;
      this.m2usdconversion[i] = this.accountBE[i].m2usdconversion;
      this.m3usdconversion[i] = this.accountBE[i].m3usdconversion;
      this.totalnative[i] = this.accountBE[i].totalnative;
      this.m1be[i] = this.accountBE[i].m1be;
      this.m2be[i] = this.accountBE[i].m2be;
      this.m3be[i] = this.accountBE[i].m3be;
      this.totalbe[i] = this.accountBE[i].totalbe;
      this.m1rtbr[i] = this.accountBE[i].m1rtbr;
      this.m2rtbr[i] = this.accountBE[i].m2rtbr;
      this.m3rtbr[i] = this.accountBE[i].m3rtbr;
      this.totalrtbr[i] = this.accountBE[i].totalrtbr;
      this.m1bertbrremarks[i] = this.accountBE[i].m1bertbrremarks;
      this.m2bertbrremarks[i] = this.accountBE[i].m2bertbrremarks;
      this.m3bertbrremarks[i] = this.accountBE[i].m3bertbrremarks;

      this.currmnthbe[i] = this.accountBE[i].m2be;
      this.currmnthrtbr[i] = this.accountBE[i].m2rtbr;
     
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

  updateAcntBENPBE(i:number)  {


    this.accountBE[i].nativecurrency =this.nativecurrency[i];
    this.accountBE[i].nativediscount=this.nativediscount[i];
    this.accountBE[i].m1native=this.m1native[i];
    this.accountBE[i].m2native=this.m2native[i];
    this.accountBE[i].m3native=this.m3native[i];
    this.accountBE[i].m1usdconversion=this.m1usdconversion[i];
    this.accountBE[i].m2usdconversion=this.m2usdconversion[i];
    this.accountBE[i].m3usdconversion=this.m3usdconversion[i];
    this.accountBE[i].totalnative=this.totalnative[i];
//    this.m1usdconversion[i]=2;
    this.m1be[i] = (this.m1native[i]-(this.m1native[i] * this.nativediscount[i]*0.01))*(this.m1usdconversion[i]);
    this.m2be[i] = (this.m2native[i]-(this.m2native[i] * this.nativediscount[i]*0.01))*(this.m2usdconversion[i]);
    this.m3be[i] = (this.m3native[i]-(this.m3native[i] * this.nativediscount[i]*0.01))*(this.m3usdconversion[i]);
    
    this.accountBE[i].m1be=this.m1be[i];
    this.accountBE[i].m2be=this.m2be[i];
    this.accountBE[i].m3be=this.m3be[i];
    this.accountBE[i].pmBE = this.m1be[i] + this.m2be[i] + this.m3be[i];
    this.accountBE[i].totalbe=this.totalbe[i];
    this.accountBE[i].m1rtbr=this.m1rtbr[i];
    this.accountBE[i].m2rtbr=this.m2rtbr[i];
    this.accountBE[i].m3rtbr=this.m3rtbr[i];
    this.accountBE[i].totalrtbr=this.totalrtbr[i];
    this.accountBE[i].m1bertbrremarks=this.m1bertbrremarks[i];
    this.accountBE[i].m2bertbrremarks=this.m2bertbrremarks[i];
    this.accountBE[i].m3bertbrremarks=this.m3bertbrremarks[i];

    this.accountBE[i].currmnthbe = this.currmnthbe[i];
    this.accountBE[i].currmnthrtbr = this.currmnthrtbr[i];

    if(this.m1bertbrremarks[i] !== null) 
    {
    this.accountBE[i].remarks = "m1->"+ this.m1bertbrremarks[i] +"\n";
    console.log ("this.accountBE[i].remarks==>"+this.accountBE[i].remarks);
    }

    if(this.m2bertbrremarks[i] !== null) 
    {
    this.accountBE[i].remarks = this.accountBE[i].remarks + "m2->"+ this.m2bertbrremarks[i] + "\n";
    console.log ("this.accountBE[i].remarks==>"+this.accountBE[i].remarks);
    }

    if(this.m3bertbrremarks[i] !== null) 
    {
    this.accountBE[i].remarks = this.accountBE[i].remarks + "m3->"+ this.m3bertbrremarks[i];
    console.log ("this.accountBE[i].remarks==>"+this.accountBE[i].remarks);
    }



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
               
                 this.router.navigateByUrl('allaccountspu/benp/benpall');
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

