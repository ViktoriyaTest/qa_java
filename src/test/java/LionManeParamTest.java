package com.example;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionManeParamTest {

    Feline feline;
    Boolean result;
    String sex;

    public LionManeParamTest(Boolean result, String sex) {
        this.result = result;
        this.sex = sex;
    }
    @Parameterized.Parameters
    public static Object[][] newOrderData(){
        return new Object[][] {
                {true,"Самец"},
                {false,"Самка"}
        };
    }
    @Test
    public void DoesHaveManeTest() throws Exception {

        Lion lion = new Lion(sex, feline);
        Assert.assertEquals(result, lion.doesHaveMane());
    }
}
