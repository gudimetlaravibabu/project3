import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-m2actuals',
  templateUrl: './m2actuals.component.html',
  styleUrls: ['./m2actuals.component.scss']
})
export class M2actualsComponent implements OnInit {
  response:any;

  constructor(private httpClient: HttpClient) { }

  ngOnInit() {
    this.httpClient.get("be/actuals/m2")
     .subscribe(
       (response)=>
        {
 
         this.response = response; 

        });
   }

  

}
