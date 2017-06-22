package test;

/**
 * Created by nguye on 6/20/2017.
 */
public class Student {
    private int age; // số tuổi
    private String name; //tên sinh viên
    private double scoreAverage; // điểm trung bình học kỳ

    /*
    * Hàm khởi tạo mặc định
    * */
    public Student() {
    }

    /*
    * Hàm khởi tạo có tham số
    * */
    public Student(int age, String name, double scoreAverage) {
        this.age = age;
        this.name = name;
        this.scoreAverage = scoreAverage;
    }

    /**
     * Lấy số tuổi
     *
     * @return age
     */

    public int getAge() {
        return age;
    }

    /*
    * Thiết lập số tuổi
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /*
    get name
    @return name
     */
    public String getName() {
        return name;
    }

    /*
    Set name
    @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /*
    get score average
    @return score average
     */
    public double getScoreAverage() {
        return scoreAverage;
    }

    /*
    set score average
    @param scoreAverage
     */
    public void setScoreAverage(double scoreAverage) {
        this.scoreAverage = scoreAverage;
    }

    /*
    Caculate rate for student from scoreAverage
     */
    public void rate() {
        if (scoreAverage < 6.0) {
            System.out.println("Trung binh");
        } else if (scoreAverage >= 6.0 && scoreAverage < 8.0) {
            System.out.println("Kha");
        } else if (scoreAverage >= 8.0 && scoreAverage < 9.0)
            System.out.println("Gioi");
        else System.out.println("Xat sac");
    }

    /*
    show information of student
     */
    public void show() {
        System.out.println("Ten: " + getName());
        System.out.println("Tuoi: " + getAge());
        System.out.print("Xep loai: ");
        rate();
    }
}
