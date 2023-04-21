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


import com.belvo.client.model.Balance;
import com.belvo.client.model.BalancesPaginatedResponse;
import com.belvo.client.model.BalancesRequest;
import com.belvo.client.model.PatchBody;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class BalancesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public BalancesApi() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public BalancesApi(ApiClient apiClient) throws IllegalArgumentException {
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
        String localVarPath = "/api/balances";

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


    private ApiResponse<List<Balance>> completeRequestWithHttpInfo(PatchBody patchBody, String omit, String fields) throws ApiException {
        okhttp3.Call localVarCall = completeRequestValidateBeforeCall(patchBody, omit, fields, null);
        Type localVarReturnType = new TypeToken<List<Balance>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call completeRequestAsync(PatchBody patchBody, String omit, String fields, final ApiCallback<List<Balance>> _callback) throws ApiException {

        okhttp3.Call localVarCall = completeRequestValidateBeforeCall(patchBody, omit, fields, _callback);
        Type localVarReturnType = new TypeToken<List<Balance>>(){}.getType();
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
         * @return List&lt;Balance&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok (when &#x60;save_data&#x3D;false&#x60;) </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created (when &#x60;save_data&#x3D;true&#x60;) </td><td>  -  </td></tr>
         </table>
         */
        public List<Balance> execute() throws ApiException {
            PatchBody patchBody = buildBodyParams();
            ApiResponse<List<Balance>> localVarResp = completeRequestWithHttpInfo(patchBody, omit, fields);
            return localVarResp.getData();
        }

        /**
         * Execute completeRequest request with HTTP info returned
         * @return ApiResponse&lt;List&lt;Balance&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok (when &#x60;save_data&#x3D;false&#x60;) </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created (when &#x60;save_data&#x3D;true&#x60;) </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<Balance>> executeWithHttpInfo() throws ApiException {
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
        public okhttp3.Call executeAsync(final ApiCallback<List<Balance>> _callback) throws ApiException {
            PatchBody patchBody = buildBodyParams();
            return completeRequestAsync(patchBody, omit, fields, _callback);
        }
    }

    /**
     * Complete a balances request
     * Used to resume a Balance retrieve session that was paused because an MFA token was required by the institution.
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
        String localVarPath = "/api/balances/{id}"
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
     * Delete a balance
     * Delete a specific balance from your Belvo account.
     * @param id The &#x60;balance.id&#x60; that you want to delete. (required)
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
        String localVarPath = "/api/balances/{id}"
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


    private ApiResponse<Balance> getDetailsWithHttpInfo(UUID id, String omit, String fields) throws ApiException {
        okhttp3.Call localVarCall = getDetailsValidateBeforeCall(id, omit, fields, null);
        Type localVarReturnType = new TypeToken<Balance>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getDetailsAsync(UUID id, String omit, String fields, final ApiCallback<Balance> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDetailsValidateBeforeCall(id, omit, fields, _callback);
        Type localVarReturnType = new TypeToken<Balance>(){}.getType();
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
         * @return Balance
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public Balance execute() throws ApiException {
            ApiResponse<Balance> localVarResp = getDetailsWithHttpInfo(id, omit, fields);
            return localVarResp.getData();
        }

        /**
         * Execute getDetails request with HTTP info returned
         * @return ApiResponse&lt;Balance&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Balance> executeWithHttpInfo() throws ApiException {
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
        public okhttp3.Call executeAsync(final ApiCallback<Balance> _callback) throws ApiException {
            return getDetailsAsync(id, omit, fields, _callback);
        }
    }

    /**
     * Get a balance&#39;s details
     * Get the details of a specific balance.
     * @param id The &#x60;balance.id&#x60; you want to get detailed information about. (required)
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
    private okhttp3.Call listCall(Integer page, Integer pageSize, String omit, String fields, UUID link, UUID account, String accountIn, String accountType, String accountTypeIn, String balance, String balanceLt, String balanceLte, String balanceGt, String balanceGte, String balanceRange, String currency, String currencyIn, String id, String idIn, String institution, String institutionIn, String linkIn, String valueDate, String valueDateGt, String valueDateGte, String valueDateLt, String valueDateLte, String valueDateRange, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/balances";

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

        if (accountIn != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account__in", accountIn));
        }

        if (accountType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account__type", accountType));
        }

        if (accountTypeIn != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account__type__in", accountTypeIn));
        }

        if (balance != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("balance", balance));
        }

        if (balanceLt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("balance__lt", balanceLt));
        }

        if (balanceLte != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("balance__lte", balanceLte));
        }

        if (balanceGt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("balance__gt", balanceGt));
        }

        if (balanceGte != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("balance__gte", balanceGte));
        }

        if (balanceRange != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("balance__range", balanceRange));
        }

        if (currency != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("currency", currency));
        }

        if (currencyIn != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("currency__in", currencyIn));
        }

        if (id != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("id", id));
        }

        if (idIn != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("id__in", idIn));
        }

        if (institution != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("institution", institution));
        }

        if (institutionIn != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("institution__in", institutionIn));
        }

        if (linkIn != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("link__in", linkIn));
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
    private okhttp3.Call listValidateBeforeCall(Integer page, Integer pageSize, String omit, String fields, UUID link, UUID account, String accountIn, String accountType, String accountTypeIn, String balance, String balanceLt, String balanceLte, String balanceGt, String balanceGte, String balanceRange, String currency, String currencyIn, String id, String idIn, String institution, String institutionIn, String linkIn, String valueDate, String valueDateGt, String valueDateGte, String valueDateLt, String valueDateLte, String valueDateRange, final ApiCallback _callback) throws ApiException {
        return listCall(page, pageSize, omit, fields, link, account, accountIn, accountType, accountTypeIn, balance, balanceLt, balanceLte, balanceGt, balanceGte, balanceRange, currency, currencyIn, id, idIn, institution, institutionIn, linkIn, valueDate, valueDateGt, valueDateGte, valueDateLt, valueDateLte, valueDateRange, _callback);

    }


    private ApiResponse<BalancesPaginatedResponse> listWithHttpInfo(Integer page, Integer pageSize, String omit, String fields, UUID link, UUID account, String accountIn, String accountType, String accountTypeIn, String balance, String balanceLt, String balanceLte, String balanceGt, String balanceGte, String balanceRange, String currency, String currencyIn, String id, String idIn, String institution, String institutionIn, String linkIn, String valueDate, String valueDateGt, String valueDateGte, String valueDateLt, String valueDateLte, String valueDateRange) throws ApiException {
        okhttp3.Call localVarCall = listValidateBeforeCall(page, pageSize, omit, fields, link, account, accountIn, accountType, accountTypeIn, balance, balanceLt, balanceLte, balanceGt, balanceGte, balanceRange, currency, currencyIn, id, idIn, institution, institutionIn, linkIn, valueDate, valueDateGt, valueDateGte, valueDateLt, valueDateLte, valueDateRange, null);
        Type localVarReturnType = new TypeToken<BalancesPaginatedResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listAsync(Integer page, Integer pageSize, String omit, String fields, UUID link, UUID account, String accountIn, String accountType, String accountTypeIn, String balance, String balanceLt, String balanceLte, String balanceGt, String balanceGte, String balanceRange, String currency, String currencyIn, String id, String idIn, String institution, String institutionIn, String linkIn, String valueDate, String valueDateGt, String valueDateGte, String valueDateLt, String valueDateLte, String valueDateRange, final ApiCallback<BalancesPaginatedResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listValidateBeforeCall(page, pageSize, omit, fields, link, account, accountIn, accountType, accountTypeIn, balance, balanceLt, balanceLte, balanceGt, balanceGte, balanceRange, currency, currencyIn, id, idIn, institution, institutionIn, linkIn, valueDate, valueDateGt, valueDateGte, valueDateLt, valueDateLte, valueDateRange, _callback);
        Type localVarReturnType = new TypeToken<BalancesPaginatedResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListRequestBuilder {
        private Integer page;
        private Integer pageSize;
        private String omit;
        private String fields;
        private UUID link;
        private UUID account;
        private String accountIn;
        private String accountType;
        private String accountTypeIn;
        private String balance;
        private String balanceLt;
        private String balanceLte;
        private String balanceGt;
        private String balanceGte;
        private String balanceRange;
        private String currency;
        private String currencyIn;
        private String id;
        private String idIn;
        private String institution;
        private String institutionIn;
        private String linkIn;
        private String valueDate;
        private String valueDateGt;
        private String valueDateGte;
        private String valueDateLt;
        private String valueDateLte;
        private String valueDateRange;

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
         * @param pageSize Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000).  (optional, default to 100)
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
         * Set link
         * @param link The &#x60;link.id&#x60; you want to filter by.  ℹ️ We highly recommend adding either the &#x60;link.id&#x60; or the &#x60;account.id&#x60; filters in order to improve your performance.  (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder link(UUID link) {
            this.link = link;
            return this;
        }
        
        /**
         * Set account
         * @param account The &#x60;account.id&#x60; you want to filter by.  ℹ️ We highly recommend adding either the &#x60;link.id&#x60; or the &#x60;account.id&#x60; filters in order to improve your performance.  (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder account(UUID account) {
            this.account = account;
            return this;
        }
        
        /**
         * Set accountIn
         * @param accountIn Return balances only for these &#x60;account.id&#x60;s. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder accountIn(String accountIn) {
            this.accountIn = accountIn;
            return this;
        }
        
        /**
         * Set accountType
         * @param accountType Return information only for accounts matching this account type, as designated by the institution. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder accountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        
        /**
         * Set accountTypeIn
         * @param accountTypeIn Return information only for accounts matching these account types, as designated by the institution. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder accountTypeIn(String accountTypeIn) {
            this.accountTypeIn = accountTypeIn;
            return this;
        }
        
        /**
         * Set balance
         * @param balance Return balances matching exactly this value. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder balance(String balance) {
            this.balance = balance;
            return this;
        }
        
        /**
         * Set balanceLt
         * @param balanceLt Return balances less than this value. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder balanceLt(String balanceLt) {
            this.balanceLt = balanceLt;
            return this;
        }
        
        /**
         * Set balanceLte
         * @param balanceLte Return balances less than or equal to this value. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder balanceLte(String balanceLte) {
            this.balanceLte = balanceLte;
            return this;
        }
        
        /**
         * Set balanceGt
         * @param balanceGt Return balances greater than this value. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder balanceGt(String balanceGt) {
            this.balanceGt = balanceGt;
            return this;
        }
        
        /**
         * Set balanceGte
         * @param balanceGte Return balances greater than or equal to this value. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder balanceGte(String balanceGte) {
            this.balanceGte = balanceGte;
            return this;
        }
        
        /**
         * Set balanceRange
         * @param balanceRange Return balances between these two values. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder balanceRange(String balanceRange) {
            this.balanceRange = balanceRange;
            return this;
        }
        
        /**
         * Set currency
         * @param currency Return balances that are in this three-letter currency code. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder currency(String currency) {
            this.currency = currency;
            return this;
        }
        
        /**
         * Set currencyIn
         * @param currencyIn Return balances that are in these three-letter currency codes. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder currencyIn(String currencyIn) {
            this.currencyIn = currencyIn;
            return this;
        }
        
        /**
         * Set id
         * @param id Return information only for this &#x60;balance.id&#x60;. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder id(String id) {
            this.id = id;
            return this;
        }
        
        /**
         * Set idIn
         * @param idIn Return information only for these &#x60;balance.id&#x60;s. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder idIn(String idIn) {
            this.idIn = idIn;
            return this;
        }
        
        /**
         * Set institution
         * @param institution Return balances only for this institution (use the Belvo-designated name, such as &#x60;erebor_mx_retail&#x60;). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder institution(String institution) {
            this.institution = institution;
            return this;
        }
        
        /**
         * Set institutionIn
         * @param institutionIn Return balances only for these institutions (use the Belvo-designated names, such as &#x60;erebor_mx_retail&#x60; and &#x60;gringotts_mx_retail&#x60;). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder institutionIn(String institutionIn) {
            this.institutionIn = institutionIn;
            return this;
        }
        
        /**
         * Set linkIn
         * @param linkIn Return balances only for these &#x60;link.id&#x60;s. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder linkIn(String linkIn) {
            this.linkIn = linkIn;
            return this;
        }
        
        /**
         * Set valueDate
         * @param valueDate Return balances for exactly this date (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder valueDate(String valueDate) {
            this.valueDate = valueDate;
            return this;
        }
        
        /**
         * Set valueDateGt
         * @param valueDateGt Return balances for after this date (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder valueDateGt(String valueDateGt) {
            this.valueDateGt = valueDateGt;
            return this;
        }
        
        /**
         * Set valueDateGte
         * @param valueDateGte Return balances for this date or later (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder valueDateGte(String valueDateGte) {
            this.valueDateGte = valueDateGte;
            return this;
        }
        
        /**
         * Set valueDateLt
         * @param valueDateLt Return balances for before this date (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder valueDateLt(String valueDateLt) {
            this.valueDateLt = valueDateLt;
            return this;
        }
        
        /**
         * Set valueDateLte
         * @param valueDateLte Return balances for this date or earlier (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder valueDateLte(String valueDateLte) {
            this.valueDateLte = valueDateLte;
            return this;
        }
        
        /**
         * Set valueDateRange
         * @param valueDateRange Return balances for this date range (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp). (optional)
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
            return listCall(page, pageSize, omit, fields, link, account, accountIn, accountType, accountTypeIn, balance, balanceLt, balanceLte, balanceGt, balanceGte, balanceRange, currency, currencyIn, id, idIn, institution, institutionIn, linkIn, valueDate, valueDateGt, valueDateGte, valueDateLt, valueDateLte, valueDateRange, _callback);
        }


        /**
         * Execute list request
         * @return BalancesPaginatedResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public BalancesPaginatedResponse execute() throws ApiException {
            ApiResponse<BalancesPaginatedResponse> localVarResp = listWithHttpInfo(page, pageSize, omit, fields, link, account, accountIn, accountType, accountTypeIn, balance, balanceLt, balanceLte, balanceGt, balanceGte, balanceRange, currency, currencyIn, id, idIn, institution, institutionIn, linkIn, valueDate, valueDateGt, valueDateGte, valueDateLt, valueDateLte, valueDateRange);
            return localVarResp.getData();
        }

        /**
         * Execute list request with HTTP info returned
         * @return ApiResponse&lt;BalancesPaginatedResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<BalancesPaginatedResponse> executeWithHttpInfo() throws ApiException {
            return listWithHttpInfo(page, pageSize, omit, fields, link, account, accountIn, accountType, accountTypeIn, balance, balanceLt, balanceLte, balanceGt, balanceGte, balanceRange, currency, currencyIn, id, idIn, institution, institutionIn, linkIn, valueDate, valueDateGt, valueDateGte, valueDateLt, valueDateLte, valueDateRange);
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
        public okhttp3.Call executeAsync(final ApiCallback<BalancesPaginatedResponse> _callback) throws ApiException {
            return listAsync(page, pageSize, omit, fields, link, account, accountIn, accountType, accountTypeIn, balance, balanceLt, balanceLte, balanceGt, balanceGte, balanceRange, currency, currencyIn, id, idIn, institution, institutionIn, linkIn, valueDate, valueDateGt, valueDateGte, valueDateLt, valueDateLte, valueDateRange, _callback);
        }
    }

    /**
     * List all balances
     * Get a paginated list of all existing balances in your Belvo account. By default, we return up to 100 results per page.
     * @return ListRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public ListRequestBuilder list() throws IllegalArgumentException {
        return new ListRequestBuilder();
    }
    private okhttp3.Call retrieveCall(BalancesRequest balancesRequest, String omit, String fields, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = balancesRequest;

        // create path and map variables
        String localVarPath = "/api/balances";

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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call retrieveValidateBeforeCall(BalancesRequest balancesRequest, String omit, String fields, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'balancesRequest' is set
        if (balancesRequest == null) {
            throw new ApiException("Missing the required parameter 'balancesRequest' when calling retrieve(Async)");
        }

        return retrieveCall(balancesRequest, omit, fields, _callback);

    }


    private ApiResponse<List<Balance>> retrieveWithHttpInfo(BalancesRequest balancesRequest, String omit, String fields) throws ApiException {
        okhttp3.Call localVarCall = retrieveValidateBeforeCall(balancesRequest, omit, fields, null);
        Type localVarReturnType = new TypeToken<List<Balance>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call retrieveAsync(BalancesRequest balancesRequest, String omit, String fields, final ApiCallback<List<Balance>> _callback) throws ApiException {

        okhttp3.Call localVarCall = retrieveValidateBeforeCall(balancesRequest, omit, fields, _callback);
        Type localVarReturnType = new TypeToken<List<Balance>>(){}.getType();
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
        private String omit;
        private String fields;

        private RetrieveRequestBuilder(UUID link, String dateFrom, String dateTo) {
            this.link = link;
            this.dateFrom = dateFrom;
            this.dateTo = dateTo;
        }

        /**
         * Set account
         * @param account If provided, only balances matching this &#x60;account.id&#x60; are returned. (optional)
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
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            BalancesRequest balancesRequest = buildBodyParams();
            return retrieveCall(balancesRequest, omit, fields, _callback);
        }

        private BalancesRequest buildBodyParams() {
            BalancesRequest balancesRequest = new BalancesRequest();
            balancesRequest.link(this.link);
            balancesRequest.account(this.account);
            balancesRequest.dateFrom(this.dateFrom);
            balancesRequest.dateTo(this.dateTo);
            balancesRequest.token(this.token);
            balancesRequest.saveData(this.saveData);
            return balancesRequest;
        }

        /**
         * Execute retrieve request
         * @return List&lt;Balance&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok (when &#x60;save_data&#x3D;false&#x60;) </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created (when &#x60;save_data&#x3D;true&#x60;) </td><td>  -  </td></tr>
         </table>
         */
        public List<Balance> execute() throws ApiException {
            BalancesRequest balancesRequest = buildBodyParams();
            ApiResponse<List<Balance>> localVarResp = retrieveWithHttpInfo(balancesRequest, omit, fields);
            return localVarResp.getData();
        }

        /**
         * Execute retrieve request with HTTP info returned
         * @return ApiResponse&lt;List&lt;Balance&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok (when &#x60;save_data&#x3D;false&#x60;) </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created (when &#x60;save_data&#x3D;true&#x60;) </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<Balance>> executeWithHttpInfo() throws ApiException {
            BalancesRequest balancesRequest = buildBodyParams();
            return retrieveWithHttpInfo(balancesRequest, omit, fields);
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
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<Balance>> _callback) throws ApiException {
            BalancesRequest balancesRequest = buildBodyParams();
            return retrieveAsync(balancesRequest, omit, fields, _callback);
        }
    }

    /**
     * Retrieve balances for a link
     * Retrieve balances from one or more accounts for a specific link within a specified date range.
     * @param balancesRequest  (required)
     * @return RetrieveRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok (when &#x60;save_data&#x3D;false&#x60;) </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created (when &#x60;save_data&#x3D;true&#x60;) </td><td>  -  </td></tr>
     </table>
     */
    public RetrieveRequestBuilder retrieve(UUID link, String dateFrom, String dateTo) throws IllegalArgumentException {
        if (link == null) throw new IllegalArgumentException("\"link\" is required but got null");
        if (dateFrom == null) throw new IllegalArgumentException("\"dateFrom\" is required but got null");
        if (dateTo == null) throw new IllegalArgumentException("\"dateTo\" is required but got null");
        return new RetrieveRequestBuilder(link, dateFrom, dateTo);
    }
}
