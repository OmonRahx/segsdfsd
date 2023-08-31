import ru.netology.services.CalcService;

public class Main {
    public static void main(String[] args) {
        CalcService CalcService = new CalcService();
        System.out.println(CalcService.calcVacation(10_000, 3000, 20_000));


    }
}
