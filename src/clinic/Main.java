package clinic;


public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Иванов Иван Иванович", 10);
        Nurse nurse = new Nurse("Петрова Мария Сергеевна", 5);

        System.out.println(doctor.getName());
        System.out.println(nurse.getExperience());

    }
}
