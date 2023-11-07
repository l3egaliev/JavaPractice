package programs;


import java.text.DecimalFormat;
import java.time.LocalTime;
import java.util.Scanner;

public class WpmProgram {
    static String [] words = {"help", "phone", "people", "home", "person", "pages", "freedom", "default", "brunch", "nice",
    "top", "global", "network", "image", "believe", "car", "football", "lazy", "machine", "java", "program", "kids"};
//    "second", "with", "linux", "demon", "deploy", "lenovo", "russian", "language", "for", "king", "shine"};

    public static int countCorrectWords(String t){
        int count = 0;
        String [] typedWords = t.split(" ");
        for(String s : words){
           for (String tw : typedWords){
               if (s.equals(tw)){
                   count++;
               }
           }
        }
        return count;
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String typedWords = "";

        System.out.println("3");
        Thread.sleep(1000);

        System.out.println("2");
        Thread.sleep(1000);

        System.out.println("1");
        Thread.sleep(1000);

        for (String s : words){
            System.out.print(s+" ");
        }

        double start = LocalTime.now().toNanoOfDay();

        System.out.println();
        scanner = new Scanner(System.in);
        typedWords = scanner.nextLine();

        double end = LocalTime.now().toNanoOfDay();
        double elapsedTime = end - start;
        double seconds = elapsedTime / 1000000000.0;
        int numChars = typedWords.length();
        // wpm formula (x characters / 5) / 1min = y wpm
        double wpm = ((((double) numChars / 5) / seconds)*60);

        DecimalFormat decimalFormat = new DecimalFormat(".##");

        System.out.println("Your wpm is: "+decimalFormat.format(wpm)+" Correct words "+countCorrectWords(typedWords));

    }

}
