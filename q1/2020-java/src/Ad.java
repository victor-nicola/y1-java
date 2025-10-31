public class Ad {
    private String business;
    private int durationSec;
    private float value;

    /**
     * Default class constructor - initializes fields with default values
     */
    Ad() {
        this.business = "";
        this.durationSec = 0;
        this.value = 0;
    }

    /**
     * Set the business that the ad promotes
     * @param business - String containing the name of the business
     */
    public void setBusiness(String business) {
        this.business = business;
    }

    /**
     * Set the ad duration in seconds
     * @param durationSec - int of the duration in seconds
     */
    public void setDurationSec(int durationSec) {
        this.durationSec = durationSec;
    }

    /**
     * Set the ad value in euros
     * @param value - float of the value in euros
     */
    public void setValue(float value) {
        this.value = value;
    }

    /**
     * Get the business that the ad promotes
     * @return String containing the name of the promoted business
     */
    public String getBusiness() {
        return business;
    }

    /**
     * Get the ad duration in seconds
     * @return int representing ad duration in seconds
     */
    public int getDurationSec() {
        return durationSec;
    }

    /**
     * Get the ad value in euros
     * @return float representing ad value in euros
     */
    public float getValue() {
        return value;
    }
}
