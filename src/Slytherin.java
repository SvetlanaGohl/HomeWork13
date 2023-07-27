public class Slytherin extends Hodwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int powerLust;

    public Slytherin(String name, String surname, int powerWitchcraft, int transgression, int cunning,
                     int determination, int ambition, int resourcefulness, int powerLust) {
        super(name, surname, powerWitchcraft, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.powerLust = powerLust;
    }

    @Override
    public String toString() {
        return "Слизерин: " + super.toString() +
                "хитрость - " + cunning +
                ", решительность - " + determination +
                ", амбициозность - " + ambition +
                ", находчивость - " + resourcefulness +
                ", жажда власти - " + powerLust;
    }

    public void compareLearner(Slytherin student) {
        int Student1 = this.cunning + this.determination + this.ambition + this.resourcefulness + this.powerLust;
        int Student2 = student.cunning + student.determination + student.ambition + student.resourcefulness + student.powerLust;
        if (Student1 > Student2) {
            outputComparableStudent(this, student);
        } else if (Student1 < Student2) {
            outputComparableStudent(student, this);
        } else {
            System.out.println("Сила учеников одинакова.");
        }

    }

    private void outputComparableStudent (Slytherin bestStudent, Slytherin badStudent) {
        System.out.println(bestStudent.getName() + " " + bestStudent.getSurname() +
                " лучший Слизеринец, чем " + badStudent.getName() + " " + badStudent.getSurname());
    }
}
