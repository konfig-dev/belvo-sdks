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
 * Details regarding the taxpayer.
 */
@ApiModel(description = "Details regarding the taxpayer.")
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TaxStatusTaxPayerInformationDian {
  public static final String SERIALIZED_NAME_RFC = "rfc";
  @SerializedName(SERIALIZED_NAME_RFC)
  private String rfc;

  public static final String SERIALIZED_NAME_CURP = "curp";
  @SerializedName(SERIALIZED_NAME_CURP)
  private String curp;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_FIRST_LAST_NAME = "first_last_name";
  @SerializedName(SERIALIZED_NAME_FIRST_LAST_NAME)
  private String firstLastName;

  public static final String SERIALIZED_NAME_SECOND_LAST_NAME = "second_last_name";
  @SerializedName(SERIALIZED_NAME_SECOND_LAST_NAME)
  private String secondLastName;

  public static final String SERIALIZED_NAME_START_OPERATIONS_DATE = "start_operations_date";
  @SerializedName(SERIALIZED_NAME_START_OPERATIONS_DATE)
  private LocalDate startOperationsDate;

  public static final String SERIALIZED_NAME_STATUS_PADRON = "status_padron";
  @SerializedName(SERIALIZED_NAME_STATUS_PADRON)
  private String statusPadron;

  public static final String SERIALIZED_NAME_LAST_STATUS_CHANGE_DATE = "last_status_change_date";
  @SerializedName(SERIALIZED_NAME_LAST_STATUS_CHANGE_DATE)
  private LocalDate lastStatusChangeDate;

  public static final String SERIALIZED_NAME_COMMERCIAL_NAME = "commercial_name";
  @SerializedName(SERIALIZED_NAME_COMMERCIAL_NAME)
  private String commercialName;

  public static final String SERIALIZED_NAME_SOCIAL_NAME = "social_name";
  @SerializedName(SERIALIZED_NAME_SOCIAL_NAME)
  private String socialName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public TaxStatusTaxPayerInformationDian() {
  }

  public TaxStatusTaxPayerInformationDian rfc(String rfc) {

    
    
    
    
    this.rfc = rfc;
    return this;
  }

   /**
   * The tax payers&#39;s identification number (NIT). 
   * @return rfc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BEMP12345G58", required = true, value = "The tax payers's identification number (NIT). ")

  public String getRfc() {
    return rfc;
  }


  public void setRfc(String rfc) {

    
    
    
    this.rfc = rfc;
  }


  public TaxStatusTaxPayerInformationDian curp(String curp) {

    
    
    
    
    this.curp = curp;
    return this;
  }

   /**
   * **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;. 
   * @return curp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "**Note**: This field is not applicable for DIAN Colombia and will return `null`. ")

  public String getCurp() {
    return curp;
  }


  public void setCurp(String curp) {

    
    
    
    this.curp = curp;
  }


  public TaxStatusTaxPayerInformationDian name(String name) {

    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The tax payers&#39;s first name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "JOHN", value = "The tax payers's first name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {

    
    
    
    this.name = name;
  }


  public TaxStatusTaxPayerInformationDian firstLastName(String firstLastName) {

    
    
    
    
    this.firstLastName = firstLastName;
    return this;
  }

   /**
   * The tax payers&#39;s first last name.
   * @return firstLastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DOE", value = "The tax payers's first last name.")

  public String getFirstLastName() {
    return firstLastName;
  }


  public void setFirstLastName(String firstLastName) {

    
    
    
    this.firstLastName = firstLastName;
  }


  public TaxStatusTaxPayerInformationDian secondLastName(String secondLastName) {

    
    
    
    
    this.secondLastName = secondLastName;
    return this;
  }

   /**
   * The tax payers&#39;s second last name.
   * @return secondLastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SCHMOE", value = "The tax payers's second last name.")

  public String getSecondLastName() {
    return secondLastName;
  }


  public void setSecondLastName(String secondLastName) {

    
    
    
    this.secondLastName = secondLastName;
  }


  public TaxStatusTaxPayerInformationDian startOperationsDate(LocalDate startOperationsDate) {

    
    
    
    
    this.startOperationsDate = startOperationsDate;
    return this;
  }

   /**
   * **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;. 
   * @return startOperationsDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "**Note**: This field is not applicable for DIAN Colombia and will return `null`. ")

  public LocalDate getStartOperationsDate() {
    return startOperationsDate;
  }


  public void setStartOperationsDate(LocalDate startOperationsDate) {

    
    
    
    this.startOperationsDate = startOperationsDate;
  }


  public TaxStatusTaxPayerInformationDian statusPadron(String statusPadron) {

    
    
    
    
    this.statusPadron = statusPadron;
    return this;
  }

   /**
   * **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.
   * @return statusPadron
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "**Note**: This field is not applicable for DIAN Colombia and will return `null`.")

  public String getStatusPadron() {
    return statusPadron;
  }


  public void setStatusPadron(String statusPadron) {

    
    
    
    this.statusPadron = statusPadron;
  }


  public TaxStatusTaxPayerInformationDian lastStatusChangeDate(LocalDate lastStatusChangeDate) {

    
    
    
    
    this.lastStatusChangeDate = lastStatusChangeDate;
    return this;
  }

   /**
   * **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;. 
   * @return lastStatusChangeDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "**Note**: This field is not applicable for DIAN Colombia and will return `null`. ")

  public LocalDate getLastStatusChangeDate() {
    return lastStatusChangeDate;
  }


  public void setLastStatusChangeDate(LocalDate lastStatusChangeDate) {

    
    
    
    this.lastStatusChangeDate = lastStatusChangeDate;
  }


  public TaxStatusTaxPayerInformationDian commercialName(String commercialName) {

    
    
    
    
    this.commercialName = commercialName;
    return this;
  }

   /**
   * The name of the business designated for consumers and the general public.  **Note**: Only applicable for businesses. 
   * @return commercialName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Jar Jar Transport", value = "The name of the business designated for consumers and the general public.  **Note**: Only applicable for businesses. ")

  public String getCommercialName() {
    return commercialName;
  }


  public void setCommercialName(String commercialName) {

    
    
    
    this.commercialName = commercialName;
  }


  public TaxStatusTaxPayerInformationDian socialName(String socialName) {

    
    
    
    
    this.socialName = socialName;
    return this;
  }

   /**
   * The unique and exclusive name within the national territory that companies receive for legal or administrative purposes. **Note**: Only applicable for businesses.
   * @return socialName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "John Doe SA DE CV", value = "The unique and exclusive name within the national territory that companies receive for legal or administrative purposes. **Note**: Only applicable for businesses.")

  public String getSocialName() {
    return socialName;
  }


  public void setSocialName(String socialName) {

    
    
    
    this.socialName = socialName;
  }


  public TaxStatusTaxPayerInformationDian email(String email) {

    
    
    
    
    this.email = email;
    return this;
  }

   /**
   * Contact email address for the tax payer.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "john_doe@gmail.com", value = "Contact email address for the tax payer.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {

    
    
    
    this.email = email;
  }


  public TaxStatusTaxPayerInformationDian phone(String phone) {

    
    
    
    
    this.phone = phone;
    return this;
  }

   /**
   * Contact phone number for the tax payer.
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234567890", value = "Contact phone number for the tax payer.")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {

    
    
    
    this.phone = phone;
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
   * @return the TaxStatusTaxPayerInformationDian instance itself
   */
  public TaxStatusTaxPayerInformationDian putAdditionalProperty(String key, Object value) {
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
    TaxStatusTaxPayerInformationDian taxStatusTaxPayerInformationDian = (TaxStatusTaxPayerInformationDian) o;
    return Objects.equals(this.rfc, taxStatusTaxPayerInformationDian.rfc) &&
        Objects.equals(this.curp, taxStatusTaxPayerInformationDian.curp) &&
        Objects.equals(this.name, taxStatusTaxPayerInformationDian.name) &&
        Objects.equals(this.firstLastName, taxStatusTaxPayerInformationDian.firstLastName) &&
        Objects.equals(this.secondLastName, taxStatusTaxPayerInformationDian.secondLastName) &&
        Objects.equals(this.startOperationsDate, taxStatusTaxPayerInformationDian.startOperationsDate) &&
        Objects.equals(this.statusPadron, taxStatusTaxPayerInformationDian.statusPadron) &&
        Objects.equals(this.lastStatusChangeDate, taxStatusTaxPayerInformationDian.lastStatusChangeDate) &&
        Objects.equals(this.commercialName, taxStatusTaxPayerInformationDian.commercialName) &&
        Objects.equals(this.socialName, taxStatusTaxPayerInformationDian.socialName) &&
        Objects.equals(this.email, taxStatusTaxPayerInformationDian.email) &&
        Objects.equals(this.phone, taxStatusTaxPayerInformationDian.phone)&&
        Objects.equals(this.additionalProperties, taxStatusTaxPayerInformationDian.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(rfc, curp, name, firstLastName, secondLastName, startOperationsDate, statusPadron, lastStatusChangeDate, commercialName, socialName, email, phone, additionalProperties);
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
    sb.append("class TaxStatusTaxPayerInformationDian {\n");
    sb.append("    rfc: ").append(toIndentedString(rfc)).append("\n");
    sb.append("    curp: ").append(toIndentedString(curp)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    firstLastName: ").append(toIndentedString(firstLastName)).append("\n");
    sb.append("    secondLastName: ").append(toIndentedString(secondLastName)).append("\n");
    sb.append("    startOperationsDate: ").append(toIndentedString(startOperationsDate)).append("\n");
    sb.append("    statusPadron: ").append(toIndentedString(statusPadron)).append("\n");
    sb.append("    lastStatusChangeDate: ").append(toIndentedString(lastStatusChangeDate)).append("\n");
    sb.append("    commercialName: ").append(toIndentedString(commercialName)).append("\n");
    sb.append("    socialName: ").append(toIndentedString(socialName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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
    openapiFields.add("rfc");
    openapiFields.add("curp");
    openapiFields.add("name");
    openapiFields.add("first_last_name");
    openapiFields.add("second_last_name");
    openapiFields.add("start_operations_date");
    openapiFields.add("status_padron");
    openapiFields.add("last_status_change_date");
    openapiFields.add("commercial_name");
    openapiFields.add("social_name");
    openapiFields.add("email");
    openapiFields.add("phone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("rfc");
    openapiRequiredFields.add("start_operations_date");
    openapiRequiredFields.add("status_padron");
    openapiRequiredFields.add("last_status_change_date");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TaxStatusTaxPayerInformationDian
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TaxStatusTaxPayerInformationDian.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaxStatusTaxPayerInformationDian is not found in the empty JSON string", TaxStatusTaxPayerInformationDian.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TaxStatusTaxPayerInformationDian.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("rfc").isJsonNull() && !jsonObj.get("rfc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rfc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rfc").toString()));
      }
      if (!jsonObj.get("curp").isJsonNull() && (jsonObj.get("curp") != null && !jsonObj.get("curp").isJsonNull()) && !jsonObj.get("curp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `curp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("curp").toString()));
      }
      if (!jsonObj.get("name").isJsonNull() && (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("first_last_name").isJsonNull() && (jsonObj.get("first_last_name") != null && !jsonObj.get("first_last_name").isJsonNull()) && !jsonObj.get("first_last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_last_name").toString()));
      }
      if (!jsonObj.get("second_last_name").isJsonNull() && (jsonObj.get("second_last_name") != null && !jsonObj.get("second_last_name").isJsonNull()) && !jsonObj.get("second_last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `second_last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("second_last_name").toString()));
      }
      if (!jsonObj.get("status_padron").isJsonNull() && !jsonObj.get("status_padron").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status_padron` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status_padron").toString()));
      }
      if (!jsonObj.get("commercial_name").isJsonNull() && (jsonObj.get("commercial_name") != null && !jsonObj.get("commercial_name").isJsonNull()) && !jsonObj.get("commercial_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commercial_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commercial_name").toString()));
      }
      if (!jsonObj.get("social_name").isJsonNull() && (jsonObj.get("social_name") != null && !jsonObj.get("social_name").isJsonNull()) && !jsonObj.get("social_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `social_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("social_name").toString()));
      }
      if (!jsonObj.get("email").isJsonNull() && (jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (!jsonObj.get("phone").isJsonNull() && (jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TaxStatusTaxPayerInformationDian.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TaxStatusTaxPayerInformationDian' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TaxStatusTaxPayerInformationDian> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TaxStatusTaxPayerInformationDian.class));

       return (TypeAdapter<T>) new TypeAdapter<TaxStatusTaxPayerInformationDian>() {
           @Override
           public void write(JsonWriter out, TaxStatusTaxPayerInformationDian value) throws IOException {
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
           public TaxStatusTaxPayerInformationDian read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TaxStatusTaxPayerInformationDian instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TaxStatusTaxPayerInformationDian given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TaxStatusTaxPayerInformationDian
  * @throws IOException if the JSON string is invalid with respect to TaxStatusTaxPayerInformationDian
  */
  public static TaxStatusTaxPayerInformationDian fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaxStatusTaxPayerInformationDian.class);
  }

 /**
  * Convert an instance of TaxStatusTaxPayerInformationDian to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

