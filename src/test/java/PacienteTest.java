import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PacienteTest {

    @Test
    public void testClone() throws  CloneNotSupportedException {
        Paciente paciente = new Paciente(1, "Paciente Original", new PlanoSaude("Plano A", 100));
        Paciente pacienteClone = paciente.clone();
        pacienteClone.setId(2);
        pacienteClone.setNome("Paciente Clonado");
        pacienteClone.getPlanoSaude().setNome("Plano B");
        pacienteClone.getPlanoSaude().setValor(200);

        assertEquals("Paciente{id=1, nome='Paciente Original', planoSaude=PlanoSaude{nome='Plano A', valor=100}", paciente.toString());
        assertEquals("Paciente{id=2, nome='Paciente Clonado', planoSaude=PlanoSaude{nome='Plano B', valor=200}", pacienteClone.toString());
    }

}
