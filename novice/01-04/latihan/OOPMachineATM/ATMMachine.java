import java.util.Scanner;
import java.io.*;


public class ATMMachine{

    public static void depositMoney(){
        System.out.println("\tJumlah deposit kamu adalah senilai : " + Deposit.getDeposit());
    }

    public static void withdrawMoney(){
        if (BalanceInquiry.balance == 0) {
            System.out.println("\n\tSaldo anda saat ini kosong.");
            System.out.println("\tKamu tidak bisa melakukan penarikan");
            System.out.println("\tSilahkan lakukan deposit terlebih dahulu");
        }
        else if(BalanceInquiry.balance <=500){
            System.out.println("\tSaldo anda tidak cukup untuk melakukan penarikan");
            System.out.println("\tSilahkan periksa saldo anda untuk melihat jumlah uang anda");
        }
        else if(Withdraw.withdraw > BalanceInquiry.balance){
            System.out.println("\tJumlah uang yang ingin anda tarik tidak cukup");
            System.out.println("\tPastikan saldo anda mencukupi");
        }
        else{
            BalanceInquiry.balance = BalanceInquiry.balance - Withdraw.withdraw;
            System.out.println("\n\tJumlah penarikan anda adalah : "+ Withdraw.withdraw);
        }
    }

    public static void checkBalance(){
        System.out.println("\tSaldo anda saat ini adalah : "+ BalanceInquiry.getBalance());
    }

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        int select = 0;
        int choice = 0;

        System.out.println("=================================================");
        System.out.println("\tSelamat Datang di Mesin ATM Sederhana");
        System.out.println("=================================================");
        System.out.println();

        do{
            try {
                do {
                 System.out.println("\n\tSilahkan pilih transaksi ATM");
                 System.out.println("\tPilih [1] Deposit");
                 System.out.println("\tPilih [2] Tarik Tunai");
                 System.out.println("\tPilih [3] Informasi Saldo");
                 System.out.println("\tPilih [4] Keluar");
                 
                 System.out.print("\n\tAnda mau pilih yang mana ? : ");
                 select = read.nextInt();

                 if (select > 4) {
                     System.out.println("\n\tSilahkan masukan pilihan yang benar!!");
                 }else{
                     switch (select) {
                         case 1:
                             System.out.print("\n\tMasukan jumlah uang yang ingin di deposit : ");
                             Deposit.deposit = read.nextDouble();
                             BalanceInquiry.balance = Deposit.deposit + BalanceInquiry.balance;
                             depositMoney();
                             break;
                         case 2:
                             System.out.println("\n\tUntuk melakukan penarikan, pastikan saldo anda mencukupi.");
                             System.out.print("\tMasukan jumlah uang yang ingin ditarik : ");
                             Withdraw.withdraw = read.nextDouble();
                             withdrawMoney();
                             break;
                         case 3:
                             checkBalance();
                             break;
                         default:
                             System.out.println("\n\tTransaksi telah selesai");
                             break;
                     }
                 }
                } while (select > 4);

                do {
                    try {
                        System.out.println("\n\tIngin melakukan transaksi lagi?");
                        System.out.println("\n\tPilih [1] Ya \n\tPilih [2] Tidak");
                        System.out.print("\tMasukan pilihan : ");
                        choice = read.nextInt();

                        if (choice > 2) {
                            System.out.print("Silahkan pilih yang benar");
                        }
                    } catch (Exception e) {
                        System.out.println("\tSalah masukan! silahkan hanya memasukan angka");
                        read = new Scanner(System.in);
                        System.out.print("\tMasukan pilihan : ");
                        choice = read.nextInt();
                    }
                } while (choice > 2);
            } catch (Exception e) {
                System.out.println("\tSalah masukan! silahkan hanya memasukan angka");
                read = new Scanner(System.in);
                System.out.print("\tMasukan pilihan : ");
                select = read.nextInt();
            }
        } while (choice<=1); 
        
        System.out.println("Terima kasih telah menggunakan ATM sederhana");
        
    }
}