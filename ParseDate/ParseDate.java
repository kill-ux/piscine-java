import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class ParseDate {

    public static LocalDateTime parseIsoFormat(String stringDate) {
        return LocalDateTime.parse(stringDate);
    }

    public static LocalDate parseFullTextFormat(String stringDate) {
        return LocalDate.parse(stringDate, DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy", Locale.FRENCH));
    }

    public static LocalTime parseTimeFormat(String stringDate) {
        LocalTime time = LocalTime.parse(stringDate,
                DateTimeFormatter.ofPattern("HH 'heures du soir,' mm 'minutes et' ss 'secondes'"));
        if (stringDate.contains("heures du soir")) {
            time = time.plusHours(12);
        }
        return time;
    }

}