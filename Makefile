run-dist:
	./build/install/app/bin/app

lint:
	./gradlew checkstyleMain

start:
	./gradlew run