/**
 *
 * @author leomarotta
 */
import java.io.Serializable;

public class Usuario implements Serializable {
    private Long id;
    private String usuario;
    private String senha;

    public Usuario(Long id, String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }    
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public boolean testSenha(String senha){
        return this.senha.equals(senha);
    }
}