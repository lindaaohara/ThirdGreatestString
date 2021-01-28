import org.junit.Assert;
import org.junit.Test;


public class testThirdGreatestString {
  //  String[] strArr = new String[];

    @Test
    public void testSort1(){
        String[] testArr = {"coder", "byte", "code"};
        String expected = "code";
        String actual = ThirdGreatestString.sort(testArr);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSort2(){
        String[] testArr = {"hello", "world", "before", "all"};
        String expected = "world";
        String actual = ThirdGreatestString.sort(testArr);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSort3(){
        String[] testArr = {"hello", "world", "after", "all"};
        String expected = "after";
        String actual = ThirdGreatestString.sort(testArr);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testSort4(){
        String[] testArr = {"abc", "defg", "z", "hijk"};
        String expected = "abc";
        String actual = ThirdGreatestString.sort(testArr);
        Assert.assertEquals(expected, actual);
    }
}
