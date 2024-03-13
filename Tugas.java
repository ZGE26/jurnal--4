import java.util.Comparator;

public class Tugas {

    private String matkul;
    private String tugas;
    private String tanggal;

    public Tugas(String matkul, String tugas, String tanggal) {
        this.matkul = matkul;
        this.tugas = tugas;
        this.tanggal = tanggal;
    }

    public String getMatkul() {
        return matkul;
    }

    public String getTugas() {
        return tugas;
    }

    public String getTanggal() {
        return tanggal;
    }

    @Override
    public String toString() {
        return "Tugas matkul :" + matkul + ", tugas : " + tugas + ", tanggal : " + tanggal;
    }

    public static Comparator<Tugas> tanggalComparator = new Comparator<Tugas>() {
        @Override
        public int compare(Tugas tugas1, Tugas tugas2) {
            // Menggunakan metode compareTo untuk membandingkan tanggal
            return tugas1.getTanggal().compareTo(tugas2.getTanggal());
        }
    };
}