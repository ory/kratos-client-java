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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import sh.ory.kratos.model.PluginConfig;
import sh.ory.kratos.model.PluginSettings;

/**
 * Plugin A plugin for the Engine API
 */
@ApiModel(description = "Plugin A plugin for the Engine API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-10T17:21:54.396790269Z[Etc/UTC]")
public class Plugin {
  public static final String SERIALIZED_NAME_CONFIG = "Config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private PluginConfig config;

  public static final String SERIALIZED_NAME_ENABLED = "Enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PLUGIN_REFERENCE = "PluginReference";
  @SerializedName(SERIALIZED_NAME_PLUGIN_REFERENCE)
  private String pluginReference;

  public static final String SERIALIZED_NAME_SETTINGS = "Settings";
  @SerializedName(SERIALIZED_NAME_SETTINGS)
  private PluginSettings settings;


  public Plugin config(PluginConfig config) {
    
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @ApiModelProperty(required = true, value = "")

  public PluginConfig getConfig() {
    return config;
  }


  public void setConfig(PluginConfig config) {
    this.config = config;
  }


  public Plugin enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * True if the plugin is running. False if the plugin is not running, only installed.
   * @return enabled
  **/
  @ApiModelProperty(required = true, value = "True if the plugin is running. False if the plugin is not running, only installed.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public Plugin id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Plugin name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Plugin pluginReference(String pluginReference) {
    
    this.pluginReference = pluginReference;
    return this;
  }

   /**
   * plugin remote reference used to push/pull the plugin
   * @return pluginReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "plugin remote reference used to push/pull the plugin")

  public String getPluginReference() {
    return pluginReference;
  }


  public void setPluginReference(String pluginReference) {
    this.pluginReference = pluginReference;
  }


  public Plugin settings(PluginSettings settings) {
    
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @ApiModelProperty(required = true, value = "")

  public PluginSettings getSettings() {
    return settings;
  }


  public void setSettings(PluginSettings settings) {
    this.settings = settings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Plugin plugin = (Plugin) o;
    return Objects.equals(this.config, plugin.config) &&
        Objects.equals(this.enabled, plugin.enabled) &&
        Objects.equals(this.id, plugin.id) &&
        Objects.equals(this.name, plugin.name) &&
        Objects.equals(this.pluginReference, plugin.pluginReference) &&
        Objects.equals(this.settings, plugin.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, enabled, id, name, pluginReference, settings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Plugin {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pluginReference: ").append(toIndentedString(pluginReference)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

