import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BazaSlow {
    private static String[] bazaSlow = {
            "kot", "pies", "dom", "szkoła", "samochód", "komputer", "telefon", "książka",
            "czekolada", "programowanie"
    };

    public static List<String> getBazaSlow() {
        return new ArrayList<>(Arrays.asList(bazaSlow));
    }
}