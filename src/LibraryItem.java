public  class LibraryItem {
    private String title;
    private int yearPublished;

    public LibraryItem(String title, int yearpublished) {
        this.title = title;
        this.yearPublished = yearpublished;
    }

    public String getTitle() {
        return title;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public String getDetails() {
        return "title: " + title + ", yearPublished: " + yearPublished;
    }
}