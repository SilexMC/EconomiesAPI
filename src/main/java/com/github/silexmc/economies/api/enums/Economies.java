package com.github.silexmc.economies.api.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor @Getter
public enum Economies {
    MONEY("Money"), TOKEN("Tokens"), GEM("Gems"), CRYSTAL("Crystals");

    private final String name;
}
