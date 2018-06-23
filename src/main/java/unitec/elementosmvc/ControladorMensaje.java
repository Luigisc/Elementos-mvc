package unitec.elementosmvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author T-107
 */
@RestController
@RequestMapping("/api")
@CrossOrigin
public class ControladorMensaje {

    @Autowired
    RepositorioMensaje repomensa;

//Caso a): Buscar todos  
    @GetMapping("/mensaje")
    public List<Mensaje> buscarTodos() {
        return repomensa.findAll();
    }

    //caso b): Buscar por ID   las llaves en --->{id}<--- significa que el usuario necesita introducir un valor, 
    //conocida como variable de ruta
    @GetMapping("/mensaje/{id}")
    public Mensaje buscarPorID(@PathVariable String id) {
        Mensaje mensa = new Mensaje();
        return repomensa.findById(id).get();
    }
       //caso c): guardar
       @PostMapping("/mensaje")
       public Estatus guardar(@RequestBody String json) throws Exception{
        //Primero convertimos este string json a un objeto java
        ObjectMapper maper=new ObjectMapper();
        Mensaje mensa= maper.readValue(json, Mensaje.class);
        repomensa.save(mensa);
        System.out.println("Este objeto se convirtio:"+mensa);
        Estatus estatus=new Estatus();
        estatus.setSuccess(true);
        estatus.setMensaje("Mensaje guardado con exito");
        return estatus;
    }
       
       //caso d): Actualizar
              @PutMapping("/mensaje")
       public Estatus actualizar(@RequestBody String json) throws Exception{
        //Primero convertimos este string json a un objeto java
        ObjectMapper maper=new ObjectMapper();
        Mensaje mensa= maper.readValue(json, Mensaje.class);
        repomensa.save(mensa);
        System.out.println("Este objeto se convirtio:"+mensa);
        Estatus estatus=new Estatus();
        estatus.setSuccess(true);
        estatus.setMensaje("Actualizacion con exito");
        return estatus;
    }
       
       //caso e):Borrar
       @DeleteMapping("/mensaje/{id}")
       public Estatus borrarPorID(@PathVariable String id) {
        Mensaje mensa = new Mensaje();
        
        repomensa.deleteById(id);
        Estatus e=new Estatus();
        e.setSuccess(true);
        e.setMensaje("Mensaje borrado con exito");
        return e;
 }
}
