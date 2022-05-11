public class LapTrinhVien extends NhanVien {
    private int salaryBasic;
    private int overtimeHours;

    public LapTrinhVien() {
    }

    public LapTrinhVien(int id, String name, int age, String phone, String email, int salaryBasic, int overtimeHours) {
        super(id, name, age, phone, email);
        this.salaryBasic = salaryBasic;
        this.overtimeHours = overtimeHours;
    }

    public int getSalaryBasic() {
        return salaryBasic;
    }

    public void setSalaryBasic(int salaryBasic) {
        this.salaryBasic = salaryBasic;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public int tinhLuong() {
        int luong;
        luong = salaryBasic + overtimeHours * 200000;
        return luong;
    }

    @Override
    public String toString() {
        return "LapTrinhVien{" + "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", phone='" + super.getPhone() + '\'' +
                ", email='" + super.getEmail() + '\'' +
                ", salaryBasic=" + salaryBasic +
                ", overtimeHours=" + overtimeHours + ", Salary=" + tinhLuong() +
                '}';
    }
}
