package org.example.State;

public class RegistrationForm {
    private String name;
    private String email;
    private String occupation;
    private String experience;
    private String location;
    private String pinCode;

    FormState currentState;

    public RegistrationForm(){
        this.currentState = new UserDetailsState();
    }

    public void setState(FormState state){
        this.currentState = state;
    }

    public void enterData(String... values) {
        currentState.enterData(this, values);
    }

    public void next() {
        currentState.next(this);
    }

    public void previous() {
        currentState.previous(this);
    }

    public void displayCurrentStep() {
        currentState.display(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }
}
