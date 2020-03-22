package com.jvcdp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.jvcdp.controller.HomeController;

public class BlogpostAppTest {

	@Test
    public void testApp() {
		HomeController hc = new HomeController();
		String result = hc.index().getModel().get("version").toString();
        assertEquals( result, "0.1" );
	}
}
