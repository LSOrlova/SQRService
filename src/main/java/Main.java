import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();

        int x = 200;
        int y = 300;
        long actual = service.calcSqrt(x, y);

        System.out.println("В диапазоне от " + x + " до " + y + " обнаружено " + actual + " квадратных корней");
    }


}
