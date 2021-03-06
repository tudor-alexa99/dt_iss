package iss.dt.app.core.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import iss.dt.app.core.model.Discipline;
import iss.dt.app.core.repository.DisciplineRepository;

import java.util.List;

/**
 * Created by radu.
 */
@Service
public class DisciplineServiceImpl implements DisciplineService {
    private static final Logger log = LoggerFactory.getLogger(DisciplineServiceImpl.class);

    @Autowired
    private DisciplineRepository disciplineRepository;

    @Override
    public List<Discipline> getAllDisciplines() {
        //todo: log
        return disciplineRepository.findAll();
    }
}
