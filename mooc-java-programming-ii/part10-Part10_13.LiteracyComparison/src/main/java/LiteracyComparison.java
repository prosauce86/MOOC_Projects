
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LiteracyComparison {

    public static void main(String[] args) {

        // read file into new ArrayList, sort it, and print
        readAndSort("literacy.csv").forEach(System.out::println);
    }

    public static List<Country> readAndSort(String file) {
        try {
            return Files.lines(Paths.get(file))
                    .map(line -> line.split(","))
                    .map(parts -> new Country(parts[3], parts[2], Integer.parseInt(parts[4]), parts[5]))
                    .sorted((country1, country2) -> {
                        return country1.getLiteracyPercentage().compareTo(country2.getLiteracyPercentage());
                    })
                    .collect(Collectors.toList());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return new ArrayList<>();
    }
}