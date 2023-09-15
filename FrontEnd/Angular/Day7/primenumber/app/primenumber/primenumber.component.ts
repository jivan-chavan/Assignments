import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-primenumber',
  templateUrl: './primenumber.component.html',
  styleUrls: ['./primenumber.component.css']
})
export class PrimenumberComponent implements OnInit {

  constructor() { }

  result:string="";
  num2:number=0;
  ngOnInit(): void {
  }

  onClick(myNumber: any){
    for(let i=2;i<=myNumber;i++){
      if(myNumber%i==0){
        this.num2++;
      }
    }
    if(this.num2==1){
      this.result="Its a Prime Number."
      return this.result;
    }else{
      this.result="Its not a Prime Number."
      return this.result;
    }
  }

}
