# pre-aceleracion-sofia-schenone
Proyecto Disney peliculas y series

creado con spring boot

# Notas
### Las operaciones en cascada de JPA / Hibernate, representadas en el enum javax.persistence.CascadeType, son:

1. CascadeType.ALL: se aplican todos los tipos de cascada.
2. CascadeType.PERSIST: las operaciones de guardado en la base de datos de las entidades padre se propagarán a las entidades relacionadas.
3. CascadeType.MERGE: las entidades relacionadas se unirán al contexto de persistencia cuando la entidad propietaria se una.
4. CascadeType.REMOVE: las entidades relacionadas se eliminan de la base de datos cuando la entidad propietaria se elimine.
5. CascadeType.REFRESH: las entidades relacionadas actualizan sus datos desde la base de datos cuando la entidad propietaria se actualiza.
6. CascadeType.DETACH: se separan del contexto de persistencia todas las entidades relacionadas cuando ocurre una operación de separación manual.
> Por defecto, no se aplica ninguna operación de cascada.

> Hibernate utiliza las mismas operaciones que JPA, añadiendo otras propias. 
## FUENTE!
[https://www.nestoralmeida.com/](https://www.nestoralmeida.com/cascade-en-jpa-hibernate/#2-diferencia-entre-persist-y-merge)