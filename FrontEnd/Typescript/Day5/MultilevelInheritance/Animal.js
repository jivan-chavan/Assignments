"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Animal = void 0;
var Animal = /** @class */ (function () {
    function Animal(name, lifespan) {
        this.name = name;
        this.lifespan = lifespan;
    }
    Animal.prototype.displayDetails = function () {
        console.log(" Animal Details :\n        Name =".concat(this.name, "\n        Lifespan=").concat(this.lifespan, "\n"));
    };
    Animal.prototype.characteristics = function () {
        console.log("\n        moving....\n        ");
    };
    return Animal;
}());
exports.Animal = Animal;
