import java.util.Random;

// Base Interface
interface Password {
    String getPassword();
}

// Concrete Component
class EasyPassword implements Password {
    private String password;

    public EasyPassword(String phrase) {
        this.password = phrase.replace(" ", "-") + "41";
    }

    @Override
    public String getPassword() {
        return password;
    }
}

// Abstract Decorator
abstract class PasswordDecorator implements Password {
    protected Password passwordBeginning;

    public PasswordDecorator(Password passwordBeginning) {
        this.passwordBeginning = passwordBeginning;
    }

    @Override
    public abstract String getPassword();
}

// Pallendrome Decorator
class Pallendrome extends PasswordDecorator {
    public Pallendrome(Password passwordBeginning) {
        super(passwordBeginning);
    }

    @Override
    public String getPassword() {
        String original = passwordBeginning.getPassword();
        return original + new StringBuilder(original).reverse().toString();
    }
}

// Symbols Decorator
class Symbols extends PasswordDecorator {
    public Symbols(Password passwordBeginning) {
        super(passwordBeginning);
    }

    @Override
    public String getPassword() {
        return passwordBeginning.getPassword()
                .replace('a', '@')
                .replace('A', '@')
                .replace('e', '3')
                .replace('E', '3')
                .replace('i', '1')
                .replace('I', '1')
                .replace('o', '0')
                .replace('O', '0');
    }
}

// Random Casing Decorator
class RandomCasing extends PasswordDecorator {
    private Random random = new Random();

    public RandomCasing(Password passwordBeginning) {
        super(passwordBeginning);
    }

    @Override
    public String getPassword() {
        StringBuilder modified = new StringBuilder();
        for (char c : passwordBeginning.getPassword().toCharArray()) {
            if (Character.isLetter(c)) {
                modified.append(random.nextBoolean() ? Character.toUpperCase(c) : Character.toLowerCase(c));
            } else {
                modified.append(c);
            }
        }
        return modified.toString();
    }
}

// Special Characters Decorator
class SpecialChars extends PasswordDecorator {
    public SpecialChars(Password passwordBeginning) {
        super(passwordBeginning);
    }

    @Override
    public String getPassword() {
        return passwordBeginning.getPassword()
                .replace("-", "-")
                .replace("a", "@")
                .replace("A", "@")
                .replace("t", "*")
                .replace("T", "+")
                .replace("c", "%")
                .replace("C", "%")
                .replace("s", "$")
                .replace("S", "$")
                .replace("0", "{")
                .replace("1", "}");
    }
}
