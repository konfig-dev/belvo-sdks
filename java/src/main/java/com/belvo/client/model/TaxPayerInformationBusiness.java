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
import com.belvo.client.model.DocumentIdBusiness;
import com.belvo.client.model.ReportingId;
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
 * Object containing information about the tax payer.
 */
@ApiModel(description = "Object containing information about the tax payer.")
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TaxPayerInformationBusiness {
  public static final String SERIALIZED_NAME_FIRST_LAST_NAME = "first_last_name";
  @SerializedName(SERIALIZED_NAME_FIRST_LAST_NAME)
  private String firstLastName;

  public static final String SERIALIZED_NAME_SECOND_LAST_NAME = "second_last_name";
  @SerializedName(SERIALIZED_NAME_SECOND_LAST_NAME)
  private String secondLastName;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_OTHER_NAMES = "other_names";
  @SerializedName(SERIALIZED_NAME_OTHER_NAMES)
  private String otherNames;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "company_name";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName;

  public static final String SERIALIZED_NAME_MAIN_ECONOMIC_ACTIVITY = "main_economic_activity";
  @SerializedName(SERIALIZED_NAME_MAIN_ECONOMIC_ACTIVITY)
  private String mainEconomicActivity;

  public static final String SERIALIZED_NAME_DOCUMENT_ID = "document_id";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_ID)
  private DocumentIdBusiness documentId;

  public static final String SERIALIZED_NAME_REPORTING_ID = "reporting_id";
  @SerializedName(SERIALIZED_NAME_REPORTING_ID)
  private ReportingId reportingId;

  public TaxPayerInformationBusiness() {
  }

  public TaxPayerInformationBusiness firstLastName(String firstLastName) {
    
    
    this.firstLastName = firstLastName;
    return this;
  }

   /**
   * The tax payer&#39;s first last name.
   * @return firstLastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Restrepo", required = true, value = "The tax payer's first last name.")

  public String getFirstLastName() {
    return firstLastName;
  }


  public void setFirstLastName(String firstLastName) {
    
    this.firstLastName = firstLastName;
  }


  public TaxPayerInformationBusiness secondLastName(String secondLastName) {
    
    
    this.secondLastName = secondLastName;
    return this;
  }

   /**
   * The tax payer&#39;s second last name.
   * @return secondLastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Vives", required = true, value = "The tax payer's second last name.")

  public String getSecondLastName() {
    return secondLastName;
  }


  public void setSecondLastName(String secondLastName) {
    
    this.secondLastName = secondLastName;
  }


  public TaxPayerInformationBusiness firstName(String firstName) {
    
    
    this.firstName = firstName;
    return this;
  }

   /**
   * The tax payer&#39;s first name.
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Carlos", required = true, value = "The tax payer's first name.")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    
    this.firstName = firstName;
  }


  public TaxPayerInformationBusiness otherNames(String otherNames) {
    
    
    this.otherNames = otherNames;
    return this;
  }

   /**
   * Additional names of the tax payer.
   * @return otherNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Alberto", required = true, value = "Additional names of the tax payer.")

  public String getOtherNames() {
    return otherNames;
  }


  public void setOtherNames(String otherNames) {
    
    this.otherNames = otherNames;
  }


  public TaxPayerInformationBusiness companyName(String companyName) {
    
    
    this.companyName = companyName;
    return this;
  }

   /**
   * The name of the company, as registered at the institution.
   * @return companyName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Trusty Spanners", required = true, value = "The name of the company, as registered at the institution.")

  public String getCompanyName() {
    return companyName;
  }


  public void setCompanyName(String companyName) {
    
    this.companyName = companyName;
  }


  public TaxPayerInformationBusiness mainEconomicActivity(String mainEconomicActivity) {
    
    
    this.mainEconomicActivity = mainEconomicActivity;
    return this;
  }

   /**
   * The main economic activity the tax payer is involved in.
   * @return mainEconomicActivity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0032", required = true, value = "The main economic activity the tax payer is involved in.")

  public String getMainEconomicActivity() {
    return mainEconomicActivity;
  }


  public void setMainEconomicActivity(String mainEconomicActivity) {
    
    this.mainEconomicActivity = mainEconomicActivity;
  }


  public TaxPayerInformationBusiness documentId(DocumentIdBusiness documentId) {
    
    
    this.documentId = documentId;
    return this;
  }

   /**
   * Get documentId
   * @return documentId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DocumentIdBusiness getDocumentId() {
    return documentId;
  }


  public void setDocumentId(DocumentIdBusiness documentId) {
    
    this.documentId = documentId;
  }


  public TaxPayerInformationBusiness reportingId(ReportingId reportingId) {
    
    
    this.reportingId = reportingId;
    return this;
  }

   /**
   * Get reportingId
   * @return reportingId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ReportingId getReportingId() {
    return reportingId;
  }


  public void setReportingId(ReportingId reportingId) {
    
    this.reportingId = reportingId;
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
   * @return the TaxPayerInformationBusiness instance itself
   */
  public TaxPayerInformationBusiness putAdditionalProperty(String key, Object value) {
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
    TaxPayerInformationBusiness taxPayerInformationBusiness = (TaxPayerInformationBusiness) o;
    return Objects.equals(this.firstLastName, taxPayerInformationBusiness.firstLastName) &&
        Objects.equals(this.secondLastName, taxPayerInformationBusiness.secondLastName) &&
        Objects.equals(this.firstName, taxPayerInformationBusiness.firstName) &&
        Objects.equals(this.otherNames, taxPayerInformationBusiness.otherNames) &&
        Objects.equals(this.companyName, taxPayerInformationBusiness.companyName) &&
        Objects.equals(this.mainEconomicActivity, taxPayerInformationBusiness.mainEconomicActivity) &&
        Objects.equals(this.documentId, taxPayerInformationBusiness.documentId) &&
        Objects.equals(this.reportingId, taxPayerInformationBusiness.reportingId)&&
        Objects.equals(this.additionalProperties, taxPayerInformationBusiness.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstLastName, secondLastName, firstName, otherNames, companyName, mainEconomicActivity, documentId, reportingId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxPayerInformationBusiness {\n");
    sb.append("    firstLastName: ").append(toIndentedString(firstLastName)).append("\n");
    sb.append("    secondLastName: ").append(toIndentedString(secondLastName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    otherNames: ").append(toIndentedString(otherNames)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    mainEconomicActivity: ").append(toIndentedString(mainEconomicActivity)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    reportingId: ").append(toIndentedString(reportingId)).append("\n");
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
    openapiFields.add("first_last_name");
    openapiFields.add("second_last_name");
    openapiFields.add("first_name");
    openapiFields.add("other_names");
    openapiFields.add("company_name");
    openapiFields.add("main_economic_activity");
    openapiFields.add("document_id");
    openapiFields.add("reporting_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("first_last_name");
    openapiRequiredFields.add("second_last_name");
    openapiRequiredFields.add("first_name");
    openapiRequiredFields.add("other_names");
    openapiRequiredFields.add("company_name");
    openapiRequiredFields.add("main_economic_activity");
    openapiRequiredFields.add("document_id");
    openapiRequiredFields.add("reporting_id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TaxPayerInformationBusiness
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TaxPayerInformationBusiness.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaxPayerInformationBusiness is not found in the empty JSON string", TaxPayerInformationBusiness.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TaxPayerInformationBusiness.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("first_last_name").isJsonNull() && !jsonObj.get("first_last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_last_name").toString()));
      }
      if (!jsonObj.get("second_last_name").isJsonNull() && !jsonObj.get("second_last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `second_last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("second_last_name").toString()));
      }
      if (!jsonObj.get("first_name").isJsonNull() && !jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      if (!jsonObj.get("other_names").isJsonNull() && !jsonObj.get("other_names").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `other_names` to be a primitive type in the JSON string but got `%s`", jsonObj.get("other_names").toString()));
      }
      if (!jsonObj.get("company_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `company_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("company_name").toString()));
      }
      if (!jsonObj.get("main_economic_activity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `main_economic_activity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("main_economic_activity").toString()));
      }
      // validate the required field `document_id`
      DocumentIdBusiness.validateJsonObject(jsonObj.getAsJsonObject("document_id"));
      // validate the required field `reporting_id`
      ReportingId.validateJsonObject(jsonObj.getAsJsonObject("reporting_id"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TaxPayerInformationBusiness.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TaxPayerInformationBusiness' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TaxPayerInformationBusiness> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TaxPayerInformationBusiness.class));

       return (TypeAdapter<T>) new TypeAdapter<TaxPayerInformationBusiness>() {
           @Override
           public void write(JsonWriter out, TaxPayerInformationBusiness value) throws IOException {
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
           public TaxPayerInformationBusiness read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TaxPayerInformationBusiness instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TaxPayerInformationBusiness given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TaxPayerInformationBusiness
  * @throws IOException if the JSON string is invalid with respect to TaxPayerInformationBusiness
  */
  public static TaxPayerInformationBusiness fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaxPayerInformationBusiness.class);
  }

 /**
  * Convert an instance of TaxPayerInformationBusiness to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

