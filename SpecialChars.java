import java.util.Random;

public class SpecialChars extends PasswordDecorator {
    private static final Random rand = new Random();
    private static final char[] specialChars = {'*', '!', '%', '+', '.', '{', '}'};

    public SpecialChars(Password passwordBeginning) {
        super(passwordBeginning);
    }

    @Override
    public String getPassword() {
        StringBuilder newPassword = new StringBuilder();
        for (char c : passwordBeginning.getPassword().toCharArray()) {
            newPassword.append(c);
            if (Character.isLetter(c) && rand.nextInt(100) < 30) {  // 30% chance
                newPassword.append(specialChars[rand.nextInt(specialChars.length)]);
            }
        }
        return newPassword.toString();
    }
}