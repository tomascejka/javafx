# openjfx-app-control-treeview
Aplikace - presentující použití [openjfx](https://github.com/openjdk/jfx/) (implementace Java FX) a komponentu TreeView definovat pomocí [FXML](https://en.wikipedia.org/wiki/FXML). Další materiál ke studiu FXML je tento [tutoriál](https://docs.oracle.com/javafx/2/get_started/fxml_tutorial.htm)..

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
* https://gist.github.com/jewelsea/5174074 << pouzity pro ukazku
* https://stackoverflow.com/questions/15439894/javafx-wrapping-fxml-to-java-class-controller << popisuje, proc
* https://examples.javacodegeeks.com/core-java/javafx-treeview-example/
