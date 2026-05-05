package controle_estoque.demo.ModuloCliente.Repository;

import controle_estoque.demo.ModuloCliente.Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
