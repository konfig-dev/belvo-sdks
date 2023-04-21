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
import com.belvo.client.model.EnumIncomeSourceType;
import com.belvo.client.model.IncomeStreamsBody;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.belvo.client.JSON;

/**
 * Income insights
 */
@ApiModel(description = "Income insights")
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Income {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private UUID link;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_INCOME_STREAMS = "income_streams";
  @SerializedName(SERIALIZED_NAME_INCOME_STREAMS)
  private List<IncomeStreamsBody> incomeStreams = new ArrayList<>();

  public static final String SERIALIZED_NAME_INSTITUTION = "institution";
  @SerializedName(SERIALIZED_NAME_INSTITUTION)
  private String institution;

  public static final String SERIALIZED_NAME_INCOME_SOURCE_TYPE = "income_source_type";
  @SerializedName(SERIALIZED_NAME_INCOME_SOURCE_TYPE)
  private EnumIncomeSourceType incomeSourceType;

  public static final String SERIALIZED_NAME_FIRST_TRANSACTION_DATE = "first_transaction_date";
  @SerializedName(SERIALIZED_NAME_FIRST_TRANSACTION_DATE)
  private LocalDate firstTransactionDate;

  public static final String SERIALIZED_NAME_LAST_TRANSACTION_DATE = "last_transaction_date";
  @SerializedName(SERIALIZED_NAME_LAST_TRANSACTION_DATE)
  private LocalDate lastTransactionDate;

  public static final String SERIALIZED_NAME_NUMBER_OF_INCOME_STREAMS = "number_of_income_streams";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_INCOME_STREAMS)
  private Integer numberOfIncomeStreams;

  public static final String SERIALIZED_NAME_MONTHLY_AVERAGE = "monthly_average";
  @SerializedName(SERIALIZED_NAME_MONTHLY_AVERAGE)
  private Float monthlyAverage;

  public static final String SERIALIZED_NAME_MONTHLY_AVERAGE_REGULAR = "monthly_average_regular";
  @SerializedName(SERIALIZED_NAME_MONTHLY_AVERAGE_REGULAR)
  private Float monthlyAverageRegular;

  public static final String SERIALIZED_NAME_MONTHLY_AVERAGE_IRREGULAR = "monthly_average_irregular";
  @SerializedName(SERIALIZED_NAME_MONTHLY_AVERAGE_IRREGULAR)
  private Float monthlyAverageIrregular;

  public static final String SERIALIZED_NAME_MONTHLY_AVERAGE_LOW_CONFIDENCE = "monthly_average_low_confidence";
  @SerializedName(SERIALIZED_NAME_MONTHLY_AVERAGE_LOW_CONFIDENCE)
  private Float monthlyAverageLowConfidence;

  public static final String SERIALIZED_NAME_MONTHLY_AVERAGE_MEDIUM_CONFIDENCE = "monthly_average_medium_confidence";
  @SerializedName(SERIALIZED_NAME_MONTHLY_AVERAGE_MEDIUM_CONFIDENCE)
  private Float monthlyAverageMediumConfidence;

  public static final String SERIALIZED_NAME_MONTHLY_AVERAGE_HIGH_CONFIDENCE = "monthly_average_high_confidence";
  @SerializedName(SERIALIZED_NAME_MONTHLY_AVERAGE_HIGH_CONFIDENCE)
  private Float monthlyAverageHighConfidence;

  public static final String SERIALIZED_NAME_TOTAL_INCOME_AMOUNT = "total_income_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_INCOME_AMOUNT)
  private Float totalIncomeAmount;

  public static final String SERIALIZED_NAME_TOTAL_REGULAR_INCOME_AMOUNT = "total_regular_income_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_REGULAR_INCOME_AMOUNT)
  private Float totalRegularIncomeAmount;

  public static final String SERIALIZED_NAME_TOTAL_IRREGULAR_INCOME_AMOUNT = "total_irregular_income_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_IRREGULAR_INCOME_AMOUNT)
  private Float totalIrregularIncomeAmount;

  public static final String SERIALIZED_NAME_TOTAL_LOW_CONFIDENCE = "total_low_confidence";
  @SerializedName(SERIALIZED_NAME_TOTAL_LOW_CONFIDENCE)
  private Float totalLowConfidence;

  public static final String SERIALIZED_NAME_TOTAL_MEDIUM_CONFIDENCE = "total_medium_confidence";
  @SerializedName(SERIALIZED_NAME_TOTAL_MEDIUM_CONFIDENCE)
  private Float totalMediumConfidence;

  public static final String SERIALIZED_NAME_TOTAL_HIGH_CONFIDENCE = "total_high_confidence";
  @SerializedName(SERIALIZED_NAME_TOTAL_HIGH_CONFIDENCE)
  private Float totalHighConfidence;

  public Income() {
  }

  public Income id(UUID id) {
    
    
    this.id = id;
    return this;
  }

   /**
   * Belvo&#39;s unique identifier for the current income.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "076c66e5-90f5-4e01-99c7-50e32f65ae42", required = true, value = "Belvo's unique identifier for the current income.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    
    this.id = id;
  }


  public Income link(UUID link) {
    
    
    this.link = link;
    return this;
  }

   /**
   * The &#x60;link.id&#x60; the account belongs to.
   * @return link
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "f4621548-2f9e-440e-9ebd-ae8decac8c02", required = true, value = "The `link.id` the account belongs to.")

  public UUID getLink() {
    return link;
  }


  public void setLink(UUID link) {
    
    this.link = link;
  }


  public Income createdAt(OffsetDateTime createdAt) {
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp of when the data point was created in Belvo&#39;s database.
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2022-02-09T08:45:50.406032Z", required = true, value = "The ISO-8601 timestamp of when the data point was created in Belvo's database.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
  }


  public Income incomeStreams(List<IncomeStreamsBody> incomeStreams) {
    
    
    this.incomeStreams = incomeStreams;
    return this;
  }

  public Income addIncomeStreamsItem(IncomeStreamsBody incomeStreamsItem) {
    this.incomeStreams.add(incomeStreamsItem);
    return this;
  }

   /**
   * An array of enriched income stream objects.
   * @return incomeStreams
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "An array of enriched income stream objects.")

  public List<IncomeStreamsBody> getIncomeStreams() {
    return incomeStreams;
  }


  public void setIncomeStreams(List<IncomeStreamsBody> incomeStreams) {
    
    this.incomeStreams = incomeStreams;
  }


  public Income institution(String institution) {
    
    
    this.institution = institution;
    return this;
  }

   /**
   * The institution where the account is registered.
   * @return institution
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Erebor Brazil", required = true, value = "The institution where the account is registered.")

  public String getInstitution() {
    return institution;
  }


  public void setInstitution(String institution) {
    
    this.institution = institution;
  }


  public Income incomeSourceType(EnumIncomeSourceType incomeSourceType) {
    
    
    this.incomeSourceType = incomeSourceType;
    return this;
  }

   /**
   * Get incomeSourceType
   * @return incomeSourceType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EnumIncomeSourceType getIncomeSourceType() {
    return incomeSourceType;
  }


  public void setIncomeSourceType(EnumIncomeSourceType incomeSourceType) {
    
    this.incomeSourceType = incomeSourceType;
  }


  public Income firstTransactionDate(LocalDate firstTransactionDate) {
    
    
    this.firstTransactionDate = firstTransactionDate;
    return this;
  }

   /**
   * The date when the first transaction occurred, in &#x60;YYYY-MM-DD&#x60; format. 
   * @return firstTransactionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Wed Jun 08 17:00:00 PDT 2022", required = true, value = "The date when the first transaction occurred, in `YYYY-MM-DD` format. ")

  public LocalDate getFirstTransactionDate() {
    return firstTransactionDate;
  }


  public void setFirstTransactionDate(LocalDate firstTransactionDate) {
    
    this.firstTransactionDate = firstTransactionDate;
  }


  public Income lastTransactionDate(LocalDate lastTransactionDate) {
    
    
    this.lastTransactionDate = lastTransactionDate;
    return this;
  }

   /**
   * The date when when the last transaction occurred, in &#x60;YYYY-MM-DD&#x60; format. 
   * @return lastTransactionDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Wed Feb 08 16:00:00 PST 2023", required = true, value = "The date when when the last transaction occurred, in `YYYY-MM-DD` format. ")

  public LocalDate getLastTransactionDate() {
    return lastTransactionDate;
  }


  public void setLastTransactionDate(LocalDate lastTransactionDate) {
    
    this.lastTransactionDate = lastTransactionDate;
  }


  public Income numberOfIncomeStreams(Integer numberOfIncomeStreams) {
    
    
    this.numberOfIncomeStreams = numberOfIncomeStreams;
    return this;
  }

   /**
   * Number of total income streams analized. 
   * @return numberOfIncomeStreams
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "12", required = true, value = "Number of total income streams analized. ")

  public Integer getNumberOfIncomeStreams() {
    return numberOfIncomeStreams;
  }


  public void setNumberOfIncomeStreams(Integer numberOfIncomeStreams) {
    
    this.numberOfIncomeStreams = numberOfIncomeStreams;
  }


  public Income monthlyAverage(Float monthlyAverage) {
    
    
    this.monthlyAverage = monthlyAverage;
    return this;
  }

   /**
   * Average amount of income received per month across all the accounts for the specific user. 
   * @return monthlyAverage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1705.46", required = true, value = "Average amount of income received per month across all the accounts for the specific user. ")

  public Float getMonthlyAverage() {
    return monthlyAverage;
  }


  public void setMonthlyAverage(Float monthlyAverage) {
    
    this.monthlyAverage = monthlyAverage;
  }


  public Income monthlyAverageRegular(Float monthlyAverageRegular) {
    
    
    this.monthlyAverageRegular = monthlyAverageRegular;
    return this;
  }

   /**
   * Average amount of regular income (with a frequency of &#x60;MONTHLY&#x60;, &#x60;BIWEEKLY&#x60;, or &#x60;WEEKLY&#x60;) received per month for the specific user. 
   * @return monthlyAverageRegular
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2500", required = true, value = "Average amount of regular income (with a frequency of `MONTHLY`, `BIWEEKLY`, or `WEEKLY`) received per month for the specific user. ")

  public Float getMonthlyAverageRegular() {
    return monthlyAverageRegular;
  }


  public void setMonthlyAverageRegular(Float monthlyAverageRegular) {
    
    this.monthlyAverageRegular = monthlyAverageRegular;
  }


  public Income monthlyAverageIrregular(Float monthlyAverageIrregular) {
    
    
    this.monthlyAverageIrregular = monthlyAverageIrregular;
    return this;
  }

   /**
   * Average amount of irregular income (with a frequency of &#x60;SINGLE&#x60; or &#x60;IRREGULAR&#x60;) received per month for the specific user. 
   * @return monthlyAverageIrregular
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1308.18", required = true, value = "Average amount of irregular income (with a frequency of `SINGLE` or `IRREGULAR`) received per month for the specific user. ")

  public Float getMonthlyAverageIrregular() {
    return monthlyAverageIrregular;
  }


  public void setMonthlyAverageIrregular(Float monthlyAverageIrregular) {
    
    this.monthlyAverageIrregular = monthlyAverageIrregular;
  }


  public Income monthlyAverageLowConfidence(Float monthlyAverageLowConfidence) {
    
    
    this.monthlyAverageLowConfidence = monthlyAverageLowConfidence;
    return this;
  }

   /**
   * Average amount of income received per month for the specific user with &#x60;LOW&#x60; confidence. 
   * @return monthlyAverageLowConfidence
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1308.18", required = true, value = "Average amount of income received per month for the specific user with `LOW` confidence. ")

  public Float getMonthlyAverageLowConfidence() {
    return monthlyAverageLowConfidence;
  }


  public void setMonthlyAverageLowConfidence(Float monthlyAverageLowConfidence) {
    
    this.monthlyAverageLowConfidence = monthlyAverageLowConfidence;
  }


  public Income monthlyAverageMediumConfidence(Float monthlyAverageMediumConfidence) {
    
    
    this.monthlyAverageMediumConfidence = monthlyAverageMediumConfidence;
    return this;
  }

   /**
   * Average amount of income received per month for the specific user with &#x60;MEDIUM&#x60; confidence. 
   * @return monthlyAverageMediumConfidence
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2500", required = true, value = "Average amount of income received per month for the specific user with `MEDIUM` confidence. ")

  public Float getMonthlyAverageMediumConfidence() {
    return monthlyAverageMediumConfidence;
  }


  public void setMonthlyAverageMediumConfidence(Float monthlyAverageMediumConfidence) {
    
    this.monthlyAverageMediumConfidence = monthlyAverageMediumConfidence;
  }


  public Income monthlyAverageHighConfidence(Float monthlyAverageHighConfidence) {
    
    
    this.monthlyAverageHighConfidence = monthlyAverageHighConfidence;
    return this;
  }

   /**
   * Average amount of income received per month for the specific user with &#x60;HIGH&#x60; confidence. 
   * @return monthlyAverageHighConfidence
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "Average amount of income received per month for the specific user with `HIGH` confidence. ")

  public Float getMonthlyAverageHighConfidence() {
    return monthlyAverageHighConfidence;
  }


  public void setMonthlyAverageHighConfidence(Float monthlyAverageHighConfidence) {
    
    this.monthlyAverageHighConfidence = monthlyAverageHighConfidence;
  }


  public Income totalIncomeAmount(Float totalIncomeAmount) {
    
    
    this.totalIncomeAmount = totalIncomeAmount;
    return this;
  }

   /**
   * Total amount of all income received for the specific user. 
   * @return totalIncomeAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "12616.37", required = true, value = "Total amount of all income received for the specific user. ")

  public Float getTotalIncomeAmount() {
    return totalIncomeAmount;
  }


  public void setTotalIncomeAmount(Float totalIncomeAmount) {
    
    this.totalIncomeAmount = totalIncomeAmount;
  }


  public Income totalRegularIncomeAmount(Float totalRegularIncomeAmount) {
    
    
    this.totalRegularIncomeAmount = totalRegularIncomeAmount;
    return this;
  }

   /**
   * Total amount of regular income (with a frequency of &#x60;MONTHLY&#x60;, &#x60;BIWEEKLY&#x60;, &#x60;WEEKLY&#x60;) for the specific user. 
   * @return totalRegularIncomeAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "10000", required = true, value = "Total amount of regular income (with a frequency of `MONTHLY`, `BIWEEKLY`, `WEEKLY`) for the specific user. ")

  public Float getTotalRegularIncomeAmount() {
    return totalRegularIncomeAmount;
  }


  public void setTotalRegularIncomeAmount(Float totalRegularIncomeAmount) {
    
    this.totalRegularIncomeAmount = totalRegularIncomeAmount;
  }


  public Income totalIrregularIncomeAmount(Float totalIrregularIncomeAmount) {
    
    
    this.totalIrregularIncomeAmount = totalIrregularIncomeAmount;
    return this;
  }

   /**
   * Total amount of irregular income (with a frequency of &#x60;SINGLE&#x60; or &#x60;IRREGULAR&#x60;) for the specific user. 
   * @return totalIrregularIncomeAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2616.37", value = "Total amount of irregular income (with a frequency of `SINGLE` or `IRREGULAR`) for the specific user. ")

  public Float getTotalIrregularIncomeAmount() {
    return totalIrregularIncomeAmount;
  }


  public void setTotalIrregularIncomeAmount(Float totalIrregularIncomeAmount) {
    
    this.totalIrregularIncomeAmount = totalIrregularIncomeAmount;
  }


  public Income totalLowConfidence(Float totalLowConfidence) {
    
    
    this.totalLowConfidence = totalLowConfidence;
    return this;
  }

   /**
   * Total amount of income for the specific user with &#x60;LOW&#x60; confidence. 
   * @return totalLowConfidence
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2616.37", required = true, value = "Total amount of income for the specific user with `LOW` confidence. ")

  public Float getTotalLowConfidence() {
    return totalLowConfidence;
  }


  public void setTotalLowConfidence(Float totalLowConfidence) {
    
    this.totalLowConfidence = totalLowConfidence;
  }


  public Income totalMediumConfidence(Float totalMediumConfidence) {
    
    
    this.totalMediumConfidence = totalMediumConfidence;
    return this;
  }

   /**
   * Total amount of income for the specific user with &#x60;MEDIUM&#x60; confidence. 
   * @return totalMediumConfidence
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "10000", required = true, value = "Total amount of income for the specific user with `MEDIUM` confidence. ")

  public Float getTotalMediumConfidence() {
    return totalMediumConfidence;
  }


  public void setTotalMediumConfidence(Float totalMediumConfidence) {
    
    this.totalMediumConfidence = totalMediumConfidence;
  }


  public Income totalHighConfidence(Float totalHighConfidence) {
    
    
    this.totalHighConfidence = totalHighConfidence;
    return this;
  }

   /**
   * Total amount of income for the specific user with &#x60;HIGH&#x60; confidence. 
   * @return totalHighConfidence
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "Total amount of income for the specific user with `HIGH` confidence. ")

  public Float getTotalHighConfidence() {
    return totalHighConfidence;
  }


  public void setTotalHighConfidence(Float totalHighConfidence) {
    
    this.totalHighConfidence = totalHighConfidence;
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
   * @return the Income instance itself
   */
  public Income putAdditionalProperty(String key, Object value) {
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
    Income income = (Income) o;
    return Objects.equals(this.id, income.id) &&
        Objects.equals(this.link, income.link) &&
        Objects.equals(this.createdAt, income.createdAt) &&
        Objects.equals(this.incomeStreams, income.incomeStreams) &&
        Objects.equals(this.institution, income.institution) &&
        Objects.equals(this.incomeSourceType, income.incomeSourceType) &&
        Objects.equals(this.firstTransactionDate, income.firstTransactionDate) &&
        Objects.equals(this.lastTransactionDate, income.lastTransactionDate) &&
        Objects.equals(this.numberOfIncomeStreams, income.numberOfIncomeStreams) &&
        Objects.equals(this.monthlyAverage, income.monthlyAverage) &&
        Objects.equals(this.monthlyAverageRegular, income.monthlyAverageRegular) &&
        Objects.equals(this.monthlyAverageIrregular, income.monthlyAverageIrregular) &&
        Objects.equals(this.monthlyAverageLowConfidence, income.monthlyAverageLowConfidence) &&
        Objects.equals(this.monthlyAverageMediumConfidence, income.monthlyAverageMediumConfidence) &&
        Objects.equals(this.monthlyAverageHighConfidence, income.monthlyAverageHighConfidence) &&
        Objects.equals(this.totalIncomeAmount, income.totalIncomeAmount) &&
        Objects.equals(this.totalRegularIncomeAmount, income.totalRegularIncomeAmount) &&
        Objects.equals(this.totalIrregularIncomeAmount, income.totalIrregularIncomeAmount) &&
        Objects.equals(this.totalLowConfidence, income.totalLowConfidence) &&
        Objects.equals(this.totalMediumConfidence, income.totalMediumConfidence) &&
        Objects.equals(this.totalHighConfidence, income.totalHighConfidence)&&
        Objects.equals(this.additionalProperties, income.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, link, createdAt, incomeStreams, institution, incomeSourceType, firstTransactionDate, lastTransactionDate, numberOfIncomeStreams, monthlyAverage, monthlyAverageRegular, monthlyAverageIrregular, monthlyAverageLowConfidence, monthlyAverageMediumConfidence, monthlyAverageHighConfidence, totalIncomeAmount, totalRegularIncomeAmount, totalIrregularIncomeAmount, totalLowConfidence, totalMediumConfidence, totalHighConfidence, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Income {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    incomeStreams: ").append(toIndentedString(incomeStreams)).append("\n");
    sb.append("    institution: ").append(toIndentedString(institution)).append("\n");
    sb.append("    incomeSourceType: ").append(toIndentedString(incomeSourceType)).append("\n");
    sb.append("    firstTransactionDate: ").append(toIndentedString(firstTransactionDate)).append("\n");
    sb.append("    lastTransactionDate: ").append(toIndentedString(lastTransactionDate)).append("\n");
    sb.append("    numberOfIncomeStreams: ").append(toIndentedString(numberOfIncomeStreams)).append("\n");
    sb.append("    monthlyAverage: ").append(toIndentedString(monthlyAverage)).append("\n");
    sb.append("    monthlyAverageRegular: ").append(toIndentedString(monthlyAverageRegular)).append("\n");
    sb.append("    monthlyAverageIrregular: ").append(toIndentedString(monthlyAverageIrregular)).append("\n");
    sb.append("    monthlyAverageLowConfidence: ").append(toIndentedString(monthlyAverageLowConfidence)).append("\n");
    sb.append("    monthlyAverageMediumConfidence: ").append(toIndentedString(monthlyAverageMediumConfidence)).append("\n");
    sb.append("    monthlyAverageHighConfidence: ").append(toIndentedString(monthlyAverageHighConfidence)).append("\n");
    sb.append("    totalIncomeAmount: ").append(toIndentedString(totalIncomeAmount)).append("\n");
    sb.append("    totalRegularIncomeAmount: ").append(toIndentedString(totalRegularIncomeAmount)).append("\n");
    sb.append("    totalIrregularIncomeAmount: ").append(toIndentedString(totalIrregularIncomeAmount)).append("\n");
    sb.append("    totalLowConfidence: ").append(toIndentedString(totalLowConfidence)).append("\n");
    sb.append("    totalMediumConfidence: ").append(toIndentedString(totalMediumConfidence)).append("\n");
    sb.append("    totalHighConfidence: ").append(toIndentedString(totalHighConfidence)).append("\n");
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
    openapiFields.add("link");
    openapiFields.add("created_at");
    openapiFields.add("income_streams");
    openapiFields.add("institution");
    openapiFields.add("income_source_type");
    openapiFields.add("first_transaction_date");
    openapiFields.add("last_transaction_date");
    openapiFields.add("number_of_income_streams");
    openapiFields.add("monthly_average");
    openapiFields.add("monthly_average_regular");
    openapiFields.add("monthly_average_irregular");
    openapiFields.add("monthly_average_low_confidence");
    openapiFields.add("monthly_average_medium_confidence");
    openapiFields.add("monthly_average_high_confidence");
    openapiFields.add("total_income_amount");
    openapiFields.add("total_regular_income_amount");
    openapiFields.add("total_irregular_income_amount");
    openapiFields.add("total_low_confidence");
    openapiFields.add("total_medium_confidence");
    openapiFields.add("total_high_confidence");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("link");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("income_streams");
    openapiRequiredFields.add("institution");
    openapiRequiredFields.add("income_source_type");
    openapiRequiredFields.add("first_transaction_date");
    openapiRequiredFields.add("last_transaction_date");
    openapiRequiredFields.add("number_of_income_streams");
    openapiRequiredFields.add("monthly_average");
    openapiRequiredFields.add("monthly_average_regular");
    openapiRequiredFields.add("monthly_average_irregular");
    openapiRequiredFields.add("monthly_average_low_confidence");
    openapiRequiredFields.add("monthly_average_medium_confidence");
    openapiRequiredFields.add("monthly_average_high_confidence");
    openapiRequiredFields.add("total_income_amount");
    openapiRequiredFields.add("total_regular_income_amount");
    openapiRequiredFields.add("total_low_confidence");
    openapiRequiredFields.add("total_medium_confidence");
    openapiRequiredFields.add("total_high_confidence");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Income
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Income.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Income is not found in the empty JSON string", Income.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Income.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("income_streams").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `income_streams` to be an array in the JSON string but got `%s`", jsonObj.get("income_streams").toString()));
      }

      JsonArray jsonArrayincomeStreams = jsonObj.getAsJsonArray("income_streams");
      // validate the required field `income_streams` (array)
      for (int i = 0; i < jsonArrayincomeStreams.size(); i++) {
        IncomeStreamsBody.validateJsonObject(jsonArrayincomeStreams.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("institution").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `institution` to be a primitive type in the JSON string but got `%s`", jsonObj.get("institution").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Income.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Income' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Income> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Income.class));

       return (TypeAdapter<T>) new TypeAdapter<Income>() {
           @Override
           public void write(JsonWriter out, Income value) throws IOException {
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
           public Income read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Income instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Income given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Income
  * @throws IOException if the JSON string is invalid with respect to Income
  */
  public static Income fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Income.class);
  }

 /**
  * Convert an instance of Income to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

