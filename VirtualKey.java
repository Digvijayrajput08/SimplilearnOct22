package Harry;

import java.io.File;
import java.util.Scanner;

public class VirtualKey {
    public static void main(String[] args) {
        //create a File object for the root directory
        File directoryPath = new File(".");
        // get all files in the directory
        File[] filesList = directoryPath.listFiles();
        System.out.println("**************************************");
        System.out.println("Welcome to Virtual Key");
        System.out.println("**************************************");
        System.out.println("-----------Digvijay Singh Rajput-----------");
        System.out.println("**************************************");
		System.out.println("**********Full Stack Developer********");
        System.out.println("Options:");
        System.out.println("1. List files");
        System.out.println("2. Add a file");
        System.out.println("3. Delete a file");
        System.out.println("4. Search a file");
        System.out.println("5. Exit");
        System.out.println("----------------------------");
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        while (option != 5) {
            System.out.print("Enter option: ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("List of Files:");
                    for (File file : filesList) {
                        if (file.isFile()) {
                            System.out.println(file.getName());
                        }
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.print("Enter file name: ");
                    scanner.nextLine();
                    String fileName = scanner.nextLine();
                    File file = new File(fileName);
                    if (file.exists()) {
                        System.out.println("File already exists.");
                    } else {
                        try {
                            file.createNewFile();
                            System.out.println("File created successfully.");
                        } catch (Exception e) {
                            System.out.println("An error occurred while creating the file.");
                        }
                    }
                    System.out.println("");
                    break;
                case 3:
                    System.out.print("Enter file name: ");
                    scanner.nextLine();
                    String deleteFileName = scanner.nextLine();
                    File deleteFile = new File(deleteFileName);
                    if (deleteFile.exists()) {
                        deleteFile.delete();
                        System.out.println("File deleted successfully.");
                    } else {
                        System.out.println("File does not exist.");
                    }
                    System.out.println("");
                    break;
                case 4:
                    System.out.print("Enter file name: ");
                    scanner.nextLine();
                    String searchFileName = scanner.nextLine();
                    File searchFile = new File(searchFileName);
                    if (searchFile.exists()) {
                        System.out.println("File found at path: " + searchFile.getAbsolutePath());
                    } else {
                        System.out.println("File not found.");
                    }
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("Thank you for using Virtual Key.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
        scanner.close();
    }
}
