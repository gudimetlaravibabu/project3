import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-m1actuals',
  templateUrl: './m1actuals.component.html',
  styleUrls: ['./m1actuals.component.scss']
})
export class M1actualsComponent implements OnInit {
  response:any;

  constructor(private httpClient: HttpClient) { }

  ngOnInit() {
    this.httpClient.get("be/actuals/m1")
     .subscribe(
       (response)=>
        {
 
         this.response = response; 

        });
   }

  

}
