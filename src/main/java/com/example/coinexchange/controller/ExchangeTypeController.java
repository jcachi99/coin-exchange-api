package com.example.coinexchange.controller;

import com.example.coinexchange.model.ExchangeType;
import com.example.coinexchange.service.impl.ExchangeTypeService;
import com.example.coinexchange.util.Exception;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/exchangetype")
@RequiredArgsConstructor
public class ExchangeTypeController {

    private final ExchangeTypeService exchangeTypeService;

    @GetMapping("/{id}")
    public ResponseEntity obtainExchangeType(@PathVariable("id") Long id){
        ExchangeType exchangeType = exchangeTypeService.obtainExchangeType(id);
        if(exchangeType!=null){
            return new ResponseEntity(exchangeType, HttpStatus.OK);
        }else{
            return new ResponseEntity(new Exception("no se encontró el tipo de cambio con el id indicado"), HttpStatus.OK);
        }

    }

    @PostMapping
    public ResponseEntity saveExchangeTyoe(@RequestBody ExchangeType exchangeType){
        return new ResponseEntity(exchangeTypeService.saveExchangeType(exchangeType), HttpStatus.OK);
    }
}
