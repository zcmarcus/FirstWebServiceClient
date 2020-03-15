package com.daehosting.temperatureconversions;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConversionsTest {

    @Test
    void celsiusToFahrenheitSuccess() {
        ObjectFactory factory = new ObjectFactory();
        CelsiusToFahrenheit celsiusToFahrenheit = factory.createCelsiusToFahrenheit();
        celsiusToFahrenheit.setNCelsius(BigDecimal.valueOf(0));

        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal actual = service.celsiusToFahrenheit(celsiusToFahrenheit.getNCelsius());
        BigDecimal expected = BigDecimal.valueOf(32);
        assertEquals(expected, actual);
    }


    @Test
    void fahrenheitToCelsiusSuccess() {
        ObjectFactory factory = new ObjectFactory();
        FahrenheitToCelsius fahrenheitToCelsius = factory.createFahrenheitToCelsius();
        fahrenheitToCelsius.setNFahrenheit(BigDecimal.valueOf(122));

        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal actual = service.fahrenheitToCelsius(fahrenheitToCelsius.getNFahrenheit());
        BigDecimal expected = BigDecimal.valueOf(50);
        assertEquals(expected, actual);
    }

    @Test
    void windChillInFahrenheitSuccess() {
        ObjectFactory factory = new ObjectFactory();
        WindChillInFahrenheit windChillInFahrenheit = factory.createWindChillInFahrenheit();
        windChillInFahrenheit.setNFahrenheit(BigDecimal.valueOf(31));
        windChillInFahrenheit.setNWindSpeed(BigDecimal.valueOf(18));


        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal actual = service.windChillInFahrenheit(
                windChillInFahrenheit.getNFahrenheit()
                , windChillInFahrenheit.getNWindSpeed()
                );
        BigDecimal expected = BigDecimal.valueOf(2.80788008);
        assertEquals(expected, actual);
    }

    @Test
    void windChillInCelsiusSuccess() {
        ObjectFactory factory = new ObjectFactory();
        WindChillInCelsius windChillInCelsius = factory.createWindChillInCelsius();
        windChillInCelsius.setNCelsius(BigDecimal.valueOf(2));
        windChillInCelsius.setNWindSpeed(BigDecimal.valueOf(15));

        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal actual = service.windChillInCelsius(
                windChillInCelsius.getNCelsius()
                , windChillInCelsius.getNWindSpeed()
                );
        BigDecimal expected = BigDecimal.valueOf(-10.715);
        assertEquals(expected, actual);
    }
    
}