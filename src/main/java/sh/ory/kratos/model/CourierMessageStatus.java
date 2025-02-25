/*
 * Ory Identities API
 * This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more. 
 *
 * The version of the OpenAPI document: v1.3.6-alpha.1
 * Contact: office@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.kratos.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * A Message&#39;s Status
 */
@JsonAdapter(CourierMessageStatus.Adapter.class)
public enum CourierMessageStatus {
  
  QUEUED("queued"),
  
  SENT("sent"),
  
  PROCESSING("processing"),
  
  ABANDONED("abandoned");

  private String value;

  CourierMessageStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CourierMessageStatus fromValue(String value) {
    for (CourierMessageStatus b : CourierMessageStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CourierMessageStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final CourierMessageStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CourierMessageStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CourierMessageStatus.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    CourierMessageStatus.fromValue(value);
  }
}

