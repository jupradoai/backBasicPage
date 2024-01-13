package portfolio.jupradoai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import portfolio.jupradoai.Entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	Usuario findByEmail(String email);
}