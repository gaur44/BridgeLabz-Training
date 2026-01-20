package exam;

import java.util.HashMap;

class AnswerStore {
    private HashMap<Integer, String> answers = new HashMap<>();

    void saveAnswer(int qid, String ans) {
        answers.put(qid, ans);
    }

    int calculateScore(HashMap<Integer, String> correct) {
        int score = 0;

        for (int qid : answers.keySet()) {
            if (answers.get(qid).equals(correct.get(qid))) {
                score++;
            }
        }
        return score;
    }
}

