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
import com.belvo.client.model.EnumInvestmentPortfolioType;
import com.belvo.client.model.InvestmentsPortfolioInstrument;
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
 * InvestmentsPortfolio
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class InvestmentsPortfolio {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private EnumInvestmentPortfolioType type;

  public static final String SERIALIZED_NAME_BALANCE_TYPE = "balance_type";
  @SerializedName(SERIALIZED_NAME_BALANCE_TYPE)
  private String balanceType;

  public static final String SERIALIZED_NAME_BALANCE_GROSS = "balance_gross";
  @SerializedName(SERIALIZED_NAME_BALANCE_GROSS)
  private Float balanceGross;

  public static final String SERIALIZED_NAME_BALANCE_NET = "balance_net";
  @SerializedName(SERIALIZED_NAME_BALANCE_NET)
  private Float balanceNet;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_INSTRUMENTS = "instruments";
  @SerializedName(SERIALIZED_NAME_INSTRUMENTS)
  private List<InvestmentsPortfolioInstrument> instruments = null;

  public InvestmentsPortfolio() {
  }

  public InvestmentsPortfolio id(UUID id) {

    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Belvo&#39;s unique ID for the current portfolio.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30cb4806-6e00-48a4-91c9-ca55968576c8", value = "Belvo's unique ID for the current portfolio.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {

    
    
    
    this.id = id;
  }


  public InvestmentsPortfolio name(String name) {

    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of the portfolio, as given in the institution. 
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Investimento", required = true, value = "The name of the portfolio, as given in the institution. ")

  public String getName() {
    return name;
  }


  public void setName(String name) {

    
    
    
    this.name = name;
  }


  public InvestmentsPortfolio type(EnumInvestmentPortfolioType type) {

    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EnumInvestmentPortfolioType getType() {
    return type;
  }


  public void setType(EnumInvestmentPortfolioType type) {

    
    
    
    this.type = type;
  }


  public InvestmentsPortfolio balanceType(String balanceType) {

    
    
    
    
    this.balanceType = balanceType;
    return this;
  }

   /**
   * Indicates whether this account is either an &#x60;ASSET&#x60; or a &#x60;LIABILITY&#x60;. You can consider the balance of an &#x60;ASSET&#x60; as being positive, while the balance of a &#x60;LIABILITY&#x60; as negative. 
   * @return balanceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ASSET", value = "Indicates whether this account is either an `ASSET` or a `LIABILITY`. You can consider the balance of an `ASSET` as being positive, while the balance of a `LIABILITY` as negative. ")

  public String getBalanceType() {
    return balanceType;
  }


  public void setBalanceType(String balanceType) {

    
    
    
    this.balanceType = balanceType;
  }


  public InvestmentsPortfolio balanceGross(Float balanceGross) {

    
    
    
    
    this.balanceGross = balanceGross;
    return this;
  }

   /**
   * The current gross total value of the entire portfolio and all its underlying instruments, as given by the institution. 
   * @return balanceGross
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "76000", required = true, value = "The current gross total value of the entire portfolio and all its underlying instruments, as given by the institution. ")

  public Float getBalanceGross() {
    return balanceGross;
  }


  public void setBalanceGross(Float balanceGross) {

    
    
    
    this.balanceGross = balanceGross;
  }


  public InvestmentsPortfolio balanceNet(Float balanceNet) {

    
    
    
    
    this.balanceNet = balanceNet;
    return this;
  }

   /**
   * The total current value of the entire portfolio and all its underlying instruments, as given by the institution.  ℹ️ **Note:** In Brazil, this is usually calculated based on the net value (that is, not including tax). 
   * @return balanceNet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "77370.69", required = true, value = "The total current value of the entire portfolio and all its underlying instruments, as given by the institution.  ℹ️ **Note:** In Brazil, this is usually calculated based on the net value (that is, not including tax). ")

  public Float getBalanceNet() {
    return balanceNet;
  }


  public void setBalanceNet(Float balanceNet) {

    
    
    
    this.balanceNet = balanceNet;
  }


  public InvestmentsPortfolio currency(String currency) {

    
    
    
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency of the portfolio. For example:   - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso)   Please note that other currencies other than in the list above may be returned. 
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "BRL", required = true, value = "The currency of the portfolio. For example:   - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso)   Please note that other currencies other than in the list above may be returned. ")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {

    
    
    
    this.currency = currency;
  }


  public InvestmentsPortfolio instruments(List<InvestmentsPortfolioInstrument> instruments) {

    
    
    
    
    this.instruments = instruments;
    return this;
  }

  public InvestmentsPortfolio addInstrumentsItem(InvestmentsPortfolioInstrument instrumentsItem) {
    if (this.instruments == null) {
      this.instruments = new ArrayList<>();
    }
    this.instruments.add(instrumentsItem);
    return this;
  }

   /**
   * An array of instruments that fall into the investment portfolio.
   * @return instruments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of instruments that fall into the investment portfolio.")

  public List<InvestmentsPortfolioInstrument> getInstruments() {
    return instruments;
  }


  public void setInstruments(List<InvestmentsPortfolioInstrument> instruments) {

    
    
    
    this.instruments = instruments;
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
   * @return the InvestmentsPortfolio instance itself
   */
  public InvestmentsPortfolio putAdditionalProperty(String key, Object value) {
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
    InvestmentsPortfolio investmentsPortfolio = (InvestmentsPortfolio) o;
    return Objects.equals(this.id, investmentsPortfolio.id) &&
        Objects.equals(this.name, investmentsPortfolio.name) &&
        Objects.equals(this.type, investmentsPortfolio.type) &&
        Objects.equals(this.balanceType, investmentsPortfolio.balanceType) &&
        Objects.equals(this.balanceGross, investmentsPortfolio.balanceGross) &&
        Objects.equals(this.balanceNet, investmentsPortfolio.balanceNet) &&
        Objects.equals(this.currency, investmentsPortfolio.currency) &&
        Objects.equals(this.instruments, investmentsPortfolio.instruments)&&
        Objects.equals(this.additionalProperties, investmentsPortfolio.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, balanceType, balanceGross, balanceNet, currency, instruments, additionalProperties);
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
    sb.append("class InvestmentsPortfolio {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    balanceType: ").append(toIndentedString(balanceType)).append("\n");
    sb.append("    balanceGross: ").append(toIndentedString(balanceGross)).append("\n");
    sb.append("    balanceNet: ").append(toIndentedString(balanceNet)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    instruments: ").append(toIndentedString(instruments)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("type");
    openapiFields.add("balance_type");
    openapiFields.add("balance_gross");
    openapiFields.add("balance_net");
    openapiFields.add("currency");
    openapiFields.add("instruments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("balance_gross");
    openapiRequiredFields.add("balance_net");
    openapiRequiredFields.add("currency");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InvestmentsPortfolio
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InvestmentsPortfolio.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvestmentsPortfolio is not found in the empty JSON string", InvestmentsPortfolio.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InvestmentsPortfolio.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("balance_type").isJsonNull() && (jsonObj.get("balance_type") != null && !jsonObj.get("balance_type").isJsonNull()) && !jsonObj.get("balance_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `balance_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("balance_type").toString()));
      }
      if (!jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if (jsonObj.get("instruments") != null && !jsonObj.get("instruments").isJsonNull()) {
        JsonArray jsonArrayinstruments = jsonObj.getAsJsonArray("instruments");
        if (jsonArrayinstruments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("instruments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `instruments` to be an array in the JSON string but got `%s`", jsonObj.get("instruments").toString()));
          }

          // validate the optional field `instruments` (array)
          for (int i = 0; i < jsonArrayinstruments.size(); i++) {
            InvestmentsPortfolioInstrument.validateJsonObject(jsonArrayinstruments.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvestmentsPortfolio.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvestmentsPortfolio' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvestmentsPortfolio> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvestmentsPortfolio.class));

       return (TypeAdapter<T>) new TypeAdapter<InvestmentsPortfolio>() {
           @Override
           public void write(JsonWriter out, InvestmentsPortfolio value) throws IOException {
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
           public InvestmentsPortfolio read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             InvestmentsPortfolio instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of InvestmentsPortfolio given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvestmentsPortfolio
  * @throws IOException if the JSON string is invalid with respect to InvestmentsPortfolio
  */
  public static InvestmentsPortfolio fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvestmentsPortfolio.class);
  }

 /**
  * Convert an instance of InvestmentsPortfolio to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

