// Reference Video - https://www.youtube.com/watch?v=bWaucYA1YRI&list=PL_HlKez9XCSM0bs8P7LtCTGh4rghAD2im&index=2

Callbacks;
function add(a, b) {
  return a + b;
}

function sub(a, b) {
  return a - b;
}

function mul(a, b) {
  return a * b;
}

function div(a, b) {
  return a / b;
}

function calculator(a, b, callback) {
  return callback(a, b);
}

console.log(calculator(10, 20, add));

console.log(calculator(10, 20, sub));

console.log(calculator(10, 20, mul));

console.log(calculator(10, 20, div));

console.log(calculator(10, 20, (a, b) => a + b));

console.log(calculator(10, 20, (a, b) => a - b));

// Promises

function add(a, b) {
  return new Promise((resolve, reject) => {
    if (a < 0 || b < 0) {
      return reject("Negative values not supported");
    }
    resolve(a + b);
  });
}

add(10, 20)
  .then((result) => {
    console.log(result);
  })
  .catch((err) => {
    console.log(err);
  });

// Async Await with Promises

function add(a, b) {
  return new Promise((resolve, reject) => {
    if (a < 0 || b < 0) {
      return reject("Negative values not supported");
    }
    resolve(a + b);
  });
}

async function main() {
  try {
    const result = await add(10, 20);
    console.log(result);
  } catch (err) {
    console.log(err);
  }
}

main();
