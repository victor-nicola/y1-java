import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScaffoldingTowerTest {

    @Test
    void testEqualsEquals() {
        ScaffoldingTower ScaffoldingTower1 = new ScaffoldingTower("ScaffoldingTowerTest");
        ScaffoldingTower ScaffoldingTower2 = new ScaffoldingTower("ScaffoldingTowerTest");
        assertEquals(ScaffoldingTower1, ScaffoldingTower2);
    }

    @Test
    void testEqualsSame() {
        ScaffoldingTower ScaffoldingTower = new ScaffoldingTower("ScaffoldingTowerTest");
        assertEquals(ScaffoldingTower, ScaffoldingTower);
    }

    @Test
    void testEqualsNull() {
        ScaffoldingTower ScaffoldingTower = new ScaffoldingTower("ScaffoldingTowerTest");
        assertNotEquals(null, ScaffoldingTower);
    }

    @Test
    void testEqualsDiffClass() {
        ScaffoldingTower ScaffoldingTower1 = new ScaffoldingTower("ScaffoldingTowerTest1");
        String str = "ScaffoldingTowerTest1";
        assertFalse(ScaffoldingTower1.equals(str));
    }

    @Test
    void testEqualsDiffRequirements() {
        ScaffoldingTower ScaffoldingTower1 = new ScaffoldingTower("ScaffoldingTowerTest1");
        ScaffoldingTower ScaffoldingTower2 = new ScaffoldingTower("ScaffoldingTowerTest2");
        assertNotEquals(ScaffoldingTower1, ScaffoldingTower2);
    }

    @Test
    void testToString() {
        ScaffoldingTower ScaffoldingTower = new ScaffoldingTower("ScaffoldingTowerTest");
        assertEquals("ScaffoldingTower: ScaffoldingTowerTest", ScaffoldingTower.toString());
    }
}