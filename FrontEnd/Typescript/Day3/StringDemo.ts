
let arr : string []=["Jivan", "Sandip", "Arush","Shiv", "Ayush"];

console.log("Iterate by for loop ");
for(let i=0; i< arr.length; i++){
    console.log( "Element at "+i+" index is "+arr[i]);
}
console.log("Iterate by for-each method")
arr.forEach((element,index) => {
    console.log( "Index = "+index+" and Element = "+element);
});







