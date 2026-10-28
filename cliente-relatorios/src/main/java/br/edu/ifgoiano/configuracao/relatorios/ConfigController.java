package br.edu.ifgoiano.configuracao.relatorios;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/** Exibe a mensagem recebida do Config Server, sem regra de negócio adicional. */
@RefreshScope
@RestController
public class ConfigController {
    @Value("${mensagem.boasvindas}")
    private String mensagem;

    @GetMapping(value = "/mensagem", produces = "text/plain;charset=UTF-8")
    public String mensagem() {
        return mensagem;
    }
}
