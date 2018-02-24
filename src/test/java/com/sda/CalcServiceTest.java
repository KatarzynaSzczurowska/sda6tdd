package com.sda;

import com.sda.CalcService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalcServiceTest {

    private CalcService calcService;

    @Before
    public void init() {
        calcService = new CalcService();
    }

    @Test
    public void shouldAddDigitsInStringAndProduceResult() {
        // Given: podajemy dane wejściowe
        String text = "2;3;4";
        int expected = 9;

        // when:
        int actual = calcService.calculate( text );

        // then
        //Assert.assertEquals( expected, actual );
        Assert.assertEquals( expected,actual );
    }
}
