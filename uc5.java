import java.util.LinkedHashSet;

public class TrainConsistUC5 {
    public static void main(String[] args) {

        // Step 1: Create LinkedHashSet for train formation
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Step 2: Add bogies in order
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Step 3: Add duplicate intentionally
        train.add("Sleeper"); // Duplicate (will be ignored)

        // Step 4: Display final train formation
        System.out.println("Final Train Formation:");
        for (String bogie : train) {
            System.out.println(bogie);
        }
    }
}
