package teste;

import io.quarkus.scheduler.Scheduled;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.jboss.logging.Logger;

import java.time.LocalDateTime;

@ApplicationScoped
public class SumarioSchedule {

    @Inject
    Logger logger;

    @Scheduled(cron = "0 0/5 * ? * * *", identity = "populacaoDeDadosSumario")
    @Transactional
    public void populaDadosSumario(){
        logger.info("Iniciando servico de contagem de comunicados para preenchiemento do servico de sumario. " + LocalDateTime.now());

        //Contadores de comunicados.
        logger.info("Total de Registros Encontrados ");
        logger.info("Total de Comunicados: " + "100");
        logger.info("Total de Destinatarios: " + "999");
        logger.info("Gravando dados no banco nao relacional. " + LocalDateTime.now());
        logger.info("Fim da atualizacao de dados do Sumário. " + LocalDateTime.now());
    }
}