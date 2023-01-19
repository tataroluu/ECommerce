package com.bilgeadam.eCommerce.Service;

import com.bilgeadam.eCommerce.Model.deneme;
import com.bilgeadam.eCommerce.Repository.denemeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class denemeServicwe {

    @Autowired
    private denemeRepo denemeRepo;

    public List<deneme> getAllMoviesService() {

        return denemeRepo.getAllUsersRepository();
    }

}
