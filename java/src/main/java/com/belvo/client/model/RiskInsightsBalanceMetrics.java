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
 * Balance metrics calculated based on the user&#39;s balances from checking and savings accounts.
 */
@ApiModel(description = "Balance metrics calculated based on the user's balances from checking and savings accounts.")
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class RiskInsightsBalanceMetrics {
  public static final String SERIALIZED_NAME_MIN_BALANCE1W = "min_balance_1w";
  @SerializedName(SERIALIZED_NAME_MIN_BALANCE1W)
  private Float minBalance1w;

  public static final String SERIALIZED_NAME_MIN_BALANCE1M = "min_balance_1m";
  @SerializedName(SERIALIZED_NAME_MIN_BALANCE1M)
  private Float minBalance1m;

  public static final String SERIALIZED_NAME_MIN_BALANCE3M = "min_balance_3m";
  @SerializedName(SERIALIZED_NAME_MIN_BALANCE3M)
  private Float minBalance3m;

  public static final String SERIALIZED_NAME_MAX_BALANCE1W = "max_balance_1w";
  @SerializedName(SERIALIZED_NAME_MAX_BALANCE1W)
  private Float maxBalance1w;

  public static final String SERIALIZED_NAME_MAX_BALANCE1M = "max_balance_1m";
  @SerializedName(SERIALIZED_NAME_MAX_BALANCE1M)
  private Float maxBalance1m;

  public static final String SERIALIZED_NAME_MAX_BALANCE3M = "max_balance_3m";
  @SerializedName(SERIALIZED_NAME_MAX_BALANCE3M)
  private Float maxBalance3m;

  public static final String SERIALIZED_NAME_CLOSING_BALANCE = "closing_balance";
  @SerializedName(SERIALIZED_NAME_CLOSING_BALANCE)
  private Float closingBalance;

  public static final String SERIALIZED_NAME_DAYS_BALANCE_BELOW01W = "days_balance_below_0_1w";
  @SerializedName(SERIALIZED_NAME_DAYS_BALANCE_BELOW01W)
  private Integer daysBalanceBelow01w;

  public static final String SERIALIZED_NAME_DAYS_BALANCE_BELOW01M = "days_balance_below_0_1m";
  @SerializedName(SERIALIZED_NAME_DAYS_BALANCE_BELOW01M)
  private Integer daysBalanceBelow01m;

  public static final String SERIALIZED_NAME_DAYS_BALANCE_BELOW03M = "days_balance_below_0_3m";
  @SerializedName(SERIALIZED_NAME_DAYS_BALANCE_BELOW03M)
  private Integer daysBalanceBelow03m;

  public static final String SERIALIZED_NAME_DAYS_BALANCE_BELOW_X1W = "days_balance_below_x_1w";
  @SerializedName(SERIALIZED_NAME_DAYS_BALANCE_BELOW_X1W)
  private Integer daysBalanceBelowX1w;

  public static final String SERIALIZED_NAME_DAYS_BALANCE_BELOW_X1M = "days_balance_below_x_1m";
  @SerializedName(SERIALIZED_NAME_DAYS_BALANCE_BELOW_X1M)
  private Integer daysBalanceBelowX1m;

  public static final String SERIALIZED_NAME_DAYS_BALANCE_BELOW_X3M = "days_balance_below_x_3m";
  @SerializedName(SERIALIZED_NAME_DAYS_BALANCE_BELOW_X3M)
  private Integer daysBalanceBelowX3m;

  public static final String SERIALIZED_NAME_BALANCE_THRESHOLD_X = "balance_threshold_x";
  @SerializedName(SERIALIZED_NAME_BALANCE_THRESHOLD_X)
  private Float balanceThresholdX;

  public RiskInsightsBalanceMetrics() {
  }

  public RiskInsightsBalanceMetrics minBalance1w(Float minBalance1w) {

    
    
    
    
    this.minBalance1w = minBalance1w;
    return this;
  }

   /**
   * The minimum balance in the period (one week). 
   * @return minBalance1w
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.51", required = true, value = "The minimum balance in the period (one week). ")

  public Float getMinBalance1w() {
    return minBalance1w;
  }


  public void setMinBalance1w(Float minBalance1w) {

    
    
    
    this.minBalance1w = minBalance1w;
  }


  public RiskInsightsBalanceMetrics minBalance1m(Float minBalance1m) {

    
    
    
    
    this.minBalance1m = minBalance1m;
    return this;
  }

   /**
   * The minimum balance in the period (one month). 
   * @return minBalance1m
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.51", required = true, value = "The minimum balance in the period (one month). ")

  public Float getMinBalance1m() {
    return minBalance1m;
  }


  public void setMinBalance1m(Float minBalance1m) {

    
    
    
    this.minBalance1m = minBalance1m;
  }


  public RiskInsightsBalanceMetrics minBalance3m(Float minBalance3m) {

    
    
    
    
    this.minBalance3m = minBalance3m;
    return this;
  }

   /**
   * The minimum balance in the period (three months). 
   * @return minBalance3m
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.51", required = true, value = "The minimum balance in the period (three months). ")

  public Float getMinBalance3m() {
    return minBalance3m;
  }


  public void setMinBalance3m(Float minBalance3m) {

    
    
    
    this.minBalance3m = minBalance3m;
  }


  public RiskInsightsBalanceMetrics maxBalance1w(Float maxBalance1w) {

    
    
    
    
    this.maxBalance1w = maxBalance1w;
    return this;
  }

   /**
   * The maximum balance in the period (one week). 
   * @return maxBalance1w
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3062.11", required = true, value = "The maximum balance in the period (one week). ")

  public Float getMaxBalance1w() {
    return maxBalance1w;
  }


  public void setMaxBalance1w(Float maxBalance1w) {

    
    
    
    this.maxBalance1w = maxBalance1w;
  }


  public RiskInsightsBalanceMetrics maxBalance1m(Float maxBalance1m) {

    
    
    
    
    this.maxBalance1m = maxBalance1m;
    return this;
  }

   /**
   * The maximum balance in the period (one month). 
   * @return maxBalance1m
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3062.11", required = true, value = "The maximum balance in the period (one month). ")

  public Float getMaxBalance1m() {
    return maxBalance1m;
  }


  public void setMaxBalance1m(Float maxBalance1m) {

    
    
    
    this.maxBalance1m = maxBalance1m;
  }


  public RiskInsightsBalanceMetrics maxBalance3m(Float maxBalance3m) {

    
    
    
    
    this.maxBalance3m = maxBalance3m;
    return this;
  }

   /**
   * The maximum balance in the period (three months). 
   * @return maxBalance3m
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3062.11", required = true, value = "The maximum balance in the period (three months). ")

  public Float getMaxBalance3m() {
    return maxBalance3m;
  }


  public void setMaxBalance3m(Float maxBalance3m) {

    
    
    
    this.maxBalance3m = maxBalance3m;
  }


  public RiskInsightsBalanceMetrics closingBalance(Float closingBalance) {

    
    
    
    
    this.closingBalance = closingBalance;
    return this;
  }

   /**
   * The balance of all the accounts at the &#x60;collected_at&#x60; time. 
   * @return closingBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "24.19", required = true, value = "The balance of all the accounts at the `collected_at` time. ")

  public Float getClosingBalance() {
    return closingBalance;
  }


  public void setClosingBalance(Float closingBalance) {

    
    
    
    this.closingBalance = closingBalance;
  }


  public RiskInsightsBalanceMetrics daysBalanceBelow01w(Integer daysBalanceBelow01w) {

    
    
    
    
    this.daysBalanceBelow01w = daysBalanceBelow01w;
    return this;
  }

   /**
   * The number of days that the total balance of the account is less than or equal to 0 in the last week. 
   * @return daysBalanceBelow01w
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", required = true, value = "The number of days that the total balance of the account is less than or equal to 0 in the last week. ")

  public Integer getDaysBalanceBelow01w() {
    return daysBalanceBelow01w;
  }


  public void setDaysBalanceBelow01w(Integer daysBalanceBelow01w) {

    
    
    
    this.daysBalanceBelow01w = daysBalanceBelow01w;
  }


  public RiskInsightsBalanceMetrics daysBalanceBelow01m(Integer daysBalanceBelow01m) {

    
    
    
    
    this.daysBalanceBelow01m = daysBalanceBelow01m;
    return this;
  }

   /**
   * The number of days that the total balance of the account is less than or equal to 0 in the last month. 
   * @return daysBalanceBelow01m
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", required = true, value = "The number of days that the total balance of the account is less than or equal to 0 in the last month. ")

  public Integer getDaysBalanceBelow01m() {
    return daysBalanceBelow01m;
  }


  public void setDaysBalanceBelow01m(Integer daysBalanceBelow01m) {

    
    
    
    this.daysBalanceBelow01m = daysBalanceBelow01m;
  }


  public RiskInsightsBalanceMetrics daysBalanceBelow03m(Integer daysBalanceBelow03m) {

    
    
    
    
    this.daysBalanceBelow03m = daysBalanceBelow03m;
    return this;
  }

   /**
   * The number of days that the total balance of the account is less than or equal to 0 in the last three months. 
   * @return daysBalanceBelow03m
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", required = true, value = "The number of days that the total balance of the account is less than or equal to 0 in the last three months. ")

  public Integer getDaysBalanceBelow03m() {
    return daysBalanceBelow03m;
  }


  public void setDaysBalanceBelow03m(Integer daysBalanceBelow03m) {

    
    
    
    this.daysBalanceBelow03m = daysBalanceBelow03m;
  }


  public RiskInsightsBalanceMetrics daysBalanceBelowX1w(Integer daysBalanceBelowX1w) {

    
    
    
    
    this.daysBalanceBelowX1w = daysBalanceBelowX1w;
    return this;
  }

   /**
   * The number of days that the total balance of the account is less than or equal to the amount specified in &#x60;balance_threshold_x&#x60; in the last week. 
   * @return daysBalanceBelowX1w
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", required = true, value = "The number of days that the total balance of the account is less than or equal to the amount specified in `balance_threshold_x` in the last week. ")

  public Integer getDaysBalanceBelowX1w() {
    return daysBalanceBelowX1w;
  }


  public void setDaysBalanceBelowX1w(Integer daysBalanceBelowX1w) {

    
    
    
    this.daysBalanceBelowX1w = daysBalanceBelowX1w;
  }


  public RiskInsightsBalanceMetrics daysBalanceBelowX1m(Integer daysBalanceBelowX1m) {

    
    
    
    
    this.daysBalanceBelowX1m = daysBalanceBelowX1m;
    return this;
  }

   /**
   * The number of days that the total balance of the account is less than or equal to the amount specified in &#x60;balance_threshold_x&#x60; in the last month. 
   * @return daysBalanceBelowX1m
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", required = true, value = "The number of days that the total balance of the account is less than or equal to the amount specified in `balance_threshold_x` in the last month. ")

  public Integer getDaysBalanceBelowX1m() {
    return daysBalanceBelowX1m;
  }


  public void setDaysBalanceBelowX1m(Integer daysBalanceBelowX1m) {

    
    
    
    this.daysBalanceBelowX1m = daysBalanceBelowX1m;
  }


  public RiskInsightsBalanceMetrics daysBalanceBelowX3m(Integer daysBalanceBelowX3m) {

    
    
    
    
    this.daysBalanceBelowX3m = daysBalanceBelowX3m;
    return this;
  }

   /**
   * The number of days that the total balance of the account is less than or equal to the amount specified in &#x60;balance_threshold_x&#x60; in the last three months. 
   * @return daysBalanceBelowX3m
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", required = true, value = "The number of days that the total balance of the account is less than or equal to the amount specified in `balance_threshold_x` in the last three months. ")

  public Integer getDaysBalanceBelowX3m() {
    return daysBalanceBelowX3m;
  }


  public void setDaysBalanceBelowX3m(Integer daysBalanceBelowX3m) {

    
    
    
    this.daysBalanceBelowX3m = daysBalanceBelowX3m;
  }


  public RiskInsightsBalanceMetrics balanceThresholdX(Float balanceThresholdX) {

    
    
    
    
    this.balanceThresholdX = balanceThresholdX;
    return this;
  }

   /**
   * The threshold used to compute &#x60;days_balance_below_x_period&#x60;. Please note, this is value is country specific (both in terms of the amount and the currency). 
   * @return balanceThresholdX
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "267", required = true, value = "The threshold used to compute `days_balance_below_x_period`. Please note, this is value is country specific (both in terms of the amount and the currency). ")

  public Float getBalanceThresholdX() {
    return balanceThresholdX;
  }


  public void setBalanceThresholdX(Float balanceThresholdX) {

    
    
    
    this.balanceThresholdX = balanceThresholdX;
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
   * @return the RiskInsightsBalanceMetrics instance itself
   */
  public RiskInsightsBalanceMetrics putAdditionalProperty(String key, Object value) {
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
    RiskInsightsBalanceMetrics riskInsightsBalanceMetrics = (RiskInsightsBalanceMetrics) o;
    return Objects.equals(this.minBalance1w, riskInsightsBalanceMetrics.minBalance1w) &&
        Objects.equals(this.minBalance1m, riskInsightsBalanceMetrics.minBalance1m) &&
        Objects.equals(this.minBalance3m, riskInsightsBalanceMetrics.minBalance3m) &&
        Objects.equals(this.maxBalance1w, riskInsightsBalanceMetrics.maxBalance1w) &&
        Objects.equals(this.maxBalance1m, riskInsightsBalanceMetrics.maxBalance1m) &&
        Objects.equals(this.maxBalance3m, riskInsightsBalanceMetrics.maxBalance3m) &&
        Objects.equals(this.closingBalance, riskInsightsBalanceMetrics.closingBalance) &&
        Objects.equals(this.daysBalanceBelow01w, riskInsightsBalanceMetrics.daysBalanceBelow01w) &&
        Objects.equals(this.daysBalanceBelow01m, riskInsightsBalanceMetrics.daysBalanceBelow01m) &&
        Objects.equals(this.daysBalanceBelow03m, riskInsightsBalanceMetrics.daysBalanceBelow03m) &&
        Objects.equals(this.daysBalanceBelowX1w, riskInsightsBalanceMetrics.daysBalanceBelowX1w) &&
        Objects.equals(this.daysBalanceBelowX1m, riskInsightsBalanceMetrics.daysBalanceBelowX1m) &&
        Objects.equals(this.daysBalanceBelowX3m, riskInsightsBalanceMetrics.daysBalanceBelowX3m) &&
        Objects.equals(this.balanceThresholdX, riskInsightsBalanceMetrics.balanceThresholdX)&&
        Objects.equals(this.additionalProperties, riskInsightsBalanceMetrics.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minBalance1w, minBalance1m, minBalance3m, maxBalance1w, maxBalance1m, maxBalance3m, closingBalance, daysBalanceBelow01w, daysBalanceBelow01m, daysBalanceBelow03m, daysBalanceBelowX1w, daysBalanceBelowX1m, daysBalanceBelowX3m, balanceThresholdX, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskInsightsBalanceMetrics {\n");
    sb.append("    minBalance1w: ").append(toIndentedString(minBalance1w)).append("\n");
    sb.append("    minBalance1m: ").append(toIndentedString(minBalance1m)).append("\n");
    sb.append("    minBalance3m: ").append(toIndentedString(minBalance3m)).append("\n");
    sb.append("    maxBalance1w: ").append(toIndentedString(maxBalance1w)).append("\n");
    sb.append("    maxBalance1m: ").append(toIndentedString(maxBalance1m)).append("\n");
    sb.append("    maxBalance3m: ").append(toIndentedString(maxBalance3m)).append("\n");
    sb.append("    closingBalance: ").append(toIndentedString(closingBalance)).append("\n");
    sb.append("    daysBalanceBelow01w: ").append(toIndentedString(daysBalanceBelow01w)).append("\n");
    sb.append("    daysBalanceBelow01m: ").append(toIndentedString(daysBalanceBelow01m)).append("\n");
    sb.append("    daysBalanceBelow03m: ").append(toIndentedString(daysBalanceBelow03m)).append("\n");
    sb.append("    daysBalanceBelowX1w: ").append(toIndentedString(daysBalanceBelowX1w)).append("\n");
    sb.append("    daysBalanceBelowX1m: ").append(toIndentedString(daysBalanceBelowX1m)).append("\n");
    sb.append("    daysBalanceBelowX3m: ").append(toIndentedString(daysBalanceBelowX3m)).append("\n");
    sb.append("    balanceThresholdX: ").append(toIndentedString(balanceThresholdX)).append("\n");
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
    openapiFields.add("min_balance_1w");
    openapiFields.add("min_balance_1m");
    openapiFields.add("min_balance_3m");
    openapiFields.add("max_balance_1w");
    openapiFields.add("max_balance_1m");
    openapiFields.add("max_balance_3m");
    openapiFields.add("closing_balance");
    openapiFields.add("days_balance_below_0_1w");
    openapiFields.add("days_balance_below_0_1m");
    openapiFields.add("days_balance_below_0_3m");
    openapiFields.add("days_balance_below_x_1w");
    openapiFields.add("days_balance_below_x_1m");
    openapiFields.add("days_balance_below_x_3m");
    openapiFields.add("balance_threshold_x");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("min_balance_1w");
    openapiRequiredFields.add("min_balance_1m");
    openapiRequiredFields.add("min_balance_3m");
    openapiRequiredFields.add("max_balance_1w");
    openapiRequiredFields.add("max_balance_1m");
    openapiRequiredFields.add("max_balance_3m");
    openapiRequiredFields.add("closing_balance");
    openapiRequiredFields.add("days_balance_below_0_1w");
    openapiRequiredFields.add("days_balance_below_0_1m");
    openapiRequiredFields.add("days_balance_below_0_3m");
    openapiRequiredFields.add("days_balance_below_x_1w");
    openapiRequiredFields.add("days_balance_below_x_1m");
    openapiRequiredFields.add("days_balance_below_x_3m");
    openapiRequiredFields.add("balance_threshold_x");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RiskInsightsBalanceMetrics
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RiskInsightsBalanceMetrics.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RiskInsightsBalanceMetrics is not found in the empty JSON string", RiskInsightsBalanceMetrics.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RiskInsightsBalanceMetrics.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RiskInsightsBalanceMetrics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RiskInsightsBalanceMetrics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RiskInsightsBalanceMetrics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RiskInsightsBalanceMetrics.class));

       return (TypeAdapter<T>) new TypeAdapter<RiskInsightsBalanceMetrics>() {
           @Override
           public void write(JsonWriter out, RiskInsightsBalanceMetrics value) throws IOException {
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
           public RiskInsightsBalanceMetrics read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RiskInsightsBalanceMetrics instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RiskInsightsBalanceMetrics given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RiskInsightsBalanceMetrics
  * @throws IOException if the JSON string is invalid with respect to RiskInsightsBalanceMetrics
  */
  public static RiskInsightsBalanceMetrics fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RiskInsightsBalanceMetrics.class);
  }

 /**
  * Convert an instance of RiskInsightsBalanceMetrics to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

