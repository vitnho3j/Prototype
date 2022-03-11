public class Paciente implements Cloneable {

    private int id;
    private String nome;
    private PlanoSaude planoSaude;

    public Paciente (int id, String nome, PlanoSaude planoSaude) {
        this.id = id;
        this.nome = nome;
        this.planoSaude = planoSaude;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public PlanoSaude getPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(PlanoSaude planoSaude) {
        this.planoSaude = planoSaude;
    }

    @Override
    public Paciente clone() throws CloneNotSupportedException {
        Paciente pacienteClone = (Paciente) super.clone();
        pacienteClone.planoSaude = (PlanoSaude) pacienteClone.planoSaude.clone();
        return pacienteClone;
    }

    @Override
    public String toString(){
        return "Paciente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", planoSaude=" + planoSaude;
    }

}
