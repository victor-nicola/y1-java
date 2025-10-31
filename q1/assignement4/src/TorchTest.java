import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TorchTest {

    @Test
    void testEqualsEquals() {
        Torch Torch1 = new Torch("TorchTest");
        Torch Torch2 = new Torch("TorchTest");
        assertEquals(Torch1, Torch2);
    }

    @Test
    void testEqualsSame() {
        Torch Torch = new Torch("TorchTest");
        assertEquals(Torch, Torch);
    }

    @Test
    void testEqualsNull() {
        Torch Torch = new Torch("TorchTest");
        assertNotEquals(null, Torch);
    }

    @Test
    void testEqualsDiffClass() {
        Torch Torch1 = new Torch("TorchTest1");
        String str = "TorchTest1";
        assertFalse(Torch1.equals(str));
    }

    @Test
    void testEqualsDiffRequirements() {
        Torch Torch1 = new Torch("TorchTest1");
        Torch Torch2 = new Torch("TorchTest2");
        assertNotEquals(Torch1, Torch2);
    }

    @Test
    void testToString() {
        Torch Torch = new Torch("TorchTest");
        assertEquals("Torch: TorchTest", Torch.toString());
    }
}