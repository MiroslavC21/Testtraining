package ZadatakPripremaZaTest;

import java.util.ArrayList;
/*Kreirati glavnu klasu I u njoj:
instancirati jednu planinu
napraviti nizili listu koji ce sadrzati najmanje tri rekrativna planinara I tri alpiniste
ispisati podatke o svim planinarima I za svakog od planinara ispisati da li ce se popeti na instanciranu planin
ispisati kolika je zbir svih clanarina planinara iz niza/liste*/

public class Main {



    public static void main(String[] args) {
        Planina staraPlanina = new Planina("Stara planina", "Srbija", 2100);
        Alpinista alpinista1 = new Alpinista("2312","Josif","Pancic",22);
        Alpinista alpinista2 = new Alpinista("3456", "Vladimir", "Marjanovic", 11);
        Alpinista alpinista3 = new Alpinista("5621", "Dusan", "Vukmirovic", 7);

        RekreativniPlaninar planinar1 = new RekreativniPlaninar("9487", "Milena", "Vukovic", 7, "Zapadno-Backi", 1500);
        RekreativniPlaninar planinar2 = new RekreativniPlaninar("32423", "Dragan", "Mance", 5, "Macvanski", 2550);
        RekreativniPlaninar planinar3 = new RekreativniPlaninar("34453", "Jelena", "Vukobratovic", 6, "Juzno-Backi", 1800);
        ArrayList<Planinar> sviPlaninari = new ArrayList<>();
        sviPlaninari.add(alpinista1);
        sviPlaninari.add(alpinista2);
        sviPlaninari.add(alpinista3);
        sviPlaninari.add(planinar1);
        sviPlaninari.add(planinar2);
        sviPlaninari.add(planinar3);
        System.out.println(sviPlaninari);

        for (Planinar p : sviPlaninari) {

            if (p.uspesanUspon(staraPlanina)) {
                System.out.println("Planinar moze da se popne na planinu.");
            } else {
                System.out.println("Planinar ne moze da se popne na planinu");
            }
        }


        int suma = 0;
        for (Planinar p : sviPlaninari) {
            if (p instanceof Alpinista) {
                suma += p.clanarinaPlaninara();
            }
        }
        System.out.println("Ukupna clanarina je: " + suma);

        

    }

    }



