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
import com.belvo.client.model.AnnualCostsAndDeductionsStatementBusiness;
import com.belvo.client.model.AnnualIncomeStatementBusiness;
import com.belvo.client.model.DocumentInformationBusiness;
import com.belvo.client.model.EquityStatementBusiness;
import com.belvo.client.model.TaxAssessmentBusiness;
import com.belvo.client.model.TaxPayerInformationBusiness;
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
 * TaxDeclarationBusiness
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TaxDeclarationBusiness {
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

  public static final String SERIALIZED_NAME_DOCUMENT_INFORMATION = "document_information";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_INFORMATION)
  private DocumentInformationBusiness documentInformation;

  public static final String SERIALIZED_NAME_TAX_PAYER_INFORMATION = "tax_payer_information";
  @SerializedName(SERIALIZED_NAME_TAX_PAYER_INFORMATION)
  private TaxPayerInformationBusiness taxPayerInformation;

  public static final String SERIALIZED_NAME_EQUITY_STATEMENT = "equity_statement";
  @SerializedName(SERIALIZED_NAME_EQUITY_STATEMENT)
  private EquityStatementBusiness equityStatement;

  public static final String SERIALIZED_NAME_ANNUAL_INCOME_STATEMENT = "annual_income_statement";
  @SerializedName(SERIALIZED_NAME_ANNUAL_INCOME_STATEMENT)
  private AnnualIncomeStatementBusiness annualIncomeStatement;

  public static final String SERIALIZED_NAME_ANNUAL_COSTS_AND_DEDUCTIONS_STATEMENT = "annual_costs_and_deductions_statement";
  @SerializedName(SERIALIZED_NAME_ANNUAL_COSTS_AND_DEDUCTIONS_STATEMENT)
  private AnnualCostsAndDeductionsStatementBusiness annualCostsAndDeductionsStatement;

  public static final String SERIALIZED_NAME_TAX_ASSESSMENT = "tax_assessment";
  @SerializedName(SERIALIZED_NAME_TAX_ASSESSMENT)
  private TaxAssessmentBusiness taxAssessment;

  public static final String SERIALIZED_NAME_DATE_ISSUED = "date_issued";
  @SerializedName(SERIALIZED_NAME_DATE_ISSUED)
  private LocalDate dateIssued;

  public static final String SERIALIZED_NAME_PDF = "pdf";
  @SerializedName(SERIALIZED_NAME_PDF)
  private String pdf;

  public TaxDeclarationBusiness() {
  }

  public TaxDeclarationBusiness id(UUID id) {
    
    
    this.id = id;
    return this;
  }

   /**
   * Belvo&#39;s unique ID for the current tax declaration.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1c83ead8-6665-429c-a17a-ddc76cb3a95e", required = true, value = "Belvo's unique ID for the current tax declaration.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    
    this.id = id;
  }


  public TaxDeclarationBusiness link(UUID link) {
    
    
    this.link = link;
    return this;
  }

   /**
   * Belvo&#39;s unique ID of the user that this tax declaration is associated with.
   * @return link
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "8a95ca1a-1a7a-4ce0-8599-f8ff1dc792ac", required = true, value = "Belvo's unique ID of the user that this tax declaration is associated with.")

  public UUID getLink() {
    return link;
  }


  public void setLink(UUID link) {
    
    this.link = link;
  }


  public TaxDeclarationBusiness collectedAt(OffsetDateTime collectedAt) {
    
    
    this.collectedAt = collectedAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp when the data point was collected.
   * @return collectedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2020-04-23T21:32:55.336854Z", required = true, value = "The ISO-8601 timestamp when the data point was collected.")

  public OffsetDateTime getCollectedAt() {
    return collectedAt;
  }


  public void setCollectedAt(OffsetDateTime collectedAt) {
    
    this.collectedAt = collectedAt;
  }


  public TaxDeclarationBusiness createdAt(OffsetDateTime createdAt) {
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp of when the data point was last updated in Belvo&#39;s database.
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2020-04-23T21:30:20.336854Z", required = true, value = "The ISO-8601 timestamp of when the data point was last updated in Belvo's database.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
  }


  public TaxDeclarationBusiness documentInformation(DocumentInformationBusiness documentInformation) {
    
    
    this.documentInformation = documentInformation;
    return this;
  }

   /**
   * Get documentInformation
   * @return documentInformation
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DocumentInformationBusiness getDocumentInformation() {
    return documentInformation;
  }


  public void setDocumentInformation(DocumentInformationBusiness documentInformation) {
    
    this.documentInformation = documentInformation;
  }


  public TaxDeclarationBusiness taxPayerInformation(TaxPayerInformationBusiness taxPayerInformation) {
    
    
    this.taxPayerInformation = taxPayerInformation;
    return this;
  }

   /**
   * Get taxPayerInformation
   * @return taxPayerInformation
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TaxPayerInformationBusiness getTaxPayerInformation() {
    return taxPayerInformation;
  }


  public void setTaxPayerInformation(TaxPayerInformationBusiness taxPayerInformation) {
    
    this.taxPayerInformation = taxPayerInformation;
  }


  public TaxDeclarationBusiness equityStatement(EquityStatementBusiness equityStatement) {
    
    
    this.equityStatement = equityStatement;
    return this;
  }

   /**
   * Get equityStatement
   * @return equityStatement
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EquityStatementBusiness getEquityStatement() {
    return equityStatement;
  }


  public void setEquityStatement(EquityStatementBusiness equityStatement) {
    
    this.equityStatement = equityStatement;
  }


  public TaxDeclarationBusiness annualIncomeStatement(AnnualIncomeStatementBusiness annualIncomeStatement) {
    
    
    this.annualIncomeStatement = annualIncomeStatement;
    return this;
  }

   /**
   * Get annualIncomeStatement
   * @return annualIncomeStatement
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AnnualIncomeStatementBusiness getAnnualIncomeStatement() {
    return annualIncomeStatement;
  }


  public void setAnnualIncomeStatement(AnnualIncomeStatementBusiness annualIncomeStatement) {
    
    this.annualIncomeStatement = annualIncomeStatement;
  }


  public TaxDeclarationBusiness annualCostsAndDeductionsStatement(AnnualCostsAndDeductionsStatementBusiness annualCostsAndDeductionsStatement) {
    
    
    this.annualCostsAndDeductionsStatement = annualCostsAndDeductionsStatement;
    return this;
  }

   /**
   * Get annualCostsAndDeductionsStatement
   * @return annualCostsAndDeductionsStatement
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AnnualCostsAndDeductionsStatementBusiness getAnnualCostsAndDeductionsStatement() {
    return annualCostsAndDeductionsStatement;
  }


  public void setAnnualCostsAndDeductionsStatement(AnnualCostsAndDeductionsStatementBusiness annualCostsAndDeductionsStatement) {
    
    this.annualCostsAndDeductionsStatement = annualCostsAndDeductionsStatement;
  }


  public TaxDeclarationBusiness taxAssessment(TaxAssessmentBusiness taxAssessment) {
    
    
    this.taxAssessment = taxAssessment;
    return this;
  }

   /**
   * Get taxAssessment
   * @return taxAssessment
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TaxAssessmentBusiness getTaxAssessment() {
    return taxAssessment;
  }


  public void setTaxAssessment(TaxAssessmentBusiness taxAssessment) {
    
    this.taxAssessment = taxAssessment;
  }


  public TaxDeclarationBusiness dateIssued(LocalDate dateIssued) {
    
    
    this.dateIssued = dateIssued;
    return this;
  }

   /**
   * The date the tax declaration was issued by the fiscal institution.
   * @return dateIssued
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Thu Sep 01 17:00:00 PDT 2022", required = true, value = "The date the tax declaration was issued by the fiscal institution.")

  public LocalDate getDateIssued() {
    return dateIssued;
  }


  public void setDateIssued(LocalDate dateIssued) {
    
    this.dateIssued = dateIssued;
  }


  public TaxDeclarationBusiness pdf(String pdf) {
    
    
    this.pdf = pdf;
    return this;
  }

   /**
   * The PDF of the tax declaration, as a binary string.
   * @return pdf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "==BINARY-STRING==", required = true, value = "The PDF of the tax declaration, as a binary string.")

  public String getPdf() {
    return pdf;
  }


  public void setPdf(String pdf) {
    
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
   * @return the TaxDeclarationBusiness instance itself
   */
  public TaxDeclarationBusiness putAdditionalProperty(String key, Object value) {
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
    TaxDeclarationBusiness taxDeclarationBusiness = (TaxDeclarationBusiness) o;
    return Objects.equals(this.id, taxDeclarationBusiness.id) &&
        Objects.equals(this.link, taxDeclarationBusiness.link) &&
        Objects.equals(this.collectedAt, taxDeclarationBusiness.collectedAt) &&
        Objects.equals(this.createdAt, taxDeclarationBusiness.createdAt) &&
        Objects.equals(this.documentInformation, taxDeclarationBusiness.documentInformation) &&
        Objects.equals(this.taxPayerInformation, taxDeclarationBusiness.taxPayerInformation) &&
        Objects.equals(this.equityStatement, taxDeclarationBusiness.equityStatement) &&
        Objects.equals(this.annualIncomeStatement, taxDeclarationBusiness.annualIncomeStatement) &&
        Objects.equals(this.annualCostsAndDeductionsStatement, taxDeclarationBusiness.annualCostsAndDeductionsStatement) &&
        Objects.equals(this.taxAssessment, taxDeclarationBusiness.taxAssessment) &&
        Objects.equals(this.dateIssued, taxDeclarationBusiness.dateIssued) &&
        Objects.equals(this.pdf, taxDeclarationBusiness.pdf)&&
        Objects.equals(this.additionalProperties, taxDeclarationBusiness.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, link, collectedAt, createdAt, documentInformation, taxPayerInformation, equityStatement, annualIncomeStatement, annualCostsAndDeductionsStatement, taxAssessment, dateIssued, pdf, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxDeclarationBusiness {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    collectedAt: ").append(toIndentedString(collectedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    documentInformation: ").append(toIndentedString(documentInformation)).append("\n");
    sb.append("    taxPayerInformation: ").append(toIndentedString(taxPayerInformation)).append("\n");
    sb.append("    equityStatement: ").append(toIndentedString(equityStatement)).append("\n");
    sb.append("    annualIncomeStatement: ").append(toIndentedString(annualIncomeStatement)).append("\n");
    sb.append("    annualCostsAndDeductionsStatement: ").append(toIndentedString(annualCostsAndDeductionsStatement)).append("\n");
    sb.append("    taxAssessment: ").append(toIndentedString(taxAssessment)).append("\n");
    sb.append("    dateIssued: ").append(toIndentedString(dateIssued)).append("\n");
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
    openapiFields.add("document_information");
    openapiFields.add("tax_payer_information");
    openapiFields.add("equity_statement");
    openapiFields.add("annual_income_statement");
    openapiFields.add("annual_costs_and_deductions_statement");
    openapiFields.add("tax_assessment");
    openapiFields.add("date_issued");
    openapiFields.add("pdf");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("link");
    openapiRequiredFields.add("collected_at");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("document_information");
    openapiRequiredFields.add("tax_payer_information");
    openapiRequiredFields.add("equity_statement");
    openapiRequiredFields.add("annual_income_statement");
    openapiRequiredFields.add("annual_costs_and_deductions_statement");
    openapiRequiredFields.add("tax_assessment");
    openapiRequiredFields.add("date_issued");
    openapiRequiredFields.add("pdf");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TaxDeclarationBusiness
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TaxDeclarationBusiness.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaxDeclarationBusiness is not found in the empty JSON string", TaxDeclarationBusiness.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TaxDeclarationBusiness.openapiRequiredFields) {
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
      // validate the required field `document_information`
      DocumentInformationBusiness.validateJsonObject(jsonObj.getAsJsonObject("document_information"));
      // validate the required field `tax_payer_information`
      TaxPayerInformationBusiness.validateJsonObject(jsonObj.getAsJsonObject("tax_payer_information"));
      // validate the required field `equity_statement`
      EquityStatementBusiness.validateJsonObject(jsonObj.getAsJsonObject("equity_statement"));
      // validate the required field `annual_income_statement`
      AnnualIncomeStatementBusiness.validateJsonObject(jsonObj.getAsJsonObject("annual_income_statement"));
      // validate the required field `annual_costs_and_deductions_statement`
      AnnualCostsAndDeductionsStatementBusiness.validateJsonObject(jsonObj.getAsJsonObject("annual_costs_and_deductions_statement"));
      // validate the required field `tax_assessment`
      TaxAssessmentBusiness.validateJsonObject(jsonObj.getAsJsonObject("tax_assessment"));
      if (!jsonObj.get("pdf").isJsonNull() && !jsonObj.get("pdf").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pdf` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pdf").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TaxDeclarationBusiness.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TaxDeclarationBusiness' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TaxDeclarationBusiness> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TaxDeclarationBusiness.class));

       return (TypeAdapter<T>) new TypeAdapter<TaxDeclarationBusiness>() {
           @Override
           public void write(JsonWriter out, TaxDeclarationBusiness value) throws IOException {
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
           public TaxDeclarationBusiness read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TaxDeclarationBusiness instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TaxDeclarationBusiness given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TaxDeclarationBusiness
  * @throws IOException if the JSON string is invalid with respect to TaxDeclarationBusiness
  */
  public static TaxDeclarationBusiness fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaxDeclarationBusiness.class);
  }

 /**
  * Convert an instance of TaxDeclarationBusiness to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

