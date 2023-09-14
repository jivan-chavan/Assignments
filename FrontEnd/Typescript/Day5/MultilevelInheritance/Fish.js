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
exports.Fish = void 0;
var Aquatic_1 = require("./Aquatic");
var Fish = /** @class */ (function (_super) {
    __extends(Fish, _super);
    function Fish(name, lifespan) {
        return _super.call(this, name, lifespan) || this;
    }
    Fish.prototype.characteristics = function () {
        console.log("\n          swimming.....\n        ");
    };
    return Fish;
}(Aquatic_1.Aquatic));
exports.Fish = Fish;
