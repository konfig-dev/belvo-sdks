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
import { Balance } from '../models';
// @ts-ignore
import { BalancesPaginatedResponse } from '../models';
// @ts-ignore
import { BalancesRequest } from '../models';
// @ts-ignore
import { LinksCompleteRequestResponseInner } from '../models';
// @ts-ignore
import { NotFoundError } from '../models';
// @ts-ignore
import { PatchBody } from '../models';
// @ts-ignore
import { RequestTimeoutError } from '../models';
// @ts-ignore
import { TokenRequiredResponse } from '../models';
// @ts-ignore
import { UnauthorizedError } from '../models';
// @ts-ignore
import { UnexpectedError } from '../models';
import { paginate } from "../pagination/paginate";
import { requestBeforeHook } from '../requestBeforeHook';
import { BalancesApiCustom } from "./balances-api-custom";
/**
 * BalancesApi - axios parameter creator
 * @export
 */
export const BalancesApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Used to resume a Balance retrieve session that was paused because an MFA token was required by the institution.
         * @summary Complete a balances request
         * @param {PatchBody} patchBody 
         * @param {string} [omit] Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {string} [fields] Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        completeRequest: async (patchBody: PatchBody, omit?: string, fields?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'patchBody' is not null or undefined
            assertParamExists('completeRequest', 'patchBody', patchBody)
            const localVarPath = `/api/balances`;
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
         * Delete a specific balance from your Belvo account.
         * @summary Delete a balance
         * @param {string} id The &#x60;balance.id&#x60; that you want to delete.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        delete: async (id: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'id' is not null or undefined
            assertParamExists('delete', 'id', id)
            const localVarPath = `/api/balances/{id}`
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
         * Get the details of a specific balance.
         * @summary Get a balance\'s details
         * @param {string} id The &#x60;balance.id&#x60; you want to get detailed information about.
         * @param {string} [omit] Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {string} [fields] Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDetails: async (id: string, omit?: string, fields?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'id' is not null or undefined
            assertParamExists('getDetails', 'id', id)
            const localVarPath = `/api/balances/{id}`
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
         * Get a paginated list of all existing balances in your Belvo account. By default, we return up to 100 results per page.
         * @summary List all balances
         * @param {number} [page] A page number within the paginated result set.
         * @param {number} [pageSize] Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000). 
         * @param {string} [omit] Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {string} [fields] Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {string} [link] The &#x60;link.id&#x60; you want to filter by.  ℹ️ We highly recommend adding either the &#x60;link.id&#x60; or the &#x60;account.id&#x60; filters in order to improve your performance. 
         * @param {string} [account] The &#x60;account.id&#x60; you want to filter by.  ℹ️ We highly recommend adding either the &#x60;link.id&#x60; or the &#x60;account.id&#x60; filters in order to improve your performance. 
         * @param {string} [accountIn] Return balances only for these &#x60;account.id&#x60;s.
         * @param {string} [accountType] Return information only for accounts matching this account type, as designated by the institution.
         * @param {string} [accountTypeIn] Return information only for accounts matching these account types, as designated by the institution.
         * @param {string} [balance] Return balances matching exactly this value.
         * @param {string} [balanceLt] Return balances less than this value.
         * @param {string} [balanceLte] Return balances less than or equal to this value.
         * @param {string} [balanceGt] Return balances greater than this value.
         * @param {string} [balanceGte] Return balances greater than or equal to this value.
         * @param {string} [balanceRange] Return balances between these two values.
         * @param {string} [currency] Return balances that are in this three-letter currency code.
         * @param {string} [currencyIn] Return balances that are in these three-letter currency codes.
         * @param {string} [id] Return information only for this &#x60;balance.id&#x60;.
         * @param {string} [idIn] Return information only for these &#x60;balance.id&#x60;s.
         * @param {string} [institution] Return balances only for this institution (use the Belvo-designated name, such as &#x60;erebor_mx_retail&#x60;).
         * @param {string} [institutionIn] Return balances only for these institutions (use the Belvo-designated names, such as &#x60;erebor_mx_retail&#x60; and &#x60;gringotts_mx_retail&#x60;).
         * @param {string} [linkIn] Return balances only for these &#x60;link.id&#x60;s.
         * @param {string} [valueDate] Return balances for exactly this date (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp).
         * @param {string} [valueDateGt] Return balances for after this date (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp).
         * @param {string} [valueDateGte] Return balances for this date or later (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp).
         * @param {string} [valueDateLt] Return balances for before this date (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp).
         * @param {string} [valueDateLte] Return balances for this date or earlier (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp).
         * @param {string} [valueDateRange] Return balances for this date range (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp).
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        list: async (page?: number, pageSize?: number, omit?: string, fields?: string, link?: string, account?: string, accountIn?: string, accountType?: string, accountTypeIn?: string, balance?: string, balanceLt?: string, balanceLte?: string, balanceGt?: string, balanceGte?: string, balanceRange?: string, currency?: string, currencyIn?: string, id?: string, idIn?: string, institution?: string, institutionIn?: string, linkIn?: string, valueDate?: string, valueDateGt?: string, valueDateGte?: string, valueDateLt?: string, valueDateLte?: string, valueDateRange?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/api/balances`;
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

            if (link !== undefined) {
                localVarQueryParameter['link'] = link;
            }

            if (account !== undefined) {
                localVarQueryParameter['account'] = account;
            }

            if (accountIn !== undefined) {
                localVarQueryParameter['account__in'] = accountIn;
            }

            if (accountType !== undefined) {
                localVarQueryParameter['account__type'] = accountType;
            }

            if (accountTypeIn !== undefined) {
                localVarQueryParameter['account__type__in'] = accountTypeIn;
            }

            if (balance !== undefined) {
                localVarQueryParameter['balance'] = balance;
            }

            if (balanceLt !== undefined) {
                localVarQueryParameter['balance__lt'] = balanceLt;
            }

            if (balanceLte !== undefined) {
                localVarQueryParameter['balance__lte'] = balanceLte;
            }

            if (balanceGt !== undefined) {
                localVarQueryParameter['balance__gt'] = balanceGt;
            }

            if (balanceGte !== undefined) {
                localVarQueryParameter['balance__gte'] = balanceGte;
            }

            if (balanceRange !== undefined) {
                localVarQueryParameter['balance__range'] = balanceRange;
            }

            if (currency !== undefined) {
                localVarQueryParameter['currency'] = currency;
            }

            if (currencyIn !== undefined) {
                localVarQueryParameter['currency__in'] = currencyIn;
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

            if (linkIn !== undefined) {
                localVarQueryParameter['link__in'] = linkIn;
            }

            if (valueDate !== undefined) {
                localVarQueryParameter['value_date'] = valueDate;
            }

            if (valueDateGt !== undefined) {
                localVarQueryParameter['value_date__gt'] = valueDateGt;
            }

            if (valueDateGte !== undefined) {
                localVarQueryParameter['value_date__gte'] = valueDateGte;
            }

            if (valueDateLt !== undefined) {
                localVarQueryParameter['value_date__lt'] = valueDateLt;
            }

            if (valueDateLte !== undefined) {
                localVarQueryParameter['value_date__lte'] = valueDateLte;
            }

            if (valueDateRange !== undefined) {
                localVarQueryParameter['value_date__range'] = valueDateRange;
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
         * Retrieve balances from one or more accounts for a specific link within a specified date range.
         * @summary Retrieve balances for a link
         * @param {BalancesRequest} balancesRequest 
         * @param {string} [omit] Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {string} [fields] Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        retrieve: async (balancesRequest: BalancesRequest, omit?: string, fields?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'balancesRequest' is not null or undefined
            assertParamExists('retrieve', 'balancesRequest', balancesRequest)
            const localVarPath = `/api/balances`;
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
                requestBody: balancesRequest,
                queryParameters: localVarQueryParameter,
                requestConfig: localVarRequestOptions,
                path: localVarPath,
                configuration
            });
            localVarRequestOptions.data = serializeDataIfNeeded(balancesRequest, localVarRequestOptions, configuration)

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * BalancesApi - functional programming interface
 * @export
 */
export const BalancesApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = BalancesApiAxiosParamCreator(configuration)
    return {
        /**
         * Used to resume a Balance retrieve session that was paused because an MFA token was required by the institution.
         * @summary Complete a balances request
         * @param {BalancesApiCompleteRequestRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async completeRequest(requestParameters: BalancesApiCompleteRequestRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<Array<Balance>>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.completeRequest(requestParameters, requestParameters.omit, requestParameters.fields, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Delete a specific balance from your Belvo account.
         * @summary Delete a balance
         * @param {BalancesApiDeleteRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async delete(requestParameters: BalancesApiDeleteRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<void>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.delete(requestParameters.id, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Get the details of a specific balance.
         * @summary Get a balance\'s details
         * @param {BalancesApiGetDetailsRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getDetails(requestParameters: BalancesApiGetDetailsRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<Balance>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getDetails(requestParameters.id, requestParameters.omit, requestParameters.fields, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Get a paginated list of all existing balances in your Belvo account. By default, we return up to 100 results per page.
         * @summary List all balances
         * @param {BalancesApiListRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async list(requestParameters: BalancesApiListRequest = {}, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<BalancesPaginatedResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.list(requestParameters.page, requestParameters.pageSize, requestParameters.omit, requestParameters.fields, requestParameters.link, requestParameters.account, requestParameters.accountIn, requestParameters.accountType, requestParameters.accountTypeIn, requestParameters.balance, requestParameters.balanceLt, requestParameters.balanceLte, requestParameters.balanceGt, requestParameters.balanceGte, requestParameters.balanceRange, requestParameters.currency, requestParameters.currencyIn, requestParameters.id, requestParameters.idIn, requestParameters.institution, requestParameters.institutionIn, requestParameters.linkIn, requestParameters.valueDate, requestParameters.valueDateGt, requestParameters.valueDateGte, requestParameters.valueDateLt, requestParameters.valueDateLte, requestParameters.valueDateRange, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Retrieve balances from one or more accounts for a specific link within a specified date range.
         * @summary Retrieve balances for a link
         * @param {BalancesApiRetrieveRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async retrieve(requestParameters: BalancesApiRetrieveRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<Array<Balance>>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.retrieve(requestParameters, requestParameters.omit, requestParameters.fields, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * BalancesApi - factory interface
 * @export
 */
export const BalancesApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = BalancesApiFp(configuration)
    return {
        /**
         * Used to resume a Balance retrieve session that was paused because an MFA token was required by the institution.
         * @summary Complete a balances request
         * @param {BalancesApiCompleteRequestRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        completeRequest(requestParameters: BalancesApiCompleteRequestRequest, options?: AxiosRequestConfig): AxiosPromise<Array<Balance>> {
            return localVarFp.completeRequest(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * Delete a specific balance from your Belvo account.
         * @summary Delete a balance
         * @param {BalancesApiDeleteRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        delete(requestParameters: BalancesApiDeleteRequest, options?: AxiosRequestConfig): AxiosPromise<void> {
            return localVarFp.delete(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * Get the details of a specific balance.
         * @summary Get a balance\'s details
         * @param {BalancesApiGetDetailsRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDetails(requestParameters: BalancesApiGetDetailsRequest, options?: AxiosRequestConfig): AxiosPromise<Balance> {
            return localVarFp.getDetails(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * Get a paginated list of all existing balances in your Belvo account. By default, we return up to 100 results per page.
         * @summary List all balances
         * @param {BalancesApiListRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        list(requestParameters: BalancesApiListRequest = {}, options?: AxiosRequestConfig): AxiosPromise<BalancesPaginatedResponse> {
            return localVarFp.list(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * Retrieve balances from one or more accounts for a specific link within a specified date range.
         * @summary Retrieve balances for a link
         * @param {BalancesApiRetrieveRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        retrieve(requestParameters: BalancesApiRetrieveRequest, options?: AxiosRequestConfig): AxiosPromise<Array<Balance>> {
            return localVarFp.retrieve(requestParameters, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * Request parameters for completeRequest operation in BalancesApi.
 * @export
 * @interface BalancesApiCompleteRequestRequest
 */
export type BalancesApiCompleteRequestRequest = {
    
    /**
    * Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof BalancesApiCompleteRequest
    */
    readonly omit?: string
    
    /**
    * Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof BalancesApiCompleteRequest
    */
    readonly fields?: string
    
} & PatchBody

/**
 * Request parameters for delete operation in BalancesApi.
 * @export
 * @interface BalancesApiDeleteRequest
 */
export type BalancesApiDeleteRequest = {
    
    /**
    * The `balance.id` that you want to delete.
    * @type {string}
    * @memberof BalancesApiDelete
    */
    readonly id: string
    
}

/**
 * Request parameters for getDetails operation in BalancesApi.
 * @export
 * @interface BalancesApiGetDetailsRequest
 */
export type BalancesApiGetDetailsRequest = {
    
    /**
    * The `balance.id` you want to get detailed information about.
    * @type {string}
    * @memberof BalancesApiGetDetails
    */
    readonly id: string
    
    /**
    * Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof BalancesApiGetDetails
    */
    readonly omit?: string
    
    /**
    * Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof BalancesApiGetDetails
    */
    readonly fields?: string
    
}

/**
 * Request parameters for list operation in BalancesApi.
 * @export
 * @interface BalancesApiListRequest
 */
export type BalancesApiListRequest = {
    
    /**
    * A page number within the paginated result set.
    * @type {number}
    * @memberof BalancesApiList
    */
    readonly page?: number
    
    /**
    * Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000). 
    * @type {number}
    * @memberof BalancesApiList
    */
    readonly pageSize?: number
    
    /**
    * Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof BalancesApiList
    */
    readonly omit?: string
    
    /**
    * Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof BalancesApiList
    */
    readonly fields?: string
    
    /**
    * The `link.id` you want to filter by.  ℹ️ We highly recommend adding either the `link.id` or the `account.id` filters in order to improve your performance. 
    * @type {string}
    * @memberof BalancesApiList
    */
    readonly link?: string
    
    /**
    * The `account.id` you want to filter by.  ℹ️ We highly recommend adding either the `link.id` or the `account.id` filters in order to improve your performance. 
    * @type {string}
    * @memberof BalancesApiList
    */
    readonly account?: string
    
    /**
    * Return balances only for these `account.id`s.
    * @type {string}
    * @memberof BalancesApiList
    */
    readonly accountIn?: string
    
    /**
    * Return information only for accounts matching this account type, as designated by the institution.
    * @type {string}
    * @memberof BalancesApiList
    */
    readonly accountType?: string
    
    /**
    * Return information only for accounts matching these account types, as designated by the institution.
    * @type {string}
    * @memberof BalancesApiList
    */
    readonly accountTypeIn?: string
    
    /**
    * Return balances matching exactly this value.
    * @type {string}
    * @memberof BalancesApiList
    */
    readonly balance?: string
    
    /**
    * Return balances less than this value.
    * @type {string}
    * @memberof BalancesApiList
    */
    readonly balanceLt?: string
    
    /**
    * Return balances less than or equal to this value.
    * @type {string}
    * @memberof BalancesApiList
    */
    readonly balanceLte?: string
    
    /**
    * Return balances greater than this value.
    * @type {string}
    * @memberof BalancesApiList
    */
    readonly balanceGt?: string
    
    /**
    * Return balances greater than or equal to this value.
    * @type {string}
    * @memberof BalancesApiList
    */
    readonly balanceGte?: string
    
    /**
    * Return balances between these two values.
    * @type {string}
    * @memberof BalancesApiList
    */
    readonly balanceRange?: string
    
    /**
    * Return balances that are in this three-letter currency code.
    * @type {string}
    * @memberof BalancesApiList
    */
    readonly currency?: string
    
    /**
    * Return balances that are in these three-letter currency codes.
    * @type {string}
    * @memberof BalancesApiList
    */
    readonly currencyIn?: string
    
    /**
    * Return information only for this `balance.id`.
    * @type {string}
    * @memberof BalancesApiList
    */
    readonly id?: string
    
    /**
    * Return information only for these `balance.id`s.
    * @type {string}
    * @memberof BalancesApiList
    */
    readonly idIn?: string
    
    /**
    * Return balances only for this institution (use the Belvo-designated name, such as `erebor_mx_retail`).
    * @type {string}
    * @memberof BalancesApiList
    */
    readonly institution?: string
    
    /**
    * Return balances only for these institutions (use the Belvo-designated names, such as `erebor_mx_retail` and `gringotts_mx_retail`).
    * @type {string}
    * @memberof BalancesApiList
    */
    readonly institutionIn?: string
    
    /**
    * Return balances only for these `link.id`s.
    * @type {string}
    * @memberof BalancesApiList
    */
    readonly linkIn?: string
    
    /**
    * Return balances for exactly this date (`YYYY-MM-DD` or full ISO-8601 timestamp).
    * @type {string}
    * @memberof BalancesApiList
    */
    readonly valueDate?: string
    
    /**
    * Return balances for after this date (`YYYY-MM-DD` or full ISO-8601 timestamp).
    * @type {string}
    * @memberof BalancesApiList
    */
    readonly valueDateGt?: string
    
    /**
    * Return balances for this date or later (`YYYY-MM-DD` or full ISO-8601 timestamp).
    * @type {string}
    * @memberof BalancesApiList
    */
    readonly valueDateGte?: string
    
    /**
    * Return balances for before this date (`YYYY-MM-DD` or full ISO-8601 timestamp).
    * @type {string}
    * @memberof BalancesApiList
    */
    readonly valueDateLt?: string
    
    /**
    * Return balances for this date or earlier (`YYYY-MM-DD` or full ISO-8601 timestamp).
    * @type {string}
    * @memberof BalancesApiList
    */
    readonly valueDateLte?: string
    
    /**
    * Return balances for this date range (`YYYY-MM-DD` or full ISO-8601 timestamp).
    * @type {string}
    * @memberof BalancesApiList
    */
    readonly valueDateRange?: string
    
}

/**
 * Request parameters for retrieve operation in BalancesApi.
 * @export
 * @interface BalancesApiRetrieveRequest
 */
export type BalancesApiRetrieveRequest = {
    
    /**
    * Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof BalancesApiRetrieve
    */
    readonly omit?: string
    
    /**
    * Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof BalancesApiRetrieve
    */
    readonly fields?: string
    
} & BalancesRequest

/**
 * BalancesApi - object-oriented interface
 * @export
 * @class BalancesApi
 * @extends {BaseAPI}
 */
export class BalancesApi extends BalancesApiCustom {
    /**
     * Used to resume a Balance retrieve session that was paused because an MFA token was required by the institution.
     * @summary Complete a balances request
     * @param {BalancesApiCompleteRequestRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof BalancesApi
     */
    public completeRequest(requestParameters: BalancesApiCompleteRequestRequest, options?: AxiosRequestConfig) {
        return BalancesApiFp(this.configuration).completeRequest(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * Delete a specific balance from your Belvo account.
     * @summary Delete a balance
     * @param {BalancesApiDeleteRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof BalancesApi
     */
    public delete(requestParameters: BalancesApiDeleteRequest, options?: AxiosRequestConfig) {
        return BalancesApiFp(this.configuration).delete(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * Get the details of a specific balance.
     * @summary Get a balance\'s details
     * @param {BalancesApiGetDetailsRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof BalancesApi
     */
    public getDetails(requestParameters: BalancesApiGetDetailsRequest, options?: AxiosRequestConfig) {
        return BalancesApiFp(this.configuration).getDetails(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * Get a paginated list of all existing balances in your Belvo account. By default, we return up to 100 results per page.
     * @summary List all balances
     * @param {BalancesApiListRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof BalancesApi
     */
    public list(requestParameters: BalancesApiListRequest = {}, options?: AxiosRequestConfig) {
        return BalancesApiFp(this.configuration).list(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * Retrieve balances from one or more accounts for a specific link within a specified date range.
     * @summary Retrieve balances for a link
     * @param {BalancesApiRetrieveRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof BalancesApi
     */
    public retrieve(requestParameters: BalancesApiRetrieveRequest, options?: AxiosRequestConfig) {
        return BalancesApiFp(this.configuration).retrieve(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }
}
