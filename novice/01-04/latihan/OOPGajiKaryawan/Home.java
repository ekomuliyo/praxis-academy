import java.util.Scanner;

public class Home{

    public static void main(String[] args) {
        System.out.println("Selamat Datang");

        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Nama \t\t: ");
        String nama = userInput.next();
        System.out.print("Nik \t\t: ");
        String nik = userInput.next();
        System.out.print("Alamat \t\t: ");
        String alamat = userInput.next();
        System.out.print("Jabatan [1/2/3] : ");
        Integer jabatan = userInput.nextInt();
        
        Pegawai pegawai = new Pegawai(nama, nik, alamat, jabatan);

        pegawai.tampilAwal(pegawai.getNama(), pegawai.getNik(), pegawai.getAlamat(), pegawai.getJabatan());
        System.out.print("Jumlah Hadir \t: ");
        Integer jumlahHadir = userInput.nextInt();
        pegawai.setJumlahHadir(jumlahHadir);

        pegawai.tampilAkhir(jabatan);
    }
}