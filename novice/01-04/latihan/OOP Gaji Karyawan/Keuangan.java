public class Keuangan extends Pegawai{
    Integer transportasi = 300000;


    public Keuangan(String nama, String nik, String alamat, Integer jabatan) {
        super(nama, nik, alamat, jabatan);
    }
    
    public Integer getTransportasi(){
        return transportasi;
    }

}