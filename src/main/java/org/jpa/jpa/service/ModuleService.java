package org.jpa.jpa.service;

import org.jpa.jpa.repository.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import org.jpa.jpa.modele.Module;
import java.util.Optional;

@Service
public class ModuleService {
    @Autowired
    private ModuleRepository moduleRepository;

    public List<Module> getAllModules() {
        List<Module> modules = new ArrayList<>();
        moduleRepository.findAll().forEach(modules::add);
        return modules;
    }

    public void ajouterModule(Module module) {
        moduleRepository.save(module);
    }

    public Optional<Module> getModule(Integer id) {
        return moduleRepository.findById(id);
    }


    public void modifierModule(Integer id, Module module) {
        moduleRepository.save(module); 
    }

    public void supprimerModule(Integer id) {
        moduleRepository.deleteById(id);
    }
}

