package com.example.coinexchange.service;

import com.example.coinexchange.dto.ExchangeCoinDTO;
import com.example.coinexchange.dto.ExchangeCoinResponseDTO;

public interface IExchangeCoin {

    ExchangeCoinResponseDTO changeCoin(ExchangeCoinDTO exchangeCoinDTO);

}
