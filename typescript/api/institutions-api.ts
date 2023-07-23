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
import { Institution } from '../models';
// @ts-ignore
import { InstitutionsPaginatedResponse } from '../models';
// @ts-ignore
import { NotFoundError } from '../models';
// @ts-ignore
import { UnauthorizedError } from '../models';
import { paginate } from "../pagination/paginate";
import { requestBeforeHook } from '../requestBeforeHook';
import { InstitutionsApiCustom } from "./institutions-api-custom";
/**
 * InstitutionsApi - axios parameter creator
 * @export
 */
export const InstitutionsApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Get the details of a specific institution.
         * @summary Get an institution\'s details
         * @param {string} id The &#x60;institution.id&#x60; you want to get detailed information about.
         * @param {string} [omit] Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {string} [fields] Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDetails: async (id: string, omit?: string, fields?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'id' is not null or undefined
            assertParamExists('getDetails', 'id', id)
            const localVarPath = `/api/institutions/{id}`
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
            if (omit !== undefined) {
                localVarQueryParameter['omit'] = omit;
            }

            if (fields !== undefined) {
                localVarQueryParameter['fields'] = fields;
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
        /**
         * Get a paginated list of all the institutions currently supported by Belvo. By default, we return up to 100 results per page.
         * @summary List all institutions
         * @param {number} [page] A page number within the paginated result set.
         * @param {number} [pageSize] Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000). 
         * @param {string} [omit] Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {string} [fields] Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {string} [countryCode] Return institutions only for this two-letter country code.
         * @param {string} [countryCodeIn] Return institutions only for these two-letter country codes.
         * @param {string} [displayName] Return institutions that partially match this display name.
         * @param {string} [name] 
         * @param {string} [nameIn] Return institutions with one or more of these Belvo-designated names.
         * @param {string} [resourcesAllin] Return institutions that support these resources.
         * @param {string} [status] Return institutions with the given status. You can choose between &#x60;healthy&#x60; or &#x60;down&#x60;.
         * @param {string} [statusIn] Return institutions with one of the given statuses. You can choose between &#x60;healthy&#x60; or &#x60;down&#x60;.
         * @param {string} [type] Return institutions of this type. You can choose between &#x60;bank&#x60; or &#x60;fiscal&#x60;.
         * @param {string} [typeIn] Return institutions of one of these types. You can choose between &#x60;bank&#x60; or &#x60;fiscal&#x60;.
         * @param {string} [website] Return institutions with this website URL.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        list: async (page?: number, pageSize?: number, omit?: string, fields?: string, countryCode?: string, countryCodeIn?: string, displayName?: string, name?: string, nameIn?: string, resourcesAllin?: string, status?: string, statusIn?: string, type?: string, typeIn?: string, website?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/api/institutions`;
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

            if (pageSize !== undefined) {
                localVarQueryParameter['page_size'] = pageSize;
            }

            if (omit !== undefined) {
                localVarQueryParameter['omit'] = omit;
            }

            if (fields !== undefined) {
                localVarQueryParameter['fields'] = fields;
            }

            if (countryCode !== undefined) {
                localVarQueryParameter['country_code'] = countryCode;
            }

            if (countryCodeIn !== undefined) {
                localVarQueryParameter['country_code__in'] = countryCodeIn;
            }

            if (displayName !== undefined) {
                localVarQueryParameter['display_name'] = displayName;
            }

            if (name !== undefined) {
                localVarQueryParameter['name'] = name;
            }

            if (nameIn !== undefined) {
                localVarQueryParameter['name__in'] = nameIn;
            }

            if (resourcesAllin !== undefined) {
                localVarQueryParameter['resources__allin'] = resourcesAllin;
            }

            if (status !== undefined) {
                localVarQueryParameter['status'] = status;
            }

            if (statusIn !== undefined) {
                localVarQueryParameter['status__in'] = statusIn;
            }

            if (type !== undefined) {
                localVarQueryParameter['type'] = type;
            }

            if (typeIn !== undefined) {
                localVarQueryParameter['type__in'] = typeIn;
            }

            if (website !== undefined) {
                localVarQueryParameter['website'] = website;
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
 * InstitutionsApi - functional programming interface
 * @export
 */
export const InstitutionsApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = InstitutionsApiAxiosParamCreator(configuration)
    return {
        /**
         * Get the details of a specific institution.
         * @summary Get an institution\'s details
         * @param {InstitutionsApiGetDetailsRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getDetails(requestParameters: InstitutionsApiGetDetailsRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<Institution>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getDetails(requestParameters.id, requestParameters.omit, requestParameters.fields, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Get a paginated list of all the institutions currently supported by Belvo. By default, we return up to 100 results per page.
         * @summary List all institutions
         * @param {InstitutionsApiListRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async list(requestParameters: InstitutionsApiListRequest = {}, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<InstitutionsPaginatedResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.list(requestParameters.page, requestParameters.pageSize, requestParameters.omit, requestParameters.fields, requestParameters.countryCode, requestParameters.countryCodeIn, requestParameters.displayName, requestParameters.name, requestParameters.nameIn, requestParameters.resourcesAllin, requestParameters.status, requestParameters.statusIn, requestParameters.type, requestParameters.typeIn, requestParameters.website, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * InstitutionsApi - factory interface
 * @export
 */
export const InstitutionsApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = InstitutionsApiFp(configuration)
    return {
        /**
         * Get the details of a specific institution.
         * @summary Get an institution\'s details
         * @param {InstitutionsApiGetDetailsRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDetails(requestParameters: InstitutionsApiGetDetailsRequest, options?: AxiosRequestConfig): AxiosPromise<Institution> {
            return localVarFp.getDetails(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * Get a paginated list of all the institutions currently supported by Belvo. By default, we return up to 100 results per page.
         * @summary List all institutions
         * @param {InstitutionsApiListRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        list(requestParameters: InstitutionsApiListRequest = {}, options?: AxiosRequestConfig): AxiosPromise<InstitutionsPaginatedResponse> {
            return localVarFp.list(requestParameters, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * Request parameters for getDetails operation in InstitutionsApi.
 * @export
 * @interface InstitutionsApiGetDetailsRequest
 */
export type InstitutionsApiGetDetailsRequest = {
    
    /**
    * The `institution.id` you want to get detailed information about.
    * @type {string}
    * @memberof InstitutionsApiGetDetails
    */
    readonly id: string
    
    /**
    * Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof InstitutionsApiGetDetails
    */
    readonly omit?: string
    
    /**
    * Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof InstitutionsApiGetDetails
    */
    readonly fields?: string
    
}

/**
 * Request parameters for list operation in InstitutionsApi.
 * @export
 * @interface InstitutionsApiListRequest
 */
export type InstitutionsApiListRequest = {
    
    /**
    * A page number within the paginated result set.
    * @type {number}
    * @memberof InstitutionsApiList
    */
    readonly page?: number
    
    /**
    * Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000). 
    * @type {number}
    * @memberof InstitutionsApiList
    */
    readonly pageSize?: number
    
    /**
    * Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof InstitutionsApiList
    */
    readonly omit?: string
    
    /**
    * Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof InstitutionsApiList
    */
    readonly fields?: string
    
    /**
    * Return institutions only for this two-letter country code.
    * @type {string}
    * @memberof InstitutionsApiList
    */
    readonly countryCode?: string
    
    /**
    * Return institutions only for these two-letter country codes.
    * @type {string}
    * @memberof InstitutionsApiList
    */
    readonly countryCodeIn?: string
    
    /**
    * Return institutions that partially match this display name.
    * @type {string}
    * @memberof InstitutionsApiList
    */
    readonly displayName?: string
    
    /**
    * 
    * @type {string}
    * @memberof InstitutionsApiList
    */
    readonly name?: string
    
    /**
    * Return institutions with one or more of these Belvo-designated names.
    * @type {string}
    * @memberof InstitutionsApiList
    */
    readonly nameIn?: string
    
    /**
    * Return institutions that support these resources.
    * @type {string}
    * @memberof InstitutionsApiList
    */
    readonly resourcesAllin?: string
    
    /**
    * Return institutions with the given status. You can choose between `healthy` or `down`.
    * @type {string}
    * @memberof InstitutionsApiList
    */
    readonly status?: string
    
    /**
    * Return institutions with one of the given statuses. You can choose between `healthy` or `down`.
    * @type {string}
    * @memberof InstitutionsApiList
    */
    readonly statusIn?: string
    
    /**
    * Return institutions of this type. You can choose between `bank` or `fiscal`.
    * @type {string}
    * @memberof InstitutionsApiList
    */
    readonly type?: string
    
    /**
    * Return institutions of one of these types. You can choose between `bank` or `fiscal`.
    * @type {string}
    * @memberof InstitutionsApiList
    */
    readonly typeIn?: string
    
    /**
    * Return institutions with this website URL.
    * @type {string}
    * @memberof InstitutionsApiList
    */
    readonly website?: string
    
}

/**
 * InstitutionsApi - object-oriented interface
 * @export
 * @class InstitutionsApi
 * @extends {BaseAPI}
 */
export class InstitutionsApi extends InstitutionsApiCustom {
    /**
     * Get the details of a specific institution.
     * @summary Get an institution\'s details
     * @param {InstitutionsApiGetDetailsRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof InstitutionsApi
     */
    public getDetails(requestParameters: InstitutionsApiGetDetailsRequest, options?: AxiosRequestConfig) {
        return InstitutionsApiFp(this.configuration).getDetails(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * Get a paginated list of all the institutions currently supported by Belvo. By default, we return up to 100 results per page.
     * @summary List all institutions
     * @param {InstitutionsApiListRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof InstitutionsApi
     */
    public list(requestParameters: InstitutionsApiListRequest = {}, options?: AxiosRequestConfig) {
        return InstitutionsApiFp(this.configuration).list(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }
}
