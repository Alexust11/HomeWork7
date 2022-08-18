public class Main {
    public static void main(String[] args) {
//        Задача 1
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + ' ' + middleName + ' ' + lastName;
        System.out.println("ФИО сотрудника — " + fullName);
//        Задача 2
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
//        Задача 3
        fullName = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника — " + fullName.replace('ё', 'е'));
    }
}