package com.example.compra.infrastructure.event.listen;

import com.example.compra.application.CompraGet;
import com.example.compra.application.CompraSave;
import com.example.compra.domain.entities.Compra;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;

@AllArgsConstructor
@Component
@Slf4j
public class Receiver {

    private final ObjectMapper objectMapper;
    private final CompraGet compraGet;

    public static String RECEIVE_METHOD_NAME = "receiveMessage";
    public void receiveMessage(byte[] message) throws JsonProcessingException {
            String mesajeconvertido = new String(message, StandardCharsets.UTF_8);
            Compra compra = objectMapper.readValue(mesajeconvertido, Compra.class);
            log.info("Receiving message: [{}]",
                    objectMapper.writeValueAsString(compraGet.getCompra(compra.getId())));
    }
}
