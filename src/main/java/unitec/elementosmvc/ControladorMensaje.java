package unitec.elementosmvc;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
}
