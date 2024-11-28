public class Countries {
    private Country[] countries; // Array to store Country objects
    private int nextFreeCountry; // Index of the next free slot in the array

    // Constructor to initialize the array with a given size
    public Countries(int size) {
        countries = new Country[size];
        nextFreeCountry = 0; // Start with the first index
    }

    // Method to add a new Country object to the array
    public void addCountry(String name, String capital, int population) {
        if (nextFreeCountry < countries.length) { // Ensure there is space in the array
            countries[nextFreeCountry] = new Country(name, capital, population);
            nextFreeCountry++; // Move to the next free slot
        } else {
            System.out.println("No more space to add new countries!");
        }
    }

    // Optional: Method to display all countries
    public void displayCountries() {
        for (int i = 0; i < nextFreeCountry; i++) {
            System.out.println(countries[i]);
        }
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        Countries myCountries = new Countries(5); // Create a Countries object with 5 slots

        // Add some countries
        myCountries.addCountry("Canada", "Ottawa", 38000000);
        myCountries.addCountry("France", "Paris", 67000000);
        myCountries.addCountry("Japan", "Tokyo", 126000000);

        // Display all added countries
        System.out.println("List of Countries:");
        myCountries.displayCountries();
    }
}
