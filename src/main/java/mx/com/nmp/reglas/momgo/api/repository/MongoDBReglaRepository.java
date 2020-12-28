package mx.com.nmp.reglas.momgo.api.repository;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import mx.com.nmp.reglas.momgo.api.model.Regla;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//@Repository
//@Service
public class MongoDBReglaRepository //implements  ReglaRepository
{
  /*  @Override
    public <S extends Regla> S save(S s) {
        return null;
    }

    @Override
    public <S extends Regla> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Regla> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public List<Regla> findAll() {
        return null;
    }

    @Override
    public Iterable<Regla> findAllById(Iterable<Integer> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer)
    {
        if (customerRepository.findById(id).isPresent())
        {	customerRepository.deleteById(id);
            return "Customer eliminado correctamente.";
        }
        return "Error! El customer no existe";
    }

    @Override
    public void delete(Regla regla) {

    }

    @Override
    public void deleteAll(Iterable<? extends Regla> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Regla> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Regla> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Regla> S insert(S s) {
        return null;
    }

    @Override
    public <S extends Regla> List<S> insert(Iterable<S> iterable) {
        return null;
    }

    @Override
    public <S extends Regla> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Regla> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Regla> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Regla> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Regla> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Regla> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public List<Regla> findByActivo(boolean activo) {
        return null;
    }

    @Override
    public Regla findByIdRegla(int _id) {
        return null;
    }

    @Override
    public String deleteRegla(int _id)
    {
        return null;
    }
    */


  /*  @Autowired
    private MongoClient client;
    private MongoCollection<Regla> reglaCollection;

    @PostConstruct
    void init() {
        reglaCollection = client.getDatabase("Infoprenda").getCollection("regla", Regla.class);
    }

    @Override
    public <S extends Regla> S save(S s) {
        return null
    }

    @Override
    public <S extends Regla> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Regla> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public List findAll()
    {
        return reglaCollection.find().into(new ArrayList<>());
    }

    @Override
    public List findByActive(boolean active) {
        return ReglaRepository.findByActive(true);
    }

    @Override
    public Iterable<Regla> findAllById(Iterable<Integer> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Regla regla) {

    }

    @Override
    public void deleteAll(Iterable<? extends Regla> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Regla> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Regla> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Regla> S insert(S s) {
        return null;
    }

    @Override
    public <S extends Regla> List<S> insert(Iterable<S> iterable) {
        return null;
    }

    @Override
    public <S extends Regla> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Regla> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Regla> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Regla> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Regla> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Regla> boolean exists(Example<S> example) {
        return false;
    }

   */
}
