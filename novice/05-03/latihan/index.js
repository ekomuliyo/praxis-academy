// // try..catch yang hanya berjalan pada error runtime
// try {
//     aaaaa
// } catch (error) {
//     alert("The engine can't undestand this code, it's invalid")
// }

// // try..catch yang berjalan syncrhronously atau berurutan tanpa memblok proses
// setTimeout(function(){
//     try {
//         noSuchVariable
//     } catch (error) {
//         alert("error us caugh here!")
//     }
// }, 1000)

// // melihat object error
// try {
//     lalala
// } catch (error) {
//     alert(error.name) // referenceError
//     alert(error.message) // lalala is not defined
//     alert(error.stack) // referenceError : lalala is not defined at file:///....

//     alert(error) // lalala is not defined
// }

// // mmenggunakan try..catch lebih lanjut

// // contoh benar mengambil data dari JSON
// let json = '{"name":"Joni", "age": 30}'

// let user = JSON.parse(json)

// alert(user.name)
// alert(user.age)

// // jika mengambil data JSON yang salah
// let json = "{ bad json }"

// try {
//     let user = JSON.parse(json)
//     alert(user.name)
// } catch (error) {
//     alert(error.name)
//     alert(error.message)
// }

// // menggunakan throw

// let json = '{"age": 30}'

// try {
//     let user = JSON.parse(json)
//     if (!user.name) {
//         throw new SyntaxError("Incomplete data: no name")
//     }

//     alert(user.name)
// } catch (error) {
//     alert("Json Error: " + error.message)
// }

// menggunakan rethrowing untuk mengecek error lebih dalam

// let json = '{ "age" : 30}'
// try {
//     let user = JSON.parse(json)
//     if (!user.name) {
//         throw new SyntaxError("Incomplete data: no name")
//     }

//     blabla();
// } catch (error) {
//     if (error.name == "SyntaxError") {
//         alert("JSON Error: " + error.message)
//     }else{
//         throw error
//     }
// }

// function readData(){
//     let json = '{ "age": 30}'
//     try {
//         blabla()
//     } catch (error) {
//         if (error.name != 'SyntaxError') {
//             throw error
//         }
//     }
// }
// try {
//     readData()
// } catch (error) {
//     alert("External catch got: " + error)
// }

// try..catch..finally
// try {
//     alert('try')
//     if (confirm('Make an error?')) BAD_CODE()
// } catch (error) {
//     alert('catch')
// } finally {
//     alert('finnaly')
// }

let num = + prompt("Enter a positive integer number ?", 6)

let diff, result;

function fib(n){
    console.log(n + " ");
    if (n < 0 || Math.trunc(n) != n) {
        throw new Error("Must not be negative, and also an integer.")
    }
    return n <= 1 ? n : fib(n -1) + fib(n -2)
}

fib(num)

let start = Date.now();

try {
    result = fib(num)
} catch (error) {
    result = 0
} finally{
    diff = Date.now() - start
}

alert(result || "error Occured")
alert(`execution took ${diff}ms`)

// global catch

window.onerror = function(message, url, line, col, error){
    this.alert(`${message}\n at ${line}:${col} of ${url}`)
}

function readData(){
    badFunc()
}

readData()