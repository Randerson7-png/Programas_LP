package Emissores;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CachorroTest {
    Cachorro c1;

    @BeforeEach
    void setUp() {
        c1 = new Cachorro("Sccoby");
        assertTrue(c1.getNome().equals("Scooby"));

    }

    @Test
    void setNome() {
    }

    @Test
    void getNome() {
    }

    @Test
    void emitirsom() {
    }
}