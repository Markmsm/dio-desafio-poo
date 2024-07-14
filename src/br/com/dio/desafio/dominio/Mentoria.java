package br.com.dio.desafio.dominio;

import java.time.LocalDate;

class Mentoria extends Conteudo{

    private LocalDate data;

    Mentoria(String name, String descricao, LocalDate data) {
        this.setTitulo(name);
        this.setDescricao(descricao);
        this.setData(data);
    }

    @Override
    double calcularXp() {
        return XP_PADRAO + 20d;
    }

    Mentoria() {
    }

    LocalDate getData() {
        return data;
    }

    void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
