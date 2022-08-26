package edu.eci.cvds.tdd.registry;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegistryTest {
    private Registry registry = new Registry();

    @Test
    public void validateRegistryResult() {
        Person person = new Person();

        RegisterResult result = registry.registerVoter(person);

        assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void validateRegistryResultInvalidAge() {
        Person person = new Person("CAROL", 2167313, -21, Gender.FEMALE, true);

        RegisterResult result = registry.registerVoter(person);

        assertEquals(RegisterResult.INVALID_AGE, result);

    }

    @Test
    public void validateRegistryResultValidAge() {
        Person person = new Person("CAROL", 2167313, 20, Gender.FEMALE, true);

        RegisterResult result = registry.registerVoter(person);

        assertEquals(RegisterResult.INVALID_AGE, result);

    }
}

