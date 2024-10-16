import java.util.Scanner;
public class Tugas1 {

    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        int tiket, totalTiket = 0;
        double hargaTiket = 50000, totalPenjualan = 0, hargaAfterDiskon;

        do {
           System.out.print("Berapa jumlah tiket yang dibeli?('0' untuk keluar ): ");
           tiket = input13.nextInt();
           
           if (tiket > 10) {
            hargaAfterDiskon = hargaTiket * 0.85 * tiket;
            System.out.println("Total yang harus dibayarkan adalah " + hargaAfterDiskon);
           } else if (tiket > 4) {
            hargaAfterDiskon = hargaTiket * 0.90 * tiket;
            System.out.println("Total yang harus dibayar adalah " + hargaAfterDiskon);
           } else if (tiket > 0) {
            hargaAfterDiskon = hargaTiket * tiket;
            System.out.println("Total yang harus dibayarkan adalah " + hargaAfterDiskon);
           } else {
            System.out.println("Mohon masukkan angka yang valid");
            continue;
           }
           
           totalTiket += tiket;
           totalPenjualan += hargaAfterDiskon;

           
        } while (tiket != 0);

        System.out.println("Total penjualan tiket: " + totalTiket);
        System.out.println("Total pendapatan penjualan: " + totalPenjualan);
    }
}