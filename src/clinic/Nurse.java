package clinic;

//public class Nurse extends Personal{
//    public Nurse(String name, String position) {
//        super(name, position);
//    }
//
//}
class Nurse implements Worker {
    protected String name;
    protected int experience;

    public Nurse(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getExperience() {
        return experience;
    }
}

