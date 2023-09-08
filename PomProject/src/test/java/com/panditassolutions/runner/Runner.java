package com.panditassolutions.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"com.panditassolutions.stepdefinitions"},
        features = "src/test/java/resources/features/guru_login.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE

)

public class Runner {
}
