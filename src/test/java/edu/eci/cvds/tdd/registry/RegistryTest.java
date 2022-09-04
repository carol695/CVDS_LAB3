package edu.eci.cvds.tdd.registry;


import edu.eci.cvds.tdd.registry.Person;
import edu.eci.cvds.tdd.registry.RegisterResult;
import edu.eci.cvds.tdd.registry.Registry;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;


public class RegistryTest {
    private Registry registry = new Registry();
    @Test
    public void give_InvalidAge_when_isNegative_Then_returnInvalidAge() {
        //Arrange
        Person person = new Person();
        person.setAge(-1);
        person.setAlive(true);
        //Action
        RegisterResult result = registry.registerVoter(person);
        //Assertion
        assertEquals(RegisterResult.INVALID_AGE, result);
    }


    @Test
    public void give_aBoolean_when_isFalse_Then_returnDead() {
        //Arrange
        Person person = new Person();
        person.setAlive(false);
        //Action
        RegisterResult result = registry.registerVoter(person);
        //Assertion
        assertEquals(RegisterResult.DEAD, result);
    }

    @Test
    public void give_TwoIds_when_itsAreEqual_Then_returnDuplicated() {
        //Arrange
        Person personOne = new Person();
        personOne.setId(2167313);
        personOne.setAlive(true);
        personOne.setAge(25);
        registry.registerVoter(personOne);
        Person personTwo = new Person();
        personTwo.setId(2167313);
        personTwo.setAlive(true);
        personTwo.setAge(35);
        //Action
        RegisterResult result = registry.registerVoter(personTwo);
        //Assertion
        assertEquals(RegisterResult.DUPLICATED, result);
    }

    @Test
    public void give_age_id_of_the_Person_when_Valid_Then_returnValid() {
        //Arrange
        Person person = new Person();
        person.setAge(20);
        person.setAlive(true);
        person.setId(465574);
        //Action
        RegisterResult result = registry.registerVoter(person);
        //Assertion
        assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void give_aNumber_when_itsLessThan18_Then_returnUnderage() {
        //Arrange
        Person person = new Person();
        person.setAge(16);
        person.setAlive(true);
        person.setId(234567);
        //Action
        RegisterResult result = registry.registerVoter(person);
        //Assertion
        assertEquals(RegisterResult.UNDERAGE, result);
    }


}

