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
import { EnumPaymentLinkAllowedPaymentMethod } from '../models';
// @ts-ignore
import { EnumPaymentLinkProvider } from '../models';
// @ts-ignore
import { Model400ValidationError } from '../models';
// @ts-ignore
import { Model401UnauthorizedError } from '../models';
// @ts-ignore
import { Model404NotFoundError } from '../models';
// @ts-ignore
import { Model408RequestTimeoutError } from '../models';
// @ts-ignore
import { Model500UnexpectedError } from '../models';
// @ts-ignore
import { PatchPaymentIntentPse } from '../models';
// @ts-ignore
import { PatchPaymentIntentPsePaymentMethodDetails } from '../models';
// @ts-ignore
import { PaymentIntentPaginatedResponse } from '../models';
// @ts-ignore
import { PaymentIntentsCompleteResponse } from '../models';
// @ts-ignore
import { PaymentIntentsCreateRequest } from '../models';
// @ts-ignore
import { PaymentIntentsCreateResponse } from '../models';
// @ts-ignore
import { PaymentIntentsGetDetailsResponse } from '../models';
// @ts-ignore
import { PaymentIntentsPaymentMethodDetailsPse } from '../models';
import { paginate } from "../pagination/paginate";
import { requestBeforeHook } from '../requestBeforeHook';
import { PaymentIntentsApiCustom } from "./payment-intents-api-custom";
/**
 * PaymentIntentsApi - axios parameter creator
 * @export
 */
