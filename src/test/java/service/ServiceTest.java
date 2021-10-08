package service;

import models.ModeloEmail;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.stubbing.OngoingStubbing;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class ServiceTest {

//    @Test
//    void salvarEnviarEmail() {
//
//        ConsumoDaService mockconsumoDaService = mock(ConsumoDaService.class);
//        ModeloEmail modeloEmail = getModelo();
//        modeloEmail.setEmail(false);
//        modeloEmail.setAssuntoEmail("assunto do Email");
//        when((mockconsumoDaService).salvoNoBancoDeDados(any())).thenReturn(modeloEmail);
//
//        when(mockconsumoDaService.mandoEmail()).thenReturn(true);
//
//        Assertions.assertFalse(modeloEmail.isEmail());
//        Assertions.assertNotEquals("vazio",modeloEmail.getAssuntoEmail());
//
//        verify((mockconsumoDaService), times(0)).salvoNoBancoDeDados(getModelo());
//
//    }

    @Test
    void apenasEnviaUmEmail() {
        ConsumoDaService mockconsumoDaService = mock(ConsumoDaService.class);
        mockconsumoDaService.mandoEmail();

        verify(mockconsumoDaService,atLeastOnce()).mandoEmail();
    }

//    private ModeloEmail getModelo(){
//        ModeloEmail modeloEmail= new ModeloEmail();
//        modeloEmail.setEmail(true);
//        modeloEmail.setAssuntoEmail("vazio");
//        return modeloEmail;
//    }
}