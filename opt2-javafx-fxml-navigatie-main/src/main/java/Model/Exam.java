package Model;

import Model.QuestionAndAnswer;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam {

    private String examName;
    private Integer amountOfQuestions;
    private Integer normQuestions;
    private ArrayList<QuestionAndAnswer> bevat;



    public Exam(String examName, Integer amountOfQuestions ,Integer normQuestions){
        this.examName = examName;
        this.amountOfQuestions = amountOfQuestions;
        this.normQuestions = normQuestions;
        this.bevat = new ArrayList<QuestionAndAnswer>();
    }

    public void addQuestionAndAnswer(String question, Integer answer){
        this.bevat.add(new QuestionAndAnswer(question, answer));
    }

    public QuestionAndAnswer getQuestionAndAnswer(int positie){
        return this.bevat.get(positie);
    }

//    public void makeExam(){
//        Exam examWis = new Exam("wiskunde",20, 15);
//        examWis.addQuestionAndAnswer("1+1?", 3);
//        examWis.addQuestionAndAnswer("1+1?", 3);
//        examWis.addQuestionAndAnswer("1+1?", 3);
//        examWis.addQuestionAndAnswer("1+1?", 3);
//
//    }
//    public void takeExam(){
//        Exam examWis;
//        examWis.getQuestionAndAnswer(0).getQuestion();
//        System.out.println();
//
//        examWis.getQuestionAndAnswer(0).getAnswer()
//    }
}
