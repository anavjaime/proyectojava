
public class Reasignacionobjetos {
    String nombre;
}

class Main {
    public static void main(String[] args) {
        Reasignacionobjetos persona = new Reasignacionobjetos();
        persona.nombre = "Ana";
        reasignarPersona(persona);
        System.out.println("Nombre después de reasignarPersona: " + persona.nombre);  // Debería imprimir Ana
    }

    public static void reasignarPersona(Reasignacionobjetos persona) {
        persona = new Reasignacionobjetos();  // Creamos un nuevo objeto
        persona.nombre = "María";
    }
}
