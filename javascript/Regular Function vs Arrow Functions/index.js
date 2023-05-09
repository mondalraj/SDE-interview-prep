// 1. Argument Objects are not available in Arrow Functions
// 2. Arrow Functions do not have their own "this" value
// 3. Arrow Functions cannot be used as constructors
// 4. Implicit Return in Arrow Functions

// 1. Argument Objects are not available in Arrow Functions
// Regular Function
function sum1() {
  console.log(arguments);
  let total = 0;
  for (let value of arguments) total += value;
  return total;
}
console.log(sum1(1, 2, 3, 4, 5, 10));

// Arrow Function
const sum2 = () => {
  console.log(arguments); // error
  let total = 0;
  for (let value of arguments) total += value; // error
  return total;
};
console.log(sum2(1, 2, 3, 4, 5, 10));

// 2. Arrow Functions do not have their own "this" value
// Regular Function
const video1 = {
  title: "a",
  tags: ["a", "b", "c"],
  showTags() {
    this.tags.forEach(function (tag) {
      console.log(this.title, tag);
    }, this);
  },
};

video1.showTags();

// Arrow Function
const video2 = {
  title: "a",
  tags: ["a", "b", "c"],
  showTags() {
    this.tags.forEach((tag) => {
      console.log(this.title, tag);
    });
  },
};

video2.showTags();

// 3. Arrow Functions cannot be used as constructors
const Person1 = function (name) {
  this.name = name;
};
const Person2 = (name) => {
  this.name = name;
};
const brad = new Person1("Brad"); // works
const john = new Person2("John"); // error

// 4. Implicit Return in Arrow Functions
// Regular Function
const square1 = function (number) {
  return number * number;
};
console.log(square1(5));
// Arrow Function
const square2 = (number) => number * number;
console.log(square2(5));
