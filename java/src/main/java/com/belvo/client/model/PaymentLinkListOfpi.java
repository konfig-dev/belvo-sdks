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
import com.belvo.client.model.EnumPaymentLinksStatus;
import com.belvo.client.model.PaymentLinkCallbackUrlsResponse;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.UUID;
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
 * PaymentLinkListOfpi
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PaymentLinkListOfpi {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_CREATED_BY = "created_by";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private UUID createdBy;

  public static final String SERIALIZED_NAME_PAYMENT_URL = "payment_url";
  @SerializedName(SERIALIZED_NAME_PAYMENT_URL)
  private String paymentUrl;

  public static final String SERIALIZED_NAME_ACCESS_TOKEN = "access_token";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
  private String accessToken;

  public static final String SERIALIZED_NAME_CALLBACK_URLS = "callback_urls";
  @SerializedName(SERIALIZED_NAME_CALLBACK_URLS)
  private PaymentLinkCallbackUrlsResponse callbackUrls;

  public static final String SERIALIZED_NAME_PAYMENT_INTENT = "payment_intent";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INTENT)
  private UUID paymentIntent;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private EnumPaymentLinksStatus status;

  public static final String SERIALIZED_NAME_EXPIRES_IN = "expires_in";
  @SerializedName(SERIALIZED_NAME_EXPIRES_IN)
  private String expiresIn;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private OffsetDateTime expiresAt;

  public PaymentLinkListOfpi() {
  }

  public PaymentLinkListOfpi id(UUID id) {
    
    
    this.id = id;
    return this;
  }

   /**
   * Belvo&#39;s unique ID for the current payment link.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1c83ead8-6665-429c-a17a-ddc76cb3a95e", required = true, value = "Belvo's unique ID for the current payment link.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    
    this.id = id;
  }


  public PaymentLinkListOfpi createdAt(OffsetDateTime createdAt) {
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp of when the data point was last updated in Belvo&#39;s database.
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2022-02-09T08:45:50.406032Z", required = true, value = "The ISO-8601 timestamp of when the data point was last updated in Belvo's database.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
  }


  public PaymentLinkListOfpi createdBy(UUID createdBy) {
    
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Belvo&#39;s unique ID for the user that created the payment link.
   * @return createdBy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "62053a72-e2d5-4c95-a578-6b16616900ac", required = true, value = "Belvo's unique ID for the user that created the payment link.")

  public UUID getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(UUID createdBy) {
    
    this.createdBy = createdBy;
  }


  public PaymentLinkListOfpi paymentUrl(String paymentUrl) {
    
    
    this.paymentUrl = paymentUrl;
    return this;
  }

   /**
   * The URL for the hosted-widget that will guide your user through the payments process.
   * @return paymentUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://pay.belvo.io/YggaKvPbM5aJhksu1BEwDI5FKTcUc5wZqNB-wH7MFGU", required = true, value = "The URL for the hosted-widget that will guide your user through the payments process.")

  public String getPaymentUrl() {
    return paymentUrl;
  }


  public void setPaymentUrl(String paymentUrl) {
    
    this.paymentUrl = paymentUrl;
  }


  public PaymentLinkListOfpi accessToken(String accessToken) {
    
    
    this.accessToken = accessToken;
    return this;
  }

   /**
   * The Belvo-generated access token for the payment link.  **Note:** You&#39;ll need the &#x60;access_token&#x60; to make [Get details for a payment link](https://developers.belvo.com/reference/detailcreatepaymentlink) requests.
   * @return accessToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "YggaKvPbM5aJhksu1BEwDI5FKTcUc5wZqNB-wH7MFGU", value = "The Belvo-generated access token for the payment link.  **Note:** You'll need the `access_token` to make [Get details for a payment link](https://developers.belvo.com/reference/detailcreatepaymentlink) requests.")

  public String getAccessToken() {
    return accessToken;
  }


  public void setAccessToken(String accessToken) {
    
    this.accessToken = accessToken;
  }


  public PaymentLinkListOfpi callbackUrls(PaymentLinkCallbackUrlsResponse callbackUrls) {
    
    
    this.callbackUrls = callbackUrls;
    return this;
  }

   /**
   * Get callbackUrls
   * @return callbackUrls
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PaymentLinkCallbackUrlsResponse getCallbackUrls() {
    return callbackUrls;
  }


  public void setCallbackUrls(PaymentLinkCallbackUrlsResponse callbackUrls) {
    
    this.callbackUrls = callbackUrls;
  }


  public PaymentLinkListOfpi paymentIntent(UUID paymentIntent) {
    
    
    this.paymentIntent = paymentIntent;
    return this;
  }

   /**
   * Belvo&#39;s unique ID for the payment intent. You can retrieve the complete payment intent by using our [Get details of a payment link](https://developers.belvo.com/reference/detailcreatepaymentlink) request.
   * @return paymentIntent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "b7dd85b1-671e-45c7-aba6-b4b37a8fc0c2", value = "Belvo's unique ID for the payment intent. You can retrieve the complete payment intent by using our [Get details of a payment link](https://developers.belvo.com/reference/detailcreatepaymentlink) request.")

  public UUID getPaymentIntent() {
    return paymentIntent;
  }


  public void setPaymentIntent(UUID paymentIntent) {
    
    this.paymentIntent = paymentIntent;
  }


  public PaymentLinkListOfpi updatedAt(OffsetDateTime updatedAt) {
    
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp of when the payment link was last updated. 
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-02-09T08:45:50.406032Z", value = "The ISO-8601 timestamp of when the payment link was last updated. ")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
  }


  public PaymentLinkListOfpi status(EnumPaymentLinksStatus status) {
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EnumPaymentLinksStatus getStatus() {
    return status;
  }


  public void setStatus(EnumPaymentLinksStatus status) {
    
    this.status = status;
  }


  public PaymentLinkListOfpi expiresIn(String expiresIn) {
    
    
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * The payment link expiration time.  
   * @return expiresIn
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "7d", required = true, value = "The payment link expiration time.  ")

  public String getExpiresIn() {
    return expiresIn;
  }


  public void setExpiresIn(String expiresIn) {
    
    this.expiresIn = expiresIn;
  }


  public PaymentLinkListOfpi expiresAt(OffsetDateTime expiresAt) {
    
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp of when the payment link is set to expire. 
   * @return expiresAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2023-02-09T08:45:50.406032Z", required = true, value = "The ISO-8601 timestamp of when the payment link is set to expire. ")

  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }


  public void setExpiresAt(OffsetDateTime expiresAt) {
    
    this.expiresAt = expiresAt;
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
   * @return the PaymentLinkListOfpi instance itself
   */
  public PaymentLinkListOfpi putAdditionalProperty(String key, Object value) {
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
    PaymentLinkListOfpi paymentLinkListOfpi = (PaymentLinkListOfpi) o;
    return Objects.equals(this.id, paymentLinkListOfpi.id) &&
        Objects.equals(this.createdAt, paymentLinkListOfpi.createdAt) &&
        Objects.equals(this.createdBy, paymentLinkListOfpi.createdBy) &&
        Objects.equals(this.paymentUrl, paymentLinkListOfpi.paymentUrl) &&
        Objects.equals(this.accessToken, paymentLinkListOfpi.accessToken) &&
        Objects.equals(this.callbackUrls, paymentLinkListOfpi.callbackUrls) &&
        Objects.equals(this.paymentIntent, paymentLinkListOfpi.paymentIntent) &&
        Objects.equals(this.updatedAt, paymentLinkListOfpi.updatedAt) &&
        Objects.equals(this.status, paymentLinkListOfpi.status) &&
        Objects.equals(this.expiresIn, paymentLinkListOfpi.expiresIn) &&
        Objects.equals(this.expiresAt, paymentLinkListOfpi.expiresAt)&&
        Objects.equals(this.additionalProperties, paymentLinkListOfpi.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, createdBy, paymentUrl, accessToken, callbackUrls, paymentIntent, updatedAt, status, expiresIn, expiresAt, additionalProperties);
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
    sb.append("class PaymentLinkListOfpi {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    paymentUrl: ").append(toIndentedString(paymentUrl)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    callbackUrls: ").append(toIndentedString(callbackUrls)).append("\n");
    sb.append("    paymentIntent: ").append(toIndentedString(paymentIntent)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
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
    openapiFields.add("created_at");
    openapiFields.add("created_by");
    openapiFields.add("payment_url");
    openapiFields.add("access_token");
    openapiFields.add("callback_urls");
    openapiFields.add("payment_intent");
    openapiFields.add("updated_at");
    openapiFields.add("status");
    openapiFields.add("expires_in");
    openapiFields.add("expires_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("created_by");
    openapiRequiredFields.add("payment_url");
    openapiRequiredFields.add("callback_urls");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("expires_in");
    openapiRequiredFields.add("expires_at");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentLinkListOfpi
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PaymentLinkListOfpi.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentLinkListOfpi is not found in the empty JSON string", PaymentLinkListOfpi.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PaymentLinkListOfpi.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("created_by").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_by` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_by").toString()));
      }
      if (!jsonObj.get("payment_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_url").toString()));
      }
      if ((jsonObj.get("access_token") != null && !jsonObj.get("access_token").isJsonNull()) && !jsonObj.get("access_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_token").toString()));
      }
      // validate the required field `callback_urls`
      PaymentLinkCallbackUrlsResponse.validateJsonObject(jsonObj.getAsJsonObject("callback_urls"));
      if ((jsonObj.get("payment_intent") != null && !jsonObj.get("payment_intent").isJsonNull()) && !jsonObj.get("payment_intent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_intent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_intent").toString()));
      }
      if (!jsonObj.get("expires_in").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expires_in` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expires_in").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentLinkListOfpi.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentLinkListOfpi' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentLinkListOfpi> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentLinkListOfpi.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentLinkListOfpi>() {
           @Override
           public void write(JsonWriter out, PaymentLinkListOfpi value) throws IOException {
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
           public PaymentLinkListOfpi read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PaymentLinkListOfpi instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PaymentLinkListOfpi given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentLinkListOfpi
  * @throws IOException if the JSON string is invalid with respect to PaymentLinkListOfpi
  */
  public static PaymentLinkListOfpi fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentLinkListOfpi.class);
  }

 /**
  * Convert an instance of PaymentLinkListOfpi to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

