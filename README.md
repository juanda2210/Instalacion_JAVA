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


# Tipos de datos primitivos en Java

## 1. ¿Qué son los tipos de datos primitivos?

Los **tipos de datos primitivos** son los tipos de datos básicos que proporciona Java para almacenar valores simples directamente en una variable.

Java cuenta con **8 tipos de datos primitivos**:

- `byte`
- `short`
- `int`
- `long`
- `float`
- `double`
- `char`
- `boolean`

A diferencia de las clases y objetos, los tipos primitivos no son objetos y están diseñados para almacenar valores de forma sencilla y eficiente.

---

# 2. Tipos de datos primitivos

## 2.1. `byte`

El tipo `byte` se utiliza para almacenar números enteros pequeños.

| Característica | Valor |
|---|---|
| Tamaño | 8 bits |
| Rango | -128 a 127 |
| Valor por defecto | `0` |
| Tipo de dato | Entero |

### Uso típico

Se utiliza cuando se necesitan almacenar números enteros pequeños y se desea utilizar poca memoria.

```java
byte edad = 25;
byte temperatura = -10;
```

---

## 2.2. `short`

El tipo `short` permite almacenar números enteros más grandes que `byte`, pero menores que `int`.

| Característica | Valor |
|---|---|
| Tamaño | 16 bits |
| Rango | -32.768 a 32.767 |
| Valor por defecto | `0` |
| Tipo de dato | Entero |

### Uso típico

Puede utilizarse cuando se necesitan números enteros dentro de un rango relativamente pequeño y se desea utilizar menos memoria que con un `int`.

```java
short cantidad = 30000;
```

---

## 2.3. `int`

El tipo `int` es el tipo de dato entero más utilizado en Java.

| Característica | Valor |
|---|---|
| Tamaño | 32 bits |
| Rango | -2.147.483.648 a 2.147.483.647 |
| Valor por defecto | `0` |
| Tipo de dato | Entero |

### Uso típico

Se utiliza para almacenar números enteros en la mayoría de las situaciones.

```java
int edad = 25;
int cantidadProductos = 150;
int temperatura = -5;
```

En Java, cuando se escribe un número entero sin especificar otro tipo, normalmente se interpreta como un `int`.

---

## 2.4. `long`

El tipo `long` permite almacenar números enteros mucho más grandes que `int`.

| Característica | Valor |
|---|---|
| Tamaño | 64 bits |
| Rango | -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807 |
| Valor por defecto | `0L` |
| Tipo de dato | Entero |

### Uso típico

Se utiliza cuando los valores enteros pueden superar el rango permitido por `int`.

Por ejemplo, puede utilizarse para almacenar identificadores numéricos muy grandes, cantidades de datos o valores relacionados con tiempo expresados en milisegundos.

```java
long poblacion = 8000000000L;
long distancia = 90000000000L;
```

La letra `L` indica que el valor es de tipo `long`.

---

# 3. Tipos de datos para números decimales

Java cuenta con dos tipos primitivos para representar números con decimales:

- `float`
- `double`

---

## 3.1. `float`

El tipo `float` se utiliza para almacenar números de punto flotante con precisión simple.

| Característica | Valor |
|---|---|
| Tamaño | 32 bits |
| Precisión aproximada | 6-7 dígitos decimales |
| Rango aproximado | ±3.4 × 10³⁸ |
| Valor por defecto | `0.0f` |
| Tipo de dato | Decimal |

### Uso típico

Se utiliza cuando se necesitan valores decimales y no se requiere una precisión tan alta.

```java
float altura = 1.75f;
float temperatura = 36.5f;
```

Es necesario colocar `f` al final del número para indicar que se trata de un `float`.

---

## 3.2. `double`

El tipo `double` almacena números de punto flotante con doble precisión.

| Característica | Valor |
|---|---|
| Tamaño | 64 bits |
| Precisión aproximada | 15-16 dígitos decimales |
| Rango aproximado | ±1.7 × 10³⁰⁸ |
| Valor por defecto | `0.0` |
| Tipo de dato | Decimal |

### Uso típico

Es el tipo decimal más utilizado en Java cuando se necesita mayor precisión.

```java
double precio = 199.99;
double promedio = 4.56789;
double distancia = 1500.75;
```

Cuando se escribe un número decimal sin especificar el tipo, Java normalmente lo interpreta como `double`.

---

# 4. `char`

El tipo `char` se utiliza para almacenar **un solo carácter**.

| Característica | Valor |
|---|---|
| Tamaño | 16 bits |
| Rango | `'\u0000'` a `'\uFFFF'` |
| Valor numérico | 0 a 65.535 |
| Valor por defecto | `'\u0000'` |
| Tipo de dato | Carácter |

Java utiliza `char` para representar unidades de código UTF-16.

### Uso típico

Se utiliza para almacenar un carácter individual, como una letra, número o símbolo.

```java
char inicial = 'J';
char letra = 'A';
char simbolo = '#';
```

Es importante utilizar **comillas simples** para un `char`:

```java
char letra = 'A';
```

Mientras que las cadenas de texto utilizan comillas dobles:

```java
String nombre = "Juan";
```

`String` **no es un tipo primitivo**, sino una clase.

---

# 5. `boolean`

El tipo `boolean` representa un valor lógico que solamente puede tener dos estados:

```text
true
false
```

| Característica | Valor |
|---|---|
| Valores posibles | `true` / `false` |
| Tamaño | No está definido por la especificación del lenguaje |
| Valor por defecto | `false` |
| Tipo de dato | Lógico |

