public class demo {
    public static void main(String[] args) {
        Dosen pakBudi = new Dosen("Dr. Budi", "112233"); 
        Mahasiswa ani = new Mahasiswa("Ani", "2024001"); 
        Mahasiswa tono = new Mahasiswa("Tono", "2024002"); 

        System.out.println("=== DEMO SPRINT 1 ==="); 

        System.out.println("\n**Skenario 1: Dosen Menambah Bimbingan**"); 
        pakBudi.tambahMahasiswaBimbingan(ani); 
        pakBudi.tambahMahasiswaBimbingan(tono); 

        System.out.println("\n**Skenario 2: Mahasiswa Mencatat & Melihat Pembimbing**"); 
        ani.setPembimbing(pakBudi); 
        tono.setPembimbing(pakBudi); 

        System.out.println("\n--- HASIL AKHIR ---"); 
        
        pakBudi.lihatDaftarBimbingan(); 
        
        ani.lihatDosenPembimbing(); 
        tono.lihatDosenPembimbing(); 
    }
}