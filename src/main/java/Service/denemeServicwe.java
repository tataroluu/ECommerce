package Service;

import Model.deneme;
import Repository.denemeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class denemeServicwe {

    @Autowired
    private denemeRepo denemeRepo;

    public List<deneme> getAllMoviesService() {

        return denemeRepo.getAllUsersRepository();
    }

}
