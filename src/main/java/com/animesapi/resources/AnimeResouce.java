package com.animesapi.resources;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.animesapi.domain.Anime;
import com.animesapi.repository.AnimeRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Animes")
public class AnimeResouce {

	@Autowired
	private AnimeRepository animeRepository;

	@ApiOperation(value = "Retorna uma lista Animes")
	@GetMapping("/animes")
	public List<Anime> listaAnimes() {
		return animeRepository.findAll();

	}

	@ApiOperation(value = "Retorna um unico anime")
	@GetMapping("/anime/{id}")
	public Anime listaAnimeUnico(@PathVariable(value = "id") long id) {

		return animeRepository.findById(id);
	}

	@ApiOperation(value = "Salva um novo anime")
	@PostMapping("/anime")
	public Anime salvarAnime(@RequestBody @Valid Anime anime) {

		return animeRepository.save(anime);
	}

	@ApiOperation(value = "Deleta um Anime")
	@DeleteMapping("/anime/{id}")
	public void deletaAnime(@RequestBody @Valid Anime anime) {

		animeRepository.delete(anime);

	}

	@ApiOperation(value = "Atualiza um Anime")
	@PutMapping("/anime")
	public Anime atualizaAnime(@RequestBody @Valid Anime anime) {

		return animeRepository.save(anime);

	}

}
