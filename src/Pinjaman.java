import java.util.Locale;
import java.text.NumberFormat;
import java.util.Scanner;

public class Pinjaman {
    private static final double bungaPersen = 0.025;
    private static String nama;
    private static String noKTP;
    private static Scanner SCANNER;
    public static void main(String[] args) throws Exception {
        SCANNER = new Scanner(System.in);

        Locale locale = new Locale("id", "ID");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);

        System.out.println("------------------------------------------------------");
        System.out.println("---------- WELCOME TO THE SOLUTION OF MONEY ----------");
        System.out.println("======================================================");
        System.out.println();
        System.out.println("Silakan Pilih Paket Pinjaman: ");
        System.out.println("1. PAKET KARUNG ");
        System.out.println("2. PAKET PAPER BAG");
        System.out.println();
        System.out.print("Masukkan Pilihan Paket : " + "\t");
        int pilih = SCANNER.nextInt();
        if (pilih == 1) {
            Karung Karung1 = new Karung(1, "XL", 100000000, (bungaPersen * 100000000));
            Karung Karung2 = new Karung(2, "L", 75000000, (bungaPersen * 75000000));
            Karung Karung3 = new Karung(3, "M", 50000000, (bungaPersen * 50000000));
            
            System.out.println("======================================================");
            System.out.println("--------------Silakan Masukkan Data Anda--------------"); 
            System.out.println("======================================================");
            System.out.print("Masukkan Nama Anda    : " + "\t");
            nama = SCANNER.next();
            System.out.print("Masukkan No.KTP Anda  : " + "\t");
            noKTP = SCANNER.next();
    
            System.out.println("======================================================");
            System.out.println("=================Pilih Ukuran Karung==================");
            System.out.println("======================================================");
            System.out.println();

            System.out.println(Karung1.toString());
            System.out.println(Karung2.toString());
            System.out.println(Karung3.toString());

            System.out.print("Masukkan Pilihan Paket            : " + "\t");
            int pilih2 = SCANNER.nextInt();
            if (pilih2 == 1) {
                System.out.print("Berapa Lama Pinjam (bulan)        : " + "\t");
                int bulan = SCANNER.nextInt();
                Karung1.setDurasiPinjam(bulan);
                System.out.println("Anda Memilih Paket          : " + "\t" + Karung1.getUkuranKarung());
                System.out.println("Dengan Harga Pinjam         : " + "\t" + numberFormat.format(Karung1.getHarga()));
                System.out.println("Dengan Bunga Pinjam         : " + "\t" + numberFormat.format(Karung1.getNilaiBunga()));
                System.out.println();
                System.out.println("======================================================");
                System.out.println("-------------TOTAL KEWAJIBAN PINJAMAN-----------------");
                System.out.println("Nama Peminjam       : " + "\t" + nama);
                System.out.println("Kewajiban Bulanan   : " + "\t" + numberFormat.format(Karung1.getKewajibanBunga()));
                System.out.println("Total Pinjaman      : " + "\t" + numberFormat.format(Karung1.getTotalPinjaman()));
            }
            else if (pilih2 == 2) {
                System.out.print("Berapa Lama Pinjam (bulan)        : " + "\t");
                int bulan = SCANNER.nextInt();
                Karung2.setDurasiPinjam(bulan);
                System.out.println("Anda Memilih Paket          : " + "\t" + Karung2.getUkuranKarung());
                System.out.println("Dengan Harga Pinjam         : " + "\t" + numberFormat.format(Karung2.getHarga()));
                System.out.println("Dengan Bunga Pinjam         : " + "\t" + numberFormat.format(Karung2.getNilaiBunga()));
                System.out.println();
                System.out.println("======================================================");
                System.out.println("-------------TOTAL KEWAJIBAN PINJAMAN-----------------");
                System.out.println("Nama Peminjam       : " + "\t" + nama);
                System.out.println("Kewajiban Bulanan   : " + "\t" + numberFormat.format(Karung2.getKewajibanBunga()));
                System.out.println("Total Pinjaman      : " + "\t" + numberFormat.format(Karung2.getTotalPinjaman()));
            }
            else if (pilih2 == 3) {
                System.out.print("Berapa Lama Pinjam (bulan)        : " + "\t");
                int bulan = SCANNER.nextInt();
                Karung3.setDurasiPinjam(bulan);
                System.out.println("Anda Memilih Paket          : " + "\t" + Karung3.getUkuranKarung());
                System.out.println("Dengan Harga Pinjam         : " + "\t" + numberFormat.format(Karung3.getHarga()));
                System.out.println("Dengan Bunga Pinjam         : " + "\t" + numberFormat.format(Karung3.getNilaiBunga()));
                System.out.println();
                System.out.println("======================================================");
                System.out.println("-------------TOTAL KEWAJIBAN PINJAMAN-----------------");
                System.out.println("Nama Peminjam       : " + "\t" + nama);
                System.out.println("Kewajiban Bulanan   : " + "\t" + numberFormat.format(Karung3.getKewajibanBunga()));
                System.out.println("Total Pinjaman      : " + "\t" + numberFormat.format(Karung3.getTotalPinjaman()));
            }
            else System.out.println("Invalid Input");
        }
        else if (pilih == 2) {
            PaperBag PaperBag1 = new PaperBag(1, "XL", 30000000, (bungaPersen * 30000000));
            PaperBag PaperBag2 = new PaperBag(2, "L", 20000000, (bungaPersen * 20000000));
            PaperBag PaperBag3 = new PaperBag(3, "M", 10000000, (bungaPersen * 10000000));
            
            System.out.println("======================================================");
            System.out.println("--------------Silakan Masukkan Data Anda--------------"); 
            System.out.println("======================================================");
            System.out.print("Masukkan Nama Anda    : " + "\t");
            nama = SCANNER.next();
            System.out.print("Masukkan No.KTP Anda  : " + "\t");
            noKTP = SCANNER.next();
    
            System.out.println("======================================================");
            System.out.println("=================Pilih Ukuran Karung==================");
            System.out.println("======================================================");
            System.out.println();

            System.out.println(PaperBag1.toString());
            System.out.println(PaperBag2.toString());
            System.out.println(PaperBag3.toString());

            System.out.print("Masukkan Pilihan Paket            : " + "\t");
            int pilih2 = SCANNER.nextInt();
            if (pilih2 == 1) {
                System.out.print("Berapa Lama Pinjam (bulan)        : " + "\t");
                int bulan = SCANNER.nextInt();
                PaperBag1.setDurasiPinjam(bulan);
                System.out.println("Anda Memilih Paket          : " + "\t" + PaperBag1.getUkuranKarung());
                System.out.println("Dengan Harga Pinjam         : " + "\t" + numberFormat.format(PaperBag1.getHarga()));
                System.out.println("Dengan Bunga Pinjam         : " + "\t" + numberFormat.format(PaperBag1.getNilaiBunga()));
                System.out.println();
                System.out.println("======================================================");
                System.out.println("-------------TOTAL KEWAJIBAN PINJAMAN-----------------");
                System.out.println("Nama Peminjam       : " + "\t" + nama);
                System.out.println("Kewajiban Bulanan   : " + "\t" + numberFormat.format(PaperBag1.getKewajibanBunga()));
                System.out.println("Total Pinjaman      : " + "\t" + numberFormat.format(PaperBag1.getTotalPinjaman()));
            }
            else if (pilih2 == 2) {
                System.out.print("Berapa Lama Pinjam (bulan)        : " + "\t");
                int bulan = SCANNER.nextInt();
                PaperBag2.setDurasiPinjam(bulan);
                System.out.println("Anda Memilih Paket          : " + "\t" + PaperBag2.getUkuranKarung());
                System.out.println("Dengan Harga Pinjam         : " + "\t" + numberFormat.format(PaperBag2.getHarga()));
                System.out.println("Dengan Bunga Pinjam         : " + "\t" + numberFormat.format(PaperBag2.getNilaiBunga()));
                System.out.println();
                System.out.println("======================================================");
                System.out.println("-------------TOTAL KEWAJIBAN PINJAMAN-----------------");
                System.out.println("Nama Peminjam       : " + "\t" + nama);
                System.out.println("Kewajiban Bulanan   : " + "\t" + numberFormat.format(PaperBag2.getKewajibanBunga()));
                System.out.println("Total Pinjaman      : " + "\t" + numberFormat.format(PaperBag2.getTotalPinjaman()));
            }
            else if (pilih2 == 3) {
                System.out.print("Berapa Lama Pinjam (bulan)        : " + "\t");
                int bulan = SCANNER.nextInt();
                PaperBag3.setDurasiPinjam(bulan);
                System.out.println("Anda Memilih Paket          : " + "\t" + PaperBag3.getUkuranKarung());
                System.out.println("Dengan Harga Pinjam         : " + "\t" + numberFormat.format(PaperBag3.getHarga()));
                System.out.println("Dengan Bunga Pinjam         : " + "\t" + numberFormat.format(PaperBag3.getNilaiBunga()));
                System.out.println();
                System.out.println("======================================================");
                System.out.println("-------------TOTAL KEWAJIBAN PINJAMAN-----------------");
                System.out.println("Nama Peminjam       : " + "\t" + nama);
                System.out.println("Kewajiban Bulanan   : " + "\t" + numberFormat.format(PaperBag3.getKewajibanBunga()));
                System.out.println("Total Pinjaman      : " + "\t" + numberFormat.format(PaperBag3.getTotalPinjaman()));
            }
            else System.out.println("Invalid Input");
        }
        else System.out.println("Invalid Input");
    }
}
