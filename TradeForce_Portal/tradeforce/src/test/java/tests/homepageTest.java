package tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/CadastroColaborador.feature", 
	  glue = {""}, monochrome = true, dryRun = false)

public class homepageTest {
	
	

}