package controle_estoque.demo.ModuloFornecedor.Repository;

import controle_estoque.demo.ModuloFornecedor.Entity.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
}
