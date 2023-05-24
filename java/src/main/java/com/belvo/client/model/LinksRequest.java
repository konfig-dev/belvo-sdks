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
import com.belvo.client.model.EnumLinkAccessModeRequest;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * LinksRequest
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LinksRequest {
  public static final String SERIALIZED_NAME_INSTITUTION = "institution";
  @SerializedName(SERIALIZED_NAME_INSTITUTION)
  private String institution;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_USERNAME2 = "username2";
  @SerializedName(SERIALIZED_NAME_USERNAME2)
  private String username2;

  public static final String SERIALIZED_NAME_USERNAME3 = "username3";
  @SerializedName(SERIALIZED_NAME_USERNAME3)
  private String username3;

  public static final String SERIALIZED_NAME_PASSWORD2 = "password2";
  @SerializedName(SERIALIZED_NAME_PASSWORD2)
  private String password2;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_ACCESS_MODE = "access_mode";
  @SerializedName(SERIALIZED_NAME_ACCESS_MODE)
  private EnumLinkAccessModeRequest accessMode = EnumLinkAccessModeRequest.RECURRENT;

  public static final String SERIALIZED_NAME_FETCH_HISTORICAL = "fetch_historical";
  @SerializedName(SERIALIZED_NAME_FETCH_HISTORICAL)
  private Boolean fetchHistorical;

  public static final String SERIALIZED_NAME_CREDENTIALS_STORAGE = "credentials_storage";
  @SerializedName(SERIALIZED_NAME_CREDENTIALS_STORAGE)
  private String credentialsStorage;

  public static final String SERIALIZED_NAME_USERNAME_TYPE = "username_type";
  @SerializedName(SERIALIZED_NAME_USERNAME_TYPE)
  private String usernameType;

  public static final String SERIALIZED_NAME_CERTIFICATE = "certificate";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE)
  private String certificate;

  public static final String SERIALIZED_NAME_PRIVATE_KEY = "private_key";
  @SerializedName(SERIALIZED_NAME_PRIVATE_KEY)
  private String privateKey;

  public LinksRequest() {
  }

  public LinksRequest institution(String institution) {

    
    
    
    
    this.institution = institution;
    return this;
  }

   /**
   * The Belvo name for the institution.
   * @return institution
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "erebor_mx_retail", required = true, value = "The Belvo name for the institution.")

  public String getInstitution() {
    return institution;
  }


  public void setInstitution(String institution) {

    
    
    
    this.institution = institution;
  }


  public LinksRequest username(String username) {

    
    
    
    
    this.username = username;
    return this;
  }

   /**
   * The end-user&#39;s username (or ID) used to log in to the institution.
   * @return username
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "username", required = true, value = "The end-user's username (or ID) used to log in to the institution.")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {

    
    
    
    this.username = username;
  }


  public LinksRequest password(String password) {

    
    
    
    
    this.password = password;
    return this;
  }

   /**
   * The end-user&#39;s password used to log in to the institution.  ℹ️ **Note**: You must send through a password for all institutions except for IMSS (&#x60;imss_mx_employment&#x60;). 
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "password", value = "The end-user's password used to log in to the institution.  ℹ️ **Note**: You must send through a password for all institutions except for IMSS (`imss_mx_employment`). ")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {

    
    
    
    this.password = password;
  }


  public LinksRequest externalId(String externalId) {

    
    
    if (externalId.length() < 3) {
      throw new IllegalArgumentException("Invalid value for externalId. Length must be greater than or equal to 3.");
    }
    
    this.externalId = externalId;
    return this;
  }

   /**
   * An additional identifier for the link, provided by you, to store in the Belvo database. **Cannot** include any Personal Identifiable Information (PII). **Must** be at least three characters long.  If we identify that the identifier contains PII, we will force a &#x60;null&#x60; value. For more information, see our [Link creation article](https://developers.belvo.com/docs/link-creation-best-practices#adding-your-own-identifier).
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "56ab5706-6e00-48a4-91c9-ca55968678d9", value = "An additional identifier for the link, provided by you, to store in the Belvo database. **Cannot** include any Personal Identifiable Information (PII). **Must** be at least three characters long.  If we identify that the identifier contains PII, we will force a `null` value. For more information, see our [Link creation article](https://developers.belvo.com/docs/link-creation-best-practices#adding-your-own-identifier).")

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {

    
    
    if (externalId.length() < 3) {
      throw new IllegalArgumentException("Invalid value for externalId. Length must be greater than or equal to 3.");
    }
    this.externalId = externalId;
  }


  public LinksRequest username2(String username2) {

    
    
    
    
    this.username2 = username2;
    return this;
  }

   /**
   * The end-user&#39;s second username (or email address) used to log in to the institution.  ℹ️ This is only required by some institutions. To know which institutions require a second username, get the [details](https://developers.belvo.com/reference/detailinstitution) for the institution and check the &#x60;form_fields&#x60; array in the response. 
   * @return username2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "secondusername", value = "The end-user's second username (or email address) used to log in to the institution.  ℹ️ This is only required by some institutions. To know which institutions require a second username, get the [details](https://developers.belvo.com/reference/detailinstitution) for the institution and check the `form_fields` array in the response. ")

  public String getUsername2() {
    return username2;
  }


  public void setUsername2(String username2) {

    
    
    
    this.username2 = username2;
  }


  public LinksRequest username3(String username3) {

    
    
    
    
    this.username3 = username3;
    return this;
  }

   /**
   * The end-user&#39;s third username used to log in to the institution.  ℹ️ This is only required by some institutions. To know which institutions require a third username, get the [details](https://developers.belvo.com/reference/detailinstitution) for the institution and check the &#x60;form_fields&#x60; array in the response. 
   * @return username3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "thirdusername", value = "The end-user's third username used to log in to the institution.  ℹ️ This is only required by some institutions. To know which institutions require a third username, get the [details](https://developers.belvo.com/reference/detailinstitution) for the institution and check the `form_fields` array in the response. ")

  public String getUsername3() {
    return username3;
  }


  public void setUsername3(String username3) {

    
    
    
    this.username3 = username3;
  }


  public LinksRequest password2(String password2) {

    
    
    
    
    this.password2 = password2;
    return this;
  }

   /**
   * The end-user&#39;s second password used to log in to the institution.  ℹ️ This is only required by some institutions. To know which institutions require a second password, get the [details](https://developers.belvo.com/reference/detailinstitution) for the institution and check the &#x60;form_fields&#x60; array in the response. 
   * @return password2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "pin", value = "The end-user's second password used to log in to the institution.  ℹ️ This is only required by some institutions. To know which institutions require a second password, get the [details](https://developers.belvo.com/reference/detailinstitution) for the institution and check the `form_fields` array in the response. ")

  public String getPassword2() {
    return password2;
  }


  public void setPassword2(String password2) {

    
    
    
    this.password2 = password2;
  }


  public LinksRequest token(String token) {

    
    
    
    
    this.token = token;
    return this;
  }

   /**
   * The MFA token required by the bank to log in.  We do not recommend sending the authentication token in the same request as registering the user. See our [Handling multi-factor authentication](https://developers.belvo.com/docs/handling-2-factor-authentication) article for more information and best practices. 
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234ab", value = "The MFA token required by the bank to log in.  We do not recommend sending the authentication token in the same request as registering the user. See our [Handling multi-factor authentication](https://developers.belvo.com/docs/handling-2-factor-authentication) article for more information and best practices. ")

  public String getToken() {
    return token;
  }


  public void setToken(String token) {

    
    
    
    this.token = token;
  }


  public LinksRequest accessMode(EnumLinkAccessModeRequest accessMode) {

    
    
    
    
    this.accessMode = accessMode;
    return this;
  }

   /**
   * Get accessMode
   * @return accessMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumLinkAccessModeRequest getAccessMode() {
    return accessMode;
  }


  public void setAccessMode(EnumLinkAccessModeRequest accessMode) {

    
    
    
    this.accessMode = accessMode;
  }


  public LinksRequest fetchHistorical(Boolean fetchHistorical) {

    
    
    
    
    this.fetchHistorical = fetchHistorical;
    return this;
  }

   /**
   * Indicates whether or not to retrieve historical information for the link or not. For links where &#x60;access_mode&#x3D;single&#x60;, the default is &#x60;false&#x60;. For links where &#x60;access_mode&#x3D;recurrent&#x60; this is hardcoded to &#x60;true&#x60;. 
   * @return fetchHistorical
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates whether or not to retrieve historical information for the link or not. For links where `access_mode=single`, the default is `false`. For links where `access_mode=recurrent` this is hardcoded to `true`. ")

  public Boolean getFetchHistorical() {
    return fetchHistorical;
  }


  public void setFetchHistorical(Boolean fetchHistorical) {

    
    
    
    this.fetchHistorical = fetchHistorical;
  }


  public LinksRequest credentialsStorage(String credentialsStorage) {

    
    
    
    
    this.credentialsStorage = credentialsStorage;
    return this;
  }

   /**
   * Indicates whether or not to store credentials (and the duration for which to store the credentials). By default, this is set to &#x60;store&#x60;. For links where &#x60;access_mode&#x3D;recurrent&#x60;, this must be set to &#x60;store&#x60;.  Choose either:   - &#x60;store&#x60; to store credentials   - &#x60;nostore&#x60; to not store credentials   - &#x60;30d&#x60; to store credentials only for 30 days 
   * @return credentialsStorage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "store", value = "Indicates whether or not to store credentials (and the duration for which to store the credentials). By default, this is set to `store`. For links where `access_mode=recurrent`, this must be set to `store`.  Choose either:   - `store` to store credentials   - `nostore` to not store credentials   - `30d` to store credentials only for 30 days ")

  public String getCredentialsStorage() {
    return credentialsStorage;
  }


  public void setCredentialsStorage(String credentialsStorage) {

    
    
    
    this.credentialsStorage = credentialsStorage;
  }


  public LinksRequest usernameType(String usernameType) {

    
    
    
    
    this.usernameType = usernameType;
    return this;
  }

   /**
   * Type of document to be used as a username.  Some banking institutions accept different documents to be used as the &#x60;username&#x60; to login. For example, the *Cédula de Ciudadanía*, *Cédula de Extranjería*, *Pasaporte&#39;*, and so on.  For banks that require a document to log in, you **must** provide the &#x60;username_type&#x60; parameter to specify which document is used when creating the link.  ℹ️ To know which institutions require the &#x60;username_type&#x60; parameter, get the [details](https://developers.belvo.com/reference/detailinstitution) for the institution and check the &#x60;form_fields&#x60; array in the response.  For a list of standards codes, see the table below.  | Code | Description | |-----------|-------| | &#x60;001&#x60; | Cédula de Ciudadanía | | &#x60;002&#x60; | Cédula de Extranjería | | &#x60;003&#x60; | Pasaporte | | &#x60;004&#x60; | Tarjeta de Identidad | | &#x60;005&#x60; | Registro Civil | | &#x60;006&#x60; | Número Identificación Personal | | &#x60;020&#x60; | NIT | | &#x60;021&#x60; | NIT Persona Natural | | &#x60;022&#x60; | NIT Persona Extranjera | | &#x60;023&#x60; | NIT Persona Jurídica | | &#x60;024&#x60; | NIT Menores | | &#x60;025&#x60; | NIT Desasociado | | &#x60;030&#x60; | Trj. Seguro Social Extranjero | | &#x60;031&#x60; | Sociedad Extranjera sin NIT en Colombia | | &#x60;032&#x60; | Fideicomiso | | &#x60;033&#x60; | RIF Venezuela | | &#x60;034&#x60; | CIF | | &#x60;035&#x60; | Número de Identidad | | &#x60;036&#x60; | RTN | | &#x60;037&#x60; | Cédula de Identidad | | &#x60;038&#x60; | DIMEX | | &#x60;039&#x60; | CED | | &#x60;040&#x60; | PAS | | &#x60;041&#x60; | Documento Único de Identidad | | &#x60;042&#x60; | NIT Salvadoreño | | &#x60;100&#x60; | Agência e conta | | &#x60;101&#x60; | Código do operador | | &#x60;102&#x60; | Cartão de crédito | | &#x60;103&#x60; | CPF | 
   * @return usernameType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "001", value = "Type of document to be used as a username.  Some banking institutions accept different documents to be used as the `username` to login. For example, the *Cédula de Ciudadanía*, *Cédula de Extranjería*, *Pasaporte'*, and so on.  For banks that require a document to log in, you **must** provide the `username_type` parameter to specify which document is used when creating the link.  ℹ️ To know which institutions require the `username_type` parameter, get the [details](https://developers.belvo.com/reference/detailinstitution) for the institution and check the `form_fields` array in the response.  For a list of standards codes, see the table below.  | Code | Description | |-----------|-------| | `001` | Cédula de Ciudadanía | | `002` | Cédula de Extranjería | | `003` | Pasaporte | | `004` | Tarjeta de Identidad | | `005` | Registro Civil | | `006` | Número Identificación Personal | | `020` | NIT | | `021` | NIT Persona Natural | | `022` | NIT Persona Extranjera | | `023` | NIT Persona Jurídica | | `024` | NIT Menores | | `025` | NIT Desasociado | | `030` | Trj. Seguro Social Extranjero | | `031` | Sociedad Extranjera sin NIT en Colombia | | `032` | Fideicomiso | | `033` | RIF Venezuela | | `034` | CIF | | `035` | Número de Identidad | | `036` | RTN | | `037` | Cédula de Identidad | | `038` | DIMEX | | `039` | CED | | `040` | PAS | | `041` | Documento Único de Identidad | | `042` | NIT Salvadoreño | | `100` | Agência e conta | | `101` | Código do operador | | `102` | Cartão de crédito | | `103` | CPF | ")

  public String getUsernameType() {
    return usernameType;
  }


  public void setUsernameType(String usernameType) {

    
    
    
    this.usernameType = usernameType;
  }


  public LinksRequest certificate(String certificate) {

    
    
    
    
    this.certificate = certificate;
    return this;
  }

   /**
   * For certain fiscal institutions, it is possible to log in using a certificate and a private key, which enables a faster connection to the institution.  Belvo supports a base64 encoded &#x60;certificate&#x60;. If the &#x60;certificate&#x60; parameter is used, you *must* also provide the &#x60;private_key&#x60; parameter. 
   * @return certificate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234567890abcd=", value = "For certain fiscal institutions, it is possible to log in using a certificate and a private key, which enables a faster connection to the institution.  Belvo supports a base64 encoded `certificate`. If the `certificate` parameter is used, you *must* also provide the `private_key` parameter. ")

  public String getCertificate() {
    return certificate;
  }


  public void setCertificate(String certificate) {

    
    
    
    this.certificate = certificate;
  }


  public LinksRequest privateKey(String privateKey) {

    
    
    
    
    this.privateKey = privateKey;
    return this;
  }

   /**
   * For certain fiscal institutions, it is possible to log in using a certificate and a private key, which enables a faster connection to the institution.  Belvo supports a base64 encoded &#x60;private_key&#x60;. If the &#x60;private_key&#x60; parameter is used, you *must* also provide the &#x60;certificate&#x60; parameter. 
   * @return privateKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234567890abcd=", value = "For certain fiscal institutions, it is possible to log in using a certificate and a private key, which enables a faster connection to the institution.  Belvo supports a base64 encoded `private_key`. If the `private_key` parameter is used, you *must* also provide the `certificate` parameter. ")

  public String getPrivateKey() {
    return privateKey;
  }


  public void setPrivateKey(String privateKey) {

    
    
    
    this.privateKey = privateKey;
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
   * @return the LinksRequest instance itself
   */
  public LinksRequest putAdditionalProperty(String key, Object value) {
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
    LinksRequest linksRequest = (LinksRequest) o;
    return Objects.equals(this.institution, linksRequest.institution) &&
        Objects.equals(this.username, linksRequest.username) &&
        Objects.equals(this.password, linksRequest.password) &&
        Objects.equals(this.externalId, linksRequest.externalId) &&
        Objects.equals(this.username2, linksRequest.username2) &&
        Objects.equals(this.username3, linksRequest.username3) &&
        Objects.equals(this.password2, linksRequest.password2) &&
        Objects.equals(this.token, linksRequest.token) &&
        Objects.equals(this.accessMode, linksRequest.accessMode) &&
        Objects.equals(this.fetchHistorical, linksRequest.fetchHistorical) &&
        Objects.equals(this.credentialsStorage, linksRequest.credentialsStorage) &&
        Objects.equals(this.usernameType, linksRequest.usernameType) &&
        Objects.equals(this.certificate, linksRequest.certificate) &&
        Objects.equals(this.privateKey, linksRequest.privateKey)&&
        Objects.equals(this.additionalProperties, linksRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(institution, username, password, externalId, username2, username3, password2, token, accessMode, fetchHistorical, credentialsStorage, usernameType, certificate, privateKey, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinksRequest {\n");
    sb.append("    institution: ").append(toIndentedString(institution)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    username2: ").append(toIndentedString(username2)).append("\n");
    sb.append("    username3: ").append(toIndentedString(username3)).append("\n");
    sb.append("    password2: ").append(toIndentedString(password2)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
    sb.append("    fetchHistorical: ").append(toIndentedString(fetchHistorical)).append("\n");
    sb.append("    credentialsStorage: ").append(toIndentedString(credentialsStorage)).append("\n");
    sb.append("    usernameType: ").append(toIndentedString(usernameType)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
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
    openapiFields.add("institution");
    openapiFields.add("username");
    openapiFields.add("password");
    openapiFields.add("external_id");
    openapiFields.add("username2");
    openapiFields.add("username3");
    openapiFields.add("password2");
    openapiFields.add("token");
    openapiFields.add("access_mode");
    openapiFields.add("fetch_historical");
    openapiFields.add("credentials_storage");
    openapiFields.add("username_type");
    openapiFields.add("certificate");
    openapiFields.add("private_key");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("institution");
    openapiRequiredFields.add("username");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LinksRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LinksRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LinksRequest is not found in the empty JSON string", LinksRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LinksRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("institution").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `institution` to be a primitive type in the JSON string but got `%s`", jsonObj.get("institution").toString()));
      }
      if (!jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("external_id") != null && !jsonObj.get("external_id").isJsonNull()) && !jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
      if ((jsonObj.get("username2") != null && !jsonObj.get("username2").isJsonNull()) && !jsonObj.get("username2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username2").toString()));
      }
      if ((jsonObj.get("username3") != null && !jsonObj.get("username3").isJsonNull()) && !jsonObj.get("username3").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username3` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username3").toString()));
      }
      if ((jsonObj.get("password2") != null && !jsonObj.get("password2").isJsonNull()) && !jsonObj.get("password2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password2").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("credentials_storage") != null && !jsonObj.get("credentials_storage").isJsonNull()) && !jsonObj.get("credentials_storage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `credentials_storage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("credentials_storage").toString()));
      }
      if ((jsonObj.get("username_type") != null && !jsonObj.get("username_type").isJsonNull()) && !jsonObj.get("username_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username_type").toString()));
      }
      if ((jsonObj.get("certificate") != null && !jsonObj.get("certificate").isJsonNull()) && !jsonObj.get("certificate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certificate").toString()));
      }
      if ((jsonObj.get("private_key") != null && !jsonObj.get("private_key").isJsonNull()) && !jsonObj.get("private_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `private_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("private_key").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LinksRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LinksRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LinksRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LinksRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<LinksRequest>() {
           @Override
           public void write(JsonWriter out, LinksRequest value) throws IOException {
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
           public LinksRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LinksRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LinksRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LinksRequest
  * @throws IOException if the JSON string is invalid with respect to LinksRequest
  */
  public static LinksRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LinksRequest.class);
  }

 /**
  * Convert an instance of LinksRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

