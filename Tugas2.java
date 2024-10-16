import java.util.Scanner;
public class Tugas2 {

    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        int jenis, durasi, total = 0, totalPenjualan = 0;

        do {
            System.out.print("Masukkan jenis kendaraan (motor = 1, mobil = 2, 0 = keluar): ");
            jenis = input13.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir: ");
                durasi = input13.nextInt();

                if (durasi > 5) {
                    total += 12500;
                    System.out.println("Total yang harus dibayarkan adalah " + total);
                } else {
                    if (jenis == 1) {
                        total += durasi * 3000;
                        System.out.println("Total yang harus dibayarkan adalah " + total);
                    } else if (jenis == 2) {
                        total += durasi * 2000;
                        System.out.println("Total yang harus dibayarkan adalah " + total);
                    }
                }
            } else {
                System.out.println("Silahkan masukkan angka yang benar");
                continue;
            }

            totalPenjualan += total;
           
        } while (jenis != 0);
        System.out.println("Total penjualanper hari adalah Rp." + totalPenjualan);
    }
}