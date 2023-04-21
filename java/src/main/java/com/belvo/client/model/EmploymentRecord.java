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
import com.belvo.client.model.EmploymentRecordDetail;
import com.belvo.client.model.EmploymentRecordFile;
import com.belvo.client.model.EmploymentRecordPersonalData;
import com.belvo.client.model.EmploymentRecordSocialSecuritySummary;
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
 * Emploment record response payload
 */
@ApiModel(description = "Emploment record response payload")
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EmploymentRecord {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private UUID link;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_COLLECTED_AT = "collected_at";
  @SerializedName(SERIALIZED_NAME_COLLECTED_AT)
  private OffsetDateTime collectedAt;

  public static final String SERIALIZED_NAME_REPORT_DATE = "report_date";
  @SerializedName(SERIALIZED_NAME_REPORT_DATE)
  private LocalDate reportDate;

  public static final String SERIALIZED_NAME_INTERNAL_IDENTIFICATION = "internal_identification";
  @SerializedName(SERIALIZED_NAME_INTERNAL_IDENTIFICATION)
  private String internalIdentification;

  public static final String SERIALIZED_NAME_PERSONAL_DATA = "personal_data";
  @SerializedName(SERIALIZED_NAME_PERSONAL_DATA)
  private EmploymentRecordPersonalData personalData;

  public static final String SERIALIZED_NAME_SOCIAL_SECURITY_SUMMARY = "social_security_summary";
  @SerializedName(SERIALIZED_NAME_SOCIAL_SECURITY_SUMMARY)
  private EmploymentRecordSocialSecuritySummary socialSecuritySummary;

  public static final String SERIALIZED_NAME_EMPLOYMENT_RECORDS = "employment_records";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT_RECORDS)
  private List<EmploymentRecordDetail> employmentRecords = null;

  public static final String SERIALIZED_NAME_FILES = "files";
  @SerializedName(SERIALIZED_NAME_FILES)
  private List<EmploymentRecordFile> files = null;

  public EmploymentRecord() {
  }

  public EmploymentRecord id(UUID id) {
    
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier created by Belvo for the current IMSS statement.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "fef05fc8-7357-4a4a-9d29-55038ea31a04", value = "The unique identifier created by Belvo for the current IMSS statement.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    
    this.id = id;
  }


  public EmploymentRecord link(UUID link) {
    
    
    this.link = link;
    return this;
  }

   /**
   * The unique identifier created by Belvo for the current user.
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "27c1d5cf-e8fb-433a-a2f7-d246de199c01", value = "The unique identifier created by Belvo for the current user.")

  public UUID getLink() {
    return link;
  }


  public void setLink(UUID link) {
    
    this.link = link;
  }


  public EmploymentRecord createdAt(OffsetDateTime createdAt) {
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp of when the data point was initially created in Belvo&#39;s database.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-04-23T21:32:55.336854Z", value = "The ISO-8601 timestamp of when the data point was initially created in Belvo's database.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
  }


  public EmploymentRecord collectedAt(OffsetDateTime collectedAt) {
    
    
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


  public EmploymentRecord reportDate(LocalDate reportDate) {
    
    
    this.reportDate = reportDate;
    return this;
  }

   /**
   * The date when the employment record report was generated, in &#x60;YYYY-MM-DD&#x60; format.
   * @return reportDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Wed Jan 18 16:00:00 PST 2023", value = "The date when the employment record report was generated, in `YYYY-MM-DD` format.")

  public LocalDate getReportDate() {
    return reportDate;
  }


  public void setReportDate(LocalDate reportDate) {
    
    this.reportDate = reportDate;
  }


  public EmploymentRecord internalIdentification(String internalIdentification) {
    
    
    this.internalIdentification = internalIdentification;
    return this;
  }

   /**
   * Unique ID for user according to the institution. For IMSS Mexico, this is the CURP.
   * @return internalIdentification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BLPM951331IONVGR54", value = "Unique ID for user according to the institution. For IMSS Mexico, this is the CURP.")

  public String getInternalIdentification() {
    return internalIdentification;
  }


  public void setInternalIdentification(String internalIdentification) {
    
    this.internalIdentification = internalIdentification;
  }


  public EmploymentRecord personalData(EmploymentRecordPersonalData personalData) {
    
    
    this.personalData = personalData;
    return this;
  }

   /**
   * Get personalData
   * @return personalData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EmploymentRecordPersonalData getPersonalData() {
    return personalData;
  }


  public void setPersonalData(EmploymentRecordPersonalData personalData) {
    
    this.personalData = personalData;
  }


  public EmploymentRecord socialSecuritySummary(EmploymentRecordSocialSecuritySummary socialSecuritySummary) {
    
    
    this.socialSecuritySummary = socialSecuritySummary;
    return this;
  }

   /**
   * Get socialSecuritySummary
   * @return socialSecuritySummary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EmploymentRecordSocialSecuritySummary getSocialSecuritySummary() {
    return socialSecuritySummary;
  }


  public void setSocialSecuritySummary(EmploymentRecordSocialSecuritySummary socialSecuritySummary) {
    
    this.socialSecuritySummary = socialSecuritySummary;
  }


  public EmploymentRecord employmentRecords(List<EmploymentRecordDetail> employmentRecords) {
    
    
    this.employmentRecords = employmentRecords;
    return this;
  }

  public EmploymentRecord addEmploymentRecordsItem(EmploymentRecordDetail employmentRecordsItem) {
    if (this.employmentRecords == null) {
      this.employmentRecords = new ArrayList<>();
    }
    this.employmentRecords.add(employmentRecordsItem);
    return this;
  }

   /**
   * Details regarding the individual&#39;s employment history.
   * @return employmentRecords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details regarding the individual's employment history.")

  public List<EmploymentRecordDetail> getEmploymentRecords() {
    return employmentRecords;
  }


  public void setEmploymentRecords(List<EmploymentRecordDetail> employmentRecords) {
    
    this.employmentRecords = employmentRecords;
  }


  public EmploymentRecord files(List<EmploymentRecordFile> files) {
    
    
    this.files = files;
    return this;
  }

  public EmploymentRecord addFilesItem(EmploymentRecordFile filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<>();
    }
    this.files.add(filesItem);
    return this;
  }

   /**
   * Additional PDF binary files relating to the individual&#39;s employment.
   * @return files
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional PDF binary files relating to the individual's employment.")

  public List<EmploymentRecordFile> getFiles() {
    return files;
  }


  public void setFiles(List<EmploymentRecordFile> files) {
    
    this.files = files;
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
   * @return the EmploymentRecord instance itself
   */
  public EmploymentRecord putAdditionalProperty(String key, Object value) {
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
    EmploymentRecord employmentRecord = (EmploymentRecord) o;
    return Objects.equals(this.id, employmentRecord.id) &&
        Objects.equals(this.link, employmentRecord.link) &&
        Objects.equals(this.createdAt, employmentRecord.createdAt) &&
        Objects.equals(this.collectedAt, employmentRecord.collectedAt) &&
        Objects.equals(this.reportDate, employmentRecord.reportDate) &&
        Objects.equals(this.internalIdentification, employmentRecord.internalIdentification) &&
        Objects.equals(this.personalData, employmentRecord.personalData) &&
        Objects.equals(this.socialSecuritySummary, employmentRecord.socialSecuritySummary) &&
        Objects.equals(this.employmentRecords, employmentRecord.employmentRecords) &&
        Objects.equals(this.files, employmentRecord.files)&&
        Objects.equals(this.additionalProperties, employmentRecord.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, link, createdAt, collectedAt, reportDate, internalIdentification, personalData, socialSecuritySummary, employmentRecords, files, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmploymentRecord {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    collectedAt: ").append(toIndentedString(collectedAt)).append("\n");
    sb.append("    reportDate: ").append(toIndentedString(reportDate)).append("\n");
    sb.append("    internalIdentification: ").append(toIndentedString(internalIdentification)).append("\n");
    sb.append("    personalData: ").append(toIndentedString(personalData)).append("\n");
    sb.append("    socialSecuritySummary: ").append(toIndentedString(socialSecuritySummary)).append("\n");
    sb.append("    employmentRecords: ").append(toIndentedString(employmentRecords)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
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
    openapiFields.add("collected_at");
    openapiFields.add("report_date");
    openapiFields.add("internal_identification");
    openapiFields.add("personal_data");
    openapiFields.add("social_security_summary");
    openapiFields.add("employment_records");
    openapiFields.add("files");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmploymentRecord
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EmploymentRecord.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmploymentRecord is not found in the empty JSON string", EmploymentRecord.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("link") != null && !jsonObj.get("link").isJsonNull()) && !jsonObj.get("link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link").toString()));
      }
      if ((jsonObj.get("internal_identification") != null && !jsonObj.get("internal_identification").isJsonNull()) && !jsonObj.get("internal_identification").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `internal_identification` to be a primitive type in the JSON string but got `%s`", jsonObj.get("internal_identification").toString()));
      }
      // validate the optional field `personal_data`
      if (jsonObj.get("personal_data") != null && !jsonObj.get("personal_data").isJsonNull()) {
        EmploymentRecordPersonalData.validateJsonObject(jsonObj.getAsJsonObject("personal_data"));
      }
      // validate the optional field `social_security_summary`
      if (jsonObj.get("social_security_summary") != null && !jsonObj.get("social_security_summary").isJsonNull()) {
        EmploymentRecordSocialSecuritySummary.validateJsonObject(jsonObj.getAsJsonObject("social_security_summary"));
      }
      if (jsonObj.get("employment_records") != null && !jsonObj.get("employment_records").isJsonNull()) {
        JsonArray jsonArrayemploymentRecords = jsonObj.getAsJsonArray("employment_records");
        if (jsonArrayemploymentRecords != null) {
          // ensure the json data is an array
          if (!jsonObj.get("employment_records").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `employment_records` to be an array in the JSON string but got `%s`", jsonObj.get("employment_records").toString()));
          }

          // validate the optional field `employment_records` (array)
          for (int i = 0; i < jsonArrayemploymentRecords.size(); i++) {
            EmploymentRecordDetail.validateJsonObject(jsonArrayemploymentRecords.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("files") != null && !jsonObj.get("files").isJsonNull()) {
        JsonArray jsonArrayfiles = jsonObj.getAsJsonArray("files");
        if (jsonArrayfiles != null) {
          // ensure the json data is an array
          if (!jsonObj.get("files").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `files` to be an array in the JSON string but got `%s`", jsonObj.get("files").toString()));
          }

          // validate the optional field `files` (array)
          for (int i = 0; i < jsonArrayfiles.size(); i++) {
            EmploymentRecordFile.validateJsonObject(jsonArrayfiles.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmploymentRecord.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmploymentRecord' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmploymentRecord> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmploymentRecord.class));

       return (TypeAdapter<T>) new TypeAdapter<EmploymentRecord>() {
           @Override
           public void write(JsonWriter out, EmploymentRecord value) throws IOException {
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
           public EmploymentRecord read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EmploymentRecord instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EmploymentRecord given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmploymentRecord
  * @throws IOException if the JSON string is invalid with respect to EmploymentRecord
  */
  public static EmploymentRecord fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmploymentRecord.class);
  }

 /**
  * Convert an instance of EmploymentRecord to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

