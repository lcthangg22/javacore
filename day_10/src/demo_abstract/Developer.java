package demo_abstract;

public class Developer extends Employee{
    private int overtimeHours;

    public Developer() {
    }

    public Developer(int id, String name, String email, int basicSalary, int overtimeHours) {
        super(id, name, email, basicSalary);
        this.overtimeHours = overtimeHours;
    }

    @Override
    int calculateSalary() {
        return getBasicSalary() + overtimeHours*200000;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }
}
