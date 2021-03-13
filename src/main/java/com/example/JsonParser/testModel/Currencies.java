package com.example.JsonParser.testModel;

import com.example.JsonParser.model.Rate;

import java.util.Set;

public class Currencies {
    private int id;
    private String currencyName;
    private String currencyCode;
    @OneToMany
    private Set<Rate> rateSet;

}
