package p05_security_system;

import java.util.Scanner;

public class KeyCardCheck extends SecurityCheck implements KeyCardUI {

    private KeyCardUI securityUI;
    private Scanner scanner;

    KeyCardCheck(KeyCardUI securityUI) {
        this.scanner = new Scanner(System.in);
        this.securityUI = securityUI;
    }

    @Override
    public boolean validateUser() {
        String code = this.requestKeyCard();
        if (isValid(code)) {
            return true;
        }

        return false;
    }

    private boolean isValid(String code) {
        return true;
    }

    @Override
    public String requestKeyCard() {
        System.out.println("slide your key card");
        return this.scanner.nextLine();
    }
}
