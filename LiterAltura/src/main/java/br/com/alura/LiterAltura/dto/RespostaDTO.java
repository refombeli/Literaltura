package br.com.alura.LiterAltura.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record RespostaDTO(@JsonProperty("results") List<LivroDTO> livros) {
}