import java.util.Scanner;

public class TokoDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan total belanja (dalam Rp): ");
        double totalBelanja = scanner.nextDouble();

        System.out.print("Apakah Anda member toko (true/false): ");
        boolean isMember = scanner.nextBoolean();

        double diskon = hitungDiskon(totalBelanja, isMember);

        double jumlahDiskon = totalBelanja * diskon;

        double totalPembayaran = totalBelanja - jumlahDiskon;


        System.out.println("Total belanja: Rp " + totalBelanja);
        System.out.println("Diskon: " + (diskon * 100) + "%");
        System.out.println("Jumlah diskon: Rp " + jumlahDiskon);
        System.out.println("Total pembayaran: Rp " + totalPembayaran);
    }

    public static double hitungDiskon(double totalBelanja, boolean isMember) {
        double diskon = 0.0;
        if (totalBelanja >= 50000) {
            diskon = 0.05;
        }
        if (totalBelanja >= 50000 && isMember) {
            diskon = 0.08;
        }
        if (totalBelanja >= 200000) {
            diskon = 0.10;
        }
        if (totalBelanja >= 200000 && isMember) {
            diskon = 0.15;
        }
        if (totalBelanja < 50000) {
            diskon = 0.01;
        }
        return diskon;
    }
}
