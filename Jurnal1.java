import java.util.Scanner;
    class Tp1{
        public static void main(String[] args){
            Scanner in = new Scanner (System.in);
            int mois = in.nextInt();

            switch(mois){
                case 1:
                System.out.print("janivier");
                break;
                case 2:
                System.out.print("Février");
                break;
                case 3:
                System.out.print("Mars");
                break;
                case 4:
                System.out.print(" Avril");
                break;
                case 5:
                System.out.print("Mai");
                break;
                case 6:
                System.out.print("juin");
                break;
                case 7:
                System.out.print("julilet");
                break;
                case 8:
                System.out.print("Août");
                break;
                case 9:
                System.out.print("Septembre");
                break;
                case 10:
                System.out.print("octobre");
                break;
                case 11:
                System.out.print("novembre");
                break;
                case 12:
                System.out.print("Décembre");
                break;
                default:
                System.out.print("error");
            }
        }
    }