package com.epam.devtraining.sportrental.controller;

import com.epam.devtraining.sportrental.service.InitService;
import com.epam.devtraining.sportrental.service.ServiceFactory;

/**
 * Created by Yahor_Fralou on 6/7/2017.
 */
public class InitController implements Controller {
    @Override
    public void execute() {
        InitService initService = ServiceFactory.getInitService();

        initService.init();
    }
}
