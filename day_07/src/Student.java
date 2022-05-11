public class Student {
    public int id;
    public String name;
    public int theoryPoint;
    public int practicePoint;

    public Student() {
    }

    public Student(int id, String name, int theoryPoint, int practicePoint) {
        this.id = id;
        this.name = name;
        this.theoryPoint = theoryPoint;
        this.practicePoint = practicePoint;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", theoryPoint=" + theoryPoint +
                ", practicePoint=" + practicePoint +
                '}';
    }
}
