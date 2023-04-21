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
import com.belvo.client.model.InvoicesPaymentsRelatedDocumentsSat;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
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
 * InvoicesPaymentsSat
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class InvoicesPaymentsSat {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private OffsetDateTime date;

  public static final String SERIALIZED_NAME_PAYMENT_TYPE = "payment_type";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TYPE)
  private String paymentType;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_EXCHANGE_RATE = "exchange_rate";
  @SerializedName(SERIALIZED_NAME_EXCHANGE_RATE)
  private String exchangeRate;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Float amount;

  public static final String SERIALIZED_NAME_OPERATION_NUMBER = "operation_number";
  @SerializedName(SERIALIZED_NAME_OPERATION_NUMBER)
  private String operationNumber;

  public static final String SERIALIZED_NAME_BENEFICIARY_RFC = "beneficiary_rfc";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_RFC)
  private String beneficiaryRfc;

  public static final String SERIALIZED_NAME_BENEFICIARY_ACCOUNT_NUMBER = "beneficiary_account_number";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_ACCOUNT_NUMBER)
  private String beneficiaryAccountNumber;

  public static final String SERIALIZED_NAME_PAYER_RFC = "payer_rfc";
  @SerializedName(SERIALIZED_NAME_PAYER_RFC)
  private String payerRfc;

  public static final String SERIALIZED_NAME_PAYER_ACCOUNT_NUMBER = "payer_account_number";
  @SerializedName(SERIALIZED_NAME_PAYER_ACCOUNT_NUMBER)
  private String payerAccountNumber;

  public static final String SERIALIZED_NAME_PAYER_BANK_NAME = "payer_bank_name";
  @SerializedName(SERIALIZED_NAME_PAYER_BANK_NAME)
  private String payerBankName;

  public static final String SERIALIZED_NAME_RELATED_DOCUMENTS = "related_documents";
  @SerializedName(SERIALIZED_NAME_RELATED_DOCUMENTS)
  private List<InvoicesPaymentsRelatedDocumentsSat> relatedDocuments = new ArrayList<>();

  public InvoicesPaymentsSat() {
  }

  public InvoicesPaymentsSat date(OffsetDateTime date) {
    
    
    this.date = date;
    return this;
  }

   /**
   * ISO-8601 timestamp when the payment was made. 
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-03-17T12:00Z", required = true, value = "ISO-8601 timestamp when the payment was made. ")

  public OffsetDateTime getDate() {
    return date;
  }


  public void setDate(OffsetDateTime date) {
    
    this.date = date;
  }


  public InvoicesPaymentsSat paymentType(String paymentType) {
    
    
    this.paymentType = paymentType;
    return this;
  }

   /**
   * Payment type code used for this invoice, as defined by the country&#39;s legal entity.  - 🇲🇽 Mexico [SAT catalog reference article](https://developers.belvo.com/docs/sat-catalogs#payment-type) 
   * @return paymentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "03", required = true, value = "Payment type code used for this invoice, as defined by the country's legal entity.  - 🇲🇽 Mexico [SAT catalog reference article](https://developers.belvo.com/docs/sat-catalogs#payment-type) ")

  public String getPaymentType() {
    return paymentType;
  }


  public void setPaymentType(String paymentType) {
    
    this.paymentType = paymentType;
  }


  public InvoicesPaymentsSat currency(String currency) {
    
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency of the payment. For example:  - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso)  Please note that other currencies other than in the list above may be returned. 
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BRL", required = true, value = "The currency of the payment. For example:  - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso)  Please note that other currencies other than in the list above may be returned. ")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    
    this.currency = currency;
  }


  public InvoicesPaymentsSat exchangeRate(String exchangeRate) {
    
    
    this.exchangeRate = exchangeRate;
    return this;
  }

   /**
   * The &#x60;currency&#x60; to MXN currency exchange rate when the payment was made. 
   * @return exchangeRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3.75", required = true, value = "The `currency` to MXN currency exchange rate when the payment was made. ")

  public String getExchangeRate() {
    return exchangeRate;
  }


  public void setExchangeRate(String exchangeRate) {
    
    this.exchangeRate = exchangeRate;
  }


  public InvoicesPaymentsSat amount(Float amount) {
    
    
    this.amount = amount;
    return this;
  }

   /**
   * The invoice amount, in the currency of the original invoice. 
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8000.5", required = true, value = "The invoice amount, in the currency of the original invoice. ")

  public Float getAmount() {
    return amount;
  }


  public void setAmount(Float amount) {
    
    this.amount = amount;
  }


  public InvoicesPaymentsSat operationNumber(String operationNumber) {
    
    
    this.operationNumber = operationNumber;
    return this;
  }

   /**
   * The fiscal institution&#39;s internal identifier for the operation. 
   * @return operationNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "831840", required = true, value = "The fiscal institution's internal identifier for the operation. ")

  public String getOperationNumber() {
    return operationNumber;
  }


  public void setOperationNumber(String operationNumber) {
    
    this.operationNumber = operationNumber;
  }


  public InvoicesPaymentsSat beneficiaryRfc(String beneficiaryRfc) {
    
    
    this.beneficiaryRfc = beneficiaryRfc;
    return this;
  }

   /**
   * The fiscal ID of the payment beneficiary. 
   * @return beneficiaryRfc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BNM840515VB1", value = "The fiscal ID of the payment beneficiary. ")

  public String getBeneficiaryRfc() {
    return beneficiaryRfc;
  }


  public void setBeneficiaryRfc(String beneficiaryRfc) {
    
    this.beneficiaryRfc = beneficiaryRfc;
  }


  public InvoicesPaymentsSat beneficiaryAccountNumber(String beneficiaryAccountNumber) {
    
    
    this.beneficiaryAccountNumber = beneficiaryAccountNumber;
    return this;
  }

   /**
   * The bank account number of the payment beneficiary. 
   * @return beneficiaryAccountNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12343453245633", required = true, value = "The bank account number of the payment beneficiary. ")

  public String getBeneficiaryAccountNumber() {
    return beneficiaryAccountNumber;
  }


  public void setBeneficiaryAccountNumber(String beneficiaryAccountNumber) {
    
    this.beneficiaryAccountNumber = beneficiaryAccountNumber;
  }


  public InvoicesPaymentsSat payerRfc(String payerRfc) {
    
    
    this.payerRfc = payerRfc;
    return this;
  }

   /**
   * The fiscal ID of the payment issuer. 
   * @return payerRfc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BKJM840515VB1", required = true, value = "The fiscal ID of the payment issuer. ")

  public String getPayerRfc() {
    return payerRfc;
  }


  public void setPayerRfc(String payerRfc) {
    
    this.payerRfc = payerRfc;
  }


  public InvoicesPaymentsSat payerAccountNumber(String payerAccountNumber) {
    
    
    this.payerAccountNumber = payerAccountNumber;
    return this;
  }

   /**
   * The bank account number of the payment issuer. 
   * @return payerAccountNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13343663245699", required = true, value = "The bank account number of the payment issuer. ")

  public String getPayerAccountNumber() {
    return payerAccountNumber;
  }


  public void setPayerAccountNumber(String payerAccountNumber) {
    
    this.payerAccountNumber = payerAccountNumber;
  }


  public InvoicesPaymentsSat payerBankName(String payerBankName) {
    
    
    this.payerBankName = payerBankName;
    return this;
  }

   /**
   * The banking institution that was used by the payment issuer. 
   * @return payerBankName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CITI BANAMEX", required = true, value = "The banking institution that was used by the payment issuer. ")

  public String getPayerBankName() {
    return payerBankName;
  }


  public void setPayerBankName(String payerBankName) {
    
    this.payerBankName = payerBankName;
  }


  public InvoicesPaymentsSat relatedDocuments(List<InvoicesPaymentsRelatedDocumentsSat> relatedDocuments) {
    
    
    this.relatedDocuments = relatedDocuments;
    return this;
  }

  public InvoicesPaymentsSat addRelatedDocumentsItem(InvoicesPaymentsRelatedDocumentsSat relatedDocumentsItem) {
    this.relatedDocuments.add(relatedDocumentsItem);
    return this;
  }

   /**
   * A list of all the related deferred invoices affected by the payment. 
   * @return relatedDocuments
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of all the related deferred invoices affected by the payment. ")

  public List<InvoicesPaymentsRelatedDocumentsSat> getRelatedDocuments() {
    return relatedDocuments;
  }


  public void setRelatedDocuments(List<InvoicesPaymentsRelatedDocumentsSat> relatedDocuments) {
    
    this.relatedDocuments = relatedDocuments;
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
   * @return the InvoicesPaymentsSat instance itself
   */
  public InvoicesPaymentsSat putAdditionalProperty(String key, Object value) {
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
    InvoicesPaymentsSat invoicesPaymentsSat = (InvoicesPaymentsSat) o;
    return Objects.equals(this.date, invoicesPaymentsSat.date) &&
        Objects.equals(this.paymentType, invoicesPaymentsSat.paymentType) &&
        Objects.equals(this.currency, invoicesPaymentsSat.currency) &&
        Objects.equals(this.exchangeRate, invoicesPaymentsSat.exchangeRate) &&
        Objects.equals(this.amount, invoicesPaymentsSat.amount) &&
        Objects.equals(this.operationNumber, invoicesPaymentsSat.operationNumber) &&
        Objects.equals(this.beneficiaryRfc, invoicesPaymentsSat.beneficiaryRfc) &&
        Objects.equals(this.beneficiaryAccountNumber, invoicesPaymentsSat.beneficiaryAccountNumber) &&
        Objects.equals(this.payerRfc, invoicesPaymentsSat.payerRfc) &&
        Objects.equals(this.payerAccountNumber, invoicesPaymentsSat.payerAccountNumber) &&
        Objects.equals(this.payerBankName, invoicesPaymentsSat.payerBankName) &&
        Objects.equals(this.relatedDocuments, invoicesPaymentsSat.relatedDocuments)&&
        Objects.equals(this.additionalProperties, invoicesPaymentsSat.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, paymentType, currency, exchangeRate, amount, operationNumber, beneficiaryRfc, beneficiaryAccountNumber, payerRfc, payerAccountNumber, payerBankName, relatedDocuments, additionalProperties);
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
    sb.append("class InvoicesPaymentsSat {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    operationNumber: ").append(toIndentedString(operationNumber)).append("\n");
    sb.append("    beneficiaryRfc: ").append(toIndentedString(beneficiaryRfc)).append("\n");
    sb.append("    beneficiaryAccountNumber: ").append(toIndentedString(beneficiaryAccountNumber)).append("\n");
    sb.append("    payerRfc: ").append(toIndentedString(payerRfc)).append("\n");
    sb.append("    payerAccountNumber: ").append(toIndentedString(payerAccountNumber)).append("\n");
    sb.append("    payerBankName: ").append(toIndentedString(payerBankName)).append("\n");
    sb.append("    relatedDocuments: ").append(toIndentedString(relatedDocuments)).append("\n");
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
    openapiFields.add("date");
    openapiFields.add("payment_type");
    openapiFields.add("currency");
    openapiFields.add("exchange_rate");
    openapiFields.add("amount");
    openapiFields.add("operation_number");
    openapiFields.add("beneficiary_rfc");
    openapiFields.add("beneficiary_account_number");
    openapiFields.add("payer_rfc");
    openapiFields.add("payer_account_number");
    openapiFields.add("payer_bank_name");
    openapiFields.add("related_documents");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("date");
    openapiRequiredFields.add("payment_type");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("exchange_rate");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("operation_number");
    openapiRequiredFields.add("beneficiary_account_number");
    openapiRequiredFields.add("payer_rfc");
    openapiRequiredFields.add("payer_account_number");
    openapiRequiredFields.add("payer_bank_name");
    openapiRequiredFields.add("related_documents");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InvoicesPaymentsSat
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InvoicesPaymentsSat.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoicesPaymentsSat is not found in the empty JSON string", InvoicesPaymentsSat.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InvoicesPaymentsSat.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("payment_type").isJsonNull() && !jsonObj.get("payment_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_type").toString()));
      }
      if (!jsonObj.get("currency").isJsonNull() && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if (!jsonObj.get("exchange_rate").isJsonNull() && !jsonObj.get("exchange_rate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exchange_rate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exchange_rate").toString()));
      }
      if (!jsonObj.get("operation_number").isJsonNull() && !jsonObj.get("operation_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operation_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operation_number").toString()));
      }
      if (!jsonObj.get("beneficiary_rfc").isJsonNull() && (jsonObj.get("beneficiary_rfc") != null && !jsonObj.get("beneficiary_rfc").isJsonNull()) && !jsonObj.get("beneficiary_rfc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beneficiary_rfc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beneficiary_rfc").toString()));
      }
      if (!jsonObj.get("beneficiary_account_number").isJsonNull() && !jsonObj.get("beneficiary_account_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beneficiary_account_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beneficiary_account_number").toString()));
      }
      if (!jsonObj.get("payer_rfc").isJsonNull() && !jsonObj.get("payer_rfc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payer_rfc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payer_rfc").toString()));
      }
      if (!jsonObj.get("payer_account_number").isJsonNull() && !jsonObj.get("payer_account_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payer_account_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payer_account_number").toString()));
      }
      if (!jsonObj.get("payer_bank_name").isJsonNull() && !jsonObj.get("payer_bank_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payer_bank_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payer_bank_name").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("related_documents").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `related_documents` to be an array in the JSON string but got `%s`", jsonObj.get("related_documents").toString()));
      }

      JsonArray jsonArrayrelatedDocuments = jsonObj.getAsJsonArray("related_documents");
      // validate the required field `related_documents` (array)
      for (int i = 0; i < jsonArrayrelatedDocuments.size(); i++) {
        InvoicesPaymentsRelatedDocumentsSat.validateJsonObject(jsonArrayrelatedDocuments.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoicesPaymentsSat.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoicesPaymentsSat' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoicesPaymentsSat> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoicesPaymentsSat.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoicesPaymentsSat>() {
           @Override
           public void write(JsonWriter out, InvoicesPaymentsSat value) throws IOException {
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
           public InvoicesPaymentsSat read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             InvoicesPaymentsSat instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of InvoicesPaymentsSat given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvoicesPaymentsSat
  * @throws IOException if the JSON string is invalid with respect to InvoicesPaymentsSat
  */
  public static InvoicesPaymentsSat fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoicesPaymentsSat.class);
  }

 /**
  * Convert an instance of InvoicesPaymentsSat to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

