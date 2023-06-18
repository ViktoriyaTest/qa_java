import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    Feline feline = new Feline();
    private String animalKind = "Хищник";

    @Test
    public void getKittensTest() throws Exception {

        int expected = feline.getKittens();
        assertEquals(expected, 1);
    }

    @Test
    public void eatMeatTest() throws Exception {
        List<String> expected = feline.getFood(animalKind);

        List<String> actual = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }

    @Test
    public void getFamilyTest() throws Exception {
        String expected = feline.getFamily();

        String actual = "Кошачьи";
        assertEquals(expected, actual);
    }

    @RunWith(Parameterized.class)
    public static class getKittensParameterizedTest {
        private final int kittensCount;
        private final int actual;


        public getKittensParameterizedTest(int kittensCount, int actual) {
            this.kittensCount = kittensCount;
            this.actual = actual;
        }

        @Parameterized.Parameters(name = "Кол-во котят. Тестовые данные: {0} {1}") // добавили аннотацию
        public static Object[][] getKittensCount() {
            return new Object[][]{
                    {5, 5},
            };
        }

        @Test
        public void getKittensParameterizedTest() throws Exception {
            Feline feline = new Feline();

            int expected = feline.getKittens(kittensCount);
            assertEquals(expected, actual);
        }
    }
}