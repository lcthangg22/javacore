public class Student1 {
    private int id;
    private double point;
    private int age;
    private String grade;

    public Student1() {
    }

    public Student1(int id, double point, int age, String grade) {
        this.id = id;
        this.point = point;
        this.age = age;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        int count = 0;
        if (count < 8) {
            System.out.println("Mã sinh viên gồm 8 ký tự!");
            return;
        }
        this.id = id;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        if (point < 0 && point > 10) {
            System.out.println("Điểm trung bình không hợp lệ!");
            return;
        } if (point >= 8) {
            System.out.println("Nhận được học bổng");
        }
        this.point = point;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18) {
            System.out.println("Tuổi phải lớn hơn hoặc bằng 18!");
        }
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "id=" + id +
                ", point=" + point +
                ", age=" + age +
                ", grade='" + grade + '\'' +
                '}';
    }
}
