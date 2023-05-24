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
 * TaxReturnBusiness
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TaxReturnBusiness {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_COLLECTED_AT = "collected_at";
  @SerializedName(SERIALIZED_NAME_COLLECTED_AT)
  private OffsetDateTime collectedAt;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_INFORMACION_GENERAL = "informacion_general";
  @SerializedName(SERIALIZED_NAME_INFORMACION_GENERAL)
  private Object informacionGeneral;

  public static final String SERIALIZED_NAME_DATOS_ADICIONALES = "datos_adicionales";
  @SerializedName(SERIALIZED_NAME_DATOS_ADICIONALES)
  private Object datosAdicionales;

  public static final String SERIALIZED_NAME_ESTADO_RESULTADOS = "estado_resultados";
  @SerializedName(SERIALIZED_NAME_ESTADO_RESULTADOS)
  private Object estadoResultados;

  public static final String SERIALIZED_NAME_ESTADO_POSICION_FINANCIERA_BALANCE = "estado_posicion_financiera_balance";
  @SerializedName(SERIALIZED_NAME_ESTADO_POSICION_FINANCIERA_BALANCE)
  private Object estadoPosicionFinancieraBalance;

  public static final String SERIALIZED_NAME_CONCILIACION_ENTRE_RESULTADO_CONTABLE_FISCAL = "conciliacion_entre_resultado_contable_fiscal";
  @SerializedName(SERIALIZED_NAME_CONCILIACION_ENTRE_RESULTADO_CONTABLE_FISCAL)
  private Object conciliacionEntreResultadoContableFiscal;

  public static final String SERIALIZED_NAME_DEDUCCIONES_AUTORIZADAS = "deducciones_autorizadas";
  @SerializedName(SERIALIZED_NAME_DEDUCCIONES_AUTORIZADAS)
  private Object deduccionesAutorizadas;

  public static final String SERIALIZED_NAME_CIFRAS_CIERRE_EJERCICIO = "cifras_cierre_ejercicio";
  @SerializedName(SERIALIZED_NAME_CIFRAS_CIERRE_EJERCICIO)
  private Object cifrasCierreEjercicio;

  public static final String SERIALIZED_NAME_DETERMINACION_DEL_IMPUESTO_SOBRE_LA_RENTA = "determinacion_del_impuesto_sobre_la_renta";
  @SerializedName(SERIALIZED_NAME_DETERMINACION_DEL_IMPUESTO_SOBRE_LA_RENTA)
  private Object determinacionDelImpuestoSobreLaRenta;

  public static final String SERIALIZED_NAME_DIVIDENDOS_O_UTILIDADES_DISTRIBUIDOS = "dividendos_o_utilidades_distribuidos";
  @SerializedName(SERIALIZED_NAME_DIVIDENDOS_O_UTILIDADES_DISTRIBUIDOS)
  private Object dividendosOUtilidadesDistribuidos;

  public static final String SERIALIZED_NAME_DETALLE_PAGO_R1_ISR_PERSONAS_MORALES = "detalle_pago_r1_isr_personas_morales";
  @SerializedName(SERIALIZED_NAME_DETALLE_PAGO_R1_ISR_PERSONAS_MORALES)
  private Object detallePagoR1IsrPersonasMorales;

  public static final String SERIALIZED_NAME_PDF = "pdf";
  @SerializedName(SERIALIZED_NAME_PDF)
  private File pdf;

  public static final String SERIALIZED_NAME_RECEIPT_PDF = "receipt_pdf";
  @SerializedName(SERIALIZED_NAME_RECEIPT_PDF)
  private File receiptPdf;

  public TaxReturnBusiness() {
  }

  public TaxReturnBusiness id(UUID id) {

    
    
    
    
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


  public TaxReturnBusiness collectedAt(OffsetDateTime collectedAt) {

    
    
    
    
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


  public TaxReturnBusiness createdAt(OffsetDateTime createdAt) {

    
    
    
    
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


  public TaxReturnBusiness informacionGeneral(Object informacionGeneral) {

    
    
    
    
    this.informacionGeneral = informacionGeneral;
    return this;
  }

   /**
   * General information regarding the tax return (year, RFC, return type, person/company name, and so on).
   * @return informacionGeneral
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "General information regarding the tax return (year, RFC, return type, person/company name, and so on).")

  public Object getInformacionGeneral() {
    return informacionGeneral;
  }


  public void setInformacionGeneral(Object informacionGeneral) {

    
    
    
    this.informacionGeneral = informacionGeneral;
  }


  public TaxReturnBusiness datosAdicionales(Object datosAdicionales) {

    
    
    
    
    this.datosAdicionales = datosAdicionales;
    return this;
  }

   /**
   * Additional data regarding the tax return.
   * @return datosAdicionales
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional data regarding the tax return.")

  public Object getDatosAdicionales() {
    return datosAdicionales;
  }


  public void setDatosAdicionales(Object datosAdicionales) {

    
    
    
    this.datosAdicionales = datosAdicionales;
  }


  public TaxReturnBusiness estadoResultados(Object estadoResultados) {

    
    
    
    
    this.estadoResultados = estadoResultados;
    return this;
  }

   /**
   * Detailed information about the legal entity&#39;s yearly profit and loss.
   * @return estadoResultados
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Detailed information about the legal entity's yearly profit and loss.")

  public Object getEstadoResultados() {
    return estadoResultados;
  }


  public void setEstadoResultados(Object estadoResultados) {

    
    
    
    this.estadoResultados = estadoResultados;
  }


  public TaxReturnBusiness estadoPosicionFinancieraBalance(Object estadoPosicionFinancieraBalance) {

    
    
    
    
    this.estadoPosicionFinancieraBalance = estadoPosicionFinancieraBalance;
    return this;
  }

   /**
   * Details regarding balance sheet of the legal entity.
   * @return estadoPosicionFinancieraBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Details regarding balance sheet of the legal entity.")

  public Object getEstadoPosicionFinancieraBalance() {
    return estadoPosicionFinancieraBalance;
  }


  public void setEstadoPosicionFinancieraBalance(Object estadoPosicionFinancieraBalance) {

    
    
    
    this.estadoPosicionFinancieraBalance = estadoPosicionFinancieraBalance;
  }


  public TaxReturnBusiness conciliacionEntreResultadoContableFiscal(Object conciliacionEntreResultadoContableFiscal) {

    
    
    
    
    this.conciliacionEntreResultadoContableFiscal = conciliacionEntreResultadoContableFiscal;
    return this;
  }

   /**
   * Details regarding the accounting reconciliation.
   * @return conciliacionEntreResultadoContableFiscal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Details regarding the accounting reconciliation.")

  public Object getConciliacionEntreResultadoContableFiscal() {
    return conciliacionEntreResultadoContableFiscal;
  }


  public void setConciliacionEntreResultadoContableFiscal(Object conciliacionEntreResultadoContableFiscal) {

    
    
    
    this.conciliacionEntreResultadoContableFiscal = conciliacionEntreResultadoContableFiscal;
  }


  public TaxReturnBusiness deduccionesAutorizadas(Object deduccionesAutorizadas) {

    
    
    
    
    this.deduccionesAutorizadas = deduccionesAutorizadas;
    return this;
  }

   /**
   * Details regarding the legal entity&#39;s deductions.
   * @return deduccionesAutorizadas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details regarding the legal entity's deductions.")

  public Object getDeduccionesAutorizadas() {
    return deduccionesAutorizadas;
  }


  public void setDeduccionesAutorizadas(Object deduccionesAutorizadas) {

    
    
    
    this.deduccionesAutorizadas = deduccionesAutorizadas;
  }


  public TaxReturnBusiness cifrasCierreEjercicio(Object cifrasCierreEjercicio) {

    
    
    
    
    this.cifrasCierreEjercicio = cifrasCierreEjercicio;
    return this;
  }

   /**
   * Details regarding key numbers at the end of the fiscal exercise.
   * @return cifrasCierreEjercicio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Details regarding key numbers at the end of the fiscal exercise.")

  public Object getCifrasCierreEjercicio() {
    return cifrasCierreEjercicio;
  }


  public void setCifrasCierreEjercicio(Object cifrasCierreEjercicio) {

    
    
    
    this.cifrasCierreEjercicio = cifrasCierreEjercicio;
  }


  public TaxReturnBusiness determinacionDelImpuestoSobreLaRenta(Object determinacionDelImpuestoSobreLaRenta) {

    
    
    
    
    this.determinacionDelImpuestoSobreLaRenta = determinacionDelImpuestoSobreLaRenta;
    return this;
  }

   /**
   * Details regarding the final tax return.
   * @return determinacionDelImpuestoSobreLaRenta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Details regarding the final tax return.")

  public Object getDeterminacionDelImpuestoSobreLaRenta() {
    return determinacionDelImpuestoSobreLaRenta;
  }


  public void setDeterminacionDelImpuestoSobreLaRenta(Object determinacionDelImpuestoSobreLaRenta) {

    
    
    
    this.determinacionDelImpuestoSobreLaRenta = determinacionDelImpuestoSobreLaRenta;
  }


  public TaxReturnBusiness dividendosOUtilidadesDistribuidos(Object dividendosOUtilidadesDistribuidos) {

    
    
    
    
    this.dividendosOUtilidadesDistribuidos = dividendosOUtilidadesDistribuidos;
    return this;
  }

   /**
   * Details regarding distributed dividends.
   * @return dividendosOUtilidadesDistribuidos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details regarding distributed dividends.")

  public Object getDividendosOUtilidadesDistribuidos() {
    return dividendosOUtilidadesDistribuidos;
  }


  public void setDividendosOUtilidadesDistribuidos(Object dividendosOUtilidadesDistribuidos) {

    
    
    
    this.dividendosOUtilidadesDistribuidos = dividendosOUtilidadesDistribuidos;
  }


  public TaxReturnBusiness detallePagoR1IsrPersonasMorales(Object detallePagoR1IsrPersonasMorales) {

    
    
    
    
    this.detallePagoR1IsrPersonasMorales = detallePagoR1IsrPersonasMorales;
    return this;
  }

   /**
   * Details of the tax payment.
   * @return detallePagoR1IsrPersonasMorales
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Details of the tax payment.")

  public Object getDetallePagoR1IsrPersonasMorales() {
    return detallePagoR1IsrPersonasMorales;
  }


  public void setDetallePagoR1IsrPersonasMorales(Object detallePagoR1IsrPersonasMorales) {

    
    
    
    this.detallePagoR1IsrPersonasMorales = detallePagoR1IsrPersonasMorales;
  }


  public TaxReturnBusiness pdf(File pdf) {

    
    
    
    
    this.pdf = pdf;
    return this;
  }

   /**
   * Tax return PDF as a binary.
   * @return pdf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[B@2cefec7e", required = true, value = "Tax return PDF as a binary.")

  public File getPdf() {
    return pdf;
  }


  public void setPdf(File pdf) {

    
    
    
    this.pdf = pdf;
  }


  public TaxReturnBusiness receiptPdf(File receiptPdf) {

    
    
    
    
    this.receiptPdf = receiptPdf;
    return this;
  }

   /**
   * The acknowledgement receipt from the fiscal institution confirming that they received the tax return.
   * @return receiptPdf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[B@6be8b1ea", required = true, value = "The acknowledgement receipt from the fiscal institution confirming that they received the tax return.")

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
   * @return the TaxReturnBusiness instance itself
   */
  public TaxReturnBusiness putAdditionalProperty(String key, Object value) {
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
    TaxReturnBusiness taxReturnBusiness = (TaxReturnBusiness) o;
    return Objects.equals(this.id, taxReturnBusiness.id) &&
        Objects.equals(this.collectedAt, taxReturnBusiness.collectedAt) &&
        Objects.equals(this.createdAt, taxReturnBusiness.createdAt) &&
        Objects.equals(this.informacionGeneral, taxReturnBusiness.informacionGeneral) &&
        Objects.equals(this.datosAdicionales, taxReturnBusiness.datosAdicionales) &&
        Objects.equals(this.estadoResultados, taxReturnBusiness.estadoResultados) &&
        Objects.equals(this.estadoPosicionFinancieraBalance, taxReturnBusiness.estadoPosicionFinancieraBalance) &&
        Objects.equals(this.conciliacionEntreResultadoContableFiscal, taxReturnBusiness.conciliacionEntreResultadoContableFiscal) &&
        Objects.equals(this.deduccionesAutorizadas, taxReturnBusiness.deduccionesAutorizadas) &&
        Objects.equals(this.cifrasCierreEjercicio, taxReturnBusiness.cifrasCierreEjercicio) &&
        Objects.equals(this.determinacionDelImpuestoSobreLaRenta, taxReturnBusiness.determinacionDelImpuestoSobreLaRenta) &&
        Objects.equals(this.dividendosOUtilidadesDistribuidos, taxReturnBusiness.dividendosOUtilidadesDistribuidos) &&
        Objects.equals(this.detallePagoR1IsrPersonasMorales, taxReturnBusiness.detallePagoR1IsrPersonasMorales) &&
        Objects.equals(this.pdf, taxReturnBusiness.pdf) &&
        Objects.equals(this.receiptPdf, taxReturnBusiness.receiptPdf)&&
        Objects.equals(this.additionalProperties, taxReturnBusiness.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, collectedAt, createdAt, informacionGeneral, datosAdicionales, estadoResultados, estadoPosicionFinancieraBalance, conciliacionEntreResultadoContableFiscal, deduccionesAutorizadas, cifrasCierreEjercicio, determinacionDelImpuestoSobreLaRenta, dividendosOUtilidadesDistribuidos, detallePagoR1IsrPersonasMorales, pdf, receiptPdf, additionalProperties);
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
    sb.append("class TaxReturnBusiness {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    collectedAt: ").append(toIndentedString(collectedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    informacionGeneral: ").append(toIndentedString(informacionGeneral)).append("\n");
    sb.append("    datosAdicionales: ").append(toIndentedString(datosAdicionales)).append("\n");
    sb.append("    estadoResultados: ").append(toIndentedString(estadoResultados)).append("\n");
    sb.append("    estadoPosicionFinancieraBalance: ").append(toIndentedString(estadoPosicionFinancieraBalance)).append("\n");
    sb.append("    conciliacionEntreResultadoContableFiscal: ").append(toIndentedString(conciliacionEntreResultadoContableFiscal)).append("\n");
    sb.append("    deduccionesAutorizadas: ").append(toIndentedString(deduccionesAutorizadas)).append("\n");
    sb.append("    cifrasCierreEjercicio: ").append(toIndentedString(cifrasCierreEjercicio)).append("\n");
    sb.append("    determinacionDelImpuestoSobreLaRenta: ").append(toIndentedString(determinacionDelImpuestoSobreLaRenta)).append("\n");
    sb.append("    dividendosOUtilidadesDistribuidos: ").append(toIndentedString(dividendosOUtilidadesDistribuidos)).append("\n");
    sb.append("    detallePagoR1IsrPersonasMorales: ").append(toIndentedString(detallePagoR1IsrPersonasMorales)).append("\n");
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
    openapiFields.add("collected_at");
    openapiFields.add("created_at");
    openapiFields.add("informacion_general");
    openapiFields.add("datos_adicionales");
    openapiFields.add("estado_resultados");
    openapiFields.add("estado_posicion_financiera_balance");
    openapiFields.add("conciliacion_entre_resultado_contable_fiscal");
    openapiFields.add("deducciones_autorizadas");
    openapiFields.add("cifras_cierre_ejercicio");
    openapiFields.add("determinacion_del_impuesto_sobre_la_renta");
    openapiFields.add("dividendos_o_utilidades_distribuidos");
    openapiFields.add("detalle_pago_r1_isr_personas_morales");
    openapiFields.add("pdf");
    openapiFields.add("receipt_pdf");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("collected_at");
    openapiRequiredFields.add("informacion_general");
    openapiRequiredFields.add("estado_resultados");
    openapiRequiredFields.add("estado_posicion_financiera_balance");
    openapiRequiredFields.add("conciliacion_entre_resultado_contable_fiscal");
    openapiRequiredFields.add("cifras_cierre_ejercicio");
    openapiRequiredFields.add("determinacion_del_impuesto_sobre_la_renta");
    openapiRequiredFields.add("detalle_pago_r1_isr_personas_morales");
    openapiRequiredFields.add("pdf");
    openapiRequiredFields.add("receipt_pdf");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TaxReturnBusiness
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TaxReturnBusiness.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaxReturnBusiness is not found in the empty JSON string", TaxReturnBusiness.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TaxReturnBusiness.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TaxReturnBusiness.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TaxReturnBusiness' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TaxReturnBusiness> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TaxReturnBusiness.class));

       return (TypeAdapter<T>) new TypeAdapter<TaxReturnBusiness>() {
           @Override
           public void write(JsonWriter out, TaxReturnBusiness value) throws IOException {
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
           public TaxReturnBusiness read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TaxReturnBusiness instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TaxReturnBusiness given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TaxReturnBusiness
  * @throws IOException if the JSON string is invalid with respect to TaxReturnBusiness
  */
  public static TaxReturnBusiness fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaxReturnBusiness.class);
  }

 /**
  * Convert an instance of TaxReturnBusiness to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

