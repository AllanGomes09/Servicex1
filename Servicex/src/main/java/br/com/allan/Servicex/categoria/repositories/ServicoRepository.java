package br.com.allan.Servicex.categoria.repositores;

import br.com.allan.Servicex.categoria.domain.Servico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicoRepository  extends JpaRepository<Servico, Integer> {
}
