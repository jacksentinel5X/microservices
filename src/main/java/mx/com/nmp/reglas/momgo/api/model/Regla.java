package mx.com.nmp.reglas.momgo.api.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Getter
@Setter
@ToString
@Document (collection  = "regla")
public class Regla implements Serializable
{
    @Id
    private int id;
    private String expresion;
    private boolean activo;
    private String tipo;

    public Regla() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
