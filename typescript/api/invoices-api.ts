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
import { EnumInvoiceType } from '../models';
// @ts-ignore
import { InvoicesGetDetailsResponse } from '../models';
// @ts-ignore
import { InvoicesRequest } from '../models';
// @ts-ignore
import { InvoicesResponsePaginatedResponse } from '../models';
// @ts-ignore
import { InvoicesResponsePaginatedResponseResultsInner } from '../models';
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
import { InvoicesApiCustom } from "./invoices-api-custom";
/**
 * InvoicesApi - axios parameter creator
 * @export
 */
export const InvoicesApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Used to resume an Invoice retrieve session that was paused because an MFA token was required by the institution.
         * @summary Complete an invoices request
         * @param {PatchBody} patchBody 
         * @param {string} [omit] Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {string} [fields] Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        completeRequest: async (patchBody: PatchBody, omit?: string, fields?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'patchBody' is not null or undefined
            assertParamExists('completeRequest', 'patchBody', patchBody)
            const localVarPath = `/api/invoices`;
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
         * Delete a specific invoice from your Belvo account.
         * @summary Delete an invoice
         * @param {string} id The &#x60;invoice.id&#x60; that you want to delete.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        delete: async (id: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'id' is not null or undefined
            assertParamExists('delete', 'id', id)
            const localVarPath = `/api/invoices/{id}`
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
         * Get the details of a specific invoice.
         * @summary Get an invoice\'s details
         * @param {string} id The &#x60;invoice.id&#x60; you want to get detailed information about.
         * @param {string} [omit] Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {string} [fields] Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDetails: async (id: string, omit?: string, fields?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'id' is not null or undefined
            assertParamExists('getDetails', 'id', id)
            const localVarPath = `/api/invoices/{id}`
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
         * Get a paginated list of all existing invoices in your Belvo account. By default, we return 100 results per page.
         * @summary List all invoices
         * @param {number} [page] A page number within the paginated result set.
         * @param {number} [pageSize] Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000). 
         * @param {string} [omit] Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {string} [fields] Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {string} [link] The &#x60;link.id&#x60; you want to filter by.  ℹ️ We highly recommend adding the &#x60;link.id&#x60; filter in order to improve your performance. 
         * @param {string} [createdAtGt] Return invoices that were last updated in Belvo\&#39;s database after this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp).
         * @param {string} [createdAtGte] Return invoices that were last updated in Belvo\&#39;s database after or on this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp).
         * @param {string} [createdAtLt] Return invoices that were last updated in Belvo\&#39;s database before this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp).
         * @param {string} [createdAtLte] Return invoices that were last updated in Belvo\&#39;s database before or on this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp).
         * @param {string} [createdAtRange] Return invoices that were last updated in Belvo\&#39;s database between two dates (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp).
         * @param {string} [id] Return information only for this &#x60;invoice.id&#x60;.
         * @param {string} [idIn] Return information only for these &#x60;invoice.id&#x60;s.
         * @param {string} [invoiceDate] Return invoices issued exactly on this date (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp).
         * @param {string} [invoiceDateLt] Return balances issued before this date (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp).
         * @param {string} [invoiceDateLte] Return balances issued on this date or earlier (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp).
         * @param {string} [invoiceDateGt] Return invoices issued after this date (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp).
         * @param {string} [invoiceDateGte] Return invoices issued on this date or later (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp).
         * @param {string} [invoiceDateRange] Return invoices issued within this date range (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp).
         * @param {string} [invoiceIdentification] Return an invoice with this ID (as provided by the insitution).
         * @param {string} [invoiceIdentificationIn] Return invoices with these IDs (as provided by the institution).
         * @param {string} [linkIn] Return invoices only for these &#x60;link.id&#x60;s.
         * @param {string} [status] Return invoices with this status. Can be either &#x60;Vigente&#x60; (valid) or &#x60;Cancelado&#x60; (cancelled).
         * @param {string} [statusIn] Return invoices with these statuses. Can be either &#x60;Vigente&#x60; (valid) or &#x60;Cancelado&#x60; (cancelled).
         * @param {string} [totalAmount] Return invoices matching exactly this value.
         * @param {string} [totalAmountLt] Return invoices less than this value.
         * @param {string} [totalAmountLte] Return invoices less than or equal to this value.
         * @param {string} [totalAmountGt] Return invoices greater than this value.
         * @param {string} [totalAmountGte] Return invoices greater than or equal to this value.
         * @param {string} [totalAmountRange] Return invoices between these two values.
         * @param {string} [type] Return invoices of this type. Can be either &#x60;OUTFLOW&#x60; or &#x60;INFLOW&#x60;.
         * @param {string} [typeIn] Return invoices of these types. Can be either &#x60;OUTFLOW&#x60; or &#x60;INFLOW&#x60;.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        list: async (page?: number, pageSize?: number, omit?: string, fields?: string, link?: string, createdAtGt?: string, createdAtGte?: string, createdAtLt?: string, createdAtLte?: string, createdAtRange?: string, id?: string, idIn?: string, invoiceDate?: string, invoiceDateLt?: string, invoiceDateLte?: string, invoiceDateGt?: string, invoiceDateGte?: string, invoiceDateRange?: string, invoiceIdentification?: string, invoiceIdentificationIn?: string, linkIn?: string, status?: string, statusIn?: string, totalAmount?: string, totalAmountLt?: string, totalAmountLte?: string, totalAmountGt?: string, totalAmountGte?: string, totalAmountRange?: string, type?: string, typeIn?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/api/invoices`;
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

            if (id !== undefined) {
                localVarQueryParameter['id'] = id;
            }

            if (idIn !== undefined) {
                localVarQueryParameter['id__in'] = idIn;
            }

            if (invoiceDate !== undefined) {
                localVarQueryParameter['invoice_date'] = invoiceDate;
            }

            if (invoiceDateLt !== undefined) {
                localVarQueryParameter['invoice_date__lt'] = invoiceDateLt;
            }

            if (invoiceDateLte !== undefined) {
                localVarQueryParameter['invoice_date__lte'] = invoiceDateLte;
            }

            if (invoiceDateGt !== undefined) {
                localVarQueryParameter['invoice_date__gt'] = invoiceDateGt;
            }

            if (invoiceDateGte !== undefined) {
                localVarQueryParameter['invoice_date__gte'] = invoiceDateGte;
            }

            if (invoiceDateRange !== undefined) {
                localVarQueryParameter['invoice_date__range'] = invoiceDateRange;
            }

            if (invoiceIdentification !== undefined) {
                localVarQueryParameter['invoice_identification'] = invoiceIdentification;
            }

            if (invoiceIdentificationIn !== undefined) {
                localVarQueryParameter['invoice_identification__in'] = invoiceIdentificationIn;
            }

            if (linkIn !== undefined) {
                localVarQueryParameter['link__in'] = linkIn;
            }

            if (status !== undefined) {
                localVarQueryParameter['status'] = status;
            }

            if (statusIn !== undefined) {
                localVarQueryParameter['status__in'] = statusIn;
            }

            if (totalAmount !== undefined) {
                localVarQueryParameter['total_amount'] = totalAmount;
            }

            if (totalAmountLt !== undefined) {
                localVarQueryParameter['total_amount__lt'] = totalAmountLt;
            }

            if (totalAmountLte !== undefined) {
                localVarQueryParameter['total_amount__lte'] = totalAmountLte;
            }

            if (totalAmountGt !== undefined) {
                localVarQueryParameter['total_amount__gt'] = totalAmountGt;
            }

            if (totalAmountGte !== undefined) {
                localVarQueryParameter['total_amount__gte'] = totalAmountGte;
            }

            if (totalAmountRange !== undefined) {
                localVarQueryParameter['total_amount__range'] = totalAmountRange;
            }

            if (type !== undefined) {
                localVarQueryParameter['type'] = type;
            }

            if (typeIn !== undefined) {
                localVarQueryParameter['type__in'] = typeIn;
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
         * Retrieve invoice information from a specific fiscal link. <div style=\"background-color:#f4f6f8; border-left: 6px solid #0663F9;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\"> <strong>Info: </strong> You can ask for up to **one** year (365 days) of invoices per request. If you need invoices for more than one year, just make another request. </div> 
         * @summary Retrieve invoices for a link
         * @param {InvoicesRequest} invoicesRequest 
         * @param {string} [omit] Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {string} [fields] Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        retrieve: async (invoicesRequest: InvoicesRequest, omit?: string, fields?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'invoicesRequest' is not null or undefined
            assertParamExists('retrieve', 'invoicesRequest', invoicesRequest)
            const localVarPath = `/api/invoices`;
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
                requestBody: invoicesRequest,
                queryParameters: localVarQueryParameter,
                requestConfig: localVarRequestOptions,
                path: localVarPath,
                configuration
            });
            localVarRequestOptions.data = serializeDataIfNeeded(invoicesRequest, localVarRequestOptions, configuration)

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * InvoicesApi - functional programming interface
 * @export
 */
export const InvoicesApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = InvoicesApiAxiosParamCreator(configuration)
    return {
        /**
         * Used to resume an Invoice retrieve session that was paused because an MFA token was required by the institution.
         * @summary Complete an invoices request
         * @param {InvoicesApiCompleteRequestRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async completeRequest(requestParameters: InvoicesApiCompleteRequestRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<Array<InvoicesResponsePaginatedResponseResultsInner>>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.completeRequest(requestParameters, requestParameters.omit, requestParameters.fields, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Delete a specific invoice from your Belvo account.
         * @summary Delete an invoice
         * @param {InvoicesApiDeleteRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async delete(requestParameters: InvoicesApiDeleteRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<void>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.delete(requestParameters.id, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Get the details of a specific invoice.
         * @summary Get an invoice\'s details
         * @param {InvoicesApiGetDetailsRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getDetails(requestParameters: InvoicesApiGetDetailsRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<InvoicesGetDetailsResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getDetails(requestParameters.id, requestParameters.omit, requestParameters.fields, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Get a paginated list of all existing invoices in your Belvo account. By default, we return 100 results per page.
         * @summary List all invoices
         * @param {InvoicesApiListRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async list(requestParameters: InvoicesApiListRequest = {}, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<InvoicesResponsePaginatedResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.list(requestParameters.page, requestParameters.pageSize, requestParameters.omit, requestParameters.fields, requestParameters.link, requestParameters.createdAtGt, requestParameters.createdAtGte, requestParameters.createdAtLt, requestParameters.createdAtLte, requestParameters.createdAtRange, requestParameters.id, requestParameters.idIn, requestParameters.invoiceDate, requestParameters.invoiceDateLt, requestParameters.invoiceDateLte, requestParameters.invoiceDateGt, requestParameters.invoiceDateGte, requestParameters.invoiceDateRange, requestParameters.invoiceIdentification, requestParameters.invoiceIdentificationIn, requestParameters.linkIn, requestParameters.status, requestParameters.statusIn, requestParameters.totalAmount, requestParameters.totalAmountLt, requestParameters.totalAmountLte, requestParameters.totalAmountGt, requestParameters.totalAmountGte, requestParameters.totalAmountRange, requestParameters.type, requestParameters.typeIn, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Retrieve invoice information from a specific fiscal link. <div style=\"background-color:#f4f6f8; border-left: 6px solid #0663F9;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\"> <strong>Info: </strong> You can ask for up to **one** year (365 days) of invoices per request. If you need invoices for more than one year, just make another request. </div> 
         * @summary Retrieve invoices for a link
         * @param {InvoicesApiRetrieveRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async retrieve(requestParameters: InvoicesApiRetrieveRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<Array<InvoicesResponsePaginatedResponseResultsInner>>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.retrieve(requestParameters, requestParameters.omit, requestParameters.fields, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * InvoicesApi - factory interface
 * @export
 */
export const InvoicesApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = InvoicesApiFp(configuration)
    return {
        /**
         * Used to resume an Invoice retrieve session that was paused because an MFA token was required by the institution.
         * @summary Complete an invoices request
         * @param {InvoicesApiCompleteRequestRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        completeRequest(requestParameters: InvoicesApiCompleteRequestRequest, options?: AxiosRequestConfig): AxiosPromise<Array<InvoicesResponsePaginatedResponseResultsInner>> {
            return localVarFp.completeRequest(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * Delete a specific invoice from your Belvo account.
         * @summary Delete an invoice
         * @param {InvoicesApiDeleteRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        delete(requestParameters: InvoicesApiDeleteRequest, options?: AxiosRequestConfig): AxiosPromise<void> {
            return localVarFp.delete(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * Get the details of a specific invoice.
         * @summary Get an invoice\'s details
         * @param {InvoicesApiGetDetailsRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDetails(requestParameters: InvoicesApiGetDetailsRequest, options?: AxiosRequestConfig): AxiosPromise<InvoicesGetDetailsResponse> {
            return localVarFp.getDetails(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * Get a paginated list of all existing invoices in your Belvo account. By default, we return 100 results per page.
         * @summary List all invoices
         * @param {InvoicesApiListRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        list(requestParameters: InvoicesApiListRequest = {}, options?: AxiosRequestConfig): AxiosPromise<InvoicesResponsePaginatedResponse> {
            return localVarFp.list(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * Retrieve invoice information from a specific fiscal link. <div style=\"background-color:#f4f6f8; border-left: 6px solid #0663F9;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\"> <strong>Info: </strong> You can ask for up to **one** year (365 days) of invoices per request. If you need invoices for more than one year, just make another request. </div> 
         * @summary Retrieve invoices for a link
         * @param {InvoicesApiRetrieveRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        retrieve(requestParameters: InvoicesApiRetrieveRequest, options?: AxiosRequestConfig): AxiosPromise<Array<InvoicesResponsePaginatedResponseResultsInner>> {
            return localVarFp.retrieve(requestParameters, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * Request parameters for completeRequest operation in InvoicesApi.
 * @export
 * @interface InvoicesApiCompleteRequestRequest
 */
export type InvoicesApiCompleteRequestRequest = {
    
    /**
    * Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof InvoicesApiCompleteRequest
    */
    readonly omit?: string
    
    /**
    * Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof InvoicesApiCompleteRequest
    */
    readonly fields?: string
    
} & PatchBody

/**
 * Request parameters for delete operation in InvoicesApi.
 * @export
 * @interface InvoicesApiDeleteRequest
 */
export type InvoicesApiDeleteRequest = {
    
    /**
    * The `invoice.id` that you want to delete.
    * @type {string}
    * @memberof InvoicesApiDelete
    */
    readonly id: string
    
}

/**
 * Request parameters for getDetails operation in InvoicesApi.
 * @export
 * @interface InvoicesApiGetDetailsRequest
 */
export type InvoicesApiGetDetailsRequest = {
    
    /**
    * The `invoice.id` you want to get detailed information about.
    * @type {string}
    * @memberof InvoicesApiGetDetails
    */
    readonly id: string
    
    /**
    * Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof InvoicesApiGetDetails
    */
    readonly omit?: string
    
    /**
    * Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof InvoicesApiGetDetails
    */
    readonly fields?: string
    
}

/**
 * Request parameters for list operation in InvoicesApi.
 * @export
 * @interface InvoicesApiListRequest
 */
export type InvoicesApiListRequest = {
    
    /**
    * A page number within the paginated result set.
    * @type {number}
    * @memberof InvoicesApiList
    */
    readonly page?: number
    
    /**
    * Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000). 
    * @type {number}
    * @memberof InvoicesApiList
    */
    readonly pageSize?: number
    
    /**
    * Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof InvoicesApiList
    */
    readonly omit?: string
    
    /**
    * Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof InvoicesApiList
    */
    readonly fields?: string
    
    /**
    * The `link.id` you want to filter by.  ℹ️ We highly recommend adding the `link.id` filter in order to improve your performance. 
    * @type {string}
    * @memberof InvoicesApiList
    */
    readonly link?: string
    
    /**
    * Return invoices that were last updated in Belvo\'s database after this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    * @type {string}
    * @memberof InvoicesApiList
    */
    readonly createdAtGt?: string
    
    /**
    * Return invoices that were last updated in Belvo\'s database after or on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    * @type {string}
    * @memberof InvoicesApiList
    */
    readonly createdAtGte?: string
    
    /**
    * Return invoices that were last updated in Belvo\'s database before this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    * @type {string}
    * @memberof InvoicesApiList
    */
    readonly createdAtLt?: string
    
    /**
    * Return invoices that were last updated in Belvo\'s database before or on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    * @type {string}
    * @memberof InvoicesApiList
    */
    readonly createdAtLte?: string
    
    /**
    * Return invoices that were last updated in Belvo\'s database between two dates (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    * @type {string}
    * @memberof InvoicesApiList
    */
    readonly createdAtRange?: string
    
    /**
    * Return information only for this `invoice.id`.
    * @type {string}
    * @memberof InvoicesApiList
    */
    readonly id?: string
    
    /**
    * Return information only for these `invoice.id`s.
    * @type {string}
    * @memberof InvoicesApiList
    */
    readonly idIn?: string
    
    /**
    * Return invoices issued exactly on this date (`YYYY-MM-DD` or full ISO-8601 timestamp).
    * @type {string}
    * @memberof InvoicesApiList
    */
    readonly invoiceDate?: string
    
    /**
    * Return balances issued before this date (`YYYY-MM-DD` or full ISO-8601 timestamp).
    * @type {string}
    * @memberof InvoicesApiList
    */
    readonly invoiceDateLt?: string
    
    /**
    * Return balances issued on this date or earlier (`YYYY-MM-DD` or full ISO-8601 timestamp).
    * @type {string}
    * @memberof InvoicesApiList
    */
    readonly invoiceDateLte?: string
    
    /**
    * Return invoices issued after this date (`YYYY-MM-DD` or full ISO-8601 timestamp).
    * @type {string}
    * @memberof InvoicesApiList
    */
    readonly invoiceDateGt?: string
    
    /**
    * Return invoices issued on this date or later (`YYYY-MM-DD` or full ISO-8601 timestamp).
    * @type {string}
    * @memberof InvoicesApiList
    */
    readonly invoiceDateGte?: string
    
    /**
    * Return invoices issued within this date range (`YYYY-MM-DD` or full ISO-8601 timestamp).
    * @type {string}
    * @memberof InvoicesApiList
    */
    readonly invoiceDateRange?: string
    
    /**
    * Return an invoice with this ID (as provided by the insitution).
    * @type {string}
    * @memberof InvoicesApiList
    */
    readonly invoiceIdentification?: string
    
    /**
    * Return invoices with these IDs (as provided by the institution).
    * @type {string}
    * @memberof InvoicesApiList
    */
    readonly invoiceIdentificationIn?: string
    
    /**
    * Return invoices only for these `link.id`s.
    * @type {string}
    * @memberof InvoicesApiList
    */
    readonly linkIn?: string
    
    /**
    * Return invoices with this status. Can be either `Vigente` (valid) or `Cancelado` (cancelled).
    * @type {string}
    * @memberof InvoicesApiList
    */
    readonly status?: string
    
    /**
    * Return invoices with these statuses. Can be either `Vigente` (valid) or `Cancelado` (cancelled).
    * @type {string}
    * @memberof InvoicesApiList
    */
    readonly statusIn?: string
    
    /**
    * Return invoices matching exactly this value.
    * @type {string}
    * @memberof InvoicesApiList
    */
    readonly totalAmount?: string
    
    /**
    * Return invoices less than this value.
    * @type {string}
    * @memberof InvoicesApiList
    */
    readonly totalAmountLt?: string
    
    /**
    * Return invoices less than or equal to this value.
    * @type {string}
    * @memberof InvoicesApiList
    */
    readonly totalAmountLte?: string
    
    /**
    * Return invoices greater than this value.
    * @type {string}
    * @memberof InvoicesApiList
    */
    readonly totalAmountGt?: string
    
    /**
    * Return invoices greater than or equal to this value.
    * @type {string}
    * @memberof InvoicesApiList
    */
    readonly totalAmountGte?: string
    
    /**
    * Return invoices between these two values.
    * @type {string}
    * @memberof InvoicesApiList
    */
    readonly totalAmountRange?: string
    
    /**
    * Return invoices of this type. Can be either `OUTFLOW` or `INFLOW`.
    * @type {string}
    * @memberof InvoicesApiList
    */
    readonly type?: string
    
    /**
    * Return invoices of these types. Can be either `OUTFLOW` or `INFLOW`.
    * @type {string}
    * @memberof InvoicesApiList
    */
    readonly typeIn?: string
    
}

/**
 * Request parameters for retrieve operation in InvoicesApi.
 * @export
 * @interface InvoicesApiRetrieveRequest
 */
export type InvoicesApiRetrieveRequest = {
    
    /**
    * Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof InvoicesApiRetrieve
    */
    readonly omit?: string
    
    /**
    * Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    * @type {string}
    * @memberof InvoicesApiRetrieve
    */
    readonly fields?: string
    
} & InvoicesRequest

/**
 * InvoicesApi - object-oriented interface
 * @export
 * @class InvoicesApi
 * @extends {BaseAPI}
 */
export class InvoicesApi extends InvoicesApiCustom {
    /**
     * Used to resume an Invoice retrieve session that was paused because an MFA token was required by the institution.
     * @summary Complete an invoices request
     * @param {InvoicesApiCompleteRequestRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof InvoicesApi
     */
    public completeRequest(requestParameters: InvoicesApiCompleteRequestRequest, options?: AxiosRequestConfig) {
        return InvoicesApiFp(this.configuration).completeRequest(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * Delete a specific invoice from your Belvo account.
     * @summary Delete an invoice
     * @param {InvoicesApiDeleteRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof InvoicesApi
     */
    public delete(requestParameters: InvoicesApiDeleteRequest, options?: AxiosRequestConfig) {
        return InvoicesApiFp(this.configuration).delete(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * Get the details of a specific invoice.
     * @summary Get an invoice\'s details
     * @param {InvoicesApiGetDetailsRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof InvoicesApi
     */
    public getDetails(requestParameters: InvoicesApiGetDetailsRequest, options?: AxiosRequestConfig) {
        return InvoicesApiFp(this.configuration).getDetails(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * Get a paginated list of all existing invoices in your Belvo account. By default, we return 100 results per page.
     * @summary List all invoices
     * @param {InvoicesApiListRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof InvoicesApi
     */
    public list(requestParameters: InvoicesApiListRequest = {}, options?: AxiosRequestConfig) {
        return InvoicesApiFp(this.configuration).list(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * Retrieve invoice information from a specific fiscal link. <div style=\"background-color:#f4f6f8; border-left: 6px solid #0663F9;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\"> <strong>Info: </strong> You can ask for up to **one** year (365 days) of invoices per request. If you need invoices for more than one year, just make another request. </div> 
     * @summary Retrieve invoices for a link
     * @param {InvoicesApiRetrieveRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof InvoicesApi
     */
    public retrieve(requestParameters: InvoicesApiRetrieveRequest, options?: AxiosRequestConfig) {
        return InvoicesApiFp(this.configuration).retrieve(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }
}
