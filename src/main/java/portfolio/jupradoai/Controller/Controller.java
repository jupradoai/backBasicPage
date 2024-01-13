package portfolio.jupradoai.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import portfolio.jupradoai.Entity.Usuario;
import portfolio.jupradoai.Service.UsuarioService;

@RestController
@RequestMapping("api/DJ/usuarios")
public class Controller {

    private final UsuarioService usuarioService;

    @Autowired
    public Controller(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<Usuario> create(@RequestBody Usuario usuario) {
        Usuario user = usuarioService.salvar(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getbyId(@PathVariable long id){
        Usuario user = usuarioService.buscarPorId(id);
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }
    

    @GetMapping
    public ResponseEntity<List<Usuario>> getAll(){
        List<Usuario> users= usuarioService.burcarTodos();
        return ResponseEntity.ok(users);
    }
}
