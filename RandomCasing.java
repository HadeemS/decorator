import java.util.Random;

public class RandomCasing extends PasswordDecorator {
    private static final Random rand = new Random();

    public RandomCasing(Password passwordBeginning) {
        super(passwordBeginning);
    }

    @Override
    public String getPassword() {
        StringBuilder newPassword = new StringBuilder();
        for (char c : passwordBeginning.getPassword().toCharArray()) {
            if (Character.isLetter(c)) {
                newPassword.append(rand.nextBoolean() ? Character.toUpperCase(c) : Character.toLowerCase(c));
            } else {
                newPassword.append(c);
            }
        }
        return newPassword.toString();
    }
}
