# Tarea: arquitectura MVC

Tarea para implementar arquitectura MVC

Utiliza objetos coches, modifica la velocidad y la muestra

---

## Clases ```Controller``` y ```Model```

- Implementa la clase ```Controller``` y ```Model``` según el diagrama de clases.

- Implementa los métodos ```crearCoche()```, ```getCoche()```, ```cambiarVelocidad()``` y ```getVelocidad()```

- Realiza los test necesarios para comprobar que funcionan correctamente

### Diagrama de clases:

```mermaid
classDiagram
    class Coche {
        String: matricula
        String: modelo
        Integer: velocidad
        Integer: velocidadAnterior
        +getVelocidadAnterior(): Integer
        +setVelocidadAnterior(Integer): void
    }
    class Controller{
        +main()
        +subirVelocidad(String, Integer): void
        +baajarVelocidad(String, Integer): void
    }
    class View {+muestraVelocidad(String, Integer)}
    class Model {
        ArrayList~Coche~: parking
        +crearCoche(String, String, String)
        +getCoche(String)
        +subirVelocidad(String, Integer)
        +getVelocidad(String)
        +bajarVelocidad(String, Integer)
    }
    class ObserverVelocidad {
        +update(Coche, Model): void
    }
    Controller "1" *-- "1" Model : association
    Controller "1" *-- "1" View : association
    Model "1" *-- "1..n" Coche : association
    Model "1" *-- "1..n" ObserverVelocidad : association
      
```

---

### Diagrama de Secuencia

Ejemplo básico del procedimiento, sin utilizar los nombres de los métodos


```mermaid
sequenceDiagram
    participant Model
    participant Controller
    participant View
    Controller->>Model: Puedes crear un coche?
    activate Model
    Model-->>Controller: Creado!
    deactivate Model
    Controller->>+View: Muestra la velocidad, porfa
    activate View
    View->>-View: Mostrando velocidad
    View-->>Controller: Listo!
    deactivate View
```

El mismo diagrama con los nombres de los métodos

```mermaid
sequenceDiagram
    participant Model
    participant Controller
    participant View
    participant ObserverVelocidad
    Controller->>Model: crearCoche("Mercedes", "BXK 1234")
    activate Model
    Model-->>Controller: Coche
    deactivate Model
    Controller->>Model: subirVelocidad("BXK 1234", 50)
    activate Model
    Model-->>Controller: void
    Model->>ObserverVelocidad: update(Coche, Model)
    activate ObserverVelocidad
    ObserverVelocidad-->>Model: void
    deactivate ObserverVelocidad
    Controller->>Model: bajarVelocidad("BXK 1234", 20)
    activate Model
    Model-->>Controller: void
    Model->>ObserverVelocidad: update(Coche, Model)
    activate ObserverVelocidad
    ObserverVelocidad-->>Model: void
    deactivate ObserverVelocidad
    deactivate Model
    Controller->>+View: muestraVelocidad("BXK 1234", velocidad)
    activate View
    View->>-View: System.out.println()
    View-->>Controller: boolean
    deactivate View
```