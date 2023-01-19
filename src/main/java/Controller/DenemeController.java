package Controller;

import Model.deneme;
import Service.denemeServicwe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "movies")
public class DenemeController {


    @Autowired
    private denemeServicwe denemeService;

    @GetMapping(path = "getName", produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "http://localhost:8000")
    public List<deneme> getAllMoviesController() {
        // localhost:8080/movies/getName
        List<deneme> liste = denemeService.getAllMoviesService();
        return liste;
    }
}
