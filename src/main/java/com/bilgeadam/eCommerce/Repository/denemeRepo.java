package com.bilgeadam.eCommerce.Repository;

import com.bilgeadam.eCommerce.Model.deneme;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class denemeRepo {


    public List<deneme> getAllUsersRepository() {
        List<deneme> liste = new ArrayList<deneme>();

        deneme deneme = new deneme(1L, "servet");
        liste.add(deneme);

        return liste;
    }

}
