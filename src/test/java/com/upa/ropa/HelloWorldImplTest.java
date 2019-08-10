
package com.upa.ropa;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloWorldImplTest {

    @Test
    public void testSayHi() {
        HelloWorldImpl helloWorldImpl = new HelloWorldImpl();
        String response = helloWorldImpl.sayHi("Sam");
        assertEquals( "HELLO UPA:", response);
    }
}
