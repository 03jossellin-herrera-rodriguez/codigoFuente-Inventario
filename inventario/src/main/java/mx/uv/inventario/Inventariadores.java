package mx.uv.inventario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Inventariadores {
    @Id
    //anotacion que indica que el id se genera automaticamente
    @GeneratedValue(strategy = GenerationType.AUTO)

    Long Id;
    String folioInvProducto;

    //getters y setters
    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }
    public String getFolioInvProducto() {
        return folioInvProducto;
    }
    public void setFolioInvProducto(String folioInvProducto) {
        this.folioInvProducto = folioInvProducto;
    }
}
