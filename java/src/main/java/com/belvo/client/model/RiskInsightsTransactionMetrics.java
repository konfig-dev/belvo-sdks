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
 * Aggregated metrics calculated band on the user&#39;s transactions from checking, savings, credit card, and loan accounts.
 */
@ApiModel(description = "Aggregated metrics calculated band on the user's transactions from checking, savings, credit card, and loan accounts.")
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class RiskInsightsTransactionMetrics {
  public static final String SERIALIZED_NAME_NUM_TRANSACTIONS1W = "num_transactions_1w";
  @SerializedName(SERIALIZED_NAME_NUM_TRANSACTIONS1W)
  private Integer numTransactions1w = 0;

  public static final String SERIALIZED_NAME_NUM_TRANSACTIONS1M = "num_transactions_1m";
  @SerializedName(SERIALIZED_NAME_NUM_TRANSACTIONS1M)
  private Integer numTransactions1m = 0;

  public static final String SERIALIZED_NAME_NUM_TRANSACTIONS3M = "num_transactions_3m";
  @SerializedName(SERIALIZED_NAME_NUM_TRANSACTIONS3M)
  private Integer numTransactions3m = 0;

  public static final String SERIALIZED_NAME_NUM_INCOMING_TRANSACTIONS1W = "num_incoming_transactions_1w";
  @SerializedName(SERIALIZED_NAME_NUM_INCOMING_TRANSACTIONS1W)
  private Integer numIncomingTransactions1w = 0;

  public static final String SERIALIZED_NAME_NUM_INCOMING_TRANSACTIONS1M = "num_incoming_transactions_1m";
  @SerializedName(SERIALIZED_NAME_NUM_INCOMING_TRANSACTIONS1M)
  private Integer numIncomingTransactions1m = 0;

  public static final String SERIALIZED_NAME_NUM_INCOMING_TRANSACTIONS3M = "num_incoming_transactions_3m";
  @SerializedName(SERIALIZED_NAME_NUM_INCOMING_TRANSACTIONS3M)
  private Integer numIncomingTransactions3m = 0;

  public static final String SERIALIZED_NAME_NUM_OUTGOING_TRANSACTIONS1W = "num_outgoing_transactions_1w";
  @SerializedName(SERIALIZED_NAME_NUM_OUTGOING_TRANSACTIONS1W)
  private Integer numOutgoingTransactions1w = 0;

  public static final String SERIALIZED_NAME_NUM_OUTGOING_TRANSACTIONS1M = "num_outgoing_transactions_1m";
  @SerializedName(SERIALIZED_NAME_NUM_OUTGOING_TRANSACTIONS1M)
  private Integer numOutgoingTransactions1m = 0;

  public static final String SERIALIZED_NAME_NUM_OUTGOING_TRANSACTIONS3M = "num_outgoing_transactions_3m";
  @SerializedName(SERIALIZED_NAME_NUM_OUTGOING_TRANSACTIONS3M)
  private Integer numOutgoingTransactions3m = 0;

  public static final String SERIALIZED_NAME_SUM_INCOMING_AMOUNT1W = "sum_incoming_amount_1w";
  @SerializedName(SERIALIZED_NAME_SUM_INCOMING_AMOUNT1W)
  private Float sumIncomingAmount1w;

  public static final String SERIALIZED_NAME_SUM_INCOMING_AMOUNT1M = "sum_incoming_amount_1m";
  @SerializedName(SERIALIZED_NAME_SUM_INCOMING_AMOUNT1M)
  private Float sumIncomingAmount1m;

  public static final String SERIALIZED_NAME_SUM_INCOMING_AMOUNT3M = "sum_incoming_amount_3m";
  @SerializedName(SERIALIZED_NAME_SUM_INCOMING_AMOUNT3M)
  private Float sumIncomingAmount3m;

  public static final String SERIALIZED_NAME_SUM_OUTGOING_AMOUNT1W = "sum_outgoing_amount_1w";
  @SerializedName(SERIALIZED_NAME_SUM_OUTGOING_AMOUNT1W)
  private Float sumOutgoingAmount1w;

  public static final String SERIALIZED_NAME_SUM_OUTGOING_AMOUNT1M = "sum_outgoing_amount_1m";
  @SerializedName(SERIALIZED_NAME_SUM_OUTGOING_AMOUNT1M)
  private Float sumOutgoingAmount1m;

  public static final String SERIALIZED_NAME_SUM_OUTGOING_AMOUNT3M = "sum_outgoing_amount_3m";
  @SerializedName(SERIALIZED_NAME_SUM_OUTGOING_AMOUNT3M)
  private Float sumOutgoingAmount3m;

  public static final String SERIALIZED_NAME_MAX_INCOMING_AMOUNT1W = "max_incoming_amount_1w";
  @SerializedName(SERIALIZED_NAME_MAX_INCOMING_AMOUNT1W)
  private Float maxIncomingAmount1w;

  public static final String SERIALIZED_NAME_MAX_INCOMING_AMOUNT1M = "max_incoming_amount_1m";
  @SerializedName(SERIALIZED_NAME_MAX_INCOMING_AMOUNT1M)
  private Float maxIncomingAmount1m;

  public static final String SERIALIZED_NAME_MAX_INCOMING_AMOUNT3M = "max_incoming_amount_3m";
  @SerializedName(SERIALIZED_NAME_MAX_INCOMING_AMOUNT3M)
  private Float maxIncomingAmount3m;

  public static final String SERIALIZED_NAME_MAX_OUTGOING_AMOUNT1W = "max_outgoing_amount_1w";
  @SerializedName(SERIALIZED_NAME_MAX_OUTGOING_AMOUNT1W)
  private Float maxOutgoingAmount1w;

  public static final String SERIALIZED_NAME_MAX_OUTGOING_AMOUNT1M = "max_outgoing_amount_1m";
  @SerializedName(SERIALIZED_NAME_MAX_OUTGOING_AMOUNT1M)
  private Float maxOutgoingAmount1m;

  public static final String SERIALIZED_NAME_MAX_OUTGOING_AMOUNT3M = "max_outgoing_amount_3m";
  @SerializedName(SERIALIZED_NAME_MAX_OUTGOING_AMOUNT3M)
  private Float maxOutgoingAmount3m;

  public static final String SERIALIZED_NAME_MEAN_INCOMING_AMOUNT1W = "mean_incoming_amount_1w";
  @SerializedName(SERIALIZED_NAME_MEAN_INCOMING_AMOUNT1W)
  private Float meanIncomingAmount1w;

  public static final String SERIALIZED_NAME_MEAN_INCOMING_AMOUNT1M = "mean_incoming_amount_1m";
  @SerializedName(SERIALIZED_NAME_MEAN_INCOMING_AMOUNT1M)
  private Float meanIncomingAmount1m;

  public static final String SERIALIZED_NAME_MEAN_INCOMING_AMOUNT3M = "mean_incoming_amount_3m";
  @SerializedName(SERIALIZED_NAME_MEAN_INCOMING_AMOUNT3M)
  private Float meanIncomingAmount3m;

  public static final String SERIALIZED_NAME_MEAN_OUTGOING_AMOUNT1W = "mean_outgoing_amount_1w";
  @SerializedName(SERIALIZED_NAME_MEAN_OUTGOING_AMOUNT1W)
  private Float meanOutgoingAmount1w;

  public static final String SERIALIZED_NAME_MEAN_OUTGOING_AMOUNT1M = "mean_outgoing_amount_1m";
  @SerializedName(SERIALIZED_NAME_MEAN_OUTGOING_AMOUNT1M)
  private Float meanOutgoingAmount1m;

  public static final String SERIALIZED_NAME_MEAN_OUTGOING_AMOUNT3M = "mean_outgoing_amount_3m";
  @SerializedName(SERIALIZED_NAME_MEAN_OUTGOING_AMOUNT3M)
  private Float meanOutgoingAmount3m;

  public RiskInsightsTransactionMetrics() {
  }

  public RiskInsightsTransactionMetrics numTransactions1w(Integer numTransactions1w) {
    
    
    this.numTransactions1w = numTransactions1w;
    return this;
  }

   /**
   * The total number of transactions analyzed to determine the risk insights for the last week (incoming and outgoing). 
   * @return numTransactions1w
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "39", required = true, value = "The total number of transactions analyzed to determine the risk insights for the last week (incoming and outgoing). ")

  public Integer getNumTransactions1w() {
    return numTransactions1w;
  }


  public void setNumTransactions1w(Integer numTransactions1w) {
    
    this.numTransactions1w = numTransactions1w;
  }


  public RiskInsightsTransactionMetrics numTransactions1m(Integer numTransactions1m) {
    
    
    this.numTransactions1m = numTransactions1m;
    return this;
  }

   /**
   * The total number of transactions analyzed to determine the risk insights for the last month (incoming and outgoing). 
   * @return numTransactions1m
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "39", required = true, value = "The total number of transactions analyzed to determine the risk insights for the last month (incoming and outgoing). ")

  public Integer getNumTransactions1m() {
    return numTransactions1m;
  }


  public void setNumTransactions1m(Integer numTransactions1m) {
    
    this.numTransactions1m = numTransactions1m;
  }


  public RiskInsightsTransactionMetrics numTransactions3m(Integer numTransactions3m) {
    
    
    this.numTransactions3m = numTransactions3m;
    return this;
  }

   /**
   * The total number of transactions analyzed to determine the risk insights for the last three months (incoming and outgoing). 
   * @return numTransactions3m
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "39", required = true, value = "The total number of transactions analyzed to determine the risk insights for the last three months (incoming and outgoing). ")

  public Integer getNumTransactions3m() {
    return numTransactions3m;
  }


  public void setNumTransactions3m(Integer numTransactions3m) {
    
    this.numTransactions3m = numTransactions3m;
  }


  public RiskInsightsTransactionMetrics numIncomingTransactions1w(Integer numIncomingTransactions1w) {
    
    
    this.numIncomingTransactions1w = numIncomingTransactions1w;
    return this;
  }

   /**
   * The total number of inflow transactions for the last week.  ℹ️ **Note**: If there are no transactions between the request date and the last seven or thirty days, the value is &#x60;0&#x60;.  If the account has not been open long enough to have the transaction data for a given period, we return &#x60;null&#x60;. For example, if the account has only been open for five days, we return values for &#x60;_1w&#x60; and &#x60;_1m&#x60;, however, the value for &#x60;_3m&#x60; will be &#x60;null&#x60;. 
   * @return numIncomingTransactions1w
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "20", required = true, value = "The total number of inflow transactions for the last week.  ℹ️ **Note**: If there are no transactions between the request date and the last seven or thirty days, the value is `0`.  If the account has not been open long enough to have the transaction data for a given period, we return `null`. For example, if the account has only been open for five days, we return values for `_1w` and `_1m`, however, the value for `_3m` will be `null`. ")

  public Integer getNumIncomingTransactions1w() {
    return numIncomingTransactions1w;
  }


  public void setNumIncomingTransactions1w(Integer numIncomingTransactions1w) {
    
    this.numIncomingTransactions1w = numIncomingTransactions1w;
  }


  public RiskInsightsTransactionMetrics numIncomingTransactions1m(Integer numIncomingTransactions1m) {
    
    
    this.numIncomingTransactions1m = numIncomingTransactions1m;
    return this;
  }

   /**
   * The total number of inflow transactions for the last month.  ℹ️ **Note**: If there are no transactions between the request date and the last seven or thirty days, the value is &#x60;0&#x60;.  If the account has not been open long enough to have the transaction data for a given period, we return &#x60;null&#x60;. For example, if the account has only been open for five days, we return values for &#x60;_1w&#x60; and &#x60;_1m&#x60;, however, the value for &#x60;_3m&#x60; will be &#x60;null&#x60;. 
   * @return numIncomingTransactions1m
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "20", required = true, value = "The total number of inflow transactions for the last month.  ℹ️ **Note**: If there are no transactions between the request date and the last seven or thirty days, the value is `0`.  If the account has not been open long enough to have the transaction data for a given period, we return `null`. For example, if the account has only been open for five days, we return values for `_1w` and `_1m`, however, the value for `_3m` will be `null`. ")

  public Integer getNumIncomingTransactions1m() {
    return numIncomingTransactions1m;
  }


  public void setNumIncomingTransactions1m(Integer numIncomingTransactions1m) {
    
    this.numIncomingTransactions1m = numIncomingTransactions1m;
  }


  public RiskInsightsTransactionMetrics numIncomingTransactions3m(Integer numIncomingTransactions3m) {
    
    
    this.numIncomingTransactions3m = numIncomingTransactions3m;
    return this;
  }

   /**
   * The total number of inflow transactions for the last three months.  ℹ️ **Note**: If there are no transactions between the request date and the last seven or thirty days, the value is &#x60;0&#x60;.  If the account has not been open long enough to have the transaction data for a given period, we return &#x60;null&#x60;. For example, if the account has only been open for five days, we return values for &#x60;_1w&#x60; and &#x60;_1m&#x60;, however, the value for &#x60;_3m&#x60; will be &#x60;null&#x60;. 
   * @return numIncomingTransactions3m
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "20", required = true, value = "The total number of inflow transactions for the last three months.  ℹ️ **Note**: If there are no transactions between the request date and the last seven or thirty days, the value is `0`.  If the account has not been open long enough to have the transaction data for a given period, we return `null`. For example, if the account has only been open for five days, we return values for `_1w` and `_1m`, however, the value for `_3m` will be `null`. ")

  public Integer getNumIncomingTransactions3m() {
    return numIncomingTransactions3m;
  }


  public void setNumIncomingTransactions3m(Integer numIncomingTransactions3m) {
    
    this.numIncomingTransactions3m = numIncomingTransactions3m;
  }


  public RiskInsightsTransactionMetrics numOutgoingTransactions1w(Integer numOutgoingTransactions1w) {
    
    
    this.numOutgoingTransactions1w = numOutgoingTransactions1w;
    return this;
  }

   /**
   * To total number of outflow transactions in the last week.  ℹ️ **Note**: If there are no transactions between the request date and the last seven or thirty days, the value is &#x60;0&#x60;.  If the account has not been open long enough to have the transaction data for a given period, we return &#x60;null&#x60;. For example, if the account has only been open for five days, we return values for &#x60;_1w&#x60; and &#x60;_1m&#x60;, however, the value for &#x60;_3m&#x60; will be &#x60;null&#x60;. 
   * @return numOutgoingTransactions1w
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "19", required = true, value = "To total number of outflow transactions in the last week.  ℹ️ **Note**: If there are no transactions between the request date and the last seven or thirty days, the value is `0`.  If the account has not been open long enough to have the transaction data for a given period, we return `null`. For example, if the account has only been open for five days, we return values for `_1w` and `_1m`, however, the value for `_3m` will be `null`. ")

  public Integer getNumOutgoingTransactions1w() {
    return numOutgoingTransactions1w;
  }


  public void setNumOutgoingTransactions1w(Integer numOutgoingTransactions1w) {
    
    this.numOutgoingTransactions1w = numOutgoingTransactions1w;
  }


  public RiskInsightsTransactionMetrics numOutgoingTransactions1m(Integer numOutgoingTransactions1m) {
    
    
    this.numOutgoingTransactions1m = numOutgoingTransactions1m;
    return this;
  }

   /**
   * To total number of outflow transactions in the last month.  ℹ️ **Note**: If there are no transactions between the request date and the last seven or thirty days, the value is &#x60;0&#x60;.  If the account has not been open long enough to have the transaction data for a given period, we return &#x60;null&#x60;. For example, if the account has only been open for five days, we return values for &#x60;_1w&#x60; and &#x60;_1m&#x60;, however, the value for &#x60;_3m&#x60; will be &#x60;null&#x60;. 
   * @return numOutgoingTransactions1m
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "19", required = true, value = "To total number of outflow transactions in the last month.  ℹ️ **Note**: If there are no transactions between the request date and the last seven or thirty days, the value is `0`.  If the account has not been open long enough to have the transaction data for a given period, we return `null`. For example, if the account has only been open for five days, we return values for `_1w` and `_1m`, however, the value for `_3m` will be `null`. ")

  public Integer getNumOutgoingTransactions1m() {
    return numOutgoingTransactions1m;
  }


  public void setNumOutgoingTransactions1m(Integer numOutgoingTransactions1m) {
    
    this.numOutgoingTransactions1m = numOutgoingTransactions1m;
  }


  public RiskInsightsTransactionMetrics numOutgoingTransactions3m(Integer numOutgoingTransactions3m) {
    
    
    this.numOutgoingTransactions3m = numOutgoingTransactions3m;
    return this;
  }

   /**
   * To total number of outflow transactions in the last three months.  ℹ️ **Note**: If there are no transactions between the request date and the last seven or thirty days, the value is &#x60;0&#x60;.  If the account has not been open long enough to have the transaction data for a given period, we return &#x60;null&#x60;. For example, if the account has only been open for five days, we return values for &#x60;_1w&#x60; and &#x60;_1m&#x60;, however, the value for &#x60;_3m&#x60; will be &#x60;null&#x60;. 
   * @return numOutgoingTransactions3m
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "19", required = true, value = "To total number of outflow transactions in the last three months.  ℹ️ **Note**: If there are no transactions between the request date and the last seven or thirty days, the value is `0`.  If the account has not been open long enough to have the transaction data for a given period, we return `null`. For example, if the account has only been open for five days, we return values for `_1w` and `_1m`, however, the value for `_3m` will be `null`. ")

  public Integer getNumOutgoingTransactions3m() {
    return numOutgoingTransactions3m;
  }


  public void setNumOutgoingTransactions3m(Integer numOutgoingTransactions3m) {
    
    this.numOutgoingTransactions3m = numOutgoingTransactions3m;
  }


  public RiskInsightsTransactionMetrics sumIncomingAmount1w(Float sumIncomingAmount1w) {
    
    
    this.sumIncomingAmount1w = sumIncomingAmount1w;
    return this;
  }

   /**
   * The total sum of all inflow transactions for the last week. 
   * @return sumIncomingAmount1w
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10022.01", required = true, value = "The total sum of all inflow transactions for the last week. ")

  public Float getSumIncomingAmount1w() {
    return sumIncomingAmount1w;
  }


  public void setSumIncomingAmount1w(Float sumIncomingAmount1w) {
    
    this.sumIncomingAmount1w = sumIncomingAmount1w;
  }


  public RiskInsightsTransactionMetrics sumIncomingAmount1m(Float sumIncomingAmount1m) {
    
    
    this.sumIncomingAmount1m = sumIncomingAmount1m;
    return this;
  }

   /**
   * The total sum of all inflow transactions for the last month. 
   * @return sumIncomingAmount1m
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10022.01", required = true, value = "The total sum of all inflow transactions for the last month. ")

  public Float getSumIncomingAmount1m() {
    return sumIncomingAmount1m;
  }


  public void setSumIncomingAmount1m(Float sumIncomingAmount1m) {
    
    this.sumIncomingAmount1m = sumIncomingAmount1m;
  }


  public RiskInsightsTransactionMetrics sumIncomingAmount3m(Float sumIncomingAmount3m) {
    
    
    this.sumIncomingAmount3m = sumIncomingAmount3m;
    return this;
  }

   /**
   * The total sum of all inflow transactions for the last three months. 
   * @return sumIncomingAmount3m
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10022.01", required = true, value = "The total sum of all inflow transactions for the last three months. ")

  public Float getSumIncomingAmount3m() {
    return sumIncomingAmount3m;
  }


  public void setSumIncomingAmount3m(Float sumIncomingAmount3m) {
    
    this.sumIncomingAmount3m = sumIncomingAmount3m;
  }


  public RiskInsightsTransactionMetrics sumOutgoingAmount1w(Float sumOutgoingAmount1w) {
    
    
    this.sumOutgoingAmount1w = sumOutgoingAmount1w;
    return this;
  }

   /**
   * The total sum of all outflow transactions for the last week. 
   * @return sumOutgoingAmount1w
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10237.03", required = true, value = "The total sum of all outflow transactions for the last week. ")

  public Float getSumOutgoingAmount1w() {
    return sumOutgoingAmount1w;
  }


  public void setSumOutgoingAmount1w(Float sumOutgoingAmount1w) {
    
    this.sumOutgoingAmount1w = sumOutgoingAmount1w;
  }


  public RiskInsightsTransactionMetrics sumOutgoingAmount1m(Float sumOutgoingAmount1m) {
    
    
    this.sumOutgoingAmount1m = sumOutgoingAmount1m;
    return this;
  }

   /**
   * The total sum of all outflow transactions for the last month. 
   * @return sumOutgoingAmount1m
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10237.03", required = true, value = "The total sum of all outflow transactions for the last month. ")

  public Float getSumOutgoingAmount1m() {
    return sumOutgoingAmount1m;
  }


  public void setSumOutgoingAmount1m(Float sumOutgoingAmount1m) {
    
    this.sumOutgoingAmount1m = sumOutgoingAmount1m;
  }


  public RiskInsightsTransactionMetrics sumOutgoingAmount3m(Float sumOutgoingAmount3m) {
    
    
    this.sumOutgoingAmount3m = sumOutgoingAmount3m;
    return this;
  }

   /**
   * The total sum of all outflow transactions for the last three months. 
   * @return sumOutgoingAmount3m
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10237.03", required = true, value = "The total sum of all outflow transactions for the last three months. ")

  public Float getSumOutgoingAmount3m() {
    return sumOutgoingAmount3m;
  }


  public void setSumOutgoingAmount3m(Float sumOutgoingAmount3m) {
    
    this.sumOutgoingAmount3m = sumOutgoingAmount3m;
  }


  public RiskInsightsTransactionMetrics maxIncomingAmount1w(Float maxIncomingAmount1w) {
    
    
    this.maxIncomingAmount1w = maxIncomingAmount1w;
    return this;
  }

   /**
   * The highest value inflow transaction in the last week. 
   * @return maxIncomingAmount1w
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3030", required = true, value = "The highest value inflow transaction in the last week. ")

  public Float getMaxIncomingAmount1w() {
    return maxIncomingAmount1w;
  }


  public void setMaxIncomingAmount1w(Float maxIncomingAmount1w) {
    
    this.maxIncomingAmount1w = maxIncomingAmount1w;
  }


  public RiskInsightsTransactionMetrics maxIncomingAmount1m(Float maxIncomingAmount1m) {
    
    
    this.maxIncomingAmount1m = maxIncomingAmount1m;
    return this;
  }

   /**
   * The highest value inflow transaction in the last month. 
   * @return maxIncomingAmount1m
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3030", required = true, value = "The highest value inflow transaction in the last month. ")

  public Float getMaxIncomingAmount1m() {
    return maxIncomingAmount1m;
  }


  public void setMaxIncomingAmount1m(Float maxIncomingAmount1m) {
    
    this.maxIncomingAmount1m = maxIncomingAmount1m;
  }


  public RiskInsightsTransactionMetrics maxIncomingAmount3m(Float maxIncomingAmount3m) {
    
    
    this.maxIncomingAmount3m = maxIncomingAmount3m;
    return this;
  }

   /**
   * The highest value inflow transaction in the last three months. 
   * @return maxIncomingAmount3m
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3030", required = true, value = "The highest value inflow transaction in the last three months. ")

  public Float getMaxIncomingAmount3m() {
    return maxIncomingAmount3m;
  }


  public void setMaxIncomingAmount3m(Float maxIncomingAmount3m) {
    
    this.maxIncomingAmount3m = maxIncomingAmount3m;
  }


  public RiskInsightsTransactionMetrics maxOutgoingAmount1w(Float maxOutgoingAmount1w) {
    
    
    this.maxOutgoingAmount1w = maxOutgoingAmount1w;
    return this;
  }

   /**
   * The highest value outflow transaction in the last week. 
   * @return maxOutgoingAmount1w
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3027.44", required = true, value = "The highest value outflow transaction in the last week. ")

  public Float getMaxOutgoingAmount1w() {
    return maxOutgoingAmount1w;
  }


  public void setMaxOutgoingAmount1w(Float maxOutgoingAmount1w) {
    
    this.maxOutgoingAmount1w = maxOutgoingAmount1w;
  }


  public RiskInsightsTransactionMetrics maxOutgoingAmount1m(Float maxOutgoingAmount1m) {
    
    
    this.maxOutgoingAmount1m = maxOutgoingAmount1m;
    return this;
  }

   /**
   * The highest value outflow transaction in the last month. 
   * @return maxOutgoingAmount1m
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3027.44", required = true, value = "The highest value outflow transaction in the last month. ")

  public Float getMaxOutgoingAmount1m() {
    return maxOutgoingAmount1m;
  }


  public void setMaxOutgoingAmount1m(Float maxOutgoingAmount1m) {
    
    this.maxOutgoingAmount1m = maxOutgoingAmount1m;
  }


  public RiskInsightsTransactionMetrics maxOutgoingAmount3m(Float maxOutgoingAmount3m) {
    
    
    this.maxOutgoingAmount3m = maxOutgoingAmount3m;
    return this;
  }

   /**
   * The highest value outflow transaction in the last three months. 
   * @return maxOutgoingAmount3m
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3027.44", required = true, value = "The highest value outflow transaction in the last three months. ")

  public Float getMaxOutgoingAmount3m() {
    return maxOutgoingAmount3m;
  }


  public void setMaxOutgoingAmount3m(Float maxOutgoingAmount3m) {
    
    this.maxOutgoingAmount3m = maxOutgoingAmount3m;
  }


  public RiskInsightsTransactionMetrics meanIncomingAmount1w(Float meanIncomingAmount1w) {
    
    
    this.meanIncomingAmount1w = meanIncomingAmount1w;
    return this;
  }

   /**
   * The mean incoming value of all transactions in the last week. 
   * @return meanIncomingAmount1w
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3030", required = true, value = "The mean incoming value of all transactions in the last week. ")

  public Float getMeanIncomingAmount1w() {
    return meanIncomingAmount1w;
  }


  public void setMeanIncomingAmount1w(Float meanIncomingAmount1w) {
    
    this.meanIncomingAmount1w = meanIncomingAmount1w;
  }


  public RiskInsightsTransactionMetrics meanIncomingAmount1m(Float meanIncomingAmount1m) {
    
    
    this.meanIncomingAmount1m = meanIncomingAmount1m;
    return this;
  }

   /**
   * The mean incoming value of all transactions in the last month. 
   * @return meanIncomingAmount1m
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3030", required = true, value = "The mean incoming value of all transactions in the last month. ")

  public Float getMeanIncomingAmount1m() {
    return meanIncomingAmount1m;
  }


  public void setMeanIncomingAmount1m(Float meanIncomingAmount1m) {
    
    this.meanIncomingAmount1m = meanIncomingAmount1m;
  }


  public RiskInsightsTransactionMetrics meanIncomingAmount3m(Float meanIncomingAmount3m) {
    
    
    this.meanIncomingAmount3m = meanIncomingAmount3m;
    return this;
  }

   /**
   * The mean incoming value of all transactions in the last three months. 
   * @return meanIncomingAmount3m
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3030", required = true, value = "The mean incoming value of all transactions in the last three months. ")

  public Float getMeanIncomingAmount3m() {
    return meanIncomingAmount3m;
  }


  public void setMeanIncomingAmount3m(Float meanIncomingAmount3m) {
    
    this.meanIncomingAmount3m = meanIncomingAmount3m;
  }


  public RiskInsightsTransactionMetrics meanOutgoingAmount1w(Float meanOutgoingAmount1w) {
    
    
    this.meanOutgoingAmount1w = meanOutgoingAmount1w;
    return this;
  }

   /**
   * The mean outgoing value of all transaction in the last week. 
   * @return meanOutgoingAmount1w
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3027.44", required = true, value = "The mean outgoing value of all transaction in the last week. ")

  public Float getMeanOutgoingAmount1w() {
    return meanOutgoingAmount1w;
  }


  public void setMeanOutgoingAmount1w(Float meanOutgoingAmount1w) {
    
    this.meanOutgoingAmount1w = meanOutgoingAmount1w;
  }


  public RiskInsightsTransactionMetrics meanOutgoingAmount1m(Float meanOutgoingAmount1m) {
    
    
    this.meanOutgoingAmount1m = meanOutgoingAmount1m;
    return this;
  }

   /**
   * The mean outgoing value of all transaction in the last month. 
   * @return meanOutgoingAmount1m
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3027.44", required = true, value = "The mean outgoing value of all transaction in the last month. ")

  public Float getMeanOutgoingAmount1m() {
    return meanOutgoingAmount1m;
  }


  public void setMeanOutgoingAmount1m(Float meanOutgoingAmount1m) {
    
    this.meanOutgoingAmount1m = meanOutgoingAmount1m;
  }


  public RiskInsightsTransactionMetrics meanOutgoingAmount3m(Float meanOutgoingAmount3m) {
    
    
    this.meanOutgoingAmount3m = meanOutgoingAmount3m;
    return this;
  }

   /**
   * The mean outgoing value of all transaction in the last three months. 
   * @return meanOutgoingAmount3m
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3027.44", required = true, value = "The mean outgoing value of all transaction in the last three months. ")

  public Float getMeanOutgoingAmount3m() {
    return meanOutgoingAmount3m;
  }


  public void setMeanOutgoingAmount3m(Float meanOutgoingAmount3m) {
    
    this.meanOutgoingAmount3m = meanOutgoingAmount3m;
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
   * @return the RiskInsightsTransactionMetrics instance itself
   */
  public RiskInsightsTransactionMetrics putAdditionalProperty(String key, Object value) {
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
    RiskInsightsTransactionMetrics riskInsightsTransactionMetrics = (RiskInsightsTransactionMetrics) o;
    return Objects.equals(this.numTransactions1w, riskInsightsTransactionMetrics.numTransactions1w) &&
        Objects.equals(this.numTransactions1m, riskInsightsTransactionMetrics.numTransactions1m) &&
        Objects.equals(this.numTransactions3m, riskInsightsTransactionMetrics.numTransactions3m) &&
        Objects.equals(this.numIncomingTransactions1w, riskInsightsTransactionMetrics.numIncomingTransactions1w) &&
        Objects.equals(this.numIncomingTransactions1m, riskInsightsTransactionMetrics.numIncomingTransactions1m) &&
        Objects.equals(this.numIncomingTransactions3m, riskInsightsTransactionMetrics.numIncomingTransactions3m) &&
        Objects.equals(this.numOutgoingTransactions1w, riskInsightsTransactionMetrics.numOutgoingTransactions1w) &&
        Objects.equals(this.numOutgoingTransactions1m, riskInsightsTransactionMetrics.numOutgoingTransactions1m) &&
        Objects.equals(this.numOutgoingTransactions3m, riskInsightsTransactionMetrics.numOutgoingTransactions3m) &&
        Objects.equals(this.sumIncomingAmount1w, riskInsightsTransactionMetrics.sumIncomingAmount1w) &&
        Objects.equals(this.sumIncomingAmount1m, riskInsightsTransactionMetrics.sumIncomingAmount1m) &&
        Objects.equals(this.sumIncomingAmount3m, riskInsightsTransactionMetrics.sumIncomingAmount3m) &&
        Objects.equals(this.sumOutgoingAmount1w, riskInsightsTransactionMetrics.sumOutgoingAmount1w) &&
        Objects.equals(this.sumOutgoingAmount1m, riskInsightsTransactionMetrics.sumOutgoingAmount1m) &&
        Objects.equals(this.sumOutgoingAmount3m, riskInsightsTransactionMetrics.sumOutgoingAmount3m) &&
        Objects.equals(this.maxIncomingAmount1w, riskInsightsTransactionMetrics.maxIncomingAmount1w) &&
        Objects.equals(this.maxIncomingAmount1m, riskInsightsTransactionMetrics.maxIncomingAmount1m) &&
        Objects.equals(this.maxIncomingAmount3m, riskInsightsTransactionMetrics.maxIncomingAmount3m) &&
        Objects.equals(this.maxOutgoingAmount1w, riskInsightsTransactionMetrics.maxOutgoingAmount1w) &&
        Objects.equals(this.maxOutgoingAmount1m, riskInsightsTransactionMetrics.maxOutgoingAmount1m) &&
        Objects.equals(this.maxOutgoingAmount3m, riskInsightsTransactionMetrics.maxOutgoingAmount3m) &&
        Objects.equals(this.meanIncomingAmount1w, riskInsightsTransactionMetrics.meanIncomingAmount1w) &&
        Objects.equals(this.meanIncomingAmount1m, riskInsightsTransactionMetrics.meanIncomingAmount1m) &&
        Objects.equals(this.meanIncomingAmount3m, riskInsightsTransactionMetrics.meanIncomingAmount3m) &&
        Objects.equals(this.meanOutgoingAmount1w, riskInsightsTransactionMetrics.meanOutgoingAmount1w) &&
        Objects.equals(this.meanOutgoingAmount1m, riskInsightsTransactionMetrics.meanOutgoingAmount1m) &&
        Objects.equals(this.meanOutgoingAmount3m, riskInsightsTransactionMetrics.meanOutgoingAmount3m)&&
        Objects.equals(this.additionalProperties, riskInsightsTransactionMetrics.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numTransactions1w, numTransactions1m, numTransactions3m, numIncomingTransactions1w, numIncomingTransactions1m, numIncomingTransactions3m, numOutgoingTransactions1w, numOutgoingTransactions1m, numOutgoingTransactions3m, sumIncomingAmount1w, sumIncomingAmount1m, sumIncomingAmount3m, sumOutgoingAmount1w, sumOutgoingAmount1m, sumOutgoingAmount3m, maxIncomingAmount1w, maxIncomingAmount1m, maxIncomingAmount3m, maxOutgoingAmount1w, maxOutgoingAmount1m, maxOutgoingAmount3m, meanIncomingAmount1w, meanIncomingAmount1m, meanIncomingAmount3m, meanOutgoingAmount1w, meanOutgoingAmount1m, meanOutgoingAmount3m, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskInsightsTransactionMetrics {\n");
    sb.append("    numTransactions1w: ").append(toIndentedString(numTransactions1w)).append("\n");
    sb.append("    numTransactions1m: ").append(toIndentedString(numTransactions1m)).append("\n");
    sb.append("    numTransactions3m: ").append(toIndentedString(numTransactions3m)).append("\n");
    sb.append("    numIncomingTransactions1w: ").append(toIndentedString(numIncomingTransactions1w)).append("\n");
    sb.append("    numIncomingTransactions1m: ").append(toIndentedString(numIncomingTransactions1m)).append("\n");
    sb.append("    numIncomingTransactions3m: ").append(toIndentedString(numIncomingTransactions3m)).append("\n");
    sb.append("    numOutgoingTransactions1w: ").append(toIndentedString(numOutgoingTransactions1w)).append("\n");
    sb.append("    numOutgoingTransactions1m: ").append(toIndentedString(numOutgoingTransactions1m)).append("\n");
    sb.append("    numOutgoingTransactions3m: ").append(toIndentedString(numOutgoingTransactions3m)).append("\n");
    sb.append("    sumIncomingAmount1w: ").append(toIndentedString(sumIncomingAmount1w)).append("\n");
    sb.append("    sumIncomingAmount1m: ").append(toIndentedString(sumIncomingAmount1m)).append("\n");
    sb.append("    sumIncomingAmount3m: ").append(toIndentedString(sumIncomingAmount3m)).append("\n");
    sb.append("    sumOutgoingAmount1w: ").append(toIndentedString(sumOutgoingAmount1w)).append("\n");
    sb.append("    sumOutgoingAmount1m: ").append(toIndentedString(sumOutgoingAmount1m)).append("\n");
    sb.append("    sumOutgoingAmount3m: ").append(toIndentedString(sumOutgoingAmount3m)).append("\n");
    sb.append("    maxIncomingAmount1w: ").append(toIndentedString(maxIncomingAmount1w)).append("\n");
    sb.append("    maxIncomingAmount1m: ").append(toIndentedString(maxIncomingAmount1m)).append("\n");
    sb.append("    maxIncomingAmount3m: ").append(toIndentedString(maxIncomingAmount3m)).append("\n");
    sb.append("    maxOutgoingAmount1w: ").append(toIndentedString(maxOutgoingAmount1w)).append("\n");
    sb.append("    maxOutgoingAmount1m: ").append(toIndentedString(maxOutgoingAmount1m)).append("\n");
    sb.append("    maxOutgoingAmount3m: ").append(toIndentedString(maxOutgoingAmount3m)).append("\n");
    sb.append("    meanIncomingAmount1w: ").append(toIndentedString(meanIncomingAmount1w)).append("\n");
    sb.append("    meanIncomingAmount1m: ").append(toIndentedString(meanIncomingAmount1m)).append("\n");
    sb.append("    meanIncomingAmount3m: ").append(toIndentedString(meanIncomingAmount3m)).append("\n");
    sb.append("    meanOutgoingAmount1w: ").append(toIndentedString(meanOutgoingAmount1w)).append("\n");
    sb.append("    meanOutgoingAmount1m: ").append(toIndentedString(meanOutgoingAmount1m)).append("\n");
    sb.append("    meanOutgoingAmount3m: ").append(toIndentedString(meanOutgoingAmount3m)).append("\n");
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
    openapiFields.add("num_transactions_1w");
    openapiFields.add("num_transactions_1m");
    openapiFields.add("num_transactions_3m");
    openapiFields.add("num_incoming_transactions_1w");
    openapiFields.add("num_incoming_transactions_1m");
    openapiFields.add("num_incoming_transactions_3m");
    openapiFields.add("num_outgoing_transactions_1w");
    openapiFields.add("num_outgoing_transactions_1m");
    openapiFields.add("num_outgoing_transactions_3m");
    openapiFields.add("sum_incoming_amount_1w");
    openapiFields.add("sum_incoming_amount_1m");
    openapiFields.add("sum_incoming_amount_3m");
    openapiFields.add("sum_outgoing_amount_1w");
    openapiFields.add("sum_outgoing_amount_1m");
    openapiFields.add("sum_outgoing_amount_3m");
    openapiFields.add("max_incoming_amount_1w");
    openapiFields.add("max_incoming_amount_1m");
    openapiFields.add("max_incoming_amount_3m");
    openapiFields.add("max_outgoing_amount_1w");
    openapiFields.add("max_outgoing_amount_1m");
    openapiFields.add("max_outgoing_amount_3m");
    openapiFields.add("mean_incoming_amount_1w");
    openapiFields.add("mean_incoming_amount_1m");
    openapiFields.add("mean_incoming_amount_3m");
    openapiFields.add("mean_outgoing_amount_1w");
    openapiFields.add("mean_outgoing_amount_1m");
    openapiFields.add("mean_outgoing_amount_3m");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("num_transactions_1w");
    openapiRequiredFields.add("num_transactions_1m");
    openapiRequiredFields.add("num_transactions_3m");
    openapiRequiredFields.add("num_incoming_transactions_1w");
    openapiRequiredFields.add("num_incoming_transactions_1m");
    openapiRequiredFields.add("num_incoming_transactions_3m");
    openapiRequiredFields.add("num_outgoing_transactions_1w");
    openapiRequiredFields.add("num_outgoing_transactions_1m");
    openapiRequiredFields.add("num_outgoing_transactions_3m");
    openapiRequiredFields.add("sum_incoming_amount_1w");
    openapiRequiredFields.add("sum_incoming_amount_1m");
    openapiRequiredFields.add("sum_incoming_amount_3m");
    openapiRequiredFields.add("sum_outgoing_amount_1w");
    openapiRequiredFields.add("sum_outgoing_amount_1m");
    openapiRequiredFields.add("sum_outgoing_amount_3m");
    openapiRequiredFields.add("max_incoming_amount_1w");
    openapiRequiredFields.add("max_incoming_amount_1m");
    openapiRequiredFields.add("max_incoming_amount_3m");
    openapiRequiredFields.add("max_outgoing_amount_1w");
    openapiRequiredFields.add("max_outgoing_amount_1m");
    openapiRequiredFields.add("max_outgoing_amount_3m");
    openapiRequiredFields.add("mean_incoming_amount_1w");
    openapiRequiredFields.add("mean_incoming_amount_1m");
    openapiRequiredFields.add("mean_incoming_amount_3m");
    openapiRequiredFields.add("mean_outgoing_amount_1w");
    openapiRequiredFields.add("mean_outgoing_amount_1m");
    openapiRequiredFields.add("mean_outgoing_amount_3m");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RiskInsightsTransactionMetrics
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RiskInsightsTransactionMetrics.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RiskInsightsTransactionMetrics is not found in the empty JSON string", RiskInsightsTransactionMetrics.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RiskInsightsTransactionMetrics.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RiskInsightsTransactionMetrics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RiskInsightsTransactionMetrics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RiskInsightsTransactionMetrics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RiskInsightsTransactionMetrics.class));

       return (TypeAdapter<T>) new TypeAdapter<RiskInsightsTransactionMetrics>() {
           @Override
           public void write(JsonWriter out, RiskInsightsTransactionMetrics value) throws IOException {
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
           public RiskInsightsTransactionMetrics read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RiskInsightsTransactionMetrics instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RiskInsightsTransactionMetrics given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RiskInsightsTransactionMetrics
  * @throws IOException if the JSON string is invalid with respect to RiskInsightsTransactionMetrics
  */
  public static RiskInsightsTransactionMetrics fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RiskInsightsTransactionMetrics.class);
  }

 /**
  * Convert an instance of RiskInsightsTransactionMetrics to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

