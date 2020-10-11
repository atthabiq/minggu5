import java.util.Scanner;

class MenentukanHariEsok {
    public static void main(String[] args) {

        // scanner 
        Scanner scannerDay = new Scanner(System.in);
        Scanner scannerDKedepan = new Scanner(System.in);

        // Input
        System.out.print("select days with numbers : ");
        int day = scannerDay.nextInt();
        System.out.print("N days : ");
        int DKedepan = scannerDKedepan.nextInt();
        int DayKedepan = (day + DKedepan) % 7;

        // proses
        if (day == 1) {
            System.out.println("Today is Lundi");
            System.out.println("Tomorrow is Mardi");
        if (DayKedepan == 0)
            System.out.println(DKedepan + " Tomorrow is Semaine");
        if (DayKedepan == 1)
            System.out.println(DKedepan + " Tomorrow is Lundi");
        if (DayKedepan == 2)
            System.out.println(DKedepan + " Tomorrow is Mardi");
        if (DayKedepan == 3)
            System.out.println(DKedepan + " Tomorrow is Mercredi");
        if (DayKedepan == 4)
            System.out.println(DKedepan + " Tomorrow is Jeudi");
        if (DayKedepan == 5)
            System.out.println(DKedepan + " Tomorrow is Vendredi");
        if (DayKedepan == 6)
            System.out.println(DKedepan + " Tomorrow is Samedi");
        }

        if (day == 2) {
            System.out.println("today is Mardi");
            System.out.println("Tomorrow is Mercredi");
        if (DayKedepan == 0)
            System.out.println(DKedepan + " Tomorrow is Semaine");
        if (DayKedepan == 1)
            System.out.println(DKedepan + " Tomorrow is Lundi");
        if (DayKedepan == 2)
            System.out.println(DKedepan + " Tomorrow is Mardi");
        if (DayKedepan == 3)
            System.out.println(DKedepan + " Tomorrow is Mercredi");
        if (DayKedepan == 4)
            System.out.println(DKedepan + " Tomorrow is Jeudi");
        if (DayKedepan == 5)
            System.out.println(DKedepan + " Tomorrow is Vendredi");
        if (DayKedepan == 6)
            System.out.println(DKedepan + " Tomorrow is Samedi");
        }
        if (day == 3) {
            System.out.println("today is Mercredi");
            System.out.println("tomorrow is Jeudi");
        if (DayKedepan == 0)
            System.out.println(DKedepan + " Tomorrow is Semaine");
        if (DayKedepan == 1)
            System.out.println(DKedepan + " Tomorrow is Lundi");
        if (DayKedepan == 2)
            System.out.println(DKedepan + " Tomorrow is Mardi");
        if (DayKedepan == 3)
            System.out.println(DKedepan + " Tomorrow is Mercredi");
        if (DayKedepan == 4)
            System.out.println(DKedepan + " Tomorrow is Jeudi");
        if (DayKedepan == 5)
            System.out.println(DKedepan + " Tomorrow is Vendredi");
        if (DayKedepan == 6)
            System.out.println(DKedepan + " Tomorrow is Samedi");
        }
        if (day == 4) {
            System.out.println("today is Jeudi");
            System.out.println("tomorrow is Venderedi");
        if (DayKedepan == 0)
            System.out.println(DKedepan + " Tomorrow is Semaine");
        if (DayKedepan == 1)
            System.out.println(DKedepan + " Tomorrow is Lundi");
        if (DayKedepan == 2)
            System.out.println(DKedepan + " Tomorrow is Mardi");
        if (DayKedepan == 3)
            System.out.println(DKedepan + " Tomorrow is Mercredi");
        if (DayKedepan == 4)
            System.out.println(DKedepan + " Tomorrow is Jeudi");
        if (DayKedepan == 5)
            System.out.println(DKedepan + " Tomorrow is Vendredi");
        if (DayKedepan == 6)
            System.out.println(DKedepan + " Tomorrow is Samedi");
        }
        if (day == 5) {
            System.out.println("today is Verdredi");
            System.out.println("tomorrow is samedi");
        if (DayKedepan == 0)
            System.out.println(DKedepan + " Tomorrow is Semaine");
        if (DayKedepan == 1)
            System.out.println(DKedepan + " Tomorrow is Lundi");
        if (DayKedepan == 2)
            System.out.println(DKedepan + " Tomorrow is Mardi");
        if (DayKedepan == 3)
            System.out.println(DKedepan + " Tomorrow is Mercredi");
        if (DayKedepan == 4)
            System.out.println(DKedepan + " Tomorrow is Jeudi");
        if (DayKedepan == 5)
            System.out.println(DKedepan + " Tomorrow is Vendredi");
        if (DayKedepan == 6)
            System.out.println(DKedepan + " Tomorrow is Samedi");
        }
        if (day == 6) {
            System.out.println("today is samedi");
            System.out.println("tomorrow is dimanche");
        if (DayKedepan == 0)
            System.out.println(DKedepan + " Tomorrow is Semaine");
        if (DayKedepan == 1)
            System.out.println(DKedepan + " Tomorrow is Lundi");
        if (DayKedepan == 2)
            System.out.println(DKedepan + " Tomorrow is Mardi");
        if (DayKedepan == 3)
            System.out.println(DKedepan + " Tomorrow is Mercredi");
        if (DayKedepan == 4)
            System.out.println(DKedepan + " Tomorrow is Jeudi");
        if (DayKedepan == 5)
            System.out.println(DKedepan + " Tomorrow is Vendredi");
        if (DayKedepan == 6)
            System.out.println(DKedepan + " Tomorrow is Samedi");
        }
        if (day == 7) {
            System.out.println("today is Dimanche");
            System.out.println("tomorrow is lundi");
        if (DayKedepan == 0)
            System.out.println(DKedepan + " Tomorrow is Semaine");
        if (DayKedepan == 1)
            System.out.println(DKedepan + " Tomorrow is Lundi");
        if (DayKedepan == 2)
            System.out.println(DKedepan + " Tomorrow is Mardi");
        if (DayKedepan == 3)
            System.out.println(DKedepan + " Tomorrow is Mercredi");
        if (DayKedepan == 4)
            System.out.println(DKedepan + " Tomorrow is Jeudi");
        if (DayKedepan == 5)
            System.out.println(DKedepan + " Tomorrow is Vendredi");
        if (DayKedepan == 6)
            System.out.println(DKedepan + " Tomorrow is Samedi");
        }
        if (day > 7) {
            System.out.println("Input tidak valid!");
        }
    }
}