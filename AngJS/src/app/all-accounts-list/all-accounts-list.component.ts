import { Component, OnInit} from '@angular/core';


@Component({
  selector: 'app-all-accounts-list',
  templateUrl: './all-accounts-list.component.html',
  styleUrls: ['./all-accounts-list.component.scss']
})
export class AllAccountsListComponent implements OnInit {
  routes =[
    {label:"Amit", url:"beamit"},
    {label:"Bindu", url:"bebindu"},
    {label:"Harish", url:"beharish"},
    {label:"NP", url:"benp"},
    {label:"Mukul", url:"bemukul"}
    
  ]
  
  constructor()
  {
 
  }
  
  ngOnInit(){
  }
 
 }
 
