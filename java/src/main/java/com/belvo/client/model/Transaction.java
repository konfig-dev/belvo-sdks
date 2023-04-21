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
import com.belvo.client.model.Account;
import com.belvo.client.model.EnumTransactionCategory;
import com.belvo.client.model.EnumTransactionStatus;
import com.belvo.client.model.EnumTransactionSubcategory;
import com.belvo.client.model.EnumTransactionType;
import com.belvo.client.model.TransactionCreditCardData;
import com.belvo.client.model.TransactionMerchantData;
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
import java.util.UUID;
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
 * Transaction
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Transaction {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_INTERNAL_IDENTIFICATION = "internal_identification";
  @SerializedName(SERIALIZED_NAME_INTERNAL_IDENTIFICATION)
  private String internalIdentification;

  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private Account account;

  public static final String SERIALIZED_NAME_COLLECTED_AT = "collected_at";
  @SerializedName(SERIALIZED_NAME_COLLECTED_AT)
  private OffsetDateTime collectedAt;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_VALUE_DATE = "value_date";
  @SerializedName(SERIALIZED_NAME_VALUE_DATE)
  private LocalDate valueDate;

  public static final String SERIALIZED_NAME_ACCOUNTING_DATE = "accounting_date";
  @SerializedName(SERIALIZED_NAME_ACCOUNTING_DATE)
  private OffsetDateTime accountingDate;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Float amount;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private Float balance;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_OBSERVATIONS = "observations";
  @SerializedName(SERIALIZED_NAME_OBSERVATIONS)
  private String observations;

  public static final String SERIALIZED_NAME_MERCHANT = "merchant";
  @SerializedName(SERIALIZED_NAME_MERCHANT)
  private TransactionMerchantData merchant;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private EnumTransactionCategory category;

  public static final String SERIALIZED_NAME_SUBCATEGORY = "subcategory";
  @SerializedName(SERIALIZED_NAME_SUBCATEGORY)
  private EnumTransactionSubcategory subcategory;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private EnumTransactionType type;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private EnumTransactionStatus status;

  public static final String SERIALIZED_NAME_CREDIT_CARD_DATA = "credit_card_data";
  @SerializedName(SERIALIZED_NAME_CREDIT_CARD_DATA)
  private TransactionCreditCardData creditCardData;

  public Transaction() {
  }

  public Transaction description(String description) {
    
    
    this.description = description;
    return this;
  }

   /**
   * The description of transaction provided by the institution. Usually this is the text that the end user sees in the online platform.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SEVEN BUDDHAS RFC:XXXXXXXXXX", required = true, value = "The description of transaction provided by the institution. Usually this is the text that the end user sees in the online platform.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    this.description = description;
  }


  public Transaction id(UUID id) {
    
    
    this.id = id;
    return this;
  }

   /**
   * Belvo&#39;s unique ID for the transaction.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "076c66e5-90f5-4e01-99c7-50e32f65ae42", value = "Belvo's unique ID for the transaction.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    
    this.id = id;
  }


  public Transaction internalIdentification(String internalIdentification) {
    
    
    this.internalIdentification = internalIdentification;
    return this;
  }

   /**
   * The institution&#39;s internal identification for the transaction. 
   * @return internalIdentification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TXpRMU9UQTROMWhZV2xSU1FUazJSMDl", value = "The institution's internal identification for the transaction. ")

  public String getInternalIdentification() {
    return internalIdentification;
  }


  public void setInternalIdentification(String internalIdentification) {
    
    this.internalIdentification = internalIdentification;
  }


  public Transaction account(Account account) {
    
    
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Account getAccount() {
    return account;
  }


  public void setAccount(Account account) {
    
    this.account = account;
  }


  public Transaction collectedAt(OffsetDateTime collectedAt) {
    
    
    this.collectedAt = collectedAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp when the data point was collected.
   * @return collectedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-11-28T10:27:44.813Z", required = true, value = "The ISO-8601 timestamp when the data point was collected.")

  public OffsetDateTime getCollectedAt() {
    return collectedAt;
  }


  public void setCollectedAt(OffsetDateTime collectedAt) {
    
    this.collectedAt = collectedAt;
  }


  public Transaction createdAt(OffsetDateTime createdAt) {
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp of when the data point was last updated in Belvo&#39;s database.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-02-09T08:45:50.406032Z", value = "The ISO-8601 timestamp of when the data point was last updated in Belvo's database.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
  }


  public Transaction valueDate(LocalDate valueDate) {
    
    
    this.valueDate = valueDate;
    return this;
  }

   /**
   * The date when the transaction occurred, in &#x60;YYYY-MM-DD&#x60; format.
   * @return valueDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Tue Oct 22 17:00:00 PDT 2019", required = true, value = "The date when the transaction occurred, in `YYYY-MM-DD` format.")

  public LocalDate getValueDate() {
    return valueDate;
  }


  public void setValueDate(LocalDate valueDate) {
    
    this.valueDate = valueDate;
  }


  public Transaction accountingDate(OffsetDateTime accountingDate) {
    
    
    this.accountingDate = accountingDate;
    return this;
  }

   /**
   * The ISO timestamp when the transaction was processed and accounted for by the institution.
   * @return accountingDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-10-23T13:01:41.941Z", required = true, value = "The ISO timestamp when the transaction was processed and accounted for by the institution.")

  public OffsetDateTime getAccountingDate() {
    return accountingDate;
  }


  public void setAccountingDate(OffsetDateTime accountingDate) {
    
    this.accountingDate = accountingDate;
  }


  public Transaction amount(Float amount) {
    
    
    this.amount = amount;
    return this;
  }

   /**
   * The transaction amount. ℹ️ The amount displayed is always positive as we indicate the direction of the transaction in the &#x60;type&#x60; parameter. 
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2145.45", required = true, value = "The transaction amount. ℹ️ The amount displayed is always positive as we indicate the direction of the transaction in the `type` parameter. ")

  public Float getAmount() {
    return amount;
  }


  public void setAmount(Float amount) {
    
    this.amount = amount;
  }


  public Transaction balance(Float balance) {
    
    
    this.balance = balance;
    return this;
  }

   /**
   * The balance at the end of the transaction.
   * @return balance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "16907.96", required = true, value = "The balance at the end of the transaction.")

  public Float getBalance() {
    return balance;
  }


  public void setBalance(Float balance) {
    
    this.balance = balance;
  }


  public Transaction currency(String currency) {
    
    
    this.currency = currency;
    return this;
  }

   /**
   * The three-letter currency code (ISO-4217). 
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BRL", required = true, value = "The three-letter currency code (ISO-4217). ")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    
    this.currency = currency;
  }


  public Transaction observations(String observations) {
    
    
    this.observations = observations;
    return this;
  }

   /**
   * Additional observations provided by the institution on the transaction.
   * @return observations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OPTIONAL OBSERVATIONS", required = true, value = "Additional observations provided by the institution on the transaction.")

  public String getObservations() {
    return observations;
  }


  public void setObservations(String observations) {
    
    this.observations = observations;
  }


  public Transaction merchant(TransactionMerchantData merchant) {
    
    
    this.merchant = merchant;
    return this;
  }

   /**
   * Get merchant
   * @return merchant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public TransactionMerchantData getMerchant() {
    return merchant;
  }


  public void setMerchant(TransactionMerchantData merchant) {
    
    this.merchant = merchant;
  }


  public Transaction category(EnumTransactionCategory category) {
    
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public EnumTransactionCategory getCategory() {
    return category;
  }


  public void setCategory(EnumTransactionCategory category) {
    
    this.category = category;
  }


  public Transaction subcategory(EnumTransactionSubcategory subcategory) {
    
    
    this.subcategory = subcategory;
    return this;
  }

   /**
   * Get subcategory
   * @return subcategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumTransactionSubcategory getSubcategory() {
    return subcategory;
  }


  public void setSubcategory(EnumTransactionSubcategory subcategory) {
    
    this.subcategory = subcategory;
  }


  public Transaction reference(String reference) {
    
    
    this.reference = reference;
    return this;
  }

   /**
   * The reference number of the transaction, provided by the bank.
   * @return reference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8703", required = true, value = "The reference number of the transaction, provided by the bank.")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    
    this.reference = reference;
  }


  public Transaction type(EnumTransactionType type) {
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public EnumTransactionType getType() {
    return type;
  }


  public void setType(EnumTransactionType type) {
    
    this.type = type;
  }


  public Transaction status(EnumTransactionStatus status) {
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public EnumTransactionStatus getStatus() {
    return status;
  }


  public void setStatus(EnumTransactionStatus status) {
    
    this.status = status;
  }


  public Transaction creditCardData(TransactionCreditCardData creditCardData) {
    
    
    this.creditCardData = creditCardData;
    return this;
  }

   /**
   * Get creditCardData
   * @return creditCardData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransactionCreditCardData getCreditCardData() {
    return creditCardData;
  }


  public void setCreditCardData(TransactionCreditCardData creditCardData) {
    
    this.creditCardData = creditCardData;
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
   * @return the Transaction instance itself
   */
  public Transaction putAdditionalProperty(String key, Object value) {
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
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.description, transaction.description) &&
        Objects.equals(this.id, transaction.id) &&
        Objects.equals(this.internalIdentification, transaction.internalIdentification) &&
        Objects.equals(this.account, transaction.account) &&
        Objects.equals(this.collectedAt, transaction.collectedAt) &&
        Objects.equals(this.createdAt, transaction.createdAt) &&
        Objects.equals(this.valueDate, transaction.valueDate) &&
        Objects.equals(this.accountingDate, transaction.accountingDate) &&
        Objects.equals(this.amount, transaction.amount) &&
        Objects.equals(this.balance, transaction.balance) &&
        Objects.equals(this.currency, transaction.currency) &&
        Objects.equals(this.observations, transaction.observations) &&
        Objects.equals(this.merchant, transaction.merchant) &&
        Objects.equals(this.category, transaction.category) &&
        Objects.equals(this.subcategory, transaction.subcategory) &&
        Objects.equals(this.reference, transaction.reference) &&
        Objects.equals(this.type, transaction.type) &&
        Objects.equals(this.status, transaction.status) &&
        Objects.equals(this.creditCardData, transaction.creditCardData)&&
        Objects.equals(this.additionalProperties, transaction.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, internalIdentification, account, collectedAt, createdAt, valueDate, accountingDate, amount, balance, currency, observations, merchant, category, subcategory, reference, type, status, creditCardData, additionalProperties);
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
    sb.append("class Transaction {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    internalIdentification: ").append(toIndentedString(internalIdentification)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    collectedAt: ").append(toIndentedString(collectedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
    sb.append("    accountingDate: ").append(toIndentedString(accountingDate)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    observations: ").append(toIndentedString(observations)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    subcategory: ").append(toIndentedString(subcategory)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    creditCardData: ").append(toIndentedString(creditCardData)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("internal_identification");
    openapiFields.add("account");
    openapiFields.add("collected_at");
    openapiFields.add("created_at");
    openapiFields.add("value_date");
    openapiFields.add("accounting_date");
    openapiFields.add("amount");
    openapiFields.add("balance");
    openapiFields.add("currency");
    openapiFields.add("observations");
    openapiFields.add("merchant");
    openapiFields.add("category");
    openapiFields.add("subcategory");
    openapiFields.add("reference");
    openapiFields.add("type");
    openapiFields.add("status");
    openapiFields.add("credit_card_data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("account");
    openapiRequiredFields.add("collected_at");
    openapiRequiredFields.add("value_date");
    openapiRequiredFields.add("accounting_date");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("balance");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("observations");
    openapiRequiredFields.add("merchant");
    openapiRequiredFields.add("category");
    openapiRequiredFields.add("reference");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("status");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Transaction
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Transaction.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Transaction is not found in the empty JSON string", Transaction.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Transaction.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("description").isJsonNull() && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("internal_identification").isJsonNull() && (jsonObj.get("internal_identification") != null && !jsonObj.get("internal_identification").isJsonNull()) && !jsonObj.get("internal_identification").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `internal_identification` to be a primitive type in the JSON string but got `%s`", jsonObj.get("internal_identification").toString()));
      }
      // validate the required field `account`
      Account.validateJsonObject(jsonObj.getAsJsonObject("account"));
      if (!jsonObj.get("currency").isJsonNull() && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if (!jsonObj.get("observations").isJsonNull() && !jsonObj.get("observations").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `observations` to be a primitive type in the JSON string but got `%s`", jsonObj.get("observations").toString()));
      }
      // validate the required field `merchant`
      TransactionMerchantData.validateJsonObject(jsonObj.getAsJsonObject("merchant"));
      if (!jsonObj.get("reference").isJsonNull() && !jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
      // validate the optional field `credit_card_data`
      if (jsonObj.get("credit_card_data") != null && !jsonObj.get("credit_card_data").isJsonNull()) {
        TransactionCreditCardData.validateJsonObject(jsonObj.getAsJsonObject("credit_card_data"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Transaction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Transaction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Transaction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Transaction.class));

       return (TypeAdapter<T>) new TypeAdapter<Transaction>() {
           @Override
           public void write(JsonWriter out, Transaction value) throws IOException {
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
           public Transaction read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Transaction instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Transaction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Transaction
  * @throws IOException if the JSON string is invalid with respect to Transaction
  */
  public static Transaction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Transaction.class);
  }

 /**
  * Convert an instance of Transaction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

