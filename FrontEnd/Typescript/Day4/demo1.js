"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Student = void 0;
var Student = /** @class */ (function () {
    function Student(rollNo, name, marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    Student.prototype.getDeatailsOfStudent = function () {
        console.log("\n    rollNo : ".concat(this.rollNo, " ,\n    name : ").concat(this.name, " ,\n    marks :").concat(this.marks, "\n"));
    };
    return Student;
}());
exports.Student = Student;
