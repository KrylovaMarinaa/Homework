public class Main {
    public static void main (String [] args) {
        //Задание 1 - вывод информации о сотруднике в консоль

        System.out.println("Задание 1 - вывод информации о сотруднике в консоль");

        Employee employee = new Employee("Иванов Иван Иванович", "Программист",
                "ivan@mail.com", "+7 962 857 38 21", 40000, 25);
        employee.employeeToString();

        System.out.println("\n" + "Задание 2 - массив из 5 сотрудников:");

        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Иванов Иван Иванович", "Программист",
                "ivan@mail.com", "+7 962 857 38 21", 40000, 25);
        employees[1] = new Employee("Иванов Иван Иванович", "Программист",
                "ivan@mail.com", "+7 962 857 38 21", 40000, 25);
        employees[2] = new Employee("Иванов Иван Иванович", "Программист",
                "ivan@mail.com", "+7 962 857 38 21", 40000, 25);
        employees[3] = new Employee("Иванов Иван Иванович", "Программист",
                "ivan@mail.com", "+7 962 857 38 21", 40000, 25);
        employees[4] = new Employee("Иванов Иван Иванович", "Программист",
                "ivan@mail.com", "+7 962 857 38 21", 40000, 25);

        for (int i = 0; i < employees.length; i++) {

            System.out.println("\n" + "Сотрудник " + (i + 1) + " :");

            employees[i].employeeToString();
        }

        System.out.println("\n" + "Задание 3 - парк со внутренник классом аттракционы");

        Park park = new Park("Парк 1");
        park.addAttraction("Парк 1", "10:00 - 22:00", 300.5);
        park.addAttraction("Парк 2", "10:00 - 22:00", 300.5);
        park.displayAttractions();


    }
}
