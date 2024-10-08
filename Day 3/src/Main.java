import Esercizio1.Rettangolo;
import Esercizio2.Sim;
import Esercizio3.Articolo;
import Esercizio3.Carrello;
import Esercizio3.Cliente;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------Esercizio 1----------");
        System.out.println("-------------1.1--------------");
        Rettangolo r1 = new Rettangolo(2.5,4);
        Rettangolo r2 = new Rettangolo(5,5.4);
        Rettangolo.print(r1);
        Rettangolo.print(r2);
        Rettangolo.print2(r1,r2);
        r2.setBase(7);
        r2.setAltezza(1.5);
        Rettangolo.print(r2);
        System.out.println("---------Esercizio 2----------");
        Sim mia = new Sim("3393326197");
        Sim.stampaDati(mia);
        Sim.addCredito(mia, 20);
        mia.chiama("3393327894", "35");
        mia.chiama("3339782335", "20");
        Sim.stampaDati(mia);
        Sim tua = new Sim("3349612553");
        Sim.stampaDati(tua);
        tua.chiama(mia.getNr(), "10");
        Sim.setNr(tua, "3345425197");
        System.out.println("---------Esercizio 3----------");
        Articolo tv = new Articolo("Televisore Lg", 500, 25);
        Articolo tastiera = new Articolo("Tastiera Logitech", 100, 100);
        Cliente io = new Cliente("Carmine Gargiulo", "ca@ca");
        Carrello mioCarrello = new Carrello(io);
        mioCarrello.addToCart(tv, 1);
        mioCarrello.addToCart(tastiera, 2);
        mioCarrello.mostraArticoli();
        mioCarrello.removeFromCart(tastiera, 1);
        mioCarrello.mostraArticoli();


    }
}