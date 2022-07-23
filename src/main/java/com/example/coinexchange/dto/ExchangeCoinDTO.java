package com.example.coinexchange.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExchangeCoinDTO {

    private Double monto;
    private String moneda_origen;
    private String moneda_destino;

}
