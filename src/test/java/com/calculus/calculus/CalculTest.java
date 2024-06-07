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
}
