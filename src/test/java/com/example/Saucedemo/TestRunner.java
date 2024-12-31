package com.example.Saucedemo;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"com.example.Saucedemo"},
        features = {"src/test/resources/Features"},
       
)
        
public class TestRunner{
        
}      

