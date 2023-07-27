import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Gryffindor garry = new Gryffindor("Гарри", "Поттер", 80,90, 51, 84, 59);
        Gryffindor hermione = new Gryffindor("Гермиона", "Грейнджер", 78, 54,23,18, 21);
        Gryffindor ron = new Gryffindor("Рон", "Уизли",64, 81, 49, 78, 33);
        Hufflepuff zahariya = new Hufflepuff("Захария", "Смит", 25, 98, 56, 36, 74);
        Hufflepuff sedrik = new Hufflepuff("Седрик", "Диггори", 86, 26, 76, 29, 42);
        Hufflepuff justin = new Hufflepuff("Джастин", "Финч-Флетчли", 68, 57, 43, 89, 37);
        Ravenclaw jou = new Ravenclaw("Чжоу", "Чанг", 61, 94, 23, 85, 39, 85);
        Ravenclaw padma = new Ravenclaw("Падма", "Патил", 67, 29, 94, 24, 19, 67);
        Ravenclaw markus = new Ravenclaw("Маркус", "Белби", 95, 34, 64, 59, 29, 73);
        Slytherin drako = new Slytherin("Драко", "Малфой", 80, 63, 46, 29, 38, 29, 69);
        Slytherin grehem = new Slytherin("Грэхэм", "Монтегю", 69, 59, 81, 61, 92, 83, 27);
        Slytherin gregory = new Slytherin("Грегори", "Гойл", 92, 17, 64, 62, 83, 15, 38);

        System.out.println(garry);
        System.out.println(hermione);
        System.out.println(ron);
        System.out.println(zahariya);
        System.out.println(sedrik);
        System.out.println(justin);
        System.out.println(jou);
        System.out.println(padma);
        System.out.println(markus);
        System.out.println(drako);
        System.out.println(grehem);
        System.out.println(gregory);

        System.out.println("_________________");
        garry.compareLearner(ron);
        sedrik.compareLearner(justin);
        padma.compareLearner(markus);
        drako.compareLearner(grehem);

        System.out.println("_________________");
        jou.compareLearner(drako);


    }
}
