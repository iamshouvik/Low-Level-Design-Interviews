package _03_Interfaces;

import java.util.List;

public class RegistrationService {
    private List<Validator> validators;

    public RegistrationService(List<Validator> validators) {
        this.validators = validators;
    }

    public void register(String input) {
        if(this.validators.getFirst().validate(input)){
            System.out.println("\"" + input + "\"" + " - PASSED");
        } else {
            System.out.println("\"" + input + "\"" + " - FAILED");
        }
    }

    public static void main(String[] args) {
        List<Validator> emailValidators = List.of(new EmailValidator());
        RegistrationService emailReg = new RegistrationService(emailValidators);
        emailReg.register("user@example.com"); // Should pass
        emailReg.register("invalid-email");     // Should fail

        List<Validator> passwordValidators = List.of(new PasswordValidator());
        RegistrationService passReg = new RegistrationService(passwordValidators);
        passReg.register("strongpassword"); // Should pass
        passReg.register("short");           // Should fail
    }
}
