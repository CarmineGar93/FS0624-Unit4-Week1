package If_Else;

public class Esercizio1 {
    public static boolean pariDispari(String str){
        return str.length() % 2 == 0;
    }

    public static boolean annoBisestile(int anno){
        if(anno % 4 == 0){
            return anno % 100 != 0 || anno % 400 == 0;
        } else return false;
    }
}
