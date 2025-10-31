import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcreteMixerTest {

    @Test
    void getRequirementsTest() {
        ConcreteMixer concreteMixer = new ConcreteMixer("ConcreteMixerTest");
        assertEquals("ConcreteMixerTest", concreteMixer.getRequirements());
    }

    @Test
    void testEqualsEquals() {
        ConcreteMixer concreteMixer1 = new ConcreteMixer("ConcreteMixerTest");
        ConcreteMixer concreteMixer2 = new ConcreteMixer("ConcreteMixerTest");
        assertEquals(concreteMixer1, concreteMixer2);
    }

    @Test
    void testEqualsSame() {
        ConcreteMixer concreteMixer = new ConcreteMixer("ConcreteMixerTest");
        assertEquals(concreteMixer, concreteMixer);
    }

    @Test
    void testEqualsNull() {
        ConcreteMixer concreteMixer = new ConcreteMixer("ConcreteMixerTest");
        assertNotEquals(null, concreteMixer);
    }

    @Test
    void testEqualsDiffClass() {
        ConcreteMixer concreteMixer1 = new ConcreteMixer("ConcreteMixerTest1");
        String str = "ConcreteMixerTest1";
        assertFalse(concreteMixer1.equals(str));
    }

    @Test
    void testEqualsDiffRequirements() {
        ConcreteMixer concreteMixer1 = new ConcreteMixer("ConcreteMixerTest1");
        ConcreteMixer concreteMixer2 = new ConcreteMixer("ConcreteMixerTest2");
        assertNotEquals(concreteMixer1, concreteMixer2);
    }

    @Test
    void testToString() {
        ConcreteMixer concreteMixer = new ConcreteMixer("ConcreteMixerTest");
        assertEquals("ConcreteMixer: ConcreteMixerTest", concreteMixer.toString());
    }
}