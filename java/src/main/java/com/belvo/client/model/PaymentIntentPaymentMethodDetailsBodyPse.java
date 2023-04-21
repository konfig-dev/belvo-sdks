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
 * Details about the payment method type selected.
 */
@ApiModel(description = "Details about the payment method type selected.")
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PaymentIntentPaymentMethodDetailsBodyPse {
  public static final String SERIALIZED_NAME_PAYER_INSTITUTION = "payer_institution";
  @SerializedName(SERIALIZED_NAME_PAYER_INSTITUTION)
  private UUID payerInstitution;

  public static final String SERIALIZED_NAME_PAYER_BANK_ACCOUNT = "payer_bank_account";
  @SerializedName(SERIALIZED_NAME_PAYER_BANK_ACCOUNT)
  private UUID payerBankAccount;

  public static final String SERIALIZED_NAME_BENEFICIARY_BANK_ACCOUNT = "beneficiary_bank_account";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_BANK_ACCOUNT)
  private UUID beneficiaryBankAccount;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_CALLBACK_URL = "callback_url";
  @SerializedName(SERIALIZED_NAME_CALLBACK_URL)
  private String callbackUrl;

  public static final String SERIALIZED_NAME_BELVO_FLOW = "belvo_flow";
  @SerializedName(SERIALIZED_NAME_BELVO_FLOW)
  private Boolean belvoFlow = true;

  public PaymentIntentPaymentMethodDetailsBodyPse() {
  }

  public PaymentIntentPaymentMethodDetailsBodyPse payerInstitution(UUID payerInstitution) {
    
    
    this.payerInstitution = payerInstitution;
    return this;
  }

   /**
   * Belvo&#39;s unique identifier for the payer’s institution.
   * @return payerInstitution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "db201c6a-e0ee-4caa-92d6-72b480d6d86f", value = "Belvo's unique identifier for the payer’s institution.")

  public UUID getPayerInstitution() {
    return payerInstitution;
  }


  public void setPayerInstitution(UUID payerInstitution) {
    
    this.payerInstitution = payerInstitution;
  }


  public PaymentIntentPaymentMethodDetailsBodyPse payerBankAccount(UUID payerBankAccount) {
    
    
    this.payerBankAccount = payerBankAccount;
    return this;
  }

   /**
   * Belvo&#39;s unique ID used to identify the customer’s bank account.
   * @return payerBankAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "a80d5a9d-20ae-479a-8dd7-ff3443bcbbfc", value = "Belvo's unique ID used to identify the customer’s bank account.")

  public UUID getPayerBankAccount() {
    return payerBankAccount;
  }


  public void setPayerBankAccount(UUID payerBankAccount) {
    
    this.payerBankAccount = payerBankAccount;
  }


  public PaymentIntentPaymentMethodDetailsBodyPse beneficiaryBankAccount(UUID beneficiaryBankAccount) {
    
    
    this.beneficiaryBankAccount = beneficiaryBankAccount;
    return this;
  }

   /**
   * Belvo&#39;s unique ID used to identify the beneficiary’s bank account.
   * @return beneficiaryBankAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "a80d5a9d-20ae-479a-8dd7-ff3443bcbbfc", required = true, value = "Belvo's unique ID used to identify the beneficiary’s bank account.")

  public UUID getBeneficiaryBankAccount() {
    return beneficiaryBankAccount;
  }


  public void setBeneficiaryBankAccount(UUID beneficiaryBankAccount) {
    
    this.beneficiaryBankAccount = beneficiaryBankAccount;
  }


  public PaymentIntentPaymentMethodDetailsBodyPse username(String username) {
    
    
    this.username = username;
    return this;
  }

   /**
   * The username used to log in to the institution. This value is obfuscated.
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "***", value = "The username used to log in to the institution. This value is obfuscated.")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    
    this.username = username;
  }


  public PaymentIntentPaymentMethodDetailsBodyPse password(String password) {
    
    
    this.password = password;
    return this;
  }

   /**
   * The password used to log in to the institution. This value is obfuscated.
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "***", value = "The password used to log in to the institution. This value is obfuscated.")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    
    this.password = password;
  }


  public PaymentIntentPaymentMethodDetailsBodyPse callbackUrl(String callbackUrl) {
    
    
    this.callbackUrl = callbackUrl;
    return this;
  }

   /**
   * The callback URL that your user will be redirected to after confirming the payment in their banking application.
   * @return callbackUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://www.acmecorp.com/checkout/3487321", required = true, value = "The callback URL that your user will be redirected to after confirming the payment in their banking application.")

  public String getCallbackUrl() {
    return callbackUrl;
  }


  public void setCallbackUrl(String callbackUrl) {
    
    this.callbackUrl = callbackUrl;
  }


  public PaymentIntentPaymentMethodDetailsBodyPse belvoFlow(Boolean belvoFlow) {
    
    
    this.belvoFlow = belvoFlow;
    return this;
  }

   /**
   * This parameter determines the payment flow of the payment intent. By default, this is set to &#x60;true&#x60; and the payment intent created is processed using the Belvo&#39;s payment flow and Belvo-integrated institutions. When set to &#x60;false&#x60;, the payment intent process uses institutions not integrated into Belvo&#39;s flow.       
   * @return belvoFlow
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "This parameter determines the payment flow of the payment intent. By default, this is set to `true` and the payment intent created is processed using the Belvo's payment flow and Belvo-integrated institutions. When set to `false`, the payment intent process uses institutions not integrated into Belvo's flow.       ")

  public Boolean getBelvoFlow() {
    return belvoFlow;
  }


  public void setBelvoFlow(Boolean belvoFlow) {
    
    this.belvoFlow = belvoFlow;
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
   * @return the PaymentIntentPaymentMethodDetailsBodyPse instance itself
   */
  public PaymentIntentPaymentMethodDetailsBodyPse putAdditionalProperty(String key, Object value) {
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
    PaymentIntentPaymentMethodDetailsBodyPse paymentIntentPaymentMethodDetailsBodyPse = (PaymentIntentPaymentMethodDetailsBodyPse) o;
    return Objects.equals(this.payerInstitution, paymentIntentPaymentMethodDetailsBodyPse.payerInstitution) &&
        Objects.equals(this.payerBankAccount, paymentIntentPaymentMethodDetailsBodyPse.payerBankAccount) &&
        Objects.equals(this.beneficiaryBankAccount, paymentIntentPaymentMethodDetailsBodyPse.beneficiaryBankAccount) &&
        Objects.equals(this.username, paymentIntentPaymentMethodDetailsBodyPse.username) &&
        Objects.equals(this.password, paymentIntentPaymentMethodDetailsBodyPse.password) &&
        Objects.equals(this.callbackUrl, paymentIntentPaymentMethodDetailsBodyPse.callbackUrl) &&
        Objects.equals(this.belvoFlow, paymentIntentPaymentMethodDetailsBodyPse.belvoFlow)&&
        Objects.equals(this.additionalProperties, paymentIntentPaymentMethodDetailsBodyPse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payerInstitution, payerBankAccount, beneficiaryBankAccount, username, password, callbackUrl, belvoFlow, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentIntentPaymentMethodDetailsBodyPse {\n");
    sb.append("    payerInstitution: ").append(toIndentedString(payerInstitution)).append("\n");
    sb.append("    payerBankAccount: ").append(toIndentedString(payerBankAccount)).append("\n");
    sb.append("    beneficiaryBankAccount: ").append(toIndentedString(beneficiaryBankAccount)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    belvoFlow: ").append(toIndentedString(belvoFlow)).append("\n");
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
    openapiFields.add("payer_bank_account");
    openapiFields.add("beneficiary_bank_account");
    openapiFields.add("username");
    openapiFields.add("password");
    openapiFields.add("callback_url");
    openapiFields.add("belvo_flow");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("beneficiary_bank_account");
    openapiRequiredFields.add("callback_url");
    openapiRequiredFields.add("belvo_flow");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentIntentPaymentMethodDetailsBodyPse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PaymentIntentPaymentMethodDetailsBodyPse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentIntentPaymentMethodDetailsBodyPse is not found in the empty JSON string", PaymentIntentPaymentMethodDetailsBodyPse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PaymentIntentPaymentMethodDetailsBodyPse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("payer_institution") != null && !jsonObj.get("payer_institution").isJsonNull()) && !jsonObj.get("payer_institution").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payer_institution` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payer_institution").toString()));
      }
      if ((jsonObj.get("payer_bank_account") != null && !jsonObj.get("payer_bank_account").isJsonNull()) && !jsonObj.get("payer_bank_account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payer_bank_account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payer_bank_account").toString()));
      }
      if (!jsonObj.get("beneficiary_bank_account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beneficiary_bank_account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beneficiary_bank_account").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if (!jsonObj.get("callback_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `callback_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("callback_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentIntentPaymentMethodDetailsBodyPse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentIntentPaymentMethodDetailsBodyPse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentIntentPaymentMethodDetailsBodyPse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentIntentPaymentMethodDetailsBodyPse.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentIntentPaymentMethodDetailsBodyPse>() {
           @Override
           public void write(JsonWriter out, PaymentIntentPaymentMethodDetailsBodyPse value) throws IOException {
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
           public PaymentIntentPaymentMethodDetailsBodyPse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PaymentIntentPaymentMethodDetailsBodyPse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PaymentIntentPaymentMethodDetailsBodyPse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentIntentPaymentMethodDetailsBodyPse
  * @throws IOException if the JSON string is invalid with respect to PaymentIntentPaymentMethodDetailsBodyPse
  */
  public static PaymentIntentPaymentMethodDetailsBodyPse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentIntentPaymentMethodDetailsBodyPse.class);
  }

 /**
  * Convert an instance of PaymentIntentPaymentMethodDetailsBodyPse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

