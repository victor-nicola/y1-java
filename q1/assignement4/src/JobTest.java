import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

class JobTest {
    @BeforeEach
    void resetJobTotal() throws Exception {
        java.lang.reflect.Field field = Job.class.getDeclaredField("jobTotal");
        field.setAccessible(true);
        field.set(null, 0);
    }

    @Test
    void getJobNumberTest() {
        List<Equipment> equipment = new ArrayList<>();
        equipment.add(new Torch("Gas"));
        Job j = new Job(new Address("Aan't Verlaat", 33, "2612XW", "Delft"),
                "Build something", equipment,
                new Date(19, 10, 2006));
        assertEquals(1, j.getJobNumber());
    }

    @Test
    void getLocationTest() {
        List<Equipment> equipment = new ArrayList<>();
        equipment.add(new Torch("Gas"));
        Job j = new Job(new Address("Aan't Verlaat", 33, "2612XW", "Delft"),
                "Build something", equipment,
                new Date(19, 10, 2006));
        assertEquals(new Address("Aan't Verlaat", 33, "2612XW", "Delft"), j.getLocation());
    }

    @Test
    void getDescriptionTest() {
        List<Equipment> equipment = new ArrayList<>();
        equipment.add(new Torch("Gas"));
        Job j = new Job(new Address("Aan't Verlaat", 33, "2612XW", "Delft"),
                "Build something", equipment,
                new Date(19, 10, 2006));
        assertEquals("Build something", j.getDescription());
    }

    @Test
    void getPlannedDateTest() {
        List<Equipment> equipment = new ArrayList<>();
        equipment.add(new Torch("Gas"));
        Job j = new Job(new Address("Aan't Verlaat", 33, "2612XW", "Delft"),
                "Build something", equipment,
                new Date(19, 10, 2006));
        assertEquals(new Date(19, 10, 2006), j.getPlannedDate());
    }

    @Test
    void getRequiredEquipmentTest() {
        List<Equipment> equipment = new ArrayList<>();
        equipment.add(new Torch("Gas"));
        Job j = new Job(new Address("Aan't Verlaat", 33, "2612XW", "Delft"),
                "Build something", equipment,
                new Date(19, 10, 2006));
        assertEquals(equipment, j.getRequiredEquipment());
    }

    @Test
    void getJobTotalTest() {
        List<Equipment> equipment = new ArrayList<>();
        equipment.add(new Torch("Gas"));
        Job j = new Job(new Address("Aan't Verlaat", 33, "2612XW", "Delft"),
                "Build something", equipment,
                new Date(19, 10, 2006));
        assertEquals(1, j.getJobTotal());
    }

    @Test
    void testToString() {
        List<Equipment> equipment = new ArrayList<>();
        equipment.add(new Torch("Gas"));
        Job j = new Job(new Address("Aan't Verlaat", 33, "2612XW", "Delft"),
                "Build something", equipment,
                new Date(19, 10, 2006));
        String ans = "1 " + j.getLocation().toString() + " Build something " + equipment.toString() + " " + j.getPlannedDate().toString();
        assertEquals(ans, j.toString());
    }

    @Test
    void testEqualsEquals() {
        List<Equipment> equipment = new ArrayList<>();
        equipment.add(new Torch("Gas"));
        Job j1 = new Job(new Address("Aan't Verlaat", 33, "2612XW", "Delft"),
                "Build something", equipment,
                new Date(19, 10, 2006));
        Job j2 = new Job(new Address("Aan't Verlaat", 33, "2612XW", "Delft"),
                "Build something", equipment,
                new Date(19, 10, 2006));
        assertEquals(j1, j2);
    }

    @Test
    void testEqualsSame() {
        List<Equipment> equipment = new ArrayList<>();
        equipment.add(new Torch("Gas"));
        Job j = new Job(new Address("Aan't Verlaat", 33, "2612XW", "Delft"),
                "Build something", equipment,
                new Date(19, 10, 2006));
        assertEquals(j, j);
    }

