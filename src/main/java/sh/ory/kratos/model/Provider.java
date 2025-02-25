/*
 * Ory Identities API
 * This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more. 
 *
 * The version of the OpenAPI document: v1.3.7
 * Contact: office@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.kratos.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import sh.ory.kratos.JSON;

/**
 * Provider
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-25T14:46:21.038410333Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class Provider {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_CONFIG_URL = "config_url";
  @SerializedName(SERIALIZED_NAME_CONFIG_URL)
  private String configUrl;

  public static final String SERIALIZED_NAME_DOMAIN_HINT = "domain_hint";
  @SerializedName(SERIALIZED_NAME_DOMAIN_HINT)
  private String domainHint;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<String> fields = new ArrayList<>();

  public static final String SERIALIZED_NAME_LOGIN_HINT = "login_hint";
  @SerializedName(SERIALIZED_NAME_LOGIN_HINT)
  private String loginHint;

  public static final String SERIALIZED_NAME_NONCE = "nonce";
  @SerializedName(SERIALIZED_NAME_NONCE)
  private String nonce;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private Map<String, String> parameters = new HashMap<>();

  public Provider() {
  }

  public Provider clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * The RP&#39;s client identifier, issued by the IdP.
   * @return clientId
   */
  @javax.annotation.Nullable
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public Provider configUrl(String configUrl) {
    this.configUrl = configUrl;
    return this;
  }

  /**
   * A full path of the IdP config file.
   * @return configUrl
   */
  @javax.annotation.Nullable
  public String getConfigUrl() {
    return configUrl;
  }

  public void setConfigUrl(String configUrl) {
    this.configUrl = configUrl;
  }


  public Provider domainHint(String domainHint) {
    this.domainHint = domainHint;
    return this;
  }

  /**
   * By specifying one of domain_hints values provided by the accounts endpoints, the FedCM dialog selectively shows the specified account.
   * @return domainHint
   */
  @javax.annotation.Nullable
  public String getDomainHint() {
    return domainHint;
  }

  public void setDomainHint(String domainHint) {
    this.domainHint = domainHint;
  }


  public Provider fields(List<String> fields) {
    this.fields = fields;
    return this;
  }

  public Provider addFieldsItem(String fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * Array of strings that specifies the user information (\&quot;name\&quot;, \&quot; email\&quot;, \&quot;picture\&quot;) that RP needs IdP to share with them.  Note: Field API is supported by Chrome 132 and later.
   * @return fields
   */
  @javax.annotation.Nullable
  public List<String> getFields() {
    return fields;
  }

  public void setFields(List<String> fields) {
    this.fields = fields;
  }


  public Provider loginHint(String loginHint) {
    this.loginHint = loginHint;
    return this;
  }

  /**
   * By specifying one of login_hints values provided by the accounts endpoints, the FedCM dialog selectively shows the specified account.
   * @return loginHint
   */
  @javax.annotation.Nullable
  public String getLoginHint() {
    return loginHint;
  }

  public void setLoginHint(String loginHint) {
    this.loginHint = loginHint;
  }


  public Provider nonce(String nonce) {
    this.nonce = nonce;
    return this;
  }

  /**
   * A random string to ensure the response is issued for this specific request. Prevents replay attacks.
   * @return nonce
   */
  @javax.annotation.Nullable
  public String getNonce() {
    return nonce;
  }

  public void setNonce(String nonce) {
    this.nonce = nonce;
  }


  public Provider parameters(Map<String, String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Provider putParametersItem(String key, String parametersItem) {
    if (this.parameters == null) {
      this.parameters = new HashMap<>();
    }
    this.parameters.put(key, parametersItem);
    return this;
  }

  /**
   * Custom object that allows to specify additional key-value parameters: scope: A string value containing additional permissions that RP needs to request, for example \&quot; drive.readonly calendar.readonly\&quot; nonce: A random string to ensure the response is issued for this specific request. Prevents replay attacks.  Other custom key-value parameters.  Note: parameters is supported from Chrome 132.
   * @return parameters
   */
  @javax.annotation.Nullable
  public Map<String, String> getParameters() {
    return parameters;
  }

  public void setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the Provider instance itself
   */
  public Provider putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Provider provider = (Provider) o;
    return Objects.equals(this.clientId, provider.clientId) &&
        Objects.equals(this.configUrl, provider.configUrl) &&
        Objects.equals(this.domainHint, provider.domainHint) &&
        Objects.equals(this.fields, provider.fields) &&
        Objects.equals(this.loginHint, provider.loginHint) &&
        Objects.equals(this.nonce, provider.nonce) &&
        Objects.equals(this.parameters, provider.parameters)&&
        Objects.equals(this.additionalProperties, provider.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, configUrl, domainHint, fields, loginHint, nonce, parameters, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Provider {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    configUrl: ").append(toIndentedString(configUrl)).append("\n");
    sb.append("    domainHint: ").append(toIndentedString(domainHint)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    loginHint: ").append(toIndentedString(loginHint)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("client_id");
    openapiFields.add("config_url");
    openapiFields.add("domain_hint");
    openapiFields.add("fields");
    openapiFields.add("login_hint");
    openapiFields.add("nonce");
    openapiFields.add("parameters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Provider
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Provider.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Provider is not found in the empty JSON string", Provider.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("client_id") != null && !jsonObj.get("client_id").isJsonNull()) && !jsonObj.get("client_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_id").toString()));
      }
      if ((jsonObj.get("config_url") != null && !jsonObj.get("config_url").isJsonNull()) && !jsonObj.get("config_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `config_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("config_url").toString()));
      }
      if ((jsonObj.get("domain_hint") != null && !jsonObj.get("domain_hint").isJsonNull()) && !jsonObj.get("domain_hint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `domain_hint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("domain_hint").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("fields") != null && !jsonObj.get("fields").isJsonNull() && !jsonObj.get("fields").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `fields` to be an array in the JSON string but got `%s`", jsonObj.get("fields").toString()));
      }
      if ((jsonObj.get("login_hint") != null && !jsonObj.get("login_hint").isJsonNull()) && !jsonObj.get("login_hint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `login_hint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("login_hint").toString()));
      }
      if ((jsonObj.get("nonce") != null && !jsonObj.get("nonce").isJsonNull()) && !jsonObj.get("nonce").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nonce` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nonce").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Provider.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Provider' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Provider> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Provider.class));

       return (TypeAdapter<T>) new TypeAdapter<Provider>() {
           @Override
           public void write(JsonWriter out, Provider value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public Provider read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             Provider instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Provider given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Provider
   * @throws IOException if the JSON string is invalid with respect to Provider
   */
  public static Provider fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Provider.class);
  }

  /**
   * Convert an instance of Provider to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

