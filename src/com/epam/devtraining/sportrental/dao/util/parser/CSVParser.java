package com.epam.devtraining.sportrental.dao.util.parser;

/**
 * Created by Yahor_Fralou on 6/7/2017.
 */
public class CSVParser implements DataParser {
    @Override
    public void parse() {

        String line = reader.nextLine();
        entRes.onNext(line);
    }
}
