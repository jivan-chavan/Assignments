// User defined function
// 1 function without parameter & without return type 
// 2 function with parameter & without return type 
// 3 function without parameter & with return type
// 4 function with parameter & with return type  
console.log("");
// 1 function without parameter & without return type
console.log("1 function without parameter & without return type");
function add1() {
    console.log("U r in First type function");
}
add1();
console.log("************************************");
// 2 function with parameter & without return type 
console.log("2 function with parameter & without return type ");
function add2(a, b) {
    console.log("ADDITION IS " + (a + b));
}
add2(10, 2);
console.log("************************************");
// 3 function without parameter & with return type
console.log("3 function without parameter & with return type");
function add3() {
    return (8 + 8);
}
var res = add3();
console.log("Result is " + res);
console.log("************************************");
// 4 function with parameter & with return type  
console.log("4 function with parameter & with return type");
function add4(a, b) {
    return (a + b);
}
console.log("\n    Addition is ".concat(add4(10, 4), "\n"));
console.log("************************************");
//Anonymous Function
// function does not have any name 
// it execute logic there itself 
//1. annonymous fun without parameter and without return type
var temp1 = function () {
    console.log("Anonymous Function is called ");
};
temp1();
//2. annonymous fun with parameter and with return type
var temp2 = function (a, b) {
    return (a + b);
};
var afres2 = temp2(10, 5);
console.log("Result is " + afres2);
//3. annonymous fun with parameter and without return type
var afres3 = function (a, b) {
    console.log("with parameter and without return");
};
afres3(10, 20);
//4. annonymous fun without parameter and with return type
var temp4 = function (a, b) {
    return (a + b);
};
var afres4 = temp4(10, 5);
console.log("Result is " + afres4);
//Fat arrow function/ Arrow function 
//1. without parametr and without return type
var arf1 = function () {
    console.log("Fat arrow is used");
};
arf1();
//2. with parametr and with return type
var arf2 = function (a, b) {
    return (a + b);
};
var res2 = arf2(10, 20);
console.log("value of res3 is " + res2);
//3. with parametr and without return type
var arf3 = function (a, b) {
    console.log("with parametr and without return type");
    console.log("sum of " + a + "and" + b + "is" + (a + b));
};
arf3(5, 2);
//4. without parametr and with return type
var arf4 = function () {
    console.log("without parametr and with return type");
    return 100;
};
var res3 = arf4();
