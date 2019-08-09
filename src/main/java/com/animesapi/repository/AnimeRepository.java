package com.animesapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.animesapi.domain.Anime;

@Repository
public interface AnimeRepository extends JpaRepository<Anime, Long>{
	Anime findById(long id);
}
