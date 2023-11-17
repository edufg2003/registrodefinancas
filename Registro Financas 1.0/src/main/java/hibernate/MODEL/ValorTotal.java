package hibernate.MODEL;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "valortotal")
public class ValorTotal {
    
    @Id
    @Column (name="id_valortotal")
    private Long Id;
    @Column(name="categoria")
    private String categoria;
    @Column(name="valortotal")
    private float valortotal;

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getValortotal() {
        return valortotal;
    }

    public void setValortotal(float valortotal) {
        this.valortotal = valortotal;
    }

   

    
    
    
    
    
}

