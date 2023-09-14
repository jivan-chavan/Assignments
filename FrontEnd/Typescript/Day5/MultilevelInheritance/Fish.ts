import { Aquatic } from "./Aquatic";

export class Fish extends Aquatic{



    constructor( name :  string, lifespan : number){
        super(name,lifespan);
    }

    override characteristics(){
        console.log(`
          swimming.....
        `)
    }

}