import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JackHammerTest {

    @Test
    void testEqualsEquals() {
        JackHammer JackHammer1 = new JackHammer("JackHammerTest");
        JackHammer JackHammer2 = new JackHammer("JackHammerTest");
        assertEquals(JackHammer1, JackHammer2);
    }

    @Test
    void testEqualsSame() {
        JackHammer JackHammer = new JackHammer("JackHammerTest");
        assertEquals(JackHammer, JackHammer);
    }

    @Test
    void testEqualsNull() {
        JackHammer JackHammer = new JackHammer("JackHammerTest");
        assertNotEquals(null, JackHammer);
    }

    @Test
    void testEqualsDiffClass() {
        JackHammer JackHammer1 = new JackHammer("JackHammerTest1");
        String str = "JackHammerTest1";
        assertFalse(JackHammer1.equals(str));
    }

    @Test
    void testEqualsDiffRequirements() {
        JackHammer JackHammer1 = new JackHammer("JackHammerTest1");
        JackHammer JackHammer2 = new JackHammer("JackHammerTest2");
        assertNotEquals(JackHammer1, JackHammer2);
    }

    @Test
    void testToString() {
        JackHammer JackHammer = new JackHammer("JackHammerTest");
        assertEquals("JackHammer: JackHammerTest", JackHammer.toString());
    }
}