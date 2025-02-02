import java.util.Random;

public class EasyPassword implements Password {
    private String password;

    public EasyPassword(String phrase) {
        Random rand = new Random();
        this.password = phrase.replace(" ", "-") + rand.nextInt(101);
    }

    @Override
    public String getPassword() {
        return password;
    }
}