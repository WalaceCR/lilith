package com.experiencia.metas.enuns;
import lombok.Getter;

@Getter
public enum Tipo {
    IMOVEL(1);

    private final int codigo;

    Tipo(int dominio){
        this.codigo = dominio;
    }
    public static Tipo porDominio(int numero){
        for (Tipo dominio : Tipo.values()){
            if (dominio.codigo == numero){
                return dominio;
            }
        }
        throw new IllegalArgumentException("Número inválido " + numero);
    }
}
