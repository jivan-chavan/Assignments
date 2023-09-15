import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-classbinding',
  templateUrl: './classbinding.component.html',
  styleUrls: ['./classbinding.component.css']
})
export class ClassbindingComponent implements OnInit {

  isItalic=false;
  isColored=false;

  constructor() { }

  ngOnInit(): void {
  }

  onClick(){
    this.isItalic=!this.isItalic;
    this.isColored=!this.isColored;
  }

}
