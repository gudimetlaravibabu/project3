import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-benp',
  templateUrl: './benp.component.html',
  styleUrls: ['./benp.component.scss']
})
export class BenpComponent implements OnInit {

  routes =[
    {label:"All", url:"benpall"},
    {label:"Ravi", url:"beravi"},
    {label:"Prashant", url:"beprashant"},
    {label:"Sarada", url:"besarada"}
    
  ]


  constructor() { }

  ngOnInit() {
  }

}
