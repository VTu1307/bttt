public class Magazine extends LibraryItem{
    public int issueNumber;
    public String publisher;

    public Magazine(int yearPubshed ,String title , int issueNumber, String publisher) {
        super(title, yearPubshed);
        this.issueNumber = issueNumber;
        this.publisher = publisher;
    }
    @Override
    public String getDetails() {
        return "Magazine: " + getTitle() + ", Year: " + getYearPublished() + ", Issue Number: " + issueNumber + ", Publisher: " + publisher;
    }
}
