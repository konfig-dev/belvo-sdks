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
import { Account } from '../models';
// @ts-ignore
import { AccountsPaginatedResponse } from '../models';
// @ts-ignore
import { LinksCompleteRequestResponseInner } from '../models';
// @ts-ignore
import { NotFoundError } from '../models';
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
import { AccountsApiCustom } from "./accounts-api-custom";
/**
 * AccountsApi - axios parameter creator
 * @export
 */
export const AccountsApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Used to resume an Account retrieve session that was paused because an MFA token was required by the institution.    > 🚧 Scheduled field deprecation   >    > Please note that we will soon be deprecating the following fields in our `loan_data` object:   > - `cutting_date`   > - `cutting_day`   > - `credit_limit`: replaced by the `principal` field.   > - `interest_rate`: replaced by the `interest_rates` object.   > - `last_payment_date`   > - `last_period_balance`: replaced by the `outstanding_balance ` field.   > - `limit_day`   > - `limit_date`: replaced by the `payment_day ` field.   > - `no_interest_payment`   > - `payment_due_day`
         * @summary Complete an accounts request
         * @param {PatchBody} patchBody 
         * @param {string} [omit] Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {string} [fields] Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        completeRequest: async (patchBody: PatchBody, omit?: string, fields?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'patchBody' is not null or undefined
            assertParamExists('completeRequest', 'patchBody', patchBody)
            const localVarPath = `/api/accounts`;
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
         * Delete a specific account and all associated transactions, as well as owners, from your Belvo account.
         * @summary Delete an account
         * @param {string} id The &#x60;account.id&#x60; you want to delete
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        delete: async (id: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'id' is not null or undefined
            assertParamExists('delete', 'id', id)
            const localVarPath = `/api/accounts/{id}`
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
         * Get the details of a specific account.    > 🚧 Scheduled field deprecation   >   > Please note that we will soon be deprecating the following fields in our `loan_data` object:   > - `cutting_date`   > - `cutting_day`   > - `credit_limit`: replaced by the `principal` field.   > - `interest_rate`: replaced by the `interest_rates` object.   > - `last_payment_date`   > - `last_period_balance`: replaced by the `outstanding_balance ` field.   > - `limit_day`   > - `limit_date`: replaced by the `payment_day ` field.   > - `no_interest_payment`   > - `payment_due_day`
         * @summary Get an account\'s details
         * @param {string} id The &#x60;account.id&#x60; you want to get detailed information about.
         * @param {string} [omit] Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {string} [fields] Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDetails: async (id: string, omit?: string, fields?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'id' is not null or undefined
            assertParamExists('getDetails', 'id', id)
            const localVarPath = `/api/accounts/{id}`
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
         * Get a paginated list of all existing accounts in your Belvo account. By default, we return up to 100 results per page.
         * @summary List all accounts
         * @param {number} [page] A page number within the paginated result set.
         * @param {number} [pageSize] Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000). 
         * @param {string} [omit] Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {string} [fields] Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {string} [link] The &#x60;link.id&#x60; you want to filter by.  ℹ️ We highly recommend adding the &#x60;link.id&#x60; filter in order to improve your performance. 
         * @param {string} [balanceAvailable] Return accounts that have a &#x60;balance.available&#x60; matching exactly this value.
         * @param {string} [balanceAvailableLt] Return accounts that have a &#x60;balance.available&#x60; less than this value.
         * @param {string} [balanceAvailableLte] Return accounts that have a &#x60;balance.available&#x60; less than or equal to this value.
         * @param {string} [balanceAvailableGt] Return accounts that have a &#x60;balance.available&#x60; greater than this value.
         * @param {string} [balanceAvailableGte] Return accounts that have a &#x60;balance.available&#x60; greater than or equal to this value.
         * @param {string} [balanceAvailableRange] Return accounts that have a &#x60;balance.available&#x60; within a range of two values.
         * @param {string} [balanceCurrent] Return accounts that have a &#x60;balance.current&#x60; matching exactly this value.
         * @param {string} [balanceCurrentLt] Return accounts that have a &#x60;balance.current&#x60; less than this value.
         * @param {string} [balanceCurrentLte] Return accounts that have a &#x60;balance.available&#x60; less than or equal to this value.
         * @param {string} [balanceCurrentGt] Return accounts that have a &#x60;balance.current&#x60; greater than this value.
         * @param {string} [balanceCurrentGte] Return accounts that have a &#x60;balance.available&#x60; greater than or equal to this value.
         * @param {string} [balanceCurrentRange] Return accounts that have a &#x60;balance.available&#x60; within a range of two values.
         * @param {string} [category] Return accounts only for the given category (for example, &#x60;CHECKING_ACCOUNT&#x60; and &#x60;SAVINGS_ACCOUNT&#x60;).
         * @param {string} [categoryIn] Return accounts only for the given categories (for example, &#x60;CHECKING_ACCOUNT&#x60; and &#x60;SAVINGS_ACCOUNT&#x60;).
         * @param {string} [createdAtGt] Return accounts that were last updated in Belvo\&#39;s database after this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp).
         * @param {string} [createdAtGte] Return accounts that were last updated in Belvo\&#39;s database after or on this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp).
         * @param {string} [createdAtLt] Return accounts that were last updated in Belvo\&#39;s database before this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp).
         * @param {string} [createdAtLte] Return accounts that were last updated in Belvo\&#39;s database before or on this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp).
         * @param {string} [createdAtRange] Return accounts that were last updated in Belvo\&#39;s database between two dates (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp).
         * @param {string} [currency] Return accounts that hold finances in only this three-letter currency code.
         * @param {string} [currencyIn] Return accounts that hold finances in one of these three-letter currency codes.
         * @param {string} [id] Return information only for this &#x60;account.id&#x60;.
         * @param {string} [idIn] Return information for these &#x60;account.id&#x60;s.
         * @param {string} [institution] Return accounts only for this institution (use the Belvo-designated name, such as &#x60;erebor_mx_retail&#x60;).
         * @param {string} [institutionIn] Return accounts only for these institutions (use the Belvo-designated names, such as &#x60;erebor_mx_retail&#x60; and &#x60;gringotts_mx_retail&#x60;).
         * @param {string} [linkIn] Return accounts only for these &#x60;link.id&#x60;s.
         * @param {string} [name] Return accounts with exactly this internal (specified by the institution) name.
         * @param {string} [nameIcontains] Return accounts partially matching this internal (specified by the institution) name.
         * @param {string} [number] Return information only for this account number (as specified by the institution).
         * @param {string} [numberIn] Return information for these account numbers (as specified by the institution).
         * @param {string} [publicIdentificationName] Return information only for this type of account ID. For example, CLABE accounts.
         * @param {string} [publicIdentificationValue] Return information only for this account ID. For example, the account number for a CLABE account.
         * @param {string} [type] Return information only for accounts matching this account type, as designated by the institution.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        list: async (page?: number, pageSize?: number, omit?: string, fields?: string, link?: string, balanceAvailable?: string, balanceAvailableLt?: string, balanceAvailableLte?: string, balanceAvailableGt?: string, balanceAvailableGte?: string, balanceAvailableRange?: string, balanceCurrent?: string, balanceCurrentLt?: string, balanceCurrentLte?: string, balanceCurrentGt?: string, balanceCurrentGte?: string, balanceCurrentRange?: string, category?: string, categoryIn?: string, createdAtGt?: string, createdAtGte?: string, createdAtLt?: string, createdAtLte?: string, createdAtRange?: string, currency?: string, currencyIn?: string, id?: string, idIn?: string, institution?: string, institutionIn?: string, linkIn?: string, name?: string, nameIcontains?: string, number?: string, numberIn?: string, publicIdentificationName?: string, publicIdentificationValue?: string, type?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/api/accounts`;
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

            if (balanceAvailable !== undefined) {
                localVarQueryParameter['balance__available'] = balanceAvailable;
            }

            if (balanceAvailableLt !== undefined) {
                localVarQueryParameter['balance__available__lt'] = balanceAvailableLt;
            }

            if (balanceAvailableLte !== undefined) {
                localVarQueryParameter['balance__available__lte'] = balanceAvailableLte;
            }

            if (balanceAvailableGt !== undefined) {
                localVarQueryParameter['balance__available__gt'] = balanceAvailableGt;
            }

            if (balanceAvailableGte !== undefined) {
                localVarQueryParameter['balance__available__gte'] = balanceAvailableGte;
            }

            if (balanceAvailableRange !== undefined) {
                localVarQueryParameter['balance__available__range'] = balanceAvailableRange;
            }

            if (balanceCurrent !== undefined) {
                localVarQueryParameter['balance__current'] = balanceCurrent;
            }

            if (balanceCurrentLt !== undefined) {
                localVarQueryParameter['balance__current__lt'] = balanceCurrentLt;
            }

            if (balanceCurrentLte !== undefined) {
                localVarQueryParameter['balance__current__lte'] = balanceCurrentLte;
            }

            if (balanceCurrentGt !== undefined) {
                localVarQueryParameter['balance__current__gt'] = balanceCurrentGt;
            }

            if (balanceCurrentGte !== undefined) {
                localVarQueryParameter['balance__current__gte'] = balanceCurrentGte;
            }

            if (balanceCurrentRange !== undefined) {
                localVarQueryParameter['balance__current__range'] = balanceCurrentRange;
            }

            if (category !== undefined) {
                localVarQueryParameter['category'] = category;
            }

            if (categoryIn !== undefined) {
                localVarQueryParameter['category__in'] = categoryIn;
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

            if (name !== undefined) {
                localVarQueryParameter['name'] = name;
            }

            if (nameIcontains !== undefined) {
                localVarQueryParameter['name__icontains'] = nameIcontains;
            }

            if (number !== undefined) {
                localVarQueryParameter['number'] = number;
            }

            if (numberIn !== undefined) {
                localVarQueryParameter['number__in'] = numberIn;
            }

            if (publicIdentificationName !== undefined) {
                localVarQueryParameter['public_identification_name'] = publicIdentificationName;
            }

            if (publicIdentificationValue !== undefined) {
                localVarQueryParameter['public_identification_value'] = publicIdentificationValue;
            }

            if (type !== undefined) {
                localVarQueryParameter['type'] = type;
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
         * Retrieve accounts from an existing link.    > 🚧 Scheduled field deprecation   >    > Please note that we will soon be deprecating the following fields in our `loan_data` object:   > - `cutting_date`   > - `cutting_day`   > - `credit_limit`: replaced by the `principal` field.   > - `interest_rate`: replaced by the `interest_rates` object.   > - `last_payment_date`   > - `last_period_balance`: replaced by the `outstanding_balance ` field.   > - `limit_day`   > - `limit_date`: replaced by the `payment_day ` field.   > - `no_interest_payment`   > - `payment_due_day`
         * @summary Retrieve accounts for a link
         * @param {StandardRequest} standardRequest 
         * @param {string} [omit] Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {string} [fields] Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        retrieve: async (standardRequest: StandardRequest, omit?: string, fields?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'standardRequest' is not null or undefined
            assertParamExists('retrieve', 'standardRequest', standardRequest)
            const localVarPath = `/api/accounts`;
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
 * AccountsApi - functional programming interface
 * @export
 */
export const AccountsApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = AccountsApiAxiosParamCreator(configuration)
    return {
        /**
         * Used to resume an Account retrieve session that was paused because an MFA token was required by the institution.    > 🚧 Scheduled field deprecation   >    > Please note that we will soon be deprecating the following fields in our `loan_data` object:   > - `cutting_date`   > - `cutting_day`   > - `credit_limit`: replaced by the `principal` field.   > - `interest_rate`: replaced by the `interest_rates` object.   > - `last_payment_date`   > - `last_period_balance`: replaced by the `outstanding_balance ` field.   > - `limit_day`   > - `limit_date`: replaced by the `payment_day ` field.   > - `no_interest_payment`   > - `payment_due_day`
         * @summary Complete an accounts request
         * @param {AccountsApiCompleteRequestRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async completeRequest(requestParameters: AccountsApiCompleteRequestRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<Array<Account>>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.completeRequest(requestParameters, requestParameters.omit, requestParameters.fields, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Delete a specific account and all associated transactions, as well as owners, from your Belvo account.
         * @summary Delete an account
         * @param {AccountsApiDeleteRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async delete(requestParameters: AccountsApiDeleteRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<void>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.delete(requestParameters.id, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Get the details of a specific account.    > 🚧 Scheduled field deprecation   >   > Please note that we will soon be deprecating the following fields in our `loan_data` object:   > - `cutting_date`   > - `cutting_day`   > - `credit_limit`: replaced by the `principal` field.   > - `interest_rate`: replaced by the `interest_rates` object.   > - `last_payment_date`   > - `last_period_balance`: replaced by the `outstanding_balance ` field.   > - `limit_day`   > - `limit_date`: replaced by the `payment_day ` field.   > - `no_interest_payment`   > - `payment_due_day`
         * @summary Get an account\'s details
         * @param {AccountsApiGetDetailsRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getDetails(requestParameters: AccountsApiGetDetailsRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<Account>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getDetails(requestParameters.id, requestParameters.omit, requestParameters.fields, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Get a paginated list of all existing accounts in your Belvo account. By default, we return up to 100 results per page.
         * @summary List all accounts
         * @param {AccountsApiListRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async list(requestParameters: AccountsApiListRequest = {}, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<AccountsPaginatedResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.list(requestParameters.page, requestParameters.pageSize, requestParameters.omit, requestParameters.fields, requestParameters.link, requestParameters.balanceAvailable, requestParameters.balanceAvailableLt, requestParameters.balanceAvailableLte, requestParameters.balanceAvailableGt, requestParameters.balanceAvailableGte, requestParameters.balanceAvailableRange, requestParameters.balanceCurrent, requestParameters.balanceCurrentLt, requestParameters.balanceCurrentLte, requestParameters.balanceCurrentGt, requestParameters.balanceCurrentGte, requestParameters.balanceCurrentRange, requestParameters.category, requestParameters.categoryIn, requestParameters.createdAtGt, requestParameters.createdAtGte, requestParameters.createdAtLt, requestParameters.createdAtLte, requestParameters.createdAtRange, requestParameters.currency, requestParameters.currencyIn, requestParameters.id, requestParameters.idIn, requestParameters.institution, requestParameters.institutionIn, requestParameters.linkIn, requestParameters.name, requestParameters.nameIcontains, requestParameters.number, requestParameters.numberIn, requestParameters.publicIdentificationName, requestParameters.publicIdentificationValue, requestParameters.type, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Retrieve accounts from an existing link.    > 🚧 Scheduled field deprecation   >    > Please note that we will soon be deprecating the following fields in our `loan_data` object:   > - `cutting_date`   > - `cutting_day`   > - `credit_limit`: replaced by the `principal` field.   > - `interest_rate`: replaced by the `interest_rates` object.   > - `last_payment_date`   > - `last_period_balance`: replaced by the `outstanding_balance ` field.   > - `limit_day`   > - `limit_date`: replaced by the `payment_day ` field.   > - `no_interest_payment`   > - `payment_due_day`
         * @summary Retrieve accounts for a link
         * @param {AccountsApiRetrieveRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async retrieve(requestParameters: AccountsApiRetrieveRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<Array<Account>>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.retrieve(requestParameters, requestParameters.omit, requestParameters.fields, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * AccountsApi - factory interface
 * @export
 */
export const AccountsApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = AccountsApiFp(configuration)
    return {
        /**
         * Used to resume an Account retrieve session that was paused because an MFA token was required by the institution.    > 🚧 Scheduled field deprecation   >    > Please note that we will soon be deprecating the following fields in our `loan_data` object:   > - `cutting_date`   > - `cutting_day`   > - `credit_limit`: replaced by the `principal` field.   > - `interest_rate`: replaced by the `interest_rates` object.   > - `last_payment_date`   > - `last_period_balance`: replaced by the `outstanding_balance ` field.   > - `limit_day`   > - `limit_date`: replaced by the `payment_day ` field.   > - `no_interest_payment`   > - `payment_due_day`
         * @summary Complete an accounts request
         * @param {AccountsApiCompleteRequestRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        completeRequest(requestParameters: AccountsApiCompleteRequestRequest, options?: AxiosRequestConfig): AxiosPromise<Array<Account>> {
            return localVarFp.completeRequest(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * Delete a specific account and all associated transactions, as well as owners, from your Belvo account.
         * @summary Delete an account
         * @param {AccountsApiDeleteRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        delete(requestParameters: AccountsApiDeleteRequest, options?: AxiosRequestConfig): AxiosPromise<void> {
            return localVarFp.delete(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * Get the details of a specific account.    > 🚧 Scheduled field deprecation   >   > Please note that we will soon be deprecating the following fields in our `loan_data` object:   > - `cutting_date`   > - `cutting_day`   > - `credit_limit`: replaced by the `principal` field.   > - `interest_rate`: replaced by the `interest_rates` object.   > - `last_payment_date`   > - `last_period_balance`: replaced by the `outstanding_balance ` field.   > - `limit_day`   > - `limit_date`: replaced by the `payment_day ` field.   > - `no_interest_payment`   > - `payment_due_day`
         * @summary Get an account\'s details
         * @param {AccountsApiGetDetailsRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDetails(requestParameters: AccountsApiGetDetailsRequest, options?: AxiosRequestConfig): AxiosPromise<Account> {
            return localVarFp.getDetails(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * Get a paginated list of all existing accounts in your Belvo account. By default, we return up to 100 results per page.
         * @summary List all accounts
         * @param {AccountsApiListRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        list(requestParameters: AccountsApiListRequest = {}, options?: AxiosRequestConfig): AxiosPromise<AccountsPaginatedResponse> {
            return localVarFp.list(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * Retrieve accounts from an existing link.    > 🚧 Scheduled field deprecation   >    > Please note that we will soon be deprecating the following fields in our `loan_data` object:   > - `cutting_date`   > - `cutting_day`   > - `credit_limit`: replaced by the `principal` field.   > - `interest_rate`: replaced by the `interest_rates` object.   > - `last_payment_date`   > - `last_period_balance`: replaced by the `outstanding_balance ` field.   > - `limit_day`   > - `limit_date`: replaced by the `payment_day ` field.   > - `no_interest_payment`   > - `payment_due_day`
         * @summary Retrieve accounts for a link
         * @param {AccountsApiRetrieveRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        retrieve(requestParameters: AccountsApiRetrieveRequest, options?: AxiosRequestConfig): AxiosPromise<Array<Account>> {
            return localVarFp.retrieve(requestParameters, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * Request parameters for completeRequest operation in AccountsApi.
 * @export
 * @interface AccountsApiCompleteRequestRequest
 */
export type AccountsApiCompleteRequestRequest = {
    
    /**
    * Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof AccountsApiCompleteRequest
    */
    readonly omit?: string
    
    /**
    * Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof AccountsApiCompleteRequest
    */
    readonly fields?: string
    
} & PatchBody

/**
 * Request parameters for delete operation in AccountsApi.
 * @export
 * @interface AccountsApiDeleteRequest
 */
export type AccountsApiDeleteRequest = {
    
    /**
    * The `account.id` you want to delete
    * @type {string}
    * @memberof AccountsApiDelete
    */
    readonly id: string
    
}

/**
 * Request parameters for getDetails operation in AccountsApi.
 * @export
 * @interface AccountsApiGetDetailsRequest
 */
export type AccountsApiGetDetailsRequest = {
    
    /**
    * The `account.id` you want to get detailed information about.
    * @type {string}
    * @memberof AccountsApiGetDetails
    */
    readonly id: string
    
    /**
    * Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof AccountsApiGetDetails
    */
    readonly omit?: string
    
    /**
    * Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof AccountsApiGetDetails
    */
    readonly fields?: string
    
}

/**
 * Request parameters for list operation in AccountsApi.
 * @export
 * @interface AccountsApiListRequest
 */
export type AccountsApiListRequest = {
    
    /**
    * A page number within the paginated result set.
    * @type {number}
    * @memberof AccountsApiList
    */
    readonly page?: number
    
    /**
    * Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000). 
    * @type {number}
    * @memberof AccountsApiList
    */
    readonly pageSize?: number
    
    /**
    * Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof AccountsApiList
    */
    readonly omit?: string
    
    /**
    * Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof AccountsApiList
    */
    readonly fields?: string
    
    /**
    * The `link.id` you want to filter by.  ℹ️ We highly recommend adding the `link.id` filter in order to improve your performance. 
    * @type {string}
    * @memberof AccountsApiList
    */
    readonly link?: string
    
    /**
    * Return accounts that have a `balance.available` matching exactly this value.
    * @type {string}
    * @memberof AccountsApiList
    */
    readonly balanceAvailable?: string
    
    /**
    * Return accounts that have a `balance.available` less than this value.
    * @type {string}
    * @memberof AccountsApiList
    */
    readonly balanceAvailableLt?: string
    
    /**
    * Return accounts that have a `balance.available` less than or equal to this value.
    * @type {string}
    * @memberof AccountsApiList
    */
    readonly balanceAvailableLte?: string
    
    /**
    * Return accounts that have a `balance.available` greater than this value.
    * @type {string}
    * @memberof AccountsApiList
    */
    readonly balanceAvailableGt?: string
    
    /**
    * Return accounts that have a `balance.available` greater than or equal to this value.
    * @type {string}
    * @memberof AccountsApiList
    */
    readonly balanceAvailableGte?: string
    
    /**
    * Return accounts that have a `balance.available` within a range of two values.
    * @type {string}
    * @memberof AccountsApiList
    */
    readonly balanceAvailableRange?: string
    
    /**
    * Return accounts that have a `balance.current` matching exactly this value.
    * @type {string}
    * @memberof AccountsApiList
    */
    readonly balanceCurrent?: string
    
    /**
    * Return accounts that have a `balance.current` less than this value.
    * @type {string}
    * @memberof AccountsApiList
    */
    readonly balanceCurrentLt?: string
    
    /**
    * Return accounts that have a `balance.available` less than or equal to this value.
    * @type {string}
    * @memberof AccountsApiList
    */
    readonly balanceCurrentLte?: string
    
    /**
    * Return accounts that have a `balance.current` greater than this value.
    * @type {string}
    * @memberof AccountsApiList
    */
    readonly balanceCurrentGt?: string
    
    /**
    * Return accounts that have a `balance.available` greater than or equal to this value.
    * @type {string}
    * @memberof AccountsApiList
    */
    readonly balanceCurrentGte?: string
    
    /**
    * Return accounts that have a `balance.available` within a range of two values.
    * @type {string}
    * @memberof AccountsApiList
    */
    readonly balanceCurrentRange?: string
    
    /**
    * Return accounts only for the given category (for example, `CHECKING_ACCOUNT` and `SAVINGS_ACCOUNT`).
    * @type {string}
    * @memberof AccountsApiList
    */
    readonly category?: string
    
    /**
    * Return accounts only for the given categories (for example, `CHECKING_ACCOUNT` and `SAVINGS_ACCOUNT`).
    * @type {string}
    * @memberof AccountsApiList
    */
    readonly categoryIn?: string
    
    /**
    * Return accounts that were last updated in Belvo\'s database after this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    * @type {string}
    * @memberof AccountsApiList
    */
    readonly createdAtGt?: string
    
    /**
    * Return accounts that were last updated in Belvo\'s database after or on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    * @type {string}
    * @memberof AccountsApiList
    */
    readonly createdAtGte?: string
    
    /**
    * Return accounts that were last updated in Belvo\'s database before this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    * @type {string}
    * @memberof AccountsApiList
    */
    readonly createdAtLt?: string
    
    /**
    * Return accounts that were last updated in Belvo\'s database before or on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    * @type {string}
    * @memberof AccountsApiList
    */
    readonly createdAtLte?: string
    
    /**
    * Return accounts that were last updated in Belvo\'s database between two dates (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    * @type {string}
    * @memberof AccountsApiList
    */
    readonly createdAtRange?: string
    
    /**
    * Return accounts that hold finances in only this three-letter currency code.
    * @type {string}
    * @memberof AccountsApiList
    */
    readonly currency?: string
    
    /**
    * Return accounts that hold finances in one of these three-letter currency codes.
    * @type {string}
    * @memberof AccountsApiList
    */
    readonly currencyIn?: string
    
    /**
    * Return information only for this `account.id`.
    * @type {string}
    * @memberof AccountsApiList
    */
    readonly id?: string
    
    /**
    * Return information for these `account.id`s.
    * @type {string}
    * @memberof AccountsApiList
    */
    readonly idIn?: string
    
    /**
    * Return accounts only for this institution (use the Belvo-designated name, such as `erebor_mx_retail`).
    * @type {string}
    * @memberof AccountsApiList
    */
    readonly institution?: string
    
    /**
    * Return accounts only for these institutions (use the Belvo-designated names, such as `erebor_mx_retail` and `gringotts_mx_retail`).
    * @type {string}
    * @memberof AccountsApiList
    */
    readonly institutionIn?: string
    
    /**
    * Return accounts only for these `link.id`s.
    * @type {string}
    * @memberof AccountsApiList
    */
    readonly linkIn?: string
    
    /**
    * Return accounts with exactly this internal (specified by the institution) name.
    * @type {string}
    * @memberof AccountsApiList
    */
    readonly name?: string
    
    /**
    * Return accounts partially matching this internal (specified by the institution) name.
    * @type {string}
    * @memberof AccountsApiList
    */
    readonly nameIcontains?: string
    
    /**
    * Return information only for this account number (as specified by the institution).
    * @type {string}
    * @memberof AccountsApiList
    */
    readonly number?: string
    
    /**
    * Return information for these account numbers (as specified by the institution).
    * @type {string}
    * @memberof AccountsApiList
    */
    readonly numberIn?: string
    
    /**
    * Return information only for this type of account ID. For example, CLABE accounts.
    * @type {string}
    * @memberof AccountsApiList
    */
    readonly publicIdentificationName?: string
    
    /**
    * Return information only for this account ID. For example, the account number for a CLABE account.
    * @type {string}
    * @memberof AccountsApiList
    */
    readonly publicIdentificationValue?: string
    
    /**
    * Return information only for accounts matching this account type, as designated by the institution.
    * @type {string}
    * @memberof AccountsApiList
    */
    readonly type?: string
    
}

/**
 * Request parameters for retrieve operation in AccountsApi.
 * @export
 * @interface AccountsApiRetrieveRequest
 */
export type AccountsApiRetrieveRequest = {
    
    /**
    * Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof AccountsApiRetrieve
    */
    readonly omit?: string
    
    /**
    * Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof AccountsApiRetrieve
    */
    readonly fields?: string
    
} & StandardRequest

/**
 * AccountsApi - object-oriented interface
 * @export
 * @class AccountsApi
 * @extends {BaseAPI}
 */
export class AccountsApi extends AccountsApiCustom {
    /**
     * Used to resume an Account retrieve session that was paused because an MFA token was required by the institution.    > 🚧 Scheduled field deprecation   >    > Please note that we will soon be deprecating the following fields in our `loan_data` object:   > - `cutting_date`   > - `cutting_day`   > - `credit_limit`: replaced by the `principal` field.   > - `interest_rate`: replaced by the `interest_rates` object.   > - `last_payment_date`   > - `last_period_balance`: replaced by the `outstanding_balance ` field.   > - `limit_day`   > - `limit_date`: replaced by the `payment_day ` field.   > - `no_interest_payment`   > - `payment_due_day`
     * @summary Complete an accounts request
     * @param {AccountsApiCompleteRequestRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof AccountsApi
     */
    public completeRequest(requestParameters: AccountsApiCompleteRequestRequest, options?: AxiosRequestConfig) {
        return AccountsApiFp(this.configuration).completeRequest(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * Delete a specific account and all associated transactions, as well as owners, from your Belvo account.
     * @summary Delete an account
     * @param {AccountsApiDeleteRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof AccountsApi
     */
    public delete(requestParameters: AccountsApiDeleteRequest, options?: AxiosRequestConfig) {
        return AccountsApiFp(this.configuration).delete(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * Get the details of a specific account.    > 🚧 Scheduled field deprecation   >   > Please note that we will soon be deprecating the following fields in our `loan_data` object:   > - `cutting_date`   > - `cutting_day`   > - `credit_limit`: replaced by the `principal` field.   > - `interest_rate`: replaced by the `interest_rates` object.   > - `last_payment_date`   > - `last_period_balance`: replaced by the `outstanding_balance ` field.   > - `limit_day`   > - `limit_date`: replaced by the `payment_day ` field.   > - `no_interest_payment`   > - `payment_due_day`
     * @summary Get an account\'s details
     * @param {AccountsApiGetDetailsRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof AccountsApi
     */
    public getDetails(requestParameters: AccountsApiGetDetailsRequest, options?: AxiosRequestConfig) {
        return AccountsApiFp(this.configuration).getDetails(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * Get a paginated list of all existing accounts in your Belvo account. By default, we return up to 100 results per page.
     * @summary List all accounts
     * @param {AccountsApiListRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof AccountsApi
     */
    public list(requestParameters: AccountsApiListRequest = {}, options?: AxiosRequestConfig) {
        return AccountsApiFp(this.configuration).list(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * Retrieve accounts from an existing link.    > 🚧 Scheduled field deprecation   >    > Please note that we will soon be deprecating the following fields in our `loan_data` object:   > - `cutting_date`   > - `cutting_day`   > - `credit_limit`: replaced by the `principal` field.   > - `interest_rate`: replaced by the `interest_rates` object.   > - `last_payment_date`   > - `last_period_balance`: replaced by the `outstanding_balance ` field.   > - `limit_day`   > - `limit_date`: replaced by the `payment_day ` field.   > - `no_interest_payment`   > - `payment_due_day`
     * @summary Retrieve accounts for a link
     * @param {AccountsApiRetrieveRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof AccountsApi
     */
    public retrieve(requestParameters: AccountsApiRetrieveRequest, options?: AxiosRequestConfig) {
        return AccountsApiFp(this.configuration).retrieve(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }
}
