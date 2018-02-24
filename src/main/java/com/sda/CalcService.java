package com.sda;

import org.apache.commons.lang3.StringUtils;

import java.util.stream.Stream;
// definiujemy funkcjonalność
public class CalcService {
    // sumowanie liczb w tekscie, w stringu
    public int calculate(String text) {

        String[] array = StringUtils.isBlank( text ) ? new String [0]: text.replaceAll( "[^\\d;]","" ).split( ";" );
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += Integer.valueOf( array[i] );

        }
        return sum;

    }
}
