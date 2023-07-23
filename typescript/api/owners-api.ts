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
import { LinksCompleteRequestResponseInner } from '../models';
// @ts-ignore
import { NotFoundError } from '../models';
// @ts-ignore
import { Owner } from '../models';
// @ts-ignore
import { OwnersPaginatedResponse } from '../models';
// @ts-ignore
import { PatchBody } from '../models';
// @ts-ignore
import { RequestTimeoutError } from '../models';
// @ts-ignore
import { StandardRequest } from '../models';
// @ts-ignore
import { TokenRequiredResponse } from '../models';
// @ts-ignore
import { UnauthorizedError } from '../models';
// @ts-ignore
import { UnexpectedError } from '../models';
import { paginate } from "../pagination/paginate";
import { requestBeforeHook } from '../requestBeforeHook';
import { OwnersApiCustom } from "./owners-api-custom";
/**
 * OwnersApi - axios parameter creator
 * @export
 */
export const OwnersApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Used to resume an Owner retrieve session that was paused because an MFA token was required by the institution.
         * @summary Complete an owners request
         * @param {PatchBody} patchBody 
         * @param {string} [omit] Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {string} [fields] Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        completeRequest: async (patchBody: PatchBody, omit?: string, fields?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'patchBody' is not null or undefined
            assertParamExists('completeRequest', 'patchBody', patchBody)
            const localVarPath = `/api/owners`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions: AxiosRequestConfig = { method: 'PATCH', ...baseOptions, ...options};
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


    
            localVarHeaderParameter['Content-Type'] = 'application/json';

            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            requestBeforeHook({
                requestBody: patchBody,
                queryParameters: localVarQueryParameter,
                requestConfig: localVarRequestOptions,
                path: localVarPath,
                configuration
            });
            localVarRequestOptions.data = serializeDataIfNeeded(patchBody, localVarRequestOptions, configuration)

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Delete a specific owner from your Belvo account.
         * @summary Delete an owner
         * @param {string} id The &#x60;owner.id&#x60; that you want to delete.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        delete: async (id: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'id' is not null or undefined
            assertParamExists('delete', 'id', id)
            const localVarPath = `/api/owners/{id}`
                .replace(`{${"id"}}`, encodeURIComponent(String(id !== undefined ? id : `-id-`)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions: AxiosRequestConfig = { method: 'DELETE', ...baseOptions, ...options};
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
         * Get the details of a specific owner.
         * @summary Get an owner\'s details
         * @param {string} id The &#x60;owner.id&#x60; you want to get detailed information about.
         * @param {string} [omit] Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {string} [fields] Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDetails: async (id: string, omit?: string, fields?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'id' is not null or undefined
            assertParamExists('getDetails', 'id', id)
            const localVarPath = `/api/owners/{id}`
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
         * Get a paginated list of all existing owners in your Belvo account. We return up to 100 results per page.
         * @summary List all owners
         * @param {number} [page] A page number within the paginated result set.
         * @param {number} [pageSize] Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000). 
         * @param {string} [omit] Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {string} [fields] Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {string} [createdAtGt] Return owners that were last updated in Belvo\&#39;s database after this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp).
         * @param {string} [createdAtGte] Return owners that were last updated in Belvo\&#39;s database after or on this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp).
         * @param {string} [createdAtLt] Return owners that were last updated in Belvo\&#39;s database before this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp).
         * @param {string} [createdAtLte] Return owners that were last updated in Belvo\&#39;s database before or on this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp).
         * @param {string} [createdAtRange] Return owners that were last updated in Belvo\&#39;s database between two dates (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp).
         * @param {string} [displayNameIcontains] Return owners whose full display name partially matches your query. For example, &#x60;mar&#x60; will return results for Mark, Maria, Neymar, Remarque, and so on.
         * @param {string} [email] Returns owners whose email address match your query.
         * @param {string} [id] Return information only for this &#x60;owner.id&#x60;.
         * @param {string} [idIn] Return information only for these &#x60;owner.id&#x60;s.
         * @param {string} [link] Return information only for this &#x60;link.id&#x60;.
         * @param {string} [linkIn] Return balances only for these &#x60;link.id&#x60;s.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        list: async (page?: number, pageSize?: number, omit?: string, fields?: string, createdAtGt?: string, createdAtGte?: string, createdAtLt?: string, createdAtLte?: string, createdAtRange?: string, displayNameIcontains?: string, email?: string, id?: string, idIn?: string, link?: string, linkIn?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/api/owners`;
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

            if (displayNameIcontains !== undefined) {
                localVarQueryParameter['display_name__icontains'] = displayNameIcontains;
            }

            if (email !== undefined) {
                localVarQueryParameter['email'] = email;
            }

            if (id !== undefined) {
                localVarQueryParameter['id'] = id;
            }

            if (idIn !== undefined) {
                localVarQueryParameter['id__in'] = idIn;
            }

            if (link !== undefined) {
                localVarQueryParameter['link'] = link;
            }

            if (linkIn !== undefined) {
                localVarQueryParameter['link__in'] = linkIn;
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
         * Retrieve owner information from a specific link.
         * @summary Retrieve owners for a link
         * @param {StandardRequest} standardRequest 
         * @param {string} [omit] Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {string} [fields] Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        retrieve: async (standardRequest: StandardRequest, omit?: string, fields?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'standardRequest' is not null or undefined
            assertParamExists('retrieve', 'standardRequest', standardRequest)
            const localVarPath = `/api/owners`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions: AxiosRequestConfig = { method: 'POST', ...baseOptions, ...options};
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


    
            localVarHeaderParameter['Content-Type'] = 'application/json';

            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            requestBeforeHook({
                requestBody: standardRequest,
                queryParameters: localVarQueryParameter,
                requestConfig: localVarRequestOptions,
                path: localVarPath,
                configuration
            });
            localVarRequestOptions.data = serializeDataIfNeeded(standardRequest, localVarRequestOptions, configuration)

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * OwnersApi - functional programming interface
 * @export
 */
export const OwnersApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = OwnersApiAxiosParamCreator(configuration)
    return {
        /**
         * Used to resume an Owner retrieve session that was paused because an MFA token was required by the institution.
         * @summary Complete an owners request
         * @param {OwnersApiCompleteRequestRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async completeRequest(requestParameters: OwnersApiCompleteRequestRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<Array<Owner>>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.completeRequest(requestParameters, requestParameters.omit, requestParameters.fields, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Delete a specific owner from your Belvo account.
         * @summary Delete an owner
         * @param {OwnersApiDeleteRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async delete(requestParameters: OwnersApiDeleteRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<void>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.delete(requestParameters.id, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Get the details of a specific owner.
         * @summary Get an owner\'s details
         * @param {OwnersApiGetDetailsRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getDetails(requestParameters: OwnersApiGetDetailsRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<Owner>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getDetails(requestParameters.id, requestParameters.omit, requestParameters.fields, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Get a paginated list of all existing owners in your Belvo account. We return up to 100 results per page.
         * @summary List all owners
         * @param {OwnersApiListRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async list(requestParameters: OwnersApiListRequest = {}, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<OwnersPaginatedResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.list(requestParameters.page, requestParameters.pageSize, requestParameters.omit, requestParameters.fields, requestParameters.createdAtGt, requestParameters.createdAtGte, requestParameters.createdAtLt, requestParameters.createdAtLte, requestParameters.createdAtRange, requestParameters.displayNameIcontains, requestParameters.email, requestParameters.id, requestParameters.idIn, requestParameters.link, requestParameters.linkIn, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Retrieve owner information from a specific link.
         * @summary Retrieve owners for a link
         * @param {OwnersApiRetrieveRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async retrieve(requestParameters: OwnersApiRetrieveRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<Array<Owner>>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.retrieve(requestParameters, requestParameters.omit, requestParameters.fields, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * OwnersApi - factory interface
 * @export
 */
export const OwnersApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = OwnersApiFp(configuration)
    return {
        /**
         * Used to resume an Owner retrieve session that was paused because an MFA token was required by the institution.
         * @summary Complete an owners request
         * @param {OwnersApiCompleteRequestRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        completeRequest(requestParameters: OwnersApiCompleteRequestRequest, options?: AxiosRequestConfig): AxiosPromise<Array<Owner>> {
            return localVarFp.completeRequest(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * Delete a specific owner from your Belvo account.
         * @summary Delete an owner
         * @param {OwnersApiDeleteRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        delete(requestParameters: OwnersApiDeleteRequest, options?: AxiosRequestConfig): AxiosPromise<void> {
            return localVarFp.delete(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * Get the details of a specific owner.
         * @summary Get an owner\'s details
         * @param {OwnersApiGetDetailsRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDetails(requestParameters: OwnersApiGetDetailsRequest, options?: AxiosRequestConfig): AxiosPromise<Owner> {
            return localVarFp.getDetails(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * Get a paginated list of all existing owners in your Belvo account. We return up to 100 results per page.
         * @summary List all owners
         * @param {OwnersApiListRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        list(requestParameters: OwnersApiListRequest = {}, options?: AxiosRequestConfig): AxiosPromise<OwnersPaginatedResponse> {
            return localVarFp.list(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * Retrieve owner information from a specific link.
         * @summary Retrieve owners for a link
         * @param {OwnersApiRetrieveRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        retrieve(requestParameters: OwnersApiRetrieveRequest, options?: AxiosRequestConfig): AxiosPromise<Array<Owner>> {
            return localVarFp.retrieve(requestParameters, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * Request parameters for completeRequest operation in OwnersApi.
 * @export
 * @interface OwnersApiCompleteRequestRequest
 */
export type OwnersApiCompleteRequestRequest = {
    
    /**
    * Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof OwnersApiCompleteRequest
    */
    readonly omit?: string
    
    /**
    * Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof OwnersApiCompleteRequest
    */
    readonly fields?: string
    
} & PatchBody

/**
 * Request parameters for delete operation in OwnersApi.
 * @export
 * @interface OwnersApiDeleteRequest
 */
export type OwnersApiDeleteRequest = {
    
    /**
    * The `owner.id` that you want to delete.
    * @type {string}
    * @memberof OwnersApiDelete
    */
    readonly id: string
    
}

/**
 * Request parameters for getDetails operation in OwnersApi.
 * @export
 * @interface OwnersApiGetDetailsRequest
 */
export type OwnersApiGetDetailsRequest = {
    
    /**
    * The `owner.id` you want to get detailed information about.
    * @type {string}
    * @memberof OwnersApiGetDetails
    */
    readonly id: string
    
    /**
    * Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof OwnersApiGetDetails
    */
    readonly omit?: string
    
    /**
    * Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof OwnersApiGetDetails
    */
    readonly fields?: string
    
}

/**
 * Request parameters for list operation in OwnersApi.
 * @export
 * @interface OwnersApiListRequest
 */
export type OwnersApiListRequest = {
    
    /**
    * A page number within the paginated result set.
    * @type {number}
    * @memberof OwnersApiList
    */
    readonly page?: number
    
    /**
    * Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000). 
    * @type {number}
    * @memberof OwnersApiList
    */
    readonly pageSize?: number
    
    /**
    * Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof OwnersApiList
    */
    readonly omit?: string
    
    /**
    * Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof OwnersApiList
    */
    readonly fields?: string
    
    /**
    * Return owners that were last updated in Belvo\'s database after this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    * @type {string}
    * @memberof OwnersApiList
    */
    readonly createdAtGt?: string
    
    /**
    * Return owners that were last updated in Belvo\'s database after or on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    * @type {string}
    * @memberof OwnersApiList
    */
    readonly createdAtGte?: string
    
    /**
    * Return owners that were last updated in Belvo\'s database before this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    * @type {string}
    * @memberof OwnersApiList
    */
    readonly createdAtLt?: string
    
    /**
    * Return owners that were last updated in Belvo\'s database before or on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    * @type {string}
    * @memberof OwnersApiList
    */
    readonly createdAtLte?: string
    
    /**
    * Return owners that were last updated in Belvo\'s database between two dates (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    * @type {string}
    * @memberof OwnersApiList
    */
    readonly createdAtRange?: string
    
    /**
    * Return owners whose full display name partially matches your query. For example, `mar` will return results for Mark, Maria, Neymar, Remarque, and so on.
    * @type {string}
    * @memberof OwnersApiList
    */
    readonly displayNameIcontains?: string
    
    /**
    * Returns owners whose email address match your query.
    * @type {string}
    * @memberof OwnersApiList
    */
    readonly email?: string
    
    /**
    * Return information only for this `owner.id`.
    * @type {string}
    * @memberof OwnersApiList
    */
    readonly id?: string
    
    /**
    * Return information only for these `owner.id`s.
    * @type {string}
    * @memberof OwnersApiList
    */
    readonly idIn?: string
    
    /**
    * Return information only for this `link.id`.
    * @type {string}
    * @memberof OwnersApiList
    */
    readonly link?: string
    
    /**
    * Return balances only for these `link.id`s.
    * @type {string}
    * @memberof OwnersApiList
    */
    readonly linkIn?: string
    
}

/**
 * Request parameters for retrieve operation in OwnersApi.
 * @export
 * @interface OwnersApiRetrieveRequest
 */
export type OwnersApiRetrieveRequest = {
    
    /**
    * Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof OwnersApiRetrieve
    */
    readonly omit?: string
    
    /**
    * Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof OwnersApiRetrieve
    */
    readonly fields?: string
    
} & StandardRequest

/**
 * OwnersApi - object-oriented interface
 * @export
 * @class OwnersApi
 * @extends {BaseAPI}
 */
export class OwnersApi extends OwnersApiCustom {
    /**
     * Used to resume an Owner retrieve session that was paused because an MFA token was required by the institution.
     * @summary Complete an owners request
     * @param {OwnersApiCompleteRequestRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof OwnersApi
     */
    public completeRequest(requestParameters: OwnersApiCompleteRequestRequest, options?: AxiosRequestConfig) {
        return OwnersApiFp(this.configuration).completeRequest(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * Delete a specific owner from your Belvo account.
     * @summary Delete an owner
     * @param {OwnersApiDeleteRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof OwnersApi
     */
    public delete(requestParameters: OwnersApiDeleteRequest, options?: AxiosRequestConfig) {
        return OwnersApiFp(this.configuration).delete(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * Get the details of a specific owner.
     * @summary Get an owner\'s details
     * @param {OwnersApiGetDetailsRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof OwnersApi
     */
    public getDetails(requestParameters: OwnersApiGetDetailsRequest, options?: AxiosRequestConfig) {
        return OwnersApiFp(this.configuration).getDetails(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * Get a paginated list of all existing owners in your Belvo account. We return up to 100 results per page.
     * @summary List all owners
     * @param {OwnersApiListRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof OwnersApi
     */
    public list(requestParameters: OwnersApiListRequest = {}, options?: AxiosRequestConfig) {
        return OwnersApiFp(this.configuration).list(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * Retrieve owner information from a specific link.
     * @summary Retrieve owners for a link
     * @param {OwnersApiRetrieveRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof OwnersApi
     */
    public retrieve(requestParameters: OwnersApiRetrieveRequest, options?: AxiosRequestConfig) {
        return OwnersApiFp(this.configuration).retrieve(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }
}
