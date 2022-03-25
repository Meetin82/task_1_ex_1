package ru.vsu.cs.semenov_d_s;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class BigDecimalAnalogTest {

    @Test
    public void testOperationAdd1() {
        int[] firstNumInArr = {1, 5, 0};
        List<Integer> firstNumInList = Utils.arrIntToListInt(firstNumInArr);

        int[] secondNumInArr = {2, 0};
        List<Integer> secondNumInList = Utils.arrIntToListInt(secondNumInArr);

        BigDecimalAnalog bigDecimalAnalog = new BigDecimalAnalog(firstNumInList, secondNumInList);
        List<Integer> expectedResult = bigDecimalAnalog.add();

        int[] factualResultInArr = {1, 7, 0};
        List<Integer> factualResultInList = Utils.arrIntToListInt(factualResultInArr);

        Assert.assertEquals(expectedResult, factualResultInList);
    }

    @Test
    public void testOperationAdd2() {
        int[] firstNumInArr = {1, 1, 1, 1, 1, 1, 1, 1};
        List<Integer> firstNumInList = Utils.arrIntToListInt(firstNumInArr);

        int[] secondNumInArr = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        List<Integer> secondNumInList = Utils.arrIntToListInt(secondNumInArr);

        BigDecimalAnalog bigDecimalAnalog = new BigDecimalAnalog(firstNumInList, secondNumInList);
        List<Integer> expectedResult = bigDecimalAnalog.add();

        int[] factualResultInArr = {1, 1, 2, 2, 2, 2, 2, 2, 2, 2};
        List<Integer> factualResultInList = Utils.arrIntToListInt(factualResultInArr);

        Assert.assertEquals(expectedResult, factualResultInList);
    }

    @Test
    public void testOperationAdd3() {
        int[] firstNumInArr = {0};
        List<Integer> firstNumInList = Utils.arrIntToListInt(firstNumInArr);

        int[] secondNumInArr = {0};
        List<Integer> secondNumInList = Utils.arrIntToListInt(secondNumInArr);

        BigDecimalAnalog bigDecimalAnalog = new BigDecimalAnalog(firstNumInList, secondNumInList);
        List<Integer> expectedResult = bigDecimalAnalog.add();

        int[] factualResultInArr = {0};
        List<Integer> factualResultInList = Utils.arrIntToListInt(factualResultInArr);

        Assert.assertEquals(expectedResult, factualResultInList);
    }

    @Test
    public void testOperationSubtract1() {
        int[] firstNumInArr = {0};
        List<Integer> firstNumInList = Utils.arrIntToListInt(firstNumInArr);

        int[] secondNumInArr = {0};
        List<Integer> secondNumInList = Utils.arrIntToListInt(secondNumInArr);

        BigDecimalAnalog bigDecimalAnalog = new BigDecimalAnalog(firstNumInList, secondNumInList);
        List<Integer> expectedResult = bigDecimalAnalog.subtract();

        int[] factualResultInArr = {0};
        List<Integer> factualResultInList = Utils.arrIntToListInt(factualResultInArr);

        Assert.assertEquals(expectedResult, factualResultInList);
    }

    @Test
    public void testOperationSubtract2() {
        int[] firstNumInArr = {7, 0, 0, 0, 0};
        List<Integer> firstNumInList = Utils.arrIntToListInt(firstNumInArr);

        int[] secondNumInArr = {3, 2, 7};
        List<Integer> secondNumInList = Utils.arrIntToListInt(secondNumInArr);

        BigDecimalAnalog bigDecimalAnalog = new BigDecimalAnalog(firstNumInList, secondNumInList);
        List<Integer> expectedResult = bigDecimalAnalog.subtract();

        int[] factualResultInArr = {6, 9, 6, 7, 3};
        List<Integer> factualResultInList = Utils.arrIntToListInt(factualResultInArr);

        Assert.assertEquals(expectedResult, factualResultInList);
    }

    @Test
    public void testOperationSubtract3() {
        int[] firstNumInArr = {5, 0, 3};
        List<Integer> firstNumInList = Utils.arrIntToListInt(firstNumInArr);

        int[] secondNumInArr = {9, 4, 4, 3};
        List<Integer> secondNumInList = Utils.arrIntToListInt(secondNumInArr);

        BigDecimalAnalog bigDecimalAnalog = new BigDecimalAnalog(firstNumInList, secondNumInList);
        List<Integer> expectedResult = bigDecimalAnalog.subtract();

        int[] factualResultInArr = {-8, 9, 4, 0};
        List<Integer> factualResultInList = Utils.arrIntToListInt(factualResultInArr);

        Assert.assertEquals(expectedResult, factualResultInList);
    }
}
