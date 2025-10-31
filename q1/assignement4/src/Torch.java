public class Torch extends ScaffoldingTower {
    public Torch(String requirements) {
        super(requirements);
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        Torch other = (Torch) obj;
        return this.getRequirements().equals(other.getRequirements());
    }

    public String toString() {
        return "Torch: " + this.getRequirements();
    }
}
