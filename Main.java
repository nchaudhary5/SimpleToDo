import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("TO-DO List App");
        System.out.println("------------------");
        System.out.println("Your options :");
        System.out.println("add     : to add new title on page.");
        System.out.println("list    : to list all titles on page.");
        System.out.println("update  : to update the title.");
        System.out.println("delete  : to delete the Title of mentioned index.");
        System.out.println("option  : to list all options.");
        System.out.println("exit    : to exit.");
        while (true) {
            System.out.println("------------------");
            System.out.print("Select  option : ");
            String option = scan.nextLine();
            option = option.toLowerCase().replaceAll(" ", "");
            switch (option) {
                case "add":
                case "ADD":
                    System.out.println("Write your new note on list.");
                    System.out.print(">> ");
                    list.add(scan.nextLine());
                    System.out.println("Successfully noted.");
                    break;
                case "list":
                case "LIST":
                    System.out.println("Your to-do list :");
                    int index = 1;
                    if (list.size() != 0) {
                        for (String str : list) {
                            System.out.println(index + "." + str);
                            index++;
                        }
                    } else {
                        System.out.println("No notes on list yet.");
                    }
                    break;
                case "update":
                case "UPDATE":
                    System.out.print("Mention the Index of the list you want to update : ");
                    try {
                        int index1 = Integer.parseInt(scan.nextLine());
                        if (list.size() != 0 && index1 - 1 < list.size()) {
                            System.out.println("Write your new note : ");
                            System.out.print(">> ");
                            String str1 = scan.nextLine();
                            list.set(index1 - 1, str1);
                            System.out.println("Successfully updated note in the list.");
                        } else {
                            System.out.println("Invalid Index.");
                        }
                    } catch (Exception e) {
                        System.out.println("Index must be in number format.");// when index is entered in string error
                                                                              // occurs.
                    }
                    break;
                case "delete":
                case "DELETE":
                    System.out.print("Mention the Index of the list you want to delete : ");
                    try {
                        int index2 = Integer.parseInt(scan.nextLine());
                        if (list.size() != 0 && index2 - 1 < list.size()) {
                            list.remove(index2 - 1);
                            System.out.println("Successfully deleted note  from the list.");
                        } else {
                            System.out.println("Invalid Index.");
                        }
                    } catch (Exception e) {
                        System.out.println("Index must be in number format.");
                    }
                    break;
                case "option":
                case "OPTION":
                    System.out.println("Your options :");
                    System.out.println("add     : to add new note on list.");
                    System.out.println("list    : to list all notes on list.");
                    System.out.println("update  : to update the list.");
                    System.out.println("delete  : to delete the note of mentioned index.");
                    System.out.println("option  : to list all options.");
                    System.out.println("exit    : to exit.");
                    break;
                case "exit":
                case "EXIT":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }
    }
}