/*
 * Belvo API Docs
 * # Introduction  Belvo is an open banking API for Latin America that allows companies to access banking and fiscal information in a secure as well as agile way.  Through our API, you can access:   - **Bank information** such as account information, real-time balance, historical transactions, and account owner identification.  - **Fiscal information** such as received and sent invoices and tax returns.   <img src=\"https://files.readme.io/acf27d3-belvo_pipes.png\" alt=\"fiscal-endpoints\">   In this API reference you'll find all the information you need about each  endpoint and resource.   <div style=\"background-color:#f4f6f8; border-left: 6px solid #4CAF50;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\">  <strong>Tip: </strong> Make sure that you also check out our Developer Portal for guides on <a href=\"https://developers.belvo.com/docs/get-started-in-5-minutes\" target=\"_blank\">how to get started</a>, using our <a href=\"https://developers.belvo.com/docs/test-in-sandbox\" target=\"_blank\">Sandbox environment</a>, as well as how to <a href=\"https://developers.belvo.com/docs/connect-widget\" target=\"_blank\">integrate the widget</a> or use our <a href=\"https://developers.belvo.com/docs/quickstart-application\" target=\"_blank\">quickstart application</a>.  </div>   ## Environment  We currently offer three environments: sandbox, development, and production.   When using our SDKs, make sure to use the **Alias** (and not the Base URL).   | Environment | Purpose | Access | |-----------|-------|-------| | **Sandbox** | The [Sandbox environment](https://developers.belvo.com/docs/test-in-sandbox) is dedicated for your testing and development phases. In this environment, you can create links without real credentials and you can pull test data from all endpoints. **⚠️The sandbox environment is refreshed frequently and your test data can be updated or deleted.** | Base URL (cURL): https://sandbox.belvo.com/ <br><br>Alias (SDKs): sandbox| |**Development**|The Development environment is dedicated for testing with real credentials and institutions with real-world institutions. You can create up to 25 links for free in this environment.| Base URL (cURL): https://development.belvo.com/ <br><br>Alias (SDKs): development | | **Production** | The Production environment is dedicated for live applications with real connections to institutions. In this environment, you will need real credentials to create links and you will pull real data from the institutions.| Base URL (cURL): https://api.belvo.com/ <br><br>Alias (SDKs): production|   For each environment, you'll need to [generate separate API keys](https://developers.belvo.com/docs/get-your-belvo-api-keys).   ## Response codes   We use the following HTTP status code in the response depending on the success or failure:   | Status Code | Description | |-----------|-------| | `200` | ✅ **Success** - The content is available in the response body. | | `201` | ✅ **Success** - The content was created successfully on Belvo. | | `204` | ✅ **Success** - No content to return. | | `400` | ❌ **Bad Request Error** - Request returned an error, detail in content.| | `401` | ❌ **Unauthorized** - The Belvo credentials provided are not valid.| | `404` | ❌ **Not Found** - The resource you try to access cannot be found.| | `405` | ❌ **Method Not Allowed** - The HTTP method you are using is not accepted for this resource.| | `408` | ❌ **Request Timeout** - The request timed out and was terminated by the server.| | `428` | ❌ **MFA Token Required** - MFA token was required by the institution to connect. | | `500` | ❌ **Internal Server Error** - The detail of the error is available in the response body.|   ## Error handling   ### Error messages   Belvo API errors are returned in JSON format. For example, an error might look like this:   ```json  [     {       \"request_id\": \"a6e1c493d7a29d91aed4338e6fcf077d\",       \"message\": \"This field is required.\",       \"code\": \"required\",       \"field\": \"link\"     } ]  ```   Typically, an error response will have the following parameters:  - `request_id`: a unique ID for the request, you should share it with the Belvo support team for investigations.  - `message`: human-readable description of the error.  - `code`: a unique code for the error. Check the table below to see how to handle each error code.  - `field` *(optional)*: The specific field in the request body that has an issue.    ### Request identifier  When you need help with a specific error, add the request identifier (`request_id`) in your message to the Belvo support team. This will speed up investigations and get you back up and running in no time at all.   ### Error codes and troubleshooting   For a full list of errors and how to troubleshoot them, please see our dedicated [Error handling articles](https://developers.belvo.com/docs/integration-overview#error-handling) in our DevPortal.    ### Retry policy   Please see our recommended [retry policies](https://developers.belvo.com/docs/integration-overview#error-retry-policy) in the DevPortal. 
 *
 * The version of the OpenAPI document: 1.35.0
 * Contact: support@belvo.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.belvo.client.model;

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
import java.util.UUID;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.belvo.client.JSON;

/**
 * Object with required fields to fill information in the payment intent object. The information you need to send through depends on the next step Belvo returns in the response.
 */
