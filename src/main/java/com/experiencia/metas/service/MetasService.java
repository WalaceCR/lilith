package com.experiencia.metas.service;

import com.experiencia.metas.entities.Metas;
import com.experiencia.metas.repositories.MetasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MetasService {

    @Autowired
    private MetasRepository metasRepository;


    public Metas salvarMetas(Metas meta) {
        return metasRepository.save(meta);
    }

    public List<Metas> pesquisarTodasAsMetas() {
        return metasRepository.findAll();
    }

    public void excluirMetasPorId(Metas meta){
        metasRepository.delete(meta);
    }

    public void deletarTodasAsMetas(){
        metasRepository.deleteAll();
    }

    public Metas alterarMeta(Long idMeta, Metas metaDetalhe){
        return metasRepository.findById(idMeta).map(metas ->{
            metas.setNome(metaDetalhe.getNome());
            metas.setDescricao(metaDetalhe.getDescricao());
            metas.setTipo(metaDetalhe.getTipo());
            metas.setValor(metaDetalhe.getValor());
            metas.setData(metaDetalhe.getData());
            return metasRepository.save(metas);

        }).orElseThrow(()-> new RuntimeException("Meta não encontrada"));
    }

    public Optional<Metas> pesquisarPorId(Long id){
        return metasRepository.findById(id);
    }
}
