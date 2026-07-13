package com.ExceptionHandling;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class ExceptionsExampleTest {

    @Test
    public void catchANullPointerException() {

        Integer age = null;
        String ageAsString;

        // Null Pointer Exception
        // ageAsString = age.toString();

        try {
            ageAsString = age.toString();
        }
        catch (NullPointerException e) {
            age = 18;
            ageAsString = age.toString();
        }

        System.out.println(age);
        System.out.println(ageAsString);

        String yourAge = "You are " + age.toString() + " years old";

        assertEquals("You are 18 years old", yourAge);
    }
}

