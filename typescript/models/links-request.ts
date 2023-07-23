/* tslint:disable */
/* eslint-disable */
/**
 * Belvo API Docs
 * # Introduction  Belvo is an open banking API for Latin America that allows companies to access banking and fiscal information in a secure as well as agile way.  Through our API, you can access:   - **Bank information** such as account information, real-time balance, historical transactions, and account owner identification.  - **Fiscal information** such as received and sent invoices and tax returns.   <img src=\"https://files.readme.io/acf27d3-belvo_pipes.png\" alt=\"fiscal-endpoints\">   In this API reference you\'ll find all the information you need about each  endpoint and resource.   <div style=\"background-color:#f4f6f8; border-left: 6px solid #4CAF50;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\">  <strong>Tip: </strong> Make sure that you also check out our Developer Portal for guides on <a href=\"https://developers.belvo.com/docs/get-started-in-5-minutes\" target=\"_blank\">how to get started</a>, using our <a href=\"https://developers.belvo.com/docs/test-in-sandbox\" target=\"_blank\">Sandbox environment</a>, as well as how to <a href=\"https://developers.belvo.com/docs/connect-widget\" target=\"_blank\">integrate the widget</a> or use our <a href=\"https://developers.belvo.com/docs/quickstart-application\" target=\"_blank\">quickstart application</a>.  </div>   ## Environment  We currently offer three environments: sandbox, development, and production.   When using our SDKs, make sure to use the **Alias** (and not the Base URL).   | Environment | Purpose | Access | |-----------|-------|-------| | **Sandbox** | The [Sandbox environment](https://developers.belvo.com/docs/test-in-sandbox) is dedicated for your testing and development phases. In this environment, you can create links without real credentials and you can pull test data from all endpoints. **⚠️The sandbox environment is refreshed frequently and your test data can be updated or deleted.** | Base URL (cURL): https://sandbox.belvo.com/ <br><br>Alias (SDKs): sandbox| |**Development**|The Development environment is dedicated for testing with real credentials and institutions with real-world institutions. You can create up to 25 links for free in this environment.| Base URL (cURL): https://development.belvo.com/ <br><br>Alias (SDKs): development | | **Production** | The Production environment is dedicated for live applications with real connections to institutions. In this environment, you will need real credentials to create links and you will pull real data from the institutions.| Base URL (cURL): https://api.belvo.com/ <br><br>Alias (SDKs): production|   For each environment, you\'ll need to [generate separate API keys](https://developers.belvo.com/docs/get-your-belvo-api-keys).   ## Response codes   We use the following HTTP status code in the response depending on the success or failure:   | Status Code | Description | |-----------|-------| | `200` | ✅ **Success** - The content is available in the response body. | | `201` | ✅ **Success** - The content was created successfully on Belvo. | | `204` | ✅ **Success** - No content to return. | | `400` | ❌ **Bad Request Error** - Request returned an error, detail in content.| | `401` | ❌ **Unauthorized** - The Belvo credentials provided are not valid.| | `404` | ❌ **Not Found** - The resource you try to access cannot be found.| | `405` | ❌ **Method Not Allowed** - The HTTP method you are using is not accepted for this resource.| | `408` | ❌ **Request Timeout** - The request timed out and was terminated by the server.| | `428` | ❌ **MFA Token Required** - MFA token was required by the institution to connect. | | `500` | ❌ **Internal Server Error** - The detail of the error is available in the response body.|   ## Error handling   ### Error messages   Belvo API errors are returned in JSON format. For example, an error might look like this:   ```json  [     {       \"request_id\": \"a6e1c493d7a29d91aed4338e6fcf077d\",       \"message\": \"This field is required.\",       \"code\": \"required\",       \"field\": \"link\"     } ]  ```   Typically, an error response will have the following parameters:  - `request_id`: a unique ID for the request, you should share it with the Belvo support team for investigations.  - `message`: human-readable description of the error.  - `code`: a unique code for the error. Check the table below to see how to handle each error code.  - `field` *(optional)*: The specific field in the request body that has an issue.    ### Request identifier  When you need help with a specific error, add the request identifier (`request_id`) in your message to the Belvo support team. This will speed up investigations and get you back up and running in no time at all.   ### Error codes and troubleshooting   For a full list of errors and how to troubleshoot them, please see our dedicated [Error handling articles](https://developers.belvo.com/docs/integration-overview#error-handling) in our DevPortal.    ### Retry policy   Please see our recommended [retry policies](https://developers.belvo.com/docs/integration-overview#error-retry-policy) in the DevPortal. 
 *
 * The version of the OpenAPI document: 1.35.0
 * Contact: support@belvo.com
 *
 * NOTE: This file is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */

// May contain unused imports in some cases
// @ts-ignore
import { EnumLinkAccessModeRequest } from './enum-link-access-mode-request';

/**
 * 
 * @export
 * @interface LinksRequest
 */
