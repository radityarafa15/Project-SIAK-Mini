import java.util.ArrayList;
import java.util.List;

public class dosen {
    private String nama;
    private String nidn;
    private List<Mahasiswa> mahasiswaBimbingan;
    public dosen(String namal, String nidn){
        this.nama = namal;
        this.nidn = nidn;
        this.mahasiswaBimbingan = new ArrayList<>();
    }

    //method US 1
    public void tambahMahasiswaBimbingan(Mahasiswa mhs){
        this.mahasiswaBimbingan.add(mhs);
        System.out.println("INFO: Mahasiswa " + mhs.getNama() + " berhasil ditambahkan ke bimbingan dosen " + this.nama);
    }

    //method US 2
    public void lihatDaftarBimbingan(){
        System.out.println("Daftar Mahasiswa Bimbingan Dosen " + this.nama + " ---");
        for(Mahasiswa mhs : this.mahasiswaBimbingan){
            System.out.println("- " + mhs.getNama() + " (" + mhs.getNim() + ")");
        }
    }
        //getter
    public String getNama() {
        return this.nama;
}
    public String getNim() {
        return this.nidn;
    }
}