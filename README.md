# cucumber-demo

Proyecto de ejemplo de pruebas BDD con [Cucumber-JVM](https://cucumber.io/) y JUnit 4 sobre Maven.

## Stack

- Java + Maven
- Cucumber-Java 7.14.0
- Cucumber-JUnit 7.14.0
- JUnit 4.13.2

## Estructura

```
src/test/java/runner       # Runner de Cucumber (TestRunner.java)
src/test/java/steps        # Definiciones de pasos (step definitions)
src/test/resources/features # Archivos .feature en Gherkin
```

## Feature actual

`login.feature`: escenarios de inicio de sesión (login exitoso y login fallido por contraseña incorrecta).

## Ejecutar las pruebas

```bash
mvn test
```

## Reportes

Al ejecutar las pruebas se genera un reporte HTML en:

```
target/cucumber-reports/report.html
```
