package For;

import java.util.Scanner;

public class Esercizio4 {
    public static void countdown(){
        Scanner sc = new Scanner(System.in);
        int begin = 0;
        boolean inputValido = false;
        while(!inputValido){
            System.out.println("Inserisci un numero per iniziare il countdown");
            try{
                begin = sc.nextInt();
                inputValido = true;
            } catch (Exception e){
                System.out.println("Riprova");
                sc.nextLine();
            }
        }
        for (int i = begin; i >= 0 ; i--) {
            System.out.println(i);
        }
        System.out.println("Auguriiii");
        sc.close();


    }
}
