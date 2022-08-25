public class App {
    public static void main(String[] args) throws Exception {
        //classi ristrette che non possono essere usate per creare oggetti ma solamente per essere ereditate
        //NOOOOO Veicolo veicolo = new Veicolo();
        Macchina macchina = new Macchina();
        macchina.frena();
        macchina.muovi();
    }
}
