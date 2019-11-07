// bindings
let caught = 5 * 5

let ten = 10
console.log(ten * ten)

let mood = "light"
console.log(mood)

mood = "dark"
console.log(mood);

let luigisDebt = 140

luigisDebt = luigisDebt - 35
console.log(luigisDebt);

let one = 1, two = 2
console.log(one + two);

var name = "Ayda"
const greeting = "Hello "
console.log(greeting + name)

// functions
prompt("Enter passcode")

// the console.log function
let x = 30
console.log("the value of x is ", x);

// return value
console.log(Math.max(2,4))
console.log(Math.min(2, 4) + 10);

// control flow
let theNumber = Number(prompt("pick a number"))
console.log("Your number is the square root of " + theNumber * theNumber);


// conditional execution
let theNumber1 = Number(prompt("Pick a number"))
if (!Number.isNaN(theNumber1)) {
    console.log("Your number is the square root of " + theNumber1 * theNumber1)
}

if (1 + 1 == 2) console.log("It's true");

let theNumber3 = Number(prompt("Pick a number"));
if (!Number.isNaN(theNumber3)) {
    console.log("Your number is the square root of " + theNumber3 * theNumber3)
}else{
    console.log("Heyy. why didn't you give me a number");
    
}

let num = Number(prompt("Pick a number"))

if (num < 10) {
    console.log("Small");
}else if(num < 100){
    console.log("Medium");
}else{
    console.log("Large");
}


// while and do loops
console.log(0);
console.log(2);
console.log(4);
console.log(6);
console.log(8);
console.log(10);
console.log(12);


let number = 0;
while (number <= 12) {
    console.log(number);
    number = number + 2;
}

let result = 1
let counter = 0
while (counter < 10) {
    result = result * 2
    counter = counter + 1
}

console.log(result);


let yourName
do {
    yourName = prompt("who are you")
} while (!yourName);

console.log(yourName);

// indenting code
if (false != true) {
    console.log("That make sense.")
    if (1 < 2) {
        console.log("No surprise there")
    }
}

// for loops
for (let number = 0; number < 12; number++) {
    console.log(number);
}

let result = 1
for (let counter = 0; counter < 10; counter = counter + 1) {
    result = result * 2
}
console.log(result);

// breaking out of a loop
for (let current = 20; ; current = current + 1) {
    if (current % 7 == 0) {
        console.log(current);
        break
    }
}


let pager = ""
for (let index = 1; index < 7; index++) {
    pager += "#"
    console.log(pager);
}

let pager = " # # # #"
let pager2 = "# # # # "
for (let index = 1; index <= 8; index++) {
    if(index %2 ==0){
        console.log(pager);
    }else{
        console.log(pager2);
    }
}