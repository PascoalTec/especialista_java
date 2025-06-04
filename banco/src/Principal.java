import java.time.DayOfWeek;
import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {
        DayOfWeek diaDaSemana = LocalDate.now().getDayOfWeek();
        System.out.println(diaDaSemana);
    }
    
    
}