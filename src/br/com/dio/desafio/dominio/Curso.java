package br.com.dio.desafio.dominio;

class Curso extends Conteudo{

    private int cargaHoraria;

    @Override
    double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    Curso() {
    }

    Curso(String nome, String descricao, int cargaHoraria) {
        this.setTitulo(nome);
        this.setDescricao(descricao);
        this.setCargaHoraria(cargaHoraria);
    }

    int getCargaHoraria() {
        return cargaHoraria;
    }

    void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
