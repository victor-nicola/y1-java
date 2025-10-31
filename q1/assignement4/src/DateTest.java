import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    void getDay() {
        Date d = new Date(19, 10, 2006);
        assertEquals(19, d.getDay());
    }

    @Test
    void getMonth() {
        Date d = new Date(19, 10, 2006);
        assertEquals(10, d.getMonth());
    }

    @Test
    void getYear() {
        Date d = new Date(19, 10, 2006);
        assertEquals(2006, d.getYear());
    }

    @Test
    void testToString() {
        Date d = new Date(19, 10, 2006);
        assertEquals("19/10/2006", d.toString());
    }

    @Test
    void testEqualsEquals() {
        Date d1 = new Date(19, 10, 2006);
        Date d2 = new Date(19, 10, 2006);
        assertEquals(d1, d2);
    }

    @Test
    void testEqualsSame() {
        Date d = new Date(19, 10, 2006);
        assertEquals(d, d);
    }

    @Test
    void testEqualsNull() {
        Date d = new Date(19, 10, 2006);
        assertNotEquals(null, d);
    }

    @Test
    void testEqualsDiffDay() {
        Date d1 = new Date(18, 10, 2006);
        Date d2 = new Date(19, 10, 2006);
        assertNotEquals(d1, d2);
    }

    @Test
    void testEqualsDiffMonth() {
        Date d1 = new Date(19, 11, 2006);
        Date d2 = new Date(19, 10, 2006);
        assertNotEquals(d1, d2);
    }

    @Test
    void testEqualsDiffYear() {
        Date d1 = new Date(19, 10, 2005);
        Date d2 = new Date(19, 10, 2006);
        assertNotEquals(d1, d2);
    }
}