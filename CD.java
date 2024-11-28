public class CD {
    // Private instance variables
    private String title;
    private String artist;
    private double price;

    // Constructor that initializes the instance variables
    public CD(String title, String artist, double price) {
        this.title = title;
        this.artist = artist;
        this.price = price;
    }

    // Getter method for the 'title' field
    public String getTitle() {
        return title;
    }

    // Getter method for the 'artist' field
    public String getArtist() {
        return artist;
    }

    // Getter method for the 'price' field
    public double getPrice() {
        return price;
    }

    // Setter method for the 'title' field
    public void setTitle(String title) {
        this.title = title;
    }

    // Setter method for the 'artist' field
    public void setArtist(String artist) {
        this.artist = artist;
    }

    // Setter method for the 'price' field
    public void setPrice(double price) {
        this.price = price;
    }

    // toString method to return a textual representation of the CD object
    @Override
    public String toString() {
        return "CD Title: " + title + "\n" +
               "Artist: " + artist + "\n" +
               "Price: £" + price;
    }

    // Main method to test the CD class
    public static void main(String[] args) {
        // Create a new CD object
        CD cd = new CD("Abbey Road", "The Beatles", 19.99);

        // Print the CD information using the toString() method
        System.out.println(cd);

        // Using getters to access the fields individually
        System.out.println("\nUsing Getters:");
        System.out.println("Title: " + cd.getTitle());
        System.out.println("Artist: " + cd.getArtist());
        System.out.println("Price: " + cd.getPrice());

        // Using setters to modify the fields
        cd.setTitle("Revolver");
        cd.setArtist("The Beatles");
        cd.setPrice(22.99);

        // Print the updated CD information
        System.out.println("\nUpdated CD Info:");
        System.out.println(cd);
    }
}

