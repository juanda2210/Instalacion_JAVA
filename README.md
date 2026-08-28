# Instalación de Java JDK e IntelliJ IDEA en macOS

## 1. Introducción

En este documento se describe el proceso paso a paso para instalar y configurar el entorno de desarrollo necesario para trabajar con **Java** en un equipo con **macOS**.

Para desarrollar aplicaciones en Java se instalaron principalmente:

- **JDK (Java Development Kit):** proporciona las herramientas necesarias para desarrollar y ejecutar programas en Java.
- **IntelliJ IDEA:** entorno de desarrollo integrado (IDE) utilizado para escribir, ejecutar y administrar proyectos Java.

---

# 2. Instalación del JDK

## Paso 1. Ingresar al sitio oficial de Java

Primero se debe ingresar al sitio oficial de **Oracle** para descargar el JDK:

https://www.oracle.com/java/technologies/downloads/

También se puede utilizar una distribución alternativa del JDK, como **OpenJDK**.

---

## Paso 2. Seleccionar la versión del JDK

En la página de descargas se debe seleccionar una versión disponible del **Java Development Kit (JDK)**.

Para proyectos académicos se recomienda utilizar una versión **LTS (Long-Term Support)**, ya que ofrece mayor estabilidad y soporte prolongado.

Por ejemplo:

- JDK 17
- JDK 21
- JDK 25

La versión seleccionada debe ser compatible con el proyecto que se vaya a desarrollar.

---

## Paso 3. Seleccionar el instalador para macOS

Como el sistema operativo utilizado es **macOS**, se debe seleccionar la versión correspondiente para este sistema.

En un Mac con procesador **Apple Silicon**, como los procesadores de la familia M, se debe seleccionar la arquitectura:

**ARM64 / AArch64**

Por ejemplo:

```text
macOS
Apple Silicon
ARM64
.dmg
```

El archivo `.dmg` permite realizar la instalación de manera gráfica.

---

## Paso 4. Descargar el instalador

Después de seleccionar la versión y arquitectura correspondiente, se descarga el archivo de instalación del JDK.

El archivo normalmente tendrá una extensión similar a:

```text
.dmg
```

Una vez finalizada la descarga, se debe abrir el archivo desde la carpeta **Descargas**.

---

## Paso 5. Instalar el JDK

Al abrir el archivo `.dmg`, se mostrará el instalador del JDK.

Se deben seguir las instrucciones del instalador:

1. Abrir el instalador.
2. Continuar con el proceso de instalación.
3. Aceptar los términos y condiciones cuando sean solicitados.
4. Introducir la contraseña del usuario de macOS si el sistema la solicita.
5. Esperar a que finalice la instalación.

Una vez terminado el proceso, el JDK quedará instalado en el sistema.

---

# 3. Verificar la instalación de Java

Después de instalar el JDK es importante comprobar que macOS puede reconocer correctamente Java.

## Paso 1. Abrir Terminal

Se puede abrir **Terminal** utilizando cualquiera de las siguientes opciones:

- Abrir `Terminal` desde Aplicaciones.
- Utilizar Spotlight y buscar `Terminal`.
- Presionar `Command + Espacio` y escribir:

```text
Terminal
```

---

## Paso 2. Comprobar la versión de Java

En Terminal se ejecuta:

```bash
java -version
```

Si la instalación fue correcta, se mostrará información relacionada con la versión instalada del JDK.

Por ejemplo:

```text
java version "21.x.x"
```

La versión exacta dependerá del JDK que se haya instalado.

---

## Paso 3. Comprobar el compilador de Java

También se debe verificar que el compilador de Java esté disponible:

```bash
javac -version
```

El resultado debe mostrar una versión del compilador, por ejemplo:

```text
javac 21.x.x
```

El comando `javac` es importante porque permite **compilar archivos `.java`**.

---

# 4. Comprobar la ubicación del JDK

Para conocer la ubicación en la que macOS está utilizando Java, se puede ejecutar:

```bash
/usr/libexec/java_home
```

Este comando devuelve la ruta del JDK instalado.

Por ejemplo:

```text
/Library/Java/JavaVirtualMachines/jdk-21.jdk/Contents/Home
```

También se puede consultar la variable `JAVA_HOME` utilizando:

```bash
echo $JAVA_HOME
```

Si no está configurada, se puede obtener temporalmente con:

```bash
export JAVA_HOME=$(/usr/libexec/java_home)
```

Posteriormente se puede comprobar con:

```bash
echo $JAVA_HOME
```

---

# 5. Probar Java desde Terminal

Para comprobar que Java funciona correctamente, se puede crear un pequeño programa.

Primero se crea un archivo:

```bash
nano HolaMundo.java
```

Dentro del archivo se escribe:

```java
public class HolaMundo {

    public static void main(String[] args) {
        System.out.println("Hola Mundo");
    }
}
```

Se guarda el archivo y posteriormente se compila utilizando:

```bash
javac HolaMundo.java
```

Si no aparece ningún mensaje de error, significa que el archivo fue compilado correctamente.

Después se ejecuta:

```bash
java HolaMundo
```

El resultado esperado es:

```text
Hola Mundo
```

Esto permite comprobar que el JDK está correctamente instalado y funcionando.

---

# 6. Instalación de IntelliJ IDEA

## Paso 1. Ingresar al sitio oficial

Para descargar IntelliJ IDEA se debe ingresar al sitio oficial de JetBrains:

https://www.jetbrains.com/idea/

