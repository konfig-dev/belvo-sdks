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
import com.belvo.client.model.EnumPaymentLinkAllowedPaymentMethod;
import com.belvo.client.model.EnumPaymentLinkProvider;
import com.belvo.client.model.EnumPaymentsCurrency;
import com.belvo.client.model.PaymentTransaction;
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
 * Charge
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Charge {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_CREATED_BY = "created_by";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private UUID createdBy;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private UUID customer;

  public static final String SERIALIZED_NAME_FAILURE_CODE = "failure_code";
  @SerializedName(SERIALIZED_NAME_FAILURE_CODE)
  private String failureCode;

  public static final String SERIALIZED_NAME_FAILURE_MESSAGE = "failure_message";
  @SerializedName(SERIALIZED_NAME_FAILURE_MESSAGE)
  private String failureMessage;

  /**
   * The current status of the charge. 
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PENDING("PENDING"),
    
    SUCCEEDED("SUCCEEDED"),
    
    FAILED("FAILED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private EnumPaymentsCurrency currency;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public static final String SERIALIZED_NAME_BENEFICIARY = "beneficiary";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY)
  private UUID beneficiary;

  public static final String SERIALIZED_NAME_PROVIDER = "provider";
  @SerializedName(SERIALIZED_NAME_PROVIDER)
  private EnumPaymentLinkProvider provider;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD_TYPE = "payment_method_type";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD_TYPE)
  private EnumPaymentLinkAllowedPaymentMethod paymentMethodType;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD_DETAILS = "payment_method_details";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD_DETAILS)
  private Object paymentMethodDetails = null;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD_INFORMATION = "payment_method_information";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD_INFORMATION)
  private Object paymentMethodInformation = null;

  public static final String SERIALIZED_NAME_PAYMENT_INTENT = "payment_intent";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INTENT)
  private UUID paymentIntent;

  public static final String SERIALIZED_NAME_TRANSACTIONS = "transactions";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS)
  private List<PaymentTransaction> transactions = null;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public Charge() {
  }

  public Charge description(String description) {
    
    
    this.description = description;
    return this;
  }

   /**
   * The description of the payment. 
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Training shoes", value = "The description of the payment. ")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    this.description = description;
  }


  public Charge id(UUID id) {
    
    
    this.id = id;
    return this;
  }

   /**
   * Belvo&#39;s unique ID for the current charge.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1c83ead8-6665-429c-a17a-ddc76cb3a95e", required = true, value = "Belvo's unique ID for the current charge.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    
    this.id = id;
  }


  public Charge createdAt(OffsetDateTime createdAt) {
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp of when the data point was last updated in Belvo&#39;s database.
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2022-02-09T08:45:50.406032Z", required = true, value = "The ISO-8601 timestamp of when the data point was last updated in Belvo's database.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
  }


  public Charge createdBy(UUID createdBy) {
    
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Belvo&#39;s unique ID for the user that created the charge.
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1c83ead8-6665-429c-a17a-ddc76cb3a95e", value = "Belvo's unique ID for the user that created the charge.")

  public UUID getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(UUID createdBy) {
    
    this.createdBy = createdBy;
  }


  public Charge customer(UUID customer) {
    
    
    this.customer = customer;
    return this;
  }

   /**
   * Belvo&#39;s unique ID for the customer that the charge was created for.
   * @return customer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "531aa631-70a0-4eeb-ab97-51dea3e90c89", value = "Belvo's unique ID for the customer that the charge was created for.")

  public UUID getCustomer() {
    return customer;
  }


  public void setCustomer(UUID customer) {
    
    this.customer = customer;
  }


  public Charge failureCode(String failureCode) {
    
    
    this.failureCode = failureCode;
    return this;
  }

   /**
   * Error code that explains the reason behind a payment being unsuccessful (if applicable). 
   * @return failureCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Error code that explains the reason behind a payment being unsuccessful (if applicable). ")

  public String getFailureCode() {
    return failureCode;
  }


  public void setFailureCode(String failureCode) {
    
    this.failureCode = failureCode;
  }


  public Charge failureMessage(String failureMessage) {
    
    
    this.failureMessage = failureMessage;
    return this;
  }

   /**
   * Further information regarding the &#x60;failure_code&#x60;. 
   * @return failureMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Further information regarding the `failure_code`. ")

  public String getFailureMessage() {
    return failureMessage;
  }


  public void setFailureMessage(String failureMessage) {
    
    this.failureMessage = failureMessage;
  }


  public Charge status(StatusEnum status) {
    
    
    this.status = status;
    return this;
  }

   /**
   * The current status of the charge. 
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "PENDING", required = true, value = "The current status of the charge. ")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    this.status = status;
  }


  public Charge amount(String amount) {
    
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount of the charge. 
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100.12", required = true, value = "The amount of the charge. ")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    
    this.amount = amount;
  }


  public Charge currency(EnumPaymentsCurrency currency) {
    
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumPaymentsCurrency getCurrency() {
    return currency;
  }


  public void setCurrency(EnumPaymentsCurrency currency) {
    
    this.currency = currency;
  }


  public Charge metadata(Object metadata) {
    
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Optional and customizable object where you can provide any additional key-value pairs for your internal purposes. For example, an internal reference number.  ⚠️ **Note**: You can only provide up to 50 keys (keys can have up to 50 characters each and each value can be up to 500 characters). We do not support nested objects, only ASCII values.
   * @return metadata
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "{\"internal_reference_id\":\"GGq73487w2\"}", required = true, value = "Optional and customizable object where you can provide any additional key-value pairs for your internal purposes. For example, an internal reference number.  ⚠️ **Note**: You can only provide up to 50 keys (keys can have up to 50 characters each and each value can be up to 500 characters). We do not support nested objects, only ASCII values.")

  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    
    this.metadata = metadata;
  }


  public Charge beneficiary(UUID beneficiary) {
    
    
    this.beneficiary = beneficiary;
    return this;
  }

   /**
   * Belvo&#39;s unique ID used to identify the beneficiary’s bank account.
   * @return beneficiary
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "58524ccc-89ac-4ab6-b62b-c3da3f19a722", required = true, value = "Belvo's unique ID used to identify the beneficiary’s bank account.")

  public UUID getBeneficiary() {
    return beneficiary;
  }


  public void setBeneficiary(UUID beneficiary) {
    
    this.beneficiary = beneficiary;
  }


  public Charge provider(EnumPaymentLinkProvider provider) {
    
    
    this.provider = provider;
    return this;
  }

   /**
   * Get provider
   * @return provider
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EnumPaymentLinkProvider getProvider() {
    return provider;
  }


  public void setProvider(EnumPaymentLinkProvider provider) {
    
    this.provider = provider;
  }


  public Charge paymentMethodType(EnumPaymentLinkAllowedPaymentMethod paymentMethodType) {
    
    
    this.paymentMethodType = paymentMethodType;
    return this;
  }

   /**
   * Get paymentMethodType
   * @return paymentMethodType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumPaymentLinkAllowedPaymentMethod getPaymentMethodType() {
    return paymentMethodType;
  }


  public void setPaymentMethodType(EnumPaymentLinkAllowedPaymentMethod paymentMethodType) {
    
    this.paymentMethodType = paymentMethodType;
  }


  public Charge paymentMethodDetails(Object paymentMethodDetails) {
    
    
    this.paymentMethodDetails = paymentMethodDetails;
    return this;
  }

   /**
   * Get paymentMethodDetails
   * @return paymentMethodDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Object getPaymentMethodDetails() {
    return paymentMethodDetails;
  }


  public void setPaymentMethodDetails(Object paymentMethodDetails) {
    
    this.paymentMethodDetails = paymentMethodDetails;
  }


  public Charge paymentMethodInformation(Object paymentMethodInformation) {
    
    
    this.paymentMethodInformation = paymentMethodInformation;
    return this;
  }

   /**
   * Get paymentMethodInformation
   * @return paymentMethodInformation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Object getPaymentMethodInformation() {
    return paymentMethodInformation;
  }


  public void setPaymentMethodInformation(Object paymentMethodInformation) {
    
    this.paymentMethodInformation = paymentMethodInformation;
  }


  public Charge paymentIntent(UUID paymentIntent) {
    
    
    this.paymentIntent = paymentIntent;
    return this;
  }

   /**
   * The &#x60;payment_intent.id&#x60; associated with this charge.
   * @return paymentIntent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "50c04229-7b1d-4a53-951c-8ad53e10c6ca", value = "The `payment_intent.id` associated with this charge.")

  public UUID getPaymentIntent() {
    return paymentIntent;
  }


  public void setPaymentIntent(UUID paymentIntent) {
    
    this.paymentIntent = paymentIntent;
  }


  public Charge transactions(List<PaymentTransaction> transactions) {
    
    
    this.transactions = transactions;
    return this;
  }

  public Charge addTransactionsItem(PaymentTransaction transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<>();
    }
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * An array of Transaction objects relating to the charge.
   * @return transactions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of Transaction objects relating to the charge.")

  public List<PaymentTransaction> getTransactions() {
    return transactions;
  }


  public void setTransactions(List<PaymentTransaction> transactions) {
    
    this.transactions = transactions;
  }


  public Charge updatedAt(OffsetDateTime updatedAt) {
    
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp of when the status of the charge was last updated. 
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-02-09T08:45:50.406032Z", required = true, value = "The ISO-8601 timestamp of when the status of the charge was last updated. ")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
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
   * @return the Charge instance itself
   */
  public Charge putAdditionalProperty(String key, Object value) {
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
    Charge charge = (Charge) o;
    return Objects.equals(this.description, charge.description) &&
        Objects.equals(this.id, charge.id) &&
        Objects.equals(this.createdAt, charge.createdAt) &&
        Objects.equals(this.createdBy, charge.createdBy) &&
        Objects.equals(this.customer, charge.customer) &&
        Objects.equals(this.failureCode, charge.failureCode) &&
        Objects.equals(this.failureMessage, charge.failureMessage) &&
        Objects.equals(this.status, charge.status) &&
        Objects.equals(this.amount, charge.amount) &&
        Objects.equals(this.currency, charge.currency) &&
        Objects.equals(this.metadata, charge.metadata) &&
        Objects.equals(this.beneficiary, charge.beneficiary) &&
        Objects.equals(this.provider, charge.provider) &&
        Objects.equals(this.paymentMethodType, charge.paymentMethodType) &&
        Objects.equals(this.paymentMethodDetails, charge.paymentMethodDetails) &&
        Objects.equals(this.paymentMethodInformation, charge.paymentMethodInformation) &&
        Objects.equals(this.paymentIntent, charge.paymentIntent) &&
        Objects.equals(this.transactions, charge.transactions) &&
        Objects.equals(this.updatedAt, charge.updatedAt)&&
        Objects.equals(this.additionalProperties, charge.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, createdAt, createdBy, customer, failureCode, failureMessage, status, amount, currency, metadata, beneficiary, provider, paymentMethodType, paymentMethodDetails, paymentMethodInformation, paymentIntent, transactions, updatedAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Charge {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    failureCode: ").append(toIndentedString(failureCode)).append("\n");
    sb.append("    failureMessage: ").append(toIndentedString(failureMessage)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    beneficiary: ").append(toIndentedString(beneficiary)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    paymentMethodType: ").append(toIndentedString(paymentMethodType)).append("\n");
    sb.append("    paymentMethodDetails: ").append(toIndentedString(paymentMethodDetails)).append("\n");
    sb.append("    paymentMethodInformation: ").append(toIndentedString(paymentMethodInformation)).append("\n");
    sb.append("    paymentIntent: ").append(toIndentedString(paymentIntent)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("created_at");
    openapiFields.add("created_by");
    openapiFields.add("customer");
    openapiFields.add("failure_code");
    openapiFields.add("failure_message");
    openapiFields.add("status");
    openapiFields.add("amount");
    openapiFields.add("currency");
    openapiFields.add("metadata");
    openapiFields.add("beneficiary");
    openapiFields.add("provider");
    openapiFields.add("payment_method_type");
    openapiFields.add("payment_method_details");
    openapiFields.add("payment_method_information");
    openapiFields.add("payment_intent");
    openapiFields.add("transactions");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("failure_code");
    openapiRequiredFields.add("failure_message");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("metadata");
    openapiRequiredFields.add("beneficiary");
    openapiRequiredFields.add("provider");
    openapiRequiredFields.add("payment_method_details");
    openapiRequiredFields.add("payment_method_information");
    openapiRequiredFields.add("updated_at");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Charge
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Charge.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Charge is not found in the empty JSON string", Charge.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Charge.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("created_by") != null && !jsonObj.get("created_by").isJsonNull()) && !jsonObj.get("created_by").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_by` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_by").toString()));
      }
      if ((jsonObj.get("customer") != null && !jsonObj.get("customer").isJsonNull()) && !jsonObj.get("customer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer").toString()));
      }
      if (!jsonObj.get("failure_code").isJsonNull() && !jsonObj.get("failure_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `failure_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("failure_code").toString()));
      }
      if (!jsonObj.get("failure_message").isJsonNull() && !jsonObj.get("failure_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `failure_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("failure_message").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (!jsonObj.get("amount").isJsonNull() && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (!jsonObj.get("beneficiary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beneficiary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beneficiary").toString()));
      }
      if ((jsonObj.get("payment_intent") != null && !jsonObj.get("payment_intent").isJsonNull()) && !jsonObj.get("payment_intent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_intent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_intent").toString()));
      }
      if (jsonObj.get("transactions") != null && !jsonObj.get("transactions").isJsonNull()) {
        JsonArray jsonArraytransactions = jsonObj.getAsJsonArray("transactions");
        if (jsonArraytransactions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("transactions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `transactions` to be an array in the JSON string but got `%s`", jsonObj.get("transactions").toString()));
          }

          // validate the optional field `transactions` (array)
          for (int i = 0; i < jsonArraytransactions.size(); i++) {
            PaymentTransaction.validateJsonObject(jsonArraytransactions.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Charge.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Charge' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Charge> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Charge.class));

       return (TypeAdapter<T>) new TypeAdapter<Charge>() {
           @Override
           public void write(JsonWriter out, Charge value) throws IOException {
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
           public Charge read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Charge instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Charge given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Charge
  * @throws IOException if the JSON string is invalid with respect to Charge
  */
  public static Charge fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Charge.class);
  }

 /**
  * Convert an instance of Charge to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

