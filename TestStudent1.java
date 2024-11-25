import java.util.Scanner;

class Student {
    private String name;
    private int grade1, grade2, grade3;
    private double average;

    void Setgrade1(int g1) {
        grade1 = g1;
    }

    void Setgrade2(int g2) {
        grade2 = g2;
    }

    void Setgrade3(int g3) {
        grade3 = g3;
    }

    int Getgrade1() {
        return grade1;
    }

    int Getgrade2() {
        return grade2;
    }

    int Getgrade3() {
        return grade3;
    }

    int readGrades() { //method that reads grades. 
        Scanner input = new Scanner(System.in);
        int g1, g2, g3;
        String name;
        char choice;
        do {
            System.out.println(" --Please enter the student name: ");
            name = input.next();
            SetName(name);
            System.out.println(" --Please enter the first grade: ");
            g1 = input.nextInt();
            Setgrade1(g1);

            System.out.println(" --Please enter the the second grade: ");
            g2 = input.nextInt();
            Setgrade2(g2);
            System.out.println(" --Please enter the the third grade: ");
            g3 = input.nextInt();
            Setgrade3(g3);
            System.out.println(" Do you want to continue?  enter the number ");
            System.out.println(" 1- YES     2- NO ");
            choice = input.next().charAt(0);
        }
        while (choice != '2');
        return choice;
    }

    void SetAverage(double avr) {
        average = avr;
    }

    double GetAverage() {
        average = (grade1 + grade2 + grade3) / 3;
        return average;
    }

    void SetName(String name1) {
        name = name1;
    }

    String getName() {
        return name;
    }
}

public class TestStudent1 {
    public static void main(String args[]) {
        Student student = new Student();
        student.readGrades();
        student.GetAverage();
        double i = 0;
        double average = student.GetAverage();
        if (i < average) {
            i = average;

            System.out.println("THE HIGHEST AVG :" + i);
        }
    }
}