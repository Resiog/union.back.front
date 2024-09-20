# Backend +Frontend + SQL + SpringBoot 

Proyecto donde desarrollo parte de Backend + Frontend, usando el Framework Spring Boot y conectándolo a su vez todo a una base de datos SQL.

### Leyenda de abreviaturas vistas en anotaciones:
BD = Base de datos  
M = Modelo.java  
I = Interfaz.java  
S = Servicios.java  
C = Controlador.java


Metodología en Backend:
-
1. Creación de base de datos en MySQL (en application.properties aparecen rutas, username, etc)
2. Generación de la API Rest en SpringBoot:  
    2.1. Uso del patrón MVC, la Vista se hará más adelante en el Frontend.  
    2.2: Creación de clases Modelo (M en MVC), Servicios y Controlador (C en MVC) así como creación Interfaz.  
    2.3:  
   - Creo Modelo.java e incluyo datos referentes a la base de datos donde conectar.
   - Creo Interfaz.java donde indico que extiende de JpaRepository<Modelo, Integer>.
   - Creo Servicios.java donde se indican las característicias y funciones de las que será capaz la API (devolver listados, incluir, actualizar, borrar).
   - Creo Controlador.java el cual hace de intermediario entre el usuario y Servicios mediante el frontend. Controlador.java indicará endpoints así como tipos de instrucciones.

Metodología en Frontend:
-

