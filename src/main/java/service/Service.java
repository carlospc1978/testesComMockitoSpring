package service;

import models.ModeloEmail;

public class Service {

    String email;

    public Service(String email) {
        this.email = email;
    }

    ConsumoDaService consumoDaService;

//    public ModeloEmail SalvarEnviarEmail(){
//
//        consumoDaService.mandoEmail();
//
//        ModeloEmail modeloEmail = new ModeloEmail();
//        modeloEmail.setEmail(true);
//        modeloEmail.setAssuntoEmail("assunto do email");
//
//        return consumoDaService.salvoNoBancoDeDados(modeloEmail);
//
//    }

    public void apenasEnviaEmail(){
        consumoDaService.mandoEmail();
    }


}
