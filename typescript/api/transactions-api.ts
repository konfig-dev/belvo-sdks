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
import { AsynchronousAccepted202 } from '../models';
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
import { Transaction } from '../models';
// @ts-ignore
import { TransactionsPaginatedResponse } from '../models';
// @ts-ignore
import { TransactionsRequest } from '../models';
// @ts-ignore
import { UnauthorizedError } from '../models';
// @ts-ignore
import { UnexpectedError } from '../models';
import { paginate } from "../pagination/paginate";
import { requestBeforeHook } from '../requestBeforeHook';
import { TransactionsApiCustom } from "./transactions-api-custom";
/**
 * TransactionsApi - axios parameter creator
 * @export
 */
export const TransactionsApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Used to resume a Transaction retrieve session that was paused because an MFA token was required by the institution.
         * @summary Complete a transactions request
         * @param {PatchBody} patchBody 
         * @param {string} [omit] Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {string} [fields] Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        completeRequest: async (patchBody: PatchBody, omit?: string, fields?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'patchBody' is not null or undefined
            assertParamExists('completeRequest', 'patchBody', patchBody)
            const localVarPath = `/api/transactions`;
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
         * Delete a specific transaction from your Belvo account.
         * @summary Delete a transaction
         * @param {string} id The &#x60;transaction.id&#x60; that you want to delete.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        delete: async (id: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'id' is not null or undefined
            assertParamExists('delete', 'id', id)
            const localVarPath = `/api/transactions/{id}`
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
         * Get the details of a specific transaction.
         * @summary Get a transaction\'s details
         * @param {string} id The &#x60;transaction.id&#x60; you want to get detailed information about.
         * @param {string} [omit] Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {string} [fields] Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDetails: async (id: string, omit?: string, fields?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'id' is not null or undefined
            assertParamExists('getDetails', 'id', id)
            const localVarPath = `/api/transactions/{id}`
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
         * Get a paginated list of all existing transactions in your Belvo account. By default, we return up to 100 results per page.
         * @summary List all transactions
         * @param {string} link The &#x60;link.id&#x60; you want to filter by.  ℹ️ We highly recommend adding the &#x60;account.id&#x60; filter as well in order to improve your performance. 
         * @param {number} [page] A page number within the paginated result set.
         * @param {number} [pageSize] Indicates how many results to return per page. By default we return 100 results per page.  ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000). 
         * @param {string} [omit] Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {string} [fields] Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {string} [account] The &#x60;account.id&#x60; you want to filter by.  ℹ️ We highly recommend adding the &#x60;account.id&#x60; filter in order to improve your performance. 
         * @param {string} [accountBalanceAvailable] Return transactions that have a &#x60;account.balance.available&#x60; matching exactly this value.
         * @param {string} [accountBalanceAvailableLt] Return transactions that have a &#x60;account.balance.available&#x60; less than this value.
         * @param {string} [accountBalanceAvailableLte] Return transactions that have a &#x60;account.balance.available&#x60; less than or equal to this value.
         * @param {string} [accountBalanceAvailableRange] Return transactions that have a &#x60;account.balance.available&#x60; within a range of two values.
         * @param {string} [accountBalanceCurrent] Return transactions that have a &#x60;account.balance.current&#x60; matching exactly this value.
         * @param {string} [accountBalanceCurrentGt] Return transactions that have a &#x60;account.balance.current&#x60; greater than this value.
         * @param {string} [accountBalanceCurrentGte] Return transactions that have a &#x60;account.balance.current&#x60; greater than or equal to this value.
         * @param {string} [accountBalanceCurrentLt] Return transactions that have a &#x60;account.balance.current&#x60; less than this value.
         * @param {string} [accountBalanceCurrentLte] Return transactions that have a &#x60;account.balance.current&#x60; less than or equal to this value.
         * @param {string} [accountBalanceCurrentRange] Return transactions that have a &#x60;account.balance.current&#x60; within a range of two values.
         * @param {string} [accountIn] Return transactions only for these &#x60;account.id&#x60;s.
         * @param {string} [accountType] Return information only for transactions matching this account type, as designated by the institution.
         * @param {string} [accountTypeIn] Return information only for transactions matching these account types, as designated by the institution.
         * @param {string} [accountingDate] Return transactions that were processed by the institution on exactly this date (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp).
         * @param {string} [accountingDateGt] Return transactions that were processed by the institution after this date (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp).
         * @param {string} [accountingDateGte] Return transactions that were processed by the institution on this date or later (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp).
         * @param {string} [accountingDateLt] Return transactions that were processed by the institution before this date (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp).
         * @param {string} [accountingDateLte] Return transactions that were processed by the institution on this date or earlier (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp).
         * @param {string} [accountingDateRange] Return transactions that were processed by the institution in this date range (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp).
         * @param {string} [amount] Return transactions matching exactly this value.
         * @param {string} [amountGt] Return transactions greater than this value.
         * @param {string} [amountGte] Return transactions greater than or equal to this value.
         * @param {string} [amountLt] Return transactions less than this value.
         * @param {string} [amountLte] Return transactions less than or equal to this value.
         * @param {string} [amountRange] Return transactions between these two values.
         * @param {string} [collectedAt] Return transactions that were retrieved from the institution on this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp).
         * @param {string} [collectedAtGt] Return transactions that were retrieved from the institution after this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp).
         * @param {string} [collectedAtGte] Return transactions that were retrieved from the institution after or on this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp).
         * @param {string} [collectedAtLt] Return transactions that were retrieved from the institution before this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp).
         * @param {string} [collectedAtLte] Return transactions that were retrieved from the institution before or on this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp).
         * @param {string} [collectedAtRange] Return transactions that were retrieved from the institution between two dates (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp).
         * @param {string} [createdAt] Return transactions that were last updated in Belvo\&#39;s database on this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp).
         * @param {string} [createdAtGt] Return transactions that were last updated in Belvo\&#39;s database after this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp).
         * @param {string} [createdAtGte] Return transactions that were last updated in Belvo\&#39;s database after or on this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp).
         * @param {string} [createdAtLt] Return transactions that were last updated in Belvo\&#39;s database before this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp).
         * @param {string} [createdAtLte] Return transactions that were last updated in Belvo\&#39;s database before or on this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp).
         * @param {string} [createdAtRange] Return transactions that were last updated in Belvo\&#39;s database between two dates (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp).
         * @param {string} [creditCardDataBillNameIn] Return transactions for one of these bill names.
         * @param {string} [currency] Return transactions in only this three-letter currency code.
         * @param {string} [currencyIn] Return transactions in one of these three-letter currency codes.
         * @param {string} [reference] Returns transactions with this institution-assigned reference number.
         * @param {string} [referenceIn] Returns transactions with these institution-assigned reference numbers.
         * @param {string} [status] Return transactions with this status. Can be either &#x60;PENDING&#x60;, &#x60;PROCESSED&#x60;, or &#x60;UNCATEGORIZED&#x60;.
         * @param {string} [statusIn] Return transactions with these statuses. Can be either &#x60;PENDING&#x60;, &#x60;PROCESSED&#x60;, or &#x60;UNCATEGORIZED&#x60;.
         * @param {string} [type] Return transactions with this type. Can be either &#x60;INFLOW&#x60; or &#x60;OUTFLOW&#x60;.
         * @param {string} [typeIn] Return transactions with this types. Can be either &#x60;INFLOW&#x60; or &#x60;OUTFLOW&#x60;.
         * @param {string} [valueDate] Return transactions that occurred on exactly this date (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp).
         * @param {string} [valueDateGt] Return transactions that occurred after this date (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp).
         * @param {string} [valueDateGte] Return transactions that occurred on this date or later (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp).
         * @param {string} [valueDateLt] Return transactions that occurred before this date (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp).
         * @param {string} [valueDateLte] Return transactions that occurred on this date or earlier (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp).
         * @param {string} [valueDateRange] Return transactions for this date range (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp).
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        list: async (link: string, page?: number, pageSize?: number, omit?: string, fields?: string, account?: string, accountBalanceAvailable?: string, accountBalanceAvailableLt?: string, accountBalanceAvailableLte?: string, accountBalanceAvailableRange?: string, accountBalanceCurrent?: string, accountBalanceCurrentGt?: string, accountBalanceCurrentGte?: string, accountBalanceCurrentLt?: string, accountBalanceCurrentLte?: string, accountBalanceCurrentRange?: string, accountIn?: string, accountType?: string, accountTypeIn?: string, accountingDate?: string, accountingDateGt?: string, accountingDateGte?: string, accountingDateLt?: string, accountingDateLte?: string, accountingDateRange?: string, amount?: string, amountGt?: string, amountGte?: string, amountLt?: string, amountLte?: string, amountRange?: string, collectedAt?: string, collectedAtGt?: string, collectedAtGte?: string, collectedAtLt?: string, collectedAtLte?: string, collectedAtRange?: string, createdAt?: string, createdAtGt?: string, createdAtGte?: string, createdAtLt?: string, createdAtLte?: string, createdAtRange?: string, creditCardDataBillNameIn?: string, currency?: string, currencyIn?: string, reference?: string, referenceIn?: string, status?: string, statusIn?: string, type?: string, typeIn?: string, valueDate?: string, valueDateGt?: string, valueDateGte?: string, valueDateLt?: string, valueDateLte?: string, valueDateRange?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'link' is not null or undefined
            assertParamExists('list', 'link', link)
            const localVarPath = `/api/transactions`;
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

            if (accountBalanceAvailable !== undefined) {
                localVarQueryParameter['account__balance__available'] = accountBalanceAvailable;
            }

            if (accountBalanceAvailableLt !== undefined) {
                localVarQueryParameter['account__balance__available__lt'] = accountBalanceAvailableLt;
            }

            if (accountBalanceAvailableLte !== undefined) {
                localVarQueryParameter['account__balance__available__lte'] = accountBalanceAvailableLte;
            }

            if (accountBalanceAvailableRange !== undefined) {
                localVarQueryParameter['account__balance__available__range'] = accountBalanceAvailableRange;
            }

            if (accountBalanceCurrent !== undefined) {
                localVarQueryParameter['account__balance__current'] = accountBalanceCurrent;
            }

            if (accountBalanceCurrentGt !== undefined) {
                localVarQueryParameter['account__balance__current__gt'] = accountBalanceCurrentGt;
            }

            if (accountBalanceCurrentGte !== undefined) {
                localVarQueryParameter['account__balance__current__gte'] = accountBalanceCurrentGte;
            }

            if (accountBalanceCurrentLt !== undefined) {
                localVarQueryParameter['account__balance__current__lt'] = accountBalanceCurrentLt;
            }

            if (accountBalanceCurrentLte !== undefined) {
                localVarQueryParameter['account__balance__current__lte'] = accountBalanceCurrentLte;
            }

            if (accountBalanceCurrentRange !== undefined) {
                localVarQueryParameter['account__balance__current__range'] = accountBalanceCurrentRange;
            }

            if (accountIn !== undefined) {
                localVarQueryParameter['account__in'] = accountIn;
            }

            if (accountType !== undefined) {
                localVarQueryParameter['account_type'] = accountType;
            }

            if (accountTypeIn !== undefined) {
                localVarQueryParameter['account_type__in'] = accountTypeIn;
            }

            if (accountingDate !== undefined) {
                localVarQueryParameter['accounting_date'] = accountingDate;
            }

            if (accountingDateGt !== undefined) {
                localVarQueryParameter['accounting_date__gt'] = accountingDateGt;
            }

            if (accountingDateGte !== undefined) {
                localVarQueryParameter['accounting_date__gte'] = accountingDateGte;
            }

            if (accountingDateLt !== undefined) {
                localVarQueryParameter['accounting_date__lt'] = accountingDateLt;
            }

            if (accountingDateLte !== undefined) {
                localVarQueryParameter['accounting_date__lte'] = accountingDateLte;
            }

            if (accountingDateRange !== undefined) {
                localVarQueryParameter['accounting_date__range'] = accountingDateRange;
            }

            if (amount !== undefined) {
                localVarQueryParameter['amount'] = amount;
            }

            if (amountGt !== undefined) {
                localVarQueryParameter['amount__gt'] = amountGt;
            }

            if (amountGte !== undefined) {
                localVarQueryParameter['amount__gte'] = amountGte;
            }

            if (amountLt !== undefined) {
                localVarQueryParameter['amount__lt'] = amountLt;
            }

            if (amountLte !== undefined) {
                localVarQueryParameter['amount__lte'] = amountLte;
            }

            if (amountRange !== undefined) {
                localVarQueryParameter['amount__range'] = amountRange;
            }

            if (collectedAt !== undefined) {
                localVarQueryParameter['collected_at'] = collectedAt;
            }

            if (collectedAtGt !== undefined) {
                localVarQueryParameter['collected_at__gt'] = collectedAtGt;
            }

            if (collectedAtGte !== undefined) {
                localVarQueryParameter['collected_at__gte'] = collectedAtGte;
            }

            if (collectedAtLt !== undefined) {
                localVarQueryParameter['collected_at__lt'] = collectedAtLt;
            }

            if (collectedAtLte !== undefined) {
                localVarQueryParameter['collected_at__lte'] = collectedAtLte;
            }

            if (collectedAtRange !== undefined) {
                localVarQueryParameter['collected_at__range'] = collectedAtRange;
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

            if (creditCardDataBillNameIn !== undefined) {
                localVarQueryParameter['credit_card_data__bill_name__in'] = creditCardDataBillNameIn;
            }

            if (currency !== undefined) {
                localVarQueryParameter['currency'] = currency;
            }

            if (currencyIn !== undefined) {
                localVarQueryParameter['currency__in'] = currencyIn;
            }

            if (reference !== undefined) {
                localVarQueryParameter['reference'] = reference;
            }

            if (referenceIn !== undefined) {
                localVarQueryParameter['reference__in'] = referenceIn;
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
         * Retrieve transactions for one or more accounts from a specific link. <div style=\"background-color:#f4f6f8; border-left: 6px solid #0663F9;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\"> <strong>Info: </strong> When retrieving transactions, it is important to understand that the available transaction data ranges depend on each institution. <br><br> If you try to access older information than what we can access, we will return all the data we can read within that date range. For example, if you request transactions for the last year and we can only access the last six months, we will return the information corresponding to these six months of data. </div> 
         * @summary Retrieve transactions for a link
         * @param {TransactionsRequest} transactionsRequest 
         * @param {'async'} [xBelvoRequestMode] 
         * @param {string} [omit] Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {string} [fields] Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        retrieve: async (transactionsRequest: TransactionsRequest, xBelvoRequestMode?: 'async', omit?: string, fields?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'transactionsRequest' is not null or undefined
            assertParamExists('retrieve', 'transactionsRequest', transactionsRequest)
            const localVarPath = `/api/transactions`;
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

            if (xBelvoRequestMode != null) {
                localVarHeaderParameter['X-Belvo-Request-Mode'] = String(xBelvoRequestMode);
            }


    
            localVarHeaderParameter['Content-Type'] = 'application/json';

            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            requestBeforeHook({
                requestBody: transactionsRequest,
                queryParameters: localVarQueryParameter,
                requestConfig: localVarRequestOptions,
                path: localVarPath,
                configuration
            });
            localVarRequestOptions.data = serializeDataIfNeeded(transactionsRequest, localVarRequestOptions, configuration)

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * TransactionsApi - functional programming interface
 * @export
 */
export const TransactionsApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = TransactionsApiAxiosParamCreator(configuration)
    return {
        /**
         * Used to resume a Transaction retrieve session that was paused because an MFA token was required by the institution.
         * @summary Complete a transactions request
         * @param {TransactionsApiCompleteRequestRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async completeRequest(requestParameters: TransactionsApiCompleteRequestRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<Array<Transaction>>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.completeRequest(requestParameters, requestParameters.omit, requestParameters.fields, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Delete a specific transaction from your Belvo account.
         * @summary Delete a transaction
         * @param {TransactionsApiDeleteRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async delete(requestParameters: TransactionsApiDeleteRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<void>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.delete(requestParameters.id, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Get the details of a specific transaction.
         * @summary Get a transaction\'s details
         * @param {TransactionsApiGetDetailsRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getDetails(requestParameters: TransactionsApiGetDetailsRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<Transaction>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getDetails(requestParameters.id, requestParameters.omit, requestParameters.fields, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Get a paginated list of all existing transactions in your Belvo account. By default, we return up to 100 results per page.
         * @summary List all transactions
         * @param {TransactionsApiListRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async list(requestParameters: TransactionsApiListRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<TransactionsPaginatedResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.list(requestParameters.link, requestParameters.page, requestParameters.pageSize, requestParameters.omit, requestParameters.fields, requestParameters.account, requestParameters.accountBalanceAvailable, requestParameters.accountBalanceAvailableLt, requestParameters.accountBalanceAvailableLte, requestParameters.accountBalanceAvailableRange, requestParameters.accountBalanceCurrent, requestParameters.accountBalanceCurrentGt, requestParameters.accountBalanceCurrentGte, requestParameters.accountBalanceCurrentLt, requestParameters.accountBalanceCurrentLte, requestParameters.accountBalanceCurrentRange, requestParameters.accountIn, requestParameters.accountType, requestParameters.accountTypeIn, requestParameters.accountingDate, requestParameters.accountingDateGt, requestParameters.accountingDateGte, requestParameters.accountingDateLt, requestParameters.accountingDateLte, requestParameters.accountingDateRange, requestParameters.amount, requestParameters.amountGt, requestParameters.amountGte, requestParameters.amountLt, requestParameters.amountLte, requestParameters.amountRange, requestParameters.collectedAt, requestParameters.collectedAtGt, requestParameters.collectedAtGte, requestParameters.collectedAtLt, requestParameters.collectedAtLte, requestParameters.collectedAtRange, requestParameters.createdAt, requestParameters.createdAtGt, requestParameters.createdAtGte, requestParameters.createdAtLt, requestParameters.createdAtLte, requestParameters.createdAtRange, requestParameters.creditCardDataBillNameIn, requestParameters.currency, requestParameters.currencyIn, requestParameters.reference, requestParameters.referenceIn, requestParameters.status, requestParameters.statusIn, requestParameters.type, requestParameters.typeIn, requestParameters.valueDate, requestParameters.valueDateGt, requestParameters.valueDateGte, requestParameters.valueDateLt, requestParameters.valueDateLte, requestParameters.valueDateRange, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Retrieve transactions for one or more accounts from a specific link. <div style=\"background-color:#f4f6f8; border-left: 6px solid #0663F9;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\"> <strong>Info: </strong> When retrieving transactions, it is important to understand that the available transaction data ranges depend on each institution. <br><br> If you try to access older information than what we can access, we will return all the data we can read within that date range. For example, if you request transactions for the last year and we can only access the last six months, we will return the information corresponding to these six months of data. </div> 
         * @summary Retrieve transactions for a link
         * @param {TransactionsApiRetrieveRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async retrieve(requestParameters: TransactionsApiRetrieveRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<Array<Transaction>>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.retrieve(requestParameters, requestParameters.xBelvoRequestMode, requestParameters.omit, requestParameters.fields, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * TransactionsApi - factory interface
 * @export
 */
export const TransactionsApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = TransactionsApiFp(configuration)
    return {
        /**
         * Used to resume a Transaction retrieve session that was paused because an MFA token was required by the institution.
         * @summary Complete a transactions request
         * @param {TransactionsApiCompleteRequestRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        completeRequest(requestParameters: TransactionsApiCompleteRequestRequest, options?: AxiosRequestConfig): AxiosPromise<Array<Transaction>> {
            return localVarFp.completeRequest(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * Delete a specific transaction from your Belvo account.
         * @summary Delete a transaction
         * @param {TransactionsApiDeleteRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        delete(requestParameters: TransactionsApiDeleteRequest, options?: AxiosRequestConfig): AxiosPromise<void> {
            return localVarFp.delete(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * Get the details of a specific transaction.
         * @summary Get a transaction\'s details
         * @param {TransactionsApiGetDetailsRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDetails(requestParameters: TransactionsApiGetDetailsRequest, options?: AxiosRequestConfig): AxiosPromise<Transaction> {
            return localVarFp.getDetails(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * Get a paginated list of all existing transactions in your Belvo account. By default, we return up to 100 results per page.
         * @summary List all transactions
         * @param {TransactionsApiListRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        list(requestParameters: TransactionsApiListRequest, options?: AxiosRequestConfig): AxiosPromise<TransactionsPaginatedResponse> {
            return localVarFp.list(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * Retrieve transactions for one or more accounts from a specific link. <div style=\"background-color:#f4f6f8; border-left: 6px solid #0663F9;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\"> <strong>Info: </strong> When retrieving transactions, it is important to understand that the available transaction data ranges depend on each institution. <br><br> If you try to access older information than what we can access, we will return all the data we can read within that date range. For example, if you request transactions for the last year and we can only access the last six months, we will return the information corresponding to these six months of data. </div> 
         * @summary Retrieve transactions for a link
         * @param {TransactionsApiRetrieveRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        retrieve(requestParameters: TransactionsApiRetrieveRequest, options?: AxiosRequestConfig): AxiosPromise<Array<Transaction>> {
            return localVarFp.retrieve(requestParameters, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * Request parameters for completeRequest operation in TransactionsApi.
 * @export
 * @interface TransactionsApiCompleteRequestRequest
 */
export type TransactionsApiCompleteRequestRequest = {
    
    /**
    * Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof TransactionsApiCompleteRequest
    */
    readonly omit?: string
    
    /**
    * Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof TransactionsApiCompleteRequest
    */
    readonly fields?: string
    
} & PatchBody

/**
 * Request parameters for delete operation in TransactionsApi.
 * @export
 * @interface TransactionsApiDeleteRequest
 */
export type TransactionsApiDeleteRequest = {
    
    /**
    * The `transaction.id` that you want to delete.
    * @type {string}
    * @memberof TransactionsApiDelete
    */
    readonly id: string
    
}

/**
 * Request parameters for getDetails operation in TransactionsApi.
 * @export
 * @interface TransactionsApiGetDetailsRequest
 */
export type TransactionsApiGetDetailsRequest = {
    
    /**
    * The `transaction.id` you want to get detailed information about.
    * @type {string}
    * @memberof TransactionsApiGetDetails
    */
    readonly id: string
    
    /**
    * Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof TransactionsApiGetDetails
    */
    readonly omit?: string
    
    /**
    * Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof TransactionsApiGetDetails
    */
    readonly fields?: string
    
}

/**
 * Request parameters for list operation in TransactionsApi.
 * @export
 * @interface TransactionsApiListRequest
 */
export type TransactionsApiListRequest = {
    
    /**
    * The `link.id` you want to filter by.  ℹ️ We highly recommend adding the `account.id` filter as well in order to improve your performance. 
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly link: string
    
    /**
    * A page number within the paginated result set.
    * @type {number}
    * @memberof TransactionsApiList
    */
    readonly page?: number
    
    /**
    * Indicates how many results to return per page. By default we return 100 results per page.  ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000). 
    * @type {number}
    * @memberof TransactionsApiList
    */
    readonly pageSize?: number
    
    /**
    * Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly omit?: string
    
    /**
    * Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly fields?: string
    
    /**
    * The `account.id` you want to filter by.  ℹ️ We highly recommend adding the `account.id` filter in order to improve your performance. 
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly account?: string
    
    /**
    * Return transactions that have a `account.balance.available` matching exactly this value.
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly accountBalanceAvailable?: string
    
    /**
    * Return transactions that have a `account.balance.available` less than this value.
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly accountBalanceAvailableLt?: string
    
    /**
    * Return transactions that have a `account.balance.available` less than or equal to this value.
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly accountBalanceAvailableLte?: string
    
    /**
    * Return transactions that have a `account.balance.available` within a range of two values.
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly accountBalanceAvailableRange?: string
    
    /**
    * Return transactions that have a `account.balance.current` matching exactly this value.
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly accountBalanceCurrent?: string
    
    /**
    * Return transactions that have a `account.balance.current` greater than this value.
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly accountBalanceCurrentGt?: string
    
    /**
    * Return transactions that have a `account.balance.current` greater than or equal to this value.
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly accountBalanceCurrentGte?: string
    
    /**
    * Return transactions that have a `account.balance.current` less than this value.
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly accountBalanceCurrentLt?: string
    
    /**
    * Return transactions that have a `account.balance.current` less than or equal to this value.
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly accountBalanceCurrentLte?: string
    
    /**
    * Return transactions that have a `account.balance.current` within a range of two values.
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly accountBalanceCurrentRange?: string
    
    /**
    * Return transactions only for these `account.id`s.
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly accountIn?: string
    
    /**
    * Return information only for transactions matching this account type, as designated by the institution.
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly accountType?: string
    
    /**
    * Return information only for transactions matching these account types, as designated by the institution.
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly accountTypeIn?: string
    
    /**
    * Return transactions that were processed by the institution on exactly this date (`YYYY-MM-DD` or full ISO-8601 timestamp).
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly accountingDate?: string
    
    /**
    * Return transactions that were processed by the institution after this date (`YYYY-MM-DD` or full ISO-8601 timestamp).
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly accountingDateGt?: string
    
    /**
    * Return transactions that were processed by the institution on this date or later (`YYYY-MM-DD` or full ISO-8601 timestamp).
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly accountingDateGte?: string
    
    /**
    * Return transactions that were processed by the institution before this date (`YYYY-MM-DD` or full ISO-8601 timestamp).
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly accountingDateLt?: string
    
    /**
    * Return transactions that were processed by the institution on this date or earlier (`YYYY-MM-DD` or full ISO-8601 timestamp).
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly accountingDateLte?: string
    
    /**
    * Return transactions that were processed by the institution in this date range (`YYYY-MM-DD` or full ISO-8601 timestamp).
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly accountingDateRange?: string
    
    /**
    * Return transactions matching exactly this value.
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly amount?: string
    
    /**
    * Return transactions greater than this value.
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly amountGt?: string
    
    /**
    * Return transactions greater than or equal to this value.
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly amountGte?: string
    
    /**
    * Return transactions less than this value.
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly amountLt?: string
    
    /**
    * Return transactions less than or equal to this value.
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly amountLte?: string
    
    /**
    * Return transactions between these two values.
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly amountRange?: string
    
    /**
    * Return transactions that were retrieved from the institution on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly collectedAt?: string
    
    /**
    * Return transactions that were retrieved from the institution after this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly collectedAtGt?: string
    
    /**
    * Return transactions that were retrieved from the institution after or on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly collectedAtGte?: string
    
    /**
    * Return transactions that were retrieved from the institution before this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly collectedAtLt?: string
    
    /**
    * Return transactions that were retrieved from the institution before or on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly collectedAtLte?: string
    
    /**
    * Return transactions that were retrieved from the institution between two dates (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly collectedAtRange?: string
    
    /**
    * Return transactions that were last updated in Belvo\'s database on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly createdAt?: string
    
    /**
    * Return transactions that were last updated in Belvo\'s database after this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly createdAtGt?: string
    
    /**
    * Return transactions that were last updated in Belvo\'s database after or on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly createdAtGte?: string
    
    /**
    * Return transactions that were last updated in Belvo\'s database before this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly createdAtLt?: string
    
    /**
    * Return transactions that were last updated in Belvo\'s database before or on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly createdAtLte?: string
    
    /**
    * Return transactions that were last updated in Belvo\'s database between two dates (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly createdAtRange?: string
    
    /**
    * Return transactions for one of these bill names.
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly creditCardDataBillNameIn?: string
    
    /**
    * Return transactions in only this three-letter currency code.
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly currency?: string
    
    /**
    * Return transactions in one of these three-letter currency codes.
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly currencyIn?: string
    
    /**
    * Returns transactions with this institution-assigned reference number.
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly reference?: string
    
    /**
    * Returns transactions with these institution-assigned reference numbers.
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly referenceIn?: string
    
    /**
    * Return transactions with this status. Can be either `PENDING`, `PROCESSED`, or `UNCATEGORIZED`.
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly status?: string
    
    /**
    * Return transactions with these statuses. Can be either `PENDING`, `PROCESSED`, or `UNCATEGORIZED`.
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly statusIn?: string
    
    /**
    * Return transactions with this type. Can be either `INFLOW` or `OUTFLOW`.
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly type?: string
    
    /**
    * Return transactions with this types. Can be either `INFLOW` or `OUTFLOW`.
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly typeIn?: string
    
    /**
    * Return transactions that occurred on exactly this date (`YYYY-MM-DD` or full ISO-8601 timestamp).
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly valueDate?: string
    
    /**
    * Return transactions that occurred after this date (`YYYY-MM-DD` or full ISO-8601 timestamp).
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly valueDateGt?: string
    
    /**
    * Return transactions that occurred on this date or later (`YYYY-MM-DD` or full ISO-8601 timestamp).
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly valueDateGte?: string
    
    /**
    * Return transactions that occurred before this date (`YYYY-MM-DD` or full ISO-8601 timestamp).
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly valueDateLt?: string
    
    /**
    * Return transactions that occurred on this date or earlier (`YYYY-MM-DD` or full ISO-8601 timestamp).
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly valueDateLte?: string
    
    /**
    * Return transactions for this date range (`YYYY-MM-DD` or full ISO-8601 timestamp).
    * @type {string}
    * @memberof TransactionsApiList
    */
    readonly valueDateRange?: string
    
}

/**
 * Request parameters for retrieve operation in TransactionsApi.
 * @export
 * @interface TransactionsApiRetrieveRequest
 */
export type TransactionsApiRetrieveRequest = {
    
    /**
    * 
    * @type {'async'}
    * @memberof TransactionsApiRetrieve
    */
    readonly xBelvoRequestMode?: 'async'
    
    /**
    * Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof TransactionsApiRetrieve
    */
    readonly omit?: string
    
    /**
    * Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof TransactionsApiRetrieve
    */
    readonly fields?: string
    
} & TransactionsRequest

/**
 * TransactionsApi - object-oriented interface
 * @export
 * @class TransactionsApi
 * @extends {BaseAPI}
 */
export class TransactionsApi extends TransactionsApiCustom {
    /**
     * Used to resume a Transaction retrieve session that was paused because an MFA token was required by the institution.
     * @summary Complete a transactions request
     * @param {TransactionsApiCompleteRequestRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof TransactionsApi
     */
    public completeRequest(requestParameters: TransactionsApiCompleteRequestRequest, options?: AxiosRequestConfig) {
        return TransactionsApiFp(this.configuration).completeRequest(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * Delete a specific transaction from your Belvo account.
     * @summary Delete a transaction
     * @param {TransactionsApiDeleteRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof TransactionsApi
     */
    public delete(requestParameters: TransactionsApiDeleteRequest, options?: AxiosRequestConfig) {
        return TransactionsApiFp(this.configuration).delete(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * Get the details of a specific transaction.
     * @summary Get a transaction\'s details
     * @param {TransactionsApiGetDetailsRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof TransactionsApi
     */
    public getDetails(requestParameters: TransactionsApiGetDetailsRequest, options?: AxiosRequestConfig) {
        return TransactionsApiFp(this.configuration).getDetails(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * Get a paginated list of all existing transactions in your Belvo account. By default, we return up to 100 results per page.
     * @summary List all transactions
     * @param {TransactionsApiListRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof TransactionsApi
     */
    public list(requestParameters: TransactionsApiListRequest, options?: AxiosRequestConfig) {
        return TransactionsApiFp(this.configuration).list(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * Retrieve transactions for one or more accounts from a specific link. <div style=\"background-color:#f4f6f8; border-left: 6px solid #0663F9;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\"> <strong>Info: </strong> When retrieving transactions, it is important to understand that the available transaction data ranges depend on each institution. <br><br> If you try to access older information than what we can access, we will return all the data we can read within that date range. For example, if you request transactions for the last year and we can only access the last six months, we will return the information corresponding to these six months of data. </div> 
     * @summary Retrieve transactions for a link
     * @param {TransactionsApiRetrieveRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof TransactionsApi
     */
    public retrieve(requestParameters: TransactionsApiRetrieveRequest, options?: AxiosRequestConfig) {
        return TransactionsApiFp(this.configuration).retrieve(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }
}
