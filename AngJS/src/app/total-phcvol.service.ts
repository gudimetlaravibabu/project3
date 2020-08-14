import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class TotalPHCVolService {

  constructor(public dm : string, public phcTarget : number, public volTarget : number, public phcAoD : number, public volAoD : number, public phcAoL : number, public phcGap : number, public volGap : number, public remarks : string, public id : number, public showTextbox : boolean, public showUpdatebutton : boolean)
  {

  }
}
