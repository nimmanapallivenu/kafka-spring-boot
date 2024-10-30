package com.venu.kafka.service;

import com.venu.kafka.entity.Tutorial;
import com.venu.kafka.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TutorialService {

    @Autowired
    private TutorialRepository tutorialRepository;

    public List<Tutorial> findAll() {
        return tutorialRepository.findAll();
    }

    public Optional<Tutorial> findById(Long id) {
        return tutorialRepository.findById(id);
    }

    public Tutorial save(Tutorial tutorial) {
        return tutorialRepository.save(tutorial);
    }

    public List<Tutorial> findByTitleContaining(String title) {
        return tutorialRepository.findByTitleContaining(title);
    }

    public void deleteById(long id) {
        tutorialRepository.deleteById(id);
    }

    public void deleteAll() {
        tutorialRepository.deleteAll();
    }

    public List<Tutorial> findByPublished(boolean published) {
        return tutorialRepository.findByPublished(published);
    }
}
