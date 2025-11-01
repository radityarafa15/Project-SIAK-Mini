public class mahasiswa {
    private String nama;
    private String nim;
    private Dosen pembimbing;  

    public mahasiswa(String nama, String nim, String pembimbing) {
        this.nama = nama;
        this.nim = nim;
        this.pembimbing = null; 
    }

    public void setPembimbing(Dosen dosen) {
        this.pembimbing = dosen;
    }

    public void lihatPembimbing() {
        if (this.pembimbing != null) {
            System.out.println("Pembimbing Mahasiswa " + this.nama + " adalah Dosen " + this.pembimbing.getNama());
        } else {
            System.out.println("Mahasiswa " + this.nama + " belum memiliki pembimbing.");
        }
    }
    public String getNama() {
        return this.nama;
    }

}

