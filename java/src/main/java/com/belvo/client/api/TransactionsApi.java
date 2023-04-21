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


import com.belvo.client.model.AsynchronousAccepted202;
import com.belvo.client.model.PatchBody;
import com.belvo.client.model.Transaction;
import com.belvo.client.model.TransactionsPaginatedResponse;
import com.belvo.client.model.TransactionsRequest;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class TransactionsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TransactionsApi() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public TransactionsApi(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call completeRequestCall(PatchBody patchBody, String omit, String fields, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = patchBody;

        // create path and map variables
        String localVarPath = "/api/transactions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (omit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("omit", omit));
        }

        if (fields != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fields", fields));
        }

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
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call completeRequestValidateBeforeCall(PatchBody patchBody, String omit, String fields, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'patchBody' is set
        if (patchBody == null) {
            throw new ApiException("Missing the required parameter 'patchBody' when calling completeRequest(Async)");
        }

        return completeRequestCall(patchBody, omit, fields, _callback);

    }


    private ApiResponse<List<Transaction>> completeRequestWithHttpInfo(PatchBody patchBody, String omit, String fields) throws ApiException {
        okhttp3.Call localVarCall = completeRequestValidateBeforeCall(patchBody, omit, fields, null);
        Type localVarReturnType = new TypeToken<List<Transaction>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call completeRequestAsync(PatchBody patchBody, String omit, String fields, final ApiCallback<List<Transaction>> _callback) throws ApiException {

        okhttp3.Call localVarCall = completeRequestValidateBeforeCall(patchBody, omit, fields, _callback);
        Type localVarReturnType = new TypeToken<List<Transaction>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class CompleteRequestRequestBuilder {
        private final String session;
        private final UUID link;
        private String token;
        private Boolean saveData;
        private String omit;
        private String fields;

        private CompleteRequestRequestBuilder(String session, UUID link) {
            this.session = session;
            this.link = link;
        }

        /**
         * Set token
         * @param token The MFA token generated by the institution and required to continue a session. (optional)
         * @return CompleteRequestRequestBuilder
         */
        public CompleteRequestRequestBuilder token(String token) {
            this.token = token;
            return this;
        }
        
        /**
         * Set saveData
         * @param saveData Indicates whether or not to persist the data in Belvo. By default, this is set to &#x60;true&#x60; and we return a 201 Created response. When set to &#x60;false&#x60;, the data won&#39;t be persisted and we return a 200 OK response. (optional, default to true)
         * @return CompleteRequestRequestBuilder
         */
        public CompleteRequestRequestBuilder saveData(Boolean saveData) {
            this.saveData = saveData;
            return this;
        }
        
        /**
         * Set omit
         * @param omit Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. (optional)
         * @return CompleteRequestRequestBuilder
         */
        public CompleteRequestRequestBuilder omit(String omit) {
            this.omit = omit;
            return this;
        }
        
        /**
         * Set fields
         * @param fields Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. (optional)
         * @return CompleteRequestRequestBuilder
         */
        public CompleteRequestRequestBuilder fields(String fields) {
            this.fields = fields;
            return this;
        }
        
        /**
         * Build call for completeRequest
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok (when &#x60;save_data&#x3D;false&#x60;) </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created (when &#x60;save_data&#x3D;true&#x60;) </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            PatchBody patchBody = buildBodyParams();
            return completeRequestCall(patchBody, omit, fields, _callback);
        }

        private PatchBody buildBodyParams() {
            PatchBody patchBody = new PatchBody();
            patchBody.session(this.session);
            patchBody.token(this.token);
            patchBody.link(this.link);
            patchBody.saveData(this.saveData);
            return patchBody;
        }

        /**
         * Execute completeRequest request
         * @return List&lt;Transaction&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok (when &#x60;save_data&#x3D;false&#x60;) </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created (when &#x60;save_data&#x3D;true&#x60;) </td><td>  -  </td></tr>
         </table>
         */
        public List<Transaction> execute() throws ApiException {
            PatchBody patchBody = buildBodyParams();
            ApiResponse<List<Transaction>> localVarResp = completeRequestWithHttpInfo(patchBody, omit, fields);
            return localVarResp.getData();
        }

        /**
         * Execute completeRequest request with HTTP info returned
         * @return ApiResponse&lt;List&lt;Transaction&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok (when &#x60;save_data&#x3D;false&#x60;) </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created (when &#x60;save_data&#x3D;true&#x60;) </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<Transaction>> executeWithHttpInfo() throws ApiException {
            PatchBody patchBody = buildBodyParams();
            return completeRequestWithHttpInfo(patchBody, omit, fields);
        }

        /**
         * Execute completeRequest request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok (when &#x60;save_data&#x3D;false&#x60;) </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created (when &#x60;save_data&#x3D;true&#x60;) </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<Transaction>> _callback) throws ApiException {
            PatchBody patchBody = buildBodyParams();
            return completeRequestAsync(patchBody, omit, fields, _callback);
        }
    }

    /**
     * Complete a transactions request
     * Used to resume a Transaction retrieve session that was paused because an MFA token was required by the institution.
     * @param patchBody  (required)
     * @return CompleteRequestRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok (when &#x60;save_data&#x3D;false&#x60;) </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created (when &#x60;save_data&#x3D;true&#x60;) </td><td>  -  </td></tr>
     </table>
     */
    public CompleteRequestRequestBuilder completeRequest(String session, UUID link) throws IllegalArgumentException {
        if (session == null) throw new IllegalArgumentException("\"session\" is required but got null");
        if (link == null) throw new IllegalArgumentException("\"link\" is required but got null");
        return new CompleteRequestRequestBuilder(session, link);
    }
    private okhttp3.Call deleteCall(UUID id, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/transactions/{id}"
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
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteValidateBeforeCall(UUID id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling delete(Async)");
        }

        return deleteCall(id, _callback);

    }


    private ApiResponse<Void> deleteWithHttpInfo(UUID id) throws ApiException {
        okhttp3.Call localVarCall = deleteValidateBeforeCall(id, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call deleteAsync(UUID id, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteValidateBeforeCall(id, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class DeleteRequestBuilder {
        private final UUID id;

        private DeleteRequestBuilder(UUID id) {
            this.id = id;
        }

        /**
         * Build call for delete
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return deleteCall(id, _callback);
        }


        /**
         * Execute delete request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            deleteWithHttpInfo(id);
        }

        /**
         * Execute delete request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return deleteWithHttpInfo(id);
        }

        /**
         * Execute delete request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return deleteAsync(id, _callback);
        }
    }

    /**
     * Delete a transaction
     * Delete a specific transaction from your Belvo account.
     * @param id The &#x60;transaction.id&#x60; that you want to delete. (required)
     * @return DeleteRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
     </table>
     */
    public DeleteRequestBuilder delete(UUID id) throws IllegalArgumentException {
        if (id == null) throw new IllegalArgumentException("\"id\" is required but got null");
        return new DeleteRequestBuilder(id);
    }
    private okhttp3.Call getDetailsCall(UUID id, String omit, String fields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/transactions/{id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (omit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("omit", omit));
        }

        if (fields != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fields", fields));
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
    private okhttp3.Call getDetailsValidateBeforeCall(UUID id, String omit, String fields, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getDetails(Async)");
        }

        return getDetailsCall(id, omit, fields, _callback);

    }


    private ApiResponse<Transaction> getDetailsWithHttpInfo(UUID id, String omit, String fields) throws ApiException {
        okhttp3.Call localVarCall = getDetailsValidateBeforeCall(id, omit, fields, null);
        Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getDetailsAsync(UUID id, String omit, String fields, final ApiCallback<Transaction> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDetailsValidateBeforeCall(id, omit, fields, _callback);
        Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetDetailsRequestBuilder {
        private final UUID id;
        private String omit;
        private String fields;

        private GetDetailsRequestBuilder(UUID id) {
            this.id = id;
        }

        /**
         * Set omit
         * @param omit Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. (optional)
         * @return GetDetailsRequestBuilder
         */
        public GetDetailsRequestBuilder omit(String omit) {
            this.omit = omit;
            return this;
        }
        
        /**
         * Set fields
         * @param fields Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. (optional)
         * @return GetDetailsRequestBuilder
         */
        public GetDetailsRequestBuilder fields(String fields) {
            this.fields = fields;
            return this;
        }
        
        /**
         * Build call for getDetails
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getDetailsCall(id, omit, fields, _callback);
        }


        /**
         * Execute getDetails request
         * @return Transaction
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public Transaction execute() throws ApiException {
            ApiResponse<Transaction> localVarResp = getDetailsWithHttpInfo(id, omit, fields);
            return localVarResp.getData();
        }

        /**
         * Execute getDetails request with HTTP info returned
         * @return ApiResponse&lt;Transaction&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Transaction> executeWithHttpInfo() throws ApiException {
            return getDetailsWithHttpInfo(id, omit, fields);
        }

        /**
         * Execute getDetails request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Transaction> _callback) throws ApiException {
            return getDetailsAsync(id, omit, fields, _callback);
        }
    }

    /**
     * Get a transaction&#39;s details
     * Get the details of a specific transaction.
     * @param id The &#x60;transaction.id&#x60; you want to get detailed information about. (required)
     * @return GetDetailsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public GetDetailsRequestBuilder getDetails(UUID id) throws IllegalArgumentException {
        if (id == null) throw new IllegalArgumentException("\"id\" is required but got null");
        return new GetDetailsRequestBuilder(id);
    }
    private okhttp3.Call listCall(UUID link, Integer page, Integer pageSize, String omit, String fields, UUID account, String accountBalanceAvailable, String accountBalanceAvailableLt, String accountBalanceAvailableLte, String accountBalanceAvailableRange, String accountBalanceCurrent, String accountBalanceCurrentGt, String accountBalanceCurrentGte, String accountBalanceCurrentLt, String accountBalanceCurrentLte, String accountBalanceCurrentRange, String accountIn, String accountType, String accountTypeIn, String accountingDate, String accountingDateGt, String accountingDateGte, String accountingDateLt, String accountingDateLte, String accountingDateRange, String amount, String amountGt, String amountGte, String amountLt, String amountLte, String amountRange, String collectedAt, String collectedAtGt, String collectedAtGte, String collectedAtLt, String collectedAtLte, String collectedAtRange, String createdAt, String createdAtGt, String createdAtGte, String createdAtLt, String createdAtLte, String createdAtRange, String creditCardDataBillNameIn, String currency, String currencyIn, String reference, String referenceIn, String status, String statusIn, String type, String typeIn, String valueDate, String valueDateGt, String valueDateGte, String valueDateLt, String valueDateLte, String valueDateRange, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/transactions";

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

        if (omit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("omit", omit));
        }

        if (fields != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fields", fields));
        }

        if (link != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("link", link));
        }

        if (account != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account", account));
        }

        if (accountBalanceAvailable != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account__balance__available", accountBalanceAvailable));
        }

        if (accountBalanceAvailableLt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account__balance__available__lt", accountBalanceAvailableLt));
        }

        if (accountBalanceAvailableLte != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account__balance__available__lte", accountBalanceAvailableLte));
        }

        if (accountBalanceAvailableRange != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account__balance__available__range", accountBalanceAvailableRange));
        }

        if (accountBalanceCurrent != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account__balance__current", accountBalanceCurrent));
        }

        if (accountBalanceCurrentGt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account__balance__current__gt", accountBalanceCurrentGt));
        }

        if (accountBalanceCurrentGte != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account__balance__current__gte", accountBalanceCurrentGte));
        }

        if (accountBalanceCurrentLt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account__balance__current__lt", accountBalanceCurrentLt));
        }

        if (accountBalanceCurrentLte != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account__balance__current__lte", accountBalanceCurrentLte));
        }

        if (accountBalanceCurrentRange != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account__balance__current__range", accountBalanceCurrentRange));
        }

        if (accountIn != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account__in", accountIn));
        }

        if (accountType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account_type", accountType));
        }

        if (accountTypeIn != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account_type__in", accountTypeIn));
        }

        if (accountingDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("accounting_date", accountingDate));
        }

        if (accountingDateGt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("accounting_date__gt", accountingDateGt));
        }

        if (accountingDateGte != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("accounting_date__gte", accountingDateGte));
        }

        if (accountingDateLt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("accounting_date__lt", accountingDateLt));
        }

        if (accountingDateLte != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("accounting_date__lte", accountingDateLte));
        }

        if (accountingDateRange != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("accounting_date__range", accountingDateRange));
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

        if (collectedAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("collected_at", collectedAt));
        }

        if (collectedAtGt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("collected_at__gt", collectedAtGt));
        }

        if (collectedAtGte != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("collected_at__gte", collectedAtGte));
        }

        if (collectedAtLt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("collected_at__lt", collectedAtLt));
        }

        if (collectedAtLte != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("collected_at__lte", collectedAtLte));
        }

        if (collectedAtRange != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("collected_at__range", collectedAtRange));
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

        if (creditCardDataBillNameIn != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("credit_card_data__bill_name__in", creditCardDataBillNameIn));
        }

        if (currency != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("currency", currency));
        }

        if (currencyIn != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("currency__in", currencyIn));
        }

        if (reference != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("reference", reference));
        }

        if (referenceIn != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("reference__in", referenceIn));
        }

        if (status != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("status", status));
        }

        if (statusIn != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("status__in", statusIn));
        }

        if (type != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("type", type));
        }

        if (typeIn != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("type__in", typeIn));
        }

        if (valueDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("value_date", valueDate));
        }

        if (valueDateGt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("value_date__gt", valueDateGt));
        }

        if (valueDateGte != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("value_date__gte", valueDateGte));
        }

        if (valueDateLt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("value_date__lt", valueDateLt));
        }

        if (valueDateLte != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("value_date__lte", valueDateLte));
        }

        if (valueDateRange != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("value_date__range", valueDateRange));
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
    private okhttp3.Call listValidateBeforeCall(UUID link, Integer page, Integer pageSize, String omit, String fields, UUID account, String accountBalanceAvailable, String accountBalanceAvailableLt, String accountBalanceAvailableLte, String accountBalanceAvailableRange, String accountBalanceCurrent, String accountBalanceCurrentGt, String accountBalanceCurrentGte, String accountBalanceCurrentLt, String accountBalanceCurrentLte, String accountBalanceCurrentRange, String accountIn, String accountType, String accountTypeIn, String accountingDate, String accountingDateGt, String accountingDateGte, String accountingDateLt, String accountingDateLte, String accountingDateRange, String amount, String amountGt, String amountGte, String amountLt, String amountLte, String amountRange, String collectedAt, String collectedAtGt, String collectedAtGte, String collectedAtLt, String collectedAtLte, String collectedAtRange, String createdAt, String createdAtGt, String createdAtGte, String createdAtLt, String createdAtLte, String createdAtRange, String creditCardDataBillNameIn, String currency, String currencyIn, String reference, String referenceIn, String status, String statusIn, String type, String typeIn, String valueDate, String valueDateGt, String valueDateGte, String valueDateLt, String valueDateLte, String valueDateRange, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'link' is set
        if (link == null) {
            throw new ApiException("Missing the required parameter 'link' when calling list(Async)");
        }

        return listCall(link, page, pageSize, omit, fields, account, accountBalanceAvailable, accountBalanceAvailableLt, accountBalanceAvailableLte, accountBalanceAvailableRange, accountBalanceCurrent, accountBalanceCurrentGt, accountBalanceCurrentGte, accountBalanceCurrentLt, accountBalanceCurrentLte, accountBalanceCurrentRange, accountIn, accountType, accountTypeIn, accountingDate, accountingDateGt, accountingDateGte, accountingDateLt, accountingDateLte, accountingDateRange, amount, amountGt, amountGte, amountLt, amountLte, amountRange, collectedAt, collectedAtGt, collectedAtGte, collectedAtLt, collectedAtLte, collectedAtRange, createdAt, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, creditCardDataBillNameIn, currency, currencyIn, reference, referenceIn, status, statusIn, type, typeIn, valueDate, valueDateGt, valueDateGte, valueDateLt, valueDateLte, valueDateRange, _callback);

    }


    private ApiResponse<TransactionsPaginatedResponse> listWithHttpInfo(UUID link, Integer page, Integer pageSize, String omit, String fields, UUID account, String accountBalanceAvailable, String accountBalanceAvailableLt, String accountBalanceAvailableLte, String accountBalanceAvailableRange, String accountBalanceCurrent, String accountBalanceCurrentGt, String accountBalanceCurrentGte, String accountBalanceCurrentLt, String accountBalanceCurrentLte, String accountBalanceCurrentRange, String accountIn, String accountType, String accountTypeIn, String accountingDate, String accountingDateGt, String accountingDateGte, String accountingDateLt, String accountingDateLte, String accountingDateRange, String amount, String amountGt, String amountGte, String amountLt, String amountLte, String amountRange, String collectedAt, String collectedAtGt, String collectedAtGte, String collectedAtLt, String collectedAtLte, String collectedAtRange, String createdAt, String createdAtGt, String createdAtGte, String createdAtLt, String createdAtLte, String createdAtRange, String creditCardDataBillNameIn, String currency, String currencyIn, String reference, String referenceIn, String status, String statusIn, String type, String typeIn, String valueDate, String valueDateGt, String valueDateGte, String valueDateLt, String valueDateLte, String valueDateRange) throws ApiException {
        okhttp3.Call localVarCall = listValidateBeforeCall(link, page, pageSize, omit, fields, account, accountBalanceAvailable, accountBalanceAvailableLt, accountBalanceAvailableLte, accountBalanceAvailableRange, accountBalanceCurrent, accountBalanceCurrentGt, accountBalanceCurrentGte, accountBalanceCurrentLt, accountBalanceCurrentLte, accountBalanceCurrentRange, accountIn, accountType, accountTypeIn, accountingDate, accountingDateGt, accountingDateGte, accountingDateLt, accountingDateLte, accountingDateRange, amount, amountGt, amountGte, amountLt, amountLte, amountRange, collectedAt, collectedAtGt, collectedAtGte, collectedAtLt, collectedAtLte, collectedAtRange, createdAt, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, creditCardDataBillNameIn, currency, currencyIn, reference, referenceIn, status, statusIn, type, typeIn, valueDate, valueDateGt, valueDateGte, valueDateLt, valueDateLte, valueDateRange, null);
        Type localVarReturnType = new TypeToken<TransactionsPaginatedResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listAsync(UUID link, Integer page, Integer pageSize, String omit, String fields, UUID account, String accountBalanceAvailable, String accountBalanceAvailableLt, String accountBalanceAvailableLte, String accountBalanceAvailableRange, String accountBalanceCurrent, String accountBalanceCurrentGt, String accountBalanceCurrentGte, String accountBalanceCurrentLt, String accountBalanceCurrentLte, String accountBalanceCurrentRange, String accountIn, String accountType, String accountTypeIn, String accountingDate, String accountingDateGt, String accountingDateGte, String accountingDateLt, String accountingDateLte, String accountingDateRange, String amount, String amountGt, String amountGte, String amountLt, String amountLte, String amountRange, String collectedAt, String collectedAtGt, String collectedAtGte, String collectedAtLt, String collectedAtLte, String collectedAtRange, String createdAt, String createdAtGt, String createdAtGte, String createdAtLt, String createdAtLte, String createdAtRange, String creditCardDataBillNameIn, String currency, String currencyIn, String reference, String referenceIn, String status, String statusIn, String type, String typeIn, String valueDate, String valueDateGt, String valueDateGte, String valueDateLt, String valueDateLte, String valueDateRange, final ApiCallback<TransactionsPaginatedResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listValidateBeforeCall(link, page, pageSize, omit, fields, account, accountBalanceAvailable, accountBalanceAvailableLt, accountBalanceAvailableLte, accountBalanceAvailableRange, accountBalanceCurrent, accountBalanceCurrentGt, accountBalanceCurrentGte, accountBalanceCurrentLt, accountBalanceCurrentLte, accountBalanceCurrentRange, accountIn, accountType, accountTypeIn, accountingDate, accountingDateGt, accountingDateGte, accountingDateLt, accountingDateLte, accountingDateRange, amount, amountGt, amountGte, amountLt, amountLte, amountRange, collectedAt, collectedAtGt, collectedAtGte, collectedAtLt, collectedAtLte, collectedAtRange, createdAt, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, creditCardDataBillNameIn, currency, currencyIn, reference, referenceIn, status, statusIn, type, typeIn, valueDate, valueDateGt, valueDateGte, valueDateLt, valueDateLte, valueDateRange, _callback);
        Type localVarReturnType = new TypeToken<TransactionsPaginatedResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListRequestBuilder {
        private final UUID link;
        private Integer page;
        private Integer pageSize;
        private String omit;
        private String fields;
        private UUID account;
        private String accountBalanceAvailable;
        private String accountBalanceAvailableLt;
        private String accountBalanceAvailableLte;
        private String accountBalanceAvailableRange;
        private String accountBalanceCurrent;
        private String accountBalanceCurrentGt;
        private String accountBalanceCurrentGte;
        private String accountBalanceCurrentLt;
        private String accountBalanceCurrentLte;
        private String accountBalanceCurrentRange;
        private String accountIn;
        private String accountType;
        private String accountTypeIn;
        private String accountingDate;
        private String accountingDateGt;
        private String accountingDateGte;
        private String accountingDateLt;
        private String accountingDateLte;
        private String accountingDateRange;
        private String amount;
        private String amountGt;
        private String amountGte;
        private String amountLt;
        private String amountLte;
        private String amountRange;
        private String collectedAt;
        private String collectedAtGt;
        private String collectedAtGte;
        private String collectedAtLt;
        private String collectedAtLte;
        private String collectedAtRange;
        private String createdAt;
        private String createdAtGt;
        private String createdAtGte;
        private String createdAtLt;
        private String createdAtLte;
        private String createdAtRange;
        private String creditCardDataBillNameIn;
        private String currency;
        private String currencyIn;
        private String reference;
        private String referenceIn;
        private String status;
        private String statusIn;
        private String type;
        private String typeIn;
        private String valueDate;
        private String valueDateGt;
        private String valueDateGte;
        private String valueDateLt;
        private String valueDateLte;
        private String valueDateRange;

        private ListRequestBuilder(UUID link) {
            this.link = link;
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
         * @param pageSize Indicates how many results to return per page. By default we return 100 results per page.  ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000).  (optional, default to 100)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        
        /**
         * Set omit
         * @param omit Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder omit(String omit) {
            this.omit = omit;
            return this;
        }
        
        /**
         * Set fields
         * @param fields Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder fields(String fields) {
            this.fields = fields;
            return this;
        }
        
        /**
         * Set account
         * @param account The &#x60;account.id&#x60; you want to filter by.  ℹ️ We highly recommend adding the &#x60;account.id&#x60; filter in order to improve your performance.  (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder account(UUID account) {
            this.account = account;
            return this;
        }
        
        /**
         * Set accountBalanceAvailable
         * @param accountBalanceAvailable Return transactions that have a &#x60;account.balance.available&#x60; matching exactly this value. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder accountBalanceAvailable(String accountBalanceAvailable) {
            this.accountBalanceAvailable = accountBalanceAvailable;
            return this;
        }
        
        /**
         * Set accountBalanceAvailableLt
         * @param accountBalanceAvailableLt Return transactions that have a &#x60;account.balance.available&#x60; less than this value. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder accountBalanceAvailableLt(String accountBalanceAvailableLt) {
            this.accountBalanceAvailableLt = accountBalanceAvailableLt;
            return this;
        }
        
        /**
         * Set accountBalanceAvailableLte
         * @param accountBalanceAvailableLte Return transactions that have a &#x60;account.balance.available&#x60; less than or equal to this value. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder accountBalanceAvailableLte(String accountBalanceAvailableLte) {
            this.accountBalanceAvailableLte = accountBalanceAvailableLte;
            return this;
        }
        
        /**
         * Set accountBalanceAvailableRange
         * @param accountBalanceAvailableRange Return transactions that have a &#x60;account.balance.available&#x60; within a range of two values. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder accountBalanceAvailableRange(String accountBalanceAvailableRange) {
            this.accountBalanceAvailableRange = accountBalanceAvailableRange;
            return this;
        }
        
        /**
         * Set accountBalanceCurrent
         * @param accountBalanceCurrent Return transactions that have a &#x60;account.balance.current&#x60; matching exactly this value. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder accountBalanceCurrent(String accountBalanceCurrent) {
            this.accountBalanceCurrent = accountBalanceCurrent;
            return this;
        }
        
        /**
         * Set accountBalanceCurrentGt
         * @param accountBalanceCurrentGt Return transactions that have a &#x60;account.balance.current&#x60; greater than this value. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder accountBalanceCurrentGt(String accountBalanceCurrentGt) {
            this.accountBalanceCurrentGt = accountBalanceCurrentGt;
            return this;
        }
        
        /**
         * Set accountBalanceCurrentGte
         * @param accountBalanceCurrentGte Return transactions that have a &#x60;account.balance.current&#x60; greater than or equal to this value. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder accountBalanceCurrentGte(String accountBalanceCurrentGte) {
            this.accountBalanceCurrentGte = accountBalanceCurrentGte;
            return this;
        }
        
        /**
         * Set accountBalanceCurrentLt
         * @param accountBalanceCurrentLt Return transactions that have a &#x60;account.balance.current&#x60; less than this value. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder accountBalanceCurrentLt(String accountBalanceCurrentLt) {
            this.accountBalanceCurrentLt = accountBalanceCurrentLt;
            return this;
        }
        
        /**
         * Set accountBalanceCurrentLte
         * @param accountBalanceCurrentLte Return transactions that have a &#x60;account.balance.current&#x60; less than or equal to this value. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder accountBalanceCurrentLte(String accountBalanceCurrentLte) {
            this.accountBalanceCurrentLte = accountBalanceCurrentLte;
            return this;
        }
        
        /**
         * Set accountBalanceCurrentRange
         * @param accountBalanceCurrentRange Return transactions that have a &#x60;account.balance.current&#x60; within a range of two values. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder accountBalanceCurrentRange(String accountBalanceCurrentRange) {
            this.accountBalanceCurrentRange = accountBalanceCurrentRange;
            return this;
        }
        
        /**
         * Set accountIn
         * @param accountIn Return transactions only for these &#x60;account.id&#x60;s. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder accountIn(String accountIn) {
            this.accountIn = accountIn;
            return this;
        }
        
        /**
         * Set accountType
         * @param accountType Return information only for transactions matching this account type, as designated by the institution. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder accountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        
        /**
         * Set accountTypeIn
         * @param accountTypeIn Return information only for transactions matching these account types, as designated by the institution. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder accountTypeIn(String accountTypeIn) {
            this.accountTypeIn = accountTypeIn;
            return this;
        }
        
        /**
         * Set accountingDate
         * @param accountingDate Return transactions that were processed by the institution on exactly this date (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder accountingDate(String accountingDate) {
            this.accountingDate = accountingDate;
            return this;
        }
        
        /**
         * Set accountingDateGt
         * @param accountingDateGt Return transactions that were processed by the institution after this date (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder accountingDateGt(String accountingDateGt) {
            this.accountingDateGt = accountingDateGt;
            return this;
        }
        
        /**
         * Set accountingDateGte
         * @param accountingDateGte Return transactions that were processed by the institution on this date or later (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder accountingDateGte(String accountingDateGte) {
            this.accountingDateGte = accountingDateGte;
            return this;
        }
        
        /**
         * Set accountingDateLt
         * @param accountingDateLt Return transactions that were processed by the institution before this date (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder accountingDateLt(String accountingDateLt) {
            this.accountingDateLt = accountingDateLt;
            return this;
        }
        
        /**
         * Set accountingDateLte
         * @param accountingDateLte Return transactions that were processed by the institution on this date or earlier (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder accountingDateLte(String accountingDateLte) {
            this.accountingDateLte = accountingDateLte;
            return this;
        }
        
        /**
         * Set accountingDateRange
         * @param accountingDateRange Return transactions that were processed by the institution in this date range (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder accountingDateRange(String accountingDateRange) {
            this.accountingDateRange = accountingDateRange;
            return this;
        }
        
        /**
         * Set amount
         * @param amount Return transactions matching exactly this value. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder amount(String amount) {
            this.amount = amount;
            return this;
        }
        
        /**
         * Set amountGt
         * @param amountGt Return transactions greater than this value. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder amountGt(String amountGt) {
            this.amountGt = amountGt;
            return this;
        }
        
        /**
         * Set amountGte
         * @param amountGte Return transactions greater than or equal to this value. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder amountGte(String amountGte) {
            this.amountGte = amountGte;
            return this;
        }
        
        /**
         * Set amountLt
         * @param amountLt Return transactions less than this value. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder amountLt(String amountLt) {
            this.amountLt = amountLt;
            return this;
        }
        
        /**
         * Set amountLte
         * @param amountLte Return transactions less than or equal to this value. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder amountLte(String amountLte) {
            this.amountLte = amountLte;
            return this;
        }
        
        /**
         * Set amountRange
         * @param amountRange Return transactions between these two values. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder amountRange(String amountRange) {
            this.amountRange = amountRange;
            return this;
        }
        
        /**
         * Set collectedAt
         * @param collectedAt Return transactions that were retrieved from the institution on this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder collectedAt(String collectedAt) {
            this.collectedAt = collectedAt;
            return this;
        }
        
        /**
         * Set collectedAtGt
         * @param collectedAtGt Return transactions that were retrieved from the institution after this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder collectedAtGt(String collectedAtGt) {
            this.collectedAtGt = collectedAtGt;
            return this;
        }
        
        /**
         * Set collectedAtGte
         * @param collectedAtGte Return transactions that were retrieved from the institution after or on this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder collectedAtGte(String collectedAtGte) {
            this.collectedAtGte = collectedAtGte;
            return this;
        }
        
        /**
         * Set collectedAtLt
         * @param collectedAtLt Return transactions that were retrieved from the institution before this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder collectedAtLt(String collectedAtLt) {
            this.collectedAtLt = collectedAtLt;
            return this;
        }
        
        /**
         * Set collectedAtLte
         * @param collectedAtLte Return transactions that were retrieved from the institution before or on this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder collectedAtLte(String collectedAtLte) {
            this.collectedAtLte = collectedAtLte;
            return this;
        }
        
        /**
         * Set collectedAtRange
         * @param collectedAtRange Return transactions that were retrieved from the institution between two dates (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder collectedAtRange(String collectedAtRange) {
            this.collectedAtRange = collectedAtRange;
            return this;
        }
        
        /**
         * Set createdAt
         * @param createdAt Return transactions that were last updated in Belvo&#39;s database on this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        
        /**
         * Set createdAtGt
         * @param createdAtGt Return transactions that were last updated in Belvo&#39;s database after this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder createdAtGt(String createdAtGt) {
            this.createdAtGt = createdAtGt;
            return this;
        }
        
        /**
         * Set createdAtGte
         * @param createdAtGte Return transactions that were last updated in Belvo&#39;s database after or on this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder createdAtGte(String createdAtGte) {
            this.createdAtGte = createdAtGte;
            return this;
        }
        
        /**
         * Set createdAtLt
         * @param createdAtLt Return transactions that were last updated in Belvo&#39;s database before this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder createdAtLt(String createdAtLt) {
            this.createdAtLt = createdAtLt;
            return this;
        }
        
        /**
         * Set createdAtLte
         * @param createdAtLte Return transactions that were last updated in Belvo&#39;s database before or on this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder createdAtLte(String createdAtLte) {
            this.createdAtLte = createdAtLte;
            return this;
        }
        
        /**
         * Set createdAtRange
         * @param createdAtRange Return transactions that were last updated in Belvo&#39;s database between two dates (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder createdAtRange(String createdAtRange) {
            this.createdAtRange = createdAtRange;
            return this;
        }
        
        /**
         * Set creditCardDataBillNameIn
         * @param creditCardDataBillNameIn Return transactions for one of these bill names. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder creditCardDataBillNameIn(String creditCardDataBillNameIn) {
            this.creditCardDataBillNameIn = creditCardDataBillNameIn;
            return this;
        }
        
        /**
         * Set currency
         * @param currency Return transactions in only this three-letter currency code. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder currency(String currency) {
            this.currency = currency;
            return this;
        }
        
        /**
         * Set currencyIn
         * @param currencyIn Return transactions in one of these three-letter currency codes. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder currencyIn(String currencyIn) {
            this.currencyIn = currencyIn;
            return this;
        }
        
        /**
         * Set reference
         * @param reference Returns transactions with this institution-assigned reference number. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder reference(String reference) {
            this.reference = reference;
            return this;
        }
        
        /**
         * Set referenceIn
         * @param referenceIn Returns transactions with these institution-assigned reference numbers. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder referenceIn(String referenceIn) {
            this.referenceIn = referenceIn;
            return this;
        }
        
        /**
         * Set status
         * @param status Return transactions with this status. Can be either &#x60;PENDING&#x60;, &#x60;PROCESSED&#x60;, or &#x60;UNCATEGORIZED&#x60;. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder status(String status) {
            this.status = status;
            return this;
        }
        
        /**
         * Set statusIn
         * @param statusIn Return transactions with these statuses. Can be either &#x60;PENDING&#x60;, &#x60;PROCESSED&#x60;, or &#x60;UNCATEGORIZED&#x60;. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder statusIn(String statusIn) {
            this.statusIn = statusIn;
            return this;
        }
        
        /**
         * Set type
         * @param type Return transactions with this type. Can be either &#x60;INFLOW&#x60; or &#x60;OUTFLOW&#x60;. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder type(String type) {
            this.type = type;
            return this;
        }
        
        /**
         * Set typeIn
         * @param typeIn Return transactions with this types. Can be either &#x60;INFLOW&#x60; or &#x60;OUTFLOW&#x60;. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder typeIn(String typeIn) {
            this.typeIn = typeIn;
            return this;
        }
        
        /**
         * Set valueDate
         * @param valueDate Return transactions that occurred on exactly this date (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder valueDate(String valueDate) {
            this.valueDate = valueDate;
            return this;
        }
        
        /**
         * Set valueDateGt
         * @param valueDateGt Return transactions that occurred after this date (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder valueDateGt(String valueDateGt) {
            this.valueDateGt = valueDateGt;
            return this;
        }
        
        /**
         * Set valueDateGte
         * @param valueDateGte Return transactions that occurred on this date or later (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder valueDateGte(String valueDateGte) {
            this.valueDateGte = valueDateGte;
            return this;
        }
        
        /**
         * Set valueDateLt
         * @param valueDateLt Return transactions that occurred before this date (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder valueDateLt(String valueDateLt) {
            this.valueDateLt = valueDateLt;
            return this;
        }
        
        /**
         * Set valueDateLte
         * @param valueDateLte Return transactions that occurred on this date or earlier (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder valueDateLte(String valueDateLte) {
            this.valueDateLte = valueDateLte;
            return this;
        }
        
        /**
         * Set valueDateRange
         * @param valueDateRange Return transactions for this date range (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder valueDateRange(String valueDateRange) {
            this.valueDateRange = valueDateRange;
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
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listCall(link, page, pageSize, omit, fields, account, accountBalanceAvailable, accountBalanceAvailableLt, accountBalanceAvailableLte, accountBalanceAvailableRange, accountBalanceCurrent, accountBalanceCurrentGt, accountBalanceCurrentGte, accountBalanceCurrentLt, accountBalanceCurrentLte, accountBalanceCurrentRange, accountIn, accountType, accountTypeIn, accountingDate, accountingDateGt, accountingDateGte, accountingDateLt, accountingDateLte, accountingDateRange, amount, amountGt, amountGte, amountLt, amountLte, amountRange, collectedAt, collectedAtGt, collectedAtGte, collectedAtLt, collectedAtLte, collectedAtRange, createdAt, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, creditCardDataBillNameIn, currency, currencyIn, reference, referenceIn, status, statusIn, type, typeIn, valueDate, valueDateGt, valueDateGte, valueDateLt, valueDateLte, valueDateRange, _callback);
        }


        /**
         * Execute list request
         * @return TransactionsPaginatedResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public TransactionsPaginatedResponse execute() throws ApiException {
            ApiResponse<TransactionsPaginatedResponse> localVarResp = listWithHttpInfo(link, page, pageSize, omit, fields, account, accountBalanceAvailable, accountBalanceAvailableLt, accountBalanceAvailableLte, accountBalanceAvailableRange, accountBalanceCurrent, accountBalanceCurrentGt, accountBalanceCurrentGte, accountBalanceCurrentLt, accountBalanceCurrentLte, accountBalanceCurrentRange, accountIn, accountType, accountTypeIn, accountingDate, accountingDateGt, accountingDateGte, accountingDateLt, accountingDateLte, accountingDateRange, amount, amountGt, amountGte, amountLt, amountLte, amountRange, collectedAt, collectedAtGt, collectedAtGte, collectedAtLt, collectedAtLte, collectedAtRange, createdAt, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, creditCardDataBillNameIn, currency, currencyIn, reference, referenceIn, status, statusIn, type, typeIn, valueDate, valueDateGt, valueDateGte, valueDateLt, valueDateLte, valueDateRange);
            return localVarResp.getData();
        }

        /**
         * Execute list request with HTTP info returned
         * @return ApiResponse&lt;TransactionsPaginatedResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<TransactionsPaginatedResponse> executeWithHttpInfo() throws ApiException {
            return listWithHttpInfo(link, page, pageSize, omit, fields, account, accountBalanceAvailable, accountBalanceAvailableLt, accountBalanceAvailableLte, accountBalanceAvailableRange, accountBalanceCurrent, accountBalanceCurrentGt, accountBalanceCurrentGte, accountBalanceCurrentLt, accountBalanceCurrentLte, accountBalanceCurrentRange, accountIn, accountType, accountTypeIn, accountingDate, accountingDateGt, accountingDateGte, accountingDateLt, accountingDateLte, accountingDateRange, amount, amountGt, amountGte, amountLt, amountLte, amountRange, collectedAt, collectedAtGt, collectedAtGte, collectedAtLt, collectedAtLte, collectedAtRange, createdAt, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, creditCardDataBillNameIn, currency, currencyIn, reference, referenceIn, status, statusIn, type, typeIn, valueDate, valueDateGt, valueDateGte, valueDateLt, valueDateLte, valueDateRange);
        }

        /**
         * Execute list request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<TransactionsPaginatedResponse> _callback) throws ApiException {
            return listAsync(link, page, pageSize, omit, fields, account, accountBalanceAvailable, accountBalanceAvailableLt, accountBalanceAvailableLte, accountBalanceAvailableRange, accountBalanceCurrent, accountBalanceCurrentGt, accountBalanceCurrentGte, accountBalanceCurrentLt, accountBalanceCurrentLte, accountBalanceCurrentRange, accountIn, accountType, accountTypeIn, accountingDate, accountingDateGt, accountingDateGte, accountingDateLt, accountingDateLte, accountingDateRange, amount, amountGt, amountGte, amountLt, amountLte, amountRange, collectedAt, collectedAtGt, collectedAtGte, collectedAtLt, collectedAtLte, collectedAtRange, createdAt, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, creditCardDataBillNameIn, currency, currencyIn, reference, referenceIn, status, statusIn, type, typeIn, valueDate, valueDateGt, valueDateGte, valueDateLt, valueDateLte, valueDateRange, _callback);
        }
    }

    /**
     * List all transactions
     * Get a paginated list of all existing transactions in your Belvo account. By default, we return up to 100 results per page.
     * @param link The &#x60;link.id&#x60; you want to filter by.  ℹ️ We highly recommend adding the &#x60;account.id&#x60; filter as well in order to improve your performance.  (required)
     * @return ListRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public ListRequestBuilder list(UUID link) throws IllegalArgumentException {
        if (link == null) throw new IllegalArgumentException("\"link\" is required but got null");
        return new ListRequestBuilder(link);
    }
    private okhttp3.Call retrieveCall(TransactionsRequest transactionsRequest, String xBelvoRequestMode, String omit, String fields, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = transactionsRequest;

        // create path and map variables
        String localVarPath = "/api/transactions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (omit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("omit", omit));
        }

        if (fields != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fields", fields));
        }

        if (xBelvoRequestMode != null) {
            localVarHeaderParams.put("X-Belvo-Request-Mode", localVarApiClient.parameterToString(xBelvoRequestMode));
        }

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
    private okhttp3.Call retrieveValidateBeforeCall(TransactionsRequest transactionsRequest, String xBelvoRequestMode, String omit, String fields, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'transactionsRequest' is set
        if (transactionsRequest == null) {
            throw new ApiException("Missing the required parameter 'transactionsRequest' when calling retrieve(Async)");
        }

        return retrieveCall(transactionsRequest, xBelvoRequestMode, omit, fields, _callback);

    }


    private ApiResponse<List<Transaction>> retrieveWithHttpInfo(TransactionsRequest transactionsRequest, String xBelvoRequestMode, String omit, String fields) throws ApiException {
        okhttp3.Call localVarCall = retrieveValidateBeforeCall(transactionsRequest, xBelvoRequestMode, omit, fields, null);
        Type localVarReturnType = new TypeToken<List<Transaction>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call retrieveAsync(TransactionsRequest transactionsRequest, String xBelvoRequestMode, String omit, String fields, final ApiCallback<List<Transaction>> _callback) throws ApiException {

        okhttp3.Call localVarCall = retrieveValidateBeforeCall(transactionsRequest, xBelvoRequestMode, omit, fields, _callback);
        Type localVarReturnType = new TypeToken<List<Transaction>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class RetrieveRequestBuilder {
        private final UUID link;
        private final String dateFrom;
        private final String dateTo;
        private UUID account;
        private String token;
        private Boolean saveData;
        private String xBelvoRequestMode;
        private String omit;
        private String fields;

        private RetrieveRequestBuilder(UUID link, String dateFrom, String dateTo) {
            this.link = link;
            this.dateFrom = dateFrom;
            this.dateTo = dateTo;
        }

        /**
         * Set account
         * @param account If provided, we return transactions only from this account. (optional)
         * @return RetrieveRequestBuilder
         */
        public RetrieveRequestBuilder account(UUID account) {
            this.account = account;
            return this;
        }
        
        /**
         * Set token
         * @param token The OTP token generated by the bank. (optional)
         * @return RetrieveRequestBuilder
         */
        public RetrieveRequestBuilder token(String token) {
            this.token = token;
            return this;
        }
        
        /**
         * Set saveData
         * @param saveData Indicates whether or not to persist the data in Belvo. By default, this is set to &#x60;true&#x60; and we return a 201 Created response. When set to &#x60;false&#x60;, the data won&#39;t be persisted and we return a 200 OK response. (optional, default to true)
         * @return RetrieveRequestBuilder
         */
        public RetrieveRequestBuilder saveData(Boolean saveData) {
            this.saveData = saveData;
            return this;
        }
        
        /**
         * Set xBelvoRequestMode
         * @param xBelvoRequestMode  (optional)
         * @return RetrieveRequestBuilder
         */
        public RetrieveRequestBuilder xBelvoRequestMode(String xBelvoRequestMode) {
            this.xBelvoRequestMode = xBelvoRequestMode;
            return this;
        }
        
        /**
         * Set omit
         * @param omit Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. (optional)
         * @return RetrieveRequestBuilder
         */
        public RetrieveRequestBuilder omit(String omit) {
            this.omit = omit;
            return this;
        }
        
        /**
         * Set fields
         * @param fields Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. (optional)
         * @return RetrieveRequestBuilder
         */
        public RetrieveRequestBuilder fields(String fields) {
            this.fields = fields;
            return this;
        }
        
        /**
         * Build call for retrieve
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok (when &#x60;save_data&#x3D;false&#x60;) </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created (when &#x60;save_data&#x3D;true&#x60;) </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted (when &#x60;X-Belvo-Request-Mode&#x60; is &#x60;async&#x60;) </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            TransactionsRequest transactionsRequest = buildBodyParams();
            return retrieveCall(transactionsRequest, xBelvoRequestMode, omit, fields, _callback);
        }

        private TransactionsRequest buildBodyParams() {
            TransactionsRequest transactionsRequest = new TransactionsRequest();
            transactionsRequest.link(this.link);
            transactionsRequest.account(this.account);
            transactionsRequest.dateFrom(this.dateFrom);
            transactionsRequest.dateTo(this.dateTo);
            transactionsRequest.token(this.token);
            transactionsRequest.saveData(this.saveData);
            return transactionsRequest;
        }

        /**
         * Execute retrieve request
         * @return List&lt;Transaction&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok (when &#x60;save_data&#x3D;false&#x60;) </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created (when &#x60;save_data&#x3D;true&#x60;) </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted (when &#x60;X-Belvo-Request-Mode&#x60; is &#x60;async&#x60;) </td><td>  -  </td></tr>
         </table>
         */
        public List<Transaction> execute() throws ApiException {
            TransactionsRequest transactionsRequest = buildBodyParams();
            ApiResponse<List<Transaction>> localVarResp = retrieveWithHttpInfo(transactionsRequest, xBelvoRequestMode, omit, fields);
            return localVarResp.getData();
        }

        /**
         * Execute retrieve request with HTTP info returned
         * @return ApiResponse&lt;List&lt;Transaction&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok (when &#x60;save_data&#x3D;false&#x60;) </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created (when &#x60;save_data&#x3D;true&#x60;) </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted (when &#x60;X-Belvo-Request-Mode&#x60; is &#x60;async&#x60;) </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<Transaction>> executeWithHttpInfo() throws ApiException {
            TransactionsRequest transactionsRequest = buildBodyParams();
            return retrieveWithHttpInfo(transactionsRequest, xBelvoRequestMode, omit, fields);
        }

        /**
         * Execute retrieve request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok (when &#x60;save_data&#x3D;false&#x60;) </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created (when &#x60;save_data&#x3D;true&#x60;) </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted (when &#x60;X-Belvo-Request-Mode&#x60; is &#x60;async&#x60;) </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<Transaction>> _callback) throws ApiException {
            TransactionsRequest transactionsRequest = buildBodyParams();
            return retrieveAsync(transactionsRequest, xBelvoRequestMode, omit, fields, _callback);
        }
    }

    /**
     * Retrieve transactions for a link
     * Retrieve transactions for one or more accounts from a specific link. &lt;div style&#x3D;\&quot;background-color:#f4f6f8; border-left: 6px solid #0663F9;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\&quot;&gt; &lt;strong&gt;Info: &lt;/strong&gt; When retrieving transactions, it is important to understand that the available transaction data ranges depend on each institution. &lt;br&gt;&lt;br&gt; If you try to access older information than what we can access, we will return all the data we can read within that date range. For example, if you request transactions for the last year and we can only access the last six months, we will return the information corresponding to these six months of data. &lt;/div&gt; 
     * @param transactionsRequest  (required)
     * @return RetrieveRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok (when &#x60;save_data&#x3D;false&#x60;) </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created (when &#x60;save_data&#x3D;true&#x60;) </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted (when &#x60;X-Belvo-Request-Mode&#x60; is &#x60;async&#x60;) </td><td>  -  </td></tr>
     </table>
     */
    public RetrieveRequestBuilder retrieve(UUID link, String dateFrom, String dateTo) throws IllegalArgumentException {
        if (link == null) throw new IllegalArgumentException("\"link\" is required but got null");
        if (dateFrom == null) throw new IllegalArgumentException("\"dateFrom\" is required but got null");
        if (dateTo == null) throw new IllegalArgumentException("\"dateTo\" is required but got null");
        return new RetrieveRequestBuilder(link, dateFrom, dateTo);
    }
}
