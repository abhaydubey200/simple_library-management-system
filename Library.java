import java.util.Scanner;

class Book {
    String bookName;
    String author;
    int pages;
    float price;
}

    public class Library {

    public static void main(String[] args) {
       
        Book[] library = new Book[100];

        String arNm;

        int i, input, count;

        i = input = count = 0;

        for (int j = 0; j < library.length; j++) {
            library[j] = new Book();
        }

        Scanner scanner = new Scanner(System.in);

        while (input != 5) {
            System.out.println("\n\n********###### WELCOME TO E-LIBRARY #####********");
            System.out.println("1. Add book information\n2. Display book information");
            System.out.println("3. List all books of given author\n4. List the count of books in the library");
            System.out.println("5. Exit");

            System.out.print("\n\nEnter one of the above: ");
            input = scanner.nextInt();

            switch (input) {

                case 1:
                    System.out.print("Enter book name: ");
                    library[i].bookName = scanner.next();

                    System.out.print("Enter author name: ");
                    library[i].author = scanner.next();

                    System.out.print("Enter pages: ");
                    library[i].pages = scanner.nextInt();

                    System.out.print("Enter price: ");
                    library[i].price = scanner.nextFloat();
                    count++;
                    i++;
                    break;

                
                case 2:
                    System.out.println("You have entered the following information:");
                    for (int j = 0; j < count; j++) {
                        System.out.println("Book name: " + library[j].bookName +
                                "\t Author name: " + library[j].author +
                                "\t Pages: " + library[j].pages +
                                "\t Price: " + library[j].price);
                    }
                    break;

                case 3:
                    System.out.print("Enter author name: ");
                    arNm = scanner.next();
                    boolean found = false;
                    for (int j = 0; j < count; j++) {
                        if (arNm.equals(library[j].author)) {
                            System.out.println(library[j].bookName + " " +
                                    library[j].author + " " +
                                    library[j].pages + " " +
                                    library[j].price);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("No books found for author: " + arNm);
                    }
                    break;

                case 4:
                    System.out.println("\nNo of books in library: " + count);
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}

