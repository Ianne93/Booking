public class Utility {

    //attributi

    private static int incrementoCodiceHost = -1, incrementoIdAbitazione = -1, incrementoIdPrenotazione = -1 , incrementoIdFeedback = -1;

    public static int getIncrementHost() {
        incrementoCodiceHost++;
        return incrementoCodiceHost;
    }

    public static int getIncrementAbitazione() {
        incrementoIdAbitazione++;
        return incrementoIdAbitazione;
    }

    public static int getIncrementPrenotazione() {
        incrementoIdPrenotazione++;
        return incrementoIdPrenotazione;

    }

    public static int getIncrementFeedback() {
        incrementoIdFeedback++;
        return incrementoIdFeedback;

    }
}
