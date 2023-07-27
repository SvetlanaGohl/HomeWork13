public abstract class Hodwarts {
    private String name;
    private String surname;
    private int powerWitchcraft;
    private int transgression;

    public Hodwarts(String name, String surname, int powerWitchcraft, int transgression) {
        this.name = name;
        this.surname = surname;
        this.powerWitchcraft = powerWitchcraft;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "имя - " + name + ", фамилия - " + surname + ", мощность колдовства - " + powerWitchcraft +
                ", трансрегрессия - " + transgression;
    }

    public void compareLearner(Hodwarts student) {
        int Student1 = this.powerWitchcraft + this.transgression;
        int Student2 = student.powerWitchcraft + student.transgression;
        if (Student1 > Student2) {
            outputComparableStudent(this, student);
        } else if (Student1 < Student2) {
            outputComparableStudent(student, this);
        } else {
            System.out.println("Сила учеников одинакова.");
        }

    }

    private void outputComparableStudent (Hodwarts bestStudent, Hodwarts badStudent) {
        System.out.println(bestStudent.getName() + " " + bestStudent.getSurname() +
                " обладает большей мощностью магии, чем " + badStudent.getName() + " " + badStudent.getSurname());
    }
}


