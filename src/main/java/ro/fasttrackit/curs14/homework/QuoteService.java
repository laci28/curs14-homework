package ro.fasttrackit.curs14.homework;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class QuoteService {
    private final List<Quote> quotes = getQuotes();

    public QuoteService() throws Exception {
    }

    public List<Quote> getQuotes() throws Exception {
        List<Quote> result = new ArrayList<>();
        File file = new File("files/quotes.txt");
        Scanner scan = new Scanner(file);
        int i = 0;
        while (scan.hasNextLine()) {
            String str = scan.nextLine();
            String[] parts = str.split("~");
            result.add(new Quote(i, parts[0], parts[1], false));
            i++;
        }
        scan.close();
        return result;
    }

    public List<String> getAllQuotes() {
        List<String> result = new ArrayList<>();
        for (Quote quote : quotes) {
            result.add(quote.getQuote());
        }
        return result;
    }

    public List<Quote> getQuotesForAuthor(String author) {
        List<Quote> result = new ArrayList<>();
        for (Quote quote : quotes) {
            if (quote.getAuthor().equals(author)) {
                result.add(quote);
            }
        }
        return result;
    }

    public List<String> getAuthors() {
        List<String> result = new ArrayList<>();
        for (Quote quote : quotes) {
            result.add(quote.getAuthor());
        }
        return result;
    }

    public void setFavourites(int id) {
        for (Quote quote : quotes) {
            if (quote.getId() == id) {
                quote.setFavourite(true);
            }
        }
    }

    public List<Quote> getFavourites() {
        List<Quote> result = new ArrayList<>();
        for (Quote quote : quotes) {
            if (quote.isFavourite()) {
                result.add(quote);
            }
        }
        return result;
    }

    public String getRandomQuote() {
        Random rand = new Random();
        int randomId = rand.nextInt(quotes.size());
        for (Quote quote : quotes) {
            if (quote.getId() == randomId) {
                return quote.getQuote();
            }
        }
        return null;
    }
}
