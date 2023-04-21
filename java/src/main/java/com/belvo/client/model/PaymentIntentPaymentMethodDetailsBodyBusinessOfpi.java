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
 * Payment method type selected.
 */
@ApiModel(description = "Payment method type selected.")
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PaymentIntentPaymentMethodDetailsBodyBusinessOfpi {
  public static final String SERIALIZED_NAME_BENEFICIARY_BANK_ACCOUNT = "beneficiary_bank_account";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_BANK_ACCOUNT)
  private UUID beneficiaryBankAccount;

  public static final String SERIALIZED_NAME_PAYER_INSTITUTION = "payer_institution";
  @SerializedName(SERIALIZED_NAME_PAYER_INSTITUTION)
  private UUID payerInstitution;

  public static final String SERIALIZED_NAME_CALLBACK_URL = "callback_url";
  @SerializedName(SERIALIZED_NAME_CALLBACK_URL)
  private String callbackUrl;

  public static final String SERIALIZED_NAME_CPF = "cpf";
  @SerializedName(SERIALIZED_NAME_CPF)
  private String cpf;

  public PaymentIntentPaymentMethodDetailsBodyBusinessOfpi() {
  }

  public PaymentIntentPaymentMethodDetailsBodyBusinessOfpi beneficiaryBankAccount(UUID beneficiaryBankAccount) {
    
    
    this.beneficiaryBankAccount = beneficiaryBankAccount;
    return this;
  }

   /**
   * Belvo&#39;s unique ID used to identify the beneficiary&#39;s bank account.
   * @return beneficiaryBankAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "a80d5a9d-20ae-479a-8dd7-ff3443bcbbfc", required = true, value = "Belvo's unique ID used to identify the beneficiary's bank account.")

  public UUID getBeneficiaryBankAccount() {
    return beneficiaryBankAccount;
  }


  public void setBeneficiaryBankAccount(UUID beneficiaryBankAccount) {
    
    this.beneficiaryBankAccount = beneficiaryBankAccount;
  }


  public PaymentIntentPaymentMethodDetailsBodyBusinessOfpi payerInstitution(UUID payerInstitution) {
    
    
    this.payerInstitution = payerInstitution;
    return this;
  }

   /**
   * Belvo&#39;s unique ID to reference the payer&#39;s institution.
   * @return payerInstitution
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "600f1b4a-1ef9-4f89-b341-1a35f0c32cc0", required = true, value = "Belvo's unique ID to reference the payer's institution.")

  public UUID getPayerInstitution() {
    return payerInstitution;
  }


  public void setPayerInstitution(UUID payerInstitution) {
    
    this.payerInstitution = payerInstitution;
  }


  public PaymentIntentPaymentMethodDetailsBodyBusinessOfpi callbackUrl(String callbackUrl) {
    
    
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


  public PaymentIntentPaymentMethodDetailsBodyBusinessOfpi cpf(String cpf) {
    
    
    this.cpf = cpf;
    return this;
  }

   /**
   * The customer&#39;s CPF number. Only required when the &#x60;customer_type&#x60; is &#x60;BUSINESS&#x60;.  **Note:** This value is obfuscated.
   * @return cpf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "***444777**", required = true, value = "The customer's CPF number. Only required when the `customer_type` is `BUSINESS`.  **Note:** This value is obfuscated.")

  public String getCpf() {
    return cpf;
  }


  public void setCpf(String cpf) {
    
    this.cpf = cpf;
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
   * @return the PaymentIntentPaymentMethodDetailsBodyBusinessOfpi instance itself
   */
  public PaymentIntentPaymentMethodDetailsBodyBusinessOfpi putAdditionalProperty(String key, Object value) {
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
    PaymentIntentPaymentMethodDetailsBodyBusinessOfpi paymentIntentPaymentMethodDetailsBodyBusinessOfpi = (PaymentIntentPaymentMethodDetailsBodyBusinessOfpi) o;
    return Objects.equals(this.beneficiaryBankAccount, paymentIntentPaymentMethodDetailsBodyBusinessOfpi.beneficiaryBankAccount) &&
        Objects.equals(this.payerInstitution, paymentIntentPaymentMethodDetailsBodyBusinessOfpi.payerInstitution) &&
        Objects.equals(this.callbackUrl, paymentIntentPaymentMethodDetailsBodyBusinessOfpi.callbackUrl) &&
        Objects.equals(this.cpf, paymentIntentPaymentMethodDetailsBodyBusinessOfpi.cpf)&&
        Objects.equals(this.additionalProperties, paymentIntentPaymentMethodDetailsBodyBusinessOfpi.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beneficiaryBankAccount, payerInstitution, callbackUrl, cpf, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentIntentPaymentMethodDetailsBodyBusinessOfpi {\n");
    sb.append("    beneficiaryBankAccount: ").append(toIndentedString(beneficiaryBankAccount)).append("\n");
    sb.append("    payerInstitution: ").append(toIndentedString(payerInstitution)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
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
    openapiFields.add("beneficiary_bank_account");
    openapiFields.add("payer_institution");
    openapiFields.add("callback_url");
    openapiFields.add("cpf");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("beneficiary_bank_account");
    openapiRequiredFields.add("payer_institution");
    openapiRequiredFields.add("callback_url");
    openapiRequiredFields.add("cpf");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentIntentPaymentMethodDetailsBodyBusinessOfpi
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PaymentIntentPaymentMethodDetailsBodyBusinessOfpi.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentIntentPaymentMethodDetailsBodyBusinessOfpi is not found in the empty JSON string", PaymentIntentPaymentMethodDetailsBodyBusinessOfpi.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PaymentIntentPaymentMethodDetailsBodyBusinessOfpi.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("beneficiary_bank_account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beneficiary_bank_account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beneficiary_bank_account").toString()));
      }
      if (!jsonObj.get("payer_institution").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payer_institution` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payer_institution").toString()));
      }
      if (!jsonObj.get("callback_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `callback_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("callback_url").toString()));
      }
      if (!jsonObj.get("cpf").isJsonNull() && !jsonObj.get("cpf").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cpf` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cpf").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentIntentPaymentMethodDetailsBodyBusinessOfpi.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentIntentPaymentMethodDetailsBodyBusinessOfpi' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentIntentPaymentMethodDetailsBodyBusinessOfpi> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentIntentPaymentMethodDetailsBodyBusinessOfpi.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentIntentPaymentMethodDetailsBodyBusinessOfpi>() {
           @Override
           public void write(JsonWriter out, PaymentIntentPaymentMethodDetailsBodyBusinessOfpi value) throws IOException {
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
           public PaymentIntentPaymentMethodDetailsBodyBusinessOfpi read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PaymentIntentPaymentMethodDetailsBodyBusinessOfpi instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PaymentIntentPaymentMethodDetailsBodyBusinessOfpi given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentIntentPaymentMethodDetailsBodyBusinessOfpi
  * @throws IOException if the JSON string is invalid with respect to PaymentIntentPaymentMethodDetailsBodyBusinessOfpi
  */
  public static PaymentIntentPaymentMethodDetailsBodyBusinessOfpi fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentIntentPaymentMethodDetailsBodyBusinessOfpi.class);
  }

 /**
  * Convert an instance of PaymentIntentPaymentMethodDetailsBodyBusinessOfpi to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
