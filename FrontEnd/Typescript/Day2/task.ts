 //3. annonymous fun with parameter and without return type

 let annoFun3=function (a:number,b:number){
    console.log("with parameter and without return type")
}
annoFun3(10,20);

//4. annonymous fun without parameter and with return type
let annoFun4=function (a:number,b:number):number{
    console.log("without parameter and with return type")
    return (a+b);
}

let resultannoFun4=annoFun4(10,5);
 console.log("Result is "+resultannoFun4);


 console.log('*********************************')


 //3. Fat Arrow with parametr and without return type
let arrfun3=  (a:number,b:number)=>{
    console.log("with parametr and without return type")
    console.log("sum of "+a+" and "+b+" is "+(a+b))
 }
 arrfun3(5,2);

 //4. Fat Arrow without parametr and with return type
 let arrfun4=  (): number=>{
     console.log("without parametr and with return type")
     return 100;
  }
  let resultarrfun4 =  arrfun4();
  console.log('Result='+resultarrfun4)