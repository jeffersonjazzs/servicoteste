package br.com.teste.servicoteste;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
@AutoConfigureMockMvc
@WebAppConfiguration
@ActiveProfiles("test")
@RunWith(SpringRunner.class)
public class InformacaoControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGravarInformacao() throws Exception {
        String conteudo = "Teste";
        mockMvc.perform(post("/informacoes")
            .contentType(MediaType.APPLICATION_JSON)
            .
