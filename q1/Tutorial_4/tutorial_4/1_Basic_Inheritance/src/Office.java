public class Office extends Building {
    int amountOfWorkers;

    public Office(String street, int value, int amountOfWorkers) {
        super(street, value);
        this.amountOfWorkers = amountOfWorkers;
    }

    public int getAmountOfWorkers() {
        return amountOfWorkers;
    }

    public void setAmountOfWorkers(int amountOfWorkers) {
        this.amountOfWorkers = amountOfWorkers;
    }
}
