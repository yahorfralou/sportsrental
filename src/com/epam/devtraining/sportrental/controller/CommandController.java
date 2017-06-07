package com.epam.devtraining.sportrental.controller;

import java.util.Map;

/**
 * Created by Yahor_Fralou on 6/7/2017.
 */
public class CommandController {
    private Map<Integer, Controller> controllers;

    void invoke() {
        Controller controller = controllers.get(choice);
        // TODO check NPE
        controller.execute();

    }
}
