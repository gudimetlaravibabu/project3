import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-nbrnp',
  templateUrl: './nbrnp.component.html',
  styleUrls: ['./nbrnp.component.scss']
})
export class NbrnpComponent implements OnInit {


  routes =[
    {label:"All", url:"nbrnpall"},
    {label:"Ravi", url:"nbrravi"},
    {label:"Prashant", url:"nbrprashant"},
    {label:"Sarada", url:"nbrsarada"}
    
  ]

  constructor() { }

  ngOnInit() {
  }

}
