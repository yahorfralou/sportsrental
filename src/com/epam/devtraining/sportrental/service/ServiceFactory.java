package com.epam.devtraining.sportrental.service;

import com.epam.devtraining.sportrental.service.impl.InitServiceImpl;

/**
 * Created by Yahor_Fralou on 6/7/2017.
 */
public class ServiceFactory {
    private static InitServiceImpl initServiceImpl = new InitServiceImpl();

    public static InitService getInitService() {
        return initServiceImpl;
    }
}
