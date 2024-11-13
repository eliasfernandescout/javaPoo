package api.laboratorio;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Laboratorio {
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private String cnpj;
    private String responsavel;
    private String especialidade;
    private List<Exame> exames;

    Laboratorio(String nome, String endereco, String telefone, String email, String cnpj,
                String responsavel, String especialidade){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.cnpj = cnpj;
        this.responsavel = responsavel;
        this.especialidade = especialidade;
        this.exames = new ArrayList<>();
    }

    public Exame agendarExame(String id, String nome, String descricao, double valor){
        Exame exame = new Exame(id, nome, descricao, valor);
        exames.add(exame);
        return exame;
    }

   public void cancelarExame(String id){
        exames.stream().filter(e -> e.getId().equals(id)).findFirst().ifPresent(exames::remove);
   }

   public List<Exame> buscarExames(){
        return this.getExames();

    }

    public void imprimirExames(){
         exames.forEach(System.out::println);
    }



}
