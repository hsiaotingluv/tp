package seedu.address.model.person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.testutil.Assert.assertThrows;

public class SocialHandleTest {

    @Test
    public void constructor_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new SocialHandle(null));
    }

    @Test
    public void constructor_invalidSocialHandle_throwsIllegalArgumentException() {
        String invalidSocialHandle = "";
        assertThrows(IllegalArgumentException.class, () -> new SocialHandle(invalidSocialHandle));
    }

    @Test
    public void isValidSocialHandle() {
        // null socialHandle
        assertThrows(NullPointerException.class, () -> SocialHandle.isValidSocialHandle(null));

        // invalid socialHandle
        assertFalse(SocialHandle.isValidSocialHandle("")); // empty string
        assertFalse(SocialHandle.isValidSocialHandle(" ")); // spaces only

        // valid socialHandle
        assertTrue(SocialHandle.isValidSocialHandle("@valid"));
        assertTrue(SocialHandle.isValidSocialHandle("@v")); // one character
    }

}
