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
import com.belvo.client.model.EnumPaymentsCountry;
import com.belvo.client.model.InstitutionFormField;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * PaymentInstitution
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PaymentInstitution {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_WEBSITE = "website";
  @SerializedName(SERIALIZED_NAME_WEBSITE)
  private String website;

  public static final String SERIALIZED_NAME_LOGO = "logo";
  @SerializedName(SERIALIZED_NAME_LOGO)
  private String logo;

  public static final String SERIALIZED_NAME_ICON_LOGO = "icon_logo";
  @SerializedName(SERIALIZED_NAME_ICON_LOGO)
  private String iconLogo;

  public static final String SERIALIZED_NAME_TEXT_LOGO = "text_logo";
  @SerializedName(SERIALIZED_NAME_TEXT_LOGO)
  private String textLogo;

  public static final String SERIALIZED_NAME_PRIMARY_COLOR = "primary_color";
  @SerializedName(SERIALIZED_NAME_PRIMARY_COLOR)
  private String primaryColor;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private EnumPaymentsCountry country;

  public static final String SERIALIZED_NAME_FORM_FIELDS = "form_fields";
  @SerializedName(SERIALIZED_NAME_FORM_FIELDS)
  private List<InstitutionFormField> formFields = null;

  public PaymentInstitution() {
  }

  public PaymentInstitution id(UUID id) {

    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Belvo&#39;s unique ID to reference the institution.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "bbaceead-7b96-46d8-9354-38dec9707004", value = "Belvo's unique ID to reference the institution.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {

    
    
    
    this.id = id;
  }


  public PaymentInstitution active(Boolean active) {

    
    
    
    
    this.active = active;
    return this;
  }

   /**
   * Indicates whether this institution is available for use or not.
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates whether this institution is available for use or not.")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {

    
    
    
    this.active = active;
  }


  public PaymentInstitution name(String name) {

    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of the institution, as designated by Belvo.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "wakanda_national", value = "The name of the institution, as designated by Belvo.")

  public String getName() {
    return name;
  }


  public void setName(String name) {

    
    
    
    this.name = name;
  }


  public PaymentInstitution displayName(String displayName) {

    
    
    
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The customer-facing name of the institution.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Wakanda National Bank", value = "The customer-facing name of the institution.")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {

    
    
    
    this.displayName = displayName;
  }


  public PaymentInstitution website(String website) {

    
    
    
    
    this.website = website;
    return this;
  }

   /**
   * The URL of the institution&#39;s website.
   * @return website
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://www.wakandanational.com", value = "The URL of the institution's website.")

  public String getWebsite() {
    return website;
  }


  public void setWebsite(String website) {

    
    
    
    this.website = website;
  }


  public PaymentInstitution logo(String logo) {

    
    
    
    
    this.logo = logo;
    return this;
  }

   /**
   * The URL of the institution&#39;s logo.
   * @return logo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://belvo-api-media.s3.amazonaws.com/logos/wakandanational_logo.png", value = "The URL of the institution's logo.")

  public String getLogo() {
    return logo;
  }


  public void setLogo(String logo) {

    
    
    
    this.logo = logo;
  }


  public PaymentInstitution iconLogo(String iconLogo) {

    
    
    
    
    this.iconLogo = iconLogo;
    return this;
  }

   /**
   * The URL of the institution&#39;s icon logo.
   * @return iconLogo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://belvo-api-media.s3.amazonaws.com/logos/wakandanational_icon_logo.png", value = "The URL of the institution's icon logo.")

  public String getIconLogo() {
    return iconLogo;
  }


  public void setIconLogo(String iconLogo) {

    
    
    
    this.iconLogo = iconLogo;
  }


  public PaymentInstitution textLogo(String textLogo) {

    
    
    
    
    this.textLogo = textLogo;
    return this;
  }

   /**
   * The URL of the institution&#39;s text logo.
   * @return textLogo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://belvo-api-media.s3.amazonaws.com/logos/wakandanational_text_logo.png", value = "The URL of the institution's text logo.")

  public String getTextLogo() {
    return textLogo;
  }


  public void setTextLogo(String textLogo) {

    
    
    
    this.textLogo = textLogo;
  }


  public PaymentInstitution primaryColor(String primaryColor) {

    
    
    
    
    this.primaryColor = primaryColor;
    return this;
  }

   /**
   * The primary color on the institution&#39;s website.
   * @return primaryColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "#fdbc24", value = "The primary color on the institution's website.")

  public String getPrimaryColor() {
    return primaryColor;
  }


  public void setPrimaryColor(String primaryColor) {

    
    
    
    this.primaryColor = primaryColor;
  }


  public PaymentInstitution country(EnumPaymentsCountry country) {

    
    
    
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumPaymentsCountry getCountry() {
    return country;
  }


  public void setCountry(EnumPaymentsCountry country) {

    
    
    
    this.country = country;
  }


  public PaymentInstitution formFields(List<InstitutionFormField> formFields) {

    
    
    
    
    this.formFields = formFields;
    return this;
  }

  public PaymentInstitution addFormFieldsItem(InstitutionFormField formFieldsItem) {
    if (this.formFields == null) {
      this.formFields = new ArrayList<>();
    }
    this.formFields.add(formFieldsItem);
    return this;
  }

   /**
   * Get formFields
   * @return formFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<InstitutionFormField> getFormFields() {
    return formFields;
  }


  public void setFormFields(List<InstitutionFormField> formFields) {

    
    
    
    this.formFields = formFields;
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
   * @return the PaymentInstitution instance itself
   */
  public PaymentInstitution putAdditionalProperty(String key, Object value) {
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
    PaymentInstitution paymentInstitution = (PaymentInstitution) o;
    return Objects.equals(this.id, paymentInstitution.id) &&
        Objects.equals(this.active, paymentInstitution.active) &&
        Objects.equals(this.name, paymentInstitution.name) &&
        Objects.equals(this.displayName, paymentInstitution.displayName) &&
        Objects.equals(this.website, paymentInstitution.website) &&
        Objects.equals(this.logo, paymentInstitution.logo) &&
        Objects.equals(this.iconLogo, paymentInstitution.iconLogo) &&
        Objects.equals(this.textLogo, paymentInstitution.textLogo) &&
        Objects.equals(this.primaryColor, paymentInstitution.primaryColor) &&
        Objects.equals(this.country, paymentInstitution.country) &&
        Objects.equals(this.formFields, paymentInstitution.formFields)&&
        Objects.equals(this.additionalProperties, paymentInstitution.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, name, displayName, website, logo, iconLogo, textLogo, primaryColor, country, formFields, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInstitution {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    iconLogo: ").append(toIndentedString(iconLogo)).append("\n");
    sb.append("    textLogo: ").append(toIndentedString(textLogo)).append("\n");
    sb.append("    primaryColor: ").append(toIndentedString(primaryColor)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    formFields: ").append(toIndentedString(formFields)).append("\n");
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
    openapiFields.add("active");
    openapiFields.add("name");
    openapiFields.add("display_name");
    openapiFields.add("website");
    openapiFields.add("logo");
    openapiFields.add("icon_logo");
    openapiFields.add("text_logo");
    openapiFields.add("primary_color");
    openapiFields.add("country");
    openapiFields.add("form_fields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentInstitution
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PaymentInstitution.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentInstitution is not found in the empty JSON string", PaymentInstitution.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("display_name") != null && !jsonObj.get("display_name").isJsonNull()) && !jsonObj.get("display_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display_name").toString()));
      }
      if ((jsonObj.get("website") != null && !jsonObj.get("website").isJsonNull()) && !jsonObj.get("website").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `website` to be a primitive type in the JSON string but got `%s`", jsonObj.get("website").toString()));
      }
      if ((jsonObj.get("logo") != null && !jsonObj.get("logo").isJsonNull()) && !jsonObj.get("logo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo").toString()));
      }
      if ((jsonObj.get("icon_logo") != null && !jsonObj.get("icon_logo").isJsonNull()) && !jsonObj.get("icon_logo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `icon_logo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("icon_logo").toString()));
      }
      if ((jsonObj.get("text_logo") != null && !jsonObj.get("text_logo").isJsonNull()) && !jsonObj.get("text_logo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text_logo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text_logo").toString()));
      }
      if ((jsonObj.get("primary_color") != null && !jsonObj.get("primary_color").isJsonNull()) && !jsonObj.get("primary_color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primary_color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primary_color").toString()));
      }
      if (jsonObj.get("form_fields") != null && !jsonObj.get("form_fields").isJsonNull()) {
        JsonArray jsonArrayformFields = jsonObj.getAsJsonArray("form_fields");
        if (jsonArrayformFields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("form_fields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `form_fields` to be an array in the JSON string but got `%s`", jsonObj.get("form_fields").toString()));
          }

          // validate the optional field `form_fields` (array)
          for (int i = 0; i < jsonArrayformFields.size(); i++) {
            InstitutionFormField.validateJsonObject(jsonArrayformFields.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentInstitution.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentInstitution' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentInstitution> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentInstitution.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentInstitution>() {
           @Override
           public void write(JsonWriter out, PaymentInstitution value) throws IOException {
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
           public PaymentInstitution read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PaymentInstitution instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PaymentInstitution given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentInstitution
  * @throws IOException if the JSON string is invalid with respect to PaymentInstitution
  */
  public static PaymentInstitution fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentInstitution.class);
  }

 /**
  * Convert an instance of PaymentInstitution to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

