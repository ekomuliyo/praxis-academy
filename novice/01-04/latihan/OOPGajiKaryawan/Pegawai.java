public class Pegawai implements Gaji{
    String nama, nik, alamat, namaJabatan;
    Integer jabatan;
    Integer pajak = 2;
    Integer gajiPokok;
    Integer jumlahHadir;

    public Pegawai(String nama, String nik, String alamat, Integer jabatan){
        this.nama = nama;
        this.nik = nik;
        this.alamat = alamat;
        this.jabatan = jabatan;
    }

    public void tampilAwal(String nama, String nik, String alamat, Integer jabatan){

            switch(jabatan){
                case 1:
                    namaJabatan = "Office Boy";
                    break;
                case 2:
                    namaJabatan = "Keuangan";
                    break;
                case 3:
                    namaJabatan = "Direktur";
                    break;
            }

            System.out.println("Nama \t\t: " + nama);
            System.out.println("Nik \t\t: " + nik);
            System.out.println("Alamat \t\t: " + alamat);
            System.out.println("Jabatan \t: " + namaJabatan);
    }

    public void tampilAkhir(Integer jabatan){

        OfficeBoy oBoy = new OfficeBoy(nama, nik, alamat, jabatan);
        Keuangan keuangan = new Keuangan(nama, nik, alamat, jabatan);
        Direktur direktur = new Direktur(nama, nik, alamat, jabatan);

        switch(jabatan){
            case 1:
                gajiPokok = 1500000;
                System.out.println("Gaji Pokok \t: Rp. " + gajiPokok);
                System.out.println("Pajak \t\t: " + pajak +"%");
                System.out.println("Lembur \t\t: Rp. " + oBoy.getLembur());
                System.out.format("Total Terima \t: Rp. %d \n", gajiPokok +  
                            ((getJumlahHadir() % 30) * (gajiPokok / 30)) + oBoy.getLembur() * getJumlahHadir());
                break;
            case 2:
                gajiPokok = 3400000;
                System.out.println("Gaji Pokok \t: Rp. " + gajiPokok);
                System.out.println("Pajak \t\t: " + pajak +"%");
                System.out.println("Transportasi \t: Rp. " + keuangan.getTransportasi());
                System.out.format("Total Terima \t: Rp. %d \n", gajiPokok +  
                            ((getJumlahHadir() % 30) * (gajiPokok / 30)) + keuangan.getTransportasi() * getJumlahHadir());
                break;
            case 3:
                gajiPokok = 8500000;
                System.out.println("Gaji Pokok \t: Rp. " + gajiPokok);
                System.out.println("Pajak \t\t: " + pajak +"%");
                System.out.println("Direktur \t: Rp. " + direktur.getTunjangan());
                System.out.format("Total Terima \t: Rp. %d \n", gajiPokok +  
                            ((getJumlahHadir() % 30) * (gajiPokok / 30)) + direktur.getTunjangan() * getJumlahHadir());
                break;
        }
    }

    public void setJabatan(Integer jabatan){
        this.jabatan = jabatan;
    }

    public Integer getJabatan(){
        return jabatan;
    }

    public void setNamaJabatan(String namaJabatan){
        this.namaJabatan = namaJabatan;
    }

    public String getNamaJabatan(){
        return namaJabatan;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setNik(String nik){
        this.nik = nik;
    }

    public String getNik(){
        return nik;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public String getAlamat(){
        return alamat;
    }

    public Integer getPajak(){
        return pajak;
    }

    public void setJumlahHadir(Integer jumlahHadir){
        this.jumlahHadir = jumlahHadir;
    }

    public Integer getJumlahHadir(){
        return jumlahHadir;
    }

    
}