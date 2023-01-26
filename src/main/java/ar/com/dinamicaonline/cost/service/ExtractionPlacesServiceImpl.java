package ar.com.dinamicaonline.cost.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import ar.com.dinamicaonline.cost.models.ExtractionPlaces;
import ar.com.dinamicaonline.cost.repositories.ExtractionPlacesRepository;

@Service
public class ExtractionPlacesServiceImpl implements ExtractionPlacesService{
    
    @Autowired
    private ExtractionPlacesRepository extractionPlacesRepository;

    @Override
    public ResponseEntity<?> getDepositMoney() {
        List<ExtractionPlaces> extractionPlaces = extractionPlacesRepository.findExtractionPlaces();
        List<Map<String, Object>> responseBodyList = new ArrayList<Map<String, Object>>();
        for(int i = 0; i<extractionPlaces.size(); i++){
            Map<String, Object> resBody = new HashMap<>();
            responseBodyList.add(resBody);
        }
        Map<String, Object> responseBody = new HashMap<>();
        for (int i = 0; i<extractionPlaces.size(); i++) {
            responseBodyList.get(i).put("name", extractionPlaces.get(i).getName());
            responseBodyList.get(i).put("minDepositAmount", extractionPlaces.get(i).getMinDepositAmount());
            responseBodyList.get(i).put("maxDepositAmount", extractionPlaces.get(i).getMaxDepositAmount());
            responseBodyList.get(i).put("minDepositCommision", extractionPlaces.get(i).getMinDepositCommision());
            responseBodyList.get(i).put("depositCommisionPercent", extractionPlaces.get(i).getDepositCommisionPercent());
            responseBodyList.get(i).put("maxDepositCommisionZero", extractionPlaces.get(i).getMaxDepositCommisionZero());
            responseBodyList.get(i).put("maxDepositCount", extractionPlaces.get(i).getMaxDepositCount());
        }
        responseBody.put("places", responseBodyList);
        return new ResponseEntity<>(responseBody,  HttpStatus.OK);
    }
    
    @Override
    public ResponseEntity<?> getCashWithdrawal() {
        List<ExtractionPlaces> extractionPlaces = extractionPlacesRepository.findExtractionPlaces();
        List<Map<String, Object>> responseBodyList = new ArrayList<Map<String, Object>>();
        for(int i = 0; i<extractionPlaces.size(); i++){
            Map<String, Object> resBody = new HashMap<>();
            responseBodyList.add(resBody);
        }
        Map<String, Object> responseBody = new HashMap<>();
        for (int i = 0; i<extractionPlaces.size(); i++) {
            responseBodyList.get(i).put("name", extractionPlaces.get(i).getName());
            responseBodyList.get(i).put("minExtractionAmount", extractionPlaces.get(i).getMinExtractionAmount());
            responseBodyList.get(i).put("minExtractionCommision", extractionPlaces.get(i).getMinExtractionCommision());
            responseBodyList.get(i).put("extractionCommisionPercent", extractionPlaces.get(i).getExtractionCommisionPercent());
            responseBodyList.get(i).put("maxExtractionAmount", extractionPlaces.get(i).getMaxExtractionAmount());
            responseBodyList.get(i).put("maxExtractionCommisionZero", extractionPlaces.get(i).getMaxExtractionCommisionZero());
            responseBodyList.get(i).put("maxExtractionCount", extractionPlaces.get(i).getMaxExtractionCount());
        }
        responseBody.put("places", responseBodyList);
        return new ResponseEntity<>(responseBody,  HttpStatus.OK);
    }
    
}
