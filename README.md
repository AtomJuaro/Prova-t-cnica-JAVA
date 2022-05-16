# Prueba técnica JAVA

Examen técnico El objetivo de este examen es validar los conocimientos que tienen los instructores en relación a la
programación JAVA. JAVA

1. Criterios de evaluación

- Código Limpio
- Automatización de pruebas unitarias.
- Arquitectura Limpia.

2. Entregables

- Código fuente en el repositorio de Git (GitHub o cualquier otra persona que pueda compartir el proyecto).
- Tendrá 3 días para completar esta solicitud desde el momento en que reciba este documento;
- Para cualquier duda, estaremos a su disposición.

## Estructura de la aplicación

*Antes de presentar la estructura de esta aplicación, es importante decir que está permitida realizar investigaciones
para cumplir con los requisitos de estos proyectos. Proyecto Estructura 1 1- Implementar una clase Propietario 2-
Declarar los siguientes atributos en la clase:

- Nombre
- CPF
- IDENTIFICACIÓN
- Fecha de nacimiento
- Calle
- Vecindario
- Ciudad -estado
- Código postal
- complemento

3- Encapsular los atributos de la clase Owner

4- Los atributos name, cpf y rg son obligatorios (crear un constructor con estos parámetros)

5- Implementar una clase de Auto

6- Declarar los siguientes atributos en la clase:

- Modelo
- Color
- Año
- Marca
- chasis
- Propietario
- Velocidad máxima
- Velocidad actual
- Número de puertos
- ¿Tienes un techo solar?
- Número de marchas
- ¿Tiene una transmisión automática?
- volumen de combustible

7- Encapsular la clase Car y sus atributos;

8- Implementar el método de aceleración que aumenta la velocidad de 1 en 1 km/h;

9- Implementar el método de frenado que detiene el automóvil – Velocidad = 0 km/h;

10- Implementar el método de cambio de marcha;

11- Implementar el método _reduce la marcha;

12- Cambiar la clase Propietario para que el atributo Dirección se convierta en una clase; 13- Encapsular los atributos
de la clase Dirección;

14- La dirección del propietario no puede estar vacía (cámbiela en el constructor para recibir la dirección);

15- Todo vehículo debe tener un dueño (implementar un fabricante de vehículos pasando el dueño como parámetro);

16- No se puede engranar la marcha atrás si la velocidad supera los 0 km/h;

17- Implementar un método que calcule la autonomía de viaje del vehículo en base al consumo medio pasado como parámetro;

18- Implementar un método para visualizar el volumen de combustible;

19- Transformar el atributo de marca de un automóvil en una clase de marca con nombre, número de modelo, año de
lanzamiento y código de identificación;

20- Instanciar un objeto de clase Coche, Persona, Dirección, Marca y relacionar los objetos usando métodos o
constructores cuando sea necesario.

### proyecto 2

Cree una clase de Java denominada factura para una tienda de suministros informáticos. La clase debe contener cuatro
variables:

- el número (Cadena),
- la descripción (String),
- la cantidad comprada de un artículo (int) • y el precio por artículo (doble).

La clase debe tener un constructor y un método get y set para cada variable de instancia. Además, proporcione un método
llamado getTotalFatura que calcule el monto de la factura y luego devuelva el monto como un doble. Si el valor no es
posi vo, debe establecerse en 0. Si el precio por artículo no es posi vo, debe establecerse en 0.0. Escriba una
aplicación de prueba llamada InvoiceTest (en otro archivo) que demuestre las capacidades de la clase Invoice.

### proyecto 3

Cree una clase llamada Empleado que incluya tres piezas de información como variables de instancia:

- nombre (cadena),
- apellido (Cadena)
- y un salario mensual (doble).

La clase debe tener un constructor, obtener y establecer métodos para cada variable de instancia. Escriba una aplicación
de prueba llamada TestEmployee que cree dos objetos Employee y muestre el salario de cada objeto. Luego dé a cada
empleado un aumento del 10 % y vuelva a mostrar el salario anual de cada empleado. Introducir en la clase Empleado una
variable de clase capaz de contar el número de empleados que han pasado por la empresa hasta la fecha.

### Proyecto 4

Cree una clase Java llamada IntegerSet. Cada objeto IntegerSet puede almacenar números enteros en el rango de 0 a 100.
El conjunto está representado por una matriz de valores booleanos. El elemento de matriz a[i] es verdadero si el entero
i se ve en el conjunto. El elemento de matriz a[j] es falso si el entero no está en el conjunto. El constructor sin
argumentos inicializa la matriz de Java en 'conjunto vacío' (todos los valores son falsos). Proporcione los siguientes
métodos:

- El método de unión crea un tercer conjunto que es la unión teórica de dos conjuntos existentes (es decir, la aplicación de la función
  OR lógica sobre los conjuntos y devuelve el valor lógico verdadero o falso).
- El método de intersección crea un tercer conjunto que es la intersección teórica de dos conjuntos existentes (es decir,
  aplicación de la función lógica AND en los conjuntos y devuelve el valor lógico verdadero o falso).
- el método insertElement inserta un nuevo elemento entero k en un conjunto (estableciendo a[k] en verdadero).
- El método deleteElement elimina el entero m (estableciendo a[m] en falso).
- El método toSetString devuelve una cadena que contiene un conjunto como una lista de números separados por espacios. incluir
  sólo los elementos que están presentes en el conjunto. U lize -" para representar un conjunto vacío.
- el método equalTo determina si dos conjuntos son iguales. estructura

### Consideraciones finales

Recuerda que puedes investigar para llevar a cabo cualquier requerimiento de estos proyectos, queremos que te sientas
libre de crear esta aplicación de la mejor manera posible, aunque no puedas hacer todo el proyecto, envíanos lo que ya
implementaste en la fecha prevista.

Cualquier duda o consulta estamos a tu disposición, sé creativo y ¡mucha suerte!