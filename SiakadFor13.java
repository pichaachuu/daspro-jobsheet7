import java.util.Scanner;
public class SiakadFor13 {

    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        double nilai, tertinggi = 100, terendah = 0, batasLulus = 60;
        int lulus = 0, tidakLulus = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = input13.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }

            if (nilai > 60) {
                lulus ++;
            } else {
                tidakLulus ++;
            }
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah yang lulus adalah: " + lulus);
        System.out.println("Jumlah yang tidak lulus adalah: " + tidakLulus);


    }
}