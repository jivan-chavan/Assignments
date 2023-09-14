import { Animal } from "./Animal";

export class Aquatic extends Animal{

    

    constructor( name :  string, lifespan : number){
       super(name, lifespan)
    }

    override characteristics(){
        console.log(`
         living in water....
        `)
    }

}