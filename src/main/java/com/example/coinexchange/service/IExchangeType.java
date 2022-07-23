package com.example.coinexchange.service;

import com.example.coinexchange.model.ExchangeType;

import java.util.Optional;

public interface IExchangeType {

    ExchangeType obtainExchangeType(Long id);

    ExchangeType saveExchangeType(ExchangeType exchangeType);

    ExchangeType obtainExchangeTypeByOriginAndDestiny(String origin, String destiny);

}
