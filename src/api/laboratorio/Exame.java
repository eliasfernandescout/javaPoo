package api.laboratorio;

import lombok.Data;

@Data
public class Exame {
    private String id;
    private String nome;
    private String descricao;
    private double valor;

    Exame(String id, String nome, String descricao, double valor){
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }
}
