public class Playlist {
    // Private instance variables
    private CD[] items;       // Array to store CD elements
    private int nextFreeItem; // Index of the next available slot in the array

    // Constructor that initializes the items array with the specified size
    public Playlist(int size) {
        items = new CD[size];  // Allocate array with 'size' elements
        nextFreeItem = 0;      // Initially, no CDs have been added
    }

    // Method to add a new CD to the playlist
    public void addCD(String title, String artist, double price) {
        if (nextFreeItem < items.length) {
            // Create a new CD object and add it to the array at the next available position
            items[nextFreeItem] = new CD(title, artist, price);
            nextFreeItem++; // Increment the index for the next CD to be added
        }
    }

    // toString method to return a textual representation of the playlist
    
    @Override
    public String toString() {
        String playlistInfo = "";
        for (int i = 0; i < nextFreeItem; i++) {
            playlistInfo += items[i].toString() + "\n";  // Concatenating strings
        }
        return playlistInfo;
    }

    // Method to calculate the total price of all CDs in the playlist
    public double totalPrice() {
        double total = 0;
        for (int i = 0; i < nextFreeItem; i++) {
            total += items[i].getPrice();
        }
        return total;
    }

    // Main method to test the Playlist class
    public static void main(String[] args) {
        // Create a playlist with a maximum of 3 CDs
        Playlist playlist = new Playlist(3);

        // Add some CDs to the playlist
        playlist.addCD("Abbey Road", "The Beatles", 19.99);
        playlist.addCD("Revolver", "The Beatles", 22.99);
        playlist.addCD("The Dark Side of the Moon", "Pink Floyd", 24.99);

        // Print out the playlist using the toString() method
        System.out.println("Playlist:\n" + playlist);

        // Print the total price of the playlist
        System.out.println("Total Price: $" + playlist.totalPrice());
    }
}

