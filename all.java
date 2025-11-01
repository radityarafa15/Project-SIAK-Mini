import java.util.ArrayList;
import java.util.List;

public class all {
    public static void main(String[] args) {
      
        Dosen pakBudi = new Dosen("Dr. Budi", "123456");
        Mahasiswa ani = new Mahasiswa("Ani", "A001");
        Mahasiswa tono = new Mahasiswa("tono", "A002");
        
        System.out.println("=== DEMO SPRONT 1 ===");

        System.out.println("\n**Skenario 1 : Dosen Menambah Bimbingan**");
        pakBudi.tambahMahasiswaBimbingan(ani);
        pakBudi.tambahMahasiswaBimbingan(tono);
        
        System.out.println("\n**Skenario 2 : Mahasiswa Mencatat & Melihat Pembimbing**");
        ani.setPembimbing(pakBudi);
        tono.setPembimbing(pakBudi);

        System.out.println("\n--- HASIL AKHIR ---");
        pakBudi.lihatDaftarBimbingan();
        ani.lihatDosenPembimbing();
        tono.lihatDosenPembimbing();
    }
}


class Dosen {
    private String nama;
    private String nip;
    private List<Mahasiswa> daftarBimbingan; // Atribut untuk menyimpan daftar Mahasiswa

    public Dosen(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
        this.daftarBimbingan = new ArrayList<>(); 
    }

    public void tambahMahasiswaBimbingan(Mahasiswa mhs) {
        if (!daftarBimbingan.contains(mhs)) {
            daftarBimbingan.add(mhs);
            System.out.println("Dosen " + this.nama + " berhasil menambahkan " + mhs.getNama() + " ke daftar bimbingan.");
        } else {
            System.out.println("Dosen " + this.nama + " : " + mhs.getNama() + " sudah ada di daftar bimbingan.");
        }
    }

    public void lihatDaftarBimbingan() {
        System.out.println("Daftar Mahasiswa Bimbingan " + this.nama + " :");
        if (daftarBimbingan.isEmpty()) {
            System.out.println("- Tidak ada mahasiswa bimbingan.");
        } else {
            for (Mahasiswa mhs : daftarBimbingan) {
                System.out.println("- " + mhs.getNama() + " (" + mhs.getNim() + ")");
            }
        }
    }

    public String getNama() {
        return nama;
    }
}

class Mahasiswa {
    private String nama;
    private String nim;
    private Dosen pembimbing; 

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
        this.pembimbing = null; 
    }

    public void setPembimbing(Dosen dosen) {
        this.pembimbing = dosen;
        System.out.println("Mahasiswa " + this.nama + " (" + this.nim + ") mencatat pembimbingnya: " + dosen.getNama());
    }

    public void lihatDosenPembimbing() {
        if (this.pembimbing != null) {
            System.out.println("Mahasiswa " + this.nama + " memiliki Dosen Pembimbing: " + this.pembimbing.getNama());
        } else {
            System.out.println("Mahasiswa " + this.nama + " belum memiliki Dosen Pembimbing.");
        }
    }

    public String getNama() {
        return nama;
    }
    
    public String getNim() {
        return nim;
    }

}
