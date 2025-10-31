import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AddressTest {

    @Test
    void testGetStreet() {
        Address add = new Address("Aan't Verlaat", 33, "2612XW", "Delft");
        assertEquals("Aan't Verlaat", add.getStreet());
    }

    @Test
    void testGetNumber() {
        Address add = new Address("Aan't Verlaat", 33, "2612XW", "Delft");
        assertEquals(33, add.getNumber());
    }
    @Test
    void testGetZipCode() {
        Address add = new Address("Aan't Verlaat", 33, "2612XW", "Delft");
        assertEquals("2612XW", add.getZipCode());
    }
    @Test
    void testGetCity() {
        Address add = new Address("Aan't Verlaat", 33, "2612XW", "Delft");
        assertEquals("Delft", add.getCity());
    }

    @Test
    void testToString() {
        Address add = new Address("Aan't Verlaat", 33, "2612XW", "Delft");
        String expected = "Aan't Verlaat 33 2612XW Delft";
        assertEquals(expected, add.toString());
    }

    @Test
    void testEqualsEqual() {
        Address add1 = new Address("Aan't Verlaat", 33, "2612XW", "Delft");
        Address add2 = new Address("Aan't Verlaat", 33, "2612XW", "Delft");
        assertEquals(add1, add2);
    }

    @Test
    void testEqualsSame() {
        Address add = new Address("Aan't Verlaat", 33, "2612XW", "Delft");
        assertEquals(add, add);
    }

    @Test
    void testEqualsNull() {
        Address add = new Address("Aan't Verlaat", 33, "2612XW", "Delft");
        assertNotEquals(null, add);
    }

    @Test
    void testEqualsDiffClass() {
        Address add = new Address("Aan't Verlaat", 33, "2612XW", "Delft");
        String str = "Aan't Verlaat 33 2612XW";
        assertNotEquals(str, add);
    }

    @Test
    void testEqualsDiffStreet() {
        Address add1 = new Address("Aan't Verlaat", 33, "2612XW", "Delft");
        Address add2 = new Address("Rarau", 33, "2612XW", "Delft");
        assertNotEquals(add1, add2);
    }

    @Test
    void testEqualsDiffNumber() {
        Address add1 = new Address("Aan't Verlaat", 33, "2612XW", "Delft");
        Address add2 = new Address("Aan't Verlaat", 31, "2612XW", "Delft");
        assertNotEquals(add1, add2);
    }

    @Test
    void testEqualsDiffZipCode() {
        Address add1 = new Address("Aan't Verlaat", 33, "2612XW", "Delft");
        Address add2 = new Address("Aan't Verlaat", 33, "2612XZ", "Delft");
        assertNotEquals(add1, add2);
    }

    @Test
    void testEqualsDiffCity() {
        Address add1 = new Address("Aan't Verlaat", 33, "2612XW", "Delft");
        Address add2 = new Address("Aan't Verlaat", 33, "2612XW", "Rotterdam");
        assertNotEquals(add1, add2);
    }
}