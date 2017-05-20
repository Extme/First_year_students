import java.util.ArrayList;


public class Professor {
    private String name;
    private String subject;

    public Professor(){
    }

    public Professor (String name, String subject){
        this.name = name;
        this.subject = subject;
    }

    public String getName(){
        return this.name;
    }

    // метод пробрасывает исключение в main, при некорректном вводе данных
    public void rollCall(Group group) throws Exception {
        if (name == null) throw new Exception();
        else {
            System.out.println("Professor " + name + " of " + subject + " makes a roll call. " +
                    "Following students are presence in auditory:");
            for (int i = 0; i < group.COUNTOFSTUDENTS; i++) {
                if (group.getStudents().get(i).getPresence())
                    System.out.print(" " + group.getStudents().get(i).getName());
            }
            System.out.println("");
        }
    }
}
