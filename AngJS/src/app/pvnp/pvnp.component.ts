import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pvnp',
  templateUrl: './pvnp.component.html',
  styleUrls: ['./pvnp.component.scss']
})
export class PvnpComponent implements OnInit {

  routes =[
    {label:"All", url:"pvnpall"},
    {label:"Ravi", url:"pvravi"},
    {label:"Prashant", url:"pvprashant"},
    {label:"Sarada", url:"pvsarada"}
    
  ]

  constructor() { }

  ngOnInit() {
  }

}
