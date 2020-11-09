# openjfx-app-control-treeview
Velmi jednoduchá aplikace - presentující použití [openjfx](https://github.com/openjdk/jfx/) (implementace Java FX) a komponentu TreeView.

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
* https://docs.oracle.com/javafx/2/ui_controls/tree-view.htm#
* https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/TreeView.html
* http://tutorials.jenkov.com/javafx/treeview.html << pouzity pro ukazku
* https://examples.javacodegeeks.com/core-java/javafx-treeview-example/
* http://www.kware.net/?p=204 << Filtering a JavaFX TreeView
