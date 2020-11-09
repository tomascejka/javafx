# Nastavení Java FX projektu
Cílem je nastavení Java projektu, v kterém je možné jednoduše začít programovat Java FX aplikaci. V podstatě je nutné si vybrat versi JDK, v které chcete programovat, od toho se odvíjí, jakou versi JavaFX budete používat.

## Verse JavaFX
Do [JDK8](https://docs.oracle.com/javase/8/docs/) lze použít oficiální oracle [distribuci](https://docs.oracle.com/javase/8/javase-clienttechnologies.htm), od [JDK11](https://docs.oracle.com/en/java/javase/11/) je nutné použít již [OpenJFX projekt](https://wiki.openjdk.java.net/display/OpenJFX).

Protože Oracle rád maže/přesouvá články, tak budu citovat:
>For more information on JavaFX with Java SE 8, please refer to the JavaFX Documentation.
>For JDK 11 and later releases, Oracle has open sourced JavaFX. You can find more information at OpenJFX project.

[zdroj]( https://www.oracle.com/java/technologies/javase/javafx-overview.html)

V tomto projektu jsem si vybral JDK11, tzn. i OpenJFX - doporučuji.

## Maven
Byť se může zdát toto jako komplikace, usnadní to režijní práci, např. s nastavením knihoven/vlastností. Soubor ```pom.xml``` nastavíte jednou, popř. jej velmi snadno rozšíříte o "dependency" (např. když budete chtít přidat FXML design).

## Nastavení projektu
Nejdříve nadefinujete verse knihoven, s kterými budete pracovat (pomoci ```maven/properties```) a tím deklarujete technologický stack, který bude pohánět Vaše JavaFX projekty - v tomto projektu se snažím o min. úsilí a jednoduchost.

```
	<properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<java.se.version>11</java.se.version>
		<!-- openjxf -->
		<mvn.plugin.openjfx.version>0.0.5</mvn.plugin.openjfx.version><!-- https://mvnrepository.com/artifact/org.openjfx/javafx-maven-plugin -->
		<org.openjfx.version>16-ea+3</org.openjfx.version><!-- https://mvnrepository.com/artifact/org.openjfx/javafx-controls -->
		<!-- third deps -->
		<slf4j.version>1.7.30</slf4j.version>
		<log4j.version>1.2.17</log4j.version>
	</properties>
```
### Maven pluginy
Pak nastavíme java compiler plugin - tzn. versi JDK11, usnadní to práci v Java IDE (v jakémkoli). Dále nastavíme plugin pro spouštění Java FX aplikace - to se definuje pomocí ```mainClass```, která nalinkuje třídu, která implementuje [Application](https://openjfx.io/javadoc/11/javafx.graphics/javafx/application/Application.html) a tím se stane vstupním bodem/spouštěčem Vaší JavaFx aplikace. 
```
	<build>
		<plugins>
			<!-- https://mvnrepository.com/artifact/org.apache.maven.plugins/maven-compiler-plugin -->
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.8.1</version>
				<configuration>
					<source>${java.se.version}</source>
					<target>${java.se.version}</target>
				</configuration>
			</plugin>
			<!-- openjfx -->
			<plugin>
				<groupId>org.openjfx</groupId>
				<artifactId>javafx-maven-plugin</artifactId>
				<version>${mvn.plugin.openjfx.version}</version>
				<configuration>
					<mainClass>cz.toce.openjfx.app.MainApp</mainClass>
				</configuration>
			</plugin>
		</plugins>
	</build>
```

### Maven závislosti
V tomto bodě ještě nastavíme závislost na knihovny, které si přejeme používat - pro začátek stačí ```javafx-controls``` (obsahuje základní prvky/widgety) pro práci s GUI. Pro další rozšíření znalostí je možné používat MVC přístup pomocí ```javafx-fxml``` knihovny. Popř. pro další vlastnosti a knihovny je možné použít tento seznam [org.openjfx knihoven](https://mvnrepository.com/artifact/org.openjfx).

```
	<dependencies>
		<!-- openjfx -->
		<dependency>
			<groupId>org.openjfx</groupId>
			<artifactId>javafx-controls</artifactId>
			<version>${org.openjfx.version}</version>
		</dependency>
		<dependency>
			<groupId>org.openjfx</groupId>
			<artifactId>javafx-fxml</artifactId>
			<version>${org.openjfx.version}</version>
		</dependency>
		<!-- Logging -->
		<dependency>
			<groupId>org.slf4j</groupId>
			<artifactId>slf4j-api</artifactId>
			<version>${slf4j.version}</version>
		</dependency>
		<dependency>
			<groupId>org.slf4j</groupId>
			<artifactId>jcl-over-slf4j</artifactId>
			<version>${slf4j.version}</version>
		</dependency>
		<dependency>
			<groupId>org.slf4j</groupId>
			<artifactId>slf4j-log4j12</artifactId>
			<version>${slf4j.version}</version>
		</dependency>
		<dependency>
			<groupId>log4j</groupId>
			<artifactId>log4j</artifactId>
			<version>${log4j.version}</version>
		</dependency>
	</dependencies>
```

## Shrnutí
Tady je pom.xml celý

<script src="https://gist.github.com/tomascejka/105e4bbb8d50a10f28839680d6b5dad7.js"></script>

## Zdroje

### OpenJFX
* https://openjfx.io/openjfx-docs/#introduction << jak nastavit jdk, maven a javafx (via [https://openjfx.io/](openjfx.io))
* https://github.com/openjfx/javafx-maven-plugin << maven plugin pro javafx vývoj

### Další
* https://www.vojtechruzicka.com/javafx-getting-started/ << jak nastavit jdk11+, maven a javafx