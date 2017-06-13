import java.io.*;

public class QuizCard implements Serializable{

    private static final long serialVersionUID = 1803013308722736560L;

    String question;
    String answer;

    public QuizCard(String q, String a){
        question = q;
        answer = a;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
