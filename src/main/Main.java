package main;

import zivotinje.Macka;
import zivotinje.Pas;
import zivotinje.Zivotinja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Pas mica = new Pas("Mica", "bela", "dzek rasel");
        Pas zika = new Pas("Zika", "crna", "labrador");
        Macka garfild = new Macka("Garfild", "crno bela");

//        Zivotinja nekaZivotinja = new Zivotinja("nedefinisana zivotinja", "bela");

//        mica.stampaj();
//        garfild.stampaj();

//        Zivotinja.stampajStatic();
//
//        mica.animalSound();
//        garfild.animalSound();


        ArrayList<Zivotinja> x = vratiListuZivotinja();
        vratiBrojZivotinja(x);
//        Zivotinja [] listaZivotinja = new Zivotinja[1000];
//        System.out.println("Ime prve zivotinje u nizu je: " +listaZivotinja.get(0).getImeZivotinje());
//        System.out.println("Ime prve zivotinje u nizu je: " +listaZivotinja.get(1).getBoja());

    }

    public static ArrayList<Zivotinja> vratiListuZivotinja() {
        ArrayList<Zivotinja> listaZivotinja = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite broj zivotinja");
        int broj = scanner.nextInt();
        for (int i = 0; i < broj; i++) {
            System.out.println("Unesite 'p' za psa ili 'm' za macku");
            String vrsta = scanner.next();
            System.out.println("Unesite ime zivotinje");
            String imeZivotinje = scanner.next();
            System.out.println("Unesite boju zivotinje");
            String boja = scanner.next();
            if (vrsta.equals("p")) {
                Pas pas = new Pas(imeZivotinje, boja);
                listaZivotinja.add(pas);
            } else {
                Macka macka = new Macka(imeZivotinje, boja);
                listaZivotinja.add(macka);
            }
        }
        return listaZivotinja;
    }

    public static void vratiBrojZivotinja(ArrayList<Zivotinja> nizZivotinja){
        int brojPasa = 0;
        int brojMacaka = 0;
        for (int i = 0; i< nizZivotinja.size(); i++){
            if (nizZivotinja.get(i) instanceof Pas) {
                brojPasa++;
            }else if (nizZivotinja.get(i) instanceof Macka){
                brojMacaka ++;
            }
        }
        System.out.println("Broj pasa u nizu je " + brojPasa + ".A broj macaka u nizu je " + brojMacaka);

    }

}

