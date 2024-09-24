package For;

import java.util.Scanner;

public class Esercizio4 {
    public static void countdown(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci un numero per iniziare il countdown");
        try{
            int begin = sc.nextInt();
            for (int i = begin; i >= 0 ; i--) {
                System.out.println(i);
            }
            System.out.println("Auguriiii");
        } catch (Exception e){
            System.out.println("Riprova");
            countdown();
        }
    }
}
