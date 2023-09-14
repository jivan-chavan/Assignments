 export class Student{

    rollNo : number;
    name : string;
    marks : number;

    constructor ( rollNo : number , name : string , marks : number){
                    this.rollNo=rollNo;
                    this.name=name;
                    this.marks=marks;
    }

    getDeatailsOfStudent(){
            console.log(`
            Student's Detail are :
                RollNo : ${this.rollNo} ,
                Name : ${this.name} ,
                Marks :${this.marks}
            `)
    }
  
    
 }
 