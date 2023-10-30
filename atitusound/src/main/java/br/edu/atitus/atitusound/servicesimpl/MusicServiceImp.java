package br.edu.atitus.atitusound.servicesimpl;

import org.springframework.stereotype.Service;

import br.edu.atitus.atitusound.entities.ArtistEntity;
import br.edu.atitus.atitusound.entities.MusicEntity;
import br.edu.atitus.atitusound.repositories.ArtistRepository;
import br.edu.atitus.atitusound.repositories.GenericRepository;
import br.edu.atitus.atitusound.repositories.MusicRepository;
import br.edu.atitus.atitusound.services.MusicService;

@Service
public class MusicServiceImp implements MusicService {
	private final MusicRepository musicRepository;

	public MusicServiceImp(MusicRepository musicRepository) {
		super();
		this.musicRepository = musicRepository;
	}

	@Override
	public GenericRepository<MusicEntity> getRepository() {
		return musicRepository;
	}
	
}
