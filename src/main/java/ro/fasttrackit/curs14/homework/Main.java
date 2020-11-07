package ro.fasttrackit.curs14.homework;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        QuoteService quoteService = new QuoteService();

        //System.out.println(quoteService.getAllQuotes());
        System.out.println(quoteService.getQuotesForAuthor("Booker Washington"));
        //System.out.println(quoteService.getAuthors());
        quoteService.setFavourites(0);
        //quoteService.setFavourites(22);
        //quoteService.setFavourites(222);
        System.out.println(quoteService.getBookQuote().get(0).isFavourite());
    }
}
