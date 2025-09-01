public class Nilai {
    String nama;
    String npm;
    double absen;
    double tugas;
    double uts;
    double uas;

    public Nilai(String nama, String npm, double absen, double tugas, double uts, double uas){
        this.nama = nama;
        this.npm = npm;
        this.absen = absen;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }

    public double hitungNilaiAkhir(){
        double nilaiAkhir = (0.1 * absen) + (0.2 * tugas) + (0.3 * uts) + (0.4 * uas);
        return nilaiAkhir;
    }

    void tampilkanInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("NPM: " + npm);
        System.out.println("Nilai Absen[10%]: " + absen);
        System.out.println("Nilai Tugas[20%]: " + tugas);
        System.out.println("Nilai UTS[30%]: " + uts);
        System.out.println("Nilai UAS[40%]: " + uas);
        System.out.println("Nilai Akhir: " + hitungNilaiAkhir());
    }

}
