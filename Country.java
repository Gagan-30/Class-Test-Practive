public class Country {
    // Private instance variables
    private String name;
    private String capital;
    private int population;

    // Constructor that initializes the instance variables
    public Country(String name, String capital, int population) {
        this.name = name;
        this.capital = capital;
        this.population = population;
    }

    // Getter method for the 'name' field
    public String getName() {
        return name;
    }

    // Getter method for the 'capital' field
    public String getCapital() {
        return capital;
    }

    // Getter method for the 'population' field
    public int getPopulation() {
        return population;
    }

    // toString method to return a textual representation of the Country object
    @Override
    public String toString() {
        return "Country Name: " + name + "\n" +
               "Capital: " + capital + "\n" +
               "Population: " + population;
    }

    // Main method to test the Country class
    public static void main(String[] args) {
        // Create a new Country object
        Country country = new Country("Japan", "Tokyo", 126300000);

        // Print out the country information using the toString() method
        System.out.println(country.toString() + "\n");

        // Accessing individual data fields using getter methods
        System.out.println("Country Name: " + country.getName());
        System.out.println("Capital: " + country.getCapital());
        System.out.println("Population: " + country.getPopulation());
    }
}
