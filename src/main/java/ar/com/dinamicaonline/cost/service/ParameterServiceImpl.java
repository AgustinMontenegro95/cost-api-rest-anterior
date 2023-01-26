package ar.com.dinamicaonline.cost.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import ar.com.dinamicaonline.cost.models.Parameter;
import ar.com.dinamicaonline.cost.repositories.ParameterRepository;



@Service
public class ParameterServiceImpl implements ParameterService {

    @Autowired
    private ParameterRepository parameterRepository;

    @Override
    public ResponseEntity<?> getTransferMoney() {
        Map<String, Object> responseBody = new HashMap<>();
        List<Parameter> parameters = parameterRepository.findTransferMoney();
        for (Parameter parameter : parameters) {
            responseBody.put(parameter.getParameterName(), parameter.getParameterValue());
        }
        return new ResponseEntity<>(responseBody,  HttpStatus.OK);
    }
}
