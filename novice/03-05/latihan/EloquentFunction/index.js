// Bindings And Scopes
let x = 10
if (true) {
    let y = 20
    var z = 30
    console.log(x + y + z);
    // -> 60
}
console.log(x + z);
// -> 40
const halve = function(n){
    return n/2
}
let n = 10
console.log(halve(100));
// -> 50
console.log(n);
// -> 10

nested scope
const hummus = function(factor){
    const ingredient = function(amount, unit, name){
        let ingredientAmount = amount * factor
        if(ingredientAmount > 1){
            unit += "s"
        }
        console.log(`${ingredientAmount} ${unit} ${name}`);
    }
    ingredient(1, "can", "chickpeas")
    ingredient(0.25, "cup", "tahini");
    ingredient(0.25, "cup", "lemon juice");
    ingredient(1, "clove", "garlic");
    ingredient(2, "tablespoon", "olive oil");
    ingredient(0.5, "teaspoon", "cumin");
}

hummus(10)

function as values
function repeat(n, action){
    for (let index = 0; index < n; index++) {
        action(index)
    }
}

repeat(3, console.log)

declaration notation
function square(x){
    return x * x
}

arrow functions
const power = (base, exponent) => {
    let result = 1
    for (let count = 0; count < exponent; count++) {
        result *= base
    }
    return result
}

 console.log(power(12,3));

 const square1 = (x) => {return x * x}
 const square2 = x => x * x

 const horn = () => {
     console.log("Hai");
 }

function power(base, exponent = 2) {
    let result = 1;
    for (let count = 0; count < exponent; count++) {
      result *= base;
    }
    return result;
}
console.log(power(4));
console.log(power(2,6));

function power(base, exponent){
    if (exponent == 0) {
        return 1
    }else{
        return base * power(base, exponent -1)
    }
}

console.log(power(2,3));

function findSolution(target){
    function find(current, history){
        if (current == target) {
            return history
        }else if(current > target){
            return null
        }else{
            return find(current + 5, `(${history} + 5)`) || 
            find(current * 3, `(${history} * 3)`)
        }
    }
    return find(1, "1")
}

console.log(findSolution(24));

Growing functions
function printFarmInventory(cows, chickens){
    let cowString = String(cows)
    while (cowString.length < 3) {
        cowString = "0" + cowString
    }
    console.log(`${cowString} Cows`);
    let chickenString = String(chickens)
    while (chickenString.length < 3) {
        chickenString = "0" + chickenString
    }
    console.log(`${chickenString} Chickens`);
}

printFarmInventory(17,11)

function min(a, b){
    if (a < b) {
        return console.log(a);
    }else{
        return console.log(b);
    }
}

function isEven(x){
    if (x % 2 == 0) {
        return true
    }else if (x % 2 == 1){
        return false
    }else{
        return "??"
    }
}

console.log(isEven(-1));

function countBs(x){
    let count = 0
    for (let index = 0; index < x.length; index++) {
        if (x[index] == "B") {
            count++
        }
    }
    return count
}

console.log(countBs("BBBS"));

function countChar(x, y){
    let a = 0
    for (let index = 0; index < x.length; index++) {
        if (x[index] == y) {
            a++
        }
    }
    return a
}

console.log(countChar("kakkerlak", "k"));





