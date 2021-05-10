/*
 * Ory Kratos API
 * Documentation for all public and administrative Ory Kratos APIs. Public and administrative APIs are exposed on different ports. Public APIs can face the public internet without any protection while administrative APIs should never be exposed without prior authorization. To protect the administative API port you should use something like Nginx, Ory Oathkeeper, or any other technology capable of authorizing incoming requests. 
 *
 * The version of the OpenAPI document: v0.6.0-alpha.15
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
import java.util.ArrayList;
import java.util.List;
import sh.ory.kratos.model.PluginDevice;
import sh.ory.kratos.model.PluginMount;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for PluginSettings
 */
public class PluginSettingsTest {
    private final PluginSettings model = new PluginSettings();

    /**
     * Model tests for PluginSettings
     */
    @Test
    public void testPluginSettings() {
        // TODO: test PluginSettings
    }

    /**
     * Test the property 'args'
     */
    @Test
    public void argsTest() {
        // TODO: test args
    }

    /**
     * Test the property 'devices'
     */
    @Test
    public void devicesTest() {
        // TODO: test devices
    }

    /**
     * Test the property 'env'
     */
    @Test
    public void envTest() {
        // TODO: test env
    }

    /**
     * Test the property 'mounts'
     */
    @Test
    public void mountsTest() {
        // TODO: test mounts
    }

}
