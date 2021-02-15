package objetos;

public class Animais {
    
    private String descricao;
    private String especie;
    private String porte;
    private String numId;

    public Animais(String descricao, String especie, String porte, String numId) {
        this.descricao = descricao;
        this.especie = especie;
        this.porte = porte;
        this.numId = numId;
    }

    public Animais() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getNumId() {
        return numId;
    }

    public void setNumId(String numId) {
        this.numId = numId;
    }
    
}
