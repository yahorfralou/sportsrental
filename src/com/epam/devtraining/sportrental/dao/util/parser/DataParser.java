package com.epam.devtraining.sportrental.dao.util.parser;

/**
 * Created by Yahor_Fralou on 6/7/2017.
 */
public interface DataParser {
    void parse();
    void setEntityResolver(EntityResolver resolver);

    interface EntityResolver {
        void onNextLine(String[] line);
    }
}
