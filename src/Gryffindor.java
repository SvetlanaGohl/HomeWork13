public class Gryffindor extends Hodwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, String surname, int powerWitchcraft,
                      int transgression, int nobility, int honor, int bravery) {
        super(name, surname, powerWitchcraft, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }


    @Override
    public String toString() {
        return "Гриффиндор: " + super.toString() +
                "благородство - " + nobility +
                ", честь - " + honor +
                ", храбрость - " + bravery;
    }

    public void compareLearner(Gryffindor student) {
        int Student1 = this.nobility + this.honor + this.bravery;
        int Student2 = student.nobility + student.honor + student.bravery;
        if (Student1 > Student2) {
            outputComparableStudent(this, student);
        } else if (Student1 < Student2) {
            outputComparableStudent(student, this);
            } else {
            System.out.println("Сила учеников одинакова.");
        }

    }

    private void outputComparableStudent (Gryffindor bestStudent, Gryffindor badStudent) {
        System.out.println(bestStudent.getName() + " " + bestStudent.getSurname() +
                " лучший Гриффендорец, чем " + badStudent.getName() + " " + badStudent.getSurname());
    }
}
