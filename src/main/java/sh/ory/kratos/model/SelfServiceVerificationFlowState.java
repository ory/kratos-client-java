/*
 * Ory Kratos API
 * Documentation for all public and administrative Ory Kratos APIs. Public and administrative APIs are exposed on different ports. Public APIs can face the public internet without any protection while administrative APIs should never be exposed without prior authorization. To protect the administative API port you should use something like Nginx, Ory Oathkeeper, or any other technology capable of authorizing incoming requests. 
 *
 * The version of the OpenAPI document: v0.7.3-alpha.1
 * Contact: hi@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.kratos.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The state represents the state of the verification flow.  choose_method: ask the user to choose a method (e.g. recover account via email) sent_email: the email has been sent to the user passed_challenge: the request was successful and the recovery challenge was passed.
 */
@JsonAdapter(SelfServiceVerificationFlowState.Adapter.class)
public enum SelfServiceVerificationFlowState {
  
  CHOOSE_METHOD("choose_method"),
  
  SENT_EMAIL("sent_email"),
  
  PASSED_CHALLENGE("passed_challenge");

  private String value;

  SelfServiceVerificationFlowState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SelfServiceVerificationFlowState fromValue(String value) {
    for (SelfServiceVerificationFlowState b : SelfServiceVerificationFlowState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<SelfServiceVerificationFlowState> {
    @Override
    public void write(final JsonWriter jsonWriter, final SelfServiceVerificationFlowState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SelfServiceVerificationFlowState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SelfServiceVerificationFlowState.fromValue(value);
    }
  }
}

