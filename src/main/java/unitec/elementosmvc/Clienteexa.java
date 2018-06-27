/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.elementosmvc;

import org.springframework.data.annotation.Id;

/**
 *
 * @author T-107
 */
public class Clienteexa {
   @Id
    private String Id;
    private String nombre;
    private Tarjeta tarjeta;

    @Override
    public String toString() {
        return "Clienteexa{" + "Id=" + Id + ", nombre=" + nombre + ", tarjeta=" + tarjeta + '}';
    }
    
    public Clienteexa(String Id, String nombre) {
        this.Id = Id;
        this.nombre = nombre;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }
    
}
