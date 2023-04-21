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
 * List of all the related deferred invoices affected by the payment.
 */
@ApiModel(description = "List of all the related deferred invoices affected by the payment.")
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class InvoicesPaymentsRelatedDocumentsDian {
  public static final String SERIALIZED_NAME_INVOICE_IDENTIFICATION = "invoice_identification";
  @SerializedName(SERIALIZED_NAME_INVOICE_IDENTIFICATION)
  private String invoiceIdentification;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "payment_method";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private String paymentMethod;

  public static final String SERIALIZED_NAME_PARTIALITY_NUMBER = "partiality_number";
  @SerializedName(SERIALIZED_NAME_PARTIALITY_NUMBER)
  private Integer partialityNumber;

  public static final String SERIALIZED_NAME_PREVIOUS_BALANCE = "previous_balance";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_BALANCE)
  private Float previousBalance;

  public static final String SERIALIZED_NAME_AMOUNT_PAID = "amount_paid";
  @SerializedName(SERIALIZED_NAME_AMOUNT_PAID)
  private Float amountPaid;

  public static final String SERIALIZED_NAME_OUTSTANDING_BALANCE = "outstanding_balance";
  @SerializedName(SERIALIZED_NAME_OUTSTANDING_BALANCE)
  private Float outstandingBalance;

  public InvoicesPaymentsRelatedDocumentsDian() {
  }

  public InvoicesPaymentsRelatedDocumentsDian invoiceIdentification(String invoiceIdentification) {
    
    
    this.invoiceIdentification = invoiceIdentification;
    return this;
  }

   /**
   * **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;. 
   * @return invoiceIdentification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "**Note**: This field is not applicable for DIAN Colombia and will return `null`. ")

  public String getInvoiceIdentification() {
    return invoiceIdentification;
  }


  public void setInvoiceIdentification(String invoiceIdentification) {
    
    this.invoiceIdentification = invoiceIdentification;
  }


  public InvoicesPaymentsRelatedDocumentsDian currency(String currency) {
    
    
    this.currency = currency;
    return this;
  }

   /**
   * **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;. 
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "**Note**: This field is not applicable for DIAN Colombia and will return `null`. ")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    
    this.currency = currency;
  }


  public InvoicesPaymentsRelatedDocumentsDian paymentMethod(String paymentMethod) {
    
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;. 
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "**Note**: This field is not applicable for DIAN Colombia and will return `null`. ")

  public String getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(String paymentMethod) {
    
    this.paymentMethod = paymentMethod;
  }


  public InvoicesPaymentsRelatedDocumentsDian partialityNumber(Integer partialityNumber) {
    
    
    this.partialityNumber = partialityNumber;
    return this;
  }

   /**
   * **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;. 
   * @return partialityNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "**Note**: This field is not applicable for DIAN Colombia and will return `null`. ")

  public Integer getPartialityNumber() {
    return partialityNumber;
  }


  public void setPartialityNumber(Integer partialityNumber) {
    
    this.partialityNumber = partialityNumber;
  }


  public InvoicesPaymentsRelatedDocumentsDian previousBalance(Float previousBalance) {
    
    
    this.previousBalance = previousBalance;
    return this;
  }

   /**
   * **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;. 
   * @return previousBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "**Note**: This field is not applicable for DIAN Colombia and will return `null`. ")

  public Float getPreviousBalance() {
    return previousBalance;
  }


  public void setPreviousBalance(Float previousBalance) {
    
    this.previousBalance = previousBalance;
  }


  public InvoicesPaymentsRelatedDocumentsDian amountPaid(Float amountPaid) {
    
    
    this.amountPaid = amountPaid;
    return this;
  }

   /**
   * **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;. 
   * @return amountPaid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "**Note**: This field is not applicable for DIAN Colombia and will return `null`. ")

  public Float getAmountPaid() {
    return amountPaid;
  }


  public void setAmountPaid(Float amountPaid) {
    
    this.amountPaid = amountPaid;
  }


  public InvoicesPaymentsRelatedDocumentsDian outstandingBalance(Float outstandingBalance) {
    
    
    this.outstandingBalance = outstandingBalance;
    return this;
  }

   /**
   * **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;. 
   * @return outstandingBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "**Note**: This field is not applicable for DIAN Colombia and will return `null`. ")

  public Float getOutstandingBalance() {
    return outstandingBalance;
  }


  public void setOutstandingBalance(Float outstandingBalance) {
    
    this.outstandingBalance = outstandingBalance;
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
   * @return the InvoicesPaymentsRelatedDocumentsDian instance itself
   */
  public InvoicesPaymentsRelatedDocumentsDian putAdditionalProperty(String key, Object value) {
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
    InvoicesPaymentsRelatedDocumentsDian invoicesPaymentsRelatedDocumentsDian = (InvoicesPaymentsRelatedDocumentsDian) o;
    return Objects.equals(this.invoiceIdentification, invoicesPaymentsRelatedDocumentsDian.invoiceIdentification) &&
        Objects.equals(this.currency, invoicesPaymentsRelatedDocumentsDian.currency) &&
        Objects.equals(this.paymentMethod, invoicesPaymentsRelatedDocumentsDian.paymentMethod) &&
        Objects.equals(this.partialityNumber, invoicesPaymentsRelatedDocumentsDian.partialityNumber) &&
        Objects.equals(this.previousBalance, invoicesPaymentsRelatedDocumentsDian.previousBalance) &&
        Objects.equals(this.amountPaid, invoicesPaymentsRelatedDocumentsDian.amountPaid) &&
        Objects.equals(this.outstandingBalance, invoicesPaymentsRelatedDocumentsDian.outstandingBalance)&&
        Objects.equals(this.additionalProperties, invoicesPaymentsRelatedDocumentsDian.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceIdentification, currency, paymentMethod, partialityNumber, previousBalance, amountPaid, outstandingBalance, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoicesPaymentsRelatedDocumentsDian {\n");
    sb.append("    invoiceIdentification: ").append(toIndentedString(invoiceIdentification)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    partialityNumber: ").append(toIndentedString(partialityNumber)).append("\n");
    sb.append("    previousBalance: ").append(toIndentedString(previousBalance)).append("\n");
    sb.append("    amountPaid: ").append(toIndentedString(amountPaid)).append("\n");
    sb.append("    outstandingBalance: ").append(toIndentedString(outstandingBalance)).append("\n");
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
    openapiFields.add("invoice_identification");
    openapiFields.add("currency");
    openapiFields.add("payment_method");
    openapiFields.add("partiality_number");
    openapiFields.add("previous_balance");
    openapiFields.add("amount_paid");
    openapiFields.add("outstanding_balance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("invoice_identification");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("payment_method");
    openapiRequiredFields.add("previous_balance");
    openapiRequiredFields.add("amount_paid");
    openapiRequiredFields.add("outstanding_balance");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InvoicesPaymentsRelatedDocumentsDian
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InvoicesPaymentsRelatedDocumentsDian.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoicesPaymentsRelatedDocumentsDian is not found in the empty JSON string", InvoicesPaymentsRelatedDocumentsDian.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InvoicesPaymentsRelatedDocumentsDian.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("invoice_identification").isJsonNull() && !jsonObj.get("invoice_identification").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_identification` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_identification").toString()));
      }
      if (!jsonObj.get("currency").isJsonNull() && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if (!jsonObj.get("payment_method").isJsonNull() && !jsonObj.get("payment_method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_method").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoicesPaymentsRelatedDocumentsDian.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoicesPaymentsRelatedDocumentsDian' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoicesPaymentsRelatedDocumentsDian> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoicesPaymentsRelatedDocumentsDian.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoicesPaymentsRelatedDocumentsDian>() {
           @Override
           public void write(JsonWriter out, InvoicesPaymentsRelatedDocumentsDian value) throws IOException {
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
           public InvoicesPaymentsRelatedDocumentsDian read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             InvoicesPaymentsRelatedDocumentsDian instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of InvoicesPaymentsRelatedDocumentsDian given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvoicesPaymentsRelatedDocumentsDian
  * @throws IOException if the JSON string is invalid with respect to InvoicesPaymentsRelatedDocumentsDian
  */
  public static InvoicesPaymentsRelatedDocumentsDian fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoicesPaymentsRelatedDocumentsDian.class);
  }

 /**
  * Convert an instance of InvoicesPaymentsRelatedDocumentsDian to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

