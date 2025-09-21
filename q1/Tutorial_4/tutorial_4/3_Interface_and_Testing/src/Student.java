public class Student extends Person implements HasToStudy {

    private boolean livesInDelft;
    private int studySessions;

    /**
     * Creates a student.
     *
     * @param name The name of the student
     * @param height The height of the student
     * @param livesInDelft Whether the student lives in Delft
     */
    public Student(String name, double height, boolean livesInDelft) {
        super(name, height);
        this.livesInDelft = livesInDelft;
        studySessions = 0;
    }

    /**
     * Gets whether the student lives in Delft.
     *
     * @return True iff this student lives in Delft
     */
    public boolean getLivesInDelft() {
        return livesInDelft;
    }

    /**
     * Sets whether the student lives in Delft.
     *
     * @param livesInDelft The new living status of this student
     */
    public void setLivesInDelft(boolean livesInDelft) {
        this.livesInDelft = livesInDelft;
    }

    public void study() {
        studySessions++;
    }

    public boolean willPassExam() {
        return studySessions >= 5;
    }

    public String toString() {
        return "<Student name=" + getName() + ", height=" + getHeight() + ", livesInDelft=" + livesInDelft + ">";
    }
}
