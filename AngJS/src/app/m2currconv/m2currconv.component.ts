import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-m2currconv',
  templateUrl: './m2currconv.component.html',
  styleUrls: ['./m2currconv.component.scss']
})
export class M2currconvComponent implements OnInit {
  response:any;

  constructor(private httpClient: HttpClient) { }

  ngOnInit() {
    this.httpClient.get("be/currconv/m2")
     .subscribe(
       (response)=>
        {
 
         this.response = response; 

        });
   }

  

}
