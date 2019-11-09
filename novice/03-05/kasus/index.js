let matriksA = [[1,3,5], [5,5,1], [3,4,8]]
let matriksB = [[4,2,1], [5,2,1], [1,2,3]]
let jumlah = [[],[],[]]
for (let index = 0; index < matriksA.length; index++) {
    for(let index2 = 0; index2 < matriksA.length; index2++){
       jumlah[index].push(matriksA[index][index2] + matriksB[index][index2])
    }
}

console.log(matriksA);
console.log(matriksB);
console.log(jumlah);
let kataMap = new Map()
do {
    let kata
    let arti
    var input = prompt(`Masukan pilihan
    1. masukan kata untuk menampilkan arti kata
    2. tambahkan kata
    3. menghapus kata dan artinya
    4. keluar`)
    if (input == 1) {
        kata = prompt("Masukan kata : ")
        alert(kataMap.get(kata))
    }else if(input == 2){
        kata = prompt("Masukan kata : ")
        arti = prompt("Masukan arti : ")
        kataMap.set(kata, arti)
    }else if(input == 3){
        kata = prompt("masukan kata yang ingin dihapus")
        kataMap.delete(kata)
        alert("berhasil dihapus")
    }else{
        input = 4
    }
} while (input != 4);


