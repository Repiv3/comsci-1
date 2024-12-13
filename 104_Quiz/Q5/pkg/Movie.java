package pkg;

public class Movie {
    String name;
    double rating;
    int numberOfRatings;
    int revenue;

    public Movie(String name, double rating, int numberOfRatings, int revenue) {
        this.name = name;
        this.rating = rating;
        this.numberOfRatings = numberOfRatings;
        this.revenue = revenue;
    }

    public String getMovieName() {
        return name;
    }

    public int getRevenue() {
        return revenue;
    }

    public void addRating(double newRating) {
        double totalRating = rating * numberOfRatings + newRating;
        numberOfRatings++;
        rating = totalRating / numberOfRatings;
    }

    public boolean compareRatings(Movie other) {
        return rating > other.rating;
    }

    public void movieToString() {
        System.out.println("Movie: " + name);
        System.out.printf("Rating: %.1f\n", rating);
        System.out.println("Number of Ratings: " + numberOfRatings);
        System.out.println("Revenue: " + revenue);
    }
}
