public class fitur {
    public static void main(String[] args) {
        // set up objek
        Dosen pakBudi = new Dosen("Dr. Budi", "123456");
        Mahasiswa ani = new Mahasiswa("Ani", "A001");
        Mahasiswa tono = new Mahasiswa("tono", "A002");
        
        System.out.println("=== DEMO SPRONT 1 ===");

        //run us 1
        System.out.println("\n**Skenario 1 : Dosen Menambah Bimbingan**");
        pakBudi.tambahMahasiswaBimbingan(ani);
        pakBudi.tambahMahasiswaBimbingan(tono);

        //run us 2
        System.out.println("\n**Skenario 2 : Mahasiswa Mencatat & Melihat Pembimbing**");
        ani.setPembimbing(pakBudi);
        tono.setPembimbing(pakBudi);

        //verif hasil
        System.out.println("\n--- HASIL AKHIR ---");
        pakBudi.lihatDaftarBimbingan();
        ani.lihatDosenPembimbing();
        tono.lihatDosenPembimbing();


    }
}
