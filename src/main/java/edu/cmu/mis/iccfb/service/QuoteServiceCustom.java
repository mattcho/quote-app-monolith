package edu.cmu.mis.iccfb.service;

import java.util.ArrayList;

import edu.cmu.mis.iccfb.model.Quote;

public interface QuoteServiceCustom {
    public Quote randomQuote();
    public ArrayList<String> getQuotesByAuthorId(Long authorId);
}
