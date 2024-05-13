package dev.vedcodee.it;

public class Main {

    private static String formatSeconds(long seconds) {
        return String.join(" ",
                (seconds / (365 * 24 * 60 * 60) != 0 ? seconds / (365 * 24 * 60 * 60) + "y," : ""),
                ((seconds % (365 * 24 * 60 * 60)) / (30 * 24 * 60 * 60) != 0 ? (seconds % (365 * 24 * 60 * 60)) / (30 * 24 * 60 * 60) + "mo," : ""),
                ((seconds % (30 * 24 * 60 * 60)) / (24 * 60 * 60) != 0 ? (seconds % (30 * 24 * 60 * 60)) / (24 * 60 * 60) + "d," : ""),
                ((seconds % (24 * 60 * 60)) / (60 * 60) != 0 ? (seconds % (24 * 60 * 60)) / (60 * 60) + "h," : ""),
                ((seconds % (60 * 60)) / 60 != 0 ? (seconds % (60 * 60)) / 60 + "m," : ""),
                (seconds % 60 != 0 ? seconds % 60 + "s" : "")
        ).replaceAll(",\\s*$", "").trim();
    }


}
