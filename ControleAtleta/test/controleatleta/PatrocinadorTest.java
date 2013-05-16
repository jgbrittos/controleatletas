package controleatleta;

import org.junit.Test;
import static org.junit.Assert.*;

public class PatrocinadorTest {

    @Test
    public void testGetNome() {
        Patrocinador instance = new Patrocinador("pedro");
        String expResult = "pedro";
        String result = instance.getNome();
        assertEquals(expResult, result);
    }

}