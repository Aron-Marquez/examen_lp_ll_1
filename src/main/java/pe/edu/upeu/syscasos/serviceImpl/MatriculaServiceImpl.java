package pe.edu.upeu.syscasos.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.syscasos.dao.MatriculaDAO;
import pe.edu.upeu.syscasos.entity.Matricula;
import pe.edu.upeu.syscasos.service.MatriculaService;

@Service
public class MatriculaServiceImpl implements MatriculaService{
	
	@Autowired
	private MatriculaDAO dao;
	
	@Override
	public Matricula create(Matricula m) {
		// TODO Auto-generated method stub
		return dao.create(m);
	}

	@Override
	public Matricula update(Matricula m) {
		// TODO Auto-generated method stub
		return dao.update(m);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Matricula> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Matricula> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
