package tests.walmart.feature;
import org.junit.runner.*;

import cucumber.api.*;
import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
    glue = "tests.walmart.step",
    features = "classpath:features/",
    format = { "pretty", "html: target/cucumber.html", "json: target/cucumber.json" },
    tags = { "~@Ignore", "@WIP" },
    strict = true
)
public class FeatureTest {
}