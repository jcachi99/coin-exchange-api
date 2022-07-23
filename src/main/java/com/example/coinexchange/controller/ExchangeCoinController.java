package com.example.coinexchange.controller;

import com.example.coinexchange.dto.ExchangeCoinDTO;
import com.example.coinexchange.dto.ExchangeCoinResponseDTO;
import com.example.coinexchange.service.impl.ExchangeCoinService;
import com.example.coinexchange.util.Exception;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exchangecoin")
@RequiredArgsConstructor
public class ExchangeCoinController {

    private final ExchangeCoinService exchangeCoinService;

    @PostMapping
    public ResponseEntity exchangeCoin(@RequestBody ExchangeCoinDTO exchangeCoinDTO){
        ExchangeCoinResponseDTO exchangeCoinResponseDTO = exchangeCoinService.changeCoin(exchangeCoinDTO);
        if(exchangeCoinResponseDTO!=null){
            return new ResponseEntity(exchangeCoinResponseDTO, HttpStatus.OK);
        }else{
            return new ResponseEntity(new Exception("no se encontró el tipo de cambio para el origen y el destino indicado"), HttpStatus.OK);
        }
    }

}
