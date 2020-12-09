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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;
import sh.ory.kratos.model.Message;
import sh.ory.kratos.model.RegistrationFlowMethod;

/**
 * RegistrationFlow
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-09T11:44:29.470520Z[GMT]")
public class RegistrationFlow {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private String active;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private OffsetDateTime expiresAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_ISSUED_AT = "issued_at";
  @SerializedName(SERIALIZED_NAME_ISSUED_AT)
  private OffsetDateTime issuedAt;

  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<Message> messages = null;

  public static final String SERIALIZED_NAME_METHODS = "methods";
  @SerializedName(SERIALIZED_NAME_METHODS)
  private Map<String, RegistrationFlowMethod> methods = new HashMap<String, RegistrationFlowMethod>();

  public static final String SERIALIZED_NAME_REQUEST_URL = "request_url";
  @SerializedName(SERIALIZED_NAME_REQUEST_URL)
  private String requestUrl;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public RegistrationFlow active(String active) {
    
    this.active = active;
    return this;
  }

   /**
   * and so on.
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "and so on.")

  public String getActive() {
    return active;
  }


  public void setActive(String active) {
    this.active = active;
  }


  public RegistrationFlow expiresAt(OffsetDateTime expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * ExpiresAt is the time (UTC) when the flow expires. If the user still wishes to log in, a new flow has to be initiated.
   * @return expiresAt
  **/
  @ApiModelProperty(required = true, value = "ExpiresAt is the time (UTC) when the flow expires. If the user still wishes to log in, a new flow has to be initiated.")

  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }


  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }


  public RegistrationFlow id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public RegistrationFlow issuedAt(OffsetDateTime issuedAt) {
    
    this.issuedAt = issuedAt;
    return this;
  }

   /**
   * IssuedAt is the time (UTC) when the flow occurred.
   * @return issuedAt
  **/
  @ApiModelProperty(required = true, value = "IssuedAt is the time (UTC) when the flow occurred.")

  public OffsetDateTime getIssuedAt() {
    return issuedAt;
  }


  public void setIssuedAt(OffsetDateTime issuedAt) {
    this.issuedAt = issuedAt;
  }


  public RegistrationFlow messages(List<Message> messages) {
    
    this.messages = messages;
    return this;
  }

  public RegistrationFlow addMessagesItem(Message messagesItem) {
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


  public RegistrationFlow methods(Map<String, RegistrationFlowMethod> methods) {
    
    this.methods = methods;
    return this;
  }

  public RegistrationFlow putMethodsItem(String key, RegistrationFlowMethod methodsItem) {
    this.methods.put(key, methodsItem);
    return this;
  }

   /**
   * Methods contains context for all enabled registration methods. If a registration flow has been processed, but for example the password is incorrect, this will contain error messages.
   * @return methods
  **/
  @ApiModelProperty(required = true, value = "Methods contains context for all enabled registration methods. If a registration flow has been processed, but for example the password is incorrect, this will contain error messages.")

  public Map<String, RegistrationFlowMethod> getMethods() {
    return methods;
  }


  public void setMethods(Map<String, RegistrationFlowMethod> methods) {
    this.methods = methods;
  }


  public RegistrationFlow requestUrl(String requestUrl) {
    
    this.requestUrl = requestUrl;
    return this;
  }

   /**
   * RequestURL is the initial URL that was requested from ORY Kratos. It can be used to forward information contained in the URL&#39;s path or query for example.
   * @return requestUrl
  **/
  @ApiModelProperty(required = true, value = "RequestURL is the initial URL that was requested from ORY Kratos. It can be used to forward information contained in the URL's path or query for example.")

  public String getRequestUrl() {
    return requestUrl;
  }


  public void setRequestUrl(String requestUrl) {
    this.requestUrl = requestUrl;
  }


  public RegistrationFlow type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The flow type can either be &#x60;api&#x60; or &#x60;browser&#x60;.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The flow type can either be `api` or `browser`.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistrationFlow registrationFlow = (RegistrationFlow) o;
    return Objects.equals(this.active, registrationFlow.active) &&
        Objects.equals(this.expiresAt, registrationFlow.expiresAt) &&
        Objects.equals(this.id, registrationFlow.id) &&
        Objects.equals(this.issuedAt, registrationFlow.issuedAt) &&
        Objects.equals(this.messages, registrationFlow.messages) &&
        Objects.equals(this.methods, registrationFlow.methods) &&
        Objects.equals(this.requestUrl, registrationFlow.requestUrl) &&
        Objects.equals(this.type, registrationFlow.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, expiresAt, id, issuedAt, messages, methods, requestUrl, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistrationFlow {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issuedAt: ").append(toIndentedString(issuedAt)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    methods: ").append(toIndentedString(methods)).append("\n");
    sb.append("    requestUrl: ").append(toIndentedString(requestUrl)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

