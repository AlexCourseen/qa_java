import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTests {

    @Test
    public void checkGetFamily() {
        Feline feline = new Feline();
        String felineFamily = "Кошачьи";
        Assert.assertEquals(felineFamily,feline.getFamily());
    }

    @Spy
    Feline feline1;

    @Test
    public void checkGetKittensNoParam() {
        Feline feline1 = new Feline();
        Assert.assertEquals(1, feline1.getKittens());
    }

    @Test
    public void checkGetKittensWithParam() {
        Feline feline = new Feline();
        int felineKittens = 2;
        Assert.assertEquals(felineKittens, feline.getKittens(2));
    }

    @Test
    public void checkEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> felineFood = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(felineFood, feline.eatMeat());
    }
}
