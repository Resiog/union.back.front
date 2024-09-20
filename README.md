## Backend +Frontend + SQL + SpringBoot 

Proyecto donde desarrollo parte de Backend + Frontend, usando el Framework Spring Boot y conectándolo a su vez todo a una base de datos SQL.

Leyenda de abreviaturas vistas en anotaciones:
BD = Base de datos
M = Modelo.java
I = Interfaz.java
S = Servicios.java
C = Controlador.java

Metodología:
Parte del Backend:
1º Creación de base de datos en MySQL (en application.properties aparecen rutas, username, etc)
2º Generación de la API Rest en SpringBoot
    2.1: Uso del patrón MVC, la Vista se hará más adelante en el Frontend
    2.2: Creación de clases Modelo (M en MVC), Servicios y Controlador (C en MVC) así como creación Interfaz
    2.3: 1º Creo Modelo.java e incluyo datos referentes a la base de datos donde conectar. 
2º Creo Interfaz.java donde indico que extiende de JpaRepository<Modelo, Integer>. 
3º Creo Servicios.java donde se indican las característicias y funciones de las que será capaz la API (devolver listados, incluir, actualizar, borrar).
4º Creo Controlador.java el cual hace de intermediario entre el usuario y Servicios mediante el frontend. Controlador.java indicará endpoints así como tipos de instrucciones.

Parte del Frontend:

