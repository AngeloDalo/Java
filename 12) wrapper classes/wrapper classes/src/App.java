public class App {
    public static void main(String[] args) throws Exception {
        String a = "nome"; //possiamo usare metodi
        char b = 'b'; //non posso usare i metodi così come boolean int double
        Character carattere = 'c';
        Integer numero = 5;
        Double virgola = 5.23;
        Boolean vero = true;
        
        boolean falso2 = false;
        boolean vero2 = true;
        char carattere2 = 'c';
        int numero2 = 5;
        double virgola2 = 5.23;


        //le variabili con lettera maiuscolo ora posso avere dei metodi
        if(vero == vero2) {
            System.out.println("ciao");
        }
    }
}
