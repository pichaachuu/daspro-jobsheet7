import java.util.Scanner;
public class KafeDoWhile13 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        int kopi, teh, roti;
        String namaPelanggan;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar):");
            namaPelanggan = input13.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = input13.nextInt();
            System.out.print("Jumlah teh: ");
            teh = input13.nextInt();
            System.out.print("Jumlah roti: ");
            roti = input13.nextInt();

            int totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            input13.nextLine();
        } while (true);

        System.out.println("Semua transaksi selesai");
    }
}
