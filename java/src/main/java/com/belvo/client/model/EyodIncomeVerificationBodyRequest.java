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
import com.belvo.client.model.EnumIncomeVerificationAccountCategory;
import com.belvo.client.model.EnumIncomeVerificationAccountHolderType;
import com.belvo.client.model.EnumIncomeVerificationType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
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
 * EyodIncomeVerificationBodyRequest
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EyodIncomeVerificationBodyRequest {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transaction_id";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_ACCOUNT_HOLDER_TYPE = "account_holder_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_HOLDER_TYPE)
  private EnumIncomeVerificationAccountHolderType accountHolderType;

  public static final String SERIALIZED_NAME_ACCOUNT_HOLDER_ID = "account_holder_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_HOLDER_ID)
  private UUID accountHolderId;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ACCOUNT_CATEGORY = "account_category";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_CATEGORY)
  private EnumIncomeVerificationAccountCategory accountCategory;

  public static final String SERIALIZED_NAME_VALUE_DATE = "value_date";
  @SerializedName(SERIALIZED_NAME_VALUE_DATE)
  private LocalDate valueDate;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private EnumIncomeVerificationType type;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Float amount;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_INSTITUTION = "institution";
  @SerializedName(SERIALIZED_NAME_INSTITUTION)
  private String institution;

  public EyodIncomeVerificationBodyRequest() {
  }

  public EyodIncomeVerificationBodyRequest description(String description) {
    
    
    this.description = description;
    return this;
  }

   /**
   * The description of the income.
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "SALÁRIO MENSAL", required = true, value = "The description of the income.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    this.description = description;
  }


  public EyodIncomeVerificationBodyRequest transactionId(String transactionId) {
    
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Your unique ID for the income.
   * @return transactionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "3CWE4927CF15355", required = true, value = "Your unique ID for the income.")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    
    this.transactionId = transactionId;
  }


  public EyodIncomeVerificationBodyRequest accountHolderType(EnumIncomeVerificationAccountHolderType accountHolderType) {
    
    
    this.accountHolderType = accountHolderType;
    return this;
  }

   /**
   * Get accountHolderType
   * @return accountHolderType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EnumIncomeVerificationAccountHolderType getAccountHolderType() {
    return accountHolderType;
  }


  public void setAccountHolderType(EnumIncomeVerificationAccountHolderType accountHolderType) {
    
    this.accountHolderType = accountHolderType;
  }


  public EyodIncomeVerificationBodyRequest accountHolderId(UUID accountHolderId) {
    
    
    this.accountHolderId = accountHolderId;
    return this;
  }

   /**
   * Your unique ID for the account holder, in UUID format.
   * @return accountHolderId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "a61bc801-9fa5-457b-88ad-850c96eaca30", required = true, value = "Your unique ID for the account holder, in UUID format.")

  public UUID getAccountHolderId() {
    return accountHolderId;
  }


  public void setAccountHolderId(UUID accountHolderId) {
    
    this.accountHolderId = accountHolderId;
  }


  public EyodIncomeVerificationBodyRequest accountId(String accountId) {
    
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Your unique ID for the account where the transaction occurred.
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "EBACA-89077589", required = true, value = "Your unique ID for the account where the transaction occurred.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    
    this.accountId = accountId;
  }


  public EyodIncomeVerificationBodyRequest accountCategory(EnumIncomeVerificationAccountCategory accountCategory) {
    
    
    this.accountCategory = accountCategory;
    return this;
  }

   /**
   * Get accountCategory
   * @return accountCategory
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EnumIncomeVerificationAccountCategory getAccountCategory() {
    return accountCategory;
  }


  public void setAccountCategory(EnumIncomeVerificationAccountCategory accountCategory) {
    
    this.accountCategory = accountCategory;
  }


  public EyodIncomeVerificationBodyRequest valueDate(LocalDate valueDate) {
    
    
    this.valueDate = valueDate;
    return this;
  }

   /**
   * The date when the income transaction occurred, in &#x60;YYYY-MM-DD&#x60; format.
   * @return valueDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Thu Nov 17 16:00:00 PST 2022", required = true, value = "The date when the income transaction occurred, in `YYYY-MM-DD` format.")

  public LocalDate getValueDate() {
    return valueDate;
  }


  public void setValueDate(LocalDate valueDate) {
    
    this.valueDate = valueDate;
  }


  public EyodIncomeVerificationBodyRequest type(EnumIncomeVerificationType type) {
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public EnumIncomeVerificationType getType() {
    return type;
  }


  public void setType(EnumIncomeVerificationType type) {
    
    this.type = type;
  }


  public EyodIncomeVerificationBodyRequest amount(Float amount) {
    
    
    this.amount = amount;
    return this;
  }

   /**
   * The income amount.
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "650.89", required = true, value = "The income amount.")

  public Float getAmount() {
    return amount;
  }


  public void setAmount(Float amount) {
    
    this.amount = amount;
  }


  public EyodIncomeVerificationBodyRequest currency(String currency) {
    
    
    this.currency = currency;
    return this;
  }

   /**
   * The three-letter currency code of the income. For example:    • 🇧🇷 BRL (Brazilian Real)   • 🇨🇴 COP (Colombian Peso)   • 🇲🇽 MXN (Mexican Peso)   
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "BRL", required = true, value = "The three-letter currency code of the income. For example:    • 🇧🇷 BRL (Brazilian Real)   • 🇨🇴 COP (Colombian Peso)   • 🇲🇽 MXN (Mexican Peso)   ")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    
    this.currency = currency;
  }


  public EyodIncomeVerificationBodyRequest institution(String institution) {
    
    
    this.institution = institution;
    return this;
  }

   /**
   * The institution where the account is registered.  &gt;**Note:** This is the name that you use in your system to identify an institution.
   * @return institution
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Erebor Brazil", required = true, value = "The institution where the account is registered.  >**Note:** This is the name that you use in your system to identify an institution.")

  public String getInstitution() {
    return institution;
  }


  public void setInstitution(String institution) {
    
    this.institution = institution;
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
   * @return the EyodIncomeVerificationBodyRequest instance itself
   */
  public EyodIncomeVerificationBodyRequest putAdditionalProperty(String key, Object value) {
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
    EyodIncomeVerificationBodyRequest eyodIncomeVerificationBodyRequest = (EyodIncomeVerificationBodyRequest) o;
    return Objects.equals(this.description, eyodIncomeVerificationBodyRequest.description) &&
        Objects.equals(this.transactionId, eyodIncomeVerificationBodyRequest.transactionId) &&
        Objects.equals(this.accountHolderType, eyodIncomeVerificationBodyRequest.accountHolderType) &&
        Objects.equals(this.accountHolderId, eyodIncomeVerificationBodyRequest.accountHolderId) &&
        Objects.equals(this.accountId, eyodIncomeVerificationBodyRequest.accountId) &&
        Objects.equals(this.accountCategory, eyodIncomeVerificationBodyRequest.accountCategory) &&
        Objects.equals(this.valueDate, eyodIncomeVerificationBodyRequest.valueDate) &&
        Objects.equals(this.type, eyodIncomeVerificationBodyRequest.type) &&
        Objects.equals(this.amount, eyodIncomeVerificationBodyRequest.amount) &&
        Objects.equals(this.currency, eyodIncomeVerificationBodyRequest.currency) &&
        Objects.equals(this.institution, eyodIncomeVerificationBodyRequest.institution)&&
        Objects.equals(this.additionalProperties, eyodIncomeVerificationBodyRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, transactionId, accountHolderType, accountHolderId, accountId, accountCategory, valueDate, type, amount, currency, institution, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EyodIncomeVerificationBodyRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    accountHolderType: ").append(toIndentedString(accountHolderType)).append("\n");
    sb.append("    accountHolderId: ").append(toIndentedString(accountHolderId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountCategory: ").append(toIndentedString(accountCategory)).append("\n");
    sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    institution: ").append(toIndentedString(institution)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("transaction_id");
    openapiFields.add("account_holder_type");
    openapiFields.add("account_holder_id");
    openapiFields.add("account_id");
    openapiFields.add("account_category");
    openapiFields.add("value_date");
    openapiFields.add("type");
    openapiFields.add("amount");
    openapiFields.add("currency");
    openapiFields.add("institution");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("transaction_id");
    openapiRequiredFields.add("account_holder_type");
    openapiRequiredFields.add("account_holder_id");
    openapiRequiredFields.add("account_id");
    openapiRequiredFields.add("account_category");
    openapiRequiredFields.add("value_date");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("institution");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EyodIncomeVerificationBodyRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EyodIncomeVerificationBodyRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EyodIncomeVerificationBodyRequest is not found in the empty JSON string", EyodIncomeVerificationBodyRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EyodIncomeVerificationBodyRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("transaction_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transaction_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transaction_id").toString()));
      }
      if (!jsonObj.get("account_holder_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_holder_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_holder_id").toString()));
      }
      if (!jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (!jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if (!jsonObj.get("institution").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `institution` to be a primitive type in the JSON string but got `%s`", jsonObj.get("institution").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EyodIncomeVerificationBodyRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EyodIncomeVerificationBodyRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EyodIncomeVerificationBodyRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EyodIncomeVerificationBodyRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<EyodIncomeVerificationBodyRequest>() {
           @Override
           public void write(JsonWriter out, EyodIncomeVerificationBodyRequest value) throws IOException {
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
           public EyodIncomeVerificationBodyRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EyodIncomeVerificationBodyRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EyodIncomeVerificationBodyRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EyodIncomeVerificationBodyRequest
  * @throws IOException if the JSON string is invalid with respect to EyodIncomeVerificationBodyRequest
  */
  public static EyodIncomeVerificationBodyRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EyodIncomeVerificationBodyRequest.class);
  }

 /**
  * Convert an instance of EyodIncomeVerificationBodyRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

