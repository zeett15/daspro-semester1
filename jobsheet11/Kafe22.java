public class Kafe22 {

    public static void menu(String namaPelanggan, boolean isMember, String kodePromo){
        int diskon = 0;
        System.out.println("Selamat datang, " + namaPelanggan);
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian");
        }
        if(kodePromo.equalsIgnoreCase("DISKON50")){
            diskon = 50;
            System.out.println("diskon" + diskon + "%");
        }
        else if(kodePromo.equalsIgnoreCase("DISKON30")){
            diskon = 30;
            System.out.println("diskon" + diskon + "%");
        }else{
            System.out.println("Kode promo tidak valid");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappucino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("============================");
        System.out.println("Silahkan pilih menu yang anda inginkan");
    }
    public static void main(String[] args) {
        menu("Andi", false, "diskon50");
    }
}