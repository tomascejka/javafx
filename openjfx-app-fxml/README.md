# openjfx-app-fxml
Velmi jednoduchá aplikace - formulář se dvě input boxy, presentující použití [openjfx](https://openjfx.io/index.html) (implementace Java FX) a zároveň použití tzv. [FXML](https://en.wikipedia.org/wiki/FXML). Obsahově/design vychází z tohoto [tutoriálu](https://docs.oracle.com/javafx/2/get_started/fxml_tutorial.htm).

## Co to je FXML
Citace:
>FXML is an XML-based user interface markup language created by Oracle Corporation for defining the user interface of a JavaFX application. FXML presents an alternative to designing user interfaces using procedural code, and allows for abstracting program design from program logic.

### FXML zdroje
* https://docs.oracle.com/javafx/2/fxml_get_started/jfxpub-fxml_get_started.htm
* https://docs.oracle.com/javafx/2/get_started/fxml_tutorial.htm
* https://docs.oracle.com/javafx/2/api/javafx/fxml/doc-files/introduction_to_fxml.html
* http://tutorials.jenkov.com/javafx/fxml.html
* https://www.itnetwork.cz/java/javafx/uvod-do-javafx
* https://www.oracle.com/java/technologies/javase/javafxscenebuilder-info.html << nástroj pro snadné editování FXML
* https://gamedevelopment.tutsplus.com/cs/tutorials/introduction-to-javafx-for-game-development--cms-23835

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
V tomto případě jsem použil Eclipse v2020-09 a [doinstaloval](https://download.eclipse.org/efxclipse/updates-released/3.7.0/site/) (konrkétně tuto versi v3.7.0) jsem si plugin, viz.(https://wiki.eclipse.org/Efxclipse/Tutorials/AddingE(fx)clipse_to_eclipse) pro JavaFX. Původně jsem čerpal z tohoto [zdroje](https://docs.oracle.com/javafx/scenebuilder/1/use_java_ides/sb-with-eclipse.htm), který poukázal na existenci [e(fx)clipse](https://www.eclipse.org/efxclipse/install.html) pluginu pro JavaFX.

### Scene Builder
Toto je výborný [nástroj](https://www.oracle.com/java/technologies/javase/javafxscenebuilder-info.html) od Oracle pro namodelování scény, vzhledu formulářu a vůbec JavaFX aplikací s tím,že z toho vypadne FXML soubor.

## Zdroje

### OpenJFX
* https://github.com/openjdk/jfx/
* https://openjfx.io/index.html

### Nástroje
* https://www.oracle.com/java/technologies/javase/javafxscenebuilder-info.html
* https://www.vojtechruzicka.com/javafx-fxml-scene-builder/
* https://www.eclipse.org/efxclipse/index.html << Eclipse IDE plugin pro JavaFX
* https://wiki.eclipse.org/Efxclipse/Tutorials/AddingE(fx)clipse_to_eclipse << Eclipse IDE plugin pro JavaFX


