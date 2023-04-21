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
import com.belvo.client.model.EnumIncomeStreamConfidence;
import com.belvo.client.model.EnumIncomeStreamFrequency;
import com.belvo.client.model.EnumIncomeStreamType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

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
 * A list of income streams for the account.  For each income stream, we provide additional insights such as: - Frequency, stability, and confidence level of the income transactions. - Key metrics about the transaction amounts. ℹ️ If no income sources are found, we return an empty array. 
 */
@ApiModel(description = "A list of income streams for the account.  For each income stream, we provide additional insights such as: - Frequency, stability, and confidence level of the income transactions. - Key metrics about the transaction amounts. ℹ️ If no income sources are found, we return an empty array. ")
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class IncomeStreamsBody {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_INCOME_TYPE = "income_type";
  @SerializedName(SERIALIZED_NAME_INCOME_TYPE)
  private EnumIncomeStreamType incomeType;

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  private EnumIncomeStreamFrequency frequency;

  public static final String SERIALIZED_NAME_MONTHLY_AVERAGE = "monthly_average";
  @SerializedName(SERIALIZED_NAME_MONTHLY_AVERAGE)
  private Float monthlyAverage;

  public static final String SERIALIZED_NAME_AVERAGE_INCOME_AMOUNT = "average_income_amount";
  @SerializedName(SERIALIZED_NAME_AVERAGE_INCOME_AMOUNT)
  private Float averageIncomeAmount;

  public static final String SERIALIZED_NAME_LAST_INCOME_AMOUNT = "last_income_amount";
  @SerializedName(SERIALIZED_NAME_LAST_INCOME_AMOUNT)
  private Float lastIncomeAmount;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_LAST_INCOME_DESCRIPTION = "last_income_description";
  @SerializedName(SERIALIZED_NAME_LAST_INCOME_DESCRIPTION)
  private Object lastIncomeDescription = null;

  public static final String SERIALIZED_NAME_LAST_INCOME_DATE = "last_income_date";
  @SerializedName(SERIALIZED_NAME_LAST_INCOME_DATE)
  private LocalDate lastIncomeDate;

  public static final String SERIALIZED_NAME_STABILITY = "stability";
  @SerializedName(SERIALIZED_NAME_STABILITY)
  private Float stability;

  public static final String SERIALIZED_NAME_REGULARITY = "regularity";
  @SerializedName(SERIALIZED_NAME_REGULARITY)
  private Float regularity;

  public static final String SERIALIZED_NAME_TREND = "trend";
  @SerializedName(SERIALIZED_NAME_TREND)
  private Float trend;

  public static final String SERIALIZED_NAME_LOOKBACK_PERIODS = "lookback_periods";
  @SerializedName(SERIALIZED_NAME_LOOKBACK_PERIODS)
  private Integer lookbackPeriods;

  public static final String SERIALIZED_NAME_FULL_PERIODS = "full_periods";
  @SerializedName(SERIALIZED_NAME_FULL_PERIODS)
  private Integer fullPeriods;

  public static final String SERIALIZED_NAME_PERIODS_WITH_INCOME = "periods_with_income";
  @SerializedName(SERIALIZED_NAME_PERIODS_WITH_INCOME)
  private Integer periodsWithIncome;

  public static final String SERIALIZED_NAME_NUMBER_OF_INCOMES = "number_of_incomes";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_INCOMES)
  private Integer numberOfIncomes;

  public static final String SERIALIZED_NAME_CONFIDENCE = "confidence";
  @SerializedName(SERIALIZED_NAME_CONFIDENCE)
  private EnumIncomeStreamConfidence confidence;

  public IncomeStreamsBody() {
  }

  public IncomeStreamsBody accountId(String accountId) {
    
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Unique ID for the bank account to be verified for income streams.
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "EBACA-89077589", required = true, value = "Unique ID for the bank account to be verified for income streams.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    
    this.accountId = accountId;
  }


  public IncomeStreamsBody incomeType(EnumIncomeStreamType incomeType) {
    
    
    this.incomeType = incomeType;
    return this;
  }

   /**
   * Get incomeType
   * @return incomeType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EnumIncomeStreamType getIncomeType() {
    return incomeType;
  }


  public void setIncomeType(EnumIncomeStreamType incomeType) {
    
    this.incomeType = incomeType;
  }


  public IncomeStreamsBody frequency(EnumIncomeStreamFrequency frequency) {
    
    
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EnumIncomeStreamFrequency getFrequency() {
    return frequency;
  }


  public void setFrequency(EnumIncomeStreamFrequency frequency) {
    
    this.frequency = frequency;
  }


  public IncomeStreamsBody monthlyAverage(Float monthlyAverage) {
    
    
    this.monthlyAverage = monthlyAverage;
    return this;
  }

   /**
   * The average amount of income received from the source over &#x60;lookback_periods&#x60;. 
   * @return monthlyAverage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2500", required = true, value = "The average amount of income received from the source over `lookback_periods`. ")

  public Float getMonthlyAverage() {
    return monthlyAverage;
  }


  public void setMonthlyAverage(Float monthlyAverage) {
    
    this.monthlyAverage = monthlyAverage;
  }


  public IncomeStreamsBody averageIncomeAmount(Float averageIncomeAmount) {
    
    
    this.averageIncomeAmount = averageIncomeAmount;
    return this;
  }

   /**
   * The average income transaction amount from the source. 
   * @return averageIncomeAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2500", required = true, value = "The average income transaction amount from the source. ")

  public Float getAverageIncomeAmount() {
    return averageIncomeAmount;
  }


  public void setAverageIncomeAmount(Float averageIncomeAmount) {
    
    this.averageIncomeAmount = averageIncomeAmount;
  }


  public IncomeStreamsBody lastIncomeAmount(Float lastIncomeAmount) {
    
    
    this.lastIncomeAmount = lastIncomeAmount;
    return this;
  }

   /**
   * The amount of the most recent income received from the source. 
   * @return lastIncomeAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2500", required = true, value = "The amount of the most recent income received from the source. ")

  public Float getLastIncomeAmount() {
    return lastIncomeAmount;
  }


  public void setLastIncomeAmount(Float lastIncomeAmount) {
    
    this.lastIncomeAmount = lastIncomeAmount;
  }


  public IncomeStreamsBody currency(String currency) {
    
    
    this.currency = currency;
    return this;
  }

   /**
   * The three-letter currency code of the income. For example:    • 🇧🇷 BRL (Brazilian Real)   • 🇨🇴 COP (Colombian Peso)   • 🇲🇽 MXN (Mexican Peso)   
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "BRL", required = true, value = "The three-letter currency code of the income. For example:    • 🇧🇷 BRL (Brazilian Real)   • 🇨🇴 COP (Colombian Peso)   • 🇲🇽 MXN (Mexican Peso)   ")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    
    this.currency = currency;
  }


  public IncomeStreamsBody lastIncomeDescription(Object lastIncomeDescription) {
    
    
    this.lastIncomeDescription = lastIncomeDescription;
    return this;
  }

   /**
   * The description of the most recent income from the steam. 
   * @return lastIncomeDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Salário", required = true, value = "The description of the most recent income from the steam. ")

  public Object getLastIncomeDescription() {
    return lastIncomeDescription;
  }


  public void setLastIncomeDescription(Object lastIncomeDescription) {
    
    this.lastIncomeDescription = lastIncomeDescription;
  }


  public IncomeStreamsBody lastIncomeDate(LocalDate lastIncomeDate) {
    
    
    this.lastIncomeDate = lastIncomeDate;
    return this;
  }

   /**
   * The date when the most recent income from the stream was received, in &#x60;YYYY-MM-DD&#x60; format. 
   * @return lastIncomeDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Tue Feb 08 16:00:00 PST 2022", required = true, value = "The date when the most recent income from the stream was received, in `YYYY-MM-DD` format. ")

  public LocalDate getLastIncomeDate() {
    return lastIncomeDate;
  }


  public void setLastIncomeDate(LocalDate lastIncomeDate) {
    
    this.lastIncomeDate = lastIncomeDate;
  }


  public IncomeStreamsBody stability(Float stability) {
    
    
    this.stability = stability;
    return this;
  }

   /**
   * The stability of the income based on its amount, with a range from 0 to 1, where 1 represents perfect stability.  **Note:** For transactions with &#x60;frequency&#x60;&#x3D;&#x60;SINGLE&#x60;, this value returns &#x60;null&#x60;. 
   * @return stability
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", required = true, value = "The stability of the income based on its amount, with a range from 0 to 1, where 1 represents perfect stability.  **Note:** For transactions with `frequency`=`SINGLE`, this value returns `null`. ")

  public Float getStability() {
    return stability;
  }


  public void setStability(Float stability) {
    
    this.stability = stability;
  }


  public IncomeStreamsBody regularity(Float regularity) {
    
    
    this.regularity = regularity;
    return this;
  }

   /**
   * The regularity of the income basde in its frequency, with a range from 0 to 1, where 1 represents perfect regularity.  **Note:** For transactions with &#x60;frequency&#x60;&#x3D;&#x60;SINGLE&#x60;, this value returns &#x60;null&#x60;. 
   * @return regularity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.75", required = true, value = "The regularity of the income basde in its frequency, with a range from 0 to 1, where 1 represents perfect regularity.  **Note:** For transactions with `frequency`=`SINGLE`, this value returns `null`. ")

  public Float getRegularity() {
    return regularity;
  }


  public void setRegularity(Float regularity) {
    
    this.regularity = regularity;
  }


  public IncomeStreamsBody trend(Float trend) {
    
    
    this.trend = trend;
    return this;
  }

   /**
   * The income trend during a period of time calculated between last income and first income received, where:   - a negative float means that the income trend is decreasing during the time period.   - a positive float means that the income trend is increasing during the time period.  **Note:** For transactions with &#x60;frequency&#x60;&#x3D;&#x60;SINGLE&#x60;, this value returns &#x60;null&#x60;. 
   * @return trend
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", required = true, value = "The income trend during a period of time calculated between last income and first income received, where:   - a negative float means that the income trend is decreasing during the time period.   - a positive float means that the income trend is increasing during the time period.  **Note:** For transactions with `frequency`=`SINGLE`, this value returns `null`. ")

  public Float getTrend() {
    return trend;
  }


  public void setTrend(Float trend) {
    
    this.trend = trend;
  }


  public IncomeStreamsBody lookbackPeriods(Integer lookbackPeriods) {
    
    
    this.lookbackPeriods = lookbackPeriods;
    return this;
  }

   /**
   * Number of period units (based on *rolling months*) used to generate insights and calculations.  **Note:** A *rolling month* is a period of 30 days. For example, 2023-01-15 to 2023-02-2023. 
   * @return lookbackPeriods
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "4", required = true, value = "Number of period units (based on *rolling months*) used to generate insights and calculations.  **Note:** A *rolling month* is a period of 30 days. For example, 2023-01-15 to 2023-02-2023. ")

  public Integer getLookbackPeriods() {
    return lookbackPeriods;
  }


  public void setLookbackPeriods(Integer lookbackPeriods) {
    
    this.lookbackPeriods = lookbackPeriods;
  }


  public IncomeStreamsBody fullPeriods(Integer fullPeriods) {
    
    
    this.fullPeriods = fullPeriods;
    return this;
  }

   /**
   * Number of period units (based on *rolling months*) with data to perform calculations.  **Note:** A *rolling month* is a period of 30 days. For example, 2023-01-15 to 2023-02-2023. 
   * @return fullPeriods
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "12", required = true, value = "Number of period units (based on *rolling months*) with data to perform calculations.  **Note:** A *rolling month* is a period of 30 days. For example, 2023-01-15 to 2023-02-2023. ")

  public Integer getFullPeriods() {
    return fullPeriods;
  }


  public void setFullPeriods(Integer fullPeriods) {
    
    this.fullPeriods = fullPeriods;
  }


  public IncomeStreamsBody periodsWithIncome(Integer periodsWithIncome) {
    
    
    this.periodsWithIncome = periodsWithIncome;
    return this;
  }

   /**
   * Number of period units (based on *rolling months*) with at least one income available.  **Note:** A *rolling month* is a period of 30 days. For example, 2023-01-15 to 2023-02-2023. 
   * @return periodsWithIncome
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "3", required = true, value = "Number of period units (based on *rolling months*) with at least one income available.  **Note:** A *rolling month* is a period of 30 days. For example, 2023-01-15 to 2023-02-2023. ")

  public Integer getPeriodsWithIncome() {
    return periodsWithIncome;
  }


  public void setPeriodsWithIncome(Integer periodsWithIncome) {
    
    this.periodsWithIncome = periodsWithIncome;
  }


  public IncomeStreamsBody numberOfIncomes(Integer numberOfIncomes) {
    
    
    this.numberOfIncomes = numberOfIncomes;
    return this;
  }

   /**
   * Number of income transactions over the &#x60;lookback_periods&#x60;. 
   * @return numberOfIncomes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "4", required = true, value = "Number of income transactions over the `lookback_periods`. ")

  public Integer getNumberOfIncomes() {
    return numberOfIncomes;
  }


  public void setNumberOfIncomes(Integer numberOfIncomes) {
    
    this.numberOfIncomes = numberOfIncomes;
  }


  public IncomeStreamsBody confidence(EnumIncomeStreamConfidence confidence) {
    
    
    this.confidence = confidence;
    return this;
  }

   /**
   * Get confidence
   * @return confidence
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EnumIncomeStreamConfidence getConfidence() {
    return confidence;
  }


  public void setConfidence(EnumIncomeStreamConfidence confidence) {
    
    this.confidence = confidence;
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
   * @return the IncomeStreamsBody instance itself
   */
  public IncomeStreamsBody putAdditionalProperty(String key, Object value) {
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
    IncomeStreamsBody incomeStreamsBody = (IncomeStreamsBody) o;
    return Objects.equals(this.accountId, incomeStreamsBody.accountId) &&
        Objects.equals(this.incomeType, incomeStreamsBody.incomeType) &&
        Objects.equals(this.frequency, incomeStreamsBody.frequency) &&
        Objects.equals(this.monthlyAverage, incomeStreamsBody.monthlyAverage) &&
        Objects.equals(this.averageIncomeAmount, incomeStreamsBody.averageIncomeAmount) &&
        Objects.equals(this.lastIncomeAmount, incomeStreamsBody.lastIncomeAmount) &&
        Objects.equals(this.currency, incomeStreamsBody.currency) &&
        Objects.equals(this.lastIncomeDescription, incomeStreamsBody.lastIncomeDescription) &&
        Objects.equals(this.lastIncomeDate, incomeStreamsBody.lastIncomeDate) &&
        Objects.equals(this.stability, incomeStreamsBody.stability) &&
        Objects.equals(this.regularity, incomeStreamsBody.regularity) &&
        Objects.equals(this.trend, incomeStreamsBody.trend) &&
        Objects.equals(this.lookbackPeriods, incomeStreamsBody.lookbackPeriods) &&
        Objects.equals(this.fullPeriods, incomeStreamsBody.fullPeriods) &&
        Objects.equals(this.periodsWithIncome, incomeStreamsBody.periodsWithIncome) &&
        Objects.equals(this.numberOfIncomes, incomeStreamsBody.numberOfIncomes) &&
        Objects.equals(this.confidence, incomeStreamsBody.confidence)&&
        Objects.equals(this.additionalProperties, incomeStreamsBody.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, incomeType, frequency, monthlyAverage, averageIncomeAmount, lastIncomeAmount, currency, lastIncomeDescription, lastIncomeDate, stability, regularity, trend, lookbackPeriods, fullPeriods, periodsWithIncome, numberOfIncomes, confidence, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeStreamsBody {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    incomeType: ").append(toIndentedString(incomeType)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    monthlyAverage: ").append(toIndentedString(monthlyAverage)).append("\n");
    sb.append("    averageIncomeAmount: ").append(toIndentedString(averageIncomeAmount)).append("\n");
    sb.append("    lastIncomeAmount: ").append(toIndentedString(lastIncomeAmount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    lastIncomeDescription: ").append(toIndentedString(lastIncomeDescription)).append("\n");
    sb.append("    lastIncomeDate: ").append(toIndentedString(lastIncomeDate)).append("\n");
    sb.append("    stability: ").append(toIndentedString(stability)).append("\n");
    sb.append("    regularity: ").append(toIndentedString(regularity)).append("\n");
    sb.append("    trend: ").append(toIndentedString(trend)).append("\n");
    sb.append("    lookbackPeriods: ").append(toIndentedString(lookbackPeriods)).append("\n");
    sb.append("    fullPeriods: ").append(toIndentedString(fullPeriods)).append("\n");
    sb.append("    periodsWithIncome: ").append(toIndentedString(periodsWithIncome)).append("\n");
    sb.append("    numberOfIncomes: ").append(toIndentedString(numberOfIncomes)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("income_type");
    openapiFields.add("frequency");
    openapiFields.add("monthly_average");
    openapiFields.add("average_income_amount");
    openapiFields.add("last_income_amount");
    openapiFields.add("currency");
    openapiFields.add("last_income_description");
    openapiFields.add("last_income_date");
    openapiFields.add("stability");
    openapiFields.add("regularity");
    openapiFields.add("trend");
    openapiFields.add("lookback_periods");
    openapiFields.add("full_periods");
    openapiFields.add("periods_with_income");
    openapiFields.add("number_of_incomes");
    openapiFields.add("confidence");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("account_id");
    openapiRequiredFields.add("income_type");
    openapiRequiredFields.add("frequency");
    openapiRequiredFields.add("monthly_average");
    openapiRequiredFields.add("average_income_amount");
    openapiRequiredFields.add("last_income_amount");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("last_income_description");
    openapiRequiredFields.add("last_income_date");
    openapiRequiredFields.add("stability");
    openapiRequiredFields.add("regularity");
    openapiRequiredFields.add("trend");
    openapiRequiredFields.add("lookback_periods");
    openapiRequiredFields.add("full_periods");
    openapiRequiredFields.add("periods_with_income");
    openapiRequiredFields.add("number_of_incomes");
    openapiRequiredFields.add("confidence");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IncomeStreamsBody
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!IncomeStreamsBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IncomeStreamsBody is not found in the empty JSON string", IncomeStreamsBody.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IncomeStreamsBody.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (!jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IncomeStreamsBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IncomeStreamsBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IncomeStreamsBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IncomeStreamsBody.class));

       return (TypeAdapter<T>) new TypeAdapter<IncomeStreamsBody>() {
           @Override
           public void write(JsonWriter out, IncomeStreamsBody value) throws IOException {
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
           public IncomeStreamsBody read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             IncomeStreamsBody instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of IncomeStreamsBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IncomeStreamsBody
  * @throws IOException if the JSON string is invalid with respect to IncomeStreamsBody
  */
  public static IncomeStreamsBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IncomeStreamsBody.class);
  }

 /**
  * Convert an instance of IncomeStreamsBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

