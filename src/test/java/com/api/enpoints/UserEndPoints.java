package com.api.enpoints;

import com.api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

//UserEndPoints.java
//Created for perform Create,Read,Update,Delete requests to the user API
public class UserEndPoints {


    public static Response createUser(User payload) {
        Response response = given()
                .contentType(JSON)
                .accept(JSON)
                .body(payload)
                .when()
                .post(Routes.post_url);
        return response;
    }

    public static Response readUser(String userName) {
        Response response = given()
                .pathParam("username", userName)
                .when()
                .get(Routes.get_url);
        return response;
    }

    public static Response updateUser(User payload,String userName) {
        Response response = given()
                .pathParam("username",userName)
                .contentType(JSON)
                .accept(JSON)
                .body(payload)
                .when()
                .put(Routes.update_url);
        return response;
    }

    public static Response deleteUser(String userName) {
        Response response = given()
                .pathParam("username",userName)
                .when()
                .delete(Routes.delete_url);
        return response;
    }
}
