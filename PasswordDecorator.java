public abstract class PasswordDecorator implements Password {
    protected Password passwordBeginning;

    public PasswordDecorator(Password passwordBeginning) {
        this.passwordBeginning = passwordBeginning;
    }

    @Override
    public abstract String getPassword();
}
