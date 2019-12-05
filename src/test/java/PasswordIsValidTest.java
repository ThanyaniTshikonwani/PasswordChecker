import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordIsValidTest {

    @Test
    void passwordCheck() {
        assertTrue(PasswordIsValid.passwordCheck("werwsdfs27!df"));
    }

    @Test
    void passWordIsOK() {
        assertTrue(PasswordIsValid.passWordIsOK("werwsdfs9df"));
    }
}