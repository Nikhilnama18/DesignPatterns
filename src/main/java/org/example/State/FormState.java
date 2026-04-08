package org.example.State;

public interface FormState {
    public void next(RegistrationForm form);
    public void previous(RegistrationForm form);
    public void display(RegistrationForm form);
    public void enterData(RegistrationForm form, String... data);
}
