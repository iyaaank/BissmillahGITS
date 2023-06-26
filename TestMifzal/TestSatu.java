package TestMifzal;

import java.util.Scanner;

public class TestSatu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen yang ingin ditampilkan: ");
        int n = scanner.nextInt();
        scanner.close();

        int[] sequence = testsatu(n);
        String output = formatSequence(sequence);
        System.out.println("Output: " + output);
    }

    public static int[] testsatu(int n) {
        int[] sequence = new int[n];
        sequence[0] = 1;
        for (int i = 1; i < n; i++) {
            sequence[i] = sequence[i - 1] + i;
        }
        return sequence;
    }

    public static String formatSequence(int[] sequence) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sequence.length; i++) {
            sb.append(sequence[i]);
            if (i < sequence.length - 1) {
                sb.append("-");
            }
        }
        return sb.toString();
    }
}