export const PaymentIntentsApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Complete a new payment intent.  During the payment intent flow, you\'ll need to prompt your customer to provide additional information about their institution, bank account, and login credentials. This is done by sending PATCH calls with the information that Belvo asked you display in each `next_step` object. If you need more information on how to complete a payment intent, check our PSE payment initiation guides for  🇨🇴 Colombia.
         * @summary Complete a payment intent
         * @param {string} id The &#x60;payment-intent.id&#x60; you want to get detailed information about.
         * @param {PatchPaymentIntentPse} [patchPaymentIntentPse] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        complete: async (id: string, patchPaymentIntentPse?: PatchPaymentIntentPse, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'id' is not null or undefined
            assertParamExists('complete', 'id', id)
            const localVarPath = `/payments/payment-intents/{id}`
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

    
            localVarHeaderParameter['Content-Type'] = 'application/json';

            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            requestBeforeHook({
                requestBody: patchPaymentIntentPse,
                queryParameters: localVarQueryParameter,
                requestConfig: localVarRequestOptions,
                path: localVarPath,
                configuration
            });
            localVarRequestOptions.data = serializeDataIfNeeded(patchPaymentIntentPse, localVarRequestOptions, configuration)

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Create a payment intent.
         * @summary Create a new payment intent
         * @param {PaymentIntentsCreateRequest} [paymentIntentsCreateRequest] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        create: async (paymentIntentsCreateRequest?: PaymentIntentsCreateRequest, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/payments/payment-intents`;
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

    
            localVarHeaderParameter['Content-Type'] = 'application/json';

            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            requestBeforeHook({
                requestBody: paymentIntentsCreateRequest,
                queryParameters: localVarQueryParameter,
                requestConfig: localVarRequestOptions,
                path: localVarPath,
                configuration
            });
            localVarRequestOptions.data = serializeDataIfNeeded(paymentIntentsCreateRequest, localVarRequestOptions, configuration)

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Get the details about a specific payment intent.
         * @summary Get details about a payment intent.
         * @param {string} id The &#x60;payment-intent.id&#x60; you want to get detailed information about.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDetails: async (id: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'id' is not null or undefined
            assertParamExists('getDetails', 'id', id)
            const localVarPath = `/payments/payment-intents/{id}`
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
         * List all payment intents associated with your Belvo account.
         * @summary List all payment intents
         * @param {number} [page] A page number within the paginated result set.
         * @param {string} [idIn] One or more &#x60;payment-intent.id&#x60;s (comma separated) that you want to get results for.
         * @param {string} [createdAt] Return results only for this date (in &#x60;YYYY-MM-DD&#x60; format).
         * @param {string} [createdAtGt] Return results only after this date (in &#x60;YYYY-MM-DD&#x60; format).
         * @param {string} [createdAtGte] Return results only for this date and after (in &#x60;YYYY-MM-DD&#x60; format).
         * @param {string} [createdAtLt] Return results only before this date (in &#x60;YYYY-MM-DD&#x60; format).
         * @param {string} [createdAtLte] Return results only for this date and before (in &#x60;YYYY-MM-DD&#x60; format).
         * @param {string} [createdAtRange] Return results between this date range (in &#x60;YYYY-MM-DD&#x60; format).
         * @param {string} [provider] Return results only for this value.
         * @param {string} [paymentMethodType] Return results only for this value.
         * @param {string} [customer] The &#x60;customer.id&#x60; you want to get results for.
         * @param {string} [customerIn] One or more &#x60;customer.id&#x60;s (comma separated) that you want to get results for.
         * @param {string} [amount] Return results only for this value.
         * @param {string} [amountGt] Return results only for more than this amount.
         * @param {string} [amountGte] Return results only for and more than this amount.
         * @param {string} [amountLt] Return results only for less than this amount.
         * @param {string} [amountLte] Return results only for this amount or less.
         * @param {string} [status] Return results only for this value.
         * @param {string} [statusIn] Return results for listed status.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        list: async (page?: number, idIn?: string, createdAt?: string, createdAtGt?: string, createdAtGte?: string, createdAtLt?: string, createdAtLte?: string, createdAtRange?: string, provider?: string, paymentMethodType?: string, customer?: string, customerIn?: string, amount?: string, amountGt?: string, amountGte?: string, amountLt?: string, amountLte?: string, status?: string, statusIn?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/payments/payment-intents`;
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

            if (idIn !== undefined) {
                localVarQueryParameter['id__in'] = idIn;
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

            if (provider !== undefined) {
                localVarQueryParameter['provider'] = provider;
            }

            if (paymentMethodType !== undefined) {
                localVarQueryParameter['payment_method_type'] = paymentMethodType;
            }

            if (customer !== undefined) {
                localVarQueryParameter['customer'] = customer;
            }

            if (customerIn !== undefined) {
                localVarQueryParameter['customer__in'] = customerIn;
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
    }
};

/**
 * PaymentIntentsApi - functional programming interface
 * @export
 */
export const PaymentIntentsApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = PaymentIntentsApiAxiosParamCreator(configuration)
    return {
        /**
         * Complete a new payment intent.  During the payment intent flow, you\'ll need to prompt your customer to provide additional information about their institution, bank account, and login credentials. This is done by sending PATCH calls with the information that Belvo asked you display in each `next_step` object. If you need more information on how to complete a payment intent, check our PSE payment initiation guides for  🇨🇴 Colombia.
         * @summary Complete a payment intent
         * @param {PaymentIntentsApiCompleteRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async complete(requestParameters: PaymentIntentsApiCompleteRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<PaymentIntentsCompleteResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.complete(requestParameters.id, requestParameters, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Create a payment intent.
         * @summary Create a new payment intent
         * @param {PaymentIntentsApiCreateRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async create(requestParameters: PaymentIntentsApiCreateRequest = {}, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<PaymentIntentsCreateResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.create(requestParameters, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Get the details about a specific payment intent.
         * @summary Get details about a payment intent.
         * @param {PaymentIntentsApiGetDetailsRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getDetails(requestParameters: PaymentIntentsApiGetDetailsRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<PaymentIntentsGetDetailsResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getDetails(requestParameters.id, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * List all payment intents associated with your Belvo account.
         * @summary List all payment intents
         * @param {PaymentIntentsApiListRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async list(requestParameters: PaymentIntentsApiListRequest = {}, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<PaymentIntentPaginatedResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.list(requestParameters.page, requestParameters.idIn, requestParameters.createdAt, requestParameters.createdAtGt, requestParameters.createdAtGte, requestParameters.createdAtLt, requestParameters.createdAtLte, requestParameters.createdAtRange, requestParameters.provider, requestParameters.paymentMethodType, requestParameters.customer, requestParameters.customerIn, requestParameters.amount, requestParameters.amountGt, requestParameters.amountGte, requestParameters.amountLt, requestParameters.amountLte, requestParameters.status, requestParameters.statusIn, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * PaymentIntentsApi - factory interface
 * @export
 */
export const PaymentIntentsApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = PaymentIntentsApiFp(configuration)
    return {
        /**
         * Complete a new payment intent.  During the payment intent flow, you\'ll need to prompt your customer to provide additional information about their institution, bank account, and login credentials. This is done by sending PATCH calls with the information that Belvo asked you display in each `next_step` object. If you need more information on how to complete a payment intent, check our PSE payment initiation guides for  🇨🇴 Colombia.
         * @summary Complete a payment intent
         * @param {PaymentIntentsApiCompleteRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        complete(requestParameters: PaymentIntentsApiCompleteRequest, options?: AxiosRequestConfig): AxiosPromise<PaymentIntentsCompleteResponse> {
            return localVarFp.complete(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * Create a payment intent.
         * @summary Create a new payment intent
         * @param {PaymentIntentsApiCreateRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        create(requestParameters: PaymentIntentsApiCreateRequest = {}, options?: AxiosRequestConfig): AxiosPromise<PaymentIntentsCreateResponse> {
            return localVarFp.create(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * Get the details about a specific payment intent.
         * @summary Get details about a payment intent.
         * @param {PaymentIntentsApiGetDetailsRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDetails(requestParameters: PaymentIntentsApiGetDetailsRequest, options?: AxiosRequestConfig): AxiosPromise<PaymentIntentsGetDetailsResponse> {
            return localVarFp.getDetails(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * List all payment intents associated with your Belvo account.
         * @summary List all payment intents
         * @param {PaymentIntentsApiListRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        list(requestParameters: PaymentIntentsApiListRequest = {}, options?: AxiosRequestConfig): AxiosPromise<PaymentIntentPaginatedResponse> {
            return localVarFp.list(requestParameters, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * Request parameters for complete operation in PaymentIntentsApi.
 * @export
 * @interface PaymentIntentsApiCompleteRequest
 */
export type PaymentIntentsApiCompleteRequest = {
    
    /**
    * The `payment-intent.id` you want to get detailed information about.
    * @type {string}
    * @memberof PaymentIntentsApiComplete
    */
    readonly id: string
    
} & PatchPaymentIntentPse

/**
 * Request parameters for create operation in PaymentIntentsApi.
 * @export
 * @interface PaymentIntentsApiCreateRequest
 */
export type PaymentIntentsApiCreateRequest = {
    
} & PaymentIntentsCreateRequest

/**
 * Request parameters for getDetails operation in PaymentIntentsApi.
 * @export
 * @interface PaymentIntentsApiGetDetailsRequest
 */
export type PaymentIntentsApiGetDetailsRequest = {
    
    /**
    * The `payment-intent.id` you want to get detailed information about.
    * @type {string}
    * @memberof PaymentIntentsApiGetDetails
    */
    readonly id: string
    
}

/**
 * Request parameters for list operation in PaymentIntentsApi.
 * @export
 * @interface PaymentIntentsApiListRequest
 */
export type PaymentIntentsApiListRequest = {
    
    /**
    * A page number within the paginated result set.
    * @type {number}
    * @memberof PaymentIntentsApiList
    */
    readonly page?: number
    
    /**
    * One or more `payment-intent.id`s (comma separated) that you want to get results for.
    * @type {string}
    * @memberof PaymentIntentsApiList
    */
    readonly idIn?: string
    
    /**
    * Return results only for this date (in `YYYY-MM-DD` format).
    * @type {string}
    * @memberof PaymentIntentsApiList
    */
    readonly createdAt?: string
    
    /**
    * Return results only after this date (in `YYYY-MM-DD` format).
    * @type {string}
    * @memberof PaymentIntentsApiList
    */
    readonly createdAtGt?: string
    
    /**
    * Return results only for this date and after (in `YYYY-MM-DD` format).
    * @type {string}
    * @memberof PaymentIntentsApiList
    */
    readonly createdAtGte?: string
    
    /**
    * Return results only before this date (in `YYYY-MM-DD` format).
    * @type {string}
    * @memberof PaymentIntentsApiList
    */
    readonly createdAtLt?: string
    
    /**
    * Return results only for this date and before (in `YYYY-MM-DD` format).
    * @type {string}
    * @memberof PaymentIntentsApiList
    */
    readonly createdAtLte?: string
    
    /**
    * Return results between this date range (in `YYYY-MM-DD` format).
    * @type {string}
    * @memberof PaymentIntentsApiList
    */
    readonly createdAtRange?: string
    
    /**
    * Return results only for this value.
    * @type {string}
    * @memberof PaymentIntentsApiList
    */
    readonly provider?: string
    
    /**
    * Return results only for this value.
    * @type {string}
    * @memberof PaymentIntentsApiList
    */
    readonly paymentMethodType?: string
    
    /**
    * The `customer.id` you want to get results for.
    * @type {string}
    * @memberof PaymentIntentsApiList
    */
    readonly customer?: string
    
    /**
    * One or more `customer.id`s (comma separated) that you want to get results for.
    * @type {string}
    * @memberof PaymentIntentsApiList
    */
    readonly customerIn?: string
    
    /**
    * Return results only for this value.
    * @type {string}
    * @memberof PaymentIntentsApiList
    */
    readonly amount?: string
    
    /**
    * Return results only for more than this amount.
    * @type {string}
    * @memberof PaymentIntentsApiList
    */
    readonly amountGt?: string
    
    /**
    * Return results only for and more than this amount.
    * @type {string}
    * @memberof PaymentIntentsApiList
    */
    readonly amountGte?: string
    
    /**
    * Return results only for less than this amount.
    * @type {string}
    * @memberof PaymentIntentsApiList
    */
    readonly amountLt?: string
    
    /**
    * Return results only for this amount or less.
    * @type {string}
    * @memberof PaymentIntentsApiList
    */
    readonly amountLte?: string
    
    /**
    * Return results only for this value.
    * @type {string}
    * @memberof PaymentIntentsApiList
    */
    readonly status?: string
    
    /**
    * Return results for listed status.
    * @type {string}
    * @memberof PaymentIntentsApiList
    */
    readonly statusIn?: string
    
}

/**
 * PaymentIntentsApi - object-oriented interface
 * @export
 * @class PaymentIntentsApi
 * @extends {BaseAPI}
 */
export class PaymentIntentsApi extends PaymentIntentsApiCustom {
    /**
     * Complete a new payment intent.  During the payment intent flow, you\'ll need to prompt your customer to provide additional information about their institution, bank account, and login credentials. This is done by sending PATCH calls with the information that Belvo asked you display in each `next_step` object. If you need more information on how to complete a payment intent, check our PSE payment initiation guides for  🇨🇴 Colombia.
     * @summary Complete a payment intent
     * @param {PaymentIntentsApiCompleteRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof PaymentIntentsApi
     */
    public complete(requestParameters: PaymentIntentsApiCompleteRequest, options?: AxiosRequestConfig) {
        return PaymentIntentsApiFp(this.configuration).complete(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * Create a payment intent.
     * @summary Create a new payment intent
     * @param {PaymentIntentsApiCreateRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof PaymentIntentsApi
     */
    public create(requestParameters: PaymentIntentsApiCreateRequest = {}, options?: AxiosRequestConfig) {
        return PaymentIntentsApiFp(this.configuration).create(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * Get the details about a specific payment intent.
     * @summary Get details about a payment intent.
     * @param {PaymentIntentsApiGetDetailsRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof PaymentIntentsApi
     */
    public getDetails(requestParameters: PaymentIntentsApiGetDetailsRequest, options?: AxiosRequestConfig) {
        return PaymentIntentsApiFp(this.configuration).getDetails(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * List all payment intents associated with your Belvo account.
     * @summary List all payment intents
     * @param {PaymentIntentsApiListRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof PaymentIntentsApi
     */
    public list(requestParameters: PaymentIntentsApiListRequest = {}, options?: AxiosRequestConfig) {
        return PaymentIntentsApiFp(this.configuration).list(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }
}
