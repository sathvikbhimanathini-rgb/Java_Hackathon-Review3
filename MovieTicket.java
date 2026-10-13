class MovieTicket {
    String customer, movie;
    double price;

    MovieTicket(String c, String m, double p) {
        customer = c;
        movie = m;
        price = p;
    }

    MovieTicket(String c, String m) {
        customer = c;
        movie = m;
    }

    void book(int n) {
        display(n, price);
    }

    void book(int n, double p) {
        display(n, p);
    }

    void display(int n, double p) {
        System.out.println("\nCustomer Name: " + customer.toUpperCase());
        System.out.println("Movie Name: " + movie.toUpperCase());

        if (n <= 0) {
            System.out.println("Invalid Tickets");
            return;
        }

        double total = n * p;
        double discount = n >= 5 ? total * 0.10 : 0;

        System.out.println("Ticket Price: Rs. " + p);
        System.out.println("Number of Tickets: " + n);
        System.out.println("Booking Status: Successful");
        System.out.println("Total Amount: Rs. " + total);
        System.out.println("Discount: Rs. " + discount);
        System.out.println("Final Amount: Rs. " + (total - discount));
    }

    public static void main(String[] args) {
        System.out.println("===== CINEMA TICKET BOOKING =====");

        MovieTicket t1 = new MovieTicket("Sathvik", "Avatar", 200);
        t1.book(5);

        MovieTicket t2 = new MovieTicket("Dilip", "Avatar");
        t2.book(2, 200);

        System.out.println("Same Customer: " +
            t1.customer.equalsIgnoreCase(t2.customer));
    }
}
