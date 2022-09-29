package br.com.ifpe.oxefoodmanha.util.entity;

import java.time.LocalDate;

import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@MappedSuperclass
public abstract class EntidadeAuditavel extends EntidadeNegocio {

    private static final long serialVersionUID = -4937477043538727251L;

    private Long versao;

    private LocalDate dataCriacao;

    private LocalDate dataUltimaModificacao;

    private Long criadoPor; // Id do usuário que o criou

    private Long ultimaModificacaoPor;
    
}
