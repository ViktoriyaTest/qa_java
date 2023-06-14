import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    private final String animalKind = "Хищник";



    @Mock
    Feline feline;
    Lion lion;

    @Test
    public void getKittensTest() throws Exception {

        lion = new Lion("Самец", feline);
        System.out.println(lion.getKittens()); //возвращает 0
        Mockito.when(lion.getKittens()).thenReturn(1); //вызываем, чтобы всегда возвращал 1
        Assert.assertEquals(1, lion.getKittens());
        System.out.println(lion.getKittens()); //теперь выводит 1
    }


    @Test
    public void doesHaveManeTest() throws Exception {
        lion = new Lion("Самец", feline);
        Assert.assertEquals(true, lion.doesHaveMane());
    }

    //@Test
    //public void getFoodTest() throws Exception {
    //  lion = new Lion("Самец", feline);
    //  lion.getFood(animalKind);
    //  Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    //}
}

