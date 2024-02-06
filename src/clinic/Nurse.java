package clinic;

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

