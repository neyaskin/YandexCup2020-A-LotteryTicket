import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        FileReader inputFile = new FileReader("input.txt");
        FileWriter outputFile = new FileWriter("output.txt");

        Scanner scanner = new Scanner(inputFile);

        String numbersSelectedByTheOrganizerString = scanner.nextLine();
        int[] numbersSelectedByTheOrganizerArray =
                Arrays.stream(numbersSelectedByTheOrganizerString.split(" "))
                        .mapToInt(Integer::parseInt).toArray();

        int numberOfTickets = Integer.parseInt(scanner.nextLine());
        ArrayList<int[]> ticketsArrays = new ArrayList<>();
        for (int q = 0; q != numberOfTickets; q++) {
            ticketsArrays.add(
                    Arrays.stream(scanner.nextLine().split(" "))
                            .mapToInt(Integer::parseInt).toArray());
        }

        inputFile.close();
        scanner.close();

        for (int[] ticket : ticketsArrays) {
            int result = 0;

            for (int number : ticket) {
                for (int selectedNumber : numbersSelectedByTheOrganizerArray) {
                    if (number == selectedNumber)
                        result++;
                }
            }
            if (result >= 3)
                outputFile.write("Lucky\n");
            else
                outputFile.write("Unlucky\n");
        }
        outputFile.flush();
        outputFile.close();
    }
}