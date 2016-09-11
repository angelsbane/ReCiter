package reciter.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reciter.database.mongo.model.Identity;
import reciter.database.mongo.repository.IdentityRepository;
import reciter.service.IdentityService;

@Service("identityService")
public class IdentityServiceImpl implements IdentityService {

	@Autowired
	private IdentityRepository identityRepository;

	@Override
	public void save(List<reciter.database.mongo.model.Identity> identities) {
		for (reciter.database.mongo.model.Identity identity : identities) {
			identityRepository.save(identity);
		}
	}

	@Override
	public void save(reciter.database.mongo.model.Identity identity) {
		identityRepository.save(identity);
	}
	
	@Override
	public Identity findByCwid(String cwid) {
		return identityRepository.findByCwid(cwid);
	}

	@Override
	public List<Identity> findByCwidRegex(String search) {
		return identityRepository.findByCwidRegex(search);
	}
}
