
public class Student {
    private String name;
    private Integer leadership; // переменная которая позволяет определить старосту
    private boolean presence;
    private boolean elderGroup = false;

    public Student(){
    }

    public Student(String name, Integer leadership, boolean presence){
        this.name = name;
        this.leadership = leadership;
        this.presence = presence;
    }

    public void addElderGroup(){
        this.elderGroup = true;
    }


    public int getLeadership(){
        return this.leadership;
    }

    public boolean getPresence(){
        return this.presence;
    }

    public String getName(){
        return name;
    }

}
