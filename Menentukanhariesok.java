import java.util.Scanner;

class MenentukanHariEsok {
    public static void main(String[] args) {

        // scanner 
        Scanner scannerDay = new Scanner(System.in);
        Scanner scannerDKedepan = new Scanner(System.in);

        // Input
        System.out.print("Pilih hari dengan nomor : ");
        int day = scannerDay.nextInt();
        System.out.print("Berapa hari kedepan : ");
        int DKedepan = scannerDKedepan.nextInt();
        int DayKedepan = (day + DKedepan) % 7;

        // proses
        if (day == 1) {
            System.out.println("Sekarang hari Senin");
            System.out.println("Besok adalah hari Selasa");
        if (DayKedepan == 0)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Minggu");
        if (DayKedepan == 1)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Senin");
        if (DayKedepan == 2)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Selasa");
        if (DayKedepan == 3)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Rabu");
        if (DayKedepan == 4)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Kamis");
        if (DayKedepan == 5)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Jumat");
        if (DayKedepan == 6)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Sabtu");
        }

        if (day == 2) {
            System.out.println("Sekarang hari Selasa");
            System.out.println("Besok adalah hari Rabu");
        if (DayKedepan == 0)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Minggu");
        if (DayKedepan == 1)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Senin");
        if (DayKedepan == 2)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Selasa");
        if (DayKedepan == 3)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Rabu");
        if (DayKedepan == 4)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Kamis");
        if (DayKedepan == 5)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Jumat");
        if (DayKedepan == 6)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Sabtu");
        }
        if (day == 3) {
            System.out.println("Sekarang hari Rabu");
            System.out.println("Besok adalah hari Kamis");
        if (DayKedepan == 0)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Minggu");
        if (DayKedepan == 1)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Senin");
        if (DayKedepan == 2)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Selasa");
        if (DayKedepan == 3)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Rabu");
        if (DayKedepan == 4)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Kamis");
        if (DayKedepan == 5)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Jumat");
        if (DayKedepan == 6)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Sabtu");
        }
        if (day == 4) {
            System.out.println("Sekarang hari Kamis");
            System.out.println("Besok adalah hari Jumat");
        if (DayKedepan == 0)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Minggu");
        if (DayKedepan == 1)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Senin");
        if (DayKedepan == 2)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Selasa");
        if (DayKedepan == 3)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Rabu");
        if (DayKedepan == 4)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Kamis");
        if (DayKedepan == 5)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Jumat");
        if (DayKedepan == 6)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Sabtu");
        }
        if (day == 5) {
            System.out.println("Sekarang hari Jumat");
            System.out.println("Besok adalah hari Sabtu");
        if (DayKedepan == 0)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Minggu");
        if (DayKedepan == 1)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Senin");
        if (DayKedepan == 2)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Selasa");
        if (DayKedepan == 3)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Rabu");
        if (DayKedepan == 4)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Kamis");
        if (DayKedepan == 5)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Jumat");
        if (DayKedepan == 6)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Sabtu");
        }
        if (day == 6) {
            System.out.println("Sekarang hari Sabtu");
            System.out.println("Besok adalah hari Minggu");
        if (DayKedepan == 0)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Minggu");
        if (DayKedepan == 1)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Senin");
        if (DayKedepan == 2)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Selasa");
        if (DayKedepan == 3)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Rabu");
        if (DayKedepan == 4)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Kamis");
        if (DayKedepan == 5)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Jumat");
        if (DayKedepan == 6)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Sabtu");
        }
        if (day == 7) {
            System.out.println("Sekarang hari Minggu");
            System.out.println("Besok adalah hari Senin");
        if (DayKedepan == 0)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Minggu");
        if (DayKedepan == 1)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Senin");
        if (DayKedepan == 2)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Selasa");
        if (DayKedepan == 3)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Rabu");
        if (DayKedepan == 4)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Kamis");
        if (DayKedepan == 5)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Jumat");
        if (DayKedepan == 6)
            System.out.println(DKedepan + " hari selanjutnya yaitu hari Sabtu");
        }
        if (day > 7) {
            System.out.println("Input tidak valid!");
        }
    }
}