package net.mehdi.activemqjms.utils;

public class DoubleUtils {
    public static Double parseDouble(String value) {
        if (value == null || value.trim().isEmpty()) {
            return 0.0;
    }
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }
}
