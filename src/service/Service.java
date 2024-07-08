package service;

import database.Dao;

public class Service {

    public String getPerson() {
        Dao d1 = new Dao();
        return d1.getPerson();
    }

}












