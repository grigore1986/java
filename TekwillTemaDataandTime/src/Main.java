import java.time.*;

public class Main {
    public static void main(String[] args) {

//1. Creați o LocalDate care va reprezente data de 2 ianuarie 2024
            LocalDate localDate = LocalDate.of(2024, Month.JANUARY, 2);
             System.out.println("Afisam data");
            System.out.println(localDate);
//2. Creați o LocalTime care va reprezenta ora 13:20
            LocalTime localTime = LocalTime.of(13, 20);
        System.out.println("Afisam ora");
            System.out.println(localTime);
//3. Creați o LocalDateTime care va reprezente data de 2 ianuarie 2024 ora 13:20
            LocalDateTime localDateTime = LocalDateTime.of(2024, Month.JANUARY, 2, 13, 20);
        System.out.println("Afisam data si ora");
            System.out.println(localDateTime);
// 4. Creați o ZoneDateTime care va reprezente data de 2 ianuarie 2024 ora 13:20 în America
            ZonedDateTime zonedDateTime = ZonedDateTime.of(localDate, localTime, ZoneId.of("US/Eastern"));
        System.out.println("Afisem data, ora, zona");
            System.out.println(zonedDateTime);
// 5. Adăugați un minut, o ora, o zi, un an, la data de mai sus
            localTime = localTime.plusMinutes(1);
        System.out.println("Afisem ora plu un minut");
            System.out.println(localTime);
            localTime = localTime.plusHours(1);
        System.out.println("Afisem ora plus o ora");
        System.out.println(localTime);
            localDate = localDate.plusDays(1);
        System.out.println("Afisem data plus o zi");
        System.out.println(localDate);
            localDate = localDate.plusYears(1);
        System.out.println("Afisem data plus un an");
        System.out.println(localDate);


        }
    }






