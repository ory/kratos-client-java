/*
 * Ory Kratos API
 * Documentation for all public and administrative Ory Kratos APIs. Public and administrative APIs are exposed on different ports. Public APIs can face the public internet without any protection while administrative APIs should never be exposed without prior authorization. To protect the administative API port you should use something like Nginx, Ory Oathkeeper, or any other technology capable of authorizing incoming requests. 
 *
 * The version of the OpenAPI document: v0.7.5-alpha.2
 * Contact: hi@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.kratos.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import sh.ory.kratos.model.IdentityCredentials;
import sh.ory.kratos.model.IdentityState;
import sh.ory.kratos.model.RecoveryAddress;
import sh.ory.kratos.model.VerifiableIdentityAddress;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for Identity
 */
public class IdentityTest {
    private final Identity model = new Identity();

    /**
     * Model tests for Identity
     */
    @Test
    public void testIdentity() {
        // TODO: test Identity
    }

    /**
     * Test the property 'createdAt'
     */
    @Test
    public void createdAtTest() {
        // TODO: test createdAt
    }

    /**
     * Test the property 'credentials'
     */
    @Test
    public void credentialsTest() {
        // TODO: test credentials
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'recoveryAddresses'
     */
    @Test
    public void recoveryAddressesTest() {
        // TODO: test recoveryAddresses
    }

    /**
     * Test the property 'schemaId'
     */
    @Test
    public void schemaIdTest() {
        // TODO: test schemaId
    }

    /**
     * Test the property 'schemaUrl'
     */
    @Test
    public void schemaUrlTest() {
        // TODO: test schemaUrl
    }

    /**
     * Test the property 'state'
     */
    @Test
    public void stateTest() {
        // TODO: test state
    }

    /**
     * Test the property 'stateChangedAt'
     */
    @Test
    public void stateChangedAtTest() {
        // TODO: test stateChangedAt
    }

    /**
     * Test the property 'traits'
     */
    @Test
    public void traitsTest() {
        // TODO: test traits
    }

    /**
     * Test the property 'updatedAt'
     */
    @Test
    public void updatedAtTest() {
        // TODO: test updatedAt
    }

    /**
     * Test the property 'verifiableAddresses'
     */
    @Test
    public void verifiableAddressesTest() {
        // TODO: test verifiableAddresses
    }

}
