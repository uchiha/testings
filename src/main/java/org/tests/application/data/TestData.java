package org.tests.application.data;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;
import org.testng.Assert;
import org.tests.application.model.UserModel;

public class TestData {

    @Inject
    ObjectMapper objMapper;

    @Inject
    UserModel userData;

    public UserModel getUserModel(String data) {
        try{
            userData = objMapper.readValue(data, UserModel.class);
        }catch (JsonProcessingException e){
            Assert.fail("There is an issue with the data used in UserModel.");
        }
        return userData;
    }

}
