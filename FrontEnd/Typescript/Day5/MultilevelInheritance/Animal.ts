
export class Animal{

    name: string;
    lifespan: number;

    constructor( name :  string, lifespan : number){
        this.name=name;
        this.lifespan=lifespan;
    }

    displayDetails(){
        console.log(` Animal Details :
        Name =${this.name}
        Lifespan=${this.lifespan}
`)
        
    }

    characteristics(){
        console.log(`
        moving....
        `)
    }

}