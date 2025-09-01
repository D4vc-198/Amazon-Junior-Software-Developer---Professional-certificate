import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Book book1 = new Book();
        Scanner scanner = new Scanner(System.in);

        book1.title = "Cien años de soledad";
        book1.author = "Gabriela Garcia Marquez";
        book1.category = "Novela";
        book1.publishYear = 1967;

        String boo1Details = book1.getBookDetails();

        System.out.println("-- Book Details --");
        System.out.println(boo1Details);

        Book[] listBooks = new Book[5];

        System.out.println("--Enter Book Details --");
        for (int index = 0; index < 5; index++) {

            listBooks[index] = new Book();
            
            System.out.println("- Enter details for Book " + (index + 1));
            System.out.print("Name: ");
            listBooks[index].title = scanner.nextLine();

            System.out.print("Author: ");
            listBooks[index].author = scanner.nextLine();

            System.out.print("Category: ");
            listBooks[index].category = scanner.nextLine();

            System.out.print("Publish Year: ");
            listBooks[index].publishYear = scanner.nextInt();

            scanner.nextLine();
        }

        System.out.println("-- Library Details --");
        for (int index = 0; index < 5; index++) {
            String bookDetails = listBooks[index].getBookDetails();

            System.out.println("-> Book " + (index + 1));
            System.out.println(bookDetails);
        }
    }
}