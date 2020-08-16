import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-m3actuals',
  templateUrl: './m3actuals.component.html',
  styleUrls: ['./m3actuals.component.scss']
})
export class M3actualsComponent implements OnInit {
  response:any;

  constructor(private httpClient: HttpClient) { }

  ngOnInit() {
    this.httpClient.get("be/actuals/m3")
     .subscribe(
       (response)=>
        {
 
         this.response = response; 

        });
   }

  

}
