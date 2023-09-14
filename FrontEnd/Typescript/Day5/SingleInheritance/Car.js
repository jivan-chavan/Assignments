"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Car = void 0;
var Car = /** @class */ (function () {
    function Car(id, name, price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    Car.prototype.displayDetails = function () {
        console.log("\n              Car Details :\n                    id =".concat(this.id, "\n                    name=").concat(this.name, "\n                    price=").concat(this.price, " \n               "));
    };
    return Car;
}());
exports.Car = Car;
