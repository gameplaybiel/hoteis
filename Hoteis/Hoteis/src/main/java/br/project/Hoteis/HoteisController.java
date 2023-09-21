package br.project.Hoteis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@Repository
public class HoteisController {

    @Autowired HoteisDao dao;
    @PostMapping("/hoteis")
    public Hoteis incluir(@RequestBody Hoteis h) throws Exception {
        return dao.incluir(h);
    }
    @GetMapping("/hoteis")
    public List<Hoteis> listar() throws Exception {
        return dao.listar();
    }
    @GetMapping("/hoteis/{id}")
    public Hoteis obter(@PathVariable int id) throws Exception {
        return dao.obter(id);
    }

}
