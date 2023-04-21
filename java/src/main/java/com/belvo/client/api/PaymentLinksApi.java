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


import com.belvo.client.model.PaymentLinkPaginatedResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class PaymentLinksApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PaymentLinksApi() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public PaymentLinksApi(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call createCall(Object body, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/payments/payment-links";

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createValidateBeforeCall(Object body, final ApiCallback _callback) throws ApiException {
        return createCall(body, _callback);

    }


    private ApiResponse<Object> createWithHttpInfo(Object body) throws ApiException {
        okhttp3.Call localVarCall = createValidateBeforeCall(body, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createAsync(Object body, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(body, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class CreateRequestBuilder {

        private CreateRequestBuilder() {
        }

        /**
         * Build call for create
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> OK (Created) </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            Object body = buildBodyParams();
            return createCall(body, _callback);
        }

        private Object buildBodyParams() {
            Object body = new Object();
            return body;
        }

        /**
         * Execute create request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> OK (Created) </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            Object body = buildBodyParams();
            ApiResponse<Object> localVarResp = createWithHttpInfo(body);
            return localVarResp.getData();
        }

        /**
         * Execute create request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> OK (Created) </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            Object body = buildBodyParams();
            return createWithHttpInfo(body);
        }

        /**
         * Execute create request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> OK (Created) </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            Object body = buildBodyParams();
            return createAsync(body, _callback);
        }
    }

    /**
     * Create a payment link
     * Create a new payment link to start a hosted-widget payment.
     * @return CreateRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> OK (Created) </td><td>  -  </td></tr>
     </table>
     */
    public CreateRequestBuilder create() throws IllegalArgumentException {
        return new CreateRequestBuilder();
    }
    private okhttp3.Call getDetailsCall(String accessToken, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/payments/payment-links/{access_token}"
            .replace("{" + "access_token" + "}", localVarApiClient.escapeString(accessToken.toString()));

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
    private okhttp3.Call getDetailsValidateBeforeCall(String accessToken, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getDetails(Async)");
        }

        return getDetailsCall(accessToken, _callback);

    }


    private ApiResponse<Object> getDetailsWithHttpInfo(String accessToken) throws ApiException {
        okhttp3.Call localVarCall = getDetailsValidateBeforeCall(accessToken, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getDetailsAsync(String accessToken, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDetailsValidateBeforeCall(accessToken, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetDetailsRequestBuilder {
        private final String accessToken;

        private GetDetailsRequestBuilder(String accessToken) {
            this.accessToken = accessToken;
        }

        /**
         * Build call for getDetails
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK (Created) </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getDetailsCall(accessToken, _callback);
        }


        /**
         * Execute getDetails request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK (Created) </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ApiResponse<Object> localVarResp = getDetailsWithHttpInfo(accessToken);
            return localVarResp.getData();
        }

        /**
         * Execute getDetails request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK (Created) </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            return getDetailsWithHttpInfo(accessToken);
        }

        /**
         * Execute getDetails request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK (Created) </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            return getDetailsAsync(accessToken, _callback);
        }
    }

    /**
     * Get details about a payment link
     * Get the details about a payment link.
     * @param accessToken The &#x60;access_token&#x60; of the payment link you want to get detailed information about.   **Note:** You can retrieve the &#x60;access_token&#x60; for a payment link by making a [GET List all payment links](https://developers.belvo.com/reference/listpaymentlinks) request. (required)
     * @return GetDetailsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK (Created) </td><td>  -  </td></tr>
     </table>
     */
    public GetDetailsRequestBuilder getDetails(String accessToken) throws IllegalArgumentException {
        if (accessToken == null) throw new IllegalArgumentException("\"accessToken\" is required but got null");
        return new GetDetailsRequestBuilder(accessToken);
    }
    private okhttp3.Call listCall(Integer page, Integer pageSize, String createdAt, String createdAtGt, String createdAtGte, String createdAtLt, String createdAtLte, String createdAtRange, String status, String ordering, String search, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/payments/payment-links";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
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

        if (status != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("status", status));
        }

        if (ordering != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ordering", ordering));
        }

        if (search != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("search", search));
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
    private okhttp3.Call listValidateBeforeCall(Integer page, Integer pageSize, String createdAt, String createdAtGt, String createdAtGte, String createdAtLt, String createdAtLte, String createdAtRange, String status, String ordering, String search, final ApiCallback _callback) throws ApiException {
        return listCall(page, pageSize, createdAt, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, status, ordering, search, _callback);

    }


    private ApiResponse<PaymentLinkPaginatedResponse> listWithHttpInfo(Integer page, Integer pageSize, String createdAt, String createdAtGt, String createdAtGte, String createdAtLt, String createdAtLte, String createdAtRange, String status, String ordering, String search) throws ApiException {
        okhttp3.Call localVarCall = listValidateBeforeCall(page, pageSize, createdAt, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, status, ordering, search, null);
        Type localVarReturnType = new TypeToken<PaymentLinkPaginatedResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listAsync(Integer page, Integer pageSize, String createdAt, String createdAtGt, String createdAtGte, String createdAtLt, String createdAtLte, String createdAtRange, String status, String ordering, String search, final ApiCallback<PaymentLinkPaginatedResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listValidateBeforeCall(page, pageSize, createdAt, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, status, ordering, search, _callback);
        Type localVarReturnType = new TypeToken<PaymentLinkPaginatedResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListRequestBuilder {
        private Integer page;
        private Integer pageSize;
        private String createdAt;
        private String createdAtGt;
        private String createdAtGte;
        private String createdAtLt;
        private String createdAtLte;
        private String createdAtRange;
        private String status;
        private String ordering;
        private String search;

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
         * Set pageSize
         * @param pageSize Indicates how many results to return per page. By default we return 100 results per page.  ℹ️ The minimum number of results returned per page is 1 and the maximum is 100. If you enter a value greater than 100, our API will default to the maximum value (1000).  (optional, default to 100)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * Set status
         * @param status Return payment links with this status. Can be either &#x60;ACTIVE&#x60; or &#x60;INACTIVE&#x60;. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder status(String status) {
            this.status = status;
            return this;
        }
        
        /**
         * Set ordering
         * @param ordering Return results in a specified time order. Can be either:    - &#x60;created_at&#x60; returns payment links from newest to oldest (in ascending order).   - &#x60;-created_at&#x60; returns payment links from oldest to newest (in descending order). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder ordering(String ordering) {
            this.ordering = ordering;
            return this;
        }
        
        /**
         * Set search
         * @param search Return results for one or more payment links that match the description you searched for.   **Note:** This filter supports both full and partial search queries, with a minimum of three characters required. For example, searching for &#x60;trai&#x60; may match the following values:    - &#x60;Awesome training sneakers&#x60;    - &#x60;Training equipment&#x60; (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder search(String search) {
            this.search = search;
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
            return listCall(page, pageSize, createdAt, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, status, ordering, search, _callback);
        }


        /**
         * Execute list request
         * @return PaymentLinkPaginatedResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public PaymentLinkPaginatedResponse execute() throws ApiException {
            ApiResponse<PaymentLinkPaginatedResponse> localVarResp = listWithHttpInfo(page, pageSize, createdAt, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, status, ordering, search);
            return localVarResp.getData();
        }

        /**
         * Execute list request with HTTP info returned
         * @return ApiResponse&lt;PaymentLinkPaginatedResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<PaymentLinkPaginatedResponse> executeWithHttpInfo() throws ApiException {
            return listWithHttpInfo(page, pageSize, createdAt, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, status, ordering, search);
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
        public okhttp3.Call executeAsync(final ApiCallback<PaymentLinkPaginatedResponse> _callback) throws ApiException {
            return listAsync(page, pageSize, createdAt, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, status, ordering, search, _callback);
        }
    }

    /**
     * List all payment links
     * List all payment links associated with your Belvo account. By default, we return up to 100 results per page.
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
