# Project - Santa Claus Toy Factory

# Instrucciones

OH! OH! OH! Santa Claus necesita tu ayuda developer!!! Para estas navidades Santa a decidido renovar su sistema de gestión de juguetes y dejar de lado la creación manual de largos pergaminos. Pero OJO! el sistema se comportará de manera distinta dependiendo de si lo usa Santa o uno de sus elfos y el sistema de almacenamiento de los datos va ser distinto en función de si el juguete es para niños buenos o si es un juguete para niños malos.

Se os ha encargado la creación de una aplicación de consola que permitirá a los elfos de Santa registar los juguetes creados, listar el inventario y suprimir juguetes.

Si la aplicación es utilizada por Santa entonces podrá obtener la lista de juguetes para niños buenos o la lista de juguetes para niños malos. También deberá tener la posibilidad de guardar la lista completa de todos los juguetes en formato .csv.


# Objetivo

Acercarnos poco a poco la arquitectura clásica de Spring Boot. Aplicar el patrón de arquitectura MVC (Model-View-Controller) para estructurar la aplicación. Entender y aplicar el patrón repositorio y la inversión de dependencias.

# Historias de usuario

1.COMO Elfo QUIERO añadir un juguete para niño bueno al inventario proporcionando el título, marca, franja de edad recomendada y categoria PARA su almacenamiento

2.COMO Elfo QUIERO añadir un juguete para niño malo al inventario proporcionando el título y su contenido PARA su almacenamiento.

3.COMO Elfo QUIERO ver el listado de todos los juguetes PARA un control del inventario

4.COMO Elfo QUIERO suprimir un juguete PARA evitar tener juguetes defectusos en el inventario

5.COMO Elfo QUIERO salir de la sesión PARA finalizar mi jornada de trabajo.

6.COMO Santa QUIERO ver la lista de juguetes para niños buenos PARA comprobación de inventario

7.COMO Santa QUIERO ver la lista de juguetes para niños malos PARA comprobación de inventario

8.COMO Santa Quiero guardar en formato csv la lista de todos los juguetes PARA comprobación de datos mediante aplicación externa

9.COMO Santa Quiero salir de la sesión PARA finalizar mi jornada de trabajo.

Por cada historia de usuario se deberán redactar los criterios de aceptación.

# Ejemplo de interacción con la consola

 # Casos de uso para Elfos:
 Iniciar sesión de trabajo como:
1. Elfo
2. Santa Claus
Seleccione una opción: 1
-----------
Gestor de juguetes (Tipo de sesión: Elfo)
1. Añadir juguete
2. Ver todos los juguetes
3. Eliminar juguete
4. Cerrar sesión
Seleccione una opción: 1
-----------
Para niño ...:
1. Bueno
2. Malo
Seleccione una opción: 1

Ingrese el título: LEGO Star Wars - Halcón Milenario - 75375
Ingrese la marca: LEGO
Ingrese la edad recomendada: +18
Ingrese la categoria: Juguetes de Construcción
Juguete añadido con éxito
-----------
Gestor de juguetes (Tipo de sesión: Elfo)
1. Añadir juguete
2. Ver todos los juguetes
3. Eliminar juguete
4. Cerrar sesión
Seleccione una opción: 1
-----------
Para niño ...:
1. Bueno
2. Malo
Seleccione una opción: 2

Ingrese el título: Mystery Box 5x5
Ingrese la contenido: Carbón
Juguete añadido con éxito
-----------
Gestor de juguetes (Tipo de sesión: Elfo)
1. Añadir juguete
2. Ver todos los juguetes
3. Eliminar juguete
4. Cerrar sesión
Seleccione una opción: 2

Lista de juguetes:
B1. Título: LEGO Star Wars - Halcón Milenario - 75375, Marca: LEGO, Edad Recomendada: +18, Categoria: Juguetes de Construcción
M1. Título: Mystery Box 5x5, Contenido: Carbón
-----------
Gestor de juguetes (Tipo de sesión: Elfo)
1. Añadir juguete
2. Ver todos los juguetes
3. Eliminar juguete
4. Cerrar sesión
Seleccione una opción: 3

Ingrese el identificador del juguete a eliminar: B1
Juguete eliminado con éxito
-----------
Gestor de juguetes (Tipo de sesión: Elfo)
1. Añadir juguete
2. Ver todos los juguetes
3. Eliminar juguete
4. Cerrar sesión
Seleccione una opción: 4

Sesión cerrada correctamente.

  # Casos de uso para Santa Claus:

  Iniciar sesión de trabajo como:
1. Elfo
2. Santa Claus
Seleccione una opción: 2
-----------
Gestor de juguetes (Tipo de sesión: Santa)
1. Ver lista de juguetes niños buenos
2. Ver lista de juguetes niños malos
3. Guargar lista de todos los juguetes (.csv)
4. Cerrar sesión
Seleccione una opción: 1

B1. Título: LEGO Star Wars - Halcón Milenario - 75375, Marca: LEGO, Edad Recomendada: +18, Categoria: Juguetes de Construcción
B2. Título: LEGO City - Exploradores del Ártico: Barco - 60368
, Marca: LEGO, Edad Recomendada: 5-7, Categoria: Juguetes de Construcción
-----------
Gestor de juguetes (Tipo de sesión: Santa)
1. Ver lista de juguetes niños buenos
2. Ver lista de juguetes niños malos
3. Guargar lista de todos los juguetes (.csv)
4. Cerrar sesión
Seleccione una opción: 3

Lista de juguetes guardada.
-----------
Gestor de juguetes (Tipo de sesión: Santa)
1. Ver lista de juguetes niños buenos
2. Ver lista de juguetes niños malos
3. Guargar lista de todos los juguetes (.csv)
4. Cerrar sesión
Seleccione una opción: 4

Sesión cerrada correctamente.
