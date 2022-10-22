package project_utils_test;

import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.BiggerValue;

public class BiggerValueTest {



        /**
         * 4.	Напишите алгоритм BiggerValue, который из двух параметров типа int возвращает бОльшее значение.
         * Test Data:
         * 3333, 9999
         * Expected Result = 9999
         */


        @Test
//    @Ignore

        public void testSumArrayTest_HappyPath() {

            int n = 3333;
            int m = 9999;

            int expectedResult = 9999;
            //act
            int actualResult = new BiggerValue().biggerValueMaxValue(n, m);

            //Assert
            Assert.assertEquals(actualResult, expectedResult);

        }


    }


