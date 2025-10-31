public class JackHammer extends Equipment {
    public JackHammer(String requirements) {
        super(requirements);
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        JackHammer other = (JackHammer) obj;
        return this.getRequirements().equals(other.getRequirements());
    }

    public String toString() {
        return "JackHammer: " + this.getRequirements();
    }
}
