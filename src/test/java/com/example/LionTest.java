import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)

public class LionTest {

    @Mock
    Feline feline;


    @Test
    public void lionGetKittens() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(7);
        Lion lion = new Lion("Самец", feline);

        assertEquals(7, lion.getKittens());
    }


    @Test
    public void lionGetFood() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion("Самец", feline);

        assertEquals((List.of("Животные", "Птицы", "Рыба")), lion.getFood());
    }
}