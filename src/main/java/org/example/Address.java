package org.example;

public class Address {
    private final String country;
    private final String city;
    private final String street;
    private final int streetNumber;
    private final String postalCode;

    public Address(String country, String city, String street, int streetNumber, String postalCode) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.streetNumber = streetNumber;
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", streetNumber=" + streetNumber +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
