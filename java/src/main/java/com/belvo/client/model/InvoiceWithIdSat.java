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
import com.belvo.client.model.EnumInvoiceSatInvoiceType;
import com.belvo.client.model.EnumInvoiceSatPaymentMethod;
import com.belvo.client.model.EnumInvoiceType;
import com.belvo.client.model.InvoiceDetailSat;
import com.belvo.client.model.InvoiceWarningsSat;
import com.belvo.client.model.InvoicesPaymentsSat;
import com.belvo.client.model.InvoicesPayrollSat;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
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
 * InvoiceWithIdSat
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class InvoiceWithIdSat {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link;

  public static final String SERIALIZED_NAME_COLLECTED_AT = "collected_at";
  @SerializedName(SERIALIZED_NAME_COLLECTED_AT)
  private OffsetDateTime collectedAt;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_INVOICE_IDENTIFICATION = "invoice_identification";
  @SerializedName(SERIALIZED_NAME_INVOICE_IDENTIFICATION)
  private String invoiceIdentification;

  public static final String SERIALIZED_NAME_INVOICE_DATE = "invoice_date";
  @SerializedName(SERIALIZED_NAME_INVOICE_DATE)
  private LocalDate invoiceDate;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_INVOICE_TYPE = "invoice_type";
  @SerializedName(SERIALIZED_NAME_INVOICE_TYPE)
  private EnumInvoiceSatInvoiceType invoiceType;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private EnumInvoiceType type;

  public static final String SERIALIZED_NAME_SENDER_ID = "sender_id";
  @SerializedName(SERIALIZED_NAME_SENDER_ID)
  private String senderId;

  public static final String SERIALIZED_NAME_SENDER_NAME = "sender_name";
  @SerializedName(SERIALIZED_NAME_SENDER_NAME)
  private String senderName;

  public static final String SERIALIZED_NAME_SENDER_TAX_FRAUD_STATUS = "sender_tax_fraud_status";
  @SerializedName(SERIALIZED_NAME_SENDER_TAX_FRAUD_STATUS)
  private String senderTaxFraudStatus;

  public static final String SERIALIZED_NAME_RECEIVER_ID = "receiver_id";
  @SerializedName(SERIALIZED_NAME_RECEIVER_ID)
  private String receiverId;

  public static final String SERIALIZED_NAME_RECEIVER_NAME = "receiver_name";
  @SerializedName(SERIALIZED_NAME_RECEIVER_NAME)
  private String receiverName;

  public static final String SERIALIZED_NAME_RECEIVER_TAX_FRAUD_STATUS = "receiver_tax_fraud_status";
  @SerializedName(SERIALIZED_NAME_RECEIVER_TAX_FRAUD_STATUS)
  private String receiverTaxFraudStatus;

  public static final String SERIALIZED_NAME_CANCELATION_STATUS = "cancelation_status";
  @SerializedName(SERIALIZED_NAME_CANCELATION_STATUS)
  private String cancelationStatus;

  public static final String SERIALIZED_NAME_CANCELATION_UPDATE_DATE = "cancelation_update_date";
  @SerializedName(SERIALIZED_NAME_CANCELATION_UPDATE_DATE)
  private LocalDate cancelationUpdateDate;

  public static final String SERIALIZED_NAME_CERTIFICATION_DATE = "certification_date";
  @SerializedName(SERIALIZED_NAME_CERTIFICATION_DATE)
  private LocalDate certificationDate;

  public static final String SERIALIZED_NAME_CERTIFICATION_AUTHORITY = "certification_authority";
  @SerializedName(SERIALIZED_NAME_CERTIFICATION_AUTHORITY)
  private String certificationAuthority;

  public static final String SERIALIZED_NAME_PAYMENT_TYPE = "payment_type";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TYPE)
  private String paymentType;

  public static final String SERIALIZED_NAME_PAYMENT_TYPE_DESCRIPTION = "payment_type_description";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TYPE_DESCRIPTION)
  private String paymentTypeDescription;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "payment_method";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private EnumInvoiceSatPaymentMethod paymentMethod;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD_DESCRIPTION = "payment_method_description";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD_DESCRIPTION)
  private String paymentMethodDescription;

  public static final String SERIALIZED_NAME_USAGE = "usage";
  @SerializedName(SERIALIZED_NAME_USAGE)
  private String usage;

  public static final String SERIALIZED_NAME_PLACE_OF_ISSUE = "place_of_issue";
  @SerializedName(SERIALIZED_NAME_PLACE_OF_ISSUE)
  private String placeOfIssue;

  public static final String SERIALIZED_NAME_INVOICE_DETAILS = "invoice_details";
  @SerializedName(SERIALIZED_NAME_INVOICE_DETAILS)
  private List<InvoiceDetailSat> invoiceDetails = new ArrayList<>();

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_SUBTOTAL_AMOUNT = "subtotal_amount";
  @SerializedName(SERIALIZED_NAME_SUBTOTAL_AMOUNT)
  private Float subtotalAmount;

  public static final String SERIALIZED_NAME_EXCHANGE_RATE = "exchange_rate";
  @SerializedName(SERIALIZED_NAME_EXCHANGE_RATE)
  private Float exchangeRate;

  public static final String SERIALIZED_NAME_TAX_AMOUNT = "tax_amount";
  @SerializedName(SERIALIZED_NAME_TAX_AMOUNT)
  private Float taxAmount;

  public static final String SERIALIZED_NAME_DISCOUNT_AMOUNT = "discount_amount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_AMOUNT)
  private Float discountAmount;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "total_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private Float totalAmount;

  public static final String SERIALIZED_NAME_PAYMENTS = "payments";
  @SerializedName(SERIALIZED_NAME_PAYMENTS)
  private List<InvoicesPaymentsSat> payments = new ArrayList<>();

  public static final String SERIALIZED_NAME_PAYROLL = "payroll";
  @SerializedName(SERIALIZED_NAME_PAYROLL)
  private InvoicesPayrollSat payroll;

  public static final String SERIALIZED_NAME_FOLIO = "folio";
  @SerializedName(SERIALIZED_NAME_FOLIO)
  private String folio;

  public static final String SERIALIZED_NAME_XML = "xml";
  @SerializedName(SERIALIZED_NAME_XML)
  private String xml;

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private InvoiceWarningsSat warnings;

  public static final String SERIALIZED_NAME_SENDER_BLACKLIST_STATUS = "sender_blacklist_status";
  @SerializedName(SERIALIZED_NAME_SENDER_BLACKLIST_STATUS)
  private String senderBlacklistStatus;

  public static final String SERIALIZED_NAME_RECEIVER_BLACKLIST_STATUS = "receiver_blacklist_status";
  @SerializedName(SERIALIZED_NAME_RECEIVER_BLACKLIST_STATUS)
  private String receiverBlacklistStatus;

  public InvoiceWithIdSat() {
  }

  public InvoiceWithIdSat version(String version) {

    
    
    
    
    this.version = version;
    return this;
  }

   /**
   * The CFDI version of the invoice. 
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3.3", value = "The CFDI version of the invoice. ")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {

    
    
    
    this.version = version;
  }


  public InvoiceWithIdSat id(UUID id) {

    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Belvo&#39;s unique identifier used to reference the current invoice.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "c749315b-eec2-435d-a458-06912878564f", value = "Belvo's unique identifier used to reference the current invoice.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {

    
    
    
    this.id = id;
  }


  public InvoiceWithIdSat link(String link) {

    
    
    
    
    this.link = link;
    return this;
  }

   /**
   * The &#x60;link.id&#x60; the invoice belongs to.
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30cb4806-6e00-48a4-91c9-ca55968576c8", value = "The `link.id` the invoice belongs to.")

  public String getLink() {
    return link;
  }


  public void setLink(String link) {

    
    
    
    this.link = link;
  }


  public InvoiceWithIdSat collectedAt(OffsetDateTime collectedAt) {

    
    
    
    
    this.collectedAt = collectedAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp when the data point was collected.
   * @return collectedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-09-27T13:01:41.941Z", required = true, value = "The ISO-8601 timestamp when the data point was collected.")

  public OffsetDateTime getCollectedAt() {
    return collectedAt;
  }


  public void setCollectedAt(OffsetDateTime collectedAt) {

    
    
    
    this.collectedAt = collectedAt;
  }


  public InvoiceWithIdSat createdAt(OffsetDateTime createdAt) {

    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp of when the data point was last updated in Belvo&#39;s database.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-02-09T08:45:50.406032Z", value = "The ISO-8601 timestamp of when the data point was last updated in Belvo's database.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {

    
    
    
    this.createdAt = createdAt;
  }


  public InvoiceWithIdSat invoiceIdentification(String invoiceIdentification) {

    
    
    
    
    this.invoiceIdentification = invoiceIdentification;
    return this;
  }

   /**
   * The fiscal institution&#39;s unique ID for the invoice.
   * @return invoiceIdentification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A1A1A1A1-2B2B-3C33-D44D-555555E55EE", required = true, value = "The fiscal institution's unique ID for the invoice.")

  public String getInvoiceIdentification() {
    return invoiceIdentification;
  }


  public void setInvoiceIdentification(String invoiceIdentification) {

    
    
    
    this.invoiceIdentification = invoiceIdentification;
  }


  public InvoiceWithIdSat invoiceDate(LocalDate invoiceDate) {

    
    
    
    
    this.invoiceDate = invoiceDate;
    return this;
  }

   /**
   * The date of the invoice.
   * @return invoiceDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sat Nov 30 16:00:00 PST 2019", required = true, value = "The date of the invoice.")

  public LocalDate getInvoiceDate() {
    return invoiceDate;
  }


  public void setInvoiceDate(LocalDate invoiceDate) {

    
    
    
    this.invoiceDate = invoiceDate;
  }


  public InvoiceWithIdSat status(String status) {

    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * The status of the invoice. Can be either *Vigente* (valid) or *Cancelado* (cancelled).
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Vigente", required = true, value = "The status of the invoice. Can be either *Vigente* (valid) or *Cancelado* (cancelled).")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {

    
    
    
    this.status = status;
  }


  public InvoiceWithIdSat invoiceType(EnumInvoiceSatInvoiceType invoiceType) {

    
    
    
    
    this.invoiceType = invoiceType;
    return this;
  }

   /**
   * Get invoiceType
   * @return invoiceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public EnumInvoiceSatInvoiceType getInvoiceType() {
    return invoiceType;
  }


  public void setInvoiceType(EnumInvoiceSatInvoiceType invoiceType) {

    
    
    
    this.invoiceType = invoiceType;
  }


  public InvoiceWithIdSat type(EnumInvoiceType type) {

    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public EnumInvoiceType getType() {
    return type;
  }


  public void setType(EnumInvoiceType type) {

    
    
    
    this.type = type;
  }


  public InvoiceWithIdSat senderId(String senderId) {

    
    
    
    
    this.senderId = senderId;
    return this;
  }

   /**
   * The fiscal ID of the invoice sender
   * @return senderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AAA111111AA11", required = true, value = "The fiscal ID of the invoice sender")

  public String getSenderId() {
    return senderId;
  }


  public void setSenderId(String senderId) {

    
    
    
    this.senderId = senderId;
  }


  public InvoiceWithIdSat senderName(String senderName) {

    
    
    
    
    this.senderName = senderName;
    return this;
  }

   /**
   * The name of the invoice sender.
   * @return senderName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ACME CORP", required = true, value = "The name of the invoice sender.")

  public String getSenderName() {
    return senderName;
  }


  public void setSenderName(String senderName) {

    
    
    
    this.senderName = senderName;
  }


  public InvoiceWithIdSat senderTaxFraudStatus(String senderTaxFraudStatus) {

    
    
    
    
    this.senderTaxFraudStatus = senderTaxFraudStatus;
    return this;
  }

   /**
   * Indicates whether or not the sender is on SAT&#39;s tax fraud list for having submitted incorrect data, having outstanding payments, or having conducted business that is in violation of the fiscal institution&#39;s regulations.&lt;br&gt;&lt;br&gt; SAT updates the tax fraud list every three months. &lt;br&gt;&lt;br&gt; For more information regarding the reason&#39;s a taxpayer can be put on the tax fraud list, please see [Article 69](http://omawww.sat.gob.mx/cifras_sat/Paginas/datos/vinculo.html?page&#x3D;ListCompleta69.html) and [Article 69-B](http://omawww.sat.gob.mx/cifras_sat/Paginas/datos/vinculo.html?page&#x3D;ListCompleta69B.html) of Mexico&#39;s Código Fiscal de la Federación. &lt;br&gt;&lt;br&gt; Possible statuses are: - &#x60;INVESTIGATING&#x60; &lt;br&gt; The fiscal institution has identified irregularities and open an investigation regarding the taxpayer. &lt;br&gt; - &#x60;DISMISSED&#x60; &lt;br&gt; The fiscal institution has investigated the taxpayer and declared them innocent. &lt;br&gt; - &#x60;CONFIRMED&#x60; &lt;br&gt; The fiscal institution has confirmed that the taxpayer is guilty. &lt;br&gt; - &#x60;OVERTURNED&#x60; &lt;br&gt; The fiscal institution has reassessed a previously confirmed taxpayer and, based on new evidence, has taken the taxpayer off the tax fraud list. &lt;br&gt; - &#x60;NO_TAX_FRAUD_STATUS&#x60; &lt;br&gt; The receiver or sender is not found in the list (in other words, they are complying with the fiscal institution&#39;s regulations).
   * @return senderTaxFraudStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NO_TAX_FRAUD_STATUS", value = "Indicates whether or not the sender is on SAT's tax fraud list for having submitted incorrect data, having outstanding payments, or having conducted business that is in violation of the fiscal institution's regulations.<br><br> SAT updates the tax fraud list every three months. <br><br> For more information regarding the reason's a taxpayer can be put on the tax fraud list, please see [Article 69](http://omawww.sat.gob.mx/cifras_sat/Paginas/datos/vinculo.html?page=ListCompleta69.html) and [Article 69-B](http://omawww.sat.gob.mx/cifras_sat/Paginas/datos/vinculo.html?page=ListCompleta69B.html) of Mexico's Código Fiscal de la Federación. <br><br> Possible statuses are: - `INVESTIGATING` <br> The fiscal institution has identified irregularities and open an investigation regarding the taxpayer. <br> - `DISMISSED` <br> The fiscal institution has investigated the taxpayer and declared them innocent. <br> - `CONFIRMED` <br> The fiscal institution has confirmed that the taxpayer is guilty. <br> - `OVERTURNED` <br> The fiscal institution has reassessed a previously confirmed taxpayer and, based on new evidence, has taken the taxpayer off the tax fraud list. <br> - `NO_TAX_FRAUD_STATUS` <br> The receiver or sender is not found in the list (in other words, they are complying with the fiscal institution's regulations).")

  public String getSenderTaxFraudStatus() {
    return senderTaxFraudStatus;
  }


  public void setSenderTaxFraudStatus(String senderTaxFraudStatus) {

    
    
    
    this.senderTaxFraudStatus = senderTaxFraudStatus;
  }


  public InvoiceWithIdSat receiverId(String receiverId) {

    
    
    
    
    this.receiverId = receiverId;
    return this;
  }

   /**
   * The fiscal ID of the invoice receiver.
   * @return receiverId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BBB222222BB22", required = true, value = "The fiscal ID of the invoice receiver.")

  public String getReceiverId() {
    return receiverId;
  }


  public void setReceiverId(String receiverId) {

    
    
    
    this.receiverId = receiverId;
  }


  public InvoiceWithIdSat receiverName(String receiverName) {

    
    
    
    
    this.receiverName = receiverName;
    return this;
  }

   /**
   * The name of the invoice receiver.
   * @return receiverName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BELVO CORP", required = true, value = "The name of the invoice receiver.")

  public String getReceiverName() {
    return receiverName;
  }


  public void setReceiverName(String receiverName) {

    
    
    
    this.receiverName = receiverName;
  }


  public InvoiceWithIdSat receiverTaxFraudStatus(String receiverTaxFraudStatus) {

    
    
    
    
    this.receiverTaxFraudStatus = receiverTaxFraudStatus;
    return this;
  }

   /**
   * Indicates whether or not the receiver is on SAT&#39;s tax fraud list for having submitted incorrect data, having outstanding payments, or having conducted business that is in violation of the fiscal institution&#39;s regulations.&lt;br&gt;&lt;br&gt; SAT updates the tax fraud list every three months. &lt;br&gt;&lt;br&gt; For more information regarding the reason&#39;s a taxpayer can be put on the tax fraud list, please see [Article 69](http://omawww.sat.gob.mx/cifras_sat/Paginas/datos/vinculo.html?page&#x3D;ListCompleta69.html) and [Article 69-B](http://omawww.sat.gob.mx/cifras_sat/Paginas/datos/vinculo.html?page&#x3D;ListCompleta69B.html) of Mexico&#39;s Código Fiscal de la Federación. &lt;br&gt;&lt;br&gt; Possible statuses are: - &#x60;INVESTIGATING&#x60; &lt;br&gt; The fiscal institution has identified irregularities and open an investigation regarding the taxpayer. &lt;br&gt; - &#x60;DISMISSED&#x60; &lt;br&gt; The fiscal institution has investigated the taxpayer and declared them innocent. &lt;br&gt; - &#x60;CONFIRMED&#x60; &lt;br&gt; The fiscal institution has confirmed that the taxpayer is guilty. &lt;br&gt; - &#x60;OVERTURNED&#x60; &lt;br&gt; The fiscal institution has reassessed a previously confirmed taxpayer and, based on new evidence, has taken the taxpayer off the tax fraud list. &lt;br&gt; - &#x60;NO_TAX_FRAUD_STATUS&#x60; &lt;br&gt; The receiver or sender is not found in the list (in other words, they are complying with the fiscal institution&#39;s regulations).
   * @return receiverTaxFraudStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NO_TAX_FRAUD_STATUS", value = "Indicates whether or not the receiver is on SAT's tax fraud list for having submitted incorrect data, having outstanding payments, or having conducted business that is in violation of the fiscal institution's regulations.<br><br> SAT updates the tax fraud list every three months. <br><br> For more information regarding the reason's a taxpayer can be put on the tax fraud list, please see [Article 69](http://omawww.sat.gob.mx/cifras_sat/Paginas/datos/vinculo.html?page=ListCompleta69.html) and [Article 69-B](http://omawww.sat.gob.mx/cifras_sat/Paginas/datos/vinculo.html?page=ListCompleta69B.html) of Mexico's Código Fiscal de la Federación. <br><br> Possible statuses are: - `INVESTIGATING` <br> The fiscal institution has identified irregularities and open an investigation regarding the taxpayer. <br> - `DISMISSED` <br> The fiscal institution has investigated the taxpayer and declared them innocent. <br> - `CONFIRMED` <br> The fiscal institution has confirmed that the taxpayer is guilty. <br> - `OVERTURNED` <br> The fiscal institution has reassessed a previously confirmed taxpayer and, based on new evidence, has taken the taxpayer off the tax fraud list. <br> - `NO_TAX_FRAUD_STATUS` <br> The receiver or sender is not found in the list (in other words, they are complying with the fiscal institution's regulations).")

  public String getReceiverTaxFraudStatus() {
    return receiverTaxFraudStatus;
  }


  public void setReceiverTaxFraudStatus(String receiverTaxFraudStatus) {

    
    
    
    this.receiverTaxFraudStatus = receiverTaxFraudStatus;
  }


  public InvoiceWithIdSat cancelationStatus(String cancelationStatus) {

    
    
    
    
    this.cancelationStatus = cancelationStatus;
    return this;
  }

   /**
   * If the invoice is cancelled, this field indicates the status of the cancellation.
   * @return cancelationStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "If the invoice is cancelled, this field indicates the status of the cancellation.")

  public String getCancelationStatus() {
    return cancelationStatus;
  }


  public void setCancelationStatus(String cancelationStatus) {

    
    
    
    this.cancelationStatus = cancelationStatus;
  }


  public InvoiceWithIdSat cancelationUpdateDate(LocalDate cancelationUpdateDate) {

    
    
    
    
    this.cancelationUpdateDate = cancelationUpdateDate;
    return this;
  }

   /**
   * The date of the invoice cancelation. 
   * @return cancelationUpdateDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sun Dec 01 16:00:00 PST 2019", required = true, value = "The date of the invoice cancelation. ")

  public LocalDate getCancelationUpdateDate() {
    return cancelationUpdateDate;
  }


  public void setCancelationUpdateDate(LocalDate cancelationUpdateDate) {

    
    
    
    this.cancelationUpdateDate = cancelationUpdateDate;
  }


  public InvoiceWithIdSat certificationDate(LocalDate certificationDate) {

    
    
    
    
    this.certificationDate = certificationDate;
    return this;
  }

   /**
   * The date of the fiscal certification. 
   * @return certificationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sat Nov 30 16:00:00 PST 2019", required = true, value = "The date of the fiscal certification. ")

  public LocalDate getCertificationDate() {
    return certificationDate;
  }


  public void setCertificationDate(LocalDate certificationDate) {

    
    
    
    this.certificationDate = certificationDate;
  }


  public InvoiceWithIdSat certificationAuthority(String certificationAuthority) {

    
    
    
    
    this.certificationAuthority = certificationAuthority;
    return this;
  }

   /**
   * The fiscal ID of the certification provider. 
   * @return certificationAuthority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CCC333333CC33", required = true, value = "The fiscal ID of the certification provider. ")

  public String getCertificationAuthority() {
    return certificationAuthority;
  }


  public void setCertificationAuthority(String certificationAuthority) {

    
    
    
    this.certificationAuthority = certificationAuthority;
  }


  public InvoiceWithIdSat paymentType(String paymentType) {

    
    
    
    
    this.paymentType = paymentType;
    return this;
  }

   /**
   * The payment type code used for this invoice, as defined by the country legal entity.  - 🇲🇽 Mexico [SAT catalog reference article](https://developers.belvo.com/docs/sat-catalogs#payment-type) 
   * @return paymentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "99", required = true, value = "The payment type code used for this invoice, as defined by the country legal entity.  - 🇲🇽 Mexico [SAT catalog reference article](https://developers.belvo.com/docs/sat-catalogs#payment-type) ")

  public String getPaymentType() {
    return paymentType;
  }


  public void setPaymentType(String paymentType) {

    
    
    
    this.paymentType = paymentType;
  }


  public InvoiceWithIdSat paymentTypeDescription(String paymentTypeDescription) {

    
    
    
    
    this.paymentTypeDescription = paymentTypeDescription;
    return this;
  }

   /**
   * *This field has been deprecated.* 
   * @return paymentTypeDescription
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "*This field has been deprecated.* ")

  public String getPaymentTypeDescription() {
    return paymentTypeDescription;
  }


  public void setPaymentTypeDescription(String paymentTypeDescription) {

    
    
    
    this.paymentTypeDescription = paymentTypeDescription;
  }


  public InvoiceWithIdSat paymentMethod(EnumInvoiceSatPaymentMethod paymentMethod) {

    
    
    
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumInvoiceSatPaymentMethod getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(EnumInvoiceSatPaymentMethod paymentMethod) {

    
    
    
    this.paymentMethod = paymentMethod;
  }


  public InvoiceWithIdSat paymentMethodDescription(String paymentMethodDescription) {

    
    
    
    
    this.paymentMethodDescription = paymentMethodDescription;
    return this;
  }

   /**
   * *This field has been deprecated.*  *The description of the payment method used for this invoice.* 
   * @return paymentMethodDescription
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "*This field has been deprecated.*  *The description of the payment method used for this invoice.* ")

  public String getPaymentMethodDescription() {
    return paymentMethodDescription;
  }


  public void setPaymentMethodDescription(String paymentMethodDescription) {

    
    
    
    this.paymentMethodDescription = paymentMethodDescription;
  }


  public InvoiceWithIdSat usage(String usage) {

    
    
    
    
    this.usage = usage;
    return this;
  }

   /**
   * The invoice&#39;s usage code, as defined by the legal entity of the country.   - 🇲🇽 Mexico [SAT catalog reference article](https://developers.belvo.com/docs/sat-catalogs#usage) 
   * @return usage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "P01", value = "The invoice's usage code, as defined by the legal entity of the country.   - 🇲🇽 Mexico [SAT catalog reference article](https://developers.belvo.com/docs/sat-catalogs#usage) ")

  public String getUsage() {
    return usage;
  }


  public void setUsage(String usage) {

    
    
    
    this.usage = usage;
  }


  public InvoiceWithIdSat placeOfIssue(String placeOfIssue) {

    
    
    
    
    this.placeOfIssue = placeOfIssue;
    return this;
  }

   /**
   * The postcode of where the invoice was issued. 
   * @return placeOfIssue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "01165", value = "The postcode of where the invoice was issued. ")

  public String getPlaceOfIssue() {
    return placeOfIssue;
  }


  public void setPlaceOfIssue(String placeOfIssue) {

    
    
    
    this.placeOfIssue = placeOfIssue;
  }


  public InvoiceWithIdSat invoiceDetails(List<InvoiceDetailSat> invoiceDetails) {

    
    
    
    
    this.invoiceDetails = invoiceDetails;
    return this;
  }

  public InvoiceWithIdSat addInvoiceDetailsItem(InvoiceDetailSat invoiceDetailsItem) {
    this.invoiceDetails.add(invoiceDetailsItem);
    return this;
  }

   /**
   * A list of descriptions for each item (purchased product or service provided) in the invoice. 
   * @return invoiceDetails
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of descriptions for each item (purchased product or service provided) in the invoice. ")

  public List<InvoiceDetailSat> getInvoiceDetails() {
    return invoiceDetails;
  }


  public void setInvoiceDetails(List<InvoiceDetailSat> invoiceDetails) {

    
    
    
    this.invoiceDetails = invoiceDetails;
  }


  public InvoiceWithIdSat currency(String currency) {

    
    
    
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency of the invoice. For example:    - 🇧🇷 BRL (Brazilian Real)  - 🇨🇴 COP (Colombian Peso)  - 🇲🇽 MXN (Mexican Peso)  - 🇺🇸 USD (United States Dollar) 
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MXN", required = true, value = "The currency of the invoice. For example:    - 🇧🇷 BRL (Brazilian Real)  - 🇨🇴 COP (Colombian Peso)  - 🇲🇽 MXN (Mexican Peso)  - 🇺🇸 USD (United States Dollar) ")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {

    
    
    
    this.currency = currency;
  }


  public InvoiceWithIdSat subtotalAmount(Float subtotalAmount) {

    
    
    
    
    this.subtotalAmount = subtotalAmount;
    return this;
  }

   /**
   * The pretax amount of this invoice (sum of each item&#39;s &#x60;pre_tax_amount&#x60;). 
   * @return subtotalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "400", required = true, value = "The pretax amount of this invoice (sum of each item's `pre_tax_amount`). ")

  public Float getSubtotalAmount() {
    return subtotalAmount;
  }


  public void setSubtotalAmount(Float subtotalAmount) {

    
    
    
    this.subtotalAmount = subtotalAmount;
  }


  public InvoiceWithIdSat exchangeRate(Float exchangeRate) {

    
    
    
    
    this.exchangeRate = exchangeRate;
    return this;
  }

   /**
   * The exchange rate used in this invoice for the currency. 
   * @return exchangeRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.052", required = true, value = "The exchange rate used in this invoice for the currency. ")

  public Float getExchangeRate() {
    return exchangeRate;
  }


  public void setExchangeRate(Float exchangeRate) {

    
    
    
    this.exchangeRate = exchangeRate;
  }


  public InvoiceWithIdSat taxAmount(Float taxAmount) {

    
    
    
    
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * The amount of tax for this invoice (sum of each item&#39;s &#x60;tax_amount&#x60;). 
   * @return taxAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "64", required = true, value = "The amount of tax for this invoice (sum of each item's `tax_amount`). ")

  public Float getTaxAmount() {
    return taxAmount;
  }


  public void setTaxAmount(Float taxAmount) {

    
    
    
    this.taxAmount = taxAmount;
  }


  public InvoiceWithIdSat discountAmount(Float discountAmount) {

    
    
    
    
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * The total amount discounted in this invoice. 
   * @return discountAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", required = true, value = "The total amount discounted in this invoice. ")

  public Float getDiscountAmount() {
    return discountAmount;
  }


  public void setDiscountAmount(Float discountAmount) {

    
    
    
    this.discountAmount = discountAmount;
  }


  public InvoiceWithIdSat totalAmount(Float totalAmount) {

    
    
    
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * The total amount of the invoice (&#x60;subtotal_amount&#x60; + &#x60;tax_amount&#x60; - &#x60;discount_amount&#x60;)
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "454", required = true, value = "The total amount of the invoice (`subtotal_amount` + `tax_amount` - `discount_amount`)")

  public Float getTotalAmount() {
    return totalAmount;
  }


  public void setTotalAmount(Float totalAmount) {

    
    
    
    this.totalAmount = totalAmount;
  }


  public InvoiceWithIdSat payments(List<InvoicesPaymentsSat> payments) {

    
    
    
    
    this.payments = payments;
    return this;
  }

  public InvoiceWithIdSat addPaymentsItem(InvoicesPaymentsSat paymentsItem) {
    this.payments.add(paymentsItem);
    return this;
  }

   /**
   * A list detailing all the invoice payments. 
   * @return payments
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list detailing all the invoice payments. ")

  public List<InvoicesPaymentsSat> getPayments() {
    return payments;
  }


  public void setPayments(List<InvoicesPaymentsSat> payments) {

    
    
    
    this.payments = payments;
  }


  public InvoiceWithIdSat payroll(InvoicesPayrollSat payroll) {

    
    
    
    
    this.payroll = payroll;
    return this;
  }

   /**
   * Get payroll
   * @return payroll
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public InvoicesPayrollSat getPayroll() {
    return payroll;
  }


  public void setPayroll(InvoicesPayrollSat payroll) {

    
    
    
    this.payroll = payroll;
  }


  public InvoiceWithIdSat folio(String folio) {

    
    
    
    
    this.folio = folio;
    return this;
  }

   /**
   * The internal control number that the taxpayer assigns to the invoice. 
   * @return folio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "26", value = "The internal control number that the taxpayer assigns to the invoice. ")

  public String getFolio() {
    return folio;
  }


  public void setFolio(String folio) {

    
    
    
    this.folio = folio;
  }


  public InvoiceWithIdSat xml(String xml) {

    
    
    
    
    this.xml = xml;
    return this;
  }

   /**
   * XML of the invoice document. 
   * @return xml
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "XML of the invoice document. ")

  public String getXml() {
    return xml;
  }


  public void setXml(String xml) {

    
    
    
    this.xml = xml;
  }


  public InvoiceWithIdSat warnings(InvoiceWarningsSat warnings) {

    
    
    
    
    this.warnings = warnings;
    return this;
  }

   /**
   * Get warnings
   * @return warnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InvoiceWarningsSat getWarnings() {
    return warnings;
  }


  public void setWarnings(InvoiceWarningsSat warnings) {

    
    
    
    this.warnings = warnings;
  }


  public InvoiceWithIdSat senderBlacklistStatus(String senderBlacklistStatus) {

    
    
    
    
    this.senderBlacklistStatus = senderBlacklistStatus;
    return this;
  }

   /**
   * This field has been deprecated. Please use &#x60;sender_tax_fraud_status&#x60; instead. 
   * @return senderBlacklistStatus
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has been deprecated. Please use `sender_tax_fraud_status` instead. ")

  public String getSenderBlacklistStatus() {
    return senderBlacklistStatus;
  }


  public void setSenderBlacklistStatus(String senderBlacklistStatus) {

    
    
    
    this.senderBlacklistStatus = senderBlacklistStatus;
  }


  public InvoiceWithIdSat receiverBlacklistStatus(String receiverBlacklistStatus) {

    
    
    
    
    this.receiverBlacklistStatus = receiverBlacklistStatus;
    return this;
  }

   /**
   * This field has been deprecated. Please use &#x60;receiver_tax_fraud_status&#x60; instead. 
   * @return receiverBlacklistStatus
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has been deprecated. Please use `receiver_tax_fraud_status` instead. ")

  public String getReceiverBlacklistStatus() {
    return receiverBlacklistStatus;
  }


  public void setReceiverBlacklistStatus(String receiverBlacklistStatus) {

    
    
    
    this.receiverBlacklistStatus = receiverBlacklistStatus;
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
   * @return the InvoiceWithIdSat instance itself
   */
  public InvoiceWithIdSat putAdditionalProperty(String key, Object value) {
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
    InvoiceWithIdSat invoiceWithIdSat = (InvoiceWithIdSat) o;
    return Objects.equals(this.version, invoiceWithIdSat.version) &&
        Objects.equals(this.id, invoiceWithIdSat.id) &&
        Objects.equals(this.link, invoiceWithIdSat.link) &&
        Objects.equals(this.collectedAt, invoiceWithIdSat.collectedAt) &&
        Objects.equals(this.createdAt, invoiceWithIdSat.createdAt) &&
        Objects.equals(this.invoiceIdentification, invoiceWithIdSat.invoiceIdentification) &&
        Objects.equals(this.invoiceDate, invoiceWithIdSat.invoiceDate) &&
        Objects.equals(this.status, invoiceWithIdSat.status) &&
        Objects.equals(this.invoiceType, invoiceWithIdSat.invoiceType) &&
        Objects.equals(this.type, invoiceWithIdSat.type) &&
        Objects.equals(this.senderId, invoiceWithIdSat.senderId) &&
        Objects.equals(this.senderName, invoiceWithIdSat.senderName) &&
        Objects.equals(this.senderTaxFraudStatus, invoiceWithIdSat.senderTaxFraudStatus) &&
        Objects.equals(this.receiverId, invoiceWithIdSat.receiverId) &&
        Objects.equals(this.receiverName, invoiceWithIdSat.receiverName) &&
        Objects.equals(this.receiverTaxFraudStatus, invoiceWithIdSat.receiverTaxFraudStatus) &&
        Objects.equals(this.cancelationStatus, invoiceWithIdSat.cancelationStatus) &&
        Objects.equals(this.cancelationUpdateDate, invoiceWithIdSat.cancelationUpdateDate) &&
        Objects.equals(this.certificationDate, invoiceWithIdSat.certificationDate) &&
        Objects.equals(this.certificationAuthority, invoiceWithIdSat.certificationAuthority) &&
        Objects.equals(this.paymentType, invoiceWithIdSat.paymentType) &&
        Objects.equals(this.paymentTypeDescription, invoiceWithIdSat.paymentTypeDescription) &&
        Objects.equals(this.paymentMethod, invoiceWithIdSat.paymentMethod) &&
        Objects.equals(this.paymentMethodDescription, invoiceWithIdSat.paymentMethodDescription) &&
        Objects.equals(this.usage, invoiceWithIdSat.usage) &&
        Objects.equals(this.placeOfIssue, invoiceWithIdSat.placeOfIssue) &&
        Objects.equals(this.invoiceDetails, invoiceWithIdSat.invoiceDetails) &&
        Objects.equals(this.currency, invoiceWithIdSat.currency) &&
        Objects.equals(this.subtotalAmount, invoiceWithIdSat.subtotalAmount) &&
        Objects.equals(this.exchangeRate, invoiceWithIdSat.exchangeRate) &&
        Objects.equals(this.taxAmount, invoiceWithIdSat.taxAmount) &&
        Objects.equals(this.discountAmount, invoiceWithIdSat.discountAmount) &&
        Objects.equals(this.totalAmount, invoiceWithIdSat.totalAmount) &&
        Objects.equals(this.payments, invoiceWithIdSat.payments) &&
        Objects.equals(this.payroll, invoiceWithIdSat.payroll) &&
        Objects.equals(this.folio, invoiceWithIdSat.folio) &&
        Objects.equals(this.xml, invoiceWithIdSat.xml) &&
        Objects.equals(this.warnings, invoiceWithIdSat.warnings) &&
        Objects.equals(this.senderBlacklistStatus, invoiceWithIdSat.senderBlacklistStatus) &&
        Objects.equals(this.receiverBlacklistStatus, invoiceWithIdSat.receiverBlacklistStatus)&&
        Objects.equals(this.additionalProperties, invoiceWithIdSat.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, id, link, collectedAt, createdAt, invoiceIdentification, invoiceDate, status, invoiceType, type, senderId, senderName, senderTaxFraudStatus, receiverId, receiverName, receiverTaxFraudStatus, cancelationStatus, cancelationUpdateDate, certificationDate, certificationAuthority, paymentType, paymentTypeDescription, paymentMethod, paymentMethodDescription, usage, placeOfIssue, invoiceDetails, currency, subtotalAmount, exchangeRate, taxAmount, discountAmount, totalAmount, payments, payroll, folio, xml, warnings, senderBlacklistStatus, receiverBlacklistStatus, additionalProperties);
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
    sb.append("class InvoiceWithIdSat {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    collectedAt: ").append(toIndentedString(collectedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    invoiceIdentification: ").append(toIndentedString(invoiceIdentification)).append("\n");
    sb.append("    invoiceDate: ").append(toIndentedString(invoiceDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    invoiceType: ").append(toIndentedString(invoiceType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
    sb.append("    senderName: ").append(toIndentedString(senderName)).append("\n");
    sb.append("    senderTaxFraudStatus: ").append(toIndentedString(senderTaxFraudStatus)).append("\n");
    sb.append("    receiverId: ").append(toIndentedString(receiverId)).append("\n");
    sb.append("    receiverName: ").append(toIndentedString(receiverName)).append("\n");
    sb.append("    receiverTaxFraudStatus: ").append(toIndentedString(receiverTaxFraudStatus)).append("\n");
    sb.append("    cancelationStatus: ").append(toIndentedString(cancelationStatus)).append("\n");
    sb.append("    cancelationUpdateDate: ").append(toIndentedString(cancelationUpdateDate)).append("\n");
    sb.append("    certificationDate: ").append(toIndentedString(certificationDate)).append("\n");
    sb.append("    certificationAuthority: ").append(toIndentedString(certificationAuthority)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    paymentTypeDescription: ").append(toIndentedString(paymentTypeDescription)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    paymentMethodDescription: ").append(toIndentedString(paymentMethodDescription)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    placeOfIssue: ").append(toIndentedString(placeOfIssue)).append("\n");
    sb.append("    invoiceDetails: ").append(toIndentedString(invoiceDetails)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    subtotalAmount: ").append(toIndentedString(subtotalAmount)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    payroll: ").append(toIndentedString(payroll)).append("\n");
    sb.append("    folio: ").append(toIndentedString(folio)).append("\n");
    sb.append("    xml: ").append(toIndentedString(xml)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    senderBlacklistStatus: ").append(toIndentedString(senderBlacklistStatus)).append("\n");
    sb.append("    receiverBlacklistStatus: ").append(toIndentedString(receiverBlacklistStatus)).append("\n");
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
    openapiFields.add("invoice_date");
    openapiFields.add("status");
    openapiFields.add("invoice_type");
    openapiFields.add("type");
    openapiFields.add("sender_id");
    openapiFields.add("sender_name");
    openapiFields.add("sender_tax_fraud_status");
    openapiFields.add("receiver_id");
    openapiFields.add("receiver_name");
    openapiFields.add("receiver_tax_fraud_status");
    openapiFields.add("cancelation_status");
    openapiFields.add("cancelation_update_date");
    openapiFields.add("certification_date");
    openapiFields.add("certification_authority");
    openapiFields.add("payment_type");
    openapiFields.add("payment_type_description");
    openapiFields.add("payment_method");
    openapiFields.add("payment_method_description");
    openapiFields.add("usage");
    openapiFields.add("place_of_issue");
    openapiFields.add("invoice_details");
    openapiFields.add("currency");
    openapiFields.add("subtotal_amount");
    openapiFields.add("exchange_rate");
    openapiFields.add("tax_amount");
    openapiFields.add("discount_amount");
    openapiFields.add("total_amount");
    openapiFields.add("payments");
    openapiFields.add("payroll");
    openapiFields.add("folio");
    openapiFields.add("xml");
    openapiFields.add("warnings");
    openapiFields.add("sender_blacklist_status");
    openapiFields.add("receiver_blacklist_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("collected_at");
    openapiRequiredFields.add("invoice_identification");
    openapiRequiredFields.add("invoice_date");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("invoice_type");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("sender_id");
    openapiRequiredFields.add("sender_name");
    openapiRequiredFields.add("receiver_id");
    openapiRequiredFields.add("receiver_name");
    openapiRequiredFields.add("cancelation_status");
    openapiRequiredFields.add("cancelation_update_date");
    openapiRequiredFields.add("certification_date");
    openapiRequiredFields.add("certification_authority");
    openapiRequiredFields.add("payment_type");
    openapiRequiredFields.add("payment_type_description");
    openapiRequiredFields.add("invoice_details");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("subtotal_amount");
    openapiRequiredFields.add("exchange_rate");
    openapiRequiredFields.add("tax_amount");
    openapiRequiredFields.add("discount_amount");
    openapiRequiredFields.add("total_amount");
    openapiRequiredFields.add("payments");
    openapiRequiredFields.add("payroll");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InvoiceWithIdSat
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InvoiceWithIdSat.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoiceWithIdSat is not found in the empty JSON string", InvoiceWithIdSat.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InvoiceWithIdSat.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("version").isJsonNull() && (jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
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
      if (!jsonObj.get("status").isJsonNull() && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (!jsonObj.get("sender_id").isJsonNull() && !jsonObj.get("sender_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sender_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sender_id").toString()));
      }
      if (!jsonObj.get("sender_name").isJsonNull() && !jsonObj.get("sender_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sender_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sender_name").toString()));
      }
      if (!jsonObj.get("sender_tax_fraud_status").isJsonNull() && (jsonObj.get("sender_tax_fraud_status") != null && !jsonObj.get("sender_tax_fraud_status").isJsonNull()) && !jsonObj.get("sender_tax_fraud_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sender_tax_fraud_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sender_tax_fraud_status").toString()));
      }
      if (!jsonObj.get("receiver_id").isJsonNull() && !jsonObj.get("receiver_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `receiver_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("receiver_id").toString()));
      }
      if (!jsonObj.get("receiver_name").isJsonNull() && !jsonObj.get("receiver_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `receiver_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("receiver_name").toString()));
      }
      if (!jsonObj.get("receiver_tax_fraud_status").isJsonNull() && (jsonObj.get("receiver_tax_fraud_status") != null && !jsonObj.get("receiver_tax_fraud_status").isJsonNull()) && !jsonObj.get("receiver_tax_fraud_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `receiver_tax_fraud_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("receiver_tax_fraud_status").toString()));
      }
      if (!jsonObj.get("cancelation_status").isJsonNull() && !jsonObj.get("cancelation_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cancelation_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cancelation_status").toString()));
      }
      if (!jsonObj.get("certification_authority").isJsonNull() && !jsonObj.get("certification_authority").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certification_authority` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certification_authority").toString()));
      }
      if (!jsonObj.get("payment_type").isJsonNull() && !jsonObj.get("payment_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_type").toString()));
      }
      if (!jsonObj.get("payment_type_description").isJsonNull() && !jsonObj.get("payment_type_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_type_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_type_description").toString()));
      }
      if (!jsonObj.get("payment_method_description").isJsonNull() && (jsonObj.get("payment_method_description") != null && !jsonObj.get("payment_method_description").isJsonNull()) && !jsonObj.get("payment_method_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_method_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_method_description").toString()));
      }
      if (!jsonObj.get("usage").isJsonNull() && (jsonObj.get("usage") != null && !jsonObj.get("usage").isJsonNull()) && !jsonObj.get("usage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `usage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("usage").toString()));
      }
      if (!jsonObj.get("place_of_issue").isJsonNull() && (jsonObj.get("place_of_issue") != null && !jsonObj.get("place_of_issue").isJsonNull()) && !jsonObj.get("place_of_issue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `place_of_issue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("place_of_issue").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("invoice_details").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_details` to be an array in the JSON string but got `%s`", jsonObj.get("invoice_details").toString()));
      }

      JsonArray jsonArrayinvoiceDetails = jsonObj.getAsJsonArray("invoice_details");
      // validate the required field `invoice_details` (array)
      for (int i = 0; i < jsonArrayinvoiceDetails.size(); i++) {
        InvoiceDetailSat.validateJsonObject(jsonArrayinvoiceDetails.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("currency").isJsonNull() && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("payments").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `payments` to be an array in the JSON string but got `%s`", jsonObj.get("payments").toString()));
      }

      JsonArray jsonArraypayments = jsonObj.getAsJsonArray("payments");
      // validate the required field `payments` (array)
      for (int i = 0; i < jsonArraypayments.size(); i++) {
        InvoicesPaymentsSat.validateJsonObject(jsonArraypayments.get(i).getAsJsonObject());
      };
      // validate the required field `payroll`
      InvoicesPayrollSat.validateJsonObject(jsonObj.getAsJsonObject("payroll"));
      if (!jsonObj.get("folio").isJsonNull() && (jsonObj.get("folio") != null && !jsonObj.get("folio").isJsonNull()) && !jsonObj.get("folio").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `folio` to be a primitive type in the JSON string but got `%s`", jsonObj.get("folio").toString()));
      }
      if (!jsonObj.get("xml").isJsonNull() && (jsonObj.get("xml") != null && !jsonObj.get("xml").isJsonNull()) && !jsonObj.get("xml").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xml` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xml").toString()));
      }
      // validate the optional field `warnings`
      if (jsonObj.get("warnings") != null && !jsonObj.get("warnings").isJsonNull()) {
        InvoiceWarningsSat.validateJsonObject(jsonObj.getAsJsonObject("warnings"));
      }
      if (!jsonObj.get("sender_blacklist_status").isJsonNull() && (jsonObj.get("sender_blacklist_status") != null && !jsonObj.get("sender_blacklist_status").isJsonNull()) && !jsonObj.get("sender_blacklist_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sender_blacklist_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sender_blacklist_status").toString()));
      }
      if (!jsonObj.get("receiver_blacklist_status").isJsonNull() && (jsonObj.get("receiver_blacklist_status") != null && !jsonObj.get("receiver_blacklist_status").isJsonNull()) && !jsonObj.get("receiver_blacklist_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `receiver_blacklist_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("receiver_blacklist_status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoiceWithIdSat.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoiceWithIdSat' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoiceWithIdSat> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoiceWithIdSat.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoiceWithIdSat>() {
           @Override
           public void write(JsonWriter out, InvoiceWithIdSat value) throws IOException {
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
           public InvoiceWithIdSat read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             InvoiceWithIdSat instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of InvoiceWithIdSat given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvoiceWithIdSat
  * @throws IOException if the JSON string is invalid with respect to InvoiceWithIdSat
  */
  public static InvoiceWithIdSat fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoiceWithIdSat.class);
  }

 /**
  * Convert an instance of InvoiceWithIdSat to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

