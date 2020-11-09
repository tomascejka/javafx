![JavaFX logo](/pics/JavaFX_Logo.png "Java FX logo")
# JavaFX
Repositář pro studium a testování - jak naprogramovat desktop GUI via [java.fx](https://en.wikipedia.org/wiki/JavaFX).

## Changelog
| Kdy        | Kdo         | Co           |
| ---------- |:-----------:| :---------------------------------------------------------------------------------|
| 02/11/2020 | tomas.cejka | prozatím přikládám zdroje, které jsem prošel a zkusil si jednoduchý "Hello world" |
| 03/11/2020 | tomas.cejka | dokládám další zdroje, změna formulace popisu, upravuji/rozděluji fxml/fxml+miglayout projekty |
| 09/11/2020 | tomas.cejka | novy projekty pro treeView a treeView+fxml |

## Projekty
Koncept je velmi jednoduchý - presentovat jednoduše java.fx pomocí malých maven projektů. Smyslem je se seznámit jednoduše - komplexnost nechat na nějakém vizi/výzvě anebo konkrétním úkolu, kde bude java.fx vhodné použít (např. napsat si RSS čtečku). Zde je seznam projektů:

* [openjfx-app-simple](https://github.com/tomascejka/javafx/tree/main/openjfx-app-simple) - první a jednoduchý "Hello world"
* [openjfx-app-fxml](https://github.com/tomascejka/javafx/tree/main/openjfx-app-fxml) - velmi prosté seznámení se s FXML (Model View Controller přístup v java.fx)
* [openjfx-app-control-treeview](https://github.com/tomascejka/javafx/tree/main/openjfx-app-control-treeview) - jednoduché použití TreeView komponenty
* [openjfx-app-fxml-treeview](https://github.com/tomascejka/javafx/tree/main/openjfx-app-fxml-treeview) - použití TreeView komponenty pomocí FXML
* [openjfx-app-miglayout-fxml](https://github.com/tomascejka/javafx/tree/main/openjfx-app-miglayout-fxml) - použití nestandartního layout managera - MigLayout

## Zdroje

### OpenJFX
* https://openjfx.io/openjfx-docs/#introduction << jak nastavit jdk, maven a javafx (via [https://openjfx.io/](openjfx.io))
* https://github.com/openjfx/javafx-maven-plugin << maven plugin pro javafx vývoj

### Oracle
* https://www.oracle.com/java/technologies/javase/javafx-overview.html
* https://docs.oracle.com/javafx/2/
* https://docs.oracle.com/javase/8/javase-clienttechnologies.htm
* https://www.oracle.com/java/technologies/javase/javafx-docs.html
* https://blogs.oracle.com/java/javafx
* https://docs.oracle.com/javafx/2/get_started/fxml_tutorial.htm << jak používat FXML v javafx
* https://docs.oracle.com/javafx/2/get_started/hello_world.htm << oficiální oracle java fx tutoriál pro různé zkoušení
* https://docs.oracle.com/javafx/2/css_tutorial/jfxpub-css_tutorial.htm << jak skinovat via CSS styly java.fx aplikace
* https://docs.oracle.com/javafx/2/api/javafx/scene/doc-files/cssref.html << java.fx css reference stylopisu
* https://www.tutorialspoint.com/javafx/javafx_css.htm << java.fx css stylování
* https://www.vojtechruzicka.com/javafx-layouts-basic/ << hezky popsané java.fx layouty

## Others
* http://fxexperience.com/
* https://www.vojtechruzicka.com/javafx-getting-started/ << jak nastavit jdk11+, maven a javafx
* http://tutorials.jenkov.com/javafx/index.html
* https://java.vse.cz/4it115/Buchalcevova << přednášky česky o java fx
* https://oracle-patches.com/en/coding/3458-what-is-javafx << obsahuje historii versi Java FX
* https://learnjavafx.typepad.com/ << blog obsahuje mnoho článků na téma Java FX
* https://www.jfx-days.com/speakers << kromě pozvánky na konferenci jsou tam tipy na knihy
