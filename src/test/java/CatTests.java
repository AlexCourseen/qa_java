import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTests {
    @Mock
    Feline feline;

    @Test
    public void catGetSound() {
        Cat cat = new Cat(feline);
        String catSound = cat.getSound();
        Assert.assertEquals("Мяу", catSound);
    }

    @Mock
    Feline predator;

    @Test
    public void catGetFood() throws Exception {
        Cat cat = new Cat(predator);
        List<String> predatorFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(predator.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(predatorFood, cat.getFood());
    }
}
