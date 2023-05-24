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
 * Aggregated metrics calculated based on the user&#39;s transactions from checking, savings, credit, and loan accounts.  However, internal transfers (transfers between accounts belonging to the same link) are not used in the calculation. 
 */
@ApiModel(description = "Aggregated metrics calculated based on the user's transactions from checking, savings, credit, and loan accounts.  However, internal transfers (transfers between accounts belonging to the same link) are not used in the calculation. ")
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class RiskInsightsCashflowMetrics {
  public static final String SERIALIZED_NAME_SUM_POSITIVE1W = "sum_positive_1w";
  @SerializedName(SERIALIZED_NAME_SUM_POSITIVE1W)
  private Float sumPositive1w;

  public static final String SERIALIZED_NAME_SUM_POSITIVE1M = "sum_positive_1m";
  @SerializedName(SERIALIZED_NAME_SUM_POSITIVE1M)
  private Float sumPositive1m;

  public static final String SERIALIZED_NAME_SUM_POSITIVE3M = "sum_positive_3m";
  @SerializedName(SERIALIZED_NAME_SUM_POSITIVE3M)
  private Float sumPositive3m;

  public static final String SERIALIZED_NAME_SUM_NEGATIVE1W = "sum_negative_1w";
  @SerializedName(SERIALIZED_NAME_SUM_NEGATIVE1W)
  private Float sumNegative1w;

  public static final String SERIALIZED_NAME_SUM_NEGATIVE1M = "sum_negative_1m";
  @SerializedName(SERIALIZED_NAME_SUM_NEGATIVE1M)
  private Float sumNegative1m;

  public static final String SERIALIZED_NAME_SUM_NEGATIVE3M = "sum_negative_3m";
  @SerializedName(SERIALIZED_NAME_SUM_NEGATIVE3M)
  private Float sumNegative3m;

  public static final String SERIALIZED_NAME_POSITIVE_TO_NEGATIVE_RATIO1W = "positive_to_negative_ratio_1w";
  @SerializedName(SERIALIZED_NAME_POSITIVE_TO_NEGATIVE_RATIO1W)
  private Float positiveToNegativeRatio1w;

  public static final String SERIALIZED_NAME_POSITIVE_TO_NEGATIVE_RATIO1M = "positive_to_negative_ratio_1m";
  @SerializedName(SERIALIZED_NAME_POSITIVE_TO_NEGATIVE_RATIO1M)
  private Float positiveToNegativeRatio1m;

  public static final String SERIALIZED_NAME_POSITIVE_TO_NEGATIVE_RATIO3M = "positive_to_negative_ratio_3m";
  @SerializedName(SERIALIZED_NAME_POSITIVE_TO_NEGATIVE_RATIO3M)
  private Float positiveToNegativeRatio3m;

  public RiskInsightsCashflowMetrics() {
  }

  public RiskInsightsCashflowMetrics sumPositive1w(Float sumPositive1w) {

    
    
    
    
    this.sumPositive1w = sumPositive1w;
    return this;
  }

   /**
   * Sum total of all transactions leading to a positive cashflow in the last week (counted from the time of the request). 
   * @return sumPositive1w
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10022.01", required = true, value = "Sum total of all transactions leading to a positive cashflow in the last week (counted from the time of the request). ")

  public Float getSumPositive1w() {
    return sumPositive1w;
  }


  public void setSumPositive1w(Float sumPositive1w) {

    
    
    
    this.sumPositive1w = sumPositive1w;
  }


  public RiskInsightsCashflowMetrics sumPositive1m(Float sumPositive1m) {

    
    
    
    
    this.sumPositive1m = sumPositive1m;
    return this;
  }

   /**
   * Sum total of all transactions leading to a positive cashflow in the last month (counted from the time of the request). 
   * @return sumPositive1m
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10022.01", required = true, value = "Sum total of all transactions leading to a positive cashflow in the last month (counted from the time of the request). ")

  public Float getSumPositive1m() {
    return sumPositive1m;
  }


  public void setSumPositive1m(Float sumPositive1m) {

    
    
    
    this.sumPositive1m = sumPositive1m;
  }


  public RiskInsightsCashflowMetrics sumPositive3m(Float sumPositive3m) {

    
    
    
    
    this.sumPositive3m = sumPositive3m;
    return this;
  }

   /**
   * Sum total of all transactions leading to a positive cashflow in the last three months (counted from the time of the request). 
   * @return sumPositive3m
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10022.01", required = true, value = "Sum total of all transactions leading to a positive cashflow in the last three months (counted from the time of the request). ")

  public Float getSumPositive3m() {
    return sumPositive3m;
  }


  public void setSumPositive3m(Float sumPositive3m) {

    
    
    
    this.sumPositive3m = sumPositive3m;
  }


  public RiskInsightsCashflowMetrics sumNegative1w(Float sumNegative1w) {

    
    
    
    
    this.sumNegative1w = sumNegative1w;
    return this;
  }

   /**
   * Sum total of all transactions leading to a negative cashflow in the last week (counted from the time of the request). 
   * @return sumNegative1w
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10237.03", required = true, value = "Sum total of all transactions leading to a negative cashflow in the last week (counted from the time of the request). ")

  public Float getSumNegative1w() {
    return sumNegative1w;
  }


  public void setSumNegative1w(Float sumNegative1w) {

    
    
    
    this.sumNegative1w = sumNegative1w;
  }


  public RiskInsightsCashflowMetrics sumNegative1m(Float sumNegative1m) {

    
    
    
    
    this.sumNegative1m = sumNegative1m;
    return this;
  }

   /**
   * Sum total of all transactions leading to a negative cashflow in the last month (counted from the time of the request). 
   * @return sumNegative1m
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10237.03", required = true, value = "Sum total of all transactions leading to a negative cashflow in the last month (counted from the time of the request). ")

  public Float getSumNegative1m() {
    return sumNegative1m;
  }


  public void setSumNegative1m(Float sumNegative1m) {

    
    
    
    this.sumNegative1m = sumNegative1m;
  }


  public RiskInsightsCashflowMetrics sumNegative3m(Float sumNegative3m) {

    
    
    
    
    this.sumNegative3m = sumNegative3m;
    return this;
  }

   /**
   * Sum total of all transactions leading to a negative cashflow in the last three months (counted from the time of the request). 
   * @return sumNegative3m
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10237.03", required = true, value = "Sum total of all transactions leading to a negative cashflow in the last three months (counted from the time of the request). ")

  public Float getSumNegative3m() {
    return sumNegative3m;
  }


  public void setSumNegative3m(Float sumNegative3m) {

    
    
    
    this.sumNegative3m = sumNegative3m;
  }


  public RiskInsightsCashflowMetrics positiveToNegativeRatio1w(Float positiveToNegativeRatio1w) {

    
    
    
    
    this.positiveToNegativeRatio1w = positiveToNegativeRatio1w;
    return this;
  }

   /**
   * The ratio between sum_positive / sum_negative  in the last week (counted from the time of the request).  ℹ️ If the ratio is greater than &#x60;1&#x60;, it means that the user has more income than outgoing, indicating that they spend less than they earn.  **Note**: In the case that there have been no outgoing transactions, the value will be &#x60;null&#x60;. 
   * @return positiveToNegativeRatio1w
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.98", required = true, value = "The ratio between sum_positive / sum_negative  in the last week (counted from the time of the request).  ℹ️ If the ratio is greater than `1`, it means that the user has more income than outgoing, indicating that they spend less than they earn.  **Note**: In the case that there have been no outgoing transactions, the value will be `null`. ")

  public Float getPositiveToNegativeRatio1w() {
    return positiveToNegativeRatio1w;
  }


  public void setPositiveToNegativeRatio1w(Float positiveToNegativeRatio1w) {

    
    
    
    this.positiveToNegativeRatio1w = positiveToNegativeRatio1w;
  }


  public RiskInsightsCashflowMetrics positiveToNegativeRatio1m(Float positiveToNegativeRatio1m) {

    
    
    
    
    this.positiveToNegativeRatio1m = positiveToNegativeRatio1m;
    return this;
  }

   /**
   * The ratio between sum_positive / sum_negative  in the last month (counted from the time of the request).  ℹ️ If the ratio is greater than &#x60;1&#x60;, it means that the user has more income than outgoing, indicating that they spend less than they earn. 
   * @return positiveToNegativeRatio1m
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.98", required = true, value = "The ratio between sum_positive / sum_negative  in the last month (counted from the time of the request).  ℹ️ If the ratio is greater than `1`, it means that the user has more income than outgoing, indicating that they spend less than they earn. ")

  public Float getPositiveToNegativeRatio1m() {
    return positiveToNegativeRatio1m;
  }


  public void setPositiveToNegativeRatio1m(Float positiveToNegativeRatio1m) {

    
    
    
    this.positiveToNegativeRatio1m = positiveToNegativeRatio1m;
  }


  public RiskInsightsCashflowMetrics positiveToNegativeRatio3m(Float positiveToNegativeRatio3m) {

    
    
    
    
    this.positiveToNegativeRatio3m = positiveToNegativeRatio3m;
    return this;
  }

   /**
   * The ratio between sum_positive / sum_negative  in the last three months (counted from the time of the request).  ℹ️ If the ratio is greater than &#x60;1&#x60;, it means that the user has more income than outgoing, indicating that they spend less than they earn. 
   * @return positiveToNegativeRatio3m
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.98", required = true, value = "The ratio between sum_positive / sum_negative  in the last three months (counted from the time of the request).  ℹ️ If the ratio is greater than `1`, it means that the user has more income than outgoing, indicating that they spend less than they earn. ")

  public Float getPositiveToNegativeRatio3m() {
    return positiveToNegativeRatio3m;
  }


  public void setPositiveToNegativeRatio3m(Float positiveToNegativeRatio3m) {

    
    
    
    this.positiveToNegativeRatio3m = positiveToNegativeRatio3m;
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
   * @return the RiskInsightsCashflowMetrics instance itself
   */
  public RiskInsightsCashflowMetrics putAdditionalProperty(String key, Object value) {
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
    RiskInsightsCashflowMetrics riskInsightsCashflowMetrics = (RiskInsightsCashflowMetrics) o;
    return Objects.equals(this.sumPositive1w, riskInsightsCashflowMetrics.sumPositive1w) &&
        Objects.equals(this.sumPositive1m, riskInsightsCashflowMetrics.sumPositive1m) &&
        Objects.equals(this.sumPositive3m, riskInsightsCashflowMetrics.sumPositive3m) &&
        Objects.equals(this.sumNegative1w, riskInsightsCashflowMetrics.sumNegative1w) &&
        Objects.equals(this.sumNegative1m, riskInsightsCashflowMetrics.sumNegative1m) &&
        Objects.equals(this.sumNegative3m, riskInsightsCashflowMetrics.sumNegative3m) &&
        Objects.equals(this.positiveToNegativeRatio1w, riskInsightsCashflowMetrics.positiveToNegativeRatio1w) &&
        Objects.equals(this.positiveToNegativeRatio1m, riskInsightsCashflowMetrics.positiveToNegativeRatio1m) &&
        Objects.equals(this.positiveToNegativeRatio3m, riskInsightsCashflowMetrics.positiveToNegativeRatio3m)&&
        Objects.equals(this.additionalProperties, riskInsightsCashflowMetrics.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sumPositive1w, sumPositive1m, sumPositive3m, sumNegative1w, sumNegative1m, sumNegative3m, positiveToNegativeRatio1w, positiveToNegativeRatio1m, positiveToNegativeRatio3m, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskInsightsCashflowMetrics {\n");
    sb.append("    sumPositive1w: ").append(toIndentedString(sumPositive1w)).append("\n");
    sb.append("    sumPositive1m: ").append(toIndentedString(sumPositive1m)).append("\n");
    sb.append("    sumPositive3m: ").append(toIndentedString(sumPositive3m)).append("\n");
    sb.append("    sumNegative1w: ").append(toIndentedString(sumNegative1w)).append("\n");
    sb.append("    sumNegative1m: ").append(toIndentedString(sumNegative1m)).append("\n");
    sb.append("    sumNegative3m: ").append(toIndentedString(sumNegative3m)).append("\n");
    sb.append("    positiveToNegativeRatio1w: ").append(toIndentedString(positiveToNegativeRatio1w)).append("\n");
    sb.append("    positiveToNegativeRatio1m: ").append(toIndentedString(positiveToNegativeRatio1m)).append("\n");
    sb.append("    positiveToNegativeRatio3m: ").append(toIndentedString(positiveToNegativeRatio3m)).append("\n");
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
    openapiFields.add("sum_positive_1w");
    openapiFields.add("sum_positive_1m");
    openapiFields.add("sum_positive_3m");
    openapiFields.add("sum_negative_1w");
    openapiFields.add("sum_negative_1m");
    openapiFields.add("sum_negative_3m");
    openapiFields.add("positive_to_negative_ratio_1w");
    openapiFields.add("positive_to_negative_ratio_1m");
    openapiFields.add("positive_to_negative_ratio_3m");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("sum_positive_1w");
    openapiRequiredFields.add("sum_positive_1m");
    openapiRequiredFields.add("sum_positive_3m");
    openapiRequiredFields.add("sum_negative_1w");
    openapiRequiredFields.add("sum_negative_1m");
    openapiRequiredFields.add("sum_negative_3m");
    openapiRequiredFields.add("positive_to_negative_ratio_1w");
    openapiRequiredFields.add("positive_to_negative_ratio_1m");
    openapiRequiredFields.add("positive_to_negative_ratio_3m");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RiskInsightsCashflowMetrics
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RiskInsightsCashflowMetrics.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RiskInsightsCashflowMetrics is not found in the empty JSON string", RiskInsightsCashflowMetrics.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RiskInsightsCashflowMetrics.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RiskInsightsCashflowMetrics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RiskInsightsCashflowMetrics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RiskInsightsCashflowMetrics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RiskInsightsCashflowMetrics.class));

       return (TypeAdapter<T>) new TypeAdapter<RiskInsightsCashflowMetrics>() {
           @Override
           public void write(JsonWriter out, RiskInsightsCashflowMetrics value) throws IOException {
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
           public RiskInsightsCashflowMetrics read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RiskInsightsCashflowMetrics instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RiskInsightsCashflowMetrics given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RiskInsightsCashflowMetrics
  * @throws IOException if the JSON string is invalid with respect to RiskInsightsCashflowMetrics
  */
  public static RiskInsightsCashflowMetrics fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RiskInsightsCashflowMetrics.class);
  }

 /**
  * Convert an instance of RiskInsightsCashflowMetrics to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

