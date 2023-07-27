public class Ravenclaw extends Hodwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, String surname, int powerWitchcraft,
                     int transgression, int mind, int wisdom, int wit, int creativity) {
        super(name, surname, powerWitchcraft, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Когтевран: " + super.toString() +
                "ум - " + mind +
                ", мудрость - " + wisdom +
                ", остроумие - " + wit +
                ", творчество - " + creativity;
    }

    public void compareLearner(Ravenclaw student) {
        int Student1 = this.mind + this.wisdom + this.wit + this.creativity;
        int Student2 = student.mind + student.wisdom + student.wit + student.creativity;
        if (Student1 > Student2) {
            outputComparableStudent(this, student);
        } else if (Student1 < Student2) {
            outputComparableStudent(student, this);
        } else {
            System.out.println("Сила учеников одинакова.");
        }

    }

    private void outputComparableStudent (Ravenclaw bestStudent, Ravenclaw badStudent) {
        System.out.println(bestStudent.getName() + " " + bestStudent.getSurname() +
                " лучший Когтевранец, чем " + badStudent.getName() + " " + badStudent.getSurname());
    }
}
