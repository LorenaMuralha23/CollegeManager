package Model;

import Controller.Controller;
import View.MainFrame;

public class Main {
    
    public static Controller controller = new Controller();
    
    public static void main(String[] args) {
        controller.start();
    }

}
