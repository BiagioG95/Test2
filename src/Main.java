import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/*
Riprendi l'esercizio sulle date:

Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
Formatta la data ottenuta in FULL, MEDIUM e SHORT
Stampa le varie versioni -Crea dei test per questo esercizio
 */
public class Main {
    public static void main(String[] args) {
        //creare un oggetto OffsetDateTime, tramite il '.parse'
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        //formatto la data in fULL ovvero indicando giorno della settimana, giorno del mese, mese e anno
        String dateString1 = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("dateString-1 " + dateString1);

        //formatto la data in MEDIUM indicando giorno del mese, mese e anno in modo completo
        String dateString2 = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("dateString-2 " + dateString2);

        //formatto la data in SHORT indicando giorno del mese, mese e anno in modo abbreviato
        String dateString3 = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println("dateString-3 " + dateString3);




    }
}