// Hoisting - JavaScript moves all variable declarations to the top of the current scope (function or global).
// Javascript  only hoists functions defined with function keyword but not the arrow function

console.log(sumFunc(1, 2)); // 3
console.log(sumArrow(1, 2)); // ReferenceError: Cannot access 'sumArrow' before initialization
console.log(a); // undefined - var a is hoisted to the top of the scope but not initialized

function sumFunc(a, b) {
  return a + b;
}

const sumArrow = (a, b) => a + b;

var a = 1;
