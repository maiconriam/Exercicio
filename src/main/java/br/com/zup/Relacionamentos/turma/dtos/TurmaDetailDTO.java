package br.com.zup.Relacionamentos.turma.dtos;

import br.com.zup.Relacionamentos.cadastro.dtos.CadastroTurmaDTO;
import br.com.zup.Relacionamentos.curso.Curso;
import br.com.zup.Relacionamentos.turma.enuns.Periodo;

import java.util.List;

public class TurmaDetailDTO {
    private int id;
    private Periodo periodo;
    private Curso curso;
    private List<CadastroTurmaDTO> alunos;

    public TurmaDetailDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<CadastroTurmaDTO> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<CadastroTurmaDTO> alunos) {
        this.alunos = alunos;
    }
}
