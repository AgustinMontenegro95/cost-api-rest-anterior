package ar.com.dinamicaonline.cost.service;

import org.springframework.http.ResponseEntity;

//import ar.com.dinamicaonline.cost.dto.ParameterDto;

public interface ParameterService {
    ResponseEntity<?> getTransferMoney();

    //ResponseEntity<?> saveReceiveAndSend(AvisoDto avisoDto);
}
