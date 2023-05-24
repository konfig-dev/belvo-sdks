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
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;

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
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.belvo.client.JSON;

/**
 * The credit options associated with this account.
 */
@ApiModel(description = "The credit options associated with this account.")
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AccountsCreditData {
  public static final String SERIALIZED_NAME_CREDIT_LIMIT = "credit_limit";
  @SerializedName(SERIALIZED_NAME_CREDIT_LIMIT)
  private Float creditLimit;

  public static final String SERIALIZED_NAME_COLLECTED_AT = "collected_at";
  @SerializedName(SERIALIZED_NAME_COLLECTED_AT)
  private OffsetDateTime collectedAt;

  public static final String SERIALIZED_NAME_CUTTING_DATE = "cutting_date";
  @SerializedName(SERIALIZED_NAME_CUTTING_DATE)
  private String cuttingDate;

  public static final String SERIALIZED_NAME_NEXT_PAYMENT_DATE = "next_payment_date";
  @SerializedName(SERIALIZED_NAME_NEXT_PAYMENT_DATE)
  private String nextPaymentDate;

  public static final String SERIALIZED_NAME_MINIMUM_PAYMENT = "minimum_payment";
  @SerializedName(SERIALIZED_NAME_MINIMUM_PAYMENT)
  private Float minimumPayment;

  public static final String SERIALIZED_NAME_NO_INTEREST_PAYMENT = "no_interest_payment";
  @SerializedName(SERIALIZED_NAME_NO_INTEREST_PAYMENT)
  private Float noInterestPayment;

  public static final String SERIALIZED_NAME_INTEREST_RATE = "interest_rate";
  @SerializedName(SERIALIZED_NAME_INTEREST_RATE)
  private Float interestRate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_MONTHLY_PAYMENT = "monthly_payment";
  @SerializedName(SERIALIZED_NAME_MONTHLY_PAYMENT)
  private Double monthlyPayment;

  public static final String SERIALIZED_NAME_LAST_PAYMENT_DATE = "last_payment_date";
  @SerializedName(SERIALIZED_NAME_LAST_PAYMENT_DATE)
  private String lastPaymentDate;

  public AccountsCreditData() {
  }

  public AccountsCreditData creditLimit(Float creditLimit) {

    
    
    
    
    this.creditLimit = creditLimit;
    return this;
  }

   /**
   * The maximum amount of credit the owner can receive.
   * @return creditLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "192000", required = true, value = "The maximum amount of credit the owner can receive.")

  public Float getCreditLimit() {
    return creditLimit;
  }


  public void setCreditLimit(Float creditLimit) {

    
    
    
    this.creditLimit = creditLimit;
  }


  public AccountsCreditData collectedAt(OffsetDateTime collectedAt) {

    
    
    
    
    this.collectedAt = collectedAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp when the data point was collected.
   * @return collectedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-09-27T13:01:41.941Z", required = true, value = "The ISO-8601 timestamp when the data point was collected.")

  public OffsetDateTime getCollectedAt() {
    return collectedAt;
  }


  public void setCollectedAt(OffsetDateTime collectedAt) {

    
    
    
    this.collectedAt = collectedAt;
  }


  public AccountsCreditData cuttingDate(String cuttingDate) {

    
    
    
    
    this.cuttingDate = cuttingDate;
    return this;
  }

   /**
   * The closing date of the credit period.
   * @return cuttingDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-12-11", required = true, value = "The closing date of the credit period.")

  public String getCuttingDate() {
    return cuttingDate;
  }


  public void setCuttingDate(String cuttingDate) {

    
    
    
    this.cuttingDate = cuttingDate;
  }


  public AccountsCreditData nextPaymentDate(String nextPaymentDate) {

    
    
    
    
    this.nextPaymentDate = nextPaymentDate;
    return this;
  }

   /**
   * The due date for the next payment (&#x60;YYYY-MM-DD&#x60;).
   * @return nextPaymentDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-12-13", required = true, value = "The due date for the next payment (`YYYY-MM-DD`).")

  public String getNextPaymentDate() {
    return nextPaymentDate;
  }


  public void setNextPaymentDate(String nextPaymentDate) {

    
    
    
    this.nextPaymentDate = nextPaymentDate;
  }


  public AccountsCreditData minimumPayment(Float minimumPayment) {

    
    
    
    
    this.minimumPayment = minimumPayment;
    return this;
  }

   /**
   * The minimum amount to be paid on the &#x60;next_payment_date&#x60;.
   * @return minimumPayment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2400.3", required = true, value = "The minimum amount to be paid on the `next_payment_date`.")

  public Float getMinimumPayment() {
    return minimumPayment;
  }


  public void setMinimumPayment(Float minimumPayment) {

    
    
    
    this.minimumPayment = minimumPayment;
  }


  public AccountsCreditData noInterestPayment(Float noInterestPayment) {

    
    
    
    
    this.noInterestPayment = noInterestPayment;
    return this;
  }

   /**
   * The minimum amount required to pay to avoid generating interest.
   * @return noInterestPayment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2690.83", required = true, value = "The minimum amount required to pay to avoid generating interest.")

  public Float getNoInterestPayment() {
    return noInterestPayment;
  }


  public void setNoInterestPayment(Float noInterestPayment) {

    
    
    
    this.noInterestPayment = noInterestPayment;
  }


  public AccountsCreditData interestRate(Float interestRate) {

    
    
    
    
    this.interestRate = interestRate;
    return this;
  }

   /**
   * The annualized interest rate of the credit.
   * @return interestRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", required = true, value = "The annualized interest rate of the credit.")

  public Float getInterestRate() {
    return interestRate;
  }


  public void setInterestRate(Float interestRate) {

    
    
    
    this.interestRate = interestRate;
  }


  public AccountsCreditData endDate(String endDate) {

    
    
    
    
    this.endDate = endDate;
    return this;
  }

   /**
   * *This field has been deprecated.* 
   * @return endDate
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "*This field has been deprecated.* ")

  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {

    
    
    
    this.endDate = endDate;
  }


  public AccountsCreditData monthlyPayment(Double monthlyPayment) {

    
    
    
    
    this.monthlyPayment = monthlyPayment;
    return this;
  }

  public AccountsCreditData monthlyPayment(Integer monthlyPayment) {

    
    
    
    
    this.monthlyPayment = monthlyPayment.doubleValue();
    return this;
  }

   /**
   * *This field has been deprecated.*  *The recurrent monthly payment, if applicable.* 
   * @return monthlyPayment
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "*This field has been deprecated.*  *The recurrent monthly payment, if applicable.* ")

  public Double getMonthlyPayment() {
    return monthlyPayment;
  }


  public void setMonthlyPayment(Double monthlyPayment) {

    
    
    
    this.monthlyPayment = monthlyPayment;
  }


  public AccountsCreditData lastPaymentDate(String lastPaymentDate) {

    
    
    
    
    this.lastPaymentDate = lastPaymentDate;
    return this;
  }

   /**
   * *This field has been deprecated.*   *The date when the last credit payment was made.* 
   * @return lastPaymentDate
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "*This field has been deprecated.*   *The date when the last credit payment was made.* ")

  public String getLastPaymentDate() {
    return lastPaymentDate;
  }


  public void setLastPaymentDate(String lastPaymentDate) {

    
    
    
    this.lastPaymentDate = lastPaymentDate;
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
   * @return the AccountsCreditData instance itself
   */
  public AccountsCreditData putAdditionalProperty(String key, Object value) {
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
    AccountsCreditData accountsCreditData = (AccountsCreditData) o;
    return Objects.equals(this.creditLimit, accountsCreditData.creditLimit) &&
        Objects.equals(this.collectedAt, accountsCreditData.collectedAt) &&
        Objects.equals(this.cuttingDate, accountsCreditData.cuttingDate) &&
        Objects.equals(this.nextPaymentDate, accountsCreditData.nextPaymentDate) &&
        Objects.equals(this.minimumPayment, accountsCreditData.minimumPayment) &&
        Objects.equals(this.noInterestPayment, accountsCreditData.noInterestPayment) &&
        Objects.equals(this.interestRate, accountsCreditData.interestRate) &&
        Objects.equals(this.endDate, accountsCreditData.endDate) &&
        Objects.equals(this.monthlyPayment, accountsCreditData.monthlyPayment) &&
        Objects.equals(this.lastPaymentDate, accountsCreditData.lastPaymentDate)&&
        Objects.equals(this.additionalProperties, accountsCreditData.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditLimit, collectedAt, cuttingDate, nextPaymentDate, minimumPayment, noInterestPayment, interestRate, endDate, monthlyPayment, lastPaymentDate, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountsCreditData {\n");
    sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
    sb.append("    collectedAt: ").append(toIndentedString(collectedAt)).append("\n");
    sb.append("    cuttingDate: ").append(toIndentedString(cuttingDate)).append("\n");
    sb.append("    nextPaymentDate: ").append(toIndentedString(nextPaymentDate)).append("\n");
    sb.append("    minimumPayment: ").append(toIndentedString(minimumPayment)).append("\n");
    sb.append("    noInterestPayment: ").append(toIndentedString(noInterestPayment)).append("\n");
    sb.append("    interestRate: ").append(toIndentedString(interestRate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    monthlyPayment: ").append(toIndentedString(monthlyPayment)).append("\n");
    sb.append("    lastPaymentDate: ").append(toIndentedString(lastPaymentDate)).append("\n");
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
    openapiFields.add("credit_limit");
    openapiFields.add("collected_at");
    openapiFields.add("cutting_date");
    openapiFields.add("next_payment_date");
    openapiFields.add("minimum_payment");
    openapiFields.add("no_interest_payment");
    openapiFields.add("interest_rate");
    openapiFields.add("end_date");
    openapiFields.add("monthly_payment");
    openapiFields.add("last_payment_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("credit_limit");
    openapiRequiredFields.add("collected_at");
    openapiRequiredFields.add("cutting_date");
    openapiRequiredFields.add("next_payment_date");
    openapiRequiredFields.add("minimum_payment");
    openapiRequiredFields.add("no_interest_payment");
    openapiRequiredFields.add("interest_rate");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AccountsCreditData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AccountsCreditData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountsCreditData is not found in the empty JSON string", AccountsCreditData.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AccountsCreditData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("cutting_date").isJsonNull() && !jsonObj.get("cutting_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cutting_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cutting_date").toString()));
      }
      if (!jsonObj.get("next_payment_date").isJsonNull() && !jsonObj.get("next_payment_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `next_payment_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("next_payment_date").toString()));
      }
      if (!jsonObj.get("end_date").isJsonNull() && (jsonObj.get("end_date") != null && !jsonObj.get("end_date").isJsonNull()) && !jsonObj.get("end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_date").toString()));
      }
      if (!jsonObj.get("last_payment_date").isJsonNull() && (jsonObj.get("last_payment_date") != null && !jsonObj.get("last_payment_date").isJsonNull()) && !jsonObj.get("last_payment_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_payment_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_payment_date").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountsCreditData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountsCreditData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountsCreditData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountsCreditData.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountsCreditData>() {
           @Override
           public void write(JsonWriter out, AccountsCreditData value) throws IOException {
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
           public AccountsCreditData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AccountsCreditData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AccountsCreditData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccountsCreditData
  * @throws IOException if the JSON string is invalid with respect to AccountsCreditData
  */
  public static AccountsCreditData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountsCreditData.class);
  }

 /**
  * Convert an instance of AccountsCreditData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

