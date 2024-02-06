package clinic;

import main.Illness;
import main.Owner;

import java.time.LocalDate;

public class Personal {
    private String name;
    private String position;

    public Personal(String name, String position) {
        this.name = name;
        this.position = position;
    }
    public Personal(){this("Name", "position");}

}




