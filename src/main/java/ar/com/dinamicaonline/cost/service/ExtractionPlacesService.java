package ar.com.dinamicaonline.cost.service;

import org.springframework.http.ResponseEntity;

public interface ExtractionPlacesService {
    ResponseEntity<?> getDepositMoney();
    ResponseEntity<?> getCashWithdrawal();

}
