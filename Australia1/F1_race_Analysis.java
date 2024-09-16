import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class F1_race_Analysis {
    public static void main(String[] args) {
        System.out.println("Welcome to the FIA F1 Analysis Program");
        System.out.println("Enter the name of the file containing the data:");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        while (fileName.isEmpty() || fileName.isBlank()) {
            System.out.println("Invalid input. Please enter a valid file name: ");
            fileName = scanner.nextLine();
        }
        // get the number of teams from csv file
        int numTeams = 0;
        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                numTeams++;
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        System.out.println("Number of teams: " + numTeams);
        // create an array of teams
        Team[] teams = new Team[numTeams + 20];
        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);
            fileScanner.nextLine();
            int i = 0;
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] data = line.split(",");
                String teamName = data[0];
                String carCode = data[1];
                String driverName = data[2];
                String grandPrix = data[3];
                int positionFinished = Integer.parseInt(data[4]);
                double fastestLap = Double.parseDouble(data[5]);
                teams[i] = new Team(teamName, carCode, driverName, grandPrix, positionFinished, fastestLap);
                i++;
                System.out.println("Team Name: " + teamName + ", Car Code: " + carCode + ", Driver Name: " + driverName
                        + ", Grand Prix: " + grandPrix + ", Position Finished: " + positionFinished + ", Fastest Lap: "
                        + fastestLap);
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // ask the user if they want to analyze all teams or a single team
        while (true) {
            System.out.println("An All Teams analysis or a Single Team analysis? (Enter 'all' or 'single')");
            String analysisType = scanner.nextLine();
            if (analysisType.equalsIgnoreCase("all")) {
                System.out.println("All Teams Analysis:");
                // List each of the teams that competed with at least one driver completing the
                // race.
                System.out.println("Teams that competed with at least one driver completing the");
                Team[] teams2 = new Team[numTeams];
                // copy the teams that have a positionFinished greater than 0
                for (int i = 0; i < numTeams; i++) {
                    if (teams[i] != null && teams[i].positionFinished > 0) {
                        teams2[i] = teams[i];
                    }
                }
                // print the unique team names
                for (int i = 0; i < numTeams; i++) {
                    if (teams2[i] != null) {
                        boolean isUnique = true;
                        for (int j = i + 1; j < numTeams; j++) {
                            if (teams2[j] != null && teams2[i].teamName.equalsIgnoreCase(teams2[j].teamName)) {
                                isUnique = false;
                                break;
                            }
                        }
                        if (isUnique) {
                            System.out.println(teams2[i].teamName);
                        }
                    }
                }
                // List each of the teams that had no driver complete the race.
                System.out.println("Teams that had no driver complete the race:");
                Team[] teams3 = new Team[numTeams];
                // copy the teams that have a positionFinished less than or equal to 0
                for (int i = 0; i < numTeams; i++) {
                    if (teams[i] != null && teams[i].positionFinished <= 0) {
                        teams3[i] = teams[i];
                    }
                }
                // print the unique team names
                for (int i = 0; i < numTeams; i++) {
                    if (teams3[i] != null) {
                        boolean isUnique = true;
                        for (int j = i + 1; j < numTeams; j++) {
                            if (teams3[j] != null && teams3[i].teamName.equalsIgnoreCase(teams3[j].teamName)) {
                                isUnique = false;
                                break;
                            }
                        }
                        if (isUnique) {
                            System.out.println("Team Name: " + teams3[i].teamName);
                        }
                    }
                }
                // Calculate the fastest team of the race. Each team has 2 drivers. Add their
                // fastest time together and the lowest time is the fastest team. If a driver
                // did not finish the race,
                // their time for the calculation is set to 205.50 seconds. Display this to the
                // user.
                System.out.println("The fastest team of the race");
                double fastestTeamTime = 9999999999.0;
                Team[] teams4 = new Team[numTeams];
                Team fastestTeam = null;

                for (int i = 0; i < numTeams; i++) {
                    if (teams[i] != null) {
                        for (int j = i + 1; j < numTeams; j++) {
                            if (teams[j] != null && teams[i].teamName.equalsIgnoreCase(teams[j].teamName)) {
                                double driver1Time = teams[i].fastestLap;
                                double driver2Time = teams[j].fastestLap;
                                if (driver1Time == 0) {
                                    driver1Time = 205.50;
                                }
                                if (driver2Time == 0) {
                                    driver2Time = 205.50;
                                }
                                double teamTime = driver1Time + driver2Time;
                                if (teamTime < fastestTeamTime) {
                                    fastestTeamTime = teamTime;
                                    // create a new object of Team class and store it in the fastestTeam variable of
                                    // fastestlap
                                    fastestTeam = new Team(teams[i].teamName, teams[i].carCode, teams[i].driverName,
                                            teams[i].grandPrix, teams[i].positionFinished, teams[i].fastestLap);
                                }
                            }
                        }
                    }
                }
                if (fastestTeam != null) {
                    System.out.println("The fastest team of the race is " + fastestTeam.teamName + " with a time of "
                            + fastestTeamTime + " seconds");
                }

                // Sort the teams according to which was fastest and display to the user in
                // descending order.
                System.out.println("Teams sorted by fastest time in descending order:");
                Team[] teams5 = new Team[numTeams];
                int count = 0;

                // calculating finishing time of each team
                for (int i = 0; i < numTeams; i++) {
                    if (teams[i] != null) {
                        for (int j = i + 1; j < numTeams; j++) {
                            if (teams[j] != null && teams[i].teamName.equalsIgnoreCase(teams[j].teamName)) {
                                double driver1Time = teams[i].fastestLap;
                                double driver2Time = teams[j].fastestLap;
                                if (driver1Time == 0) {
                                    driver1Time = 205.50;
                                }
                                if (driver2Time == 0) {
                                    driver2Time = 205.50;
                                }
                                double teamTime = driver1Time + driver2Time;
                                teams5[count] = new Team(teams[i].teamName, teams[i].carCode, teams[i].driverName,
                                        teams[i].grandPrix, teams[i].positionFinished, teamTime);
                                count++;
                            }
                        }
                    }
                }
                // sorting the teams in descending order

                Team[] teamsFinal = new Team[count];
                int temp = 0;
                for (int i = 0; i < count; i++) {
                    double min = 1000000000.0;
                    int index = -1;
                    for (int j = 0; j < count; j++) {
                        if (teams5[j].fastestLap < min) {
                            min = teams5[j].fastestLap;
                            index = j;
                        }
                    }
                    teamsFinal[temp] = new Team(teams5[index].teamName, teams5[index].carCode, teams5[index].driverName,
                            teams5[index].grandPrix, teams5[index].positionFinished, teams5[index].fastestLap);
                    teams5[index].fastestLap = 1000000000.0;
                    temp++;
                }
                for (int i = 0; i < count; i++) {
                    System.out.println("Team Name: " + teamsFinal[i].teamName + ", Car Code: " + teamsFinal[i].carCode
                            + ", Driver Name: " + teamsFinal[i].driverName + ", Grand Prix: " + teamsFinal[i].grandPrix
                            + ", Position Finished: " + teamsFinal[i].positionFinished + ", Fastest Lap: "
                            + teamsFinal[i].fastestLap);
                }

                // Sort the drivers according to who was fastest and display to the user in
                // descending order.
                System.out.println("Drivers sorted by fastest time in descending order:");
                Team[] teams6 = new Team[numTeams];
                // copy the teams
                for (int i = 0; i < numTeams; i++) {
                    if (teams[i] != null) {
                        teams6[i] = teams[i];
                    }
                }
                Team[] drivers = new Team[numTeams * 2];
                int count2 = 0;
                // sorting the drivers in descending order
                for (int i = 0; i < numTeams; i++) {
                    if (teams6[i] != null) {
                        int pos = 0;
                        double time = 0;
                        for (int j = 0; j < numTeams; j++) {
                            if (teams6[j] != null) {
                                if (teams6[j].fastestLap > time) {
                                    time = teams6[j].fastestLap;
                                    pos = j;
                                }
                            }
                        }
                        drivers[count2] = new Team(teams6[pos].teamName, teams6[pos].carCode, teams6[pos].driverName,
                                teams6[pos].grandPrix, teams6[pos].positionFinished, teams6[pos].fastestLap);
                        teams6[pos].fastestLap = 0;
                        count2++;
                    }
                }
                for (int i = 0; i < count2; i++) {
                    System.out.println(
                            "Driver Name: " + drivers[i].driverName + " with a time of " + drivers[i].fastestLap
                                    + " seconds");
                }
                // Sort the drivers according to who was fastest and display to the user in
                // ascending order.
                System.out.println("Drivers sorted by fastest time in ascending order:");
                for (int i = count2 - 1; i >= 0; i--) {
                    System.out.println(
                            "Driver Name: " + drivers[i].driverName + " with a time of " + drivers[i].fastestLap
                                    + " seconds");
                }

                System.out.println("Would you like to exit? (Enter 'exit' to exit)");
                String response = scanner.nextLine();
                if (response.equalsIgnoreCase("exit")) {
                    break;
                }

            } else if (analysisType.equalsIgnoreCase("single")) {
                System.out.println("Which Team?");
                String desiredTeam = scanner.nextLine();
                while (desiredTeam.isEmpty() || desiredTeam.isBlank()) {
                    System.out.println("Invalid input. Please enter a valid team name: ");
                    desiredTeam = scanner.nextLine();
                }

                // Allow the user to filter teams based on Car Code and display the driver names
                // to the user,fastest driver listed first.
                System.out.println("Filter teams based on Car Code:");
                Team[] teams7 = new Team[numTeams];
                int count3 = 0;
                for (int i = 0; i < numTeams; i++) {
                    if (teams[i] != null && teams[i].teamName.equalsIgnoreCase(desiredTeam)) {
                        teams7[count3] = teams[i];
                        count3++;
                    }
                }
                if (count3 == 0) {
                    System.out.println("No teams found with the given team name");
                } else {
                    Team[] drivers = new Team[count3];
                    int count4 = 0;
                    for (int i = 0; i < count3; i++) {
                        // sort the drivers in ascending order
                        if (teams7[i] != null) {
                            int pos = 0;
                            double time = 1000000000.0;
                            for (int j = 0; j < count3; j++) {
                                if (teams7[j] != null) {
                                    if (teams7[j].fastestLap < time) {
                                        time = teams7[j].fastestLap;
                                        pos = j;
                                    }
                                }
                            }
                            drivers[count4] = new Team(teams7[pos].teamName, teams7[pos].carCode,
                                    teams7[pos].driverName,
                                    teams7[pos].grandPrix, teams7[pos].positionFinished, teams7[pos].fastestLap);
                            teams7[pos].fastestLap = 1000000000.0;
                            count4++;
                        }

                    }
                    for (int i = 0; i < count4; i++) {
                        System.out.println(
                                "Driver Name: " + drivers[i].driverName + "with car :" + drivers[i].carCode
                                        + " with a time of " + drivers[i].fastestLap
                                        + " seconds");

                    }
                }

                // ask to exit or continue
                System.out.println("Would you like to exit? (Enter 'exit' to exit)");
                String response = scanner.nextLine();
                if (response.equalsIgnoreCase("exit")) {
                    break;
                }

            } else {
                System.out.println("Invalid input. Please enter 'all' or 'single'");
            }

        }
    }
}
