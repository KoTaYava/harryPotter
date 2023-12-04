import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        grifindor student1 = new grifindor("Гарри", "Поттер", 65, 23, 14, 5, 8);
        grifindor student2 = new grifindor("Гермиона", "Грейнджер", 99, 99, 99, 99, 99);
        grifindor student3 = new grifindor("Рон", "Уизли", 67, 88, 43, 76, 23);
        slizerin student4 = new slizerin("Драко", "Малфой", 99, 99, 87, 67, 67, 12);
        slizerin student5 = new slizerin("Грегори", "Гойл", 1, 1, 43, 12, 11, 15);
        slizerin student6 = new slizerin("Грэхэм", "Монтегю", 1, 1, 43, 12, 11, 15);
        pufenduy student7 = new pufenduy("Захари ", "Смит", 15, 43, 14, 45, 8);
        pufenduy student8 = new pufenduy("Седрик", "Диггори", 19, 59, 29, 59, 19);
        pufenduy student9 = new pufenduy("Джастин ", "Финч-Флетчли", 67, 48, 43, 26, 23);
        kogtevran student10 = new kogtevran("Чжоу ", "Чанг", 19, 9, 17, 17, 27, 12);
        kogtevran student11 = new kogtevran("Падма ", "Патил", 1, 1, 43, 12, 11, 15);
        kogtevran student12 = new kogtevran("Маркус ", "Белби", 61, 14, 43, 62, 51, 15);
        grifindor.sila(student3,student1);
        slizerin.sila(student5,student6);
        kogtevran.sila(student11,student12);
        pufenduy.sila(student9,student8);
        student.si(student2,student12);
        student.di(student11,student10);

    }

        }












