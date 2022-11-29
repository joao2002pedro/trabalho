package Trabalho.Empresarial.Controller;

import Trabalho.Empresarial.entity.Cliente;
import Trabalho.Empresarial.repository.repositoryCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/cliente/v1/")
public class Controller {

    @Autowired
    private repositoryCliente repositoryCliente ;

    @PostMapping
    @ResponseBody
    public Cliente create(@RequestBody Cliente cliente) {
        Cliente clienteSaved = repositoryCliente.save(cliente);
        return clienteSaved;
    }

    @GetMapping("{id}")
    @ResponseBody
    public Optional<Cliente> getPedidoById(@PathVariable Long id) {
        Optional<Cliente> orderReturned = repositoryCliente.findById(id);
        return orderReturned;
    }

    @GetMapping("todos")
    public List<Cliente> getAllClients() {
        return repositoryCliente.findAll();
    }

    @DeleteMapping("{id}")
    public String deleteOrderById(@PathVariable Long id) {
        Optional<Cliente> clienteOptional = repositoryCliente.findById(id);
        if (clienteOptional.isPresent()) {
            repositoryCliente.deleteById(id);
            return "Pedido de id " + id + " foi deletado com sucesso!";
        } else {
            return "Pedido inexistente!";
        }
    }

    @PutMapping("{id}")
    public String updatePedidoById(@PathVariable Long id) {
        Optional<Cliente> pedidoOptional = repositoryCliente.findById(id);
        if (pedidoOptional.isPresent()) {
            Cliente c = pedidoOptional.get();
            repositoryCliente.save(c);
            return "Cliente de id " + id + " salvo com sucesso!";
        } else {
            return "Cliente inexistente";
        }
    }
}