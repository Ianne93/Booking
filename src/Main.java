import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

       Gestore gestore = new Gestore();

        Utente u1 = new Utente("a","a","a","a");
        Utente u2 = new Utente("b","b","b","b");
        Utente u3 = new Utente("c","c","c","c");
        Utente u4 = new Utente("d","d","d","d");
        Utente u5 = new Utente("e","e","e","e");
        Utente u6 = new Utente("f","f","f","f");
        Utente u7 = new Utente("g","g","g","g");
        Utente u8 = new Utente("h","h","h","h");
        Utente u9 = new Utente("i","i","i","i");
        Utente u10 = new Utente("l","l","l","l");

        Host h1 = new Host("m","m","m","m");
        Host h2 = new Host("n","n","n","n");
        Host h3 = new Host("o","o","o","o");

        Abitazione a1 = new Abitazione(10, LocalDateTime.now().minusDays(3), LocalDateTime.now().plusDays(7),"casa1","casa1",
                4,2,1);
        Abitazione a2 = new Abitazione(10, LocalDateTime.now(), LocalDateTime.now().plusDays(10),"casa2","casa2",
                3,1,1);
        Abitazione a3 = new Abitazione(10, LocalDateTime.now(), LocalDateTime.now().plusDays(15),"casa3","casa3",
                8,4,2);
        Abitazione a4 = new Abitazione(10, LocalDateTime.now(), LocalDateTime.now().plusDays(3),"casa4","casa4",
                12,7,3);
        Abitazione a5 = new Abitazione(10, LocalDateTime.now(), LocalDateTime.now().plusDays(20),"casa5","casa5",
                2,1,1);

        gestore.addHost(h1,true);
        gestore.addHost(h2,true);
        gestore.addHost(h3,true);
        h1.addAbitazione(a1,gestore);
        h1.addAbitazione(a2,gestore);
        h2.addAbitazione(a3,gestore);
        h2.addAbitazione(a4,gestore);
        h3.addAbitazione(a5,gestore);
        gestore.addUtente(u1);gestore.addUtente(u2);gestore.addUtente(u3);gestore.addUtente(u4);gestore.addUtente(u5);
        gestore.addUtente(u6);gestore.addUtente(u7);gestore.addUtente(u8);gestore.addUtente(u9);gestore.addUtente(u10);

        Prenotazione p1 = new Prenotazione(LocalDateTime.now(), LocalDateTime.now().plusDays(3),a1,u1);
      Prenotazione p2 = new Prenotazione(LocalDateTime.now().minusDays(1), LocalDateTime.now().plusDays(2),a1,u2);
     Prenotazione p3 = new Prenotazione(LocalDateTime.now().plusDays(4), LocalDateTime.now().plusDays(6),a1,u3);
     Prenotazione p4 = new Prenotazione(LocalDateTime.now().plusDays(4), LocalDateTime.now().plusDays(6),a2,u4);
     Prenotazione p5 = new Prenotazione(LocalDateTime.now().plusDays(4), LocalDateTime.now().plusDays(6),a3,u5);
     Prenotazione p6 = new Prenotazione(LocalDateTime.now().plusDays(4), LocalDateTime.now().plusDays(6),a2,u6);
     Prenotazione p7 = new Prenotazione(LocalDateTime.now().plusDays(4), LocalDateTime.now().plusDays(6),a3,u1);
     Prenotazione p8 = new Prenotazione(LocalDateTime.now().plusDays(4), LocalDateTime.now().plusDays(6),a3,u2);

        gestore.addPrenotazione(p1);
     gestore.addPrenotazione(p2);
     gestore.addPrenotazione(p3);
     gestore.addPrenotazione(p4);
     gestore.addPrenotazione(p5);
     gestore.addPrenotazione(p6);
     gestore.addPrenotazione(p7);
     gestore.addPrenotazione(p8);

     System.out.println(gestore.getListaTotPrenotazioni());
     System.out.println();
     System.out.println(Arrays.toString(gestore.abitazioniHost(1).toArray()));
     System.out.println();
     System.out.println(gestore.prenotazioneIdUtente(0));// da controllare





    }
}
