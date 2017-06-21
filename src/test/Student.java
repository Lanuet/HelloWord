package test;

/**
 * Created by nguye on 6/20/2017.
 */
public class Student {
    int age;
    String name;
    double scoreAverage;

    public Student() {
    }

    public Student(int age, String name, double scoreAverage) {
        this.age = age;
        this.name = name;
        this.scoreAverage = scoreAverage;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScoreAverage() {
        return scoreAverage;
    }

    public void setScoreAverage(double scoreAverage) {
        this.scoreAverage = scoreAverage;
    }
    public void rate (){
        if (scoreAverage < 6.0) {
            System.out.println("Trung binh");
        }
        else if (scoreAverage >= 6.0 && scoreAverage <8.0){
            System.out.println("Kha");
        }
        else if (scoreAverage >= 8.0 && scoreAverage<9.0)
            System.out.println("Gioi");
        else System.out.println("Xat sac");
    }
    public void show () {
        System.out.println("Ten: " + getName());
        System.out.println("Tuoi: " + getAge());
        System.out.print("Xep loai: ");
        rate();
    }
}
