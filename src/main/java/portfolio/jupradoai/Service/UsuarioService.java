package portfolio.jupradoai.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import portfolio.jupradoai.Entity.Usuario;
import portfolio.jupradoai.Repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
@ComponentScan 
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Transactional
    public Usuario salvar(Usuario usuario) {

        return usuarioRepository.save(usuario);
    }
    
    @Transactional(readOnly = true )
    public Usuario buscarPorId(Long id){
        return usuarioRepository.findById(id).orElseThrow( () -> new RuntimeException("USUARIO NÃO ENCONTRADO"));
    }
    
    @Transactional(readOnly = true)
    public List<Usuario> burcarTodos() {
        return usuarioRepository.findAll();
    }
}