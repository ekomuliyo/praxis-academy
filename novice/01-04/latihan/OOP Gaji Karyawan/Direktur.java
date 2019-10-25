public class Direktur extends Pegawai{

    Integer tunjangan = 15000000;

    public Direktur(String nama, String nik, String alamat, Integer jabatan) {
        super(nama, nik, alamat, jabatan);
    }

    public Integer getTunjangan(){
        return tunjangan;
    }

}