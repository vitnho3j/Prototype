public class PlanoSaude implements Cloneable {

    private String nome;
    private Integer valor;

    public PlanoSaude(String nome, Integer valor){
        super();
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString(){
        return "PlanoSaude{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }
}
