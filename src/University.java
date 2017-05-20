import java.util.ArrayList;

// Используем паттерн "Singleton", так как в рамках ТЗ нежелательна возможность создания нескольких объектов этого класса
public class University {
    final static int COUNTOFGROUPS = 5;// количество групп - 5, по умолчанию
    private static University instance = null;
    private static ArrayList<Group> groups = new ArrayList<Group>();//университет состоит из групп
    private static ArrayList<Professor> professors = new ArrayList<Professor>();//и преподавателей

    // Приватный конструктор для реализации паттерна
    private University(){
    }

    // В статическом блоке при создании экземпляра сразу инициализируем группы студентов и профессоров
    static {
        for (int i = 0; i < COUNTOFGROUPS; i++){
            groups.add(new Group(i));
        }
        professors.add(new Professor ("Ivanov", "Mathematics"));
        professors.add(new Professor ("Petrov", "Physics"));
        professors.add(new Professor ("Sidorov","Computer science"));
    }

    // "Геттер" возвращает группу по номеру
    public static Group getGroup(int number) throws IndexOutOfBoundsException{
            return groups.get(number);
    }

    // Поиск определенного профессора по имени
    public static Professor getProfessor(String name){
        Professor search = new Professor();
        for (int i = 0; i < professors.size(); i++){
            if (professors.get(i).getName().equals(name)) search = professors.get(i);
        }
        return search;
    }

    // Реализация паттерна для однопоточной программы
    public static University getInstance(){
        if (instance == null) instance = new University();
        return instance;
    }

}
