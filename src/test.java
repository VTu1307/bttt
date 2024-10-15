public class test {
    public static void main(String[] args) {

        LibraryItem[] library = {
                new Book("1984", "978-0451524935", "George Orwell", 1949),
                new Magazine(2021, "National Geographic", 123, "National Geographic Partners"),
                new Book("To Kill a Mockingbird", "978-0060935467", "Harper Lee", 1960),
                new Magazine(2022, "Time", 456, "Time USA LLC")
        };

        // In thông tin cho từng đối tượng
        for (LibraryItem item : library) {
            System.out.println(item.getDetails());
        }
    }
}