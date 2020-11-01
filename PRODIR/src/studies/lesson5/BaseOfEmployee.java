package studies.lesson5;

public class BaseOfEmployee {
    //базовые переменные класса
    //добавить сотрудника, уволить сотрудника, происк сотрудника по фио, возрасту, должности, емейлу, телефону
    String Names, Position, email, phoneNumber;
    int salary, age, idEmployee;
    private static int couter = 0;

    public BaseOfEmployee() {
        this.Names = "no name";
        this.Position = "no profession";
        this.email = "no mail";
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
        this.couter++;
        idEmployee = couter;
    }

    public BaseOfEmployee(String names, String position, String email, String phoneNumber, int salary, int age) {
        Names = names;
        Position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
        this.couter++;
        idEmployee = couter;
    }

    @Override
    public String toString() {
        return "Employee №" + idEmployee + "{\n" +
                "ФИО сотрудника = '" + Names + '\''+'\n' +
                ", Должность = '" + Position + '\''+'\n' +
                ", email = '" + email + '\''+'\n' +
                ", номер телефона = " + phoneNumber +'\n' +
                ", зарплата = " + salary + " y.e. \n" +
                ", возраст = " + age +" лет" + '}';
    }
//    public void addEmployee(){
//
//    }
    public String getNames() {
        return Names;
    }

    public String getPosition() {
        return Position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setNames(String names) {
        Names = names;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSalary(int delta) {
        this.salary += delta;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printAll(){
        System.out.printf("ФИО сотрудника: q %s;\n\tДолжность: %s\n", Names, Position);
    }

//    public static void main(String[] args) {
//
//    }
}
