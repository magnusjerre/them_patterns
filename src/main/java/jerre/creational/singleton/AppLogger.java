package jerre.creational.singleton;

public class AppLogger {

    //Eager init
//    private static AppLogger instance = new AppLogger();
//
//    public static AppLogger getInstance() {
//        return instance;
//    }

    //Lazy
    private static AppLogger instance;

    public static AppLogger getInstance() {
        if (instance == null) {
            instance = new AppLogger();
        }
        return instance;
    }

    private AppLogger() {    }

    public void log(String message) {
        System.out.println(message);
    }
}
