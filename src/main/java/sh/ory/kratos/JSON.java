/*
 * Ory Identities API
 * This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more. 
 *
 * The version of the OpenAPI document: v1.0.0
 * Contact: office@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.kratos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
                .registerTypeSelector(sh.ory.kratos.model.ContinueWith.class, new TypeSelector<sh.ory.kratos.model.ContinueWith>() {
                    @Override
                    public Class<? extends sh.ory.kratos.model.ContinueWith> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("continueWithSetOrySessionToken", sh.ory.kratos.model.ContinueWithSetOrySessionToken.class);
                        classByDiscriminatorValue.put("continueWithVerificationUi", sh.ory.kratos.model.ContinueWithVerificationUi.class);
                        classByDiscriminatorValue.put("set_ory_session_token", sh.ory.kratos.model.ContinueWithSetOrySessionToken.class);
                        classByDiscriminatorValue.put("show_verification_ui", sh.ory.kratos.model.ContinueWithVerificationUi.class);
                        classByDiscriminatorValue.put("continueWith", sh.ory.kratos.model.ContinueWith.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "action"));
                    }
          })
                .registerTypeSelector(sh.ory.kratos.model.UiNodeAttributes.class, new TypeSelector<sh.ory.kratos.model.UiNodeAttributes>() {
                    @Override
                    public Class<? extends sh.ory.kratos.model.UiNodeAttributes> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("a", sh.ory.kratos.model.UiNodeAnchorAttributes.class);
                        classByDiscriminatorValue.put("img", sh.ory.kratos.model.UiNodeImageAttributes.class);
                        classByDiscriminatorValue.put("input", sh.ory.kratos.model.UiNodeInputAttributes.class);
                        classByDiscriminatorValue.put("script", sh.ory.kratos.model.UiNodeScriptAttributes.class);
                        classByDiscriminatorValue.put("text", sh.ory.kratos.model.UiNodeTextAttributes.class);
                        classByDiscriminatorValue.put("uiNodeAnchorAttributes", sh.ory.kratos.model.UiNodeAnchorAttributes.class);
                        classByDiscriminatorValue.put("uiNodeImageAttributes", sh.ory.kratos.model.UiNodeImageAttributes.class);
                        classByDiscriminatorValue.put("uiNodeInputAttributes", sh.ory.kratos.model.UiNodeInputAttributes.class);
                        classByDiscriminatorValue.put("uiNodeScriptAttributes", sh.ory.kratos.model.UiNodeScriptAttributes.class);
                        classByDiscriminatorValue.put("uiNodeTextAttributes", sh.ory.kratos.model.UiNodeTextAttributes.class);
                        classByDiscriminatorValue.put("uiNodeAttributes", sh.ory.kratos.model.UiNodeAttributes.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "node_type"));
                    }
          })
                .registerTypeSelector(sh.ory.kratos.model.UpdateLoginFlowBody.class, new TypeSelector<sh.ory.kratos.model.UpdateLoginFlowBody>() {
                    @Override
                    public Class<? extends sh.ory.kratos.model.UpdateLoginFlowBody> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("lookup_secret", sh.ory.kratos.model.UpdateLoginFlowWithLookupSecretMethod.class);
                        classByDiscriminatorValue.put("oidc", sh.ory.kratos.model.UpdateLoginFlowWithOidcMethod.class);
                        classByDiscriminatorValue.put("password", sh.ory.kratos.model.UpdateLoginFlowWithPasswordMethod.class);
                        classByDiscriminatorValue.put("totp", sh.ory.kratos.model.UpdateLoginFlowWithTotpMethod.class);
                        classByDiscriminatorValue.put("updateLoginFlowWithLookupSecretMethod", sh.ory.kratos.model.UpdateLoginFlowWithLookupSecretMethod.class);
                        classByDiscriminatorValue.put("updateLoginFlowWithOidcMethod", sh.ory.kratos.model.UpdateLoginFlowWithOidcMethod.class);
                        classByDiscriminatorValue.put("updateLoginFlowWithPasswordMethod", sh.ory.kratos.model.UpdateLoginFlowWithPasswordMethod.class);
                        classByDiscriminatorValue.put("updateLoginFlowWithTotpMethod", sh.ory.kratos.model.UpdateLoginFlowWithTotpMethod.class);
                        classByDiscriminatorValue.put("updateLoginFlowWithWebAuthnMethod", sh.ory.kratos.model.UpdateLoginFlowWithWebAuthnMethod.class);
                        classByDiscriminatorValue.put("webauthn", sh.ory.kratos.model.UpdateLoginFlowWithWebAuthnMethod.class);
                        classByDiscriminatorValue.put("updateLoginFlowBody", sh.ory.kratos.model.UpdateLoginFlowBody.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "method"));
                    }
          })
                .registerTypeSelector(sh.ory.kratos.model.UpdateRecoveryFlowBody.class, new TypeSelector<sh.ory.kratos.model.UpdateRecoveryFlowBody>() {
                    @Override
                    public Class<? extends sh.ory.kratos.model.UpdateRecoveryFlowBody> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("code", sh.ory.kratos.model.UpdateRecoveryFlowWithCodeMethod.class);
                        classByDiscriminatorValue.put("link", sh.ory.kratos.model.UpdateRecoveryFlowWithLinkMethod.class);
                        classByDiscriminatorValue.put("updateRecoveryFlowWithCodeMethod", sh.ory.kratos.model.UpdateRecoveryFlowWithCodeMethod.class);
                        classByDiscriminatorValue.put("updateRecoveryFlowWithLinkMethod", sh.ory.kratos.model.UpdateRecoveryFlowWithLinkMethod.class);
                        classByDiscriminatorValue.put("updateRecoveryFlowBody", sh.ory.kratos.model.UpdateRecoveryFlowBody.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "method"));
                    }
          })
                .registerTypeSelector(sh.ory.kratos.model.UpdateRegistrationFlowBody.class, new TypeSelector<sh.ory.kratos.model.UpdateRegistrationFlowBody>() {
                    @Override
                    public Class<? extends sh.ory.kratos.model.UpdateRegistrationFlowBody> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("oidc", sh.ory.kratos.model.UpdateRegistrationFlowWithOidcMethod.class);
                        classByDiscriminatorValue.put("password", sh.ory.kratos.model.UpdateRegistrationFlowWithPasswordMethod.class);
                        classByDiscriminatorValue.put("updateRegistrationFlowWithOidcMethod", sh.ory.kratos.model.UpdateRegistrationFlowWithOidcMethod.class);
                        classByDiscriminatorValue.put("updateRegistrationFlowWithPasswordMethod", sh.ory.kratos.model.UpdateRegistrationFlowWithPasswordMethod.class);
                        classByDiscriminatorValue.put("updateRegistrationFlowWithWebAuthnMethod", sh.ory.kratos.model.UpdateRegistrationFlowWithWebAuthnMethod.class);
                        classByDiscriminatorValue.put("webauthn", sh.ory.kratos.model.UpdateRegistrationFlowWithWebAuthnMethod.class);
                        classByDiscriminatorValue.put("updateRegistrationFlowBody", sh.ory.kratos.model.UpdateRegistrationFlowBody.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "method"));
                    }
          })
                .registerTypeSelector(sh.ory.kratos.model.UpdateSettingsFlowBody.class, new TypeSelector<sh.ory.kratos.model.UpdateSettingsFlowBody>() {
                    @Override
                    public Class<? extends sh.ory.kratos.model.UpdateSettingsFlowBody> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("lookup_secret", sh.ory.kratos.model.UpdateSettingsFlowWithLookupMethod.class);
                        classByDiscriminatorValue.put("oidc", sh.ory.kratos.model.UpdateSettingsFlowWithOidcMethod.class);
                        classByDiscriminatorValue.put("password", sh.ory.kratos.model.UpdateSettingsFlowWithPasswordMethod.class);
                        classByDiscriminatorValue.put("profile", sh.ory.kratos.model.UpdateSettingsFlowWithProfileMethod.class);
                        classByDiscriminatorValue.put("totp", sh.ory.kratos.model.UpdateSettingsFlowWithTotpMethod.class);
                        classByDiscriminatorValue.put("updateSettingsFlowWithLookupMethod", sh.ory.kratos.model.UpdateSettingsFlowWithLookupMethod.class);
                        classByDiscriminatorValue.put("updateSettingsFlowWithOidcMethod", sh.ory.kratos.model.UpdateSettingsFlowWithOidcMethod.class);
                        classByDiscriminatorValue.put("updateSettingsFlowWithPasswordMethod", sh.ory.kratos.model.UpdateSettingsFlowWithPasswordMethod.class);
                        classByDiscriminatorValue.put("updateSettingsFlowWithProfileMethod", sh.ory.kratos.model.UpdateSettingsFlowWithProfileMethod.class);
                        classByDiscriminatorValue.put("updateSettingsFlowWithTotpMethod", sh.ory.kratos.model.UpdateSettingsFlowWithTotpMethod.class);
                        classByDiscriminatorValue.put("updateSettingsFlowWithWebAuthnMethod", sh.ory.kratos.model.UpdateSettingsFlowWithWebAuthnMethod.class);
                        classByDiscriminatorValue.put("webauthn", sh.ory.kratos.model.UpdateSettingsFlowWithWebAuthnMethod.class);
                        classByDiscriminatorValue.put("updateSettingsFlowBody", sh.ory.kratos.model.UpdateSettingsFlowBody.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "method"));
                    }
          })
                .registerTypeSelector(sh.ory.kratos.model.UpdateVerificationFlowBody.class, new TypeSelector<sh.ory.kratos.model.UpdateVerificationFlowBody>() {
                    @Override
                    public Class<? extends sh.ory.kratos.model.UpdateVerificationFlowBody> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("code", sh.ory.kratos.model.UpdateVerificationFlowWithCodeMethod.class);
                        classByDiscriminatorValue.put("link", sh.ory.kratos.model.UpdateVerificationFlowWithLinkMethod.class);
                        classByDiscriminatorValue.put("updateVerificationFlowWithCodeMethod", sh.ory.kratos.model.UpdateVerificationFlowWithCodeMethod.class);
                        classByDiscriminatorValue.put("updateVerificationFlowWithLinkMethod", sh.ory.kratos.model.UpdateVerificationFlowWithLinkMethod.class);
                        classByDiscriminatorValue.put("updateVerificationFlowBody", sh.ory.kratos.model.UpdateVerificationFlowBody.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "method"));
                    }
          })
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    {
        GsonBuilder gsonBuilder = createGson();
        gsonBuilder.registerTypeAdapter(Date.class, dateTypeAdapter);
        gsonBuilder.registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter);
        gsonBuilder.registerTypeAdapter(LocalDate.class, localDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(byte[].class, byteArrayAdapter);
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.BatchPatchIdentitiesResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.ContinueWith.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.ContinueWithSetOrySessionToken.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.ContinueWithVerificationUi.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.ContinueWithVerificationUiFlow.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.CreateIdentityBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.CreateRecoveryCodeForIdentityBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.CreateRecoveryLinkForIdentityBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.DeleteMySessionsCount.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.ErrorAuthenticatorAssuranceLevelNotSatisfied.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.ErrorBrowserLocationChangeRequired.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.ErrorFlowReplaced.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.ErrorGeneric.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.FlowError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.GenericError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.GetVersion200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.HealthNotReadyStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.HealthStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.Identity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.IdentityCredentials.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.IdentityCredentialsOidc.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.IdentityCredentialsOidcProvider.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.IdentityCredentialsPassword.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.IdentityPatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.IdentityPatchResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.IdentitySchemaContainer.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.IdentityWithCredentials.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.IdentityWithCredentialsOidc.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.IdentityWithCredentialsOidcConfig.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.IdentityWithCredentialsOidcConfigProvider.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.IdentityWithCredentialsPassword.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.IdentityWithCredentialsPasswordConfig.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.IsAlive200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.IsReady503Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.JsonPatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.LoginFlow.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.LogoutFlow.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.Message.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.MessageDispatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.NeedsPrivilegedSessionError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.OAuth2Client.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.OAuth2ConsentRequestOpenIDConnectContext.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.OAuth2LoginRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.Pagination.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.PatchIdentitiesBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.PerformNativeLogoutBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.RecoveryCodeForIdentity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.RecoveryFlow.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.RecoveryIdentityAddress.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.RecoveryLinkForIdentity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.RegistrationFlow.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.SelfServiceFlowExpiredError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.Session.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.SessionAuthenticationMethod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.SessionDevice.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.SettingsFlow.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.SuccessfulCodeExchangeResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.SuccessfulNativeLogin.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.SuccessfulNativeRegistration.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.TokenPagination.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.TokenPaginationHeaders.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.UiContainer.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.UiNode.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.UiNodeAnchorAttributes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.UiNodeAttributes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.UiNodeImageAttributes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.UiNodeInputAttributes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.UiNodeMeta.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.UiNodeScriptAttributes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.UiNodeTextAttributes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.UiText.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.UpdateIdentityBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.UpdateLoginFlowBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.UpdateLoginFlowWithLookupSecretMethod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.UpdateLoginFlowWithOidcMethod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.UpdateLoginFlowWithPasswordMethod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.UpdateLoginFlowWithTotpMethod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.UpdateLoginFlowWithWebAuthnMethod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.UpdateRecoveryFlowBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.UpdateRecoveryFlowWithCodeMethod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.UpdateRecoveryFlowWithLinkMethod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.UpdateRegistrationFlowBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.UpdateRegistrationFlowWithOidcMethod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.UpdateRegistrationFlowWithPasswordMethod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.UpdateRegistrationFlowWithWebAuthnMethod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.UpdateSettingsFlowBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.UpdateSettingsFlowWithLookupMethod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.UpdateSettingsFlowWithOidcMethod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.UpdateSettingsFlowWithPasswordMethod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.UpdateSettingsFlowWithProfileMethod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.UpdateSettingsFlowWithTotpMethod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.UpdateSettingsFlowWithWebAuthnMethod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.UpdateVerificationFlowBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.UpdateVerificationFlowWithCodeMethod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.UpdateVerificationFlowWithLinkMethod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.VerifiableIdentityAddress.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.VerificationFlow.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new sh.ory.kratos.model.Version.CustomTypeAdapterFactory());
        gson = gsonBuilder.create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}
