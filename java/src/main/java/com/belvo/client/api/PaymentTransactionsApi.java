/*
 * Belvo API Docs
 * # Introduction  Belvo is an open banking API for Latin America that allows companies to access banking and fiscal information in a secure as well as agile way.  Through our API, you can access:   - **Bank information** such as account information, real-time balance, historical transactions, and account owner identification.  - **Fiscal information** such as received and sent invoices and tax returns.   <img src=\"https://files.readme.io/acf27d3-belvo_pipes.png\" alt=\"fiscal-endpoints\">   In this API reference you'll find all the information you need about each  endpoint and resource.   <div style=\"background-color:#f4f6f8; border-left: 6px solid #4CAF50;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\">  <strong>Tip: </strong> Make sure that you also check out our Developer Portal for guides on <a href=\"https://developers.belvo.com/docs/get-started-in-5-minutes\" target=\"_blank\">how to get started</a>, using our <a href=\"https://developers.belvo.com/docs/test-in-sandbox\" target=\"_blank\">Sandbox environment</a>, as well as how to <a href=\"https://developers.belvo.com/docs/connect-widget\" target=\"_blank\">integrate the widget</a> or use our <a href=\"https://developers.belvo.com/docs/quickstart-application\" target=\"_blank\">quickstart application</a>.  </div>   ## Environment  We currently offer three environments: sandbox, development, and production.   When using our SDKs, make sure to use the **Alias** (and not the Base URL).   | Environment | Purpose | Access | |-----------|-------|-------| | **Sandbox** | The [Sandbox environment](https://developers.belvo.com/docs/test-in-sandbox) is dedicated for your testing and development phases. In this environment, you can create links without real credentials and you can pull test data from all endpoints. **⚠️The sandbox environment is refreshed frequently and your test data can be updated or deleted.** | Base URL (cURL): https://sandbox.belvo.com/ <br><br>Alias (SDKs): sandbox| |**Development**|The Development environment is dedicated for testing with real credentials and institutions with real-world institutions. You can create up to 25 links for free in this environment.| Base URL (cURL): https://development.belvo.com/ <br><br>Alias (SDKs): development | | **Production** | The Production environment is dedicated for live applications with real connections to institutions. In this environment, you will need real credentials to create links and you will pull real data from the institutions.| Base URL (cURL): https://api.belvo.com/ <br><br>Alias (SDKs): production|   For each environment, you'll need to [generate separate API keys](https://developers.belvo.com/docs/get-your-belvo-api-keys).   ## Response codes   We use the following HTTP status code in the response depending on the success or failure:   | Status Code | Description | |-----------|-------| | `200` | ✅ **Success** - The content is available in the response body. | | `201` | ✅ **Success** - The content was created successfully on Belvo. | | `204` | ✅ **Success** - No content to return. | | `400` | ❌ **Bad Request Error** - Request returned an error, detail in content.| | `401` | ❌ **Unauthorized** - The Belvo credentials provided are not valid.| | `404` | ❌ **Not Found** - The resource you try to access cannot be found.| | `405` | ❌ **Method Not Allowed** - The HTTP method you are using is not accepted for this resource.| | `408` | ❌ **Request Timeout** - The request timed out and was terminated by the server.| | `428` | ❌ **MFA Token Required** - MFA token was required by the institution to connect. | | `500` | ❌ **Internal Server Error** - The detail of the error is available in the response body.|   ## Error handling   ### Error messages   Belvo API errors are returned in JSON format. For example, an error might look like this:   ```json  [     {       \"request_id\": \"a6e1c493d7a29d91aed4338e6fcf077d\",       \"message\": \"This field is required.\",       \"code\": \"required\",       \"field\": \"link\"     } ]  ```   Typically, an error response will have the following parameters:  - `request_id`: a unique ID for the request, you should share it with the Belvo support team for investigations.  - `message`: human-readable description of the error.  - `code`: a unique code for the error. Check the table below to see how to handle each error code.  - `field` *(optional)*: The specific field in the request body that has an issue.    ### Request identifier  When you need help with a specific error, add the request identifier (`request_id`) in your message to the Belvo support team. This will speed up investigations and get you back up and running in no time at all.   ### Error codes and troubleshooting   For a full list of errors and how to troubleshoot them, please see our dedicated [Error handling articles](https://developers.belvo.com/docs/integration-overview#error-handling) in our DevPortal.    ### Retry policy   Please see our recommended [retry policies](https://developers.belvo.com/docs/integration-overview#error-retry-policy) in the DevPortal. 
 *
 * The version of the OpenAPI document: 1.35.0
 * Contact: support@belvo.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.belvo.client.api;

import com.belvo.client.ApiCallback;
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.Pair;
import com.belvo.client.ProgressRequestBody;
import com.belvo.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.belvo.client.model.PaymentTransaction;
import com.belvo.client.model.PaymentsTransactionsPaginatedResponse;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class PaymentTransactionsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PaymentTransactionsApi() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public PaymentTransactionsApi(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call getDetailsCall(UUID id, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/payments/transactions/{id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getDetailsValidateBeforeCall(UUID id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getDetails(Async)");
        }

        return getDetailsCall(id, _callback);

    }


    private ApiResponse<PaymentTransaction> getDetailsWithHttpInfo(UUID id) throws ApiException {
        okhttp3.Call localVarCall = getDetailsValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<PaymentTransaction>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getDetailsAsync(UUID id, final ApiCallback<PaymentTransaction> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDetailsValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<PaymentTransaction>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetDetailsRequestBuilder {
        private final UUID id;

        private GetDetailsRequestBuilder(UUID id) {
            this.id = id;
        }

        /**
         * Build call for getDetails
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getDetailsCall(id, _callback);
        }


        /**
         * Execute getDetails request
         * @return PaymentTransaction
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public PaymentTransaction execute() throws ApiException {
            ApiResponse<PaymentTransaction> localVarResp = getDetailsWithHttpInfo(id);
            return localVarResp.getData();
        }

        /**
         * Execute getDetails request with HTTP info returned
         * @return ApiResponse&lt;PaymentTransaction&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<PaymentTransaction> executeWithHttpInfo() throws ApiException {
            return getDetailsWithHttpInfo(id);
        }

        /**
         * Execute getDetails request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<PaymentTransaction> _callback) throws ApiException {
            return getDetailsAsync(id, _callback);
        }
    }

    /**
     * Get details about a payment transaction
     * Get the details about a specific payment transaction.
     * @param id The &#x60;transaction.id&#x60; you want to get detailed information about. (required)
     * @return GetDetailsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public GetDetailsRequestBuilder getDetails(UUID id) throws IllegalArgumentException {
        if (id == null) throw new IllegalArgumentException("\"id\" is required but got null");
        return new GetDetailsRequestBuilder(id);
    }
    private okhttp3.Call listCall(Integer page, String idIn, String createdAt, String createdAtGt, String createdAtGte, String createdAtLt, String createdAtLte, String createdAtRange, String charge, String chargeIn, String beneficiary, String beneficiaryIn, String payer, String payerIn, String transactionType, String currency, String description, String amount, String amountGt, String amountGte, String amountLt, String amountLte, String amountRange, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/payments/transactions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (idIn != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("id__in", idIn));
        }

        if (createdAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("created_at", createdAt));
        }

        if (createdAtGt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("created_at__gt", createdAtGt));
        }

        if (createdAtGte != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("created_at__gte", createdAtGte));
        }

        if (createdAtLt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("created_at__lt", createdAtLt));
        }

        if (createdAtLte != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("created_at__lte", createdAtLte));
        }

        if (createdAtRange != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("created_at__range", createdAtRange));
        }

        if (charge != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("charge", charge));
        }

        if (chargeIn != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("charge__in", chargeIn));
        }

        if (beneficiary != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("beneficiary", beneficiary));
        }

        if (beneficiaryIn != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("beneficiary__in", beneficiaryIn));
        }

        if (payer != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("payer", payer));
        }

        if (payerIn != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("payer__in", payerIn));
        }

        if (transactionType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("transaction__type", transactionType));
        }

        if (currency != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("currency", currency));
        }

        if (description != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("description", description));
        }

        if (amount != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("amount", amount));
        }

        if (amountGt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("amount__gt", amountGt));
        }

        if (amountGte != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("amount__gte", amountGte));
        }

        if (amountLt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("amount__lt", amountLt));
        }

        if (amountLte != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("amount__lte", amountLte));
        }

        if (amountRange != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("amount__range", amountRange));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listValidateBeforeCall(Integer page, String idIn, String createdAt, String createdAtGt, String createdAtGte, String createdAtLt, String createdAtLte, String createdAtRange, String charge, String chargeIn, String beneficiary, String beneficiaryIn, String payer, String payerIn, String transactionType, String currency, String description, String amount, String amountGt, String amountGte, String amountLt, String amountLte, String amountRange, final ApiCallback _callback) throws ApiException {
        return listCall(page, idIn, createdAt, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, charge, chargeIn, beneficiary, beneficiaryIn, payer, payerIn, transactionType, currency, description, amount, amountGt, amountGte, amountLt, amountLte, amountRange, _callback);

    }


    private ApiResponse<PaymentsTransactionsPaginatedResponse> listWithHttpInfo(Integer page, String idIn, String createdAt, String createdAtGt, String createdAtGte, String createdAtLt, String createdAtLte, String createdAtRange, String charge, String chargeIn, String beneficiary, String beneficiaryIn, String payer, String payerIn, String transactionType, String currency, String description, String amount, String amountGt, String amountGte, String amountLt, String amountLte, String amountRange) throws ApiException {
        okhttp3.Call localVarCall = listValidateBeforeCall(page, idIn, createdAt, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, charge, chargeIn, beneficiary, beneficiaryIn, payer, payerIn, transactionType, currency, description, amount, amountGt, amountGte, amountLt, amountLte, amountRange, null);
        Type localVarReturnType = new TypeToken<PaymentsTransactionsPaginatedResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listAsync(Integer page, String idIn, String createdAt, String createdAtGt, String createdAtGte, String createdAtLt, String createdAtLte, String createdAtRange, String charge, String chargeIn, String beneficiary, String beneficiaryIn, String payer, String payerIn, String transactionType, String currency, String description, String amount, String amountGt, String amountGte, String amountLt, String amountLte, String amountRange, final ApiCallback<PaymentsTransactionsPaginatedResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listValidateBeforeCall(page, idIn, createdAt, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, charge, chargeIn, beneficiary, beneficiaryIn, payer, payerIn, transactionType, currency, description, amount, amountGt, amountGte, amountLt, amountLte, amountRange, _callback);
        Type localVarReturnType = new TypeToken<PaymentsTransactionsPaginatedResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListRequestBuilder {
        private Integer page;
        private String idIn;
        private String createdAt;
        private String createdAtGt;
        private String createdAtGte;
        private String createdAtLt;
        private String createdAtLte;
        private String createdAtRange;
        private String charge;
        private String chargeIn;
        private String beneficiary;
        private String beneficiaryIn;
        private String payer;
        private String payerIn;
        private String transactionType;
        private String currency;
        private String description;
        private String amount;
        private String amountGt;
        private String amountGte;
        private String amountLt;
        private String amountLte;
        private String amountRange;

        private ListRequestBuilder() {
        }

        /**
         * Set page
         * @param page A page number within the paginated result set. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder page(Integer page) {
            this.page = page;
            return this;
        }
        
        /**
         * Set idIn
         * @param idIn One or more payment &#x60;transaction.id&#x60;s (comma separated) that you want to get results for. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder idIn(String idIn) {
            this.idIn = idIn;
            return this;
        }
        
        /**
         * Set createdAt
         * @param createdAt Return results only for this date (in &#x60;YYYY-MM-DD&#x60; format). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        
        /**
         * Set createdAtGt
         * @param createdAtGt Return results only after this date (in &#x60;YYYY-MM-DD&#x60; format). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder createdAtGt(String createdAtGt) {
            this.createdAtGt = createdAtGt;
            return this;
        }
        
        /**
         * Set createdAtGte
         * @param createdAtGte Return results only for this date and after (in &#x60;YYYY-MM-DD&#x60; format). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder createdAtGte(String createdAtGte) {
            this.createdAtGte = createdAtGte;
            return this;
        }
        
        /**
         * Set createdAtLt
         * @param createdAtLt Return results only before this date (in &#x60;YYYY-MM-DD&#x60; format). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder createdAtLt(String createdAtLt) {
            this.createdAtLt = createdAtLt;
            return this;
        }
        
        /**
         * Set createdAtLte
         * @param createdAtLte Return results only for this date and before (in &#x60;YYYY-MM-DD&#x60; format). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder createdAtLte(String createdAtLte) {
            this.createdAtLte = createdAtLte;
            return this;
        }
        
        /**
         * Set createdAtRange
         * @param createdAtRange Return results between this date range (in &#x60;YYYY-MM-DD&#x60; format). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder createdAtRange(String createdAtRange) {
            this.createdAtRange = createdAtRange;
            return this;
        }
        
        /**
         * Set charge
         * @param charge The &#x60;charge.id&#x60; you want to get results for. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder charge(String charge) {
            this.charge = charge;
            return this;
        }
        
        /**
         * Set chargeIn
         * @param chargeIn One or more &#x60;charge.id&#x60;s (comma separated) that you want to get results for. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder chargeIn(String chargeIn) {
            this.chargeIn = chargeIn;
            return this;
        }
        
        /**
         * Set beneficiary
         * @param beneficiary The &#x60;beneficiary.id&#x60; you want to get results for. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder beneficiary(String beneficiary) {
            this.beneficiary = beneficiary;
            return this;
        }
        
        /**
         * Set beneficiaryIn
         * @param beneficiaryIn One or more &#x60;beneficiary.id&#x60;s (comma separated) that you want to get results for. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder beneficiaryIn(String beneficiaryIn) {
            this.beneficiaryIn = beneficiaryIn;
            return this;
        }
        
        /**
         * Set payer
         * @param payer The payer&#39;s &#x60;bank-account.id&#x60; you want to get results for. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder payer(String payer) {
            this.payer = payer;
            return this;
        }
        
        /**
         * Set payerIn
         * @param payerIn One or more payer &#x60;bank-account.id&#x60;s (comma separated) that you want to get results for. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder payerIn(String payerIn) {
            this.payerIn = payerIn;
            return this;
        }
        
        /**
         * Set transactionType
         * @param transactionType Return results for a matched value type. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder transactionType(String transactionType) {
            this.transactionType = transactionType;
            return this;
        }
        
        /**
         * Set currency
         * @param currency Return results for a matched value type. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder currency(String currency) {
            this.currency = currency;
            return this;
        }
        
        /**
         * Set description
         * @param description Return results for a matched value type. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder description(String description) {
            this.description = description;
            return this;
        }
        
        /**
         * Set amount
         * @param amount Return results only for this value. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder amount(String amount) {
            this.amount = amount;
            return this;
        }
        
        /**
         * Set amountGt
         * @param amountGt Return results only for more than this amount. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder amountGt(String amountGt) {
            this.amountGt = amountGt;
            return this;
        }
        
        /**
         * Set amountGte
         * @param amountGte Return results only for and more than this amount. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder amountGte(String amountGte) {
            this.amountGte = amountGte;
            return this;
        }
        
        /**
         * Set amountLt
         * @param amountLt Return results only for less than this amount. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder amountLt(String amountLt) {
            this.amountLt = amountLt;
            return this;
        }
        
        /**
         * Set amountLte
         * @param amountLte Return results only for this amount or less. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder amountLte(String amountLte) {
            this.amountLte = amountLte;
            return this;
        }
        
        /**
         * Set amountRange
         * @param amountRange Return results between this amount range (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder amountRange(String amountRange) {
            this.amountRange = amountRange;
            return this;
        }
        
        /**
         * Build call for list
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listCall(page, idIn, createdAt, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, charge, chargeIn, beneficiary, beneficiaryIn, payer, payerIn, transactionType, currency, description, amount, amountGt, amountGte, amountLt, amountLte, amountRange, _callback);
        }


        /**
         * Execute list request
         * @return PaymentsTransactionsPaginatedResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public PaymentsTransactionsPaginatedResponse execute() throws ApiException {
            ApiResponse<PaymentsTransactionsPaginatedResponse> localVarResp = listWithHttpInfo(page, idIn, createdAt, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, charge, chargeIn, beneficiary, beneficiaryIn, payer, payerIn, transactionType, currency, description, amount, amountGt, amountGte, amountLt, amountLte, amountRange);
            return localVarResp.getData();
        }

        /**
         * Execute list request with HTTP info returned
         * @return ApiResponse&lt;PaymentsTransactionsPaginatedResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<PaymentsTransactionsPaginatedResponse> executeWithHttpInfo() throws ApiException {
            return listWithHttpInfo(page, idIn, createdAt, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, charge, chargeIn, beneficiary, beneficiaryIn, payer, payerIn, transactionType, currency, description, amount, amountGt, amountGte, amountLt, amountLte, amountRange);
        }

        /**
         * Execute list request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<PaymentsTransactionsPaginatedResponse> _callback) throws ApiException {
            return listAsync(page, idIn, createdAt, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, charge, chargeIn, beneficiary, beneficiaryIn, payer, payerIn, transactionType, currency, description, amount, amountGt, amountGte, amountLt, amountLte, amountRange, _callback);
        }
    }

    /**
     * List all payment transactions
     * List all payment transactions associated with your Belvo account.
     * @return ListRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ListRequestBuilder list() throws IllegalArgumentException {
        return new ListRequestBuilder();
    }
}
