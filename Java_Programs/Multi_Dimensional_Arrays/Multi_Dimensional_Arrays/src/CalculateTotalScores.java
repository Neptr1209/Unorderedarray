public class CalculateTotalScores {
    public static void main(String[] args) {
        // Sample 3D array: [7 students][5 exams][2 parts each]
        int[][][] scores = {
            // Student 0
            {{10, 20}, {15, 25}, {20, 30}, {25, 35}, {30, 40}},
            // Student 1
            {{11, 21}, {16, 26}, {21, 31}, {26, 36}, {31, 41}},
            // Student 2
            {{12, 22}, {17, 27}, {22, 32}, {27, 37}, {32, 42}},
            // Student 3
            {{13, 23}, {18, 28}, {23, 33}, {28, 38}, {33, 43}},
            // Student 4
            {{14, 24}, {19, 29}, {24, 34}, {29, 39}, {34, 44}},
            // Student 5
            {{15, 25}, {20, 30}, {25, 35}, {30, 40}, {35, 45}},
            // Student 6
            {{16, 26}, {21, 31}, {26, 36}, {31, 41}, {36, 46}}
        };

        // Calculate and display total scores for each student
        for (int student = 0; student < scores.length; student++) {
            int totalScore = 0;
            
            // Sum all exam parts for this student
            for (int exam = 0; exam < scores[student].length; exam++) {
                for (int part = 0; part < scores[student][exam].length; part++) {
                    totalScore += scores[student][exam][part];
                }
            }
            
            System.out.println("Student " + student + " total score: " + totalScore);
        }
    }
}