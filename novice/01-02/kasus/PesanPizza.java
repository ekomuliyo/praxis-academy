/**
 * @author Eko Muliyo 
 */

public class PesanPizza{
    public static void main(String[] args) {
        Pembeli pembeli = new Pembeli("Andi", 19);
        pembeli.cetak();
    }
}


class Pembeli{
    String namaPembeli;
    int umur;

    public Pembeli(String n, int u){
        this.namaPembeli = n;
        this.umur = u;
    }

    Pizza pizza = new Pizza("Neapolitan", "Margherita", 200000);

    public void cetak(){
        System.out.println("------Terima Kasih telah Berbelanja------");
        System.out.println("Rincian Belanja : ");
        System.out.println("Nama\t\t : " + namaPembeli + "\nUmur\t\t : " + umur);
        System.out.println("Nama Pizza\t : " + pizza.namaPizza + "\nJenis Pizza\t : " + pizza.jenisPizza + "\nHarga\t\t : " + pizza.harga);
    }
}


class Pizza{
    String namaPizza, jenisPizza;
    int harga;

    public Pizza(String n, String j, int h){
        this.namaPizza = n;
        this.jenisPizza = j;
        this.harga = h;
    }
}