    @Test
    void testEqualsNull() {
        List<Equipment> equipment = new ArrayList<>();
        equipment.add(new Torch("Gas"));
        Job j = new Job(new Address("Aan't Verlaat", 33, "2612XW", "Delft"),
                "Build something", equipment,
                new Date(19, 10, 2006));
        assertNotEquals(null, j);
    }

    @Test
    void testEqualsDiffClass() {
        List<Equipment> equipment = new ArrayList<>();
        equipment.add(new Torch("Gas"));
        Job j = new Job(new Address("Aan't Verlaat", 33, "2612XW", "Delft"),
                "Build something", equipment,
                new Date(19, 10, 2006));
        Date d = new Date(19, 10, 2006);
        assertNotEquals(d, j);
    }

    @Test
    void testEqualsDiffLocation() {
        List<Equipment> equipment = new ArrayList<>();
        equipment.add(new Torch("Gas"));
        Job j1 = new Job(new Address("Aan't Verlaat", 33, "2612XW", "Delft"),
                "Build something", equipment,
                new Date(19, 10, 2006));
        Job j2 = new Job(new Address("Aan't Verlaat", 31, "2612XW", "Delft"),
                "Build something", equipment,
                new Date(19, 10, 2006));
        assertNotEquals(j1, j2);
    }

    @Test
    void testEqualsDiffDescription() {
        List<Equipment> equipment = new ArrayList<>();
        equipment.add(new Torch("Gas"));
        Job j1 = new Job(new Address("Aan't Verlaat", 33, "2612XW", "Delft"),
                "Build something", equipment,
                new Date(19, 10, 2006));
        Job j2 = new Job(new Address("Aan't Verlaat", 33, "2612XW", "Delft"),
                "Build nothing", equipment,
                new Date(19, 10, 2006));
        assertNotEquals(j1, j2);
    }

    @Test
    void testEqualsDiffEquipmentLen() {
        List<Equipment> equipment1 = new ArrayList<>();
        equipment1.add(new Torch("Gas"));
        List<Equipment> equipment2 = new ArrayList<>();
        equipment2.add(new Torch("Gas"));
        equipment2.add(new JackHammer("Electricity"));
        Job j1 = new Job(new Address("Aan't Verlaat", 33, "2612XW", "Delft"),
                "Build something", equipment1,
                new Date(19, 10, 2006));
        Job j2 = new Job(new Address("Aan't Verlaat", 31, "2612XW", "Delft"),
                "Build something", equipment2,
                new Date(19, 10, 2006));
        assertNotEquals(j1, j2);
    }

    @Test
    void testEqualsDiffEquipment() {
        List<Equipment> equipment1 = new ArrayList<>();
        equipment1.add(new Torch("Gas"));
        List<Equipment> equipment2 = new ArrayList<>();
        equipment2.add(new JackHammer("Electricity"));
        Job j1 = new Job(new Address("Aan't Verlaat", 33, "2612XW", "Delft"),
                "Build something", equipment1,
                new Date(19, 10, 2006));
        Job j2 = new Job(new Address("Aan't Verlaat", 31, "2612XW", "Delft"),
                "Build something", equipment2,
                new Date(19, 10, 2006));
        assertNotEquals(j1, j2);
    }

    @Test
    void testEqualsDiffDate() {
        List<Equipment> equipment = new ArrayList<>();
        equipment.add(new Torch("Gas"));
        Job j1 = new Job(new Address("Aan't Verlaat", 33, "2612XW", "Delft"),
                "Build something", equipment,
                new Date(19, 10, 2006));
        Job j2 = new Job(new Address("Aan't Verlaat", 33, "2612XW", "Delft"),
                "Build something", equipment,
                new Date(20, 10, 2006));
        assertNotEquals(j1, j2);
    }
}