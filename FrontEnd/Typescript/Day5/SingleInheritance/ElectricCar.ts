import { Car } from "./Car";

export class ElectricCar extends Car {
    // id : number;
    // name : string;
    // price : number;
    batteryCapacity: number;
    
    constructor( id : number, name : string, price : number,  batteryCapacity: number ){
            super(id , name , price);
            this.batteryCapacity=batteryCapacity;
        }

       public override displayDetails():void {
            console.log(`
              ElectricCar Details  :
              id = ${this.id}
              name = ${this.name}
              price = ${this.price}
              batteryCapacity = ${this.batteryCapacity}
            `);
          }


}