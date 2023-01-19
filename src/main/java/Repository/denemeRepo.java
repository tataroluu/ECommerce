package Repository;

import Model.deneme;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


@Repository
public class denemeRepo {


    public List<deneme> getAllUsersRepository() {
        List<deneme> liste = new ArrayList<deneme>();

        deneme deneme = new deneme(1L, "hamit");
        liste.add(deneme);

        return liste;
    }

}
