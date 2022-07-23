package com.example.coinexchange.service.impl;

import com.example.coinexchange.model.ExchangeType;
import com.example.coinexchange.repository.ExchangeTypeRepository;
import com.example.coinexchange.service.IExchangeType;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ExchangeTypeService implements IExchangeType {

    private final ExchangeTypeRepository exchangeTypeRepository;

    @Override
    public ExchangeType obtainExchangeType(Long id) {
        try{
            return exchangeTypeRepository.findById(id).get();
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public ExchangeType saveExchangeType(ExchangeType exchangeType) {
        return exchangeTypeRepository.save(exchangeType);
    }

    @Override
    public ExchangeType obtainExchangeTypeByOriginAndDestiny(String origin, String destiny) {
        try{
            return exchangeTypeRepository.obtainExchangeTypeByOriginAndDestiny(origin,destiny);
        }catch (Exception e){
            return null;
        }
    }

}
