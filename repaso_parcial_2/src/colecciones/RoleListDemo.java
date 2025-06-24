package colecciones;

import javax.management.relation.Role;
import javax.management.relation.RoleList;
import java.util.ArrayList;
import java.util.List;
import javax.management.ObjectName;

public class RoleListDemo {
    public static void main(String[] args) throws Exception {
        // Crear ObjectNames simulando MBeans (usamos nombres válidos ficticios)
        ObjectName admin1 = new ObjectName("miempresa:type=Usuario,name=Admin1");
        ObjectName admin2 = new ObjectName("miempresa:type=Usuario,name=Admin2");

        ObjectName operador1 = new ObjectName("miempresa:type=Usuario,name=Operador1");

        List<ObjectName> administradores = new ArrayList<>();
        administradores.add(admin1);
        administradores.add(admin2);

        List<ObjectName> operadores = new ArrayList<>();
        operadores.add(operador1);

        // Crear roles válidos
        Role rolAdmin = new Role("Administradores", administradores);
        Role rolOperador = new Role("Operadores", operadores);

        // Agregar a RoleList
        RoleList listaRoles = new RoleList();
        listaRoles.add(rolAdmin);
        listaRoles.add(rolOperador);

        // Mostrar contenido
        for (Object obj : listaRoles) {
            Role r = (Role) obj;
            System.out.println("Rol: " + r.getRoleName());
            for (ObjectName mbean : r.getRoleValue()) {
                System.out.println(" - MBean: " + mbean.getCanonicalName());
            }
        }
    }
}
