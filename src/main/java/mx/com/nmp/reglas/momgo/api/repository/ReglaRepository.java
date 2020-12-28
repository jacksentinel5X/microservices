package mx.com.nmp.reglas.momgo.api.repository;

import mx.com.nmp.reglas.momgo.api.model.Regla;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//
//@Transactional
@Repository
public interface ReglaRepository extends MongoRepository<Regla,Integer>
{
    public List<Regla> findAll();
    public List<Regla> findByActivo(boolean activo);

    //@Query("{_id: { $in: ?0 } })")
    //public List<Regla> findByIdRegla(List<String> ids);

    //@Query("select * from regla where _id =  '?1'")
    @Query("{_id: ?0}")
    public Regla findByIdRegla(int _id);
    //public ArrayList<Regla> findAllRegla();
    //public String deleteRegla(int _id);

}
