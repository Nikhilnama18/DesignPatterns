package org.example.State;

public class UserExperienceState implements FormState{

    @Override
    public void next(RegistrationForm form) {
        if(form.getOccupation() == null || form.getExperience() == null){
            System.out.println("Fill the details");
            return ;
        }
        form.setState(new UserLocationState());
        System.out.println("Moved to location stage");
    }

    @Override
    public void previous(RegistrationForm form) {
        form.setState(new UserDetailsState());
        System.out.println("Moved to details state");
    }

    @Override
    public void display(RegistrationForm form) {
        System.out.println("User occupation is "+ form.getOccupation());
        System.out.println("User experience is "+ form.getExperience());
    }

    @Override
    public void enterData(RegistrationForm form, String... data) {
        form.setOccupation(data[0]);
        form.setExperience(data[1]);
        System.out.println("Entered user occupation");
    }
}
