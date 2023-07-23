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

import globalAxios, { AxiosPromise, AxiosInstance, AxiosRequestConfig } from 'axios';
import { Configuration } from '../configuration';
// Some imports not used depending on template conditions
// @ts-ignore
import { DUMMY_BASE_URL, assertParamExists, setApiKeyToObject, setBasicAuthToObject, setBearerAuthToObject, setSearchParams, serializeDataIfNeeded, toPathString, createRequestFunction, isBrowser } from '../common';
// @ts-ignore
import { BASE_PATH, COLLECTION_FORMATS, RequestArgs, BaseAPI, RequiredError } from '../base';
// @ts-ignore
import { Model401UnauthorizedError } from '../models';
// @ts-ignore
import { Model404NotFoundError } from '../models';
// @ts-ignore
import { PaymentInstitution } from '../models';
// @ts-ignore
import { PaymentsInstitutionsPaginatedResponse } from '../models';
import { paginate } from "../pagination/paginate";
import { requestBeforeHook } from '../requestBeforeHook';
import { PaymentInstitutionsApiCustom } from "./payment-institutions-api-custom";
/**
 * PaymentInstitutionsApi - axios parameter creator
 * @export
 */
export const PaymentInstitutionsApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Get the details about a specific payment institution
         * @summary Get details about a payment institution
         * @param {string} id The payment &#x60;institution.id&#x60; you want to get detailed information about.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDetails: async (id: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'id' is not null or undefined
            assertParamExists('getDetails', 'id', id)
            const localVarPath = `/payments/institutions/{id}`
                .replace(`{${"id"}}`, encodeURIComponent(String(id !== undefined ? id : `-id-`)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions: AxiosRequestConfig = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = configuration && !isBrowser() ? { "User-Agent": configuration.userAgent } : {} as any;
            const localVarQueryParameter = {} as any;

            // authentication basicAuth required
            // http basic authentication required
            setBasicAuthToObject(localVarRequestOptions, configuration)

    
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            requestBeforeHook({
                queryParameters: localVarQueryParameter,
                requestConfig: localVarRequestOptions,
                path: localVarPath,
                configuration
            });

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * List all available payment institutions.
         * @summary List all payment institutions
         * @param {number} [page] A page number within the paginated result set.
         * @param {string} [country] Return institutions only for this country.
         * @param {string} [countryIn] Return institutions only for one of these countries.
         * @param {string} [createdAt] Return results only for this date (in &#x60;YYYY-MM-DD&#x60; format).
         * @param {string} [createdAtGt] Return results only after this date (in &#x60;YYYY-MM-DD&#x60; format).
         * @param {string} [createdAtGte] Return results only for this date and after (in &#x60;YYYY-MM-DD&#x60; format).
         * @param {string} [createdAtLt] Return results only before this date (in &#x60;YYYY-MM-DD&#x60; format).
         * @param {string} [createdAtLte] Return results only for this date and before (in &#x60;YYYY-MM-DD&#x60; format).
         * @param {string} [createdAtRange] Return results between this date range (in &#x60;YYYY-MM-DD&#x60; format).
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        list: async (page?: number, country?: string, countryIn?: string, createdAt?: string, createdAtGt?: string, createdAtGte?: string, createdAtLt?: string, createdAtLte?: string, createdAtRange?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/payments/institutions`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions: AxiosRequestConfig = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = configuration && !isBrowser() ? { "User-Agent": configuration.userAgent } : {} as any;
            const localVarQueryParameter = {} as any;

            // authentication basicAuth required
            // http basic authentication required
            setBasicAuthToObject(localVarRequestOptions, configuration)
            if (page !== undefined) {
                localVarQueryParameter['page'] = page;
            }

            if (country !== undefined) {
                localVarQueryParameter['country'] = country;
            }

            if (countryIn !== undefined) {
                localVarQueryParameter['country__in'] = countryIn;
            }

            if (createdAt !== undefined) {
                localVarQueryParameter['created_at'] = createdAt;
            }

            if (createdAtGt !== undefined) {
                localVarQueryParameter['created_at__gt'] = createdAtGt;
            }

            if (createdAtGte !== undefined) {
                localVarQueryParameter['created_at__gte'] = createdAtGte;
            }

            if (createdAtLt !== undefined) {
                localVarQueryParameter['created_at__lt'] = createdAtLt;
            }

            if (createdAtLte !== undefined) {
                localVarQueryParameter['created_at__lte'] = createdAtLte;
            }

            if (createdAtRange !== undefined) {
                localVarQueryParameter['created_at__range'] = createdAtRange;
            }


    
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            requestBeforeHook({
                queryParameters: localVarQueryParameter,
                requestConfig: localVarRequestOptions,
                path: localVarPath,
                configuration
            });

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * PaymentInstitutionsApi - functional programming interface
 * @export
 */
export const PaymentInstitutionsApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = PaymentInstitutionsApiAxiosParamCreator(configuration)
    return {
        /**
         * Get the details about a specific payment institution
         * @summary Get details about a payment institution
         * @param {PaymentInstitutionsApiGetDetailsRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getDetails(requestParameters: PaymentInstitutionsApiGetDetailsRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<PaymentInstitution>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getDetails(requestParameters.id, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * List all available payment institutions.
         * @summary List all payment institutions
         * @param {PaymentInstitutionsApiListRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async list(requestParameters: PaymentInstitutionsApiListRequest = {}, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<PaymentsInstitutionsPaginatedResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.list(requestParameters.page, requestParameters.country, requestParameters.countryIn, requestParameters.createdAt, requestParameters.createdAtGt, requestParameters.createdAtGte, requestParameters.createdAtLt, requestParameters.createdAtLte, requestParameters.createdAtRange, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * PaymentInstitutionsApi - factory interface
 * @export
 */
export const PaymentInstitutionsApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = PaymentInstitutionsApiFp(configuration)
    return {
        /**
         * Get the details about a specific payment institution
         * @summary Get details about a payment institution
         * @param {PaymentInstitutionsApiGetDetailsRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDetails(requestParameters: PaymentInstitutionsApiGetDetailsRequest, options?: AxiosRequestConfig): AxiosPromise<PaymentInstitution> {
            return localVarFp.getDetails(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * List all available payment institutions.
         * @summary List all payment institutions
         * @param {PaymentInstitutionsApiListRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        list(requestParameters: PaymentInstitutionsApiListRequest = {}, options?: AxiosRequestConfig): AxiosPromise<PaymentsInstitutionsPaginatedResponse> {
            return localVarFp.list(requestParameters, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * Request parameters for getDetails operation in PaymentInstitutionsApi.
 * @export
 * @interface PaymentInstitutionsApiGetDetailsRequest
 */
export type PaymentInstitutionsApiGetDetailsRequest = {
    
    /**
    * The payment `institution.id` you want to get detailed information about.
    * @type {string}
    * @memberof PaymentInstitutionsApiGetDetails
    */
    readonly id: string
    
}

/**
 * Request parameters for list operation in PaymentInstitutionsApi.
 * @export
 * @interface PaymentInstitutionsApiListRequest
 */
export type PaymentInstitutionsApiListRequest = {
    
    /**
    * A page number within the paginated result set.
    * @type {number}
    * @memberof PaymentInstitutionsApiList
    */
    readonly page?: number
    
    /**
    * Return institutions only for this country.
    * @type {string}
    * @memberof PaymentInstitutionsApiList
    */
    readonly country?: string
    
    /**
    * Return institutions only for one of these countries.
    * @type {string}
    * @memberof PaymentInstitutionsApiList
    */
    readonly countryIn?: string
    
    /**
    * Return results only for this date (in `YYYY-MM-DD` format).
    * @type {string}
    * @memberof PaymentInstitutionsApiList
    */
    readonly createdAt?: string
    
    /**
    * Return results only after this date (in `YYYY-MM-DD` format).
    * @type {string}
    * @memberof PaymentInstitutionsApiList
    */
    readonly createdAtGt?: string
    
    /**
    * Return results only for this date and after (in `YYYY-MM-DD` format).
    * @type {string}
    * @memberof PaymentInstitutionsApiList
    */
    readonly createdAtGte?: string
    
    /**
    * Return results only before this date (in `YYYY-MM-DD` format).
    * @type {string}
    * @memberof PaymentInstitutionsApiList
    */
    readonly createdAtLt?: string
    
    /**
    * Return results only for this date and before (in `YYYY-MM-DD` format).
    * @type {string}
    * @memberof PaymentInstitutionsApiList
    */
    readonly createdAtLte?: string
    
    /**
    * Return results between this date range (in `YYYY-MM-DD` format).
    * @type {string}
    * @memberof PaymentInstitutionsApiList
    */
    readonly createdAtRange?: string
    
}

/**
 * PaymentInstitutionsApi - object-oriented interface
 * @export
 * @class PaymentInstitutionsApi
 * @extends {BaseAPI}
 */
export class PaymentInstitutionsApi extends PaymentInstitutionsApiCustom {
    /**
     * Get the details about a specific payment institution
     * @summary Get details about a payment institution
     * @param {PaymentInstitutionsApiGetDetailsRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof PaymentInstitutionsApi
     */
    public getDetails(requestParameters: PaymentInstitutionsApiGetDetailsRequest, options?: AxiosRequestConfig) {
        return PaymentInstitutionsApiFp(this.configuration).getDetails(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * List all available payment institutions.
     * @summary List all payment institutions
     * @param {PaymentInstitutionsApiListRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof PaymentInstitutionsApi
     */
    public list(requestParameters: PaymentInstitutionsApiListRequest = {}, options?: AxiosRequestConfig) {
        return PaymentInstitutionsApiFp(this.configuration).list(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }
}
