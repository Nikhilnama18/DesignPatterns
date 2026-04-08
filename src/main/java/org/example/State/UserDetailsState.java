package org.example.State;

public class UserDetailsState implements FormState{

    @Override
    public void next(RegistrationForm form) {
        if(form.getName() == null || form.getEmail() == null){
            System.out.println("Fill the details");
            return ;
        }
        form.setState(new UserExperienceState());
        System.out.println("Moved to experience stage");
    }

    @Override
    public void previous(RegistrationForm form) {
        System.out.println("This is the first stage in the form");
    }

    @Override
    public void display(RegistrationForm form) {
        System.out.println("User name is "+ form.getName());
        System.out.println("User email is "+ form.getEmail());
    }

    @Override
    public void enterData(RegistrationForm form, String... data) {
        form.setName(data[0]);
        form.setEmail(data[1]);
        System.out.println("Entered user details");
    }
}
