/*
 * Ory Kratos
 * Welcome to the ORY Kratos HTTP API documentation!
 *
 * The version of the OpenAPI document: v0.5.5-alpha.1
 * 
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
import java.util.ArrayList;
import java.util.List;
import sh.ory.kratos.model.FormField;
import sh.ory.kratos.model.Message;

/**
 * LoginFlowMethodConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-09T11:44:29.470520Z[GMT]")
public class LoginFlowMethodConfig {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<FormField> fields = new ArrayList<FormField>();

  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<Message> messages = null;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public static final String SERIALIZED_NAME_PROVIDERS = "providers";
  @SerializedName(SERIALIZED_NAME_PROVIDERS)
  private List<FormField> providers = null;


  public LoginFlowMethodConfig action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * Action should be used as the form action URL &#x60;&lt;form action&#x3D;\&quot;{{ .Action }}\&quot; method&#x3D;\&quot;post\&quot;&gt;&#x60;.
   * @return action
  **/
  @ApiModelProperty(required = true, value = "Action should be used as the form action URL `<form action=\"{{ .Action }}\" method=\"post\">`.")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public LoginFlowMethodConfig fields(List<FormField> fields) {
    
    this.fields = fields;
    return this;
  }

  public LoginFlowMethodConfig addFieldsItem(FormField fieldsItem) {
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Fields contains multiple fields
   * @return fields
  **/
  @ApiModelProperty(required = true, value = "Fields contains multiple fields")

  public List<FormField> getFields() {
    return fields;
  }


  public void setFields(List<FormField> fields) {
    this.fields = fields;
  }


  public LoginFlowMethodConfig messages(List<Message> messages) {
    
    this.messages = messages;
    return this;
  }

  public LoginFlowMethodConfig addMessagesItem(Message messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<Message>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Get messages
   * @return messages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Message> getMessages() {
    return messages;
  }


  public void setMessages(List<Message> messages) {
    this.messages = messages;
  }


  public LoginFlowMethodConfig method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Method is the form method (e.g. POST)
   * @return method
  **/
  @ApiModelProperty(required = true, value = "Method is the form method (e.g. POST)")

  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  public LoginFlowMethodConfig providers(List<FormField> providers) {
    
    this.providers = providers;
    return this;
  }

  public LoginFlowMethodConfig addProvidersItem(FormField providersItem) {
    if (this.providers == null) {
      this.providers = new ArrayList<FormField>();
    }
    this.providers.add(providersItem);
    return this;
  }

   /**
   * Providers is set for the \&quot;oidc\&quot; flow method.
   * @return providers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Providers is set for the \"oidc\" flow method.")

  public List<FormField> getProviders() {
    return providers;
  }


  public void setProviders(List<FormField> providers) {
    this.providers = providers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginFlowMethodConfig loginFlowMethodConfig = (LoginFlowMethodConfig) o;
    return Objects.equals(this.action, loginFlowMethodConfig.action) &&
        Objects.equals(this.fields, loginFlowMethodConfig.fields) &&
        Objects.equals(this.messages, loginFlowMethodConfig.messages) &&
        Objects.equals(this.method, loginFlowMethodConfig.method) &&
        Objects.equals(this.providers, loginFlowMethodConfig.providers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, fields, messages, method, providers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginFlowMethodConfig {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

