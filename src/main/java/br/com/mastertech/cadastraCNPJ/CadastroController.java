package br.com.mastertech.cadastraCNPJ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CadastroController {

    @Autowired
    private CadastroProducer cadastroProducer;

    @PostMapping ("/cadastro/{nome}/{cnpj}/{capital_social}")
    public void create(@PathVariable String nome, @PathVariable String cnpj, @PathVariable Double capital_social) {
        Cadastro cadastro = new Cadastro(nome, cnpj, capital_social);
        cadastro.setNome(nome);
        cadastro.setCnpj(cnpj);
        cadastro.setCapital_social(capital_social);

        cadastroProducer.enviarAoKafka(cadastro);
    }

}
