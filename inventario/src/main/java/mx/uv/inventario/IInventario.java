package mx.uv.inventario;

import org.springframework.data.repository.CrudRepository;

public interface IInventario extends CrudRepository < Inventariadores, Integer > {
    Inventariadores findByFolioInvProducto(String folioInvProducto);
}

