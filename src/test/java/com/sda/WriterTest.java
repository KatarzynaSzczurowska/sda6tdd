package com.sda;

import com.sda.Writer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class WriterTest {
    private Writer writer;

    // before- metoda, która bedzie wywoływać w każdej metodzie dany kod.
    @Before
    public void init() {
        writer = new Writer();

    }

    @Test
    public void sayHelloTest() {

        String name = "Szymon";

        String result = writer.sayHello( name );

        Assert.assertEquals( "Excepted hello message is invalind", "Hello, Szymon!", result );

    }

    @Test
    public void SayHelloWithNullName() {
        String name = null;

        String result = writer.sayHello( name );

        Assert.assertEquals( "Message for empty name should be diffrent ", "hello my friend", result );


    }

    @Test
    public void sayHelloWithCapitalizedNameSpecified() {
        String name = "SZYMON";

        String result = writer.sayHello( name );

        Assert.assertEquals( "HELLO, SZYMON!", result );

    }

    @Test
    public void sayHelloWithOneSpaceName() {
        String name = " ";

        String result = writer.sayHello( name );

        Assert.assertEquals( "Hello, my friend", result );

    }

    @Test
    public void sayHelloWithBlankName() {
        String name = "    ";
        String result = writer.sayHello( name );

        Assert.assertEquals( "Hello, my friend", result );
    }

    @Test
    public void sayHelloWithMultipleNames() {
        String name = "Szymon,Jan,Anna";
        String result = writer.sayHello(name);

        Assert.assertEquals( "Hello, Szymon,Jan and Anna!", result );
    }
    @Test
    public void sayHelloWithMultipleCapitalizedNames (){
        String name = "SZYMON,JAN,ANNA";

        String result = writer.sayHello( name );

        Assert.assertEquals( "HELLO, SZYMON, JAN AND ANNA!", result );
    }


}

