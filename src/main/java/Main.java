import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        User UserOne = new User("Antonio", "Farante");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String userJson = gson.toJson(UserOne);
        System.out.println("userJson = " + userJson);
    }
}
