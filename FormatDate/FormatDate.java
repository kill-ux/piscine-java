import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatDate {

    public static String formatToFullText(LocalDateTime dateTime) {
        return dateTime.format(
                DateTimeFormatter.ofPattern("'Le' dd MMM 'de l''an' yyyy 'à' HH'h'mm'm' 'et' ss's'", Locale.FRENCH));
    }

    public static String formatSimple(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("MMMM dd yy", Locale.ITALY));
    }

    public static String formatIso(LocalTime time) {
        return time.toString();
    }

}