import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println(LocalDate.now().minusMonths(1));
        if(LocalDate.now().isAfter(LocalDate.now().minusMonths(1))){
            System.out.println("Ciao");
        }
    }
}
