import java.util.Scanner;

public class BangunDatar {
    public static void main(String[] args) {
        // final double pi artinya kita membuat konstanta tetap PI dengan tipe data double
        final double pi = 3.14;
      
        Scanner scanner = new Scanner(System.in);
        String bangunDatar = scanner.nextLine(); // Gunakan nextLine() untuk memberi spasi dengan output dari switch case

        switch (bangunDatar) {
            // Kita gunakan dua bentuk case huruf besar dan kecil untuk menghindari Java Case sensitive error
            case "Persegi":
            case "persegi":
                int sisi = scanner.nextInt();
                int luasPersegi = sisi * sisi;
                int kelilingPersegi = 4 * sisi;

                // Gunakan print(), jadi gak langsung nge-enter (bikin line baru) ke bawah
                System.out.print(luasPersegi + " " + kelilingPersegi);
                break;

            case "PersegiPanjang":
            case "persegipanjang":
                int panjang = scanner.nextInt();
                int lebar = scanner.nextInt();
                int luasPersegiPanjang = panjang * lebar;
                int kelilingPersegiPanjang = 2 * (panjang + lebar);

                System.out.print(luasPersegiPanjang + " " + kelilingPersegiPanjang);
                break;

            case "Segitiga":
            case "segitiga":
                int alas = scanner.nextInt();
                int tinggi = scanner.nextInt();
                // Kita gunakan (int), atau casting, untuk mengubah hasil Math.sqrt() dari double ke integer
                // dan ini rumus pythagoras yaaa, jadi emang gini bentuknya jangan dibikin pusing :)
                int sisiMiring = (int) Math.sqrt((alas * alas + tinggi * tinggi));
                // Di luas, alas dan tinggi harus diberikan ( ) karena kalau tidak diberikan, tinggi / 2 akan dikerjakan pertama
                int luasSegitiga = (alas * tinggi) / 2;
                int kelilingSegitiga = alas + tinggi + sisiMiring;

                System.out.print(luasSegitiga + " " + kelilingSegitiga);
                break;

            case "Lingkaran":
            case "lingkaran":
                int diameter = scanner.nextInt();
                // Di luas, diameter harus diberikan ( ) karena kalau tidak diberikan, diameter / 4 akan dikerjakan pertama
                double luasLingkaran = (pi * diameter * diameter) / 4;
                double kelilingLingkaran = pi * diameter;

                System.out.print(luasLingkaran + " " + kelilingLingkaran);
                break;
        }
    }
}