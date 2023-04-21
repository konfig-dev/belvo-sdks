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
import com.belvo.client.model.EnumEmploymentRecordStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
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
 * Details regarding the benefits the individual is entitled to.
 */
@ApiModel(description = "Details regarding the benefits the individual is entitled to.")
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EmploymentRecordEntitlement {
  public static final String SERIALIZED_NAME_ENTITLED_TO_HEALTH_INSURANCE = "entitled_to_health_insurance";
  @SerializedName(SERIALIZED_NAME_ENTITLED_TO_HEALTH_INSURANCE)
  private Boolean entitledToHealthInsurance;

  public static final String SERIALIZED_NAME_ENTITLED_TO_COMPANY_BENEFITS = "entitled_to_company_benefits";
  @SerializedName(SERIALIZED_NAME_ENTITLED_TO_COMPANY_BENEFITS)
  private Boolean entitledToCompanyBenefits;

  public static final String SERIALIZED_NAME_VALID_UNTIL = "valid_until";
  @SerializedName(SERIALIZED_NAME_VALID_UNTIL)
  private LocalDate validUntil;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private EnumEmploymentRecordStatus status;

  public EmploymentRecordEntitlement() {
  }

  public EmploymentRecordEntitlement entitledToHealthInsurance(Boolean entitledToHealthInsurance) {
    
    
    this.entitledToHealthInsurance = entitledToHealthInsurance;
    return this;
  }

   /**
   * Indicated whether or not the individual is entitled to health insurance. 
   * @return entitledToHealthInsurance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicated whether or not the individual is entitled to health insurance. ")

  public Boolean getEntitledToHealthInsurance() {
    return entitledToHealthInsurance;
  }


  public void setEntitledToHealthInsurance(Boolean entitledToHealthInsurance) {
    
    this.entitledToHealthInsurance = entitledToHealthInsurance;
  }


  public EmploymentRecordEntitlement entitledToCompanyBenefits(Boolean entitledToCompanyBenefits) {
    
    
    this.entitledToCompanyBenefits = entitledToCompanyBenefits;
    return this;
  }

   /**
   * Indicates whether or not the individual is entitled to company benefits. 
   * @return entitledToCompanyBenefits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates whether or not the individual is entitled to company benefits. ")

  public Boolean getEntitledToCompanyBenefits() {
    return entitledToCompanyBenefits;
  }


  public void setEntitledToCompanyBenefits(Boolean entitledToCompanyBenefits) {
    
    this.entitledToCompanyBenefits = entitledToCompanyBenefits;
  }


  public EmploymentRecordEntitlement validUntil(LocalDate validUntil) {
    
    
    this.validUntil = validUntil;
    return this;
  }

   /**
   * Date until when the individual is covered by health insurance and/or company benefits. If &#x60;null&#x60; the employee is currently working and no end date is required. 
   * @return validUntil
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date until when the individual is covered by health insurance and/or company benefits. If `null` the employee is currently working and no end date is required. ")

  public LocalDate getValidUntil() {
    return validUntil;
  }


  public void setValidUntil(LocalDate validUntil) {
    
    this.validUntil = validUntil;
  }


  public EmploymentRecordEntitlement status(EnumEmploymentRecordStatus status) {
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumEmploymentRecordStatus getStatus() {
    return status;
  }


  public void setStatus(EnumEmploymentRecordStatus status) {
    
    this.status = status;
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
   * @return the EmploymentRecordEntitlement instance itself
   */
  public EmploymentRecordEntitlement putAdditionalProperty(String key, Object value) {
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
    EmploymentRecordEntitlement employmentRecordEntitlement = (EmploymentRecordEntitlement) o;
    return Objects.equals(this.entitledToHealthInsurance, employmentRecordEntitlement.entitledToHealthInsurance) &&
        Objects.equals(this.entitledToCompanyBenefits, employmentRecordEntitlement.entitledToCompanyBenefits) &&
        Objects.equals(this.validUntil, employmentRecordEntitlement.validUntil) &&
        Objects.equals(this.status, employmentRecordEntitlement.status)&&
        Objects.equals(this.additionalProperties, employmentRecordEntitlement.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entitledToHealthInsurance, entitledToCompanyBenefits, validUntil, status, additionalProperties);
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
    sb.append("class EmploymentRecordEntitlement {\n");
    sb.append("    entitledToHealthInsurance: ").append(toIndentedString(entitledToHealthInsurance)).append("\n");
    sb.append("    entitledToCompanyBenefits: ").append(toIndentedString(entitledToCompanyBenefits)).append("\n");
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("entitled_to_health_insurance");
    openapiFields.add("entitled_to_company_benefits");
    openapiFields.add("valid_until");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmploymentRecordEntitlement
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EmploymentRecordEntitlement.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmploymentRecordEntitlement is not found in the empty JSON string", EmploymentRecordEntitlement.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmploymentRecordEntitlement.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmploymentRecordEntitlement' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmploymentRecordEntitlement> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmploymentRecordEntitlement.class));

       return (TypeAdapter<T>) new TypeAdapter<EmploymentRecordEntitlement>() {
           @Override
           public void write(JsonWriter out, EmploymentRecordEntitlement value) throws IOException {
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
           public EmploymentRecordEntitlement read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EmploymentRecordEntitlement instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EmploymentRecordEntitlement given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmploymentRecordEntitlement
  * @throws IOException if the JSON string is invalid with respect to EmploymentRecordEntitlement
  */
  public static EmploymentRecordEntitlement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmploymentRecordEntitlement.class);
  }

 /**
  * Convert an instance of EmploymentRecordEntitlement to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

