# openjfx-app-miglayout-fxml
Velmi jednoduchá aplikace - formulář se dvě input boxy, presentující použití [openjfx](https://openjfx.io/index.html) (implementace Java FX) a zároveň použití tzv. FXML a [MigLayout](http://www.miglayout.com/).

## Předpoklady
V případě, že si budete chtít spustit, anebo si hrát se zdrojovými kódy, tak jsem to ladil s těmito nástroji:
* [oracle jdk v11+](https://www.oracle.com/java/technologies/javase-downloads.html)
* [apache maven v 3.6.3](https://archive.apache.org/dist/maven/maven-3/3.6.3/binaries/)
* [openjxf](https://openjfx.io/index.html)
* [openjxf maven plugin](https://github.com/openjfx/javafx-maven-plugin)
* v případe Eclipse IDE se hodí - e(fx)clipse plugin, viz. https://wiki.eclipse.org/Efxclipse/Tutorials/AddingE(fx)clipse_to_eclipse

## Použití
Stačí spustit v root adresáři v kterém je ```pom.xml``` soubor příkaz ```javafx:run```:
```
mvn clean javafx:run
```

## Nástroje

### Eclipse IDE
V Eclipse IDE, verse [2020-09](https://www.eclipse.org/downloads/packages/release/2020-09) mi bohužel nešel použít přístup přes tzv. [Scene Builder](https://www.oracle.com/java/technologies/javase/javafxscenebuilder-info.html), resp. jeho nastavení pro Eclipse IDE via [e(fx)clipse plugin](https://docs.oracle.com/javase/8/scene-builder-2/work-with-java-ides/sb-with-eclipse.htm). Konrétně, když jsem spustil nad souborem ```src/main/resources/fxml/hello.fxml``` - volbu "Run as SceneBuilder", tak vyskočila exception:
```
java.io.IOException: javafx.fxml.LoadException: 
/D:/Repositories/labs/javafx/openjfx-app-miglayout-fxml/src/main/resources/fxml/hello.fxml
...
Caused by: java.lang.ClassNotFoundException: org.tbee.javafx.scene.layout.fxml.MigPane
	at java.lang.ClassLoader.findClass(ClassLoader.java:530)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
	at javafx.fxml.FXMLLoader.loadTypeForPackage(FXMLLoader.java:2932)
	at javafx.fxml.FXMLLoader.loadType(FXMLLoader.java:2921)
	at javafx.fxml.FXMLLoader.importClass(FXMLLoader.java:2862)
	... 27 more
```

## Zdroje
* http://www.miglayout.com/
* https://github.com/openjdk/jfx/
* https://openjfx.io/index.html
* https://www.eclipse.org/efxclipse/index.html << Eclipse IDE plugin pro JavaFX
* https://wiki.eclipse.org/Efxclipse/Tutorials/AddingE(fx)clipse_to_eclipse << Eclipse IDE plugin pro JavaFX
