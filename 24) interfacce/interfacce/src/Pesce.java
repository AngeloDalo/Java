public class Pesce implements Preda, Predatore {
    @Override
    public void caccia() {
        System.out.println("il pesce caccia");
    } 
    @Override
    public void scappa() {
        System.out.println("il pesce scappa");
    }
}
