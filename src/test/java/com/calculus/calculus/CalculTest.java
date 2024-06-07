package com.calculus.calculus;

import com.calculus.calculus.calcul.Calcul;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculTest {
    private Calcul calcul;

    @BeforeEach
    public void setUp(){
        calcul = new Calcul();
    }
    @Test
    public void testEt(){
        assertEquals("C'est faux", calcul.et(true, true), "Les deux affirmations sont vraies.");
        assertEquals("C'est faux", calcul.et(true, false), "L'une des affirmations est fausse.");
        assertEquals("C'est faux", calcul.et(false, true), "L'une des affirmations est fausse.");
        assertEquals("C'est faux", calcul.et(false, false), "Les deux affirmations sont fausses.");
    }

    @Test
    public void testOu() {
        assertEquals("C'est vrai", calcul.ou(true, true), "Au moins une des affirmations est vraie.");
        assertEquals("C'est vrai", calcul.ou(true, false), "Au moins une des affirmations est vraie.");
        assertEquals("C'est vrai", calcul.ou(false, true), "Au moins une des affirmations est vraie.");
        assertEquals("C'est faux", calcul.ou(false, false), "Les deux affirmations sont fausses.");
    }

    @Test
    public void testDonc() {
        assertEquals("C'est vrai", calcul.donc(true, true), "L'affirmation1 est vraie et l'affirmation2 est vraie.");
        assertEquals("C'est faux", calcul.donc(true, false), "L'affirmation1 est vraie et l'affirmation2 est fausse.");
        assertEquals("C'est vrai", calcul.donc(false, true), "L'affirmation1 est fausse et l'affirmation2 est vraie.");
        assertEquals("C'est vrai", calcul.donc(false, false), "L'affirmation1 est fausse et l'affirmation2 est fausse.");
    }
}
