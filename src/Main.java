import java.util.ArrayList;

public class Main {
    public static void main(String[] args)

    {
        Personvogn bil1 = new Personvogn(600,"DA 11 234",210,255,"stor");
        Personvogn bil2 = new Personvogn(425,"DA 22 567",180,200,"mellem");
        Personvogn bil3 = new Personvogn(500,"DA 33 891",255,400,"stor");

        Bus bus1 = new Bus(700,"BU 00 111",50,4);
        Bus bus2 = new Bus(900,"BU 11 222",80,6);
        Bus bus3 = new Bus(750,"BU 22 333",65,4);

        Lastbil last1 = new Lastbil(1000,"LA 99 888",550,7000);
        Lastbil last2 = new Lastbil(1000,"LA 88 777",680,10000);
        Lastbil last3 = new Lastbil(1000,"LA 77 666",480,6500);


        ArrayList<Koeretoej>list=new ArrayList<>();

        list.add(bil1);
        list.add(bil2);
        list.add(bil3);
        list.add(bus1);
        list.add(bus2);
        list.add(bus3);
        list.add(last1);
        list.add(last2);
        list.add(last3);

        System.out.println();
        System.out.println(list.size());
        System.out.println();
        System.out.println(list);
        System.out.println();
udskriv(list);

    }
    public static void udskriv(ArrayList<Koeretoej>arraylist)
    {
        for (int i = 0;i<arraylist.size();i++)
        {
            System.out.println();
            System.out.println(arraylist.get(i).getRegistreringsnummer());
            System.out.println(arraylist.get(i).getVaegtafgift()+"Kr");
            if (arraylist.get(i) instanceof Personvogn) {
                System.out.println(((Personvogn) arraylist.get(i)).getHastighed()+" Km/t");
                System.out.println(((Personvogn) arraylist.get(i)).getHestekraefter()+" hestekræfter");
                System.out.println(((Personvogn) arraylist.get(i)).getMotorStoerlse());
            }
            if (arraylist.get(i) instanceof Bus){
                System.out.println( ((Bus) arraylist.get(i)).getAntalDoere()+" døre");
                System.out.println(((Bus) arraylist.get(i)).getAntalPassagerer()+" passagere");
            }
            if (arraylist.get(i)instanceof Lastbil){
                System.out.println(((Lastbil) arraylist.get(i)).getLastkapacitet()+"Kg");
                System.out.println(((Lastbil) arraylist.get(i)).getHestekraefter()+" hestekræfter");
            }

        }
    }
}