@ApiModel(description = "Object with required fields to fill information in the payment intent object. The information you need to send through depends on the next step Belvo returns in the response.")
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PatchPaymentMethodDetailsPse {
  public static final String SERIALIZED_NAME_PAYER_INSTITUTION = "payer_institution";
  @SerializedName(SERIALIZED_NAME_PAYER_INSTITUTION)
  private UUID payerInstitution;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PAYER_TOKEN = "payer_token";
  @SerializedName(SERIALIZED_NAME_PAYER_TOKEN)
  private String payerToken;

  public static final String SERIALIZED_NAME_PAYER_BANK_ACCOUNT = "payer_bank_account";
  @SerializedName(SERIALIZED_NAME_PAYER_BANK_ACCOUNT)
  private UUID payerBankAccount;

  public PatchPaymentMethodDetailsPse() {
  }

  public PatchPaymentMethodDetailsPse payerInstitution(UUID payerInstitution) {
    
    
    this.payerInstitution = payerInstitution;
    return this;
  }

   /**
   * Belvo&#39;s unique identifier for the payer’s institution.  **Note**: You need to send through this information after you received the &#x60;pse_display_payment_method_information&#x60; next step in the payment intent.
   * @return payerInstitution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "db201c6a-e0ee-4caa-92d6-72b480d6d86f", value = "Belvo's unique identifier for the payer’s institution.  **Note**: You need to send through this information after you received the `pse_display_payment_method_information` next step in the payment intent.")

  public UUID getPayerInstitution() {
    return payerInstitution;
  }


  public void setPayerInstitution(UUID payerInstitution) {
    
    this.payerInstitution = payerInstitution;
  }


  public PatchPaymentMethodDetailsPse username(String username) {
    
    
    this.username = username;
    return this;
  }

   /**
   * The username used to log in to the institution.  **Note**: You need to send through this information after you received the &#x60;pse_display_credentials_required&#x60; next step in the payment intent.
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "username", value = "The username used to log in to the institution.  **Note**: You need to send through this information after you received the `pse_display_credentials_required` next step in the payment intent.")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    
    this.username = username;
  }


  public PatchPaymentMethodDetailsPse password(String password) {
    
    
    this.password = password;
    return this;
  }

   /**
   * The password used to log in to the institution.  **Note**: You need to send through this information after you received the &#x60;pse_display_credentials_required&#x60; next step in the payment intent.
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "The password used to log in to the institution.  **Note**: You need to send through this information after you received the `pse_display_credentials_required` next step in the payment intent.")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    
    this.password = password;
  }


  public PatchPaymentMethodDetailsPse payerToken(String payerToken) {
    
    
    this.payerToken = payerToken;
    return this;
  }

   /**
   * The MFA token generated by the institution and required to continue the payment flow.  **Note**: You need to send through this information if you received the &#x60;pse_display_token_required&#x60; next step in the payment intent.
   * @return payerToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "The MFA token generated by the institution and required to continue the payment flow.  **Note**: You need to send through this information if you received the `pse_display_token_required` next step in the payment intent.")

  public String getPayerToken() {
    return payerToken;
  }


  public void setPayerToken(String payerToken) {
    
    this.payerToken = payerToken;
  }


  public PatchPaymentMethodDetailsPse payerBankAccount(UUID payerBankAccount) {
    
    
    this.payerBankAccount = payerBankAccount;
    return this;
  }

   /**
   * Belvo&#39;s unique identifier for the payer’s bank account.  **Note**: You need to send through this information after you received the &#x60;pse_display_customer_bank_accounts&#x60; next step in the payment intent.
   * @return payerBankAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "db201c6a-e0ee-4caa-92d6-72b480d6d86f", value = "Belvo's unique identifier for the payer’s bank account.  **Note**: You need to send through this information after you received the `pse_display_customer_bank_accounts` next step in the payment intent.")

  public UUID getPayerBankAccount() {
    return payerBankAccount;
  }


  public void setPayerBankAccount(UUID payerBankAccount) {
    
    this.payerBankAccount = payerBankAccount;
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
   * @return the PatchPaymentMethodDetailsPse instance itself
   */
  public PatchPaymentMethodDetailsPse putAdditionalProperty(String key, Object value) {
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
    PatchPaymentMethodDetailsPse patchPaymentMethodDetailsPse = (PatchPaymentMethodDetailsPse) o;
    return Objects.equals(this.payerInstitution, patchPaymentMethodDetailsPse.payerInstitution) &&
        Objects.equals(this.username, patchPaymentMethodDetailsPse.username) &&
        Objects.equals(this.password, patchPaymentMethodDetailsPse.password) &&
        Objects.equals(this.payerToken, patchPaymentMethodDetailsPse.payerToken) &&
        Objects.equals(this.payerBankAccount, patchPaymentMethodDetailsPse.payerBankAccount)&&
        Objects.equals(this.additionalProperties, patchPaymentMethodDetailsPse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payerInstitution, username, password, payerToken, payerBankAccount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchPaymentMethodDetailsPse {\n");
    sb.append("    payerInstitution: ").append(toIndentedString(payerInstitution)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    payerToken: ").append(toIndentedString(payerToken)).append("\n");
    sb.append("    payerBankAccount: ").append(toIndentedString(payerBankAccount)).append("\n");
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
    openapiFields.add("payer_institution");
    openapiFields.add("username");
    openapiFields.add("password");
    openapiFields.add("payer_token");
    openapiFields.add("payer_bank_account");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PatchPaymentMethodDetailsPse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PatchPaymentMethodDetailsPse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PatchPaymentMethodDetailsPse is not found in the empty JSON string", PatchPaymentMethodDetailsPse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("payer_institution") != null && !jsonObj.get("payer_institution").isJsonNull()) && !jsonObj.get("payer_institution").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payer_institution` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payer_institution").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("payer_token") != null && !jsonObj.get("payer_token").isJsonNull()) && !jsonObj.get("payer_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payer_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payer_token").toString()));
      }
      if ((jsonObj.get("payer_bank_account") != null && !jsonObj.get("payer_bank_account").isJsonNull()) && !jsonObj.get("payer_bank_account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payer_bank_account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payer_bank_account").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PatchPaymentMethodDetailsPse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PatchPaymentMethodDetailsPse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PatchPaymentMethodDetailsPse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PatchPaymentMethodDetailsPse.class));

       return (TypeAdapter<T>) new TypeAdapter<PatchPaymentMethodDetailsPse>() {
           @Override
           public void write(JsonWriter out, PatchPaymentMethodDetailsPse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
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
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public PatchPaymentMethodDetailsPse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PatchPaymentMethodDetailsPse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PatchPaymentMethodDetailsPse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PatchPaymentMethodDetailsPse
  * @throws IOException if the JSON string is invalid with respect to PatchPaymentMethodDetailsPse
  */
  public static PatchPaymentMethodDetailsPse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PatchPaymentMethodDetailsPse.class);
  }

 /**
  * Convert an instance of PatchPaymentMethodDetailsPse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

