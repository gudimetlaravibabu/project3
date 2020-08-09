import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-phcvolaccountdm',
  templateUrl: './phcvolaccountdm.component.html',
  styleUrls: ['./phcvolaccountdm.component.scss']
})
export class PhcvolaccountdmComponent implements OnInit {


  routes =[
    {label:"Amit", url:"phcvolaccountamit"},
    {label:"Bindu", url:"phcvolaccountbindu"},
    {label:"Harish", url:"phcvolaccountharish"},
    {label:"NP", url:"phcvolaccountnp"},
    {label:"Mukul", url:"phcvolaccountmukul"}
  ]


  constructor() { }

  ngOnInit() {
  }

}
