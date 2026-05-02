package br.com.joao.spring_boot_essentials.service;

import br.com.joao.spring_boot_essentials.database.model.ProdutoEntity;
import lombok.Builder;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {
    private static final List<ProdutoEntity> PRODUTOS = new ArrayList<>();

    public List<ProdutoEntity> findAll() {
        return new ArrayList<>(PRODUTOS);
    }
}
