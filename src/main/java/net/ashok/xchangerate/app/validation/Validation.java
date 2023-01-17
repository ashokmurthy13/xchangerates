package net.ashok.xchangerate.app.validation;

import net.ashok.xchangerate.app.exception.ComparisonException;

public class Validation {

    public static boolean validateResponse(Object[] response) {
        if (response.length != 0)
            throw new ComparisonException("Exception in the response");
        return false;
    }
}
