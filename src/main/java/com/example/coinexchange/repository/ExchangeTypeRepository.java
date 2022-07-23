package com.example.coinexchange.repository;

import com.example.coinexchange.model.ExchangeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExchangeTypeRepository extends JpaRepository<ExchangeType, Long> {

    @Query("select et from ExchangeType et where et.coin_origin = :origin  and et.coin_destiny= :destiny")
    ExchangeType obtainExchangeTypeByOriginAndDestiny(@Param("origin") String origin, @Param("destiny") String destiny);

}
