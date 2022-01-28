import java.util.Scanner;

public class Exercise_7 {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            int result = getSentenceSize(scan.nextLine());
            System.out.println(result);
            if (result == 0) {
                break;
            }
        }
    }

    public static int getSentenceSize(String string) {
        char[] chars = string.toCharArray();
        boolean word = false;
        int count = 0;
        for (char c : chars) {
            if (c == ' ') {
                word = false;
            } else if (!word){
                count++;
                word = true;
            }
        }
        return count;
    }

}