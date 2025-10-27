public class mahasiswa {
    private String nama;
    private String nim;
    private Dosen pembimbing;  // Association with Dosen class

    public mahasiswa(String nama, String nim, String pembimbing) {
        this.nama = nama;
        this.nim = nim;
        this.pembimbing = null; // awalnya belum ada pembimbing
    }

    //metode us 2(pencacatan)
    public void setPembimbing(Dosen dosen) {
        this.pembimbing = dosen;
    }

    // metode us 2 (melihat pembimbing)
    public void lihatPembimbing() {
        if (this.pembimbing != null) {
            System.out.println("Pembimbing Mahasiswa " + this.nama + " adalah Dosen " + this.pembimbing.getNama());
        } else {
            System.out.println("Mahasiswa " + this.nama + " belum memiliki pembimbing.");
        }
    }
    //getter
    public String getNama() {
        return this.nama;
    }
}