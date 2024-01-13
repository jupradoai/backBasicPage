package portfolio.jupradoai.Entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

@Data
@Getter @Setter @NoArgsConstructor
@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Nonnull
    @JsonProperty("name")
    @Column(name = "name")
    private String name;

    @Nonnull
    @JsonProperty("email")
    @Column(name = "email")
    private String email;

    @Nonnull
    @JsonProperty("phone")
    @Column(name = "phone")
    private String phone;

    @Nonnull
    @JsonProperty("subject")
    @Column(name = "subject")
    private String subject;

    @Nonnull
    @JsonProperty("message")
    @Column(name = "message")
    private String message;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return id != null && id.equals(usuario.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                '}';
    }
}
