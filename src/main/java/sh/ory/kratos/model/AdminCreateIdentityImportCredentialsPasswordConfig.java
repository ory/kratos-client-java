/*
 * Ory Kratos API
 * Documentation for all public and administrative Ory Kratos APIs. Public and administrative APIs are exposed on different ports. Public APIs can face the public internet without any protection while administrative APIs should never be exposed without prior authorization. To protect the administative API port you should use something like Nginx, Ory Oathkeeper, or any other technology capable of authorizing incoming requests. 
 *
 * The version of the OpenAPI document: v0.10.1
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

/**
 * AdminCreateIdentityImportCredentialsPasswordConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T11:19:13.300472677Z[Etc/UTC]")
public class AdminCreateIdentityImportCredentialsPasswordConfig {
  public static final String SERIALIZED_NAME_HASHED_PASSWORD = "hashed_password";
  @SerializedName(SERIALIZED_NAME_HASHED_PASSWORD)
  private String hashedPassword;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public AdminCreateIdentityImportCredentialsPasswordConfig() { 
  }

  public AdminCreateIdentityImportCredentialsPasswordConfig hashedPassword(String hashedPassword) {
    
    this.hashedPassword = hashedPassword;
    return this;
  }

   /**
   * The hashed password in [PHC format]( https://www.ory.sh/docs/kratos/concepts/credentials/username-email-password#hashed-password-format)
   * @return hashedPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The hashed password in [PHC format]( https://www.ory.sh/docs/kratos/concepts/credentials/username-email-password#hashed-password-format)")

  public String getHashedPassword() {
    return hashedPassword;
  }


  public void setHashedPassword(String hashedPassword) {
    this.hashedPassword = hashedPassword;
  }


  public AdminCreateIdentityImportCredentialsPasswordConfig password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * The password in plain text if no hash is available.
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The password in plain text if no hash is available.")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminCreateIdentityImportCredentialsPasswordConfig adminCreateIdentityImportCredentialsPasswordConfig = (AdminCreateIdentityImportCredentialsPasswordConfig) o;
    return Objects.equals(this.hashedPassword, adminCreateIdentityImportCredentialsPasswordConfig.hashedPassword) &&
        Objects.equals(this.password, adminCreateIdentityImportCredentialsPasswordConfig.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashedPassword, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminCreateIdentityImportCredentialsPasswordConfig {\n");
    sb.append("    hashedPassword: ").append(toIndentedString(hashedPassword)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
