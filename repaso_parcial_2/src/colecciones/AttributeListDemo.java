package colecciones;

import javax.management.Attribute;
import javax.management.AttributeList;

public class AttributeListDemo {
    public static void main(String[] args) {
        AttributeList atributos = new AttributeList();

        atributos.add(new Attribute("nombre", "Servidor A"));
        atributos.add(new Attribute("estado", "activo"));
        atributos.add(new Attribute("conexiones", 52));

        for (Object obj : atributos) {
            Attribute atributo = (Attribute) obj;
            System.out.println(atributo.getName() + " → " + atributo.getValue());
        }
    }
}

