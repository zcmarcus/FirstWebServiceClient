package com.daehosting.temperatureconversions;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConversionsTest {

    @Test
    void celsiusToFahrenheitSuccess() {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal actual = service.celsiusToFahrenheit(BigDecimal.valueOf(0));
        BigDecimal expected = BigDecimal.valueOf(32);
        assertEquals(expected, actual);
    }


    @Test
    void fahrenheitToCelsiusSuccess() {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal actual = service.fahrenheitToCelsius(BigDecimal.valueOf(122));
        BigDecimal expected = BigDecimal.valueOf(50);
        assertEquals(expected, actual);
    }

    @Test
    void windChillInFahrenheitSuccess() {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal actual = service.windChillInFahrenheit(BigDecimal.valueOf(25), BigDecimal.valueOf(8));
        BigDecimal expected = BigDecimal.valueOf(11.33768012);
        assertEquals(expected, actual);
    }

    @Test
    void windChillInCelsiusSuccess() {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal actual = service.windChillInFahrenheit(BigDecimal.valueOf(5), BigDecimal.valueOf(14));
        BigDecimal expected = BigDecimal.valueOf(-23.82268);
        assertEquals(expected, actual);
    }




}