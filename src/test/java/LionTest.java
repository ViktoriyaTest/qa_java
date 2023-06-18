import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    private final String animalKind = "Хищник";

    @Mock
    Feline feline;
    Lion lion;

    @Test
    public void getKittensTest() throws Exception {
        int getKittens = 1;
        lion = new Lion("Самец", feline);
        Mockito.when(lion.getKittens()).thenReturn(getKittens); //вызываем, чтобы всегда возвращал 1
        Assert.assertEquals(getKittens, lion.getKittens());
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        lion = new Lion("Самец", feline);
        Assert.assertTrue(lion.doesHaveMane());
    }

}

