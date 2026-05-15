package br.com.faculdadedonaduzzi.lab.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TarefaControllerTest {

    @Test
    void getVersion() {
        TarefaController controller = new TarefaController();
        String version = controller.getVersion();
        assertEquals("v9999.9999", version);
    }

}