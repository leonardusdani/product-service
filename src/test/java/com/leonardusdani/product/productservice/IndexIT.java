package com.leonardusdani.product.productservice;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

@RunWith(SpringJUnit4ClassRunner.class)
public class IndexIT {

    @Autowired
    private WebDriver webDriver;

    @Value("${server.port}")
    private int serverPort;

    @Test
    public void visitIndexPage() throws Exception {

        webDriver.get(String.format("http://localhost:%d/", serverPort));
        try {
        	Thread.sleep(5000000);
        }catch (Exception e) {
        	System.out.println(e.getMessage());
			// TODO: handle exception
		}
        //WebElement working = webDriver.findElement(By.id("working"));
        webDriver.get("https://saucelabs.com/test/guinea-pig");
        System.out.println("title of page is: " + webDriver.getTitle());

        Assert.assertThat("It work!", is(equalTo("It works!")));
    }
}
