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
import com.belvo.client.model.TaxStatusAddressSat;
import com.belvo.client.model.TaxStatusEconomicActivitySat;
import com.belvo.client.model.TaxStatusObligationsSat;
import com.belvo.client.model.TaxStatusRegimensSat;
import com.belvo.client.model.TaxStatusTaxPayerInformationSat;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;
import java.io.IOException;
import java.time.OffsetDateTime;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.belvo.client.JSON;

/**
 * TaxStatusSat
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TaxStatusSat {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private UUID link;

  public static final String SERIALIZED_NAME_COLLECTED_AT = "collected_at";
  @SerializedName(SERIALIZED_NAME_COLLECTED_AT)
  private OffsetDateTime collectedAt;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_PLACE_AND_DATE_OF_ISSUANCE = "place_and_date_of_issuance";
  @SerializedName(SERIALIZED_NAME_PLACE_AND_DATE_OF_ISSUANCE)
  private String placeAndDateOfIssuance;

  public static final String SERIALIZED_NAME_OFFICIAL_NAME = "official_name";
  @SerializedName(SERIALIZED_NAME_OFFICIAL_NAME)
  private String officialName;

  public static final String SERIALIZED_NAME_ID_CIF = "id_cif";
  @SerializedName(SERIALIZED_NAME_ID_CIF)
  private String idCif;

  public static final String SERIALIZED_NAME_TAX_PAYER_INFORMATION = "tax_payer_information";
  @SerializedName(SERIALIZED_NAME_TAX_PAYER_INFORMATION)
  private TaxStatusTaxPayerInformationSat taxPayerInformation;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private TaxStatusAddressSat address;

  public static final String SERIALIZED_NAME_ECONOMIC_ACTIVITY = "economic_activity";
  @SerializedName(SERIALIZED_NAME_ECONOMIC_ACTIVITY)
  private List<TaxStatusEconomicActivitySat> economicActivity = new ArrayList<>();

  public static final String SERIALIZED_NAME_REGIMENS = "regimens";
  @SerializedName(SERIALIZED_NAME_REGIMENS)
  private List<TaxStatusRegimensSat> regimens = null;

  public static final String SERIALIZED_NAME_OBLIGATIONS = "obligations";
  @SerializedName(SERIALIZED_NAME_OBLIGATIONS)
  private List<TaxStatusObligationsSat> obligations = new ArrayList<>();

  public static final String SERIALIZED_NAME_DIGITAL_STAMP = "digital_stamp";
  @SerializedName(SERIALIZED_NAME_DIGITAL_STAMP)
  private String digitalStamp;

  public static final String SERIALIZED_NAME_DIGITAL_STAMP_CHAIN = "digital_stamp_chain";
  @SerializedName(SERIALIZED_NAME_DIGITAL_STAMP_CHAIN)
  private String digitalStampChain;

  public static final String SERIALIZED_NAME_PDF = "pdf";
  @SerializedName(SERIALIZED_NAME_PDF)
  private File pdf;

  public TaxStatusSat() {
  }

  public TaxStatusSat id(UUID id) {
    
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier created by Belvo used to reference the current Tax Status.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "21e9e25b-10a8-48a5-9e6a-4072b364b53f", required = true, value = "Unique identifier created by Belvo used to reference the current Tax Status.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    
    this.id = id;
  }


  public TaxStatusSat link(UUID link) {
    
    
    this.link = link;
    return this;
  }

   /**
   * The &#x60;link.id&#x60; that the tax status is associated with.
   * @return link
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "c2280c05-cbeb-4a29-ae53-8f837a77995b", required = true, value = "The `link.id` that the tax status is associated with.")

  public UUID getLink() {
    return link;
  }


  public void setLink(UUID link) {
    
    this.link = link;
  }


  public TaxStatusSat collectedAt(OffsetDateTime collectedAt) {
    
    
    this.collectedAt = collectedAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp when the data point was collected.
   * @return collectedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-04-23T21:32:55.336Z", required = true, value = "The ISO-8601 timestamp when the data point was collected.")

  public OffsetDateTime getCollectedAt() {
    return collectedAt;
  }


  public void setCollectedAt(OffsetDateTime collectedAt) {
    
    this.collectedAt = collectedAt;
  }


  public TaxStatusSat createdAt(OffsetDateTime createdAt) {
    
    
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


  public TaxStatusSat placeAndDateOfIssuance(String placeAndDateOfIssuance) {
    
    
    this.placeAndDateOfIssuance = placeAndDateOfIssuance;
    return this;
  }

   /**
   * The place and date of that the tax status was issued.
   * @return placeAndDateOfIssuance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TLALPAN , CIUDAD DE MEXICO A 19 DE MARZO DE 2020", required = true, value = "The place and date of that the tax status was issued.")

  public String getPlaceAndDateOfIssuance() {
    return placeAndDateOfIssuance;
  }


  public void setPlaceAndDateOfIssuance(String placeAndDateOfIssuance) {
    
    this.placeAndDateOfIssuance = placeAndDateOfIssuance;
  }


  public TaxStatusSat officialName(String officialName) {
    
    
    this.officialName = officialName;
    return this;
  }

   /**
   * The name of the person or business.
   * @return officialName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "John Doe", required = true, value = "The name of the person or business.")

  public String getOfficialName() {
    return officialName;
  }


  public void setOfficialName(String officialName) {
    
    this.officialName = officialName;
  }


  public TaxStatusSat idCif(String idCif) {
    
    
    this.idCif = idCif;
    return this;
  }

   /**
   * The taxpayer&#39;s *Cédula de Identificación Fiscal* (CIF) ID. 
   * @return idCif
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345678901", required = true, value = "The taxpayer's *Cédula de Identificación Fiscal* (CIF) ID. ")

  public String getIdCif() {
    return idCif;
  }


  public void setIdCif(String idCif) {
    
    this.idCif = idCif;
  }


  public TaxStatusSat taxPayerInformation(TaxStatusTaxPayerInformationSat taxPayerInformation) {
    
    
    this.taxPayerInformation = taxPayerInformation;
    return this;
  }

   /**
   * Get taxPayerInformation
   * @return taxPayerInformation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public TaxStatusTaxPayerInformationSat getTaxPayerInformation() {
    return taxPayerInformation;
  }


  public void setTaxPayerInformation(TaxStatusTaxPayerInformationSat taxPayerInformation) {
    
    this.taxPayerInformation = taxPayerInformation;
  }


  public TaxStatusSat address(TaxStatusAddressSat address) {
    
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public TaxStatusAddressSat getAddress() {
    return address;
  }


  public void setAddress(TaxStatusAddressSat address) {
    
    this.address = address;
  }


  public TaxStatusSat economicActivity(List<TaxStatusEconomicActivitySat> economicActivity) {
    
    
    this.economicActivity = economicActivity;
    return this;
  }

  public TaxStatusSat addEconomicActivityItem(TaxStatusEconomicActivitySat economicActivityItem) {
    this.economicActivity.add(economicActivityItem);
    return this;
  }

   /**
   * A list of economic activity objects. 
   * @return economicActivity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A list of economic activity objects. ")

  public List<TaxStatusEconomicActivitySat> getEconomicActivity() {
    return economicActivity;
  }


  public void setEconomicActivity(List<TaxStatusEconomicActivitySat> economicActivity) {
    
    this.economicActivity = economicActivity;
  }


  public TaxStatusSat regimens(List<TaxStatusRegimensSat> regimens) {
    
    
    this.regimens = regimens;
    return this;
  }

  public TaxStatusSat addRegimensItem(TaxStatusRegimensSat regimensItem) {
    if (this.regimens == null) {
      this.regimens = new ArrayList<>();
    }
    this.regimens.add(regimensItem);
    return this;
  }

   /**
   * A list of regimen objects. 
   * @return regimens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of regimen objects. ")

  public List<TaxStatusRegimensSat> getRegimens() {
    return regimens;
  }


  public void setRegimens(List<TaxStatusRegimensSat> regimens) {
    
    this.regimens = regimens;
  }


  public TaxStatusSat obligations(List<TaxStatusObligationsSat> obligations) {
    
    
    this.obligations = obligations;
    return this;
  }

  public TaxStatusSat addObligationsItem(TaxStatusObligationsSat obligationsItem) {
    this.obligations.add(obligationsItem);
    return this;
  }

   /**
   * Details regarding a business&#39;s obligations.  ℹ️ For non-business accounts, this field will return empty. 
   * @return obligations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Details regarding a business's obligations.  ℹ️ For non-business accounts, this field will return empty. ")

  public List<TaxStatusObligationsSat> getObligations() {
    return obligations;
  }


  public void setObligations(List<TaxStatusObligationsSat> obligations) {
    
    this.obligations = obligations;
  }


  public TaxStatusSat digitalStamp(String digitalStamp) {
    
    
    this.digitalStamp = digitalStamp;
    return this;
  }

   /**
   * The validation certificate of the document.
   * @return digitalStamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "||2020/04/26|GHTF980303F7|CONSTANCIA DE SITUACIÓN FISCAL|2044441088666600000034||", required = true, value = "The validation certificate of the document.")

  public String getDigitalStamp() {
    return digitalStamp;
  }


  public void setDigitalStamp(String digitalStamp) {
    
    this.digitalStamp = digitalStamp;
  }


  public TaxStatusSat digitalStampChain(String digitalStampChain) {
    
    
    this.digitalStampChain = digitalStampChain;
    return this;
  }

   /**
   * A data chain containing the basic structure of a fiscal digital check. For Mexico, this is the *Comprobante Fiscal Digital por Internet* (CFDI). 
   * @return digitalStampChain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EtenSA9t1adG7bn+Jj23kj43JK+XbMPxdOppwabhXD+pXseSqYowWWDna0mpUk3264lkj2345j23faNZB852dCDt9KAjow=", required = true, value = "A data chain containing the basic structure of a fiscal digital check. For Mexico, this is the *Comprobante Fiscal Digital por Internet* (CFDI). ")

  public String getDigitalStampChain() {
    return digitalStampChain;
  }


  public void setDigitalStampChain(String digitalStampChain) {
    
    this.digitalStampChain = digitalStampChain;
  }


  public TaxStatusSat pdf(File pdf) {
    
    
    this.pdf = pdf;
    return this;
  }

   /**
   * Tax status PDF as a binary string.
   * @return pdf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[B@672c3646", required = true, value = "Tax status PDF as a binary string.")

  public File getPdf() {
    return pdf;
  }


  public void setPdf(File pdf) {
    
    this.pdf = pdf;
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
   * @return the TaxStatusSat instance itself
   */
  public TaxStatusSat putAdditionalProperty(String key, Object value) {
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
    TaxStatusSat taxStatusSat = (TaxStatusSat) o;
    return Objects.equals(this.id, taxStatusSat.id) &&
        Objects.equals(this.link, taxStatusSat.link) &&
        Objects.equals(this.collectedAt, taxStatusSat.collectedAt) &&
        Objects.equals(this.createdAt, taxStatusSat.createdAt) &&
        Objects.equals(this.placeAndDateOfIssuance, taxStatusSat.placeAndDateOfIssuance) &&
        Objects.equals(this.officialName, taxStatusSat.officialName) &&
        Objects.equals(this.idCif, taxStatusSat.idCif) &&
        Objects.equals(this.taxPayerInformation, taxStatusSat.taxPayerInformation) &&
        Objects.equals(this.address, taxStatusSat.address) &&
        Objects.equals(this.economicActivity, taxStatusSat.economicActivity) &&
        Objects.equals(this.regimens, taxStatusSat.regimens) &&
        Objects.equals(this.obligations, taxStatusSat.obligations) &&
        Objects.equals(this.digitalStamp, taxStatusSat.digitalStamp) &&
        Objects.equals(this.digitalStampChain, taxStatusSat.digitalStampChain) &&
        Objects.equals(this.pdf, taxStatusSat.pdf)&&
        Objects.equals(this.additionalProperties, taxStatusSat.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, link, collectedAt, createdAt, placeAndDateOfIssuance, officialName, idCif, taxPayerInformation, address, economicActivity, regimens, obligations, digitalStamp, digitalStampChain, pdf, additionalProperties);
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
    sb.append("class TaxStatusSat {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    collectedAt: ").append(toIndentedString(collectedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    placeAndDateOfIssuance: ").append(toIndentedString(placeAndDateOfIssuance)).append("\n");
    sb.append("    officialName: ").append(toIndentedString(officialName)).append("\n");
    sb.append("    idCif: ").append(toIndentedString(idCif)).append("\n");
    sb.append("    taxPayerInformation: ").append(toIndentedString(taxPayerInformation)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    economicActivity: ").append(toIndentedString(economicActivity)).append("\n");
    sb.append("    regimens: ").append(toIndentedString(regimens)).append("\n");
    sb.append("    obligations: ").append(toIndentedString(obligations)).append("\n");
    sb.append("    digitalStamp: ").append(toIndentedString(digitalStamp)).append("\n");
    sb.append("    digitalStampChain: ").append(toIndentedString(digitalStampChain)).append("\n");
    sb.append("    pdf: ").append(toIndentedString(pdf)).append("\n");
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
    openapiFields.add("collected_at");
    openapiFields.add("created_at");
    openapiFields.add("place_and_date_of_issuance");
    openapiFields.add("official_name");
    openapiFields.add("id_cif");
    openapiFields.add("tax_payer_information");
    openapiFields.add("address");
    openapiFields.add("economic_activity");
    openapiFields.add("regimens");
    openapiFields.add("obligations");
    openapiFields.add("digital_stamp");
    openapiFields.add("digital_stamp_chain");
    openapiFields.add("pdf");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("link");
    openapiRequiredFields.add("collected_at");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("place_and_date_of_issuance");
    openapiRequiredFields.add("official_name");
    openapiRequiredFields.add("id_cif");
    openapiRequiredFields.add("tax_payer_information");
    openapiRequiredFields.add("address");
    openapiRequiredFields.add("economic_activity");
    openapiRequiredFields.add("obligations");
    openapiRequiredFields.add("digital_stamp");
    openapiRequiredFields.add("digital_stamp_chain");
    openapiRequiredFields.add("pdf");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TaxStatusSat
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TaxStatusSat.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaxStatusSat is not found in the empty JSON string", TaxStatusSat.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TaxStatusSat.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link").toString()));
      }
      if (!jsonObj.get("place_and_date_of_issuance").isJsonNull() && !jsonObj.get("place_and_date_of_issuance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `place_and_date_of_issuance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("place_and_date_of_issuance").toString()));
      }
      if (!jsonObj.get("official_name").isJsonNull() && !jsonObj.get("official_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `official_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("official_name").toString()));
      }
      if (!jsonObj.get("id_cif").isJsonNull() && !jsonObj.get("id_cif").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id_cif` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id_cif").toString()));
      }
      // validate the required field `tax_payer_information`
      TaxStatusTaxPayerInformationSat.validateJsonObject(jsonObj.getAsJsonObject("tax_payer_information"));
      // validate the required field `address`
      TaxStatusAddressSat.validateJsonObject(jsonObj.getAsJsonObject("address"));
      // ensure the json data is an array
      if (!jsonObj.get("economic_activity").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `economic_activity` to be an array in the JSON string but got `%s`", jsonObj.get("economic_activity").toString()));
      }

      JsonArray jsonArrayeconomicActivity = jsonObj.getAsJsonArray("economic_activity");
      // validate the required field `economic_activity` (array)
      for (int i = 0; i < jsonArrayeconomicActivity.size(); i++) {
        TaxStatusEconomicActivitySat.validateJsonObject(jsonArrayeconomicActivity.get(i).getAsJsonObject());
      };
      if (jsonObj.get("regimens") != null && !jsonObj.get("regimens").isJsonNull()) {
        JsonArray jsonArrayregimens = jsonObj.getAsJsonArray("regimens");
        if (jsonArrayregimens != null) {
          // ensure the json data is an array
          if (!jsonObj.get("regimens").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `regimens` to be an array in the JSON string but got `%s`", jsonObj.get("regimens").toString()));
          }

          // validate the optional field `regimens` (array)
          for (int i = 0; i < jsonArrayregimens.size(); i++) {
            TaxStatusRegimensSat.validateJsonObject(jsonArrayregimens.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("obligations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `obligations` to be an array in the JSON string but got `%s`", jsonObj.get("obligations").toString()));
      }

      JsonArray jsonArrayobligations = jsonObj.getAsJsonArray("obligations");
      // validate the required field `obligations` (array)
      for (int i = 0; i < jsonArrayobligations.size(); i++) {
        TaxStatusObligationsSat.validateJsonObject(jsonArrayobligations.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("digital_stamp").isJsonNull() && !jsonObj.get("digital_stamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `digital_stamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("digital_stamp").toString()));
      }
      if (!jsonObj.get("digital_stamp_chain").isJsonNull() && !jsonObj.get("digital_stamp_chain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `digital_stamp_chain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("digital_stamp_chain").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TaxStatusSat.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TaxStatusSat' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TaxStatusSat> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TaxStatusSat.class));

       return (TypeAdapter<T>) new TypeAdapter<TaxStatusSat>() {
           @Override
           public void write(JsonWriter out, TaxStatusSat value) throws IOException {
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
           public TaxStatusSat read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TaxStatusSat instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TaxStatusSat given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TaxStatusSat
  * @throws IOException if the JSON string is invalid with respect to TaxStatusSat
  */
  public static TaxStatusSat fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaxStatusSat.class);
  }

 /**
  * Convert an instance of TaxStatusSat to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

