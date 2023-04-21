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
import com.belvo.client.model.EmploymentRecordDocumentId;
import com.belvo.client.model.EmploymentRecordEntitlement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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
 * Details regarding the personal information of the individual.
 */
@ApiModel(description = "Details regarding the personal information of the individual.")
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EmploymentRecordPersonalData {
  public static final String SERIALIZED_NAME_OFFICIAL_NAME = "official_name";
  @SerializedName(SERIALIZED_NAME_OFFICIAL_NAME)
  private String officialName;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_BIRTH_DATE = "birth_date";
  @SerializedName(SERIALIZED_NAME_BIRTH_DATE)
  private LocalDate birthDate;

  public static final String SERIALIZED_NAME_ENTITLEMENTS = "entitlements";
  @SerializedName(SERIALIZED_NAME_ENTITLEMENTS)
  private EmploymentRecordEntitlement entitlements;

  public static final String SERIALIZED_NAME_DOCUMENT_IDS = "document_ids";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_IDS)
  private List<EmploymentRecordDocumentId> documentIds = null;

  public EmploymentRecordPersonalData() {
  }

  public EmploymentRecordPersonalData officialName(String officialName) {
    
    
    this.officialName = officialName;
    return this;
  }

   /**
   * The legal name of the individual 
   * @return officialName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Bruce Banner del Torro", value = "The legal name of the individual ")

  public String getOfficialName() {
    return officialName;
  }


  public void setOfficialName(String officialName) {
    
    this.officialName = officialName;
  }


  public EmploymentRecordPersonalData firstName(String firstName) {
    
    
    this.firstName = firstName;
    return this;
  }

   /**
   * The first name of the individual. 
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Bruce", value = "The first name of the individual. ")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    
    this.firstName = firstName;
  }


  public EmploymentRecordPersonalData lastName(String lastName) {
    
    
    this.lastName = lastName;
    return this;
  }

   /**
   * The last name of the individual. 
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Banner del Torro", value = "The last name of the individual. ")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    
    this.lastName = lastName;
  }


  public EmploymentRecordPersonalData email(String email) {
    
    
    this.email = email;
    return this;
  }

   /**
   * The email address of the individual (as provided in the initial POST request). 
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "bruce.banner@avengers.com", value = "The email address of the individual (as provided in the initial POST request). ")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    
    this.email = email;
  }


  public EmploymentRecordPersonalData birthDate(LocalDate birthDate) {
    
    
    this.birthDate = birthDate;
    return this;
  }

   /**
   * The date of the birth of the individual, in &#x60;YYYY-MM-DD&#x60; format. 
   * @return birthDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Tue Feb 08 16:00:00 PST 2022", value = "The date of the birth of the individual, in `YYYY-MM-DD` format. ")

  public LocalDate getBirthDate() {
    return birthDate;
  }


  public void setBirthDate(LocalDate birthDate) {
    
    this.birthDate = birthDate;
  }


  public EmploymentRecordPersonalData entitlements(EmploymentRecordEntitlement entitlements) {
    
    
    this.entitlements = entitlements;
    return this;
  }

   /**
   * Get entitlements
   * @return entitlements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EmploymentRecordEntitlement getEntitlements() {
    return entitlements;
  }


  public void setEntitlements(EmploymentRecordEntitlement entitlements) {
    
    this.entitlements = entitlements;
  }


  public EmploymentRecordPersonalData documentIds(List<EmploymentRecordDocumentId> documentIds) {
    
    
    this.documentIds = documentIds;
    return this;
  }

  public EmploymentRecordPersonalData addDocumentIdsItem(EmploymentRecordDocumentId documentIdsItem) {
    if (this.documentIds == null) {
      this.documentIds = new ArrayList<>();
    }
    this.documentIds.add(documentIdsItem);
    return this;
  }

   /**
   * Details regarding the individual&#39;s ID documents.
   * @return documentIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details regarding the individual's ID documents.")

  public List<EmploymentRecordDocumentId> getDocumentIds() {
    return documentIds;
  }


  public void setDocumentIds(List<EmploymentRecordDocumentId> documentIds) {
    
    this.documentIds = documentIds;
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
   * @return the EmploymentRecordPersonalData instance itself
   */
  public EmploymentRecordPersonalData putAdditionalProperty(String key, Object value) {
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
    EmploymentRecordPersonalData employmentRecordPersonalData = (EmploymentRecordPersonalData) o;
    return Objects.equals(this.officialName, employmentRecordPersonalData.officialName) &&
        Objects.equals(this.firstName, employmentRecordPersonalData.firstName) &&
        Objects.equals(this.lastName, employmentRecordPersonalData.lastName) &&
        Objects.equals(this.email, employmentRecordPersonalData.email) &&
        Objects.equals(this.birthDate, employmentRecordPersonalData.birthDate) &&
        Objects.equals(this.entitlements, employmentRecordPersonalData.entitlements) &&
        Objects.equals(this.documentIds, employmentRecordPersonalData.documentIds)&&
        Objects.equals(this.additionalProperties, employmentRecordPersonalData.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(officialName, firstName, lastName, email, birthDate, entitlements, documentIds, additionalProperties);
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
    sb.append("class EmploymentRecordPersonalData {\n");
    sb.append("    officialName: ").append(toIndentedString(officialName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    entitlements: ").append(toIndentedString(entitlements)).append("\n");
    sb.append("    documentIds: ").append(toIndentedString(documentIds)).append("\n");
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
    openapiFields.add("official_name");
    openapiFields.add("first_name");
    openapiFields.add("last_name");
    openapiFields.add("email");
    openapiFields.add("birth_date");
    openapiFields.add("entitlements");
    openapiFields.add("document_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmploymentRecordPersonalData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EmploymentRecordPersonalData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmploymentRecordPersonalData is not found in the empty JSON string", EmploymentRecordPersonalData.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("official_name").isJsonNull() && (jsonObj.get("official_name") != null && !jsonObj.get("official_name").isJsonNull()) && !jsonObj.get("official_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `official_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("official_name").toString()));
      }
      if (!jsonObj.get("first_name").isJsonNull() && (jsonObj.get("first_name") != null && !jsonObj.get("first_name").isJsonNull()) && !jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      if (!jsonObj.get("last_name").isJsonNull() && (jsonObj.get("last_name") != null && !jsonObj.get("last_name").isJsonNull()) && !jsonObj.get("last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name").toString()));
      }
      if (!jsonObj.get("email").isJsonNull() && (jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      // validate the optional field `entitlements`
      if (jsonObj.get("entitlements") != null && !jsonObj.get("entitlements").isJsonNull()) {
        EmploymentRecordEntitlement.validateJsonObject(jsonObj.getAsJsonObject("entitlements"));
      }
      if (jsonObj.get("document_ids") != null && !jsonObj.get("document_ids").isJsonNull()) {
        JsonArray jsonArraydocumentIds = jsonObj.getAsJsonArray("document_ids");
        if (jsonArraydocumentIds != null) {
          // ensure the json data is an array
          if (!jsonObj.get("document_ids").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `document_ids` to be an array in the JSON string but got `%s`", jsonObj.get("document_ids").toString()));
          }

          // validate the optional field `document_ids` (array)
          for (int i = 0; i < jsonArraydocumentIds.size(); i++) {
            EmploymentRecordDocumentId.validateJsonObject(jsonArraydocumentIds.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmploymentRecordPersonalData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmploymentRecordPersonalData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmploymentRecordPersonalData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmploymentRecordPersonalData.class));

       return (TypeAdapter<T>) new TypeAdapter<EmploymentRecordPersonalData>() {
           @Override
           public void write(JsonWriter out, EmploymentRecordPersonalData value) throws IOException {
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
           public EmploymentRecordPersonalData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EmploymentRecordPersonalData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EmploymentRecordPersonalData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmploymentRecordPersonalData
  * @throws IOException if the JSON string is invalid with respect to EmploymentRecordPersonalData
  */
  public static EmploymentRecordPersonalData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmploymentRecordPersonalData.class);
  }

 /**
  * Convert an instance of EmploymentRecordPersonalData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

