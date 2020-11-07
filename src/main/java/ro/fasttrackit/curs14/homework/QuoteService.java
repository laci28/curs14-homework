package ro.fasttrackit.curs14.homework;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuoteService {
    private final List<Quote> bookQuote = getBookQuote();

    public QuoteService() throws Exception {
    }

    public List<Quote> getBookQuote() throws Exception {
        List<Quote> result = new ArrayList<>();
        File file = new File("files/quotes.txt");
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            int i = 0;
            String str = scan.nextLine();
            String[] parts = str.split("~");
            result.add(new Quote(i++, parts[0], parts[1], false));
        }
        scan.close();
        return result;
    }

    public List<String> getAllQuotes() throws Exception {
        List<String> result = new ArrayList<>();
        for(Quote quote : bookQuote){
            result.add(quote.getQuote());
        }
        return result;
    }

    public List<Quote> getQuotesForAuthor(String author) throws Exception {
        List<Quote> result = new ArrayList<>();
        for (Quote quote : bookQuote) {
            if (quote.getAuthor().equals(author)) {
                result.add(quote);
            }
        }
        return result;
    }

    public List<String> getAuthors() {
        List<String> result = new ArrayList<>();
        for(Quote quote : bookQuote){
            result.add(quote.getAuthor());
        }
        return result;
    }

    public void setFavourites(int id) {
        for (int i = 0; i<bookQuote.size(); i++){
            if (bookQuote.get(i).getId() == id){
                bookQuote.get(i).setFavourite(true);
                System.out.println(i + " " + true);
            }
        }
    }

    public List<Quote> getFavourites(){
        List<Quote> result = new ArrayList<>();

        return result;
    }

    public String getRandomQuote(){
        String result = null;

        return result;
    }
}
