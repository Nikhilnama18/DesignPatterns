package org.example.State;

public class UserLocationState implements FormState{

    @Override
    public void next(RegistrationForm form) {
        if(form.getLocation() == null || form.getPinCode()== null){
            System.out.println("Enter location details");
            return ;
        }
        System.out.println("This is the last stage");
    }

    @Override
    public void previous(RegistrationForm form) {
        form.setState(new UserExperienceState());
        System.out.println("Moved to occupation state");
    }

    @Override
    public void display(RegistrationForm form) {
        System.out.println("User Location is " + form.getLocation());
        System.out.println("User pinCode is " + form.getPinCode());
    }

    @Override
    public void enterData(RegistrationForm form, String... data) {
        form.setLocation(data[0]);
        form.setPinCode(data[1]);
        System.out.println("Entered location details");
    }
}
