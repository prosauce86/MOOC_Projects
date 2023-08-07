
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String filename = scan.nextLine();

        ArrayList<String> teamStats = new ArrayList<>();
        try (Scanner fileReader = new Scanner(Paths.get(filename))) {
            while (fileReader.hasNextLine()) {
                teamStats.add(fileReader.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("File not found");
        }

        int games = 0, wins = 0, losses = 0;
        System.out.println("Team: ");
        String search = scan.nextLine();
        for (String stat : teamStats) {
            if (stat.contains(search)) {
                games++;
                String[] record = stat.split(",");
                if (record[0].equals(search)) { // searched team in position 1
                    if (Integer.parseInt(record[2]) > Integer.parseInt(record[3])) {
                        wins++;
                    } else {
                        losses++;
                    }
                } else { // searched team in position 2
                    if (Integer.parseInt(record[2]) < Integer.parseInt(record[3])) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
        }
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }

}