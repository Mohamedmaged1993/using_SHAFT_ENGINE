package tests.api.users;

 import org.apache.commons.lang3.StringUtils;
import org.testng.annotations.Test;

import com.shaft.api.RestActions;
import com.shaft.api.RestActions.RequestType;
import com.shaft.validation.Assertions;
import com.shaft.validation.Assertions.AssertionComparisonType;
import com.shaft.validation.Assertions.AssertionType;

import io.restassured.response.Response;

import static org.testng.Assert.assertTrue;

   public class UserData {

    @Test
    public void validateUserEmail() {
	RestActions apiObject = new RestActions("https://cat-fact.herokuapp.com");
	Response users = apiObject.performRequest(RequestType.GET, 200, "/facts/random");
	
		boolean text = RestActions.getResponseJSONValue(users, "text").isEmpty();
	Assertions.assertTrue(text, AssertionType.NEGATIVE);
    }
}
