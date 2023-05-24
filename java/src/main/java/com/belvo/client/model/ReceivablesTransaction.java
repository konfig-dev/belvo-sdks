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
import com.belvo.client.model.EnumReceivableTransactionStatus;
import com.belvo.client.model.EnumReceivableTransactionType;
import com.belvo.client.model.ReceivablesTransactionAccount;
import com.belvo.client.model.ReceivablesTransactionNumberOfInstallments;
import com.belvo.client.model.RecevablesTransactionFees;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
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
 * ReceivablesTransaction
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ReceivablesTransaction {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private ReceivablesTransactionAccount account;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_COLLECTED_AT = "collected_at";
  @SerializedName(SERIALIZED_NAME_COLLECTED_AT)
  private OffsetDateTime collectedAt;

  public static final String SERIALIZED_NAME_VALUE_HOUR = "value_hour";
  @SerializedName(SERIALIZED_NAME_VALUE_HOUR)
  private String valueHour;

  public static final String SERIALIZED_NAME_VALUE_DATE = "value_date";
  @SerializedName(SERIALIZED_NAME_VALUE_DATE)
  private LocalDate valueDate;

  public static final String SERIALIZED_NAME_INSTITUTION_TRANSACTION_ID = "institution_transaction_id";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_TRANSACTION_ID)
  private String institutionTransactionId;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private EnumReceivableTransactionType type;

  public static final String SERIALIZED_NAME_GROSS_AMOUNT = "gross_amount";
  @SerializedName(SERIALIZED_NAME_GROSS_AMOUNT)
  private Float grossAmount;

  public static final String SERIALIZED_NAME_NET_AMOUNT = "net_amount";
  @SerializedName(SERIALIZED_NAME_NET_AMOUNT)
  private Float netAmount;

  public static final String SERIALIZED_NAME_FEES = "fees";
  @SerializedName(SERIALIZED_NAME_FEES)
  private List<RecevablesTransactionFees> fees = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private EnumReceivableTransactionStatus status;

  public static final String SERIALIZED_NAME_NUMBER_OF_INSTALLMENTS = "number_of_installments";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_INSTALLMENTS)
  private ReceivablesTransactionNumberOfInstallments numberOfInstallments;

  public ReceivablesTransaction() {
  }

  
  public ReceivablesTransaction(
     UUID id
  ) {
    this();
    this.id = id;
  }

   /**
   * Belvo&#39;s unique ID for the current receivable transaction.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "30cb4806-6e00-48a4-91c9-ca55968576c8", required = true, value = "Belvo's unique ID for the current receivable transaction.")

  public UUID getId() {
    return id;
  }




  public ReceivablesTransaction account(ReceivablesTransactionAccount account) {

    
    
    
    
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ReceivablesTransactionAccount getAccount() {
    return account;
  }


  public void setAccount(ReceivablesTransactionAccount account) {

    
    
    
    this.account = account;
  }


  public ReceivablesTransaction createdAt(OffsetDateTime createdAt) {

    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The ISO timestamp of when the data point was last updated in Belvo&#39;s database.
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2020-04-23T21:30:20.336854Z", required = true, value = "The ISO timestamp of when the data point was last updated in Belvo's database.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {

    
    
    
    this.createdAt = createdAt;
  }


  public ReceivablesTransaction collectedAt(OffsetDateTime collectedAt) {

    
    
    
    
    this.collectedAt = collectedAt;
    return this;
  }

   /**
   * The ISO timestamp when the data point was collected.
   * @return collectedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2020-04-23T21:32:55.336854Z", required = true, value = "The ISO timestamp when the data point was collected.")

  public OffsetDateTime getCollectedAt() {
    return collectedAt;
  }


  public void setCollectedAt(OffsetDateTime collectedAt) {

    
    
    
    this.collectedAt = collectedAt;
  }


  public ReceivablesTransaction valueHour(String valueHour) {

    
    
    
    
    this.valueHour = valueHour;
    return this;
  }

   /**
   * The time that the transaction occurred, according to the institution, in &#x60;HH:MM&#x60; format.
   * @return valueHour
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1187", required = true, value = "The time that the transaction occurred, according to the institution, in `HH:MM` format.")

  public String getValueHour() {
    return valueHour;
  }


  public void setValueHour(String valueHour) {

    
    
    
    this.valueHour = valueHour;
  }


  public ReceivablesTransaction valueDate(LocalDate valueDate) {

    
    
    
    
    this.valueDate = valueDate;
    return this;
  }

   /**
   * The date that the transactions occurred, according to the institution, in &#x60;YYYY-MM-DD&#x60; format.
   * @return valueDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Sat Jan 15 16:00:00 PST 2022", required = true, value = "The date that the transactions occurred, according to the institution, in `YYYY-MM-DD` format.")

  public LocalDate getValueDate() {
    return valueDate;
  }


  public void setValueDate(LocalDate valueDate) {

    
    
    
    this.valueDate = valueDate;
  }


  public ReceivablesTransaction institutionTransactionId(String institutionTransactionId) {

    
    
    
    
    this.institutionTransactionId = institutionTransactionId;
    return this;
  }

   /**
   * Internal identification number that the acquirer uses to identify the transaction. ℹ️ **Note**: For Brazil, this number is the NSU.
   * @return institutionTransactionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "134532345", required = true, value = "Internal identification number that the acquirer uses to identify the transaction. ℹ️ **Note**: For Brazil, this number is the NSU.")

  public String getInstitutionTransactionId() {
    return institutionTransactionId;
  }


  public void setInstitutionTransactionId(String institutionTransactionId) {

    
    
    
    this.institutionTransactionId = institutionTransactionId;
  }


  public ReceivablesTransaction currency(String currency) {

    
    
    
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency of the transaction. For example: - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso)   Please note that currencies other than those listed above may be returned.
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "BRL", required = true, value = "The currency of the transaction. For example: - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso)   Please note that currencies other than those listed above may be returned.")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {

    
    
    
    this.currency = currency;
  }


  public ReceivablesTransaction type(EnumReceivableTransactionType type) {

    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public EnumReceivableTransactionType getType() {
    return type;
  }


  public void setType(EnumReceivableTransactionType type) {

    
    
    
    this.type = type;
  }


  public ReceivablesTransaction grossAmount(Float grossAmount) {

    
    
    
    
    this.grossAmount = grossAmount;
    return this;
  }

   /**
   * The total gross amount of the transaction.
   * @return grossAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "106.7", required = true, value = "The total gross amount of the transaction.")

  public Float getGrossAmount() {
    return grossAmount;
  }


  public void setGrossAmount(Float grossAmount) {

    
    
    
    this.grossAmount = grossAmount;
  }


  public ReceivablesTransaction netAmount(Float netAmount) {

    
    
    
    
    this.netAmount = netAmount;
    return this;
  }

   /**
   * The net amount of the transaction.
   * @return netAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "104.58", required = true, value = "The net amount of the transaction.")

  public Float getNetAmount() {
    return netAmount;
  }


  public void setNetAmount(Float netAmount) {

    
    
    
    this.netAmount = netAmount;
  }


  public ReceivablesTransaction fees(List<RecevablesTransactionFees> fees) {

    
    
    
    
    this.fees = fees;
    return this;
  }

  public ReceivablesTransaction addFeesItem(RecevablesTransactionFees feesItem) {
    this.fees.add(feesItem);
    return this;
  }

   /**
   * Get fees
   * @return fees
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<RecevablesTransactionFees> getFees() {
    return fees;
  }


  public void setFees(List<RecevablesTransactionFees> fees) {

    
    
    
    this.fees = fees;
  }


  public ReceivablesTransaction status(EnumReceivableTransactionStatus status) {

    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public EnumReceivableTransactionStatus getStatus() {
    return status;
  }


  public void setStatus(EnumReceivableTransactionStatus status) {

    
    
    
    this.status = status;
  }


  public ReceivablesTransaction numberOfInstallments(ReceivablesTransactionNumberOfInstallments numberOfInstallments) {

    
    
    
    
    this.numberOfInstallments = numberOfInstallments;
    return this;
  }

   /**
   * Get numberOfInstallments
   * @return numberOfInstallments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public ReceivablesTransactionNumberOfInstallments getNumberOfInstallments() {
    return numberOfInstallments;
  }


  public void setNumberOfInstallments(ReceivablesTransactionNumberOfInstallments numberOfInstallments) {

    
    
    
    this.numberOfInstallments = numberOfInstallments;
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
   * @return the ReceivablesTransaction instance itself
   */
  public ReceivablesTransaction putAdditionalProperty(String key, Object value) {
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
    ReceivablesTransaction receivablesTransaction = (ReceivablesTransaction) o;
    return Objects.equals(this.id, receivablesTransaction.id) &&
        Objects.equals(this.account, receivablesTransaction.account) &&
        Objects.equals(this.createdAt, receivablesTransaction.createdAt) &&
        Objects.equals(this.collectedAt, receivablesTransaction.collectedAt) &&
        Objects.equals(this.valueHour, receivablesTransaction.valueHour) &&
        Objects.equals(this.valueDate, receivablesTransaction.valueDate) &&
        Objects.equals(this.institutionTransactionId, receivablesTransaction.institutionTransactionId) &&
        Objects.equals(this.currency, receivablesTransaction.currency) &&
        Objects.equals(this.type, receivablesTransaction.type) &&
        Objects.equals(this.grossAmount, receivablesTransaction.grossAmount) &&
        Objects.equals(this.netAmount, receivablesTransaction.netAmount) &&
        Objects.equals(this.fees, receivablesTransaction.fees) &&
        Objects.equals(this.status, receivablesTransaction.status) &&
        Objects.equals(this.numberOfInstallments, receivablesTransaction.numberOfInstallments)&&
        Objects.equals(this.additionalProperties, receivablesTransaction.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, account, createdAt, collectedAt, valueHour, valueDate, institutionTransactionId, currency, type, grossAmount, netAmount, fees, status, numberOfInstallments, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceivablesTransaction {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    collectedAt: ").append(toIndentedString(collectedAt)).append("\n");
    sb.append("    valueHour: ").append(toIndentedString(valueHour)).append("\n");
    sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
    sb.append("    institutionTransactionId: ").append(toIndentedString(institutionTransactionId)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    grossAmount: ").append(toIndentedString(grossAmount)).append("\n");
    sb.append("    netAmount: ").append(toIndentedString(netAmount)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    numberOfInstallments: ").append(toIndentedString(numberOfInstallments)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("account");
    openapiFields.add("created_at");
    openapiFields.add("collected_at");
    openapiFields.add("value_hour");
    openapiFields.add("value_date");
    openapiFields.add("institution_transaction_id");
    openapiFields.add("currency");
    openapiFields.add("type");
    openapiFields.add("gross_amount");
    openapiFields.add("net_amount");
    openapiFields.add("fees");
    openapiFields.add("status");
    openapiFields.add("number_of_installments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("account");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("collected_at");
    openapiRequiredFields.add("value_hour");
    openapiRequiredFields.add("value_date");
    openapiRequiredFields.add("institution_transaction_id");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("gross_amount");
    openapiRequiredFields.add("net_amount");
    openapiRequiredFields.add("fees");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("number_of_installments");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReceivablesTransaction
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReceivablesTransaction.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReceivablesTransaction is not found in the empty JSON string", ReceivablesTransaction.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReceivablesTransaction.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the required field `account`
      ReceivablesTransactionAccount.validateJsonObject(jsonObj.getAsJsonObject("account"));
      if (!jsonObj.get("value_hour").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value_hour` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value_hour").toString()));
      }
      if (!jsonObj.get("institution_transaction_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `institution_transaction_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("institution_transaction_id").toString()));
      }
      if (!jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("fees").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `fees` to be an array in the JSON string but got `%s`", jsonObj.get("fees").toString()));
      }

      JsonArray jsonArrayfees = jsonObj.getAsJsonArray("fees");
      // validate the required field `fees` (array)
      for (int i = 0; i < jsonArrayfees.size(); i++) {
        RecevablesTransactionFees.validateJsonObject(jsonArrayfees.get(i).getAsJsonObject());
      };
      // validate the required field `number_of_installments`
      ReceivablesTransactionNumberOfInstallments.validateJsonObject(jsonObj.getAsJsonObject("number_of_installments"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReceivablesTransaction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReceivablesTransaction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReceivablesTransaction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReceivablesTransaction.class));

       return (TypeAdapter<T>) new TypeAdapter<ReceivablesTransaction>() {
           @Override
           public void write(JsonWriter out, ReceivablesTransaction value) throws IOException {
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
           public ReceivablesTransaction read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ReceivablesTransaction instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ReceivablesTransaction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReceivablesTransaction
  * @throws IOException if the JSON string is invalid with respect to ReceivablesTransaction
  */
  public static ReceivablesTransaction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReceivablesTransaction.class);
  }

 /**
  * Convert an instance of ReceivablesTransaction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

