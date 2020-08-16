import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-m1currconv',
  templateUrl: './m1currconv.component.html',
  styleUrls: ['./m1currconv.component.scss']
})
export class M1currconvComponent implements OnInit {

  response:any;

  constructor(private httpClient: HttpClient) { }

  ngOnInit() {
    this.httpClient.get("be/currconv/m1")
     .subscribe(
       (response)=>
        {
 
         this.response = response; 

        });
   }

  

}
