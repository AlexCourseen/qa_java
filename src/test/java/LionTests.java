import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class LionTests {
    @Mock
    Feline feline;

    @Test
    public void checkExceptionDoesHaveMane() {
        Exception exception = assertThrows(Exception.class, () -> {
            Lion lion = new Lion("Нечто", feline);
            lion.doesHaveMane();
        });
        Assert.assertEquals("Используйте допустимые значения пола животного - самей или самка", exception.getMessage());
    }

    @Test
    public void checkGetKittens() throws Exception{
        String sex = "Самец";
        Lion lion = new Lion(sex, feline);
        int lionKittens = 1;
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals(lionKittens, lion.getKittens());
    }

    @Test
    public void checkGetFood() throws Exception{
        String sex = "Самец";
        Lion lion = new Lion(sex, feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"),lion.getFood());
    }
}
