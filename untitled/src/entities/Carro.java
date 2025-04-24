package entities;

public class Carro extends Locadora{

    private String modelo;
    private Integer codigo;

    public Carro(){
    }

    public Carro(String modelo, Integer codigo){
        this.modelo = modelo;
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String toString(){
        return getModelo() + " | " + getCodigo() + " | Disponivel: " + getDisponivel();
    }
}
