package use_case.clear_users;
import use_case.clear_users.ClearOutputBoundary;

import java.util.ArrayList;
// TODO Complete me

public class ClearInteractor implements ClearInputBoundary{

    final ClearUserDataAccessInterface dataAccessObject;
    final ClearOutputBoundary presenter;

    @Override
    public void clear() {
        ArrayList<String> names = dataAccessObject.deleteAllUsers();
        ClearOutputData outputData = new ClearOutputData(names);
        presenter.present(outputData);
    }

    public ClearInteractor(ClearUserDataAccessInterface dataAccessObject, ClearOutputBoundary presenter) {
        this.dataAccessObject = dataAccessObject;
        this.presenter = presenter;
    }
}
