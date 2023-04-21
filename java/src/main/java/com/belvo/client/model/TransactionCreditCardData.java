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
import com.belvo.client.model.EnumTransactionBillStatus;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.belvo.client.JSON;

/**
 * Additional data provided by the institution for credit card transactions.
 */
@ApiModel(description = "Additional data provided by the institution for credit card transactions.")
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TransactionCreditCardData {
  public static final String SERIALIZED_NAME_COLLECTED_AT = "collected_at";
  @SerializedName(SERIALIZED_NAME_COLLECTED_AT)
  private OffsetDateTime collectedAt;

  public static final String SERIALIZED_NAME_BILL_NAME = "bill_name";
  @SerializedName(SERIALIZED_NAME_BILL_NAME)
  private String billName;

  public static final String SERIALIZED_NAME_BILL_STATUS = "bill_status";
  @SerializedName(SERIALIZED_NAME_BILL_STATUS)
  private EnumTransactionBillStatus billStatus;

  public static final String SERIALIZED_NAME_BILL_AMOUNT = "bill_amount";
  @SerializedName(SERIALIZED_NAME_BILL_AMOUNT)
  private Float billAmount;

  public static final String SERIALIZED_NAME_PREVIOUS_BILL_TOTAL = "previous_bill_total";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_BILL_TOTAL)
  private String previousBillTotal;

  public TransactionCreditCardData() {
  }

  public TransactionCreditCardData collectedAt(OffsetDateTime collectedAt) {
    
    
    this.collectedAt = collectedAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp when the data point was collected.
   * @return collectedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-09-27T13:01:41.941Z", value = "The ISO-8601 timestamp when the data point was collected.")

  public OffsetDateTime getCollectedAt() {
    return collectedAt;
  }


  public void setCollectedAt(OffsetDateTime collectedAt) {
    
    this.collectedAt = collectedAt;
  }


  public TransactionCreditCardData billName(String billName) {
    
    
    this.billName = billName;
    return this;
  }

   /**
   * The title of the monthly credit card bill the transaction belongs to. The format of the returned value is institution specific, however, some common examples are:  - diciembre-2021 - dec-2021 - dec-21 
   * @return billName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "apr-2020", value = "The title of the monthly credit card bill the transaction belongs to. The format of the returned value is institution specific, however, some common examples are:  - diciembre-2021 - dec-2021 - dec-21 ")

  public String getBillName() {
    return billName;
  }


  public void setBillName(String billName) {
    
    this.billName = billName;
  }


  public TransactionCreditCardData billStatus(EnumTransactionBillStatus billStatus) {
    
    
    this.billStatus = billStatus;
    return this;
  }

   /**
   * Get billStatus
   * @return billStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumTransactionBillStatus getBillStatus() {
    return billStatus;
  }


  public void setBillStatus(EnumTransactionBillStatus billStatus) {
    
    this.billStatus = billStatus;
  }


  public TransactionCreditCardData billAmount(Float billAmount) {
    
    
    this.billAmount = billAmount;
    return this;
  }

   /**
   * The aggregate bill amount, as of &#x60;collected_at&#x60;.
   * @return billAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "300", value = "The aggregate bill amount, as of `collected_at`.")

  public Float getBillAmount() {
    return billAmount;
  }


  public void setBillAmount(Float billAmount) {
    
    this.billAmount = billAmount;
  }


  public TransactionCreditCardData previousBillTotal(String previousBillTotal) {
    
    
    this.previousBillTotal = previousBillTotal;
    return this;
  }

   /**
   * The total amount of the previous month&#39;s bill, if available.
   * @return previousBillTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9614.30", value = "The total amount of the previous month's bill, if available.")

  public String getPreviousBillTotal() {
    return previousBillTotal;
  }


  public void setPreviousBillTotal(String previousBillTotal) {
    
    this.previousBillTotal = previousBillTotal;
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
   * @return the TransactionCreditCardData instance itself
   */
  public TransactionCreditCardData putAdditionalProperty(String key, Object value) {
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
    TransactionCreditCardData transactionCreditCardData = (TransactionCreditCardData) o;
    return Objects.equals(this.collectedAt, transactionCreditCardData.collectedAt) &&
        Objects.equals(this.billName, transactionCreditCardData.billName) &&
        Objects.equals(this.billStatus, transactionCreditCardData.billStatus) &&
        Objects.equals(this.billAmount, transactionCreditCardData.billAmount) &&
        Objects.equals(this.previousBillTotal, transactionCreditCardData.previousBillTotal)&&
        Objects.equals(this.additionalProperties, transactionCreditCardData.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectedAt, billName, billStatus, billAmount, previousBillTotal, additionalProperties);
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
    sb.append("class TransactionCreditCardData {\n");
    sb.append("    collectedAt: ").append(toIndentedString(collectedAt)).append("\n");
    sb.append("    billName: ").append(toIndentedString(billName)).append("\n");
    sb.append("    billStatus: ").append(toIndentedString(billStatus)).append("\n");
    sb.append("    billAmount: ").append(toIndentedString(billAmount)).append("\n");
    sb.append("    previousBillTotal: ").append(toIndentedString(previousBillTotal)).append("\n");
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
    openapiFields.add("collected_at");
    openapiFields.add("bill_name");
    openapiFields.add("bill_status");
    openapiFields.add("bill_amount");
    openapiFields.add("previous_bill_total");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TransactionCreditCardData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TransactionCreditCardData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionCreditCardData is not found in the empty JSON string", TransactionCreditCardData.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("bill_name").isJsonNull() && (jsonObj.get("bill_name") != null && !jsonObj.get("bill_name").isJsonNull()) && !jsonObj.get("bill_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bill_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bill_name").toString()));
      }
      if (!jsonObj.get("previous_bill_total").isJsonNull() && (jsonObj.get("previous_bill_total") != null && !jsonObj.get("previous_bill_total").isJsonNull()) && !jsonObj.get("previous_bill_total").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `previous_bill_total` to be a primitive type in the JSON string but got `%s`", jsonObj.get("previous_bill_total").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionCreditCardData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionCreditCardData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionCreditCardData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionCreditCardData.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionCreditCardData>() {
           @Override
           public void write(JsonWriter out, TransactionCreditCardData value) throws IOException {
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
           public TransactionCreditCardData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TransactionCreditCardData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TransactionCreditCardData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionCreditCardData
  * @throws IOException if the JSON string is invalid with respect to TransactionCreditCardData
  */
  public static TransactionCreditCardData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionCreditCardData.class);
  }

 /**
  * Convert an instance of TransactionCreditCardData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

