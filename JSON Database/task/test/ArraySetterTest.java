import org.junit.Assert;
import org.junit.Test;
import server.methods.ArraySetter;

public class ArraySetterTest {
    @Test
    public void setStringToArray_OkResult(){
        //given
        ArraySetter arraySetter = new ArraySetter();
        String[] arr = {"Hello", "Hi", "Good Morning"};
        int position = 2;
        String newString = "Hey";
        //when
        String[] resultArr = arraySetter.setStringToArray(arr,position,newString);
        //then
        Assert.assertEquals(newString,resultArr[1]);
    }

    @Test
    public void setStringToArray_EmptySpotOkResult(){
        //given
        ArraySetter arraySetter = new ArraySetter();
        String[] arr = {"Hello", "", "Good Morning"};
        int position = 2;
        String newString = "Hey";
        //when
        String[] resultArr = arraySetter.setStringToArray(arr,position,newString);
        //then
        Assert.assertEquals(newString,resultArr[1]);
    }

    @Test
    public void setStringToArray_NokResult(){
        //given
        ArraySetter arraySetter = new ArraySetter();
        String[] arr = {"Hello", "Hi", "Good Morning"};
        int position = 2;
        String newString = "Hey";
        //when
        String[] resultArr = arraySetter.setStringToArray(arr,position,newString);
        //then
        Assert.assertNotEquals("Hi",resultArr[1]);
    }

}
