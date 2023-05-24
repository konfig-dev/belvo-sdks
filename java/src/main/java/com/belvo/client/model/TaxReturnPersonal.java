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
import java.io.File;
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
 * TaxReturnPersonal
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TaxReturnPersonal {
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

  public static final String SERIALIZED_NAME_INFORMACION_GENERAL = "informacion_general";
  @SerializedName(SERIALIZED_NAME_INFORMACION_GENERAL)
  private Object informacionGeneral;

  public static final String SERIALIZED_NAME_SUELDOS_SALARIOS = "sueldos_salarios";
  @SerializedName(SERIALIZED_NAME_SUELDOS_SALARIOS)
  private Object sueldosSalarios;

  public static final String SERIALIZED_NAME_SERVICIOS_PROFESIONALES = "servicios_profesionales";
  @SerializedName(SERIALIZED_NAME_SERVICIOS_PROFESIONALES)
  private Object serviciosProfesionales;

  public static final String SERIALIZED_NAME_DEDUCCIONES_PERSONALES = "deducciones_personales";
  @SerializedName(SERIALIZED_NAME_DEDUCCIONES_PERSONALES)
  private Object deduccionesPersonales;

  public static final String SERIALIZED_NAME_DETERMINACION_IMPUESTO = "determinacion_impuesto";
  @SerializedName(SERIALIZED_NAME_DETERMINACION_IMPUESTO)
  private Object determinacionImpuesto;

  public static final String SERIALIZED_NAME_RETENCIONES = "retenciones";
  @SerializedName(SERIALIZED_NAME_RETENCIONES)
  private Object retenciones;

  public static final String SERIALIZED_NAME_DIVIDENDOS = "dividendos";
  @SerializedName(SERIALIZED_NAME_DIVIDENDOS)
  private Object dividendos;

  public static final String SERIALIZED_NAME_DATOS_INFORMATIVOS = "datos_informativos";
  @SerializedName(SERIALIZED_NAME_DATOS_INFORMATIVOS)
  private Object datosInformativos;

  public static final String SERIALIZED_NAME_PDF = "pdf";
  @SerializedName(SERIALIZED_NAME_PDF)
  private File pdf;

  public static final String SERIALIZED_NAME_RECEIPT_PDF = "receipt_pdf";
  @SerializedName(SERIALIZED_NAME_RECEIPT_PDF)
  private File receiptPdf;

  public TaxReturnPersonal() {
  }

  public TaxReturnPersonal id(UUID id) {

    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier created by Belvo used to reference the current Tax Return.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0d3ffb69-f83b-456e-ad8e-208d0998d71d", value = "Unique identifier created by Belvo used to reference the current Tax Return.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {

    
    
    
    this.id = id;
  }


  public TaxReturnPersonal link(UUID link) {

    
    
    
    
    this.link = link;
    return this;
  }

   /**
   * The &#x60;link.id&#x60; the statement belongs to
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30cb4806-6e00-48a4-91c9-ca55968576c8", value = "The `link.id` the statement belongs to")

  public UUID getLink() {
    return link;
  }


  public void setLink(UUID link) {

    
    
    
    this.link = link;
  }


  public TaxReturnPersonal collectedAt(OffsetDateTime collectedAt) {

    
    
    
    
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


  public TaxReturnPersonal createdAt(OffsetDateTime createdAt) {

    
    
    
    
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


  public TaxReturnPersonal informacionGeneral(Object informacionGeneral) {

    
    
    
    
    this.informacionGeneral = informacionGeneral;
    return this;
  }

   /**
   * General information on the tax return (year, RFC, return type, person/company name, and so on).
   * @return informacionGeneral
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "General information on the tax return (year, RFC, return type, person/company name, and so on).")

  public Object getInformacionGeneral() {
    return informacionGeneral;
  }


  public void setInformacionGeneral(Object informacionGeneral) {

    
    
    
    this.informacionGeneral = informacionGeneral;
  }


  public TaxReturnPersonal sueldosSalarios(Object sueldosSalarios) {

    
    
    
    
    this.sueldosSalarios = sueldosSalarios;
    return this;
  }

   /**
   * Details regarding the income information together combined with withheld taxes.
   * @return sueldosSalarios
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Details regarding the income information together combined with withheld taxes.")

  public Object getSueldosSalarios() {
    return sueldosSalarios;
  }


  public void setSueldosSalarios(Object sueldosSalarios) {

    
    
    
    this.sueldosSalarios = sueldosSalarios;
  }


  public TaxReturnPersonal serviciosProfesionales(Object serviciosProfesionales) {

    
    
    
    
    this.serviciosProfesionales = serviciosProfesionales;
    return this;
  }

   /**
   * Details regarding the income and tax information from professional services provided.
   * @return serviciosProfesionales
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Details regarding the income and tax information from professional services provided.")

  public Object getServiciosProfesionales() {
    return serviciosProfesionales;
  }


  public void setServiciosProfesionales(Object serviciosProfesionales) {

    
    
    
    this.serviciosProfesionales = serviciosProfesionales;
  }


  public TaxReturnPersonal deduccionesPersonales(Object deduccionesPersonales) {

    
    
    
    
    this.deduccionesPersonales = deduccionesPersonales;
    return this;
  }

   /**
   * List of all personal tax deductions.
   * @return deduccionesPersonales
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "List of all personal tax deductions.")

  public Object getDeduccionesPersonales() {
    return deduccionesPersonales;
  }


  public void setDeduccionesPersonales(Object deduccionesPersonales) {

    
    
    
    this.deduccionesPersonales = deduccionesPersonales;
  }


  public TaxReturnPersonal determinacionImpuesto(Object determinacionImpuesto) {

    
    
    
    
    this.determinacionImpuesto = determinacionImpuesto;
    return this;
  }

   /**
   * Details regarding the final tax return.
   * @return determinacionImpuesto
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Details regarding the final tax return.")

  public Object getDeterminacionImpuesto() {
    return determinacionImpuesto;
  }


  public void setDeterminacionImpuesto(Object determinacionImpuesto) {

    
    
    
    this.determinacionImpuesto = determinacionImpuesto;
  }


  public TaxReturnPersonal retenciones(Object retenciones) {

    
    
    
    
    this.retenciones = retenciones;
    return this;
  }

   /**
   * Details on the already withheld taxes.
   * @return retenciones
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Details on the already withheld taxes.")

  public Object getRetenciones() {
    return retenciones;
  }


  public void setRetenciones(Object retenciones) {

    
    
    
    this.retenciones = retenciones;
  }


  public TaxReturnPersonal dividendos(Object dividendos) {

    
    
    
    
    this.dividendos = dividendos;
    return this;
  }

   /**
   * Details regarding dividends.
   * @return dividendos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Details regarding dividends.")

  public Object getDividendos() {
    return dividendos;
  }


  public void setDividendos(Object dividendos) {

    
    
    
    this.dividendos = dividendos;
  }


  public TaxReturnPersonal datosInformativos(Object datosInformativos) {

    
    
    
    
    this.datosInformativos = datosInformativos;
    return this;
  }

   /**
   * Extra informative data on the tax return.
   * @return datosInformativos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Extra informative data on the tax return.")

  public Object getDatosInformativos() {
    return datosInformativos;
  }


  public void setDatosInformativos(Object datosInformativos) {

    
    
    
    this.datosInformativos = datosInformativos;
  }


  public TaxReturnPersonal pdf(File pdf) {

    
    
    
    
    this.pdf = pdf;
    return this;
  }

   /**
   * Tax return PDF as a binary.
   * @return pdf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[B@7f9f2ba0", required = true, value = "Tax return PDF as a binary.")

  public File getPdf() {
    return pdf;
  }


  public void setPdf(File pdf) {

    
    
    
    this.pdf = pdf;
  }


  public TaxReturnPersonal receiptPdf(File receiptPdf) {

    
    
    
    
    this.receiptPdf = receiptPdf;
    return this;
  }

   /**
   * The acknowledgement receipt from the fiscal institution confirming that they received the tax return.
   * @return receiptPdf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[B@67441091", required = true, value = "The acknowledgement receipt from the fiscal institution confirming that they received the tax return.")

  public File getReceiptPdf() {
    return receiptPdf;
  }


  public void setReceiptPdf(File receiptPdf) {

    
    
    
    this.receiptPdf = receiptPdf;
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
   * @return the TaxReturnPersonal instance itself
   */
  public TaxReturnPersonal putAdditionalProperty(String key, Object value) {
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
    TaxReturnPersonal taxReturnPersonal = (TaxReturnPersonal) o;
    return Objects.equals(this.id, taxReturnPersonal.id) &&
        Objects.equals(this.link, taxReturnPersonal.link) &&
        Objects.equals(this.collectedAt, taxReturnPersonal.collectedAt) &&
        Objects.equals(this.createdAt, taxReturnPersonal.createdAt) &&
        Objects.equals(this.informacionGeneral, taxReturnPersonal.informacionGeneral) &&
        Objects.equals(this.sueldosSalarios, taxReturnPersonal.sueldosSalarios) &&
        Objects.equals(this.serviciosProfesionales, taxReturnPersonal.serviciosProfesionales) &&
        Objects.equals(this.deduccionesPersonales, taxReturnPersonal.deduccionesPersonales) &&
        Objects.equals(this.determinacionImpuesto, taxReturnPersonal.determinacionImpuesto) &&
        Objects.equals(this.retenciones, taxReturnPersonal.retenciones) &&
        Objects.equals(this.dividendos, taxReturnPersonal.dividendos) &&
        Objects.equals(this.datosInformativos, taxReturnPersonal.datosInformativos) &&
        Objects.equals(this.pdf, taxReturnPersonal.pdf) &&
        Objects.equals(this.receiptPdf, taxReturnPersonal.receiptPdf)&&
        Objects.equals(this.additionalProperties, taxReturnPersonal.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, link, collectedAt, createdAt, informacionGeneral, sueldosSalarios, serviciosProfesionales, deduccionesPersonales, determinacionImpuesto, retenciones, dividendos, datosInformativos, pdf, receiptPdf, additionalProperties);
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
    sb.append("class TaxReturnPersonal {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    collectedAt: ").append(toIndentedString(collectedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    informacionGeneral: ").append(toIndentedString(informacionGeneral)).append("\n");
    sb.append("    sueldosSalarios: ").append(toIndentedString(sueldosSalarios)).append("\n");
    sb.append("    serviciosProfesionales: ").append(toIndentedString(serviciosProfesionales)).append("\n");
    sb.append("    deduccionesPersonales: ").append(toIndentedString(deduccionesPersonales)).append("\n");
    sb.append("    determinacionImpuesto: ").append(toIndentedString(determinacionImpuesto)).append("\n");
    sb.append("    retenciones: ").append(toIndentedString(retenciones)).append("\n");
    sb.append("    dividendos: ").append(toIndentedString(dividendos)).append("\n");
    sb.append("    datosInformativos: ").append(toIndentedString(datosInformativos)).append("\n");
    sb.append("    pdf: ").append(toIndentedString(pdf)).append("\n");
    sb.append("    receiptPdf: ").append(toIndentedString(receiptPdf)).append("\n");
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
    openapiFields.add("informacion_general");
    openapiFields.add("sueldos_salarios");
    openapiFields.add("servicios_profesionales");
    openapiFields.add("deducciones_personales");
    openapiFields.add("determinacion_impuesto");
    openapiFields.add("retenciones");
    openapiFields.add("dividendos");
    openapiFields.add("datos_informativos");
    openapiFields.add("pdf");
    openapiFields.add("receipt_pdf");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("collected_at");
    openapiRequiredFields.add("informacion_general");
    openapiRequiredFields.add("sueldos_salarios");
    openapiRequiredFields.add("servicios_profesionales");
    openapiRequiredFields.add("deducciones_personales");
    openapiRequiredFields.add("determinacion_impuesto");
    openapiRequiredFields.add("retenciones");
    openapiRequiredFields.add("dividendos");
    openapiRequiredFields.add("pdf");
    openapiRequiredFields.add("receipt_pdf");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TaxReturnPersonal
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TaxReturnPersonal.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaxReturnPersonal is not found in the empty JSON string", TaxReturnPersonal.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TaxReturnPersonal.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("link") != null && !jsonObj.get("link").isJsonNull()) && !jsonObj.get("link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TaxReturnPersonal.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TaxReturnPersonal' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TaxReturnPersonal> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TaxReturnPersonal.class));

       return (TypeAdapter<T>) new TypeAdapter<TaxReturnPersonal>() {
           @Override
           public void write(JsonWriter out, TaxReturnPersonal value) throws IOException {
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
           public TaxReturnPersonal read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TaxReturnPersonal instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TaxReturnPersonal given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TaxReturnPersonal
  * @throws IOException if the JSON string is invalid with respect to TaxReturnPersonal
  */
  public static TaxReturnPersonal fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaxReturnPersonal.class);
  }

 /**
  * Convert an instance of TaxReturnPersonal to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

