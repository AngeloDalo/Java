public class App {
    public static void main(String[] args) throws Exception {
        String nome = "Angelo";
        boolean risultato = nome.equals("Angelo"); //è nome = "Angelo"
        boolean risultato2 = nome.equalsIgnoreCase("Angelo"); //come sopra però ignora i casi
        int risultato3 = nome.length(); //lunghezza della stringa
        char risultato4 = nome.charAt(4); //quale lettera alla posizione 4
        int risultato5 = nome.indexOf("a"); //a quale posizione c'è la lettera a
        boolean risultato6 = nome.isEmpty(); //Se variabile è vuota
        String risultato7 = nome.toUpperCase(); //tutto maiuscolo
        String risultato8 = nome.toLowerCase(); //tutto minuscolo
        String risultato9 = nome.trim(); //toglie gli spazi
        String rusultato10 = nome.replace('o', 'w'); //sostituisce o con w
    }
}
