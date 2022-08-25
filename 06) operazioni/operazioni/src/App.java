public class App {
    public static void main(String[] args) throws Exception {
        //int x = 10;
        //x += 3; //x = x + 3
        //x++;
        System.out.println(Math.abs(-55)); //prende valore e toglie il segno
        System.out.println(Math.min(-55, 21)); //minimo tra 2 numeri
        System.out.println(Math.max(-55, 21)); //massimo tra 2 numeri
        System.out.println(Math.pow(5, 2)); //elevamento a potenza
        System.out.println(Math.sqrt(9)); //radice quadrata
        System.out.println(Math.PI); //pigreco
        boolean risultato = 3 > 10;
        boolean risultato2 = (3 < 10 && 3 % 2 == 0) || (6 < 10 && 6 > 2);
        System.out.println(risultato);
    }
}
