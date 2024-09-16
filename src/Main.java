public class Main {
    public static void main(String[] args) {
        System.out.println("Task one");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника - " + fullName);

        System.out.println("Task two");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета - " + fullName.toUpperCase());

        System.out.println("Task three");
        String fullNameSecond = "Иванов Семён Семёнович";
        System.out.println("Данные Ф. И. О. сотрудника - " + fullNameSecond.replace('ё', 'е'));
    }
}