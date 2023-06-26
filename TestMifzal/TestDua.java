package TestMifzal;

import java.util.*;

public class TestDua {

    public static int[] getRankings(int[] scores, int[] gitsScores) {
        TreeSet<Integer> uniqueScores = new TreeSet<>(Collections.reverseOrder());
        for (int score : scores) {
            uniqueScores.add(score);
        }

        int[] rankings = new int[gitsScores.length];
        for (int i = 0; i < gitsScores.length; i++) {
            int gitsScore = gitsScores[i];
            uniqueScores.add(gitsScore);
            rankings[i] = uniqueScores.headSet(gitsScore).size() + 1;
        }

        return rankings;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah pemain: ");
        int n = scanner.nextInt();

        int[] scores = new int[n];
        System.out.println("Masukkan daftar skor: ");
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }

        System.out.print("Masukkan jumlah permainan GITS: ");
        int m = scanner.nextInt();

        int[] gitsScores = new int[m];
        System.out.println("Masukkan skor GITS: ");
        for (int i = 0; i < m; i++) {
            gitsScores[i] = scanner.nextInt();
        }

        int[] rankings = getRankings(scores, gitsScores);
        System.out.print("Output:  ");
        for (int ranking : rankings) {
            System.out.print(ranking + " ");
        }
    }
}