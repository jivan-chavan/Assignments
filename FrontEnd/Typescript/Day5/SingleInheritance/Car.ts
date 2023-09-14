
export class Car {
     id : number;
     name : string;
     price : number;

     constructor( id : number,
          name : string,
          price : number){
               this.id=id;
               this.name=name;
               this.price=price;
          }

         public displayDetails(): void{
               console.log(`
              Car Details :
                    id =${this.id}
                    name=${this.name}
                    price=${this.price} 
               `)
          }

}