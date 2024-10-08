public class Employee
{
    String fullName;
    String post;
    String email;
    String phone;
    int salary;
    int age;

    public Employee(String fullName, String post, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }


    public void employeeToString() {
        System.out.println("Информация о сотруднике: " + '\n' + "ФИО:" + fullName + '\'' + '\n'+ "Должность: " + post + '\n'+ "почта: " + email + '\n'+
                "телефон: " + phone + '\n'+ "зарплата: " + salary + '\n'+ "возраст: " + age );
    }
};


