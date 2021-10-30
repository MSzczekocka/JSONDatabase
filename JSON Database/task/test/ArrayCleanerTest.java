import org.junit.Assert;
import org.junit.Test;
import server.methods.ArrayCleaner;

public class ArrayCleanerTest {
    @Test
    public void deleteValueInArray_resultOk(){
        //given
        ArrayCleaner arrayCleaner = new ArrayCleaner();
        String[] arr = {"A", "B", "C"};
        int position = 1;
        //when
        String[] result = arrayCleaner.deleteValueInArray(arr,position);
        //then
        Assert.assertEquals("",result[0]);
    }

    @Test
    public void deleteValueInArray_emptySpot(){
        //given
        ArrayCleaner arrayCleaner = new ArrayCleaner();
        String[] arr = {"A", "", "C"};
        int position = 2;
        //when
        String[] result = arrayCleaner.deleteValueInArray(arr,position);
        //then
        Assert.assertEquals("",result[1]);
    }
}
