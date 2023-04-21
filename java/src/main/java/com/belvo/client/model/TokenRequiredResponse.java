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
import com.belvo.client.model.TokenRequiredResponseTokenGenerationData;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * MFA Token Required
 */
@ApiModel(description = "MFA Token Required")
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TokenRequiredResponse {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_SESSION = "session";
  @SerializedName(SERIALIZED_NAME_SESSION)
  private String session;

  public static final String SERIALIZED_NAME_EXPIRY = "expiry";
  @SerializedName(SERIALIZED_NAME_EXPIRY)
  private Integer expiry;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private UUID link;

  public static final String SERIALIZED_NAME_TOKEN_GENERATION_DATA = "token_generation_data";
  @SerializedName(SERIALIZED_NAME_TOKEN_GENERATION_DATA)
  private TokenRequiredResponseTokenGenerationData tokenGenerationData;

  public TokenRequiredResponse() {
  }

  public TokenRequiredResponse code(String code) {
    
    
    this.code = code;
    return this;
  }

   /**
   * A unique error code (&#x60;token_required&#x60;) that allows you to classify and handle the error programmatically.  ℹ️ Check our DevPortal for more information on how to handle &lt;a href&#x3D;\&quot;https://developers.belvo.com/docs/belvo-api-errors#428-token_required\&quot; target&#x3D;\&quot;_blank\&quot;&gt;428 token_required errors&lt;/a&gt;.
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "token_required", value = "A unique error code (`token_required`) that allows you to classify and handle the error programmatically.  ℹ️ Check our DevPortal for more information on how to handle <a href=\"https://developers.belvo.com/docs/belvo-api-errors#428-token_required\" target=\"_blank\">428 token_required errors</a>.")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    
    this.code = code;
  }


  public TokenRequiredResponse message(String message) {
    
    
    this.message = message;
    return this;
  }

   /**
   * A short description of the error.   For &#x60;token_required&#x60; errors, the description is:      - &#x60;A MFA token is required by the institution to login&#x60;.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A MFA token is required by the institution to login", value = "A short description of the error.   For `token_required` errors, the description is:      - `A MFA token is required by the institution to login`.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    
    this.message = message;
  }


  public TokenRequiredResponse requestId(String requestId) {
    
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A 32-character unique ID of the request (matching a regex pattern of: &#x60;[a-f0-9]{32}&#x60;). Provide this ID when contacting the Belvo support team to accelerate investigations.
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8c7b283c6efa449c9c028a16b5c249fa", value = "A 32-character unique ID of the request (matching a regex pattern of: `[a-f0-9]{32}`). Provide this ID when contacting the Belvo support team to accelerate investigations.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    
    this.requestId = requestId;
  }


  public TokenRequiredResponse session(String session) {
    
    
    this.session = session;
    return this;
  }

   /**
   * A 32-character unique ID of the login session (matching a regex pattern of: &#x60;[a-f0-9]{32}&#x60;).
   * @return session
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2675b703b9d4451f8d4861a3eee54449", value = "A 32-character unique ID of the login session (matching a regex pattern of: `[a-f0-9]{32}`).")

  public String getSession() {
    return session;
  }


  public void setSession(String session) {
    
    this.session = session;
  }


  public TokenRequiredResponse expiry(Integer expiry) {
    
    
    this.expiry = expiry;
    return this;
  }

   /**
   * Session duration time in seconds.
   * @return expiry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9600", value = "Session duration time in seconds.")

  public Integer getExpiry() {
    return expiry;
  }


  public void setExpiry(Integer expiry) {
    
    this.expiry = expiry;
  }


  public TokenRequiredResponse link(UUID link) {
    
    
    this.link = link;
    return this;
  }

   /**
   * Unique identifier created by Belvo, used to reference the current Link.
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30cb4806-6e00-48a4-91c9-ca55968576c8", value = "Unique identifier created by Belvo, used to reference the current Link.")

  public UUID getLink() {
    return link;
  }


  public void setLink(UUID link) {
    
    this.link = link;
  }


  public TokenRequiredResponse tokenGenerationData(TokenRequiredResponseTokenGenerationData tokenGenerationData) {
    
    
    this.tokenGenerationData = tokenGenerationData;
    return this;
  }

   /**
   * Get tokenGenerationData
   * @return tokenGenerationData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TokenRequiredResponseTokenGenerationData getTokenGenerationData() {
    return tokenGenerationData;
  }


  public void setTokenGenerationData(TokenRequiredResponseTokenGenerationData tokenGenerationData) {
    
    this.tokenGenerationData = tokenGenerationData;
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
   * @return the TokenRequiredResponse instance itself
   */
  public TokenRequiredResponse putAdditionalProperty(String key, Object value) {
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
    TokenRequiredResponse tokenRequiredResponse = (TokenRequiredResponse) o;
    return Objects.equals(this.code, tokenRequiredResponse.code) &&
        Objects.equals(this.message, tokenRequiredResponse.message) &&
        Objects.equals(this.requestId, tokenRequiredResponse.requestId) &&
        Objects.equals(this.session, tokenRequiredResponse.session) &&
        Objects.equals(this.expiry, tokenRequiredResponse.expiry) &&
        Objects.equals(this.link, tokenRequiredResponse.link) &&
        Objects.equals(this.tokenGenerationData, tokenRequiredResponse.tokenGenerationData)&&
        Objects.equals(this.additionalProperties, tokenRequiredResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, requestId, session, expiry, link, tokenGenerationData, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenRequiredResponse {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    tokenGenerationData: ").append(toIndentedString(tokenGenerationData)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("message");
    openapiFields.add("request_id");
    openapiFields.add("session");
    openapiFields.add("expiry");
    openapiFields.add("link");
    openapiFields.add("token_generation_data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TokenRequiredResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TokenRequiredResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TokenRequiredResponse is not found in the empty JSON string", TokenRequiredResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("request_id") != null && !jsonObj.get("request_id").isJsonNull()) && !jsonObj.get("request_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `request_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("request_id").toString()));
      }
      if ((jsonObj.get("session") != null && !jsonObj.get("session").isJsonNull()) && !jsonObj.get("session").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `session` to be a primitive type in the JSON string but got `%s`", jsonObj.get("session").toString()));
      }
      if ((jsonObj.get("link") != null && !jsonObj.get("link").isJsonNull()) && !jsonObj.get("link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link").toString()));
      }
      // validate the optional field `token_generation_data`
      if (jsonObj.get("token_generation_data") != null && !jsonObj.get("token_generation_data").isJsonNull()) {
        TokenRequiredResponseTokenGenerationData.validateJsonObject(jsonObj.getAsJsonObject("token_generation_data"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TokenRequiredResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TokenRequiredResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TokenRequiredResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TokenRequiredResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<TokenRequiredResponse>() {
           @Override
           public void write(JsonWriter out, TokenRequiredResponse value) throws IOException {
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
           public TokenRequiredResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TokenRequiredResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TokenRequiredResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TokenRequiredResponse
  * @throws IOException if the JSON string is invalid with respect to TokenRequiredResponse
  */
  public static TokenRequiredResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TokenRequiredResponse.class);
  }

 /**
  * Convert an instance of TokenRequiredResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