### Uso típico

Se utiliza principalmente para representar condiciones o estados.

```java
boolean esMayorDeEdad = true;
boolean usuarioActivo = false;
```

También es muy utilizado en estructuras de control:

```
if (esMayorDeEdad) {
    System.out.println("Es mayor de edad");
}
```

> **Nota:** a diferencia de los otros tipos primitivos, Java no especifica un tamaño exacto en bits para `boolean`.

---

# 6. Tabla comparativa

| Tipo | Tamaño | Rango / valores | Uso típico |
|---|---:|---|---|
| `byte` | 8 bits | -128 a 127 | Números enteros pequeños |
| `short` | 16 bits | -32.768 a 32.767 | Enteros pequeños/medianos |
| `int` | 32 bits | -2.147.483.648 a 2.147.483.647 | Enteros de uso general |
| `long` | 64 bits | -9.22 × 10¹⁸ a 9.22 × 10¹⁸ | Enteros muy grandes |
| `float` | 32 bits | ±3.4 × 10³⁸ aprox. | Decimales con precisión simple |
| `double` | 64 bits | ±1.7 × 10³⁰⁸ aprox. | Decimales con mayor precisión |
| `char` | 16 bits | 0 a 65.535 | Un solo carácter |
| `boolean` | No especificado | `true` / `false` | Condiciones y estados |

---

# 7. Diferencias principales entre los tipos

La principal diferencia entre los tipos primitivos está en **el tipo de información que pueden almacenar, la cantidad de memoria que utilizan y el rango de valores que pueden representar**.

### Enteros

Los tipos `byte`, `short`, `int` y `long` almacenan números enteros.

A medida que aumenta el tamaño en bits, aumenta también el rango de valores que pueden representar:

```text
byte → short → int → long
 8      16      32      64 bits
```

Por ejemplo:

```
byte numeroPequeno = 100;
int numero = 1000000;
long numeroGrande = 10000000000L;
```

---

### Decimales

`float` y `double` almacenan números con punto decimal.

La principal diferencia es la **precisión**:

```text
float  → 32 bits → menor precisión
double → 64 bits → mayor precisión
```

Por ejemplo:

```
float precio = 19.99f;
double resultado = 19.999999999;
```

En la mayoría de los casos generales se utiliza `double`.

---

### Caracteres

`char` almacena un único carácter:

```java
char letra = 'J';
```

No debe confundirse con `String`, que permite almacenar una secuencia de caracteres:

```java
String nombre = "Juan";
```

`String` no es un tipo de dato primitivo.

---

### Valores lógicos

`boolean` solamente permite dos valores:

```
true
false
```

Por ejemplo:

```
boolean encendido = true;
boolean disponible = false;
```

Es especialmente útil para representar condiciones.

---

# 8. Ejemplo utilizando todos los tipos primitivos

```java
public class TiposPrimitivos {

    public static void main(String[] args) {

        byte edad = 25;

        short temperatura = 300;

        int cantidad = 150000;

        long poblacion = 8000000000L;

        float altura = 1.75f;

        double precio = 199.99;

        char inicial = 'J';

        boolean estudiante = true;

        System.out.println("Edad: " + edad);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Población: " + poblacion);
        System.out.println("Altura: " + altura);
        System.out.println("Precio: " + precio);
        System.out.println("Inicial: " + inicial);
        System.out.println("¿Es estudiante?: " + estudiante);
    }
}
```

---

# 9. Resumen

Java tiene **8 tipos de datos primitivos**:

```text
┌──────────────────────────────┐
│ Tipos de datos primitivos    │
├──────────────────────────────┤
│ byte                         │
│ short                        │
│ int                          │
│ long                         │
│ float                        │
│ double                       │
│ char                         │
│ boolean                      │
└──────────────────────────────┘
```

Se pueden agrupar de la siguiente manera:

| Categoría | Tipos |
|---|---|
| Enteros | `byte`, `short`, `int`, `long` |
| Decimales | `float`, `double` |
| Carácter | `char` |
| Lógico | `boolean` |

La elección del tipo depende principalmente del **tipo de información que se desea almacenar, el rango de valores necesario y la precisión requerida**.

En la práctica, los tipos que más se utilizan habitualmente son `int` para números enteros, `double` para números decimales, `boolean` para valores lógicos y `char` para caracteres individuales.

# Impresión de texto en consola en Java

En Java se puede mostrar texto, números u otra información en la consola utilizando principalmente `System.out.println()` y `System.out.print()`.

## `System.out.println()`

Se utiliza para imprimir información en la consola y **hacer un salto de línea** al finalizar.

```
System.out.println("Hola mundo");
System.out.println("Bienvenido a Java");
```

Resultado:

```text
Hola mundo
Bienvenido a Java
```

## `System.out.print()`

También imprime información en la consola, pero **no realiza un salto de línea**.

```
System.out.print("Hola ");
System.out.print("mundo");
```

Resultado:

```text
Hola mundo
```

## Diferencia

La diferencia principal es que:

- `System.out.println()` → imprime y pasa a la siguiente línea.
- `System.out.print()` → imprime y permanece en la misma línea.

### Ejemplo

```
System.out.print("Hola ");
System.out.println("Juan");
System.out.print("¿Cómo ");
System.out.print("estás?");
```

Resultado:

```text
Hola Juan
¿Cómo estás?
```
