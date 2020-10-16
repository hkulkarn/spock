package com.demo.test

import groovy.util.logging.Slf4j
import spock.lang.Specification

@Slf4j
class HelloWorld extends Specification{

	def setupSpec(){
		log.debug("setupSpec() - Runs once per Specification");
	}
	def setup(){
		log.debug ("setup() - Runs before every feature method");
	}

	def "Print Hello World" () {
		given:
			String str = "Hello World"
		when:
			Boolean flag = str.equals("Hello World")
		then:
			flag == true
	}

	def cleanup(){
		log.debug ("Cleanup method - Runs after every feature method.");
	}
	def cleanupSpec(){
		log.debug ("cleanupSpec() - Runs only once per specification");
	}
}
