package br.com.alura.LiterAltura.servico;

import br.com.alura.LiterAltura.dto.LivroDTO;
import br.com.alura.LiterAltura.model.Autor;
import br.com.alura.LiterAltura.model.Livro;

import java.util.List;

public class ConverteDados {

    public static Livro converterParaEntidade(LivroDTO dto) {
        List<Autor> autores = dto.autores().stream()
                .map(autorDTO -> new Autor(autorDTO.nome(), autorDTO.anoNascimento(), autorDTO.anoFalecimento()))
                .toList();

        return new Livro(dto.titulo(), autores, dto.idiomas(), dto.downloadCount());
    }

}