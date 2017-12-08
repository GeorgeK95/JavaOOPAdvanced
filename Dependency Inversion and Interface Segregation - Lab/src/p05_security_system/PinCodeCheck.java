package p05_security_system;

import java.util.Scanner;

public class PinCodeCheck extends SecurityCheck implements PinCodeUI {

    private PinCodeUI securityUI;
    private Scanner scanner;

    PinCodeCheck(PinCodeUI securityUI) {
        this.scanner = new Scanner(System.in);
        this.securityUI = securityUI;
    }

    @Override
    public boolean validateUser() {
        int pin = this.requestPinCode();
        if (isValid(pin)) {
            return true;
        }

        return false;
    }

    private boolean isValid(int pin) {
        return true;
    }

    @Override
    public int requestPinCode() {
        System.out.println("enter your pin code");
        return Integer.parseInt(this.scanner.nextLine());
    }
}
