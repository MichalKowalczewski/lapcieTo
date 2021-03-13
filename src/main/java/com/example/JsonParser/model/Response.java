package com.example.JsonParser.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Map;

@Data
public class Response {
    Map<String, Rate> rates;
}
