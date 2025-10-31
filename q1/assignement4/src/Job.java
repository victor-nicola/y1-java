import java.util.GregorianCalendar;
import java.util.List;

public class Job {
    protected int jobNumber;
    private Address location;
    private String description;
    private List<Equipment> requiredEquipment;
    private Date plannedDate;
    private static int jobTotal = 0;

    public Job(Address location, String description, List<Equipment> requiredEquipment, Date plannedDate) {
        this.location = location;
        this.description = description;
        this.plannedDate = plannedDate;
        this.requiredEquipment = requiredEquipment;
        jobTotal++;
        this.jobNumber = jobTotal;
    }

    public int getJobNumber() {
        return jobNumber;
    }

    public Address getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public Date getPlannedDate() {
        return plannedDate;
    }

    public List<Equipment> getRequiredEquipment() {
        return requiredEquipment;
    }

    public int getJobTotal() {
        return jobTotal;
    }

    public String toString() {
        return jobNumber + " " + location.toString() + " " + description + " " + requiredEquipment.toString() + " " + plannedDate;
    }

    public boolean equals(Object o) {
        if (o == null || o.getClass() != this.getClass())
            return false;
        Job j = (Job) o;
        if (this.requiredEquipment.size() != j.getRequiredEquipment().size())
            return false;
        for (int i = 0; i < this.requiredEquipment.size(); i++) {
            if (!this.requiredEquipment.get(i).equals(j.getRequiredEquipment().get(i)))
                return false;
        }
        return location.equals(j.getLocation()) && description.equals(j.getDescription()) && plannedDate.equals(j.getPlannedDate());
    }
}
