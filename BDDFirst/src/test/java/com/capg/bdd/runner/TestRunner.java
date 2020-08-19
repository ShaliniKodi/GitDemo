package com.capg.bdd.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features",glue="com.capg.bdd.stepdef",dryRun=false,tags={"@Regression,@Smoke"})
public class TestRunner {

}
