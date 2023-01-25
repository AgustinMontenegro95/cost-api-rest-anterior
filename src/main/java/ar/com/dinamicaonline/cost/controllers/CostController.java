package ar.com.dinamicaonline.cost.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.com.dinamicaonline.cost.service.ExtractionPlacesService;
import ar.com.dinamicaonline.cost.service.ParameterService;


@RestController
@RequestMapping("/api/v1")
public class CostController {

    @Autowired
    private ParameterService parameterService;

    @Autowired
    private ExtractionPlacesService extractionPlacesService;

    @RequestMapping(value = "/deposit_money", method = RequestMethod.POST)
    public ResponseEntity<?> getDepositMoney(){
        return extractionPlacesService.getDepositMoney();
    }

    @RequestMapping(value = "/cash_withdrawal", method = RequestMethod.POST)
    public ResponseEntity<?> getCashWithdrawal(){
        return extractionPlacesService.getCashWithdrawal();
    }

    @PostMapping(value = "/transfer_money")
    public ResponseEntity<?> getTransferMoney(){
        return parameterService.getTransferMoney();
    }

}
