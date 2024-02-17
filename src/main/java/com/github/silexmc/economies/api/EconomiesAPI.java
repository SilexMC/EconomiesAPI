package com.github.silexmc.economies.api;

import com.github.silexmc.economies.api.enums.Economies;

import java.math.BigInteger;
import java.util.UUID;

public interface EconomiesAPI {
    BigInteger getBalance(Economies economies, UUID uniqueID);

    String getStringBalance(Economies economies, UUID uniqueID);

    String getFormatBalance(Economies economies, UUID uniqueID);


    BigInteger getTotalBalance(Economies economies, UUID uniqueID);

    String getStringTotalBalance(Economies economy, UUID uniqueID);

    String getFormatTotalBalance(Economies economies, UUID uniqueID);


    void setBalance(Economies economies, UUID uniqueID, BigInteger value);

    void giveBalance(Economies economies, UUID uniqueID, BigInteger value);

    void takeBalance(Economies economies, UUID uniqueID, BigInteger value);

    boolean hasBalance(Economies economies, UUID uniqueID, BigInteger value);


    default void setBalance(Economies economies, UUID uniqueID, Integer value) {
        this.setBalance(economies, uniqueID, BigInteger.valueOf(value));
    }

    default void giveBalance(Economies economies, UUID uniqueID, Integer value) {
        this.giveBalance(economies, uniqueID, BigInteger.valueOf(value));
    }

    default void takeBalance(Economies economies, UUID uniqueID, Integer value) {
        this.takeBalance(economies, uniqueID, BigInteger.valueOf(value));
    }

    default boolean hasBalance(Economies economies, UUID uniqueID, Integer value) {
        return this.hasBalance(economies, uniqueID, BigInteger.valueOf(value));
    }
}
