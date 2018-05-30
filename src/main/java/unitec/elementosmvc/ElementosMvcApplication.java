package unitec.elementosmvc;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElementosMvcApplication implements CommandLineRunner {

    @Autowired
    ServicioTarjeta servicio;
    @Autowired
    RepositorioMensaje repoMensaje;

    public static void main(String[] args) {
        SpringApplication.run(ElementosMvcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //guardar y actualizar
        //LocalDate fecha = LocalDate.now();
        //repoMensaje.save(new Mensaje("Hola",fecha,"Cerdito"));

        //Buscar todos los mensajes ya
        //for( Mensaje mensa: repoMensaje.findAll()){
          //System.out.println(mensa);    
         //}
        
        //buscar por ID      
        //System.out.println( repoMensaje.findById("5b08c8a3c2f2f41490db1b03").get());
        
        //buscar por cuerpo
        //System.out.println( repoMensaje.findByCuerpo("cerdito"));
        
        //borrar 
        //Mensaje m=new Mensaje();
        //m.setId("Hola");
        //repoMensaje.delete(m);
    }
}
