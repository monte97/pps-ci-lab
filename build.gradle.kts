plugins {
	java
	scala
}


tasks.named<Test>("test") {
    useJUnitPlatform()
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.scala-lang:scala-library:2.12.2")
	testImplementation("org.junit.jupiter:junit-jupiter-api:5.1.0")
	testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.1.0")
}
