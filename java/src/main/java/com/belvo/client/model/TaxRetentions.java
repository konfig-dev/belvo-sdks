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
import com.belvo.client.model.EnumTaxRetentionReceiverNationality;
import com.belvo.client.model.RetentionBreakdown;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * TaxRetentions
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TaxRetentions {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

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

  public static final String SERIALIZED_NAME_INVOICE_IDENTIFICATION = "invoice_identification";
  @SerializedName(SERIALIZED_NAME_INVOICE_IDENTIFICATION)
  private UUID invoiceIdentification;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private Integer code;

  public static final String SERIALIZED_NAME_ISSUED_AT = "issued_at";
  @SerializedName(SERIALIZED_NAME_ISSUED_AT)
  private OffsetDateTime issuedAt;

  public static final String SERIALIZED_NAME_CERTIFIED_AT = "certified_at";
  @SerializedName(SERIALIZED_NAME_CERTIFIED_AT)
  private OffsetDateTime certifiedAt;

  public static final String SERIALIZED_NAME_CANCELLED_AT = "cancelled_at";
  @SerializedName(SERIALIZED_NAME_CANCELLED_AT)
  private OffsetDateTime cancelledAt;

  public static final String SERIALIZED_NAME_SENDER_ID = "sender_id";
  @SerializedName(SERIALIZED_NAME_SENDER_ID)
  private String senderId;

  public static final String SERIALIZED_NAME_SENDER_NAME = "sender_name";
  @SerializedName(SERIALIZED_NAME_SENDER_NAME)
  private String senderName;

  public static final String SERIALIZED_NAME_RECEIVER_NATIONALITY = "receiver_nationality";
  @SerializedName(SERIALIZED_NAME_RECEIVER_NATIONALITY)
  private EnumTaxRetentionReceiverNationality receiverNationality;

  public static final String SERIALIZED_NAME_RECEIVER_ID = "receiver_id";
  @SerializedName(SERIALIZED_NAME_RECEIVER_ID)
  private String receiverId;

  public static final String SERIALIZED_NAME_RECEIVER_NAME = "receiver_name";
  @SerializedName(SERIALIZED_NAME_RECEIVER_NAME)
  private String receiverName;

  public static final String SERIALIZED_NAME_TOTAL_INVOICE_AMOUNT = "total_invoice_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_INVOICE_AMOUNT)
  private Float totalInvoiceAmount;

  public static final String SERIALIZED_NAME_TOTAL_EXEMPT_AMOUNT = "total_exempt_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_EXEMPT_AMOUNT)
  private Float totalExemptAmount;

  public static final String SERIALIZED_NAME_TOTAL_RETAINED_AMOUNT = "total_retained_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_RETAINED_AMOUNT)
  private Float totalRetainedAmount;

  public static final String SERIALIZED_NAME_TOTAL_TAXABLE_AMOUNT = "total_taxable_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_TAXABLE_AMOUNT)
  private Float totalTaxableAmount;

  public static final String SERIALIZED_NAME_RETENTION_BREAKDOWN = "retention_breakdown";
  @SerializedName(SERIALIZED_NAME_RETENTION_BREAKDOWN)
  private List<RetentionBreakdown> retentionBreakdown = new ArrayList<>();

  public static final String SERIALIZED_NAME_XML = "xml";
  @SerializedName(SERIALIZED_NAME_XML)
  private String xml;

  public TaxRetentions() {
  }

  public TaxRetentions version(String version) {

    
    
    
    
    this.version = version;
    return this;
  }

   /**
   * The CFDI version of the tax retentions. 
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.0", required = true, value = "The CFDI version of the tax retentions. ")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {

    
    
    
    this.version = version;
  }


  public TaxRetentions id(UUID id) {

    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Belvo&#39;s unique identifier used to reference the current tax retention statement.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "c749315b-eec2-435d-a458-06912878564f", value = "Belvo's unique identifier used to reference the current tax retention statement.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {

    
    
    
    this.id = id;
  }


  public TaxRetentions link(UUID link) {

    
    
    
    
    this.link = link;
    return this;
  }

   /**
   * The &#x60;link.id&#x60; the tax retention belongs to.
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "19697249-01b8-443e-a451-76bfc5fbeebf", value = "The `link.id` the tax retention belongs to.")

  public UUID getLink() {
    return link;
  }


  public void setLink(UUID link) {

    
    
    
    this.link = link;
  }


  public TaxRetentions collectedAt(OffsetDateTime collectedAt) {

    
    
    
    
    this.collectedAt = collectedAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp of when the data point was collected. 
   * @return collectedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-02-09T08:45:50.406032Z", required = true, value = "The ISO-8601 timestamp of when the data point was collected. ")

  public OffsetDateTime getCollectedAt() {
    return collectedAt;
  }


  public void setCollectedAt(OffsetDateTime collectedAt) {

    
    
    
    this.collectedAt = collectedAt;
  }


  public TaxRetentions createdAt(OffsetDateTime createdAt) {

    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp of when the data point was last updated in Belvo&#39;s database. 
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-02-09T08:46:20.406032Z", value = "The ISO-8601 timestamp of when the data point was last updated in Belvo's database. ")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {

    
    
    
    this.createdAt = createdAt;
  }


  public TaxRetentions invoiceIdentification(UUID invoiceIdentification) {

    
    
    
    
    this.invoiceIdentification = invoiceIdentification;
    return this;
  }

   /**
   * The fiscal institution&#39;s unique ID for the invoice that the tax retention relates to. 
   * @return invoiceIdentification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "def404af-5eef-4112-aa99-d1ec8493b89a", required = true, value = "The fiscal institution's unique ID for the invoice that the tax retention relates to. ")

  public UUID getInvoiceIdentification() {
    return invoiceIdentification;
  }


  public void setInvoiceIdentification(UUID invoiceIdentification) {

    
    
    
    this.invoiceIdentification = invoiceIdentification;
  }


  public TaxRetentions code(Integer code) {

    
    
    
    
    this.code = code;
    return this;
  }

   /**
   * The tax retention code. For more information, see our [SAT Catalogs DevPortal article](https://developers.belvo.com/docs/sat-catalogs#retention-code). 
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "25", required = true, value = "The tax retention code. For more information, see our [SAT Catalogs DevPortal article](https://developers.belvo.com/docs/sat-catalogs#retention-code). ")

  public Integer getCode() {
    return code;
  }


  public void setCode(Integer code) {

    
    
    
    this.code = code;
  }


  public TaxRetentions issuedAt(OffsetDateTime issuedAt) {

    
    
    
    
    this.issuedAt = issuedAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp of when the tax retention was issued. 
   * @return issuedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-01-03T21:10:40Z", required = true, value = "The ISO-8601 timestamp of when the tax retention was issued. ")

  public OffsetDateTime getIssuedAt() {
    return issuedAt;
  }


  public void setIssuedAt(OffsetDateTime issuedAt) {

    
    
    
    this.issuedAt = issuedAt;
  }


  public TaxRetentions certifiedAt(OffsetDateTime certifiedAt) {

    
    
    
    
    this.certifiedAt = certifiedAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp of when the tax retention was certified. 
   * @return certifiedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-01-03T21:10:41Z", required = true, value = "The ISO-8601 timestamp of when the tax retention was certified. ")

  public OffsetDateTime getCertifiedAt() {
    return certifiedAt;
  }


  public void setCertifiedAt(OffsetDateTime certifiedAt) {

    
    
    
    this.certifiedAt = certifiedAt;
  }


  public TaxRetentions cancelledAt(OffsetDateTime cancelledAt) {

    
    
    
    
    this.cancelledAt = cancelledAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp of when the tax retention was canceled (if applicable). 
   * @return cancelledAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The ISO-8601 timestamp of when the tax retention was canceled (if applicable). ")

  public OffsetDateTime getCancelledAt() {
    return cancelledAt;
  }


  public void setCancelledAt(OffsetDateTime cancelledAt) {

    
    
    
    this.cancelledAt = cancelledAt;
  }


  public TaxRetentions senderId(String senderId) {

    
    
    
    
    this.senderId = senderId;
    return this;
  }

   /**
   * The fiscal ID of the invoice sender. 
   * @return senderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "JKUF980404P0", required = true, value = "The fiscal ID of the invoice sender. ")

  public String getSenderId() {
    return senderId;
  }


  public void setSenderId(String senderId) {

    
    
    
    this.senderId = senderId;
  }


  public TaxRetentions senderName(String senderName) {

    
    
    
    
    this.senderName = senderName;
    return this;
  }

   /**
   * The name of the invoice sender. 
   * @return senderName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Roberto Nunez Batman", required = true, value = "The name of the invoice sender. ")

  public String getSenderName() {
    return senderName;
  }


  public void setSenderName(String senderName) {

    
    
    
    this.senderName = senderName;
  }


  public TaxRetentions receiverNationality(EnumTaxRetentionReceiverNationality receiverNationality) {

    
    
    
    
    this.receiverNationality = receiverNationality;
    return this;
  }

   /**
   * Get receiverNationality
   * @return receiverNationality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public EnumTaxRetentionReceiverNationality getReceiverNationality() {
    return receiverNationality;
  }


  public void setReceiverNationality(EnumTaxRetentionReceiverNationality receiverNationality) {

    
    
    
    this.receiverNationality = receiverNationality;
  }


  public TaxRetentions receiverId(String receiverId) {

    
    
    
    
    this.receiverId = receiverId;
    return this;
  }

   /**
   * The fiscal ID of the invoice receiver. 
   * @return receiverId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GYGK3207809L1", required = true, value = "The fiscal ID of the invoice receiver. ")

  public String getReceiverId() {
    return receiverId;
  }


  public void setReceiverId(String receiverId) {

    
    
    
    this.receiverId = receiverId;
  }


  public TaxRetentions receiverName(String receiverName) {

    
    
    
    
    this.receiverName = receiverName;
    return this;
  }

   /**
   * The name of the invoice receiver. 
   * @return receiverName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ACME LTD", required = true, value = "The name of the invoice receiver. ")

  public String getReceiverName() {
    return receiverName;
  }


  public void setReceiverName(String receiverName) {

    
    
    
    this.receiverName = receiverName;
  }


  public TaxRetentions totalInvoiceAmount(Float totalInvoiceAmount) {

    
    
    
    
    this.totalInvoiceAmount = totalInvoiceAmount;
    return this;
  }

   /**
   * The total amount of the invoice that the tax retention relates to. 
   * @return totalInvoiceAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "53249.8", required = true, value = "The total amount of the invoice that the tax retention relates to. ")

  public Float getTotalInvoiceAmount() {
    return totalInvoiceAmount;
  }


  public void setTotalInvoiceAmount(Float totalInvoiceAmount) {

    
    
    
    this.totalInvoiceAmount = totalInvoiceAmount;
  }


  public TaxRetentions totalExemptAmount(Float totalExemptAmount) {

    
    
    
    
    this.totalExemptAmount = totalExemptAmount;
    return this;
  }

   /**
   * Total amount that is exempt from taxation. 
   * @return totalExemptAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000.8", required = true, value = "Total amount that is exempt from taxation. ")

  public Float getTotalExemptAmount() {
    return totalExemptAmount;
  }


  public void setTotalExemptAmount(Float totalExemptAmount) {

    
    
    
    this.totalExemptAmount = totalExemptAmount;
  }


  public TaxRetentions totalRetainedAmount(Float totalRetainedAmount) {

    
    
    
    
    this.totalRetainedAmount = totalRetainedAmount;
    return this;
  }

   /**
   * Total tax retained. 
   * @return totalRetainedAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1550.7", required = true, value = "Total tax retained. ")

  public Float getTotalRetainedAmount() {
    return totalRetainedAmount;
  }


  public void setTotalRetainedAmount(Float totalRetainedAmount) {

    
    
    
    this.totalRetainedAmount = totalRetainedAmount;
  }


  public TaxRetentions totalTaxableAmount(Float totalTaxableAmount) {

    
    
    
    
    this.totalTaxableAmount = totalTaxableAmount;
    return this;
  }

   /**
   * The total amount that can be taxed. Calculated as &#x60;total_invoice_amount&#x60; - &#x60;total_exempt_amount&#x60;. 
   * @return totalTaxableAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "43249", required = true, value = "The total amount that can be taxed. Calculated as `total_invoice_amount` - `total_exempt_amount`. ")

  public Float getTotalTaxableAmount() {
    return totalTaxableAmount;
  }


  public void setTotalTaxableAmount(Float totalTaxableAmount) {

    
    
    
    this.totalTaxableAmount = totalTaxableAmount;
  }


  public TaxRetentions retentionBreakdown(List<RetentionBreakdown> retentionBreakdown) {

    
    
    
    
    this.retentionBreakdown = retentionBreakdown;
    return this;
  }

  public TaxRetentions addRetentionBreakdownItem(RetentionBreakdown retentionBreakdownItem) {
    this.retentionBreakdown.add(retentionBreakdownItem);
    return this;
  }

   /**
   * A breakdown of the retained taxes.
   * @return retentionBreakdown
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A breakdown of the retained taxes.")

  public List<RetentionBreakdown> getRetentionBreakdown() {
    return retentionBreakdown;
  }


  public void setRetentionBreakdown(List<RetentionBreakdown> retentionBreakdown) {

    
    
    
    this.retentionBreakdown = retentionBreakdown;
  }


  public TaxRetentions xml(String xml) {

    
    
    
    
    this.xml = xml;
    return this;
  }

   /**
   * The tax retention document in XML form. 
   * @return xml
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "=XML-STRING=", required = true, value = "The tax retention document in XML form. ")

  public String getXml() {
    return xml;
  }


  public void setXml(String xml) {

    
    
    
    this.xml = xml;
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
   * @return the TaxRetentions instance itself
   */
  public TaxRetentions putAdditionalProperty(String key, Object value) {
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
    TaxRetentions taxRetentions = (TaxRetentions) o;
    return Objects.equals(this.version, taxRetentions.version) &&
        Objects.equals(this.id, taxRetentions.id) &&
        Objects.equals(this.link, taxRetentions.link) &&
        Objects.equals(this.collectedAt, taxRetentions.collectedAt) &&
        Objects.equals(this.createdAt, taxRetentions.createdAt) &&
        Objects.equals(this.invoiceIdentification, taxRetentions.invoiceIdentification) &&
        Objects.equals(this.code, taxRetentions.code) &&
        Objects.equals(this.issuedAt, taxRetentions.issuedAt) &&
        Objects.equals(this.certifiedAt, taxRetentions.certifiedAt) &&
        Objects.equals(this.cancelledAt, taxRetentions.cancelledAt) &&
        Objects.equals(this.senderId, taxRetentions.senderId) &&
        Objects.equals(this.senderName, taxRetentions.senderName) &&
        Objects.equals(this.receiverNationality, taxRetentions.receiverNationality) &&
        Objects.equals(this.receiverId, taxRetentions.receiverId) &&
        Objects.equals(this.receiverName, taxRetentions.receiverName) &&
        Objects.equals(this.totalInvoiceAmount, taxRetentions.totalInvoiceAmount) &&
        Objects.equals(this.totalExemptAmount, taxRetentions.totalExemptAmount) &&
        Objects.equals(this.totalRetainedAmount, taxRetentions.totalRetainedAmount) &&
        Objects.equals(this.totalTaxableAmount, taxRetentions.totalTaxableAmount) &&
        Objects.equals(this.retentionBreakdown, taxRetentions.retentionBreakdown) &&
        Objects.equals(this.xml, taxRetentions.xml)&&
        Objects.equals(this.additionalProperties, taxRetentions.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, id, link, collectedAt, createdAt, invoiceIdentification, code, issuedAt, certifiedAt, cancelledAt, senderId, senderName, receiverNationality, receiverId, receiverName, totalInvoiceAmount, totalExemptAmount, totalRetainedAmount, totalTaxableAmount, retentionBreakdown, xml, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxRetentions {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    collectedAt: ").append(toIndentedString(collectedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    invoiceIdentification: ").append(toIndentedString(invoiceIdentification)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    issuedAt: ").append(toIndentedString(issuedAt)).append("\n");
    sb.append("    certifiedAt: ").append(toIndentedString(certifiedAt)).append("\n");
    sb.append("    cancelledAt: ").append(toIndentedString(cancelledAt)).append("\n");
    sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
    sb.append("    senderName: ").append(toIndentedString(senderName)).append("\n");
    sb.append("    receiverNationality: ").append(toIndentedString(receiverNationality)).append("\n");
    sb.append("    receiverId: ").append(toIndentedString(receiverId)).append("\n");
    sb.append("    receiverName: ").append(toIndentedString(receiverName)).append("\n");
    sb.append("    totalInvoiceAmount: ").append(toIndentedString(totalInvoiceAmount)).append("\n");
    sb.append("    totalExemptAmount: ").append(toIndentedString(totalExemptAmount)).append("\n");
    sb.append("    totalRetainedAmount: ").append(toIndentedString(totalRetainedAmount)).append("\n");
    sb.append("    totalTaxableAmount: ").append(toIndentedString(totalTaxableAmount)).append("\n");
    sb.append("    retentionBreakdown: ").append(toIndentedString(retentionBreakdown)).append("\n");
    sb.append("    xml: ").append(toIndentedString(xml)).append("\n");
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
    openapiFields.add("version");
    openapiFields.add("id");
    openapiFields.add("link");
    openapiFields.add("collected_at");
    openapiFields.add("created_at");
    openapiFields.add("invoice_identification");
    openapiFields.add("code");
    openapiFields.add("issued_at");
    openapiFields.add("certified_at");
    openapiFields.add("cancelled_at");
    openapiFields.add("sender_id");
    openapiFields.add("sender_name");
    openapiFields.add("receiver_nationality");
    openapiFields.add("receiver_id");
    openapiFields.add("receiver_name");
    openapiFields.add("total_invoice_amount");
    openapiFields.add("total_exempt_amount");
    openapiFields.add("total_retained_amount");
    openapiFields.add("total_taxable_amount");
    openapiFields.add("retention_breakdown");
    openapiFields.add("xml");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("version");
    openapiRequiredFields.add("collected_at");
    openapiRequiredFields.add("invoice_identification");
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("issued_at");
    openapiRequiredFields.add("certified_at");
    openapiRequiredFields.add("cancelled_at");
    openapiRequiredFields.add("sender_id");
    openapiRequiredFields.add("sender_name");
    openapiRequiredFields.add("receiver_nationality");
    openapiRequiredFields.add("receiver_id");
    openapiRequiredFields.add("receiver_name");
    openapiRequiredFields.add("total_invoice_amount");
    openapiRequiredFields.add("total_exempt_amount");
    openapiRequiredFields.add("total_retained_amount");
    openapiRequiredFields.add("total_taxable_amount");
    openapiRequiredFields.add("retention_breakdown");
    openapiRequiredFields.add("xml");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TaxRetentions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TaxRetentions.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaxRetentions is not found in the empty JSON string", TaxRetentions.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TaxRetentions.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("version").isJsonNull() && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("link") != null && !jsonObj.get("link").isJsonNull()) && !jsonObj.get("link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link").toString()));
      }
      if (!jsonObj.get("invoice_identification").isJsonNull() && !jsonObj.get("invoice_identification").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_identification` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_identification").toString()));
      }
      if (!jsonObj.get("sender_id").isJsonNull() && !jsonObj.get("sender_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sender_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sender_id").toString()));
      }
      if (!jsonObj.get("sender_name").isJsonNull() && !jsonObj.get("sender_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sender_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sender_name").toString()));
      }
      if (!jsonObj.get("receiver_id").isJsonNull() && !jsonObj.get("receiver_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `receiver_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("receiver_id").toString()));
      }
      if (!jsonObj.get("receiver_name").isJsonNull() && !jsonObj.get("receiver_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `receiver_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("receiver_name").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("retention_breakdown").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `retention_breakdown` to be an array in the JSON string but got `%s`", jsonObj.get("retention_breakdown").toString()));
      }

      JsonArray jsonArrayretentionBreakdown = jsonObj.getAsJsonArray("retention_breakdown");
      // validate the required field `retention_breakdown` (array)
      for (int i = 0; i < jsonArrayretentionBreakdown.size(); i++) {
        RetentionBreakdown.validateJsonObject(jsonArrayretentionBreakdown.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("xml").isJsonNull() && !jsonObj.get("xml").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xml` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xml").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TaxRetentions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TaxRetentions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TaxRetentions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TaxRetentions.class));

       return (TypeAdapter<T>) new TypeAdapter<TaxRetentions>() {
           @Override
           public void write(JsonWriter out, TaxRetentions value) throws IOException {
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
           public TaxRetentions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TaxRetentions instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TaxRetentions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TaxRetentions
  * @throws IOException if the JSON string is invalid with respect to TaxRetentions
  */
  public static TaxRetentions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaxRetentions.class);
  }

 /**
  * Convert an instance of TaxRetentions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

