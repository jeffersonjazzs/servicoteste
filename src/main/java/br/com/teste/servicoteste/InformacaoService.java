package br.com.teste.servicoteste;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class InformacaoService {
    @Autowired
    private InformacaoRepository informacaoRepository;
    @Autowired
    private JmsTemplate jmsTemplate;
    @Value("${activemq.queue}")
    private String queue;

    public void gravarInformacao(String conteudo) {
        Informacao informacao = new Informacao();
        informacao.setConteudo(conteudo);
        informacaoRepository.save(informacao);
        jmsTemplate.convertAndSend(queue, informacao);
    }
}
