public class Hufflepuff extends Hodwarts {
    private int hardworking;
    private int loyalty;
    private int honest;

    public Hufflepuff(String name, String surname, int powerWitchcraft,
                      int transgression, int hardworking, int loyalty, int honest) {
        super(name, surname, powerWitchcraft, transgression);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honest = honest;
    }

    @Override
    public String toString() {
        return "Пуффендуй: " + super.toString() +
                "трудолюбие - " + hardworking +
                ", верность - " + loyalty +
                ", честность - " + honest;
    }

    public void compareLearner(Hufflepuff student) {
        int Student1 = this.hardworking + this.loyalty + this.honest;
        int Student2 = student.hardworking + student.loyalty + student.honest;
        if (Student1 > Student2) {
            outputComparableStudent(this, student);
        } else if (Student1 < Student2) {
            outputComparableStudent(student, this);
        } else {
            System.out.println("Сила учеников одинакова.");
        }

    }

    private void outputComparableStudent (Hufflepuff bestStudent, Hufflepuff badStudent) {
        System.out.println(bestStudent.getName() + " " + bestStudent.getSurname() +
                " лучший Пуффендуец, чем " + badStudent.getName() + " " + badStudent.getSurname());
    }
}
