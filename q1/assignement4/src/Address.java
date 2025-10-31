class Address {
    private final String street;
    int number;
    private final String zipCode;
    private final String city;

    public Address(String street, int number, String zipCode, String city) {
        this.street = street;
        this.number = number;
        this.zipCode = zipCode;
        this.city = city;
    }

    public String getStreet() {
        return this.street;
    }

    public int getNumber() {
        return this.number;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public String getCity() {
        return this.city;
    }

    @Override
    public String toString() {
        return street + " " + number + " " + zipCode + " " + city;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass())
            return false;
        Address other = (Address) obj;
        return this.street.equals(other.getStreet()) && this.number == other.getNumber() && this.zipCode.equals(other.getZipCode()) && this.city.equals(other.getCity());
    }
}