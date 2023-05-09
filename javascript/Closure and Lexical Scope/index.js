// lexical scoping

function init() {
  var name = "Mozilla"; // name is a local variable created by init
  function displayName() {
    // displayName() is the inner function, a closure
    console.log(name); // use variable declared in the parent function
  }
  displayName();
}
init(); // Mozilla

// Closure - a function bundled together with its lexical environment
function init() {
  var name = "Mozilla"; // name is a local variable created by init
  function displayName() {
    console.log(name); // use variable declared in the parent function
  }
  return displayName;
}
const value = init();
value(); // Mozilla

// Another Exmple of Closure
function doAddition(x) {
  return function (y) {
    return x + y;
  };
}
const add5 = doAddition(4);
console.log(add5(5)); // 9
console.log(doAddition(5)(5)); // 10
