public class OfficeBoy extends Pegawai{

    public OfficeBoy(String nama, String nik, String alamat, Integer jabatan) {
        super(nama, nik, alamat, jabatan);
    }

    Integer lembur = 10000;

    public Integer getLembur(){
        return lembur;
    }

}