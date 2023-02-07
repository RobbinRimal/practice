package org.example.map;

public class Person {
    private  Long nationalID;
    private  String nationality;
    private String fristName;
    private  String lastName;

    public Long getNationalID() {
        return nationalID;
    }

    public void setNationalID(Long nationalID) {
        this.nationalID = nationalID;
    }

    public String getFristName() {
        return fristName;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
