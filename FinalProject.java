import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FinalProject {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("[N] New Student Record");
            System.out.println("[O] Open Student Record");
            System.out.println("[X] Exit");
            System.out.print("Enter Your Choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "N":
                    System.out.println("Enter Student Details:");
                    Student student = new Student();

                    System.out.print("Student Number: ");
                    student.setStudentNumber(scanner.nextLine().trim());

                    System.out.print("Degree: ");
                    student.setDegree(scanner.nextLine().trim());

                    System.out.print("Year Level: ");
                    student.setYearLevel(Integer.parseInt(scanner.nextLine()));

                    System.out.print("First Name: ");
                    student.setFirstName(scanner.nextLine().trim());

                    System.out.print("Middle Name: ");
                    student.setMiddleName(scanner.nextLine().trim());

                    System.out.print("Last Name: ");
                    student.setLastName(scanner.nextLine().trim());

                    System.out.print("Gender: ");
                    student.setGender(scanner.nextLine().trim());

                    System.out.print("Prelim Grade: ");
                    student.setPrelimGrade(Double.parseDouble(scanner.nextLine()));

                    System.out.print("Midterm Grade: ");
                    student.setMidtermGrade(Double.parseDouble(scanner.nextLine()));

                    System.out.print("Final Grade: ");
                    student.setFinalGrade(Double.parseDouble(scanner.nextLine()));

                    student.calculateFinalTermGrade();

                    System.out.print("Set Filename: ");
                    String fileName = scanner.nextLine().trim();

                    try {
                        File file = new File(fileName + ".txt");
                        FileWriter writer = new FileWriter(file);
                        writer.write(student.toString());
                        writer.close();

                        System.out.println("New file successfully created");
                        System.out.println("Press [Q] to quit or [C] to continue");

                        boolean validKey = false;
                        while (!validKey) {
                            String key = scanner.nextLine().trim();
                            switch (key) {
                                case "Q":
                                    isRunning = false;
                                    validKey = true;
                                    break;
                                case "C":
                                    validKey = true;
                                    break;
                                default:
                                    System.out.println("Invalid key. Press [Q] to quit or [C] to continue");
                                    break;
                            }
                        }

                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }

                    break;

                case "O":
                    System.out.print("Enter filename to open: ");
                    String fileNameToOpen = scanner.nextLine().trim();

                    try {
                        File file = new File(fileNameToOpen + ".txt");
                        Scanner fileScanner = new Scanner(file);

                        while (fileScanner.hasNextLine()) {
                            String data = fileScanner.nextLine();
                            System.out.println(data);
                        }

                        fileScanner.close();

                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                    break;

                case "X":
                    isRunning = false;
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }

        scanner.close();
    }
}
