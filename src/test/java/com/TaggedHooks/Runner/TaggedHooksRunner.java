package com.TaggedHooks.Runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = "com.LearnTaggedHooks.stepDefinitions",
        tags = "@ValidSubscriber")


public class TaggedHooksRunner {
}
