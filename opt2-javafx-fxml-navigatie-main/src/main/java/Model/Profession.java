package Model;

import java.util.ArrayList;

public class Profession {
    private ArrayList<String> profession;

    public Profession() {
        this.profession = new ArrayList<>();
    }

    public void addProfession() {
        profession.add("Farmer");
        profession.add("Carpenter");
        profession.add("Baker");
        profession.add("Cleaner");
        profession.add("Mechanic");
        profession.add("Teacher");
        profession.add("Nurse");
    }

    public ArrayList<String> getProfession() {
        return profession;
    }
}



