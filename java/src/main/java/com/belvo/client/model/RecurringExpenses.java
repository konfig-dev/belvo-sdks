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
import com.belvo.client.model.EnumRecurringExpenseCategory;
import com.belvo.client.model.EnumRecurringExpenseFrequency;
import com.belvo.client.model.EnumRecurringExpensePaymentType;
import com.belvo.client.model.RecurringExpenseSourceTransaction;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * Recurring expense insights.   ℹ️ If no recurring expense insights are found, we return an empty array. 
 */
@ApiModel(description = "Recurring expense insights.   ℹ️ If no recurring expense insights are found, we return an empty array. ")
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class RecurringExpenses {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private Account account;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TRANSACTIONS = "transactions";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS)
  private List<RecurringExpenseSourceTransaction> transactions = new ArrayList<>();

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  private EnumRecurringExpenseFrequency frequency = EnumRecurringExpenseFrequency.MONTHLY;

  public static final String SERIALIZED_NAME_AVERAGE_TRANSACTION_AMOUNT = "average_transaction_amount";
  @SerializedName(SERIALIZED_NAME_AVERAGE_TRANSACTION_AMOUNT)
  private Float averageTransactionAmount;

  public static final String SERIALIZED_NAME_MEDIAN_TRANSACTION_AMOUNT = "median_transaction_amount";
  @SerializedName(SERIALIZED_NAME_MEDIAN_TRANSACTION_AMOUNT)
  private Float medianTransactionAmount;

  public static final String SERIALIZED_NAME_DAYS_SINCE_LAST_TRANSACTION = "days_since_last_transaction";
  @SerializedName(SERIALIZED_NAME_DAYS_SINCE_LAST_TRANSACTION)
  private Integer daysSinceLastTransaction;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private EnumRecurringExpenseCategory category;

  public static final String SERIALIZED_NAME_PAYMENT_TYPE = "payment_type";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TYPE)
  private EnumRecurringExpensePaymentType paymentType;

  public RecurringExpenses() {
  }

  public RecurringExpenses id(UUID id) {

    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Belvo&#39;s unique identifier used to reference the current recurring expense.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "076c66e5-90f5-4e01-99c7-50e32f65ae42", value = "Belvo's unique identifier used to reference the current recurring expense.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {

    
    
    
    this.id = id;
  }


  public RecurringExpenses account(Account account) {

    
    
    
    
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


  public RecurringExpenses name(String name) {

    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name for the recurring expense.  ℹ️ **Note**: This information is taken from the description section of a transaction and then normalized to provide you with an easy-to-read name. As such, sometimes the name will reflect the merchant the payment is made to (for example, Netflix.com), while for other recurring expenses, this could be something like \&quot;Monthly payment to John\&quot;. 
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Netflix", required = true, value = "The name for the recurring expense.  ℹ️ **Note**: This information is taken from the description section of a transaction and then normalized to provide you with an easy-to-read name. As such, sometimes the name will reflect the merchant the payment is made to (for example, Netflix.com), while for other recurring expenses, this could be something like \"Monthly payment to John\". ")

  public String getName() {
    return name;
  }


  public void setName(String name) {

    
    
    
    this.name = name;
  }


  public RecurringExpenses transactions(List<RecurringExpenseSourceTransaction> transactions) {

    
    
    
    
    this.transactions = transactions;
    return this;
  }

  public RecurringExpenses addTransactionsItem(RecurringExpenseSourceTransaction transactionsItem) {
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * An array of minified transaction objects used to evaluate the recurring expense. If no transactions were found, we return an empty array.
   * @return transactions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "An array of minified transaction objects used to evaluate the recurring expense. If no transactions were found, we return an empty array.")

  public List<RecurringExpenseSourceTransaction> getTransactions() {
    return transactions;
  }


  public void setTransactions(List<RecurringExpenseSourceTransaction> transactions) {

    
    
    
    this.transactions = transactions;
  }


  public RecurringExpenses frequency(EnumRecurringExpenseFrequency frequency) {

    
    
    
    
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EnumRecurringExpenseFrequency getFrequency() {
    return frequency;
  }


  public void setFrequency(EnumRecurringExpenseFrequency frequency) {

    
    
    
    this.frequency = frequency;
  }


  public RecurringExpenses averageTransactionAmount(Float averageTransactionAmount) {

    
    
    
    
    this.averageTransactionAmount = averageTransactionAmount;
    return this;
  }

   /**
   * The average transaction amount of the recurring expense.
   * @return averageTransactionAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "32.9", required = true, value = "The average transaction amount of the recurring expense.")

  public Float getAverageTransactionAmount() {
    return averageTransactionAmount;
  }


  public void setAverageTransactionAmount(Float averageTransactionAmount) {

    
    
    
    this.averageTransactionAmount = averageTransactionAmount;
  }


  public RecurringExpenses medianTransactionAmount(Float medianTransactionAmount) {

    
    
    
    
    this.medianTransactionAmount = medianTransactionAmount;
    return this;
  }

   /**
   * The median transaction amount of the recurring expense.
   * @return medianTransactionAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "32.9", required = true, value = "The median transaction amount of the recurring expense.")

  public Float getMedianTransactionAmount() {
    return medianTransactionAmount;
  }


  public void setMedianTransactionAmount(Float medianTransactionAmount) {

    
    
    
    this.medianTransactionAmount = medianTransactionAmount;
  }


  public RecurringExpenses daysSinceLastTransaction(Integer daysSinceLastTransaction) {

    
    
    
    
    this.daysSinceLastTransaction = daysSinceLastTransaction;
    return this;
  }

   /**
   * Number of days since the last recurring expense occurred.  Based on the frequency, you can infer how many days until the next charge will occur. 
   * @return daysSinceLastTransaction
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5", required = true, value = "Number of days since the last recurring expense occurred.  Based on the frequency, you can infer how many days until the next charge will occur. ")

  public Integer getDaysSinceLastTransaction() {
    return daysSinceLastTransaction;
  }


  public void setDaysSinceLastTransaction(Integer daysSinceLastTransaction) {

    
    
    
    this.daysSinceLastTransaction = daysSinceLastTransaction;
  }


  public RecurringExpenses category(EnumRecurringExpenseCategory category) {

    
    
    
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EnumRecurringExpenseCategory getCategory() {
    return category;
  }


  public void setCategory(EnumRecurringExpenseCategory category) {

    
    
    
    this.category = category;
  }


  public RecurringExpenses paymentType(EnumRecurringExpensePaymentType paymentType) {

    
    
    
    
    this.paymentType = paymentType;
    return this;
  }

   /**
   * Get paymentType
   * @return paymentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public EnumRecurringExpensePaymentType getPaymentType() {
    return paymentType;
  }


  public void setPaymentType(EnumRecurringExpensePaymentType paymentType) {

    
    
    
    this.paymentType = paymentType;
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
   * @return the RecurringExpenses instance itself
   */
  public RecurringExpenses putAdditionalProperty(String key, Object value) {
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
    RecurringExpenses recurringExpenses = (RecurringExpenses) o;
    return Objects.equals(this.id, recurringExpenses.id) &&
        Objects.equals(this.account, recurringExpenses.account) &&
        Objects.equals(this.name, recurringExpenses.name) &&
        Objects.equals(this.transactions, recurringExpenses.transactions) &&
        Objects.equals(this.frequency, recurringExpenses.frequency) &&
        Objects.equals(this.averageTransactionAmount, recurringExpenses.averageTransactionAmount) &&
        Objects.equals(this.medianTransactionAmount, recurringExpenses.medianTransactionAmount) &&
        Objects.equals(this.daysSinceLastTransaction, recurringExpenses.daysSinceLastTransaction) &&
        Objects.equals(this.category, recurringExpenses.category) &&
        Objects.equals(this.paymentType, recurringExpenses.paymentType)&&
        Objects.equals(this.additionalProperties, recurringExpenses.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, account, name, transactions, frequency, averageTransactionAmount, medianTransactionAmount, daysSinceLastTransaction, category, paymentType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringExpenses {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    averageTransactionAmount: ").append(toIndentedString(averageTransactionAmount)).append("\n");
    sb.append("    medianTransactionAmount: ").append(toIndentedString(medianTransactionAmount)).append("\n");
    sb.append("    daysSinceLastTransaction: ").append(toIndentedString(daysSinceLastTransaction)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("transactions");
    openapiFields.add("frequency");
    openapiFields.add("average_transaction_amount");
    openapiFields.add("median_transaction_amount");
    openapiFields.add("days_since_last_transaction");
    openapiFields.add("category");
    openapiFields.add("payment_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("account");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("transactions");
    openapiRequiredFields.add("frequency");
    openapiRequiredFields.add("average_transaction_amount");
    openapiRequiredFields.add("median_transaction_amount");
    openapiRequiredFields.add("days_since_last_transaction");
    openapiRequiredFields.add("category");
    openapiRequiredFields.add("payment_type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RecurringExpenses
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RecurringExpenses.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecurringExpenses is not found in the empty JSON string", RecurringExpenses.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RecurringExpenses.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the required field `account`
      Account.validateJsonObject(jsonObj.getAsJsonObject("account"));
      if (!jsonObj.get("name").isJsonNull() && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("transactions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactions` to be an array in the JSON string but got `%s`", jsonObj.get("transactions").toString()));
      }

      JsonArray jsonArraytransactions = jsonObj.getAsJsonArray("transactions");
      // validate the required field `transactions` (array)
      for (int i = 0; i < jsonArraytransactions.size(); i++) {
        RecurringExpenseSourceTransaction.validateJsonObject(jsonArraytransactions.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecurringExpenses.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecurringExpenses' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecurringExpenses> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecurringExpenses.class));

       return (TypeAdapter<T>) new TypeAdapter<RecurringExpenses>() {
           @Override
           public void write(JsonWriter out, RecurringExpenses value) throws IOException {
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
           public RecurringExpenses read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RecurringExpenses instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RecurringExpenses given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RecurringExpenses
  * @throws IOException if the JSON string is invalid with respect to RecurringExpenses
  */
  public static RecurringExpenses fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecurringExpenses.class);
  }

 /**
  * Convert an instance of RecurringExpenses to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

