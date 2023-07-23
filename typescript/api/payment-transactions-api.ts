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
import { PaymentTransaction } from '../models';
// @ts-ignore
import { PaymentsTransactionsPaginatedResponse } from '../models';
import { paginate } from "../pagination/paginate";
import { requestBeforeHook } from '../requestBeforeHook';
import { PaymentTransactionsApiCustom } from "./payment-transactions-api-custom";
/**
 * PaymentTransactionsApi - axios parameter creator
 * @export
 */
export const PaymentTransactionsApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Get the details about a specific payment transaction.
         * @summary Get details about a payment transaction
         * @param {string} id The &#x60;transaction.id&#x60; you want to get detailed information about.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDetails: async (id: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'id' is not null or undefined
            assertParamExists('getDetails', 'id', id)
            const localVarPath = `/payments/transactions/{id}`
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
         * List all payment transactions associated with your Belvo account.
         * @summary List all payment transactions
         * @param {number} [page] A page number within the paginated result set.
         * @param {string} [idIn] One or more payment &#x60;transaction.id&#x60;s (comma separated) that you want to get results for.
         * @param {string} [createdAt] Return results only for this date (in &#x60;YYYY-MM-DD&#x60; format).
         * @param {string} [createdAtGt] Return results only after this date (in &#x60;YYYY-MM-DD&#x60; format).
         * @param {string} [createdAtGte] Return results only for this date and after (in &#x60;YYYY-MM-DD&#x60; format).
         * @param {string} [createdAtLt] Return results only before this date (in &#x60;YYYY-MM-DD&#x60; format).
         * @param {string} [createdAtLte] Return results only for this date and before (in &#x60;YYYY-MM-DD&#x60; format).
         * @param {string} [createdAtRange] Return results between this date range (in &#x60;YYYY-MM-DD&#x60; format).
         * @param {string} [charge] The &#x60;charge.id&#x60; you want to get results for.
         * @param {string} [chargeIn] One or more &#x60;charge.id&#x60;s (comma separated) that you want to get results for.
         * @param {string} [beneficiary] The &#x60;beneficiary.id&#x60; you want to get results for.
         * @param {string} [beneficiaryIn] One or more &#x60;beneficiary.id&#x60;s (comma separated) that you want to get results for.
         * @param {string} [payer] The payer\&#39;s &#x60;bank-account.id&#x60; you want to get results for.
         * @param {string} [payerIn] One or more payer &#x60;bank-account.id&#x60;s (comma separated) that you want to get results for.
         * @param {string} [transactionType] Return results for a matched value type.
         * @param {string} [currency] Return results for a matched value type.
         * @param {string} [description] Return results for a matched value type.
         * @param {string} [amount] Return results only for this value.
         * @param {string} [amountGt] Return results only for more than this amount.
         * @param {string} [amountGte] Return results only for and more than this amount.
         * @param {string} [amountLt] Return results only for less than this amount.
         * @param {string} [amountLte] Return results only for this amount or less.
         * @param {string} [amountRange] Return results between this amount range
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        list: async (page?: number, idIn?: string, createdAt?: string, createdAtGt?: string, createdAtGte?: string, createdAtLt?: string, createdAtLte?: string, createdAtRange?: string, charge?: string, chargeIn?: string, beneficiary?: string, beneficiaryIn?: string, payer?: string, payerIn?: string, transactionType?: string, currency?: string, description?: string, amount?: string, amountGt?: string, amountGte?: string, amountLt?: string, amountLte?: string, amountRange?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/payments/transactions`;
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

            if (charge !== undefined) {
                localVarQueryParameter['charge'] = charge;
            }

            if (chargeIn !== undefined) {
                localVarQueryParameter['charge__in'] = chargeIn;
            }

            if (beneficiary !== undefined) {
                localVarQueryParameter['beneficiary'] = beneficiary;
            }

            if (beneficiaryIn !== undefined) {
                localVarQueryParameter['beneficiary__in'] = beneficiaryIn;
            }

            if (payer !== undefined) {
                localVarQueryParameter['payer'] = payer;
            }

            if (payerIn !== undefined) {
                localVarQueryParameter['payer__in'] = payerIn;
            }

            if (transactionType !== undefined) {
                localVarQueryParameter['transaction__type'] = transactionType;
            }

            if (currency !== undefined) {
                localVarQueryParameter['currency'] = currency;
            }

            if (description !== undefined) {
                localVarQueryParameter['description'] = description;
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
 * PaymentTransactionsApi - functional programming interface
 * @export
 */
export const PaymentTransactionsApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = PaymentTransactionsApiAxiosParamCreator(configuration)
    return {
        /**
         * Get the details about a specific payment transaction.
         * @summary Get details about a payment transaction
         * @param {PaymentTransactionsApiGetDetailsRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getDetails(requestParameters: PaymentTransactionsApiGetDetailsRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<PaymentTransaction>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getDetails(requestParameters.id, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * List all payment transactions associated with your Belvo account.
         * @summary List all payment transactions
         * @param {PaymentTransactionsApiListRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async list(requestParameters: PaymentTransactionsApiListRequest = {}, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<PaymentsTransactionsPaginatedResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.list(requestParameters.page, requestParameters.idIn, requestParameters.createdAt, requestParameters.createdAtGt, requestParameters.createdAtGte, requestParameters.createdAtLt, requestParameters.createdAtLte, requestParameters.createdAtRange, requestParameters.charge, requestParameters.chargeIn, requestParameters.beneficiary, requestParameters.beneficiaryIn, requestParameters.payer, requestParameters.payerIn, requestParameters.transactionType, requestParameters.currency, requestParameters.description, requestParameters.amount, requestParameters.amountGt, requestParameters.amountGte, requestParameters.amountLt, requestParameters.amountLte, requestParameters.amountRange, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * PaymentTransactionsApi - factory interface
 * @export
 */
export const PaymentTransactionsApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = PaymentTransactionsApiFp(configuration)
    return {
        /**
         * Get the details about a specific payment transaction.
         * @summary Get details about a payment transaction
         * @param {PaymentTransactionsApiGetDetailsRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getDetails(requestParameters: PaymentTransactionsApiGetDetailsRequest, options?: AxiosRequestConfig): AxiosPromise<PaymentTransaction> {
            return localVarFp.getDetails(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * List all payment transactions associated with your Belvo account.
         * @summary List all payment transactions
         * @param {PaymentTransactionsApiListRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        list(requestParameters: PaymentTransactionsApiListRequest = {}, options?: AxiosRequestConfig): AxiosPromise<PaymentsTransactionsPaginatedResponse> {
            return localVarFp.list(requestParameters, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * Request parameters for getDetails operation in PaymentTransactionsApi.
 * @export
 * @interface PaymentTransactionsApiGetDetailsRequest
 */
export type PaymentTransactionsApiGetDetailsRequest = {
    
    /**
    * The `transaction.id` you want to get detailed information about.
    * @type {string}
    * @memberof PaymentTransactionsApiGetDetails
    */
    readonly id: string
    
}

/**
 * Request parameters for list operation in PaymentTransactionsApi.
 * @export
 * @interface PaymentTransactionsApiListRequest
 */
export type PaymentTransactionsApiListRequest = {
    
    /**
    * A page number within the paginated result set.
    * @type {number}
    * @memberof PaymentTransactionsApiList
    */
    readonly page?: number
    
    /**
    * One or more payment `transaction.id`s (comma separated) that you want to get results for.
    * @type {string}
    * @memberof PaymentTransactionsApiList
    */
    readonly idIn?: string
    
    /**
    * Return results only for this date (in `YYYY-MM-DD` format).
    * @type {string}
    * @memberof PaymentTransactionsApiList
    */
    readonly createdAt?: string
    
    /**
    * Return results only after this date (in `YYYY-MM-DD` format).
    * @type {string}
    * @memberof PaymentTransactionsApiList
    */
    readonly createdAtGt?: string
    
    /**
    * Return results only for this date and after (in `YYYY-MM-DD` format).
    * @type {string}
    * @memberof PaymentTransactionsApiList
    */
    readonly createdAtGte?: string
    
    /**
    * Return results only before this date (in `YYYY-MM-DD` format).
    * @type {string}
    * @memberof PaymentTransactionsApiList
    */
    readonly createdAtLt?: string
    
    /**
    * Return results only for this date and before (in `YYYY-MM-DD` format).
    * @type {string}
    * @memberof PaymentTransactionsApiList
    */
    readonly createdAtLte?: string
    
    /**
    * Return results between this date range (in `YYYY-MM-DD` format).
    * @type {string}
    * @memberof PaymentTransactionsApiList
    */
    readonly createdAtRange?: string
    
    /**
    * The `charge.id` you want to get results for.
    * @type {string}
    * @memberof PaymentTransactionsApiList
    */
    readonly charge?: string
    
    /**
    * One or more `charge.id`s (comma separated) that you want to get results for.
    * @type {string}
    * @memberof PaymentTransactionsApiList
    */
    readonly chargeIn?: string
    
    /**
    * The `beneficiary.id` you want to get results for.
    * @type {string}
    * @memberof PaymentTransactionsApiList
    */
    readonly beneficiary?: string
    
    /**
    * One or more `beneficiary.id`s (comma separated) that you want to get results for.
    * @type {string}
    * @memberof PaymentTransactionsApiList
    */
    readonly beneficiaryIn?: string
    
    /**
    * The payer\'s `bank-account.id` you want to get results for.
    * @type {string}
    * @memberof PaymentTransactionsApiList
    */
    readonly payer?: string
    
    /**
    * One or more payer `bank-account.id`s (comma separated) that you want to get results for.
    * @type {string}
    * @memberof PaymentTransactionsApiList
    */
    readonly payerIn?: string
    
    /**
    * Return results for a matched value type.
    * @type {string}
    * @memberof PaymentTransactionsApiList
    */
    readonly transactionType?: string
    
    /**
    * Return results for a matched value type.
    * @type {string}
    * @memberof PaymentTransactionsApiList
    */
    readonly currency?: string
    
    /**
    * Return results for a matched value type.
    * @type {string}
    * @memberof PaymentTransactionsApiList
    */
    readonly description?: string
    
    /**
    * Return results only for this value.
    * @type {string}
    * @memberof PaymentTransactionsApiList
    */
    readonly amount?: string
    
    /**
    * Return results only for more than this amount.
    * @type {string}
    * @memberof PaymentTransactionsApiList
    */
    readonly amountGt?: string
    
    /**
    * Return results only for and more than this amount.
    * @type {string}
    * @memberof PaymentTransactionsApiList
    */
    readonly amountGte?: string
    
    /**
    * Return results only for less than this amount.
    * @type {string}
    * @memberof PaymentTransactionsApiList
    */
    readonly amountLt?: string
    
    /**
    * Return results only for this amount or less.
    * @type {string}
    * @memberof PaymentTransactionsApiList
    */
    readonly amountLte?: string
    
    /**
    * Return results between this amount range
    * @type {string}
    * @memberof PaymentTransactionsApiList
    */
    readonly amountRange?: string
    
}

/**
 * PaymentTransactionsApi - object-oriented interface
 * @export
 * @class PaymentTransactionsApi
 * @extends {BaseAPI}
 */
export class PaymentTransactionsApi extends PaymentTransactionsApiCustom {
    /**
     * Get the details about a specific payment transaction.
     * @summary Get details about a payment transaction
     * @param {PaymentTransactionsApiGetDetailsRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof PaymentTransactionsApi
     */
    public getDetails(requestParameters: PaymentTransactionsApiGetDetailsRequest, options?: AxiosRequestConfig) {
        return PaymentTransactionsApiFp(this.configuration).getDetails(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * List all payment transactions associated with your Belvo account.
     * @summary List all payment transactions
     * @param {PaymentTransactionsApiListRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof PaymentTransactionsApi
     */
    public list(requestParameters: PaymentTransactionsApiListRequest = {}, options?: AxiosRequestConfig) {
        return PaymentTransactionsApiFp(this.configuration).list(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }
}
