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
import com.belvo.client.model.EmploymentRecordEmploymentStatusUpdates;
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
 * Details regarding the individual&#39;s employment history.
 */
@ApiModel(description = "Details regarding the individual's employment history.")
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EmploymentRecordDetail {
  public static final String SERIALIZED_NAME_COLLECTED_AT = "collected_at";
  @SerializedName(SERIALIZED_NAME_COLLECTED_AT)
  private OffsetDateTime collectedAt;

  public static final String SERIALIZED_NAME_EMPLOYER = "employer";
  @SerializedName(SERIALIZED_NAME_EMPLOYER)
  private String employer;

  public static final String SERIALIZED_NAME_EMPLOYER_ID = "employer_id";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_ID)
  private String employerId;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_WEEKS_EMPLOYED = "weeks_employed";
  @SerializedName(SERIALIZED_NAME_WEEKS_EMPLOYED)
  private Integer weeksEmployed;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_MOST_RECENT_BASE_SALARY = "most_recent_base_salary";
  @SerializedName(SERIALIZED_NAME_MOST_RECENT_BASE_SALARY)
  private Float mostRecentBaseSalary;

  public static final String SERIALIZED_NAME_MONTHLY_SALARY = "monthly_salary";
  @SerializedName(SERIALIZED_NAME_MONTHLY_SALARY)
  private Float monthlySalary;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_EMPLOYMENT_STATUS_UPDATES = "employment_status_updates";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT_STATUS_UPDATES)
  private List<EmploymentRecordEmploymentStatusUpdates> employmentStatusUpdates = null;

  public EmploymentRecordDetail() {
  }

  public EmploymentRecordDetail collectedAt(OffsetDateTime collectedAt) {
    
    
    this.collectedAt = collectedAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp when the data point was collected.
   * @return collectedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-04-23T21:32:55.336854Z", value = "The ISO-8601 timestamp when the data point was collected.")

  public OffsetDateTime getCollectedAt() {
    return collectedAt;
  }


  public void setCollectedAt(OffsetDateTime collectedAt) {
    
    this.collectedAt = collectedAt;
  }


  public EmploymentRecordDetail employer(String employer) {
    
    
    this.employer = employer;
    return this;
  }

   /**
   * The official name of the employer. 
   * @return employer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Batman Enterprises CDMX", value = "The official name of the employer. ")

  public String getEmployer() {
    return employer;
  }


  public void setEmployer(String employer) {
    
    this.employer = employer;
  }


  public EmploymentRecordDetail employerId(String employerId) {
    
    
    this.employerId = employerId;
    return this;
  }

   /**
   * The official ID of the employer, according to the country. 
   * @return employerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "780-BAT-88769-CDMX", value = "The official ID of the employer, according to the country. ")

  public String getEmployerId() {
    return employerId;
  }


  public void setEmployerId(String employerId) {
    
    this.employerId = employerId;
  }


  public EmploymentRecordDetail startDate(LocalDate startDate) {
    
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Date when employment started, in &#x60;YYYY-MM-DD&#x60; format. 
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Wed Oct 09 17:00:00 PDT 2019", value = "Date when employment started, in `YYYY-MM-DD` format. ")

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    
    this.startDate = startDate;
  }


  public EmploymentRecordDetail endDate(LocalDate endDate) {
    
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Date when employment finished, in &#x60;YYYY-MM-DD&#x60; format. 
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Mon Dec 30 16:00:00 PST 2019", value = "Date when employment finished, in `YYYY-MM-DD` format. ")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    
    this.endDate = endDate;
  }


  public EmploymentRecordDetail weeksEmployed(Integer weeksEmployed) {
    
    
    this.weeksEmployed = weeksEmployed;
    return this;
  }

   /**
   * Number of weeks that the individual was employed. 
   * @return weeksEmployed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12", value = "Number of weeks that the individual was employed. ")

  public Integer getWeeksEmployed() {
    return weeksEmployed;
  }


  public void setWeeksEmployed(Integer weeksEmployed) {
    
    this.weeksEmployed = weeksEmployed;
  }


  public EmploymentRecordDetail state(String state) {
    
    
    this.state = state;
    return this;
  }

   /**
   * In what geographical state the individual was employed, according to the country. 
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DISTRITO FEDERAL", value = "In what geographical state the individual was employed, according to the country. ")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    
    this.state = state;
  }


  public EmploymentRecordDetail mostRecentBaseSalary(Float mostRecentBaseSalary) {
    
    
    this.mostRecentBaseSalary = mostRecentBaseSalary;
    return this;
  }

   /**
   * The most recent base salary the individual earned.  For Mexico, this is the *daily* rate that the individual earned, including the perks that the individual is entitled to throughout the year. 
   * @return mostRecentBaseSalary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "762.54", value = "The most recent base salary the individual earned.  For Mexico, this is the *daily* rate that the individual earned, including the perks that the individual is entitled to throughout the year. ")

  public Float getMostRecentBaseSalary() {
    return mostRecentBaseSalary;
  }


  public void setMostRecentBaseSalary(Float mostRecentBaseSalary) {
    
    this.mostRecentBaseSalary = mostRecentBaseSalary;
  }


  public EmploymentRecordDetail monthlySalary(Float monthlySalary) {
    
    
    this.monthlySalary = monthlySalary;
    return this;
  }

   /**
   * The monthly salary of the individual, including any additional perks. 
   * @return monthlySalary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The monthly salary of the individual, including any additional perks. ")

  public Float getMonthlySalary() {
    return monthlySalary;
  }


  public void setMonthlySalary(Float monthlySalary) {
    
    this.monthlySalary = monthlySalary;
  }


  public EmploymentRecordDetail currency(String currency) {
    
    
    this.currency = currency;
    return this;
  }

   /**
   * The three-letter currency code in which the salary is paid. 
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MXN", value = "The three-letter currency code in which the salary is paid. ")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    
    this.currency = currency;
  }


  public EmploymentRecordDetail employmentStatusUpdates(List<EmploymentRecordEmploymentStatusUpdates> employmentStatusUpdates) {
    
    
    this.employmentStatusUpdates = employmentStatusUpdates;
    return this;
  }

  public EmploymentRecordDetail addEmploymentStatusUpdatesItem(EmploymentRecordEmploymentStatusUpdates employmentStatusUpdatesItem) {
    if (this.employmentStatusUpdates == null) {
      this.employmentStatusUpdates = new ArrayList<>();
    }
    this.employmentStatusUpdates.add(employmentStatusUpdatesItem);
    return this;
  }

   /**
   * Details regarding any employment changes of the individual.
   * @return employmentStatusUpdates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details regarding any employment changes of the individual.")

  public List<EmploymentRecordEmploymentStatusUpdates> getEmploymentStatusUpdates() {
    return employmentStatusUpdates;
  }


  public void setEmploymentStatusUpdates(List<EmploymentRecordEmploymentStatusUpdates> employmentStatusUpdates) {
    
    this.employmentStatusUpdates = employmentStatusUpdates;
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
   * @return the EmploymentRecordDetail instance itself
   */
  public EmploymentRecordDetail putAdditionalProperty(String key, Object value) {
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
    EmploymentRecordDetail employmentRecordDetail = (EmploymentRecordDetail) o;
    return Objects.equals(this.collectedAt, employmentRecordDetail.collectedAt) &&
        Objects.equals(this.employer, employmentRecordDetail.employer) &&
        Objects.equals(this.employerId, employmentRecordDetail.employerId) &&
        Objects.equals(this.startDate, employmentRecordDetail.startDate) &&
        Objects.equals(this.endDate, employmentRecordDetail.endDate) &&
        Objects.equals(this.weeksEmployed, employmentRecordDetail.weeksEmployed) &&
        Objects.equals(this.state, employmentRecordDetail.state) &&
        Objects.equals(this.mostRecentBaseSalary, employmentRecordDetail.mostRecentBaseSalary) &&
        Objects.equals(this.monthlySalary, employmentRecordDetail.monthlySalary) &&
        Objects.equals(this.currency, employmentRecordDetail.currency) &&
        Objects.equals(this.employmentStatusUpdates, employmentRecordDetail.employmentStatusUpdates)&&
        Objects.equals(this.additionalProperties, employmentRecordDetail.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectedAt, employer, employerId, startDate, endDate, weeksEmployed, state, mostRecentBaseSalary, monthlySalary, currency, employmentStatusUpdates, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmploymentRecordDetail {\n");
    sb.append("    collectedAt: ").append(toIndentedString(collectedAt)).append("\n");
    sb.append("    employer: ").append(toIndentedString(employer)).append("\n");
    sb.append("    employerId: ").append(toIndentedString(employerId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    weeksEmployed: ").append(toIndentedString(weeksEmployed)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    mostRecentBaseSalary: ").append(toIndentedString(mostRecentBaseSalary)).append("\n");
    sb.append("    monthlySalary: ").append(toIndentedString(monthlySalary)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    employmentStatusUpdates: ").append(toIndentedString(employmentStatusUpdates)).append("\n");
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
    openapiFields.add("collected_at");
    openapiFields.add("employer");
    openapiFields.add("employer_id");
    openapiFields.add("start_date");
    openapiFields.add("end_date");
    openapiFields.add("weeks_employed");
    openapiFields.add("state");
    openapiFields.add("most_recent_base_salary");
    openapiFields.add("monthly_salary");
    openapiFields.add("currency");
    openapiFields.add("employment_status_updates");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmploymentRecordDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EmploymentRecordDetail.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmploymentRecordDetail is not found in the empty JSON string", EmploymentRecordDetail.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("employer") != null && !jsonObj.get("employer").isJsonNull()) && !jsonObj.get("employer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employer").toString()));
      }
      if ((jsonObj.get("employer_id") != null && !jsonObj.get("employer_id").isJsonNull()) && !jsonObj.get("employer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employer_id").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if (jsonObj.get("employment_status_updates") != null && !jsonObj.get("employment_status_updates").isJsonNull()) {
        JsonArray jsonArrayemploymentStatusUpdates = jsonObj.getAsJsonArray("employment_status_updates");
        if (jsonArrayemploymentStatusUpdates != null) {
          // ensure the json data is an array
          if (!jsonObj.get("employment_status_updates").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `employment_status_updates` to be an array in the JSON string but got `%s`", jsonObj.get("employment_status_updates").toString()));
          }

          // validate the optional field `employment_status_updates` (array)
          for (int i = 0; i < jsonArrayemploymentStatusUpdates.size(); i++) {
            EmploymentRecordEmploymentStatusUpdates.validateJsonObject(jsonArrayemploymentStatusUpdates.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmploymentRecordDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmploymentRecordDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmploymentRecordDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmploymentRecordDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<EmploymentRecordDetail>() {
           @Override
           public void write(JsonWriter out, EmploymentRecordDetail value) throws IOException {
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
           public EmploymentRecordDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EmploymentRecordDetail instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EmploymentRecordDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmploymentRecordDetail
  * @throws IOException if the JSON string is invalid with respect to EmploymentRecordDetail
  */
  public static EmploymentRecordDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmploymentRecordDetail.class);
  }

 /**
  * Convert an instance of EmploymentRecordDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

