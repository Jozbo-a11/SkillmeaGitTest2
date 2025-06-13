import java.util.Random;
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
        /*float prveCislo;
        float druheCislo;
        Scanner mojScanner = new Scanner(System.in);

        System.out.println("Zadaj prve cislo:");
        prveCislo = mojScanner.nextFloat();

        System.out.println("Zadaj druhe cislo:");
        druheCislo = mojScanner.nextFloat();

        System.out.println(prveCislo + druheCislo);
        System.out.println(prveCislo - druheCislo);
        System.out.println(prveCislo * druheCislo);
        System.out.println(prveCislo / druheCislo);*/


        //Uzivatel zada slovo, vo vypyse budu vsetky pismena velke
        /*Scanner mojScanner = new Scanner(System.in);
        System.out.println("Zadaj svoje slovo:");
        String slovo = mojScanner.nextLine();

        System.out.println(slovo.toUpperCase());*/

        /*int prveCislo = 8;
        int druheCislo = 3;
        //prveCislo = prveCislo + druheCislo;
        //prveCislo += drujeCislo;

        System.out.println(prveCislo + druheCislo);
        System.out.println(prveCislo - druheCislo);
        System.out.println(prveCislo % druheCislo);

        System.out.println(prveCislo == druheCislo);*/

        /*int cisloKPorovnaniu = 9;

        System.out.println(cisloKPorovnaniu > 0 && cisloKPorovnaniu <=8);
        System.out.println(cisloKPorovnaniu > 8 || cisloKPorovnaniu <0);
        System.out.println(!(cisloKPorovnaniu > 8 || cisloKPorovnaniu <0));*/


        //Feature pre kontrolu veku, ak bude uzivatelovi 18 a viac vypis do konzoly vitaj v aplikacii
        /*int vek;
        Scanner mojScanner = new Scanner(System.in);

        System.out.println("Zadaj svoj vek");
        vek = mojScanner.nextInt();

        if(vek >= 18) {
            System.out.println("Uzivatel je dospely");
            if (vek >= 65) {
                System.out.println("Uzivatel je senior");
            }
        }
        else if(vek >=0 && vek < 18) {
            System.out.println("Uzivatel je neplnolety");
        }
        else {
            System.out.println("Nie je mozne zadat zaporny vek");
        }*/

        /*//Vypocet BMI hmotnost(kg)/vyska(m) na druhu, vypis do konzoly vysledok
        // (<18.5) - podvaha
        // (>=18.5 && >25) - optimalna vaha
        // (>=25) - nadvaha
        float vyska;
        float hmotnost;
        float bmi;
        Scanner mojScanner = new Scanner(System.in);

        System.out.println("Zadaj vysku(m): ");
        vyska = mojScanner.nextFloat();
        System.out.println("Zadaj vahu(kg): ");
        hmotnost = mojScanner.nextFloat();
        bmi = hmotnost / (vyska * vyska);

        if(bmi < 18.5f && bmi>=0) {
            System.out.println("Uzivatel ma podvahu");
        }
        else if (bmi >=18.5f && bmi<25) {
            System.out.println("Uzivatel ma optimalnu vahu");
        }
        else if (bmi > 25) {
            System.out.println("Uzivatel ma nadvahu");
        }
        System.out.println("BMI");*/

        //Neparne cislo = vyhrava, Parne cislo = prehrava
        /*int hodeneCislo;
        Random nahodnyGenerator = new Random();

        System.out.println("Pre hodenie kockou stiskni Enter");
        Scanner mojScanner = new Scanner(System.in);
        mojScanner.nextLine();

        hodeneCislo = nahodnyGenerator.nextInt(1, 7);
        System.out.println("Hodene cislo je: " + hodeneCislo);

        if(hodeneCislo % 2 == 1) {
            System.out.println("Neparne - Vyhravas!");
        }
        else {
            System.out.println("Parne - Prehravas");
        }*/


        //Switch - den v tyzdni
        /*Scanner mojScanner = new Scanner(System.in);
        int cisloDna;
        System.out.println("Zadaj cislo dna:");
        cisloDna = mojScanner.nextInt();

        switch (cisloDna) {
            case 1:
                System.out.println("Je pondelok");
                break;
            case 2:
                System.out.println("Je utorok");
                break;
            case 3:
                System.out.println("Je streda");
                break;
            case 4:
                System.out.println("Je stvrtok");
                break;
            case 5:
                System.out.println("Je piatok");
                break;
            case 6:
                System.out.println("Je sobota");
                break;
            case 7:
                System.out.println("Je nedela");
                break;
            default:
                System.out.println("Neplatne cislo dna");
        }

        switch (cisloDna) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Je pracovny den");
                break;
            case 6:
            case 7:
                System.out.println("Je vikend");
                 break;
        }*/

        //Pole
        /*int[] znamky = new int[5];
        znamky[0] = 3;
        znamky[1] = 5;
        znamky[2] = 1;
        znamky[3] = 3;
        znamky[4] = 1;

        int[] znamky2 = new int[] {3, 5, 1, 3, 1};

        System.out.println(znamky[2]);*/

        /*String[] mena = new String[] {"Peter", "Jan", "Katka", "Eva", "Jana"};
        mena[0] = "Linda";
        System.out.println(mena[0]);*/

        /*int[][] pole2D = new int[3][3];
        pole2D[0][0] = 464;
        pole2D[0][1] = -92;*/

        //Smycky
        /*for(int i = 0; i < 10; i++){
            //System.out.println(i * 5);
            if(i == 5){
                //break;
                continue;
            }
            System.out.println(i);
        }*/

        /*String[] mena = new String[] {"Peter", "Jan", "Katka", "Eva", "Jana"};
        //for
        for(int i = 0; i < mena.length; i ++){
            System.out.println(mena[i]);
        }
        //foreach
        for(String meno: mena){
            System.out.println(meno);
        }*/

        //while
        /*int riadiacaPremenna = 0;
        while (riadiacaPremenna < 5){
            System.out.println(riadiacaPremenna);
            riadiacaPremenna++;
        }
        System.out.println("Tu pokracujem");*/

        //do...while
        /*int riadiacaPremenna2 = 0;
        do {
            System.out.println(riadiacaPremenna2);
            riadiacaPremenna2++;
        } while(riadiacaPremenna2 < 5);

        System.out.println("Tu pokracujem");*/


        //Vylepsenie ulohy Hod_kockou
        /*int hodeneCislo;
        Random nahodnyGenerator = new Random();
        Scanner mojScanner = new Scanner(System.in);
        boolean riadiacaPremenna = true;
        String ukoncenie;

        do {
            System.out.println("Pre hodenie kockou stiskni Enter");
            mojScanner.nextLine();

            hodeneCislo = nahodnyGenerator.nextInt(1, 7);
            System.out.println("Hodene cislo je: " + hodeneCislo);

            if (hodeneCislo % 2 == 1) {
                System.out.println("Neparne - Vyhravas!");
            } else {
                System.out.println("Parne - Prehravas");
            }

            System.out.println("Pre ukoncenie hry zadaj pismeno q");
            ukoncenie = mojScanner.nextLine();
            if(ukoncenie.equals("q")){
                riadiacaPremenna = false;
            }

        } while(riadiacaPremenna);*/


        //21 (Blackjack)
        Scanner mojScanner = new Scanner(System.in);
        Random nahGen = new Random();
        int skoreHraca = 0;
        int skoreKrupiera = 0;
        int tahanaKarta;
        String uzivatelskyVstup;

        do {
            tahanaKarta = nahGen.nextInt(1, 14);
            System.out.println("Tahana karta je:" + tahanaKarta);
            skoreHraca = skoreHraca + tahanaKarta;
            System.out.println("Skore hraca je:" + skoreHraca);

            if(skoreHraca > 21){
                System.out.println("Prehral si!");
                break;
            }

            System.out.println("Chces dalsiu kartu stiskni - d");
            System.out.println("Uz neches kartu stiskni - q");
            uzivatelskyVstup = mojScanner.nextLine();

            if(uzivatelskyVstup.equals("d")){
                continue;
            }
            else if (uzivatelskyVstup.equals("q")) {
                while (skoreKrupiera < skoreHraca){
                    skoreKrupiera += nahGen.nextInt(1, 14);
                }

            }

        }while(true);

        System.out.println("Skore hraca: " + skoreHraca);
        System.out.println("Skore krupiera: " + skoreKrupiera);

        if((skoreHraca > skoreKrupiera && skoreHraca <= 21) || skoreKrupiera > 21){
            System.out.println("Vyhral si");
        } else if (skoreHraca == skoreKrupiera) {
            System.out.println("Je to remiza");
        }
        else {
            System.out.println("Prehral si");
        }
        System.out.println("Dakujem za hru");

    }
}