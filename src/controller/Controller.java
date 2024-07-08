package controller;

import service.Service;

public class Controller {

    public static void main(String[] args) {
        Service service = new Service();
        String person = service.getPerson();
        System.out.println(person);

    }
}
