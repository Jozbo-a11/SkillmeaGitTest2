import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*String pozdrav = "Ahoj svet";


        System.out.println(pozdrav);
        System.out.println(pozdrav);
        System.out.println(pozdrav);
        System.out.println(pozdrav);*/

        /*int prveCislo = 10;
        int druheCislo = 5;

        System.out.println(prveCislo + druheCislo);
        System.out.println(prveCislo - druheCislo);
        System.out.println(prveCislo * druheCislo);
        System.out.println(prveCislo / druheCislo);



        String pozdrav2 = "Ahoj";
        String meno = "Jozef";

        System.out.println(pozdrav2 + " " + meno);*/

        //Uloha: Uxivatel napise svoje meno a program ho pozdravi
        /*String pozdrav3 = "Ahoj, ";
        Scanner mojScanner = new Scanner(System.in);
        System.out.println("Zadaj svoje meno:");
        String meno = mojScanner.nextLine();
        System.out.println(pozdrav3 + meno);*/

        //Kalkulacka
        float prveCislo;
        float druheCislo;
        Scanner mojScanner = new Scanner(System.in);

        System.out.println("Zadaj prve cislo:");
        prveCislo = mojScanner.nextFloat();

        System.out.println("Zadaj druhe cislo:");
        druheCislo = mojScanner.nextFloat();

        System.out.println(prveCislo + druheCislo);
        System.out.println(prveCislo - druheCislo);
        System.out.println(prveCislo * druheCislo);
        System.out.println(prveCislo / druheCislo);

    }
}