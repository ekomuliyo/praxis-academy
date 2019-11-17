function Animal(name){
    this.name = name
}

Animal.prototype.getName = function(){
    return 'Animal name is => ' + this.name 
}

Animal.prototype.generation = '100'

var a = new Animal('Dog');

console.log('Animal.prototype ==> ', Animal.prototype);
console.log('a.__proto__ ==> ', a.__proto__);
console.log('Animal.prototype === a.proto__', Animal.prototype === a.__proto__);
console.log('a ==> ', a);
console.log('a.getName() ==> ', a.getName());
console.log('a.generation ==> ', a.generation);

function Animal(className){
    this.className = className
}

Animal.prototype.getClass = function(){
    return 'Animal class is : ' + this.className
}

function Dog(name){
    Animal.call(this, 'Animal')
    this.name = name
}

Dog.prototype = Object.create(Animal.prototype)

Dog.prototype.constructor = Dog

Dog.prototype.getName = function(){
    return this.name
}

var d = new Dog("tomy");

console.log(d);
console.log(d.__proto__);
console.log(d.getClass());


// Class OOP
class User{
    constructor(name){
        this.name = name
    }

    sayHi(){
        alert(this.name)
    }
}

let user = new User("Joni")
user.sayHi()

class User {
    constructor(name){
        this.name = name
    }
    sayHi(){ alert(this.name) }
}
alert(typeof User)

alert(User == User.prototype.constructor)

alert(User.prototype.sayHi)

alert(Object.getOwnPropertyNames(User.prototype))

// definisikan class dengan function karna pada dasarnya sama
function User(name){
    this.name = name
}

User.prototype.sayHi = function(){
    alert(this.name)
}

let user = new User("Andi")
user.sayHi()

class User{
    constructor(){}
}

alert(typeof User)
User() // memanggil class harus menggunakan 'new'

class User{
    constructor(){}
}
alert(User)

// class expression
let User = class {
    sayHi(){
        alert("hello")
    }
}
new User().sayHi()

function makeClass(phrase){
    return class{
        sayHi(){
            alert(phrase)
        }
    }
}
let User = makeClass("Hello")
new User().sayHi()

// Setters / Setters

class User {
    constructor(name){
        this.name = name
    }

    get name(){
        return this._name
    }

    set name(value){
        if (value.length < 4) {
            alert("Name is too shor.")
        }
        this._name = value
    }
}

let user = new User("Joni") // ketika nilai nya dimasukan, dia otomatis memanggil method set
alert(user.name) // dan ketika memanggil property nya di otomatis memanggil get

user = new User("") 

Object.defineProperties(User.prototype, {
    name: {
        get() {
            return this._name
        },
        set(name){
            // name = this._name
        }
    }
})

class User{
    ['say' + 'Hi'](){
        alert("hello")
    }
}

new User().sayHi()

// class properties
class User{
    name = "Anonumous"

    sayHi(){
        alert(`Hello ${this.name}`)
    }
}

new User().sayHi()
alert(User.prototype.sayHi)
alert(User.prototype.name)

class MyClass{
    prop = value // property

    constructor(...){} // constructor

    method(...){} // method

    get something(...) {}
    set something(...) {}

    [Symbol.iterator](){}
}