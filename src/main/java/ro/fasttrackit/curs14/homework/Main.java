package ro.fasttrackit.curs14.homework;

public class Main {
    public static void main(String[] args) throws Exception {
        QuoteService quoteService = new QuoteService();

        System.out.println(quoteService.getAllQuotes());
        System.out.println(quoteService.getAuthors());
        System.out.println(quoteService.getQuotesForAuthor("Booker Washington"));
        quoteService.setFavourites(1);
        quoteService.setFavourites(22);
        quoteService.setFavourites(222);
        System.out.println(quoteService.getFavourites());
        System.out.println(quoteService.getRandomQuote());
    }
}
