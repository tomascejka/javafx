# openjfx-app-simple
Velmi jednoduchá aplikace - "helloworld", presentující použití [openjfx](https://github.com/openjdk/jfx/) (implementace Java FX).

## Předpoklady
V případě, že si budete chtít spustit, anebo si hrát se zdrojovými kódy, tak jsem to ladil s těmito nástroji:
* [oracle jdk v11+](https://www.oracle.com/java/technologies/javase-downloads.html)
* [apache maven v 3.6.3](https://archive.apache.org/dist/maven/maven-3/3.6.3/binaries/)
* [openjxf](https://openjfx.io/index.html), [další(https://github.com/openjdk/jfx/)
* [openjxf maven plugin](https://github.com/openjfx/javafx-maven-plugin)

## Použití
Stačí spustit v root adresáři v kterém je ```pom.xml``` soubor příkaz ```javafx:run```:
```
mvn clean javafx:run
```

## Zdroje
* https://github.com/openjdk/jfx/
* https://openjfx.io/index.html
* https://openjfx.io/openjfx-docs/#maven << OpenJFX - Run HelloWorld using Maven
* https://github.com/openjfx/javafx-maven-plugin#usage << Použití maven plugin-u, resp. příkazu ```javafx:run```
