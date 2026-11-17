package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {
    @Test
    void formatWithFirstNameAndLastName() {
        // arrange
        String firstName = "Mel";
        String lastName = "Johnson";

        String expectedString = "Johnson, Mel";

        // act
        String actualString = NameFormatter.format(firstName, lastName);

        // assert
        assertEquals(expectedString, actualString);
    }

    @Test
    void formatWithPrefixFirstNameMiddleNameLastNameAndSuffix() {
        // arrange
        String prefix = "Dr.";
        String firstName = "Mel";
        String middleName = "B";
        String lastName = "Johnson";
        String suffix = "PhD";

        String expectedString = "Johnson, Dr. Mel B, PhD";

        // act
        String actualString = NameFormatter.format(prefix, firstName, middleName, lastName, suffix);

        // assert
        assertEquals(expectedString, actualString);

    }

    @Test
    void formatWithFullName() {
        // arrange
        String  fullName = "Dr. Mel B Johnson, PhD";

        String expectedString = "Johnson, Dr. Mel B, PhD";

        // act
        String actualString = NameFormatter.format(fullName);

        // assert
        assertEquals(expectedString, actualString);

    }
}