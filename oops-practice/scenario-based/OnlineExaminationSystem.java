class ExamTimeExpiredException extends Exception {
    public ExamTimeExpiredException(String msg) {
        super(msg);
    }
}

interface EvaluationStrategy {
    int evaluate(String[] answers, String[] correctAnswers);
}

class ObjectiveEvaluation implements EvaluationStrategy {
    public int evaluate(String[] answers, String[] correctAnswers) {
        int score = 0;
        for(int i = 0; i < answers.length; i++) {
            if(answers[i].equals(correctAnswers[i])) {
                score += 10;
            }
        }
        return score;
    }
}

class DescriptiveEvaluation implements EvaluationStrategy {
    public int evaluate(String[] answers, String[] correctAnswers) {
        // manual grading simulation
        return answers.length * 8; // assuming avg marks
    }
}

class Question {
    private String question;
    private String answer;
    
    public Question(String q, String ans) {
        this.question = q;
        this.answer = ans;
    }
    
    public String getQuestion() {
        return question;
    }
    
    public String getAnswer() {
        return answer;
    }
}

class Exam {
    private String examId;
    private String title;
    private Question[] questions;
    private int duration;
    
    public Exam(String id, String title, Question[] ques, int duration) {
        this.examId = id;
        this.title = title;
        this.questions = ques;
        this.duration = duration;
    }
    
    public String[] getCorrectAnswers() {
        String[] ans = new String[questions.length];
        for(int i = 0; i < questions.length; i++) {
            ans[i] = questions[i].getAnswer();
        }
        return ans;
    }
    
    public String getTitle() {
        return title;
    }
}

class Student {
    private String name;
    private String rollNo;
    
    public Student(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    
    public void submitAnswers(Exam exam, String[] answers, boolean timeExpired, EvaluationStrategy eval) 
            throws ExamTimeExpiredException {
        if(timeExpired) {
            throw new ExamTimeExpiredException("Time expired, cannot submit");
        }
        int score = eval.evaluate(answers, exam.getCorrectAnswers());
        System.out.println(name + " scored " + score + " in " + exam.getTitle());
    }
}

public class OnlineExaminationSystem {
    public static void main(String[] args) {
        Question[] ques = {
            new Question("What is Java?", "A"),
            new Question("OOP full form?", "B")
        };
        
        Exam exam = new Exam("E1", "Java Basics", ques, 60);
        Student s1 = new Student("Ravi", "S101");
        
        String[] ans = {"A", "B"};
        
        try {
            s1.submitAnswers(exam, ans, false, new ObjectiveEvaluation());
            s1.submitAnswers(exam, ans, true, new ObjectiveEvaluation());
        } catch(ExamTimeExpiredException e) {
            System.out.println(e.getMessage());
        }
    }
}