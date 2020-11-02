# openjfx-app-fxml
Velmi jednoduchá aplikace - formulář se dvě input boxy, presentující použití [openjfx](https://openjfx.io/index.html) (implementace Java FX) a zároveň použití tzv. FXML.

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
V tomto případě jsem použil Eclipse v2020-09 a [doinstaloval](https://download.eclipse.org/efxclipse/updates-released/3.7.0/site/) (konrkétně tuto versi v3.7.0) jsem si plugin, viz.(https://wiki.eclipse.org/Efxclipse/Tutorials/AddingE(fx)clipse_to_eclipse) pro JavaFX. Původně jsem čerpal z tohoto [zdroje](https://docs.oracle.com/javafx/scenebuilder/1/use_java_ides/sb-with-eclipse.htm), který poukázal na existenci [e(fx)clipse](https://www.eclipse.org/efxclipse/install.html) pluginu pro JavaFX.

## Zdroje
* https://github.com/openjdk/jfx/
* https://openjfx.io/index.html
* https://openjfx.io/openjfx-docs/#maven << OpenJFX - Run HelloWorld using Maven
* https://github.com/openjfx/javafx-maven-plugin#usage << Použití maven plugin-u, resp. příkazu ```javafx:run```
* https://www.eclipse.org/efxclipse/index.html << Eclipse IDE plugin pro JavaFX
* https://wiki.eclipse.org/Efxclipse/Tutorials/AddingE(fx)clipse_to_eclipse << Eclipse IDE plugin pro JavaFX
