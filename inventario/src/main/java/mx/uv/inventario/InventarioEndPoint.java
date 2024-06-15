package mx.uv.inventario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import mx.uv.t4is.inventario.ValidarFolioRequest;
import mx.uv.t4is.inventario.ValidarFolioResponse;

@Endpoint
public class InventarioEndPoint {

    @Autowired
    IInventario invetarioBD;
    @PayloadRoot(localPart = "ValidarFolioRequest", namespace = "t4is.uv.mx/inventario")

    @ResponsePayload
    public ValidarFolioResponse validarFolio (@RequestPayload ValidarFolioRequest request) {
        ValidarFolioResponse response = new ValidarFolioResponse();

        Inventariadores inventariadores = invetarioBD.findByFolioInvProducto(request.getFolioInventario());
        response.setEstatus(inventariadores != null);
        return response;
    }
}
