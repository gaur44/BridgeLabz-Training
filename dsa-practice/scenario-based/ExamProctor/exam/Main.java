package exam;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        NavigationStack nav = new NavigationStack();
        AnswerStore store = new AnswerStore();

        // correct answers
        HashMap<Integer, String> correct = new HashMap<>();
        correct.put(1, "A");
        correct.put(2, "B");
        correct.put(3, "C");

        // student navigation
        nav.visitQuestion(1);
        nav.visitQuestion(2);
        nav.visitQuestion(3);

        // student answers
        store.saveAnswer(1, "A");
        store.saveAnswer(2, "C");
        store.saveAnswer(3, "C");

        System.out.println("Last visited question: " + nav.lastVisited());

        int score = store.calculateScore(correct);
        System.out.println("Final Score: " + score);
    }
}

