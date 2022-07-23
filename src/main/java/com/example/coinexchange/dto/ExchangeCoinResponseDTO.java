package com.example.coinexchange.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExchangeCoinResponseDTO {

    private Double monto;
    private Double monto_cambiado;
    private String moneda_origen;
    private String moneda_destino;
    private Double tipo_cambio;

}
