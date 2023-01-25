package ar.com.dinamicaonline.cost.service;

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
        Map<String, Object> responseBody = new HashMap<>();
        List<ExtractionPlaces> extractionPlaces = extractionPlacesRepository.findExtractionPlaces();
        for (ExtractionPlaces extPlace : extractionPlaces) {
            responseBody.put("name", extPlace.getName());
            responseBody.put("minDepositAmount", extPlace.getMinDepositAmount());
            responseBody.put("maxDepositAmount", extPlace.getMaxDepositAmount());
            responseBody.put("minDepositCommision", extPlace.getMinDepositCommision());
            responseBody.put("depositCommisionPercent", extPlace.getDepositCommisionPercent());
            responseBody.put("maxDepositCommisionZero", extPlace.getMaxDepositCommisionZero());
            responseBody.put("maxDepositCount", extPlace.getMaxDepositCount());
        }
        return new ResponseEntity<>(responseBody,  HttpStatus.OK);
    }

    /* @Override
    public ResponseEntity<?> getCashWithdrawal() {
        Map<String, Object> responseBody = new HashMap<>();
        List<ExtractionPlaces> extractionPlaces = extractionPlacesRepository.findExtractionPlaces();
        for (ExtractionPlaces extPlace : extractionPlaces) {
            responseBody.put("name", extPlace.getName());
            responseBody.put("minExtractionAmount", extPlace.getMinExtractionAmount());
            responseBody.put("minExtractionCommision", extPlace.getMinExtractionCommision());
            responseBody.put("extractionCommisionPercent", extPlace.getExtractionCommisionPercent());
            responseBody.put("maxExtractionAmount", extPlace.getMaxExtractionAmount());
            responseBody.put("maxExtractionCommisionZero", extPlace.getMaxExtractionCommisionZero());
            responseBody.put("maxExtractionCount", extPlace.getMaxExtractionCount());
        }
        return new ResponseEntity<>(responseBody,  HttpStatus.OK);
    } */

    @Override
    public ResponseEntity<?> getCashWithdrawal() {
        Map<String, Object> responseBody = new HashMap<>();
        List<ExtractionPlaces> extractionPlaces = extractionPlacesRepository.findExtractionPlaces();
        for (int i = 0; i<extractionPlaces.size(); i++ ) {
            responseBody.put("name", extractionPlaces.get(i).getName());
            responseBody.put("minExtractionAmount", extractionPlaces.get(i).getMinExtractionAmount());
            responseBody.put("minExtractionCommision", extractionPlaces.get(i).getMinExtractionCommision());
            responseBody.put("extractionCommisionPercent", extractionPlaces.get(i).getExtractionCommisionPercent());
            responseBody.put("maxExtractionAmount", extractionPlaces.get(i).getMaxExtractionAmount());
            responseBody.put("maxExtractionCommisionZero", extractionPlaces.get(i).getMaxExtractionCommisionZero());
            responseBody.put("maxExtractionCount", extractionPlaces.get(i).getMaxExtractionCount());
        }
        return new ResponseEntity<>(responseBody,  HttpStatus.OK);
    }
    
}
