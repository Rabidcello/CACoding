package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.signup.SignupViewModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

public class ClearPresenter implements ClearOutputBoundary {
    @Override
    public void present(ClearOutputData outputData) {
        System.out.println(outputData.getNames());
        SignupViewModel.clearUsers(outputData.getNames());
    }
}
