public class PengunjungCave22 {
    public static void daftarPengunjung(String... namaPengunjung) {
        for (String x : namaPengunjung) {
            System.out.println("- "+x);
        }
    }
    public static void main(String[] args) {
        daftarPengunjung("ali", "budi", "citra");
        daftarPengunjung("rahmat", "siti", "agus");
        
    }
        
}
