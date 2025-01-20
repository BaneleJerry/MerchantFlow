package dev.banelethabede.MerchantFlow.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Product{

    private final int id;
    private final String name;
    private final double price;
}
