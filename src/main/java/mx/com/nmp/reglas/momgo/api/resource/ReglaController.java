package mx.com.nmp.reglas.momgo.api.resource;

import lombok.extern.slf4j.Slf4j;
import mx.com.nmp.reglas.momgo.api.model.Regla;
import mx.com.nmp.reglas.momgo.api.repository.ReglaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reglas")
@Slf4j
public class ReglaController
{
    @Autowired
    private ReglaRepository reglaRepository;

    @PostMapping(path="/adicionarParametros",
            consumes = "application/json", produces = "application/json")
    @ResponseBody
    public String adicionarRegla(@RequestBody Regla regla)
    {
        reglaRepository.save(regla);
        return "Parametro adicionado con Id="+regla.getId();
    }

    @GetMapping(path="/listaParametros", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<Regla> listarRegla()

    {
        System.out.println(".....");
        //List<Regla> ls=reglaRepository.findAll();

        List<Regla> ls=reglaRepository.findByActivo(true);
        System.out.println(".....::"+ls.size());
        return ls;
    }

    @GetMapping(path="/buscaParametros/{_id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Regla buscarRegla(@PathVariable("_id") int _id)
    {
        System.out.println("id:"+_id);
        //List<Regla> regla=reglaRepository.findByIdRegla(_id);
       // List<String> ids=new ArrayList<>();
        //ids.add(""+_id);
        //System.out.println("obj:"+reglaRepository.findByIdRegla(""+_id));

        //System.out.println("obj:"+regla);
        return  reglaRepository.findByIdRegla(_id);
    }
}
