run-dist:
	./build/install/app/bin/app

build-dist:
	./gradlew installDist

lint:
	./gradlew checkstyleMain

start:
	./gradlew run