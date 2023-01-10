package com.gorest.testsuits;

import com.gorest.gorestinfo.UserSteps;
import com.gorest.testbase.TestBase;
import com.gorest.utils.TestUtils;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;



@UseTestDataFrom("src/test/java/resources/testdata/user.csv")
@RunWith(SerenityParameterizedRunner.class)
public class UserDataDrivenTest extends TestBase {

 private String name;
   private String email;
   private String gender;
   private String status;


    @Steps UserSteps userStep;

    @Title("Data Driven test for creating multiple users")
    @Test
    public void createMultipleUsersFromData() {
        userStep.creatUserSuccessfully(name, email, gender, status).statusCode(201);
    }
}