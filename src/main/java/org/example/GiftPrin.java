package org.example;


public class GiftPrin {


    public static String to_bring_gifts(String surname, String gift) {
        return surname + " принесли в дар " + gift + ".";
    }

    public static String to_bring_gifts_peasant(String surname, String gift) {
        return surname + " принесли в дар " + gift + ".";

    }

    public static String to_bring_gifts_king(String surname, String gift) {
        return surname + " принесли в дар " + gift + " и еще 1000 монет" + ".";

    }


}
