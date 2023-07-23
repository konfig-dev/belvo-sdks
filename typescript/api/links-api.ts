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
import { ChangeAccessMode } from '../models';
// @ts-ignore
import { EnumLinkAccessModeRequest } from '../models';
// @ts-ignore
import { Link } from '../models';
// @ts-ignore
import { LinksChangeAccessModeResponseInner } from '../models';
// @ts-ignore
import { LinksCompleteRequestResponseInner } from '../models';
// @ts-ignore
import { LinksPutRequest } from '../models';
// @ts-ignore
import { LinksRequest } from '../models';
// @ts-ignore
import { NotFoundError } from '../models';
// @ts-ignore
import { PaginatedResponseLink } from '../models';
// @ts-ignore
import { PatchBodyWithoutSaveData } from '../models';
// @ts-ignore
import { TokenRequiredResponse } from '../models';
// @ts-ignore
import { UnauthorizedError } from '../models';
// @ts-ignore
import { UnexpectedError } from '../models';
import { paginate } from "../pagination/paginate";
import { requestBeforeHook } from '../requestBeforeHook';
import { LinksApiCustom } from "./links-api-custom";
/**
 * LinksApi - axios parameter creator
 * @export
 */
export const LinksApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Change a link\'s access mode from `single` to `recurrent` or from `recurrent` to single. ℹ️ **Note**: When you change a link from `single`` to `recurrent`, they will only be updated the next day at the scheduled interval.
         * @summary Change a link\'s access mode
         * @param {string} id The &#x60;link.id&#x60; you want to change the &#x60;access_mode&#x60; for.
         * @param {ChangeAccessMode} changeAccessMode 
         * @param {string} [omit] Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {string} [fields] Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        changeAccessMode: async (id: string, changeAccessMode: ChangeAccessMode, omit?: string, fields?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'id' is not null or undefined
            assertParamExists('changeAccessMode', 'id', id)
            // verify required parameter 'changeAccessMode' is not null or undefined
            assertParamExists('changeAccessMode', 'changeAccessMode', changeAccessMode)
            const localVarPath = `/api/links/{id}`
                .replace(`{${"id"}}`, encodeURIComponent(String(id !== undefined ? id : `-id-`)));
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
                requestBody: changeAccessMode,
                queryParameters: localVarQueryParameter,
                requestConfig: localVarRequestOptions,
                path: localVarPath,
                configuration
            });
            localVarRequestOptions.data = serializeDataIfNeeded(changeAccessMode, localVarRequestOptions, configuration)

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Used to resume a Link register session that was paused because an MFA token was required by the institution.
         * @summary Complete a links request
         * @param {PatchBodyWithoutSaveData} patchBodyWithoutSaveData 
         * @param {string} [omit] Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {string} [fields] Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        completeRequest: async (patchBodyWithoutSaveData: PatchBodyWithoutSaveData, omit?: string, fields?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'patchBodyWithoutSaveData' is not null or undefined
            assertParamExists('completeRequest', 'patchBodyWithoutSaveData', patchBodyWithoutSaveData)
            const localVarPath = `/api/links`;
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
                requestBody: patchBodyWithoutSaveData,
                queryParameters: localVarQueryParameter,
                requestConfig: localVarRequestOptions,
                path: localVarPath,
                configuration
            });
            localVarRequestOptions.data = serializeDataIfNeeded(patchBodyWithoutSaveData, localVarRequestOptions, configuration)

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Delete a specific link and all associated accounts, transactions, and owners from your Belvo account. # Deleting links in batches To delete links in bulk, we recommend looping through the list of links you want to delete and making the delete request.    > 🚧 **Rate limiting and IP blocking**   >    > An important technical note for performing operations in batches is to take into consideration our rate-limiting: up to 80 requests every 30 seconds. If you exceed this limit, you run the risk of Belvo blocking your IP from making further requests.   >    > For more information, or if your IP address has been blocked, please contact our [support team](https://support.belvo.com/hc/en-us/requests/new).
         * @summary Delete a link
         * @param {string} id The &#x60;link.id&#x60; that you want to delete.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        destroy: async (id: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'id' is not null or undefined
            assertParamExists('destroy', 'id', id)
            const localVarPath = `/api/links/{id}`
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
         * Get the details of a specific link.
         * @summary Get a link\'s details
         * @param {string} id The &#x60;link.id&#x60; you want to get detailed information about.
         * @param {string} [omit] Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {string} [fields] Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDetails: async (id: string, omit?: string, fields?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'id' is not null or undefined
            assertParamExists('getDetails', 'id', id)
            const localVarPath = `/api/links/{id}`
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
         * Get a paginated list of all the existing links in your Belvo account. By default, we return up to 100 results per page.
         * @summary List all links
         * @param {number} [page] A page number within the paginated result set.
         * @param {number} [pageSize] Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000). 
         * @param {string} [omit] Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {string} [fields] Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {string} [accessMode] Return links only with this access mode. Can be either &#x60;single&#x60; or &#x60;recurrent&#x60;.
         * @param {string} [createdAt] Return links that were last updated in Belvo\&#39;s database on this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp).
         * @param {string} [createdAtGt] Return links that were last updated in Belvo\&#39;s database after this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp).
         * @param {string} [createdAtGte] Return links that were last updated in Belvo\&#39;s database after or on this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp).
         * @param {string} [createdAtLt] Return links that were last updated in Belvo\&#39;s database before this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp).
         * @param {string} [createdAtLte] Return links that were last updated in Belvo\&#39;s database before or on this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp).
         * @param {string} [createdAtRange] Return links that were last updated in Belvo\&#39;s database between two dates (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp).
         * @param {string} [createdByNotIn] Return links that were not created by these Belvo users.
         * @param {string} [externalId] Return links with this external ID.
         * @param {string} [externalIdIn] Return links with these external IDs.
         * @param {string} [id] Return information only for this &#x60;link.id&#x60;.
         * @param {string} [idIn] Return information only for these &#x60;link.id&#x60;s.
         * @param {string} [institution] Return links created for this institution (use the Belvo-designated name, such as &#x60;erebor_mx_retail&#x60;).
         * @param {string} [institutionIn] Return links created for these institutions (use the Belvo-designated name, such as &#x60;erebor_mx_retail&#x60; and &#x60;gringotts_co_retail&#x60;).
         * @param {string} [institutionUserId] Return links with this specific institution user ID.
         * @param {string} [institutionUserIdIn] Return links with these institution user IDs.
         * @param {string} [refreshRate] Return links with this refresh rate. Choose between &#x60;6h&#x60;, &#x60;12h&#x60;, &#x60;24h&#x60;, &#x60;7d&#x60;, or &#x60;30d&#x60;.
         * @param {string} [status] Return links with this status. Choose between &#x60;valid&#x60;, &#x60;invalid&#x60;, &#x60;unconfirmed&#x60;, or &#x60;token_required&#x60;.
         * @param {string} [statusIn] Return links with these statuses. Choose between &#x60;valid&#x60;, &#x60;invalid&#x60;, &#x60;unconfirmed&#x60;, or &#x60;token_required&#x60;.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        list: async (page?: number, pageSize?: number, omit?: string, fields?: string, accessMode?: string, createdAt?: string, createdAtGt?: string, createdAtGte?: string, createdAtLt?: string, createdAtLte?: string, createdAtRange?: string, createdByNotIn?: string, externalId?: string, externalIdIn?: string, id?: string, idIn?: string, institution?: string, institutionIn?: string, institutionUserId?: string, institutionUserIdIn?: string, refreshRate?: string, status?: string, statusIn?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/api/links`;
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

            if (accessMode !== undefined) {
                localVarQueryParameter['access_mode'] = accessMode;
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

            if (createdByNotIn !== undefined) {
                localVarQueryParameter['created_by__not_in'] = createdByNotIn;
            }

            if (externalId !== undefined) {
                localVarQueryParameter['external_id'] = externalId;
            }

            if (externalIdIn !== undefined) {
                localVarQueryParameter['external_id__in'] = externalIdIn;
            }

            if (id !== undefined) {
                localVarQueryParameter['id'] = id;
            }

            if (idIn !== undefined) {
                localVarQueryParameter['id__in'] = idIn;
            }

            if (institution !== undefined) {
                localVarQueryParameter['institution'] = institution;
            }

            if (institutionIn !== undefined) {
                localVarQueryParameter['institution__in'] = institutionIn;
            }

            if (institutionUserId !== undefined) {
                localVarQueryParameter['institution_user_id'] = institutionUserId;
            }

            if (institutionUserIdIn !== undefined) {
                localVarQueryParameter['institution_user_id__in'] = institutionUserIdIn;
            }

            if (refreshRate !== undefined) {
                localVarQueryParameter['refresh_rate'] = refreshRate;
            }

            if (status !== undefined) {
                localVarQueryParameter['status'] = status;
            }

            if (statusIn !== undefined) {
                localVarQueryParameter['status__in'] = statusIn;
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
         * Register a new link with your Belvo account.  <div style=\"background-color:#f4f6f8; border-left: 6px solid #4CAF50;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\"> <strong>Note: </strong> We recommend using our <a href=\"https://developers.belvo.com/docs/connect-widget\" target=\"_blank\">Connect Widget</a> to handle link creation and link status updates. </div> 
         * @summary Register a new link
         * @param {LinksRequest} linksRequest 
         * @param {string} [omit] Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {string} [fields] Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        register: async (linksRequest: LinksRequest, omit?: string, fields?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'linksRequest' is not null or undefined
            assertParamExists('register', 'linksRequest', linksRequest)
            const localVarPath = `/api/links`;
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
                requestBody: linksRequest,
                queryParameters: localVarQueryParameter,
                requestConfig: localVarRequestOptions,
                path: localVarPath,
                configuration
            });
            localVarRequestOptions.data = serializeDataIfNeeded(linksRequest, localVarRequestOptions, configuration)

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Update the credentials of a specific link. If the successfully updated link is a recurrent one, we automatically trigger an update of the link. If we find fresh data, you\'ll [receive historical update](https://developers.belvo.com/docs/webhooks) webhooks. <div style=\"background-color:#f4f6f8; border-left: 6px solid #4CAF50;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\"> <strong>Note: </strong> We recommend using our <a href=\"https://developers.belvo.com/docs/connect-widget\" target=\"_blank\">Connect Widget</a> to handle updating <code>invalid</code> or <code>token_required</code> links. </div> 
         * @summary Update a link\'s credentials
         * @param {string} id The &#x60;link.id&#x60; you want to update.
         * @param {LinksPutRequest} linksPutRequest 
         * @param {string} [omit] Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {string} [fields] Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        update: async (id: string, linksPutRequest: LinksPutRequest, omit?: string, fields?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'id' is not null or undefined
            assertParamExists('update', 'id', id)
            // verify required parameter 'linksPutRequest' is not null or undefined
            assertParamExists('update', 'linksPutRequest', linksPutRequest)
            const localVarPath = `/api/links/{id}`
                .replace(`{${"id"}}`, encodeURIComponent(String(id !== undefined ? id : `-id-`)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions: AxiosRequestConfig = { method: 'PUT', ...baseOptions, ...options};
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
                requestBody: linksPutRequest,
                queryParameters: localVarQueryParameter,
                requestConfig: localVarRequestOptions,
                path: localVarPath,
                configuration
            });
            localVarRequestOptions.data = serializeDataIfNeeded(linksPutRequest, localVarRequestOptions, configuration)

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * LinksApi - functional programming interface
 * @export
 */
export const LinksApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = LinksApiAxiosParamCreator(configuration)
    return {
        /**
         * Change a link\'s access mode from `single` to `recurrent` or from `recurrent` to single. ℹ️ **Note**: When you change a link from `single`` to `recurrent`, they will only be updated the next day at the scheduled interval.
         * @summary Change a link\'s access mode
         * @param {LinksApiChangeAccessModeRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async changeAccessMode(requestParameters: LinksApiChangeAccessModeRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<Link>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.changeAccessMode(requestParameters.id, requestParameters, requestParameters.omit, requestParameters.fields, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Used to resume a Link register session that was paused because an MFA token was required by the institution.
         * @summary Complete a links request
         * @param {LinksApiCompleteRequestRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async completeRequest(requestParameters: LinksApiCompleteRequestRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<Link>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.completeRequest(requestParameters, requestParameters.omit, requestParameters.fields, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Delete a specific link and all associated accounts, transactions, and owners from your Belvo account. # Deleting links in batches To delete links in bulk, we recommend looping through the list of links you want to delete and making the delete request.    > 🚧 **Rate limiting and IP blocking**   >    > An important technical note for performing operations in batches is to take into consideration our rate-limiting: up to 80 requests every 30 seconds. If you exceed this limit, you run the risk of Belvo blocking your IP from making further requests.   >    > For more information, or if your IP address has been blocked, please contact our [support team](https://support.belvo.com/hc/en-us/requests/new).
         * @summary Delete a link
         * @param {LinksApiDestroyRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async destroy(requestParameters: LinksApiDestroyRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<void>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.destroy(requestParameters.id, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Get the details of a specific link.
         * @summary Get a link\'s details
         * @param {LinksApiGetDetailsRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getDetails(requestParameters: LinksApiGetDetailsRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<Link>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getDetails(requestParameters.id, requestParameters.omit, requestParameters.fields, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Get a paginated list of all the existing links in your Belvo account. By default, we return up to 100 results per page.
         * @summary List all links
         * @param {LinksApiListRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async list(requestParameters: LinksApiListRequest = {}, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<PaginatedResponseLink>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.list(requestParameters.page, requestParameters.pageSize, requestParameters.omit, requestParameters.fields, requestParameters.accessMode, requestParameters.createdAt, requestParameters.createdAtGt, requestParameters.createdAtGte, requestParameters.createdAtLt, requestParameters.createdAtLte, requestParameters.createdAtRange, requestParameters.createdByNotIn, requestParameters.externalId, requestParameters.externalIdIn, requestParameters.id, requestParameters.idIn, requestParameters.institution, requestParameters.institutionIn, requestParameters.institutionUserId, requestParameters.institutionUserIdIn, requestParameters.refreshRate, requestParameters.status, requestParameters.statusIn, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Register a new link with your Belvo account.  <div style=\"background-color:#f4f6f8; border-left: 6px solid #4CAF50;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\"> <strong>Note: </strong> We recommend using our <a href=\"https://developers.belvo.com/docs/connect-widget\" target=\"_blank\">Connect Widget</a> to handle link creation and link status updates. </div> 
         * @summary Register a new link
         * @param {LinksApiRegisterRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async register(requestParameters: LinksApiRegisterRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<Link>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.register(requestParameters, requestParameters.omit, requestParameters.fields, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Update the credentials of a specific link. If the successfully updated link is a recurrent one, we automatically trigger an update of the link. If we find fresh data, you\'ll [receive historical update](https://developers.belvo.com/docs/webhooks) webhooks. <div style=\"background-color:#f4f6f8; border-left: 6px solid #4CAF50;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\"> <strong>Note: </strong> We recommend using our <a href=\"https://developers.belvo.com/docs/connect-widget\" target=\"_blank\">Connect Widget</a> to handle updating <code>invalid</code> or <code>token_required</code> links. </div> 
         * @summary Update a link\'s credentials
         * @param {LinksApiUpdateRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async update(requestParameters: LinksApiUpdateRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<Link>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.update(requestParameters.id, requestParameters, requestParameters.omit, requestParameters.fields, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * LinksApi - factory interface
 * @export
 */
export const LinksApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = LinksApiFp(configuration)
    return {
        /**
         * Change a link\'s access mode from `single` to `recurrent` or from `recurrent` to single. ℹ️ **Note**: When you change a link from `single`` to `recurrent`, they will only be updated the next day at the scheduled interval.
         * @summary Change a link\'s access mode
         * @param {LinksApiChangeAccessModeRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        changeAccessMode(requestParameters: LinksApiChangeAccessModeRequest, options?: AxiosRequestConfig): AxiosPromise<Link> {
            return localVarFp.changeAccessMode(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * Used to resume a Link register session that was paused because an MFA token was required by the institution.
         * @summary Complete a links request
         * @param {LinksApiCompleteRequestRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        completeRequest(requestParameters: LinksApiCompleteRequestRequest, options?: AxiosRequestConfig): AxiosPromise<Link> {
            return localVarFp.completeRequest(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * Delete a specific link and all associated accounts, transactions, and owners from your Belvo account. # Deleting links in batches To delete links in bulk, we recommend looping through the list of links you want to delete and making the delete request.    > 🚧 **Rate limiting and IP blocking**   >    > An important technical note for performing operations in batches is to take into consideration our rate-limiting: up to 80 requests every 30 seconds. If you exceed this limit, you run the risk of Belvo blocking your IP from making further requests.   >    > For more information, or if your IP address has been blocked, please contact our [support team](https://support.belvo.com/hc/en-us/requests/new).
         * @summary Delete a link
         * @param {LinksApiDestroyRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        destroy(requestParameters: LinksApiDestroyRequest, options?: AxiosRequestConfig): AxiosPromise<void> {
            return localVarFp.destroy(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * Get the details of a specific link.
         * @summary Get a link\'s details
         * @param {LinksApiGetDetailsRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDetails(requestParameters: LinksApiGetDetailsRequest, options?: AxiosRequestConfig): AxiosPromise<Link> {
            return localVarFp.getDetails(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * Get a paginated list of all the existing links in your Belvo account. By default, we return up to 100 results per page.
         * @summary List all links
         * @param {LinksApiListRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        list(requestParameters: LinksApiListRequest = {}, options?: AxiosRequestConfig): AxiosPromise<PaginatedResponseLink> {
            return localVarFp.list(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * Register a new link with your Belvo account.  <div style=\"background-color:#f4f6f8; border-left: 6px solid #4CAF50;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\"> <strong>Note: </strong> We recommend using our <a href=\"https://developers.belvo.com/docs/connect-widget\" target=\"_blank\">Connect Widget</a> to handle link creation and link status updates. </div> 
         * @summary Register a new link
         * @param {LinksApiRegisterRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        register(requestParameters: LinksApiRegisterRequest, options?: AxiosRequestConfig): AxiosPromise<Link> {
            return localVarFp.register(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * Update the credentials of a specific link. If the successfully updated link is a recurrent one, we automatically trigger an update of the link. If we find fresh data, you\'ll [receive historical update](https://developers.belvo.com/docs/webhooks) webhooks. <div style=\"background-color:#f4f6f8; border-left: 6px solid #4CAF50;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\"> <strong>Note: </strong> We recommend using our <a href=\"https://developers.belvo.com/docs/connect-widget\" target=\"_blank\">Connect Widget</a> to handle updating <code>invalid</code> or <code>token_required</code> links. </div> 
         * @summary Update a link\'s credentials
         * @param {LinksApiUpdateRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        update(requestParameters: LinksApiUpdateRequest, options?: AxiosRequestConfig): AxiosPromise<Link> {
            return localVarFp.update(requestParameters, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * Request parameters for changeAccessMode operation in LinksApi.
 * @export
 * @interface LinksApiChangeAccessModeRequest
 */
export type LinksApiChangeAccessModeRequest = {
    
    /**
    * The `link.id` you want to change the `access_mode` for.
    * @type {string}
    * @memberof LinksApiChangeAccessMode
    */
    readonly id: string
    
    /**
    * Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof LinksApiChangeAccessMode
    */
    readonly omit?: string
    
    /**
    * Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof LinksApiChangeAccessMode
    */
    readonly fields?: string
    
} & ChangeAccessMode

/**
 * Request parameters for completeRequest operation in LinksApi.
 * @export
 * @interface LinksApiCompleteRequestRequest
 */
export type LinksApiCompleteRequestRequest = {
    
    /**
    * Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof LinksApiCompleteRequest
    */
    readonly omit?: string
    
    /**
    * Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof LinksApiCompleteRequest
    */
    readonly fields?: string
    
} & PatchBodyWithoutSaveData

/**
 * Request parameters for destroy operation in LinksApi.
 * @export
 * @interface LinksApiDestroyRequest
 */
export type LinksApiDestroyRequest = {
    
    /**
    * The `link.id` that you want to delete.
    * @type {string}
    * @memberof LinksApiDestroy
    */
    readonly id: string
    
}

/**
 * Request parameters for getDetails operation in LinksApi.
 * @export
 * @interface LinksApiGetDetailsRequest
 */
export type LinksApiGetDetailsRequest = {
    
    /**
    * The `link.id` you want to get detailed information about.
    * @type {string}
    * @memberof LinksApiGetDetails
    */
    readonly id: string
    
    /**
    * Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof LinksApiGetDetails
    */
    readonly omit?: string
    
    /**
    * Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof LinksApiGetDetails
    */
    readonly fields?: string
    
}

/**
 * Request parameters for list operation in LinksApi.
 * @export
 * @interface LinksApiListRequest
 */
export type LinksApiListRequest = {
    
    /**
    * A page number within the paginated result set.
    * @type {number}
    * @memberof LinksApiList
    */
    readonly page?: number
    
    /**
    * Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000). 
    * @type {number}
    * @memberof LinksApiList
    */
    readonly pageSize?: number
    
    /**
    * Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof LinksApiList
    */
    readonly omit?: string
    
    /**
    * Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof LinksApiList
    */
    readonly fields?: string
    
    /**
    * Return links only with this access mode. Can be either `single` or `recurrent`.
    * @type {string}
    * @memberof LinksApiList
    */
    readonly accessMode?: string
    
    /**
    * Return links that were last updated in Belvo\'s database on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    * @type {string}
    * @memberof LinksApiList
    */
    readonly createdAt?: string
    
    /**
    * Return links that were last updated in Belvo\'s database after this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    * @type {string}
    * @memberof LinksApiList
    */
    readonly createdAtGt?: string
    
    /**
    * Return links that were last updated in Belvo\'s database after or on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    * @type {string}
    * @memberof LinksApiList
    */
    readonly createdAtGte?: string
    
    /**
    * Return links that were last updated in Belvo\'s database before this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    * @type {string}
    * @memberof LinksApiList
    */
    readonly createdAtLt?: string
    
    /**
    * Return links that were last updated in Belvo\'s database before or on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    * @type {string}
    * @memberof LinksApiList
    */
    readonly createdAtLte?: string
    
    /**
    * Return links that were last updated in Belvo\'s database between two dates (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    * @type {string}
    * @memberof LinksApiList
    */
    readonly createdAtRange?: string
    
    /**
    * Return links that were not created by these Belvo users.
    * @type {string}
    * @memberof LinksApiList
    */
    readonly createdByNotIn?: string
    
    /**
    * Return links with this external ID.
    * @type {string}
    * @memberof LinksApiList
    */
    readonly externalId?: string
    
    /**
    * Return links with these external IDs.
    * @type {string}
    * @memberof LinksApiList
    */
    readonly externalIdIn?: string
    
    /**
    * Return information only for this `link.id`.
    * @type {string}
    * @memberof LinksApiList
    */
    readonly id?: string
    
    /**
    * Return information only for these `link.id`s.
    * @type {string}
    * @memberof LinksApiList
    */
    readonly idIn?: string
    
    /**
    * Return links created for this institution (use the Belvo-designated name, such as `erebor_mx_retail`).
    * @type {string}
    * @memberof LinksApiList
    */
    readonly institution?: string
    
    /**
    * Return links created for these institutions (use the Belvo-designated name, such as `erebor_mx_retail` and `gringotts_co_retail`).
    * @type {string}
    * @memberof LinksApiList
    */
    readonly institutionIn?: string
    
    /**
    * Return links with this specific institution user ID.
    * @type {string}
    * @memberof LinksApiList
    */
    readonly institutionUserId?: string
    
    /**
    * Return links with these institution user IDs.
    * @type {string}
    * @memberof LinksApiList
    */
    readonly institutionUserIdIn?: string
    
    /**
    * Return links with this refresh rate. Choose between `6h`, `12h`, `24h`, `7d`, or `30d`.
    * @type {string}
    * @memberof LinksApiList
    */
    readonly refreshRate?: string
    
    /**
    * Return links with this status. Choose between `valid`, `invalid`, `unconfirmed`, or `token_required`.
    * @type {string}
    * @memberof LinksApiList
    */
    readonly status?: string
    
    /**
    * Return links with these statuses. Choose between `valid`, `invalid`, `unconfirmed`, or `token_required`.
    * @type {string}
    * @memberof LinksApiList
    */
    readonly statusIn?: string
    
}

/**
 * Request parameters for register operation in LinksApi.
 * @export
 * @interface LinksApiRegisterRequest
 */
export type LinksApiRegisterRequest = {
    
    /**
    * Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof LinksApiRegister
    */
    readonly omit?: string
    
    /**
    * Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof LinksApiRegister
    */
    readonly fields?: string
    
} & LinksRequest

/**
 * Request parameters for update operation in LinksApi.
 * @export
 * @interface LinksApiUpdateRequest
 */
export type LinksApiUpdateRequest = {
    
    /**
    * The `link.id` you want to update.
    * @type {string}
    * @memberof LinksApiUpdate
    */
    readonly id: string
    
    /**
    * Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof LinksApiUpdate
    */
    readonly omit?: string
    
    /**
    * Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof LinksApiUpdate
    */
    readonly fields?: string
    
} & LinksPutRequest

/**
 * LinksApi - object-oriented interface
 * @export
 * @class LinksApi
 * @extends {BaseAPI}
 */
export class LinksApi extends LinksApiCustom {
    /**
     * Change a link\'s access mode from `single` to `recurrent` or from `recurrent` to single. ℹ️ **Note**: When you change a link from `single`` to `recurrent`, they will only be updated the next day at the scheduled interval.
     * @summary Change a link\'s access mode
     * @param {LinksApiChangeAccessModeRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof LinksApi
     */
    public changeAccessMode(requestParameters: LinksApiChangeAccessModeRequest, options?: AxiosRequestConfig) {
        return LinksApiFp(this.configuration).changeAccessMode(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * Used to resume a Link register session that was paused because an MFA token was required by the institution.
     * @summary Complete a links request
     * @param {LinksApiCompleteRequestRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof LinksApi
     */
    public completeRequest(requestParameters: LinksApiCompleteRequestRequest, options?: AxiosRequestConfig) {
        return LinksApiFp(this.configuration).completeRequest(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * Delete a specific link and all associated accounts, transactions, and owners from your Belvo account. # Deleting links in batches To delete links in bulk, we recommend looping through the list of links you want to delete and making the delete request.    > 🚧 **Rate limiting and IP blocking**   >    > An important technical note for performing operations in batches is to take into consideration our rate-limiting: up to 80 requests every 30 seconds. If you exceed this limit, you run the risk of Belvo blocking your IP from making further requests.   >    > For more information, or if your IP address has been blocked, please contact our [support team](https://support.belvo.com/hc/en-us/requests/new).
     * @summary Delete a link
     * @param {LinksApiDestroyRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof LinksApi
     */
    public destroy(requestParameters: LinksApiDestroyRequest, options?: AxiosRequestConfig) {
        return LinksApiFp(this.configuration).destroy(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * Get the details of a specific link.
     * @summary Get a link\'s details
     * @param {LinksApiGetDetailsRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof LinksApi
     */
    public getDetails(requestParameters: LinksApiGetDetailsRequest, options?: AxiosRequestConfig) {
        return LinksApiFp(this.configuration).getDetails(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * Get a paginated list of all the existing links in your Belvo account. By default, we return up to 100 results per page.
     * @summary List all links
     * @param {LinksApiListRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof LinksApi
     */
    public list(requestParameters: LinksApiListRequest = {}, options?: AxiosRequestConfig) {
        return LinksApiFp(this.configuration).list(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * Register a new link with your Belvo account.  <div style=\"background-color:#f4f6f8; border-left: 6px solid #4CAF50;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\"> <strong>Note: </strong> We recommend using our <a href=\"https://developers.belvo.com/docs/connect-widget\" target=\"_blank\">Connect Widget</a> to handle link creation and link status updates. </div> 
     * @summary Register a new link
     * @param {LinksApiRegisterRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof LinksApi
     */
    public register(requestParameters: LinksApiRegisterRequest, options?: AxiosRequestConfig) {
        return LinksApiFp(this.configuration).register(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * Update the credentials of a specific link. If the successfully updated link is a recurrent one, we automatically trigger an update of the link. If we find fresh data, you\'ll [receive historical update](https://developers.belvo.com/docs/webhooks) webhooks. <div style=\"background-color:#f4f6f8; border-left: 6px solid #4CAF50;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\"> <strong>Note: </strong> We recommend using our <a href=\"https://developers.belvo.com/docs/connect-widget\" target=\"_blank\">Connect Widget</a> to handle updating <code>invalid</code> or <code>token_required</code> links. </div> 
     * @summary Update a link\'s credentials
     * @param {LinksApiUpdateRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof LinksApi
     */
    public update(requestParameters: LinksApiUpdateRequest, options?: AxiosRequestConfig) {
        return LinksApiFp(this.configuration).update(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }
}
