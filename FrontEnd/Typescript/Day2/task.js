//3. annonymous fun with parameter and without return type
var annoFun3 = function (a, b) {
    console.log("with parameter and without return type");
};
annoFun3(10, 20);
//4. annonymous fun without parameter and with return type
var annoFun4 = function (a, b) {
    console.log("without parameter and with return type");
    return (a + b);
};
var resultannoFun4 = annoFun4(10, 5);
console.log("Result is " + resultannoFun4);
console.log('*********************************');
//3. Fat Arrow with parametr and without return type
var arrfun3 = function (a, b) {
    console.log("with parametr and without return type");
    console.log("sum of " + a + " and " + b + " is " + (a + b));
};
arrfun3(5, 2);
//4. Fat Arrow without parametr and with return type
var arrfun4 = function () {
    console.log("without parametr and with return type");
    return 100;
};
var resultarrfun4 = arrfun4();
console.log('Result=' + resultarrfun4);
