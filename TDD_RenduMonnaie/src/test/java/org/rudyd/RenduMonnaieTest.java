package org.rudyd;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RenduMonnaieTest {


    RenduMonnaie renduMonnaie = new RenduMonnaie();
    @Test
    void testPour188_88Doitrendre1billetde100(){
        assertEquals("1 billet de 100 €", renduMonnaie.rendreMonnaie(188.88f));
    }
    @Test
    void testPour188_88Doitrendre1billetde100Et1billetDe50(){
        assertEquals("1 billet de 100 €\n1 billet de 50 €", renduMonnaie.rendreMonnaie(188.88f));
    }
}