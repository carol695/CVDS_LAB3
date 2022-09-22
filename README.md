# CVDS_LAB3

### Integrantes 
Carol Tatiana Cely Rodriguez
Julian Andres Largo 

### Actualizar y crear dependencias en el proyecto
1. Busque en internet el repositorio central de maven.
2. Busque el artefacto JUnit y entre a la versión más nueva
3. Ingrese a la pestaña de Maven y haga click en el texto de la dependencia para copiarlo al portapapeles.
4. Edite el archivo pom.xml y realice las siguientes actualizaciones:
 * Agregue la dependencia copiada a la sección de dependencias.
 * Hay ue cambiar la versión del compilador de Java a la versión 8, para ello, agregue la sección properties antes de la sección de dependencias:
 
![image](https://user-images.githubusercontent.com/63822072/191854374-d89ffb23-d2ae-48bc-8b66-c5aa03b74e8c.png)

# COMPILAR Y EJECUTAR

  * Ejecute los comandos necesarios de Maven, para compilar el proyecto y verificar que el proyecto se creó correctamente y los cambios realizados al archivo pom no generan inconvenientes.

![image](https://user-images.githubusercontent.com/63822072/191856310-ed2d0cb4-ac31-4642-ac20-c11ff8668d98.png)

![image](https://user-images.githubusercontent.com/63822072/191856345-d9317dfb-bd12-4d51-b714-5305a8515438.png)

  * Busque el comando requerido para ejecutar las pruebas unitarias de un proyecto desde Maven y ejecútelo sobre el proyecto. Se debe ejecutar la claseAppTest con resultado exitoso.

  ### mvn test 
  
  ![image](https://user-images.githubusercontent.com/63822072/191856452-76d7d76c-5e1a-447c-8be1-7cdafbf113b8.png)

  ![image](https://user-images.githubusercontent.com/63822072/191856485-e4f7999f-89d5-4fce-a923-78c6991a0a5d.png)

# EJERCICIO "REGISTRADURIA"

Se va a crear un proyecto base para un requerimiento de la registraduría en el cual se registrarán personas con intención de votar paras las próximaselecciones y se generarán los certific ados electorales de aquellas personas cuyo voto sea válido.

Se usará la clase de persona que ya fue creada. El servicio de la registradiría permitirá registrar personas que sean votantes

  ## Propiedades 
  
   * Solo se registrarán votantes válidos
   * Solo se permite una inscripción por número de documento

  ## Esqueleto de la aplicación 
  
  ![image](https://user-images.githubusercontent.com/63822072/191857209-5c72c040-1a2f-4866-b529-8aa3d2db0f5d.png)

  ### clase Gender 
  
  ![image](https://user-images.githubusercontent.com/63822072/191857278-1623bce5-0981-46f3-9ef2-b4767567a4b9.png)
  
  ### Clase person 
  
  ![image](https://user-images.githubusercontent.com/63822072/191857378-27a3ae6e-2787-4ef1-b0c6-b89b593bba7d.png)
  
  ### Clase registry 
  
  ![image](https://user-images.githubusercontent.com/63822072/191857458-781371a1-5ba1-45d0-8071-dcea1ebb656b.png)

  ### TEST 
  
  ![image](https://user-images.githubusercontent.com/63822072/191857619-fe6e37eb-8f08-44be-9613-8e0b572c563e.png)

  ## EJECUTAR PRUEBAS 
  
  ![image](https://user-images.githubusercontent.com/63822072/191857788-c387cee5-44e3-470d-b4d1-452ee442cbd0.png)

  ![image](https://user-images.githubusercontent.com/63822072/191857835-6e8169c2-e33e-4c02-94d7-504bd043d434.png)
  
  ### Ejecución de las pruebas Test
  
  ![image](https://user-images.githubusercontent.com/63822072/191857894-9e906258-0e40-4c53-92fa-808663cd95c8.png)
  
  ![image](https://user-images.githubusercontent.com/63822072/191857936-ea70fbcd-f3ad-40ba-8c3b-dc6056cc300d.png)

  #### Diferencias entre mvn package / mvn test
  **mvn package:** Toma el código compilado y lo empaqueta en un formato distribuible como un JAR.

  **mvn test:** Corre las pruebas usando una suite de pruebas de un framework de pruebas (En este caso JUnit).    Estas pruebas no requieren que el código sea empaquetado. Es decir, compila los test y los ejecuta.
  
# FINALIZACIÓN DE EJERCICIO
  
### Casos de equivalencia 
1. Muerto:  IsAlive = falso
2. Menores de edad: getEdad < 18 && getEdad > 0
3. Invalid_age: getAge<0 y getAge>120
4. Duplicado: persona1.getId = persona2.getId
5. Valido: no MENOR DE EDAD, no MUERTO, no INVALID_AGE, no DUPLICADO

![image](https://user-images.githubusercontent.com/63822072/191859262-dd8c5e7b-be74-4e9e-9ea5-96c4ad910bf9.png)

  ### Complete la implementación de la clase RegistryTest.java con (al menos) un método por cada clase de equivalencia, creandodiferentes personas y validando que el resultado sea el esperado.
  
  ![image](https://user-images.githubusercontent.com/63822072/191859575-03c5e9a0-f7a4-4f5c-ab82-805d5c8c5c13.png)

![image](https://user-images.githubusercontent.com/63822072/191859609-725a9d06-0841-4ad7-9753-c4a56157b028.png)

![image](https://user-images.githubusercontent.com/63822072/191859621-d01e31d7-0dcf-4de5-8483-3f43b02f6f57.png)

  
  ### Complete la implementación del método registerVoter en la clase Registry.java para retornar el resultado esperado según la entrada.

![image](https://user-images.githubusercontent.com/63822072/191859693-af960b70-10f6-4bae-a273-f6011efa925a.png)


# EJERCICIO "DESCUENTOS DE TARIFAS"

## REALIZAR DISEÑO DE PRUEBAS 

1. Se debe arrojar excepcion en el momento en el que se tenga como entrada una edad e forma negativa y uno fuera de rango 

![image](https://user-images.githubusercontent.com/63822072/191863549-965408b2-809e-4a29-bcfa-1d1373db9b00.png)

![image](https://user-images.githubusercontent.com/63822072/191864971-878ee44c-5efc-4c81-bfae-cdb5a893b58e.png)

![image](https://user-images.githubusercontent.com/63822072/191865591-43922477-28ff-4682-ab27-acd0cdd763b9.png)

![image](https://user-images.githubusercontent.com/63822072/191866322-c626b358-c0d9-47bc-907d-0cde624b51b5.png)

## IMPLEMENTACIÓN DE LAS PRUEBAS 

![image](https://user-images.githubusercontent.com/63822072/191866359-f0649cc8-cc68-407a-9283-d6f1f094e30a.png)

![image](https://user-images.githubusercontent.com/63822072/191866381-418635b9-40dc-4e14-aef9-9847f29ae9d3.png)

![image](https://user-images.githubusercontent.com/63822072/191866408-a2ca1234-1600-4804-b923-479314817652.png)

![image](https://user-images.githubusercontent.com/63822072/191866429-94ecd0f7-4bef-40e6-89dd-3cc48e8a9eb1.png)

![image](https://user-images.githubusercontent.com/63822072/191866444-42f87801-b608-4fdf-baf2-879f029f0ddb.png)

### Comando instalar archivo. jar en IJ

![image](https://user-images.githubusercontent.com/63822072/188930731-1e61500d-3942-40ff-a531-d61be813f403.png)

