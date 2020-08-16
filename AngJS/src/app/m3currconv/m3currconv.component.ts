import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-m3currconv',
  templateUrl: './m3currconv.component.html',
  styleUrls: ['./m3currconv.component.scss']
})
export class M3currconvComponent implements OnInit {
  response:any;

  constructor(private httpClient: HttpClient) { }

  ngOnInit() {
    this.httpClient.get("be/currconv/m3")
     .subscribe(
       (response)=>
        {
 
         this.response = response; 

        });
   }

  

}