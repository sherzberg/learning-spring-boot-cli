run:
	spring run app/*.groovy

test:
	spring test app/*.groovy tests/*.groovy

jar:
	spring jar test.jar app/*.groovy
