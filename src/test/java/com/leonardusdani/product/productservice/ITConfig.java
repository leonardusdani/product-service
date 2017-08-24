package com.leonardusdani.product.productservice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class ITConfig {

    @Autowired
    private Environment env;

    @Bean
    public WebDriver webDriver() throws MalformedURLException {
        return new RemoteWebDriver(getRemoteUrl(), getDesiredCapabilities());
    }

    private DesiredCapabilities getDesiredCapabilities() {

        final DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        if (useSauceLabs()) {
            capabilities.setCapability("tunnel-identifier", env.getProperty("TRAVIS_JOB_NUMBER"));
            capabilities.setCapability("seleniumVersion", env.getProperty("selenium.version"));
        }

        return capabilities;
    }

    private boolean useSauceLabs() {
        return env.getProperty("SAUCE_USERNAME") != null;
    }

    private URL getRemoteUrl() throws MalformedURLException {
        if (useSauceLabs()) {
            return new URL(String.format("http://%s:%s@ondemand.saucelabs.com:80/wd/hub",
                    env.getProperty("SAUCE_USERNAME"), env.getProperty("SAUCE_ACCESS_KEY")));
        } else {
            return new URL("http://ondemand.saucelabs.com:80/wd/hub");
        }
    }
}
