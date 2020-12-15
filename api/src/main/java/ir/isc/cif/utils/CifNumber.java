package ir.isc.cif.utils;

import org.apache.commons.lang3.RandomStringUtils;

public class CifNumber {
    public static String randomCifNumber() {
        String generatedString = RandomStringUtils.random(2, 'A', 'H', true, false);
        String generatedNumber = RandomStringUtils.randomNumeric(8);
        return generatedString + generatedNumber;
    }
}
