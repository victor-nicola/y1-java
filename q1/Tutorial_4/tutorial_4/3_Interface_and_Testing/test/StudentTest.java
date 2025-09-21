import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void willPassExamTestTrue() {
        Student s = new Student("Victor", 1.86, true);
        s.study();
        s.study();
        s.study();
        s.study();
        s.study();
        assertTrue(s.willPassExam());
    }

    @Test
    void willPassExamTestFalse() {
        Student s = new Student("Victor", 1.86, true);
        assertFalse(s.willPassExam());
    }

    @Test
    void getNameTest() {
        Student s = new Student("Victor", 1.86, true);
        assertEquals("Victor", s.getName());
    }

    @Test
    void getHeightTest() {
        Student s = new Student("Victor", 1.86, true);
        assertEquals(1.86, s.getHeight());
    }

    @Test
    void setHeightTest() {
        Student s = new Student("Victor", 1.8, true);
        s.setHeight(1.86);
        assertEquals(1.86, s.getHeight());
    }

    @Test
    void getLivesInDelftTest() {
        Student s = new Student("Victor", 1.86, true);
        assertTrue(s.getLivesInDelft());
    }

    @Test
    void setLivesInDelftTest() {
        Student s = new Student("Victor", 1.86, false);
        s.setLivesInDelft(true);
        assertTrue(s.getLivesInDelft());
    }

    @Test
    void toStringTest() {
        Student s = new Student("Victor", 1.86, true);
        assertEquals("<Student name=Victor, height=1.86, livesInDelft=true>", s.toString());
    }
}