export interface LinksRequest {
    /**
     * The Belvo name for the institution.
     * @type {string}
     * @memberof LinksRequest
     */
    'institution': string;
    /**
     * The end-user\'s username (or ID) used to log in to the institution.
     * @type {string}
     * @memberof LinksRequest
     */
    'username': string;
    /**
     * The end-user\'s password used to log in to the institution.  ℹ️ **Note**: You must send through a password for all institutions except for IMSS (`imss_mx_employment`). 
     * @type {string}
     * @memberof LinksRequest
     */
    'password'?: string;
    /**
     * An additional identifier for the link, provided by you, to store in the Belvo database. **Cannot** include any Personal Identifiable Information (PII). **Must** be at least three characters long.  If we identify that the identifier contains PII, we will force a `null` value. For more information, see our [Link creation article](https://developers.belvo.com/docs/link-creation-best-practices#adding-your-own-identifier).
     * @type {string}
     * @memberof LinksRequest
     */
    'external_id'?: string;
    /**
     * The end-user\'s second username (or email address) used to log in to the institution.  ℹ️ This is only required by some institutions. To know which institutions require a second username, get the [details](https://developers.belvo.com/reference/detailinstitution) for the institution and check the `form_fields` array in the response. 
     * @type {string}
     * @memberof LinksRequest
     */
    'username2'?: string;
    /**
     * The end-user\'s third username used to log in to the institution.  ℹ️ This is only required by some institutions. To know which institutions require a third username, get the [details](https://developers.belvo.com/reference/detailinstitution) for the institution and check the `form_fields` array in the response. 
     * @type {string}
     * @memberof LinksRequest
     */
    'username3'?: string;
    /**
     * The end-user\'s second password used to log in to the institution.  ℹ️ This is only required by some institutions. To know which institutions require a second password, get the [details](https://developers.belvo.com/reference/detailinstitution) for the institution and check the `form_fields` array in the response. 
     * @type {string}
     * @memberof LinksRequest
     */
    'password2'?: string;
    /**
     * The MFA token required by the bank to log in.  We do not recommend sending the authentication token in the same request as registering the user. See our [Handling multi-factor authentication](https://developers.belvo.com/docs/handling-2-factor-authentication) article for more information and best practices. 
     * @type {string}
     * @memberof LinksRequest
     */
    'token'?: string;
    /**
     * 
     * @type {EnumLinkAccessModeRequest}
     * @memberof LinksRequest
     */
    'access_mode'?: EnumLinkAccessModeRequest;
    /**
     * Indicates whether or not to retrieve historical information for the link or not. For links where `access_mode=single`, the default is `false`. For links where `access_mode=recurrent` this is hardcoded to `true`. 
     * @type {boolean}
     * @memberof LinksRequest
     */
    'fetch_historical'?: boolean;
    /**
     * Indicates whether or not to store credentials (and the duration for which to store the credentials). By default, this is set to `store`. For links where `access_mode=recurrent`, this must be set to `store`.  Choose either:   - `store` to store credentials   - `nostore` to not store credentials   - `30d` to store credentials only for 30 days 
     * @type {string}
     * @memberof LinksRequest
     */
    'credentials_storage'?: string;
    /**
     * Type of document to be used as a username.  Some banking institutions accept different documents to be used as the `username` to login. For example, the *Cédula de Ciudadanía*, *Cédula de Extranjería*, *Pasaporte\'*, and so on.  For banks that require a document to log in, you **must** provide the `username_type` parameter to specify which document is used when creating the link.  ℹ️ To know which institutions require the `username_type` parameter, get the [details](https://developers.belvo.com/reference/detailinstitution) for the institution and check the `form_fields` array in the response.  For a list of standards codes, see the table below.  | Code | Description | |-----------|-------| | `001` | Cédula de Ciudadanía | | `002` | Cédula de Extranjería | | `003` | Pasaporte | | `004` | Tarjeta de Identidad | | `005` | Registro Civil | | `006` | Número Identificación Personal | | `020` | NIT | | `021` | NIT Persona Natural | | `022` | NIT Persona Extranjera | | `023` | NIT Persona Jurídica | | `024` | NIT Menores | | `025` | NIT Desasociado | | `030` | Trj. Seguro Social Extranjero | | `031` | Sociedad Extranjera sin NIT en Colombia | | `032` | Fideicomiso | | `033` | RIF Venezuela | | `034` | CIF | | `035` | Número de Identidad | | `036` | RTN | | `037` | Cédula de Identidad | | `038` | DIMEX | | `039` | CED | | `040` | PAS | | `041` | Documento Único de Identidad | | `042` | NIT Salvadoreño | | `100` | Agência e conta | | `101` | Código do operador | | `102` | Cartão de crédito | | `103` | CPF | 
     * @type {string}
     * @memberof LinksRequest
     */
    'username_type'?: string;
    /**
     * For certain fiscal institutions, it is possible to log in using a certificate and a private key, which enables a faster connection to the institution.  Belvo supports a base64 encoded `certificate`. If the `certificate` parameter is used, you *must* also provide the `private_key` parameter. 
     * @type {string}
     * @memberof LinksRequest
     */
    'certificate'?: string;
    /**
     * For certain fiscal institutions, it is possible to log in using a certificate and a private key, which enables a faster connection to the institution.  Belvo supports a base64 encoded `private_key`. If the `private_key` parameter is used, you *must* also provide the `certificate` parameter. 
     * @type {string}
     * @memberof LinksRequest
     */
    'private_key'?: string;
}

