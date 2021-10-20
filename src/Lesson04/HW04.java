package Lesson04;

public class HW04 {
    public static void main(String[] args){

        Phonebook phonebook = new Phonebook();

        System.out.println("Добавляем номера контактам:");
        phonebook.add("Иванов", "7123458754");
        phonebook.add("Иванов", "7944321321");
        phonebook.add("Петров", "7941321211");
        phonebook.add("Сидоров", "84212132132");
        phonebook.add("Смирнов", "8113213211");
        phonebook.add("Смирнов", "8113213211");
        System.out.println(" ");

        System.out.println("Готовые контакты");
        System.out.println("Иванов");
        System.out.println(phonebook.get("Иванов"));
        System.out.println("Петров");
        System.out.println(phonebook.get("Петров"));
        System.out.println("Сидоров");
        System.out.println(phonebook.get("Сидоров"));
        System.out.println("Смирнов");
        System.out.println(phonebook.get("Смирнов"));
        System.out.println(" ");

    }
}
