import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  myUsername:string="Jivan";
  myPassword:string="1234"
  constructor() { }

  ngOnInit(): void {
  }

 onClick(userName:any,password:any){
    if(userName==this.myUsername && password==this.myPassword){
      alert("Login Successfully..!!!")
    }else{
      alert("!!! wrong username or password. ")
    }
  }

}
