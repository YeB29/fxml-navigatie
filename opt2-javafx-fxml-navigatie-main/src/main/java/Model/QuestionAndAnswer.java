package Model;

public class QuestionAndAnswer {
    private String question;
    private Integer answer;

    public QuestionAndAnswer(String question, Integer answer){
        this.question = question;
        this.answer = answer;
    }

    public Integer getAnswer() {
        return answer;
    }

    public String getQuestion() {
        return question;
    }
}
