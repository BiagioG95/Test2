import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    //Utilizzo degli assert per testare le proprie applicazioni
    //Un assert non è altro che una condizione necessaria che lo sviluppatore ritiene si debba verificare in un determinato momento

    @Test
    void testFullFormat() {
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String fullFormat = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        String expected = "venerdì 1 marzo 2002";
        assertEquals(fullFormat, expected);
    }

    @Test
    void testMediumFormat(){
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String mediumFormat = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String expected = "1 mar 2002";
        assertTrue(mediumFormat.equals(expected));
    }

    @Test
    void testShort(){
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String shortFormat = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));;
        String expected = "01/03/03";
        assertFalse(shortFormat.equals(expected));


    }
}