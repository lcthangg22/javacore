public class KiemChungVien extends NhanVien{
    private int salaryBasic;
    private int error;

    private int Salary;

    public KiemChungVien() {
    }

    public KiemChungVien(int id, String name, int age, String phone, String email, int salaryBasic, int error) {
        super(id, name, age, phone, email);
        this.salaryBasic = salaryBasic;
        this.error = error;
    }

    public int getSalaryBasic() {
        return salaryBasic;
    }

    public void setSalaryBasic(int salaryBasic) {
        this.salaryBasic = salaryBasic;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public int tinhLuong() {
        int luong;
        luong = salaryBasic + error * 50000;
        return luong;
    }

    @Override
    public String toString() {
        return "KiemChungVien{" + "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", phone='" + super.getPhone() + '\'' +
                ", email='" + super.getEmail() + '\'' +
                ", salaryBasic=" + salaryBasic +
                ", error=" + error + ", Salary=" + tinhLuong() +
                '}';
    }
}
