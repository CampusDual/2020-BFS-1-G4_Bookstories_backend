## Pasos para generar un arquetipo:
1. Clonar el proyecto mediante el comando ``git clone https://github.com/ontimize/basicproject.git``
1. **cd** en la carpeta del proyecto
1. Ejecutar el comando&nbsp;&nbsp;&nbsp;``mvn archetype:create-from-project``
1.  Para visualizar la estructura del proyecto moverse a la carpeta&nbsp;&nbsp;&nbsp;``target/generated-sources/archetype``&nbsp;&nbsp;y una vez ahí ejecutar el comando&nbsp;&nbsp;``tree``
1. Para descartar la carpeta&nbsp;&nbsp;``target``&nbsp;&nbsp;del proyecto ejecutar&nbsp;&nbsp;&nbsp;``mvn clean``
1. Dentro de la carpeta&nbsp;&nbsp;``src/main/resources/META-INF/maven``&nbsp;&nbsp;se encuentra el archivo&nbsp;&nbsp;**archetype-metadata.xml**
El contenido de ese fichero debería ser algo así:
```xml
<?xml version="1.0" encoding="UTF-8"?>
<archetype-descriptor xsi:schemaLocation="https://maven.apache.org/plugins/maven-archetype-plugin/archetype-descriptor/1.1.0 http://maven.apache.org/xsd/archetype-descriptor-1.1.0.xsd" name="basicproject"
    xmlns="https://maven.apache.org/plugins/maven-archetype-plugin/archetype-descriptor/1.1.0"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
  <fileSets>
    <fileSet encoding="UTF-8">
      <directory></directory>
      <includes>
        <include>.gitignore</include>
        <include>basicproject-database.launch</include>
        <include>build.bat</include>
        <include>README.md</include>
      </includes>
    </fileSet>
  </fileSets>
  <modules>
    <module id="${rootArtifactId}-api" dir="api" name="${rootArtifactId}-api">
      <fileSets>
        <fileSet filtered="true" packaged="true" encoding="UTF-8">
          <directory>src/main/java</directory>
          <includes>
            <include>**/*.java</include>
          </includes>
        </fileSet>
      </fileSets>
    </module>
    <module id="${rootArtifactId}-frontend" dir="frontend" name="${rootArtifactId}-frontend">
      <fileSets>
        <fileSet filtered="true" encoding="UTF-8">
          <directory>src/main/resources</directory>
          <includes>
            <include>**/*.html</include>
            <include>**/*.properties</include>
          </includes>
        </fileSet>
        <fileSet encoding="UTF-8">
          <directory>src/main/resources</directory>
          <includes>
            <include>**/*.</include>
            <include>**/*.css</include>
            <include>**/*.ico</include>
            <include>**/*.scss</include>
            <include>**/*.md</include>
            <include>**/*.png</include>
            <include>**/*.json</include>
            <include>**/*.js</include>
            <include>**/*.ejs</include>
            <include>**/*.ts</include>
          </includes>
        </fileSet>
      </fileSets>
    </module>
    <module id="${rootArtifactId}-boot" dir="boot" name="${rootArtifactId}-boot">
      <fileSets>
        <fileSet filtered="true" packaged="true" encoding="UTF-8">
          <directory>src/main/java</directory>
          <includes>
            <include>**/*.java</include>
          </includes>
        </fileSet>
        <fileSet encoding="UTF-8">
          <directory>src/main/resources</directory>
          <includes>
            <include>**/*.yml</include>
          </includes>
        </fileSet>
      </fileSets>
    </module>
    <module id="${rootArtifactId}-model" dir="model" name="${rootArtifactId}-model">
      <fileSets>
        <fileSet filtered="true" packaged="true" encoding="UTF-8">
          <directory>src/main/java</directory>
          <includes>
            <include>**/*.java</include>
          </includes>
        </fileSet>
        <fileSet filtered="true" encoding="UTF-8">
          <directory>src/main/resources</directory>
          <includes>
            <include>**/*.xml</include>
            <include>**/*.properties</include>
          </includes>
        </fileSet>
        <fileSet filtered="true" encoding="UTF-8">
          <directory>src/main/db</directory>
          <includes>
            <include>**/*.txt</include>
            <include>**/*.properties</include>
          </includes>
        </fileSet>
      </fileSets>
    </module>
    <module id="${rootArtifactId}-ws" dir="ws" name="${rootArtifactId}-ws">
      <fileSets>
        <fileSet filtered="true" packaged="true" encoding="UTF-8">
          <directory>src/main/java</directory>
          <includes>
            <include>**/*.java</include>
          </includes>
        </fileSet>
      </fileSets>
    </module>
  </modules>
</archetype-descriptor>
```
7. Crear el Arquetipo (de nuevo) con&nbsp;&nbsp;``mvn install``
1. Para generar un proyecto del arquetipo ejecutar el comando&nbsp;&nbsp;``mvn archetype:generate``

## Propiedades del proyecto

- El cliente web se sitúa en la carpeta&nbsp;&nbsp;``frontend/src/main/resources/webapp``
- El archivo&nbsp;&nbsp;[build.bat](https://github.com/ontimize/basicproject.git/blob/master/build.bat)&nbsp;&nbsp;se ejecuta cuando se realiza un&nbsp;&nbsp;``mvn install``&nbsp;&nbsp;en la carpeta base del proyecto.
Si no encuentra la carpeta node_modules la crea, genera el build del cliente web y lo mueve a la carpeta public.


## Ejecución del proyecto

- Para ejecutar la base de datos lanzamos el archivo&nbsp;&nbsp;[basicproject-database.launch](https://github.com/ontimize/basicproject.git/blob/master/basicproject-database.launch)
- Para ejecutar el servidor lanzamos el archivo&nbsp;&nbsp;[ServerApplication.java](https://github.com/ontimize/basicproject.git/blob/master/boot/src/main/java/com/imatia/basicproject/boot/core/ServerApplication.java)&nbsp;&nbsp;situado en el paquete&nbsp;&nbsp;``com.imatia.basicproject.boot.core``
- Para visualizar el cliente web vamos a la url&nbsp;&nbsp;[http://localhost:8080/app/index.html](http://localhost:8080/app/index.html)
