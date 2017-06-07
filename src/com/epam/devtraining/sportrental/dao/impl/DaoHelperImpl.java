package com.epam.devtraining.sportrental.dao.impl;

import com.epam.devtraining.sportrental.dao.DAOHelper;
import com.epam.devtraining.sportrental.dao.util.parser.CSVParser;
import com.epam.devtraining.sportrental.dao.util.parser.DataParser;
import com.epam.devtraining.sportrental.domain.SportEquipment;

import java.io.File;

/**
 * Created by Yahor_Fralou on 6/7/2017.
 */
public class DaoHelperImpl implements DAOHelper, DataParser.EntityResolver {
    private static final int POSITION_PRODUCT_TITLE = 0;

    @Override
    public void initialize() {

        DataParser parser = new CSVParser();
        parser.setEntityResolver(this);

        parser.parse();
    }

    @Override
    public void onNextLine(String[] line) {



        Shop.getInstance().addProduct();
    }

    private SportEquipment convertFromArray(String[] line) {
        try {
            Integer.parseInt(line[POSITION_PRODUCT_TITLE]);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException) {

        }
    }
}

