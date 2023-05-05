// Reference - https://www.youtube.com/watch?v=sOZwwL_-cBA&list=PL_HlKez9XCSM0bs8P7LtCTGh4rghAD2im&index=1

// Used in case of array and object

// Rest Operator

function add(a, b, c, ...others) {
  console.log(others); // [4, 5, 6]

  return a + b + c;
}

console.log(add(1, 2, 3, 4, 5, 6));

var student = {
  name: "John",
  age: 20,
  address: "USA",
  phone: 1234567890,
};

var { name, age, ...rest } = student;

console.log(rest); // {address: "USA", phone: 1234567890}

// Spread Operator

const arr1 = [1, 2, 3];

const arr2 = [...arr1, 4, 5, 6];

console.log(arr2); // [1, 2, 3, 4, 5, 6]

var names = ["John", "Jane", "Jack"];

names = ["Mary", ...names];

function getNames(...names) {
  console.log(names);
}

getNames(...names); // ["Mary", "John", "Jane", "Jack"]

var newStudent = {
  ...student,
  name: "Mary",
};

console.log(newStudent); // {name: "Mary", age: 20, address: "USA", phone: 1234567890}
