import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-allphcvol',
  templateUrl: './allphcvol.component.html',
  styleUrls: ['./allphcvol.component.scss']
})
export class AllphcvolComponent implements OnInit {

  routes =[
    {label:"Amit", url:"pvamit"},
    {label:"Bindu", url:"pvbindu"},
    {label:"Harish", url:"pvharish"},
    {label:"NP", url:"pvnp"},
    {label:"Mukul", url:"pvmukul"}
    
  ]

  
  constructor()
  {
 
  }
  
  ngOnInit(){

   
  }
 
 }
 
