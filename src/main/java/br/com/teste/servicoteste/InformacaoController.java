package br.com.teste.servicoteste;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InformacaoController {
    @Autowired
    private InformacaoService informacaoService;

    @PostMapping("/informacoes")
    public void gravarInformacao(@RequestBody String conteudo) {
        informacaoService.gravarInformacao(conteudo);
    }
}
