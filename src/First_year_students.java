import java.io.BufferedReader;
import java.io.InputStreamReader;

public class First_year_students {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        University.getInstance();
        Group group = new Group();
        Professor professor = new Professor();
        System.out.println("Please, enter the group number (Valid numbers in the range from 0 to 4)");
        try {
            int n = Integer.parseInt(br.readLine());
            group = University.getGroup(n);
            System.out.println("Please, enter the name of professor (Valid names: Ivanov, Petrov, Sidorov)");
            String name = br.readLine();
            professor = University.getProfessor(name);
            professor.rollCall(group);
            group.chooseElderGroup();
        }
        catch (Exception e) {
            System.out.println("You entered incorrect information, try again later");
        }


    }
}
