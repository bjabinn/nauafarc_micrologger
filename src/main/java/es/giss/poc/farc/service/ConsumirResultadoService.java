package es.giss.poc.farc.service;


import es.giss.arch.common.log.GissLogger;
import es.giss.arch.kafka.service.ConsumerService;
import es.giss.poc.farc.dto.ResultadoCalculoDto;
import org.springframework.stereotype.Service;

@Service
public class ConsumirResultadoService extends ConsumerService<String, ResultadoCalculoDto> {

    public ConsumirResultadoService(final GissLogger logger) {
        super((k, v) -> logger.info("--------------------- Pensión: " + v.getPension()));
    }
}
