import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-currconv',
  templateUrl: './currconv.component.html',
  styleUrls: ['./currconv.component.scss']
})
export class CurrconvComponent implements OnInit {

  routes =[
    {label:"Apply M1 CurrConv", url:"m1currconv"},
    {label:"Apply M2 CurrConv", url:"m2currconv"},
    {label:"Apply M3 CurrConv", url:"m3currconv"},
    {label:"Apply M1 Actuals", url:"m1actuals"},
    {label:"Apply M2 Actuals", url:"m2actuals"},
    {label:"Apply M3 Actuals", url:"m3actuals"}
    
    
  ]

  constructor() { }

  ngOnInit() {
  }

}
