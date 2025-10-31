public class ScaffoldingTower extends Equipment {
    public ScaffoldingTower(String requirements) {
        super(requirements);
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        ScaffoldingTower other = (ScaffoldingTower) obj;
        return this.getRequirements().equals(other.getRequirements());
    }

    public String toString() {
        return "ScaffoldingTower: " + this.getRequirements();
    }
}
