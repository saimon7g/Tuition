import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class Team {
    String teamName;
    String carCode;
    String driverName;
    String grandPrix;
    int positionFinished;
    double fastestLap;

    public Team(String teamName, String carCode, String driverName, String grandPrix, int positionFinished,
            double fastestLap) {
        this.teamName = teamName;
        this.carCode = carCode;
        this.driverName = driverName;
        this.grandPrix = grandPrix;
        this.positionFinished = positionFinished;
        this.fastestLap = fastestLap;
    }
}

public class F1_race_dataRead {

    public static void main(String[] args) {

        System.out.println("Welcome to the FIA F1 Data Entry Program");
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many F1 Teams are there?");
        int numTeams = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        Team[] teams = new Team[numTeams + 20];
        for (int i = 0; i < numTeams; i++) {
            String teamName;
            String carCode;
            String driverName;
            String grandPrix;
            int positionFinished;
            double fastestLap;

            System.out.println("Enter the data:");
            // taking input Team Name which is a non empty string
            System.out.print("Team Name: ");
            teamName = scanner.nextLine();
            while (teamName.isEmpty() || teamName.isBlank()) {
                System.out.print("Invalid input. Please enter a valid team name: ");
                teamName = scanner.nextLine();
            }
            // taking input Car Code which is a non empty string
            System.out.print("Car Code: ");
            carCode = scanner.nextLine();
            while (carCode.isEmpty() || carCode.isBlank()) {
                System.out.print("Invalid input. Please enter a valid car code: ");
                carCode = scanner.nextLine();
            }
            // taking input Driver Name which is a non empty string
            System.out.print("Driver Name: ");
            driverName = scanner.nextLine();
            while (driverName.isEmpty() || driverName.isBlank()) {
                System.out.print("Invalid input. Please enter a valid driver name: ");
                driverName = scanner.nextLine();
            }
            // taking input Grand Prix which is a non empty string
            System.out.print("Grand Prix: ");
            grandPrix = scanner.nextLine();
            while (grandPrix.isEmpty() || grandPrix.isBlank()) {
                System.out.print("Invalid input. Please enter a valid grand prix: ");
                grandPrix = scanner.nextLine();
            }
            // taking input Position Finished which is an integer
            System.out.print("Position Finished: ");
            if (scanner.hasNextInt()) {
                positionFinished = scanner.nextInt();
                scanner.nextLine(); // Consume newline
            } else {
                while (true) {
                    if (scanner.hasNextInt()) {
                        positionFinished = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        break;
                    } else {
                        System.out.print("Invalid input");
                        scanner.nextLine();
                    }
                }
            }
            // taking input Fastest Lap which is a non negative double
            System.out.println("Fastest Lap: ");
            while (true) {
                if (scanner.hasNextDouble()) {
                    fastestLap = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    if (fastestLap > 0) {
                        // System.out.println("Valid input");
                        break;
                    } else {
                        System.out.println("Invalid input. Please enter a valid fastest lap time: ");
                    }
                } else {
                    System.out.print("Invalid input");
                    scanner.nextLine();
                }
            }
            // creating a new object of Team class and storing it in the array
            teams[i] = new Team(teamName, carCode, driverName, grandPrix, positionFinished, fastestLap);
        }
        int extra = 0;

        while (extra < 20) {
            System.out.println("Would you like to add more data? (Y or N)");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("N")) {
                break;
            } else if (!response.equalsIgnoreCase("Y")) {
                System.out.println("Invalid input");
                continue;
            } else {

                // extra data entry

                String teamName;
                String carCode;
                String driverName;
                String grandPrix;
                int positionFinished;
                double fastestLap;
                System.out.println("Enter the data:");
                System.out.print("Team Name: ");
                teamName = scanner.nextLine();
                while (teamName.isEmpty() || teamName.isBlank()) {
                    System.out.print("Invalid input. Please enter a valid team name: ");
                    teamName = scanner.nextLine();
                }
                System.out.print("Car Code: ");
                carCode = scanner.nextLine();
                while (carCode.isEmpty() || carCode.isBlank()) {
                    System.out.print("Invalid input. Please enter a valid car code: ");
                    carCode = scanner.nextLine();
                }
                System.out.print("Driver Name: ");
                driverName = scanner.nextLine();
                while (driverName.isEmpty() || driverName.isBlank()) {
                    System.out.print("Invalid input. Please enter a valid driver name: ");
                    driverName = scanner.nextLine();
                }
                System.out.print("Grand Prix: ");
                grandPrix = scanner.nextLine();
                while (grandPrix.isEmpty() || grandPrix.isBlank()) {
                    System.out.print("Invalid input. Please enter a valid grand prix: ");
                    grandPrix = scanner.nextLine();
                }
                System.out.print("Position Finished: ");
                if (scanner.hasNextInt()) {
                    positionFinished = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                } else {
                    while (true) {
                        if (scanner.hasNextInt()) {
                            positionFinished = scanner.nextInt();
                            scanner.nextLine(); // Consume newline
                            break;
                        } else {
                            System.out.print("Invalid input");
                            scanner.nextLine();
                        }
                    }
                }
                System.out.println("Fastest Lap: ");
                while (true) {
                    if (scanner.hasNextDouble()) {
                        fastestLap = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
                        if (fastestLap > 0) {
                            // System.out.println("Valid input");
                            break;
                        } else {
                            System.out.println("Invalid input. Please enter a valid fastest lap time: ");
                        }
                    } else {
                        System.out.print("Invalid input");
                        scanner.nextLine();
                    }
                }
                teams[numTeams + extra] = new Team(teamName, carCode, driverName, grandPrix, positionFinished,
                        fastestLap);
                extra++;

            }

        }

        System.out.println("The current data is looks like this:");
        for (int i = 0; i < numTeams + extra; i++) {
            System.out.println("Team Name: " + teams[i].teamName);
            System.out.println("Car Code: " + teams[i].carCode);
            System.out.println("Driver Name: " + teams[i].driverName);
            System.out.println("Grand Prix: " + teams[i].grandPrix);
            System.out.println("Position Finished: " + teams[i].positionFinished);
            System.out.println("Fastest Lap: " + teams[i].fastestLap);
            System.out.println();
        }
        System.out.println("What would you like to name your csv file?");
        String fileName = scanner.nextLine(); // taking input file name
        try {
            FileWriter fileWriter = new FileWriter(fileName + ".csv");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("Team Name,Car Code,Driver Name,Grand Prix,Position Finished,Fastest Lap");
            for (int i = 0; i < numTeams + extra; i++) {
                printWriter.println(teams[i].teamName + "," + teams[i].carCode + "," + teams[i].driverName + ","
                        + teams[i].grandPrix + "," + teams[i].positionFinished + "," + teams[i].fastestLap);
            }
            printWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            System.out.println("Start your programme again");
        }
        scanner.close();
    }
}
