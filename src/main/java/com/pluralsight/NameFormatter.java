package com.pluralsight;

public class NameFormatter {
    private NameFormatter() {};
    public static String format(String firstName,
                                String lastName) {

        return lastName + ", " + firstName;
    }
    public static String format(String prefix,
                                String firstName,
                                String middleName,
                                String lastName,
                                String suffix) {

        StringBuilder nameStringBuilder = new StringBuilder();

        // add last name
        nameStringBuilder.append(lastName).append(", ");

        // check for an empty prefix
        if (!prefix.isEmpty()) {
            nameStringBuilder.append(prefix).append(" ");
        }

        // add firstname
        nameStringBuilder.append(firstName);

        // check for an empty middle name
        if (!middleName.isEmpty()) {
            nameStringBuilder.append(" ").append(middleName);
        }

        // check for an empty suffix
        if (!suffix.isEmpty()) {
            nameStringBuilder.append(", ").append(suffix);
        }

        return nameStringBuilder.toString();

    }

    public static String removeComma(String string) {
        return string.replace(",", "");
    }

    public static String format(String fullName) {

        fullName = fullName.trim();

        // remove all commas since format handles that
        fullName = removeComma(fullName);
        String[] nameParts = fullName.split(" ");

        if (nameParts.length == 2) {
            return format(nameParts[0], nameParts[1]);
        }

        if (nameParts.length == 5) {
            return format(nameParts[0], nameParts[1], nameParts[2], nameParts[3], nameParts[4]);
        }

        return format("", nameParts[0], nameParts[1], nameParts[2], nameParts[3]);

    }

}
