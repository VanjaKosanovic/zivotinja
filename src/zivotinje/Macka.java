package zivotinje;

public class Macka extends Zivotinja{

    public Macka (String ime, String boja){
        super(ime, boja);
    }

    public void eat (){
        super.eat();
    }

    public void animalSound(){
        System.out.println("Macka mjauce!");
    }
}
