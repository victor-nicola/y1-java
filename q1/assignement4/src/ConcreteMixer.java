public class ConcreteMixer extends Equipment {
    public ConcreteMixer(String requirements) {
        super(requirements);
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        ConcreteMixer other = (ConcreteMixer) obj;
        return this.getRequirements().equals(other.getRequirements());
    }

    public String toString() {
        return "ConcreteMixer: " + this.getRequirements();
    }
}
