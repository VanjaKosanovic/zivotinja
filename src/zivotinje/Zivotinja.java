package zivotinje;

import java.util.Date;

public  abstract class Zivotinja {
    protected String imeZivotinje;
    protected String boja;
    protected double tezina;
    protected Date datumRodjenja;

    public Zivotinja(){
    }

    public Zivotinja (String imeZivotinje, String boja, double tezina, Date datumRodjenja){
        this.imeZivotinje = imeZivotinje;
        this.boja = boja;
        this.tezina = tezina;
        this.datumRodjenja = datumRodjenja;
    }

    public Zivotinja (String imeZivotinje, String boja){
        this.imeZivotinje = imeZivotinje;
        this.boja = boja;
    }

    public abstract void animalSound();

    public String getImeZivotinje(){
        return this.imeZivotinje;
    }
    public double getTezina(){
        return this.tezina;
    }

    public String getBoja (){
        return this.boja;
    }

    public void setImeZivotinje(String imeZivotinje){
        this.imeZivotinje = imeZivotinje;
    }

    public void eat(){
        System.out.println("Zivotinja jede!");
    }

    public static void stampajStatic (){
        System.out.println("Ova zivotinja je iz majke klase - Static");
    }

    public void stampaj (){
        System.out.println("Ova zivotinja se zove " + this.imeZivotinje + ". Ova zivotinja je boje " + this.boja);
    }
}
