"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
Object.defineProperty(exports, "__esModule", { value: true });
exports.ElectricCar = void 0;
var Car_1 = require("./Car");
var ElectricCar = /** @class */ (function (_super) {
    __extends(ElectricCar, _super);
    function ElectricCar(id, name, price, batteryCapacity) {
        var _this = _super.call(this, id, name, price) || this;
        _this.batteryCapacity = batteryCapacity;
        return _this;
    }
    ElectricCar.prototype.displayDetails = function () {
        console.log("\n              ElectricCar Details  :\n              id = ".concat(this.id, "\n              name = ").concat(this.name, "\n              price = ").concat(this.price, "\n              batteryCapacity = ").concat(this.batteryCapacity, "\n            "));
    };
    return ElectricCar;
}(Car_1.Car));
exports.ElectricCar = ElectricCar;
