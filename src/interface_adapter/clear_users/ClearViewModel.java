package interface_adapter.clear_users;

// TODO Complete me

import java.util.ArrayList;

public class ClearViewModel {

    private final ArrayList<String> names;

    public ClearViewModel(ArrayList<String> names) {
        this.names = names;
    }

    public ArrayList<String> getNames() {
        return names;
    }

}
