import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Wenzhong Jin on 15/9/11.
 */
public class player {
    private final ArrayList<String> races = new ArrayList<>(Arrays.asList("Human",
            "Flapper", "Bonzoid", "Ugaite", "Buzzite"));
    private final ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red",
            "Blue", "White", "Black", "Green"));


    private String name;
    private String race;
    private String color;

    public player(String name, String race, String color) {
        this.name = name;
        if (races.contains(race)) {
            this.race = race;
        }
        if （colors.contains(color) {
            this.color = color;
        }
    }

    public player(String name, String race) {
        player(name, race, null);
    }


    public void setName(String name) {
        if (name.length() > 10) {
            System.out.println("Name too long.");
        } else {
            this.name = name;
        }
    }
    public String getName() {
        return this.name;
    }
    public void setRace(String race) {
        if (races.contains(race)) {
            this.race = race;
        } else {
            System.out.println("Invalid race.")
        }
    }
    public String getRace() {
        return this.race;
    }
    public void setColor(String color) {
        if (colors.contains(color)) {
            this.color = color;
        } else {
            System.out.println("Invalid color.")
        }
    }
    public String getColor() {
        return this.color;
    }





}