IntelliJ IDEA es un entorno de desarrollo integrado utilizado para desarrollar aplicaciones, principalmente en Java y otros lenguajes.

---

## Paso 2. Descargar IntelliJ IDEA

En la página oficial se debe seleccionar la opción de descarga para **macOS**.

Actualmente IntelliJ IDEA puede encontrarse como una aplicación unificada, desde la cual se pueden utilizar las diferentes funcionalidades disponibles según la licencia o edición.

Para un equipo Mac con Apple Silicon se debe seleccionar la versión correspondiente a:

```text
Apple Silicon
```

---

## Paso 3. Abrir el archivo descargado

Una vez terminada la descarga, se abre el archivo descargado.

Normalmente se obtiene un archivo con extensión:

```text
.dmg
```

Al abrirlo aparecerá la aplicación **IntelliJ IDEA**.

---

## Paso 4. Instalar IntelliJ IDEA

Para instalar IntelliJ IDEA se debe arrastrar el icono de la aplicación hacia la carpeta:

```text
Applications
```

De esta manera IntelliJ IDEA queda instalado dentro de las aplicaciones de macOS.

---

# 7. Abrir IntelliJ IDEA

Después de instalarlo se puede abrir IntelliJ IDEA desde:

```text
Applications → IntelliJ IDEA
```

También se puede utilizar Spotlight:

```text
Command + Espacio
```

y buscar:

```text
IntelliJ IDEA
```

Al abrirlo por primera vez, macOS puede solicitar permisos o mostrar una advertencia de seguridad. En ese caso se debe confirmar que se desea abrir la aplicación.

---

# 8. Configuración inicial de IntelliJ IDEA

Al iniciar IntelliJ IDEA por primera vez pueden aparecer diferentes opciones de configuración.

Se pueden aceptar las configuraciones recomendadas por defecto.

También se puede iniciar sesión con una cuenta de JetBrains si se dispone de una.

Dependiendo de la versión utilizada, IntelliJ IDEA puede solicitar información relacionada con la licencia o permitir utilizar las funciones disponibles gratuitamente.

---

# 9. Configurar el JDK en IntelliJ IDEA

Para desarrollar proyectos Java, IntelliJ IDEA debe conocer la ubicación del JDK instalado.

## Paso 1. Crear un nuevo proyecto

Desde la pantalla principal de IntelliJ IDEA se selecciona:

```text
New Project
```

---

## Paso 2. Seleccionar Java

En las opciones disponibles se selecciona:

```text
Java
```

---

## Paso 3. Seleccionar el JDK

En la sección correspondiente al JDK se selecciona el JDK instalado anteriormente.

Si IntelliJ IDEA detecta automáticamente el JDK, se puede seleccionar directamente.

En caso contrario, se puede agregar manualmente utilizando la opción:

```text
Add JDK
```

o una opción equivalente disponible en la versión instalada.

La ubicación normalmente corresponde a una ruta similar a:

```text
/Library/Java/JavaVirtualMachines/
```

---

# 10. Crear un proyecto Java de prueba

Una vez configurado el JDK, se puede crear un proyecto para comprobar que IntelliJ IDEA funciona correctamente.

## Paso 1. Crear el proyecto

Se selecciona:

```text
New Project
```

Después:

```text
Java
```

Se asigna un nombre al proyecto, por ejemplo:

```text
ProyectoJava
```

Finalmente se selecciona:

```text
Create
```

---

# 11. Crear una clase Java

Dentro del proyecto se crea una nueva clase.

Por ejemplo:

```text
src → New → Java Class
```

Se puede utilizar el nombre:

```text
Main
```

La clase debe contener el siguiente código:

```java
public class Main {

    public static void main(String[] args) {
        System.out.println("Hola Mundo desde IntelliJ IDEA");
    }
}
```

---

# 12. Ejecutar el programa

Para ejecutar el programa se puede presionar el botón de ejecución ubicado junto al método:

```java
public static void main(String[] args);
```

También se puede utilizar la opción:

```text
Run → Run
```

IntelliJ IDEA abrirá la consola inferior y mostrará:

```text
Hola Mundo desde IntelliJ IDEA
```

Esto confirma que:

- El JDK está correctamente instalado.
- IntelliJ IDEA reconoce el JDK.
- El proyecto Java fue creado correctamente.
- El programa Java puede compilarse y ejecutarse.

---

# 13. Verificación final

Para comprobar que todo el entorno está configurado correctamente se realizan las siguientes verificaciones.

### Verificar Java

```bash
java -version
```

### Verificar el compilador

```bash
javac -version
```

### Verificar la ubicación del JDK

```bash
/usr/libexec/java_home
```

### Verificar Java dentro de IntelliJ IDEA

En la configuración del proyecto se debe comprobar que el **Project SDK** corresponde al JDK instalado.

---

# 14. Resultado

Al finalizar el proceso se cuenta con un entorno de desarrollo Java funcional en macOS compuesto por:

```text
macOS
   │
   ├── JDK
   │     ├── Java Runtime
   │     └── Java Compiler (javac)
   │
   └── IntelliJ IDEA
         └── Proyectos Java
```

El JDK proporciona las herramientas necesarias para **compilar y ejecutar programas Java**, mientras que IntelliJ IDEA proporciona el entorno gráfico para desarrollar, organizar, ejecutar y depurar los proyectos.

Con esta configuración es posible comenzar a desarrollar aplicaciones utilizando Java y programación orientada a objetos.
