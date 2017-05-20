import java.util.ArrayList;
import java.util.Random;

/**
 * Created by ь on 18.05.2017.
 */
public class Group {
    final static int COUNTOFSTUDENTS = 20;
    private int groupId = 0;
    private ArrayList<Student> students = new ArrayList<Student>();

    public Group(){
    }

    // конструктор принимает в качестве аргумента номер группы и инициализирует 20 объетов класса Student
    public Group(int groupId){
        this.groupId = groupId;
        Random leadership = new Random();// поле leadership класса Student определяется рандомно
        Random presence = new Random();// присутствие также генерируется случайным образом
        for (int i = 0; i < COUNTOFSTUDENTS; i++){
            Student student = new Student("Student" + i, leadership.nextInt(100), presence.nextBoolean());
            students.add(student);
        }
    }



    // геттер для группы студентов
    public ArrayList<Student> getStudents(){
        return this.students;
    }

    //определяем старосту группы по величине поля leadership класса Student
    public void chooseElderGroup(){
        Student elder = students.get(0);
        for (int i = 0; i < COUNTOFSTUDENTS; i++){
            if (elder.getLeadership() < students.get(i).getLeadership())
                elder = students.get(i);
        }
        elder.addElderGroup();
        System.out.println("The elder of this group is " + elder.getName()+".");
    }
}
