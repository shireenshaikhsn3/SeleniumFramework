package com.tmb.tests;

import com.tmb.testdata.TestData;
import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.TestDataReader;
import io.github.sskorol.data.XlsxReader;
import lombok.Data;
import one.util.streamex.StreamEx;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class DataSupplierTest {
    @Test(dataProvider= "getData")
    public void datasupplierTest(TestData testData){
        System.out.println("testData.username");
    }

    @DataSupplier
    public StreamEx<TestData> getData(){
        return TestDataReader.use(XlsxReader.class).withTarget(TestData.class)
                .withSource("testdata.xlsx").read();

    }
}
