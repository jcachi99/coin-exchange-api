package com.example.coinexchange.service.impl;

import com.example.coinexchange.dto.ExchangeCoinDTO;
import com.example.coinexchange.dto.ExchangeCoinResponseDTO;
import com.example.coinexchange.model.ExchangeType;
import com.example.coinexchange.service.IExchangeCoin;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ExchangeCoinService implements IExchangeCoin {

    private final ExchangeTypeService exchangeTypeService;

    @Override
    public ExchangeCoinResponseDTO changeCoin(ExchangeCoinDTO exchangeCoinDTO) {
        ExchangeType ex = exchangeTypeService.obtainExchangeTypeByOriginAndDestiny(exchangeCoinDTO.getMoneda_origen(),exchangeCoinDTO.getMoneda_destino());
        if(ex!=null){
            ExchangeCoinResponseDTO exchangeCoinResponseDTO = new ExchangeCoinResponseDTO();
            exchangeCoinResponseDTO.setMonto(exchangeCoinDTO.getMonto());
            exchangeCoinResponseDTO.setMoneda_origen(exchangeCoinDTO.getMoneda_origen());
            exchangeCoinResponseDTO.setMoneda_destino(exchangeCoinDTO.getMoneda_destino());
            exchangeCoinResponseDTO.setMonto_cambiado(exchangeCoinDTO.getMonto()*ex.getExchange_type());
            exchangeCoinResponseDTO.setTipo_cambio(ex.getExchange_type());
            return exchangeCoinResponseDTO;
        }else{
            return null;
        }
    }
}
