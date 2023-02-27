# Illustrationsbeispiel GitHub Actions mit Maven #
Dieses Projekt ist ein Illustrationsbeispiel, um GitHub Actions in einem Maven-Projekt anzuwenden. Als Beispiel wird das Spiel FizzBuzz verwendet. Inhalt dieses Spiels ist es, einen Zähler, der bei 1 anfängt, immer weiter hoch zu zählen und die Zahlen zu nennen. Ist eine Nummer durch 3 teilbar, wird sie durch Fizz ersetzt, wenn sie durch 5 teilbar ist, durch Buzz. Folglich wird die Zahl, wenn sie durch beides teilbar ist, zu FizzBuzz. Also, wie beschrieben: [1, 2, 3, 4, 5] wird dann zu [1, 2, Fizz, 4, Buzz]. Das Spiel könnte endlos so fortgeführt werden.  
Das Projekt wird sehr rudimentär umgesetzt. Es besteht aus einem Service, in dem die Methode getResultOfNumber() für eine gewünschte einzelne Nummer das Resultat zurückliefert und einem Client, der aus einer Sequenz von Zahlen ein FizzBuzz-String buildet. Die Unit-Tests testen dabei die einzelnen Elemente und die Integrationstest das Zusammenspiel.

## Maven und Integrationstests ##
Um neben den Unit-Tests auch die Integrations-Test über einen Maven-Befehl anzusprechen, wurde das `maven-failsafe-plugin` eingesetzt. Dieses startet alle als mit `IT` gekennzeichneten Klassen im test-Verzeichnis in den im pom.xml spezifizierten Phasen.

In diesem Beispiel können wir mit folgenden Befehlen die verschiedenen Tests starten:
Unit-Tests 

	mvn test

Integrations-Tests:

	mvn verify


## GitHub Actions und Integrationstests ##
Über die Datei `.github\workflows\build-and-test.yml` lassen sich die Build-Jobs definieren, welche durch GitHub-Actions ausgeführt werden.

In unserem Beispiel wird ein `mvn verify` ausgeführt, welches gemäss dem Maven-Lifecyle die Phasen compile, test, package und verify ausgeführt.
