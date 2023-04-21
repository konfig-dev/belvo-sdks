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


import com.belvo.client.model.EnumInvoiceType;
import com.belvo.client.model.InvoicesRequest;
import com.belvo.client.model.InvoicesResponsePaginatedResponse;
import com.belvo.client.model.PatchBody;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class InvoicesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public InvoicesApi() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public InvoicesApi(ApiClient apiClient) throws IllegalArgumentException {
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
        String localVarPath = "/api/invoices";

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


    private ApiResponse<List<Object>> completeRequestWithHttpInfo(PatchBody patchBody, String omit, String fields) throws ApiException {
        okhttp3.Call localVarCall = completeRequestValidateBeforeCall(patchBody, omit, fields, null);
        Type localVarReturnType = new TypeToken<List<Object>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call completeRequestAsync(PatchBody patchBody, String omit, String fields, final ApiCallback<List<Object>> _callback) throws ApiException {

        okhttp3.Call localVarCall = completeRequestValidateBeforeCall(patchBody, omit, fields, _callback);
        Type localVarReturnType = new TypeToken<List<Object>>(){}.getType();
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
         * @return List&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok (when &#x60;save_data&#x3D;false&#x60;) </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created (when &#x60;save_data&#x3D;true&#x60;) </td><td>  -  </td></tr>
         </table>
         */
        public List<Object> execute() throws ApiException {
            PatchBody patchBody = buildBodyParams();
            ApiResponse<List<Object>> localVarResp = completeRequestWithHttpInfo(patchBody, omit, fields);
            return localVarResp.getData();
        }

        /**
         * Execute completeRequest request with HTTP info returned
         * @return ApiResponse&lt;List&lt;Object&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok (when &#x60;save_data&#x3D;false&#x60;) </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created (when &#x60;save_data&#x3D;true&#x60;) </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<Object>> executeWithHttpInfo() throws ApiException {
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
        public okhttp3.Call executeAsync(final ApiCallback<List<Object>> _callback) throws ApiException {
            PatchBody patchBody = buildBodyParams();
            return completeRequestAsync(patchBody, omit, fields, _callback);
        }
    }

    /**
     * Complete an invoices request
     * Used to resume an Invoice retrieve session that was paused because an MFA token was required by the institution.
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
        String localVarPath = "/api/invoices/{id}"
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
     * Delete an invoice
     * Delete a specific invoice from your Belvo account.
     * @param id The &#x60;invoice.id&#x60; that you want to delete. (required)
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
        String localVarPath = "/api/invoices/{id}"
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


    private ApiResponse<Object> getDetailsWithHttpInfo(UUID id, String omit, String fields) throws ApiException {
        okhttp3.Call localVarCall = getDetailsValidateBeforeCall(id, omit, fields, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getDetailsAsync(UUID id, String omit, String fields, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDetailsValidateBeforeCall(id, omit, fields, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
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
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ApiResponse<Object> localVarResp = getDetailsWithHttpInfo(id, omit, fields);
            return localVarResp.getData();
        }

        /**
         * Execute getDetails request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
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
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            return getDetailsAsync(id, omit, fields, _callback);
        }
    }

    /**
     * Get an invoice&#39;s details
     * Get the details of a specific invoice.
     * @param id The &#x60;invoice.id&#x60; you want to get detailed information about. (required)
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
    private okhttp3.Call listCall(Integer page, Integer pageSize, String omit, String fields, UUID link, String createdAtGt, String createdAtGte, String createdAtLt, String createdAtLte, String createdAtRange, String id, String idIn, String invoiceDate, String invoiceDateLt, String invoiceDateLte, String invoiceDateGt, String invoiceDateGte, String invoiceDateRange, String invoiceIdentification, String invoiceIdentificationIn, String linkIn, String status, String statusIn, String totalAmount, String totalAmountLt, String totalAmountLte, String totalAmountGt, String totalAmountGte, String totalAmountRange, String type, String typeIn, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/invoices";

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

        if (id != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("id", id));
        }

        if (idIn != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("id__in", idIn));
        }

        if (invoiceDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("invoice_date", invoiceDate));
        }

        if (invoiceDateLt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("invoice_date__lt", invoiceDateLt));
        }

        if (invoiceDateLte != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("invoice_date__lte", invoiceDateLte));
        }

        if (invoiceDateGt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("invoice_date__gt", invoiceDateGt));
        }

        if (invoiceDateGte != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("invoice_date__gte", invoiceDateGte));
        }

        if (invoiceDateRange != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("invoice_date__range", invoiceDateRange));
        }

        if (invoiceIdentification != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("invoice_identification", invoiceIdentification));
        }

        if (invoiceIdentificationIn != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("invoice_identification__in", invoiceIdentificationIn));
        }

        if (linkIn != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("link__in", linkIn));
        }

        if (status != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("status", status));
        }

        if (statusIn != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("status__in", statusIn));
        }

        if (totalAmount != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("total_amount", totalAmount));
        }

        if (totalAmountLt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("total_amount__lt", totalAmountLt));
        }

        if (totalAmountLte != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("total_amount__lte", totalAmountLte));
        }

        if (totalAmountGt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("total_amount__gt", totalAmountGt));
        }

        if (totalAmountGte != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("total_amount__gte", totalAmountGte));
        }

        if (totalAmountRange != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("total_amount__range", totalAmountRange));
        }

        if (type != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("type", type));
        }

        if (typeIn != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("type__in", typeIn));
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
    private okhttp3.Call listValidateBeforeCall(Integer page, Integer pageSize, String omit, String fields, UUID link, String createdAtGt, String createdAtGte, String createdAtLt, String createdAtLte, String createdAtRange, String id, String idIn, String invoiceDate, String invoiceDateLt, String invoiceDateLte, String invoiceDateGt, String invoiceDateGte, String invoiceDateRange, String invoiceIdentification, String invoiceIdentificationIn, String linkIn, String status, String statusIn, String totalAmount, String totalAmountLt, String totalAmountLte, String totalAmountGt, String totalAmountGte, String totalAmountRange, String type, String typeIn, final ApiCallback _callback) throws ApiException {
        return listCall(page, pageSize, omit, fields, link, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, id, idIn, invoiceDate, invoiceDateLt, invoiceDateLte, invoiceDateGt, invoiceDateGte, invoiceDateRange, invoiceIdentification, invoiceIdentificationIn, linkIn, status, statusIn, totalAmount, totalAmountLt, totalAmountLte, totalAmountGt, totalAmountGte, totalAmountRange, type, typeIn, _callback);

    }


    private ApiResponse<InvoicesResponsePaginatedResponse> listWithHttpInfo(Integer page, Integer pageSize, String omit, String fields, UUID link, String createdAtGt, String createdAtGte, String createdAtLt, String createdAtLte, String createdAtRange, String id, String idIn, String invoiceDate, String invoiceDateLt, String invoiceDateLte, String invoiceDateGt, String invoiceDateGte, String invoiceDateRange, String invoiceIdentification, String invoiceIdentificationIn, String linkIn, String status, String statusIn, String totalAmount, String totalAmountLt, String totalAmountLte, String totalAmountGt, String totalAmountGte, String totalAmountRange, String type, String typeIn) throws ApiException {
        okhttp3.Call localVarCall = listValidateBeforeCall(page, pageSize, omit, fields, link, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, id, idIn, invoiceDate, invoiceDateLt, invoiceDateLte, invoiceDateGt, invoiceDateGte, invoiceDateRange, invoiceIdentification, invoiceIdentificationIn, linkIn, status, statusIn, totalAmount, totalAmountLt, totalAmountLte, totalAmountGt, totalAmountGte, totalAmountRange, type, typeIn, null);
        Type localVarReturnType = new TypeToken<InvoicesResponsePaginatedResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listAsync(Integer page, Integer pageSize, String omit, String fields, UUID link, String createdAtGt, String createdAtGte, String createdAtLt, String createdAtLte, String createdAtRange, String id, String idIn, String invoiceDate, String invoiceDateLt, String invoiceDateLte, String invoiceDateGt, String invoiceDateGte, String invoiceDateRange, String invoiceIdentification, String invoiceIdentificationIn, String linkIn, String status, String statusIn, String totalAmount, String totalAmountLt, String totalAmountLte, String totalAmountGt, String totalAmountGte, String totalAmountRange, String type, String typeIn, final ApiCallback<InvoicesResponsePaginatedResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listValidateBeforeCall(page, pageSize, omit, fields, link, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, id, idIn, invoiceDate, invoiceDateLt, invoiceDateLte, invoiceDateGt, invoiceDateGte, invoiceDateRange, invoiceIdentification, invoiceIdentificationIn, linkIn, status, statusIn, totalAmount, totalAmountLt, totalAmountLte, totalAmountGt, totalAmountGte, totalAmountRange, type, typeIn, _callback);
        Type localVarReturnType = new TypeToken<InvoicesResponsePaginatedResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListRequestBuilder {
        private Integer page;
        private Integer pageSize;
        private String omit;
        private String fields;
        private UUID link;
        private String createdAtGt;
        private String createdAtGte;
        private String createdAtLt;
        private String createdAtLte;
        private String createdAtRange;
        private String id;
        private String idIn;
        private String invoiceDate;
        private String invoiceDateLt;
        private String invoiceDateLte;
        private String invoiceDateGt;
        private String invoiceDateGte;
        private String invoiceDateRange;
        private String invoiceIdentification;
        private String invoiceIdentificationIn;
        private String linkIn;
        private String status;
        private String statusIn;
        private String totalAmount;
        private String totalAmountLt;
        private String totalAmountLte;
        private String totalAmountGt;
        private String totalAmountGte;
        private String totalAmountRange;
        private String type;
        private String typeIn;

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
         * @param link The &#x60;link.id&#x60; you want to filter by.  ℹ️ We highly recommend adding the &#x60;link.id&#x60; filter in order to improve your performance.  (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder link(UUID link) {
            this.link = link;
            return this;
        }
        
        /**
         * Set createdAtGt
         * @param createdAtGt Return invoices that were last updated in Belvo&#39;s database after this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder createdAtGt(String createdAtGt) {
            this.createdAtGt = createdAtGt;
            return this;
        }
        
        /**
         * Set createdAtGte
         * @param createdAtGte Return invoices that were last updated in Belvo&#39;s database after or on this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder createdAtGte(String createdAtGte) {
            this.createdAtGte = createdAtGte;
            return this;
        }
        
        /**
         * Set createdAtLt
         * @param createdAtLt Return invoices that were last updated in Belvo&#39;s database before this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder createdAtLt(String createdAtLt) {
            this.createdAtLt = createdAtLt;
            return this;
        }
        
        /**
         * Set createdAtLte
         * @param createdAtLte Return invoices that were last updated in Belvo&#39;s database before or on this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder createdAtLte(String createdAtLte) {
            this.createdAtLte = createdAtLte;
            return this;
        }
        
        /**
         * Set createdAtRange
         * @param createdAtRange Return invoices that were last updated in Belvo&#39;s database between two dates (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder createdAtRange(String createdAtRange) {
            this.createdAtRange = createdAtRange;
            return this;
        }
        
        /**
         * Set id
         * @param id Return information only for this &#x60;invoice.id&#x60;. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder id(String id) {
            this.id = id;
            return this;
        }
        
        /**
         * Set idIn
         * @param idIn Return information only for these &#x60;invoice.id&#x60;s. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder idIn(String idIn) {
            this.idIn = idIn;
            return this;
        }
        
        /**
         * Set invoiceDate
         * @param invoiceDate Return invoices issued exactly on this date (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder invoiceDate(String invoiceDate) {
            this.invoiceDate = invoiceDate;
            return this;
        }
        
        /**
         * Set invoiceDateLt
         * @param invoiceDateLt Return balances issued before this date (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder invoiceDateLt(String invoiceDateLt) {
            this.invoiceDateLt = invoiceDateLt;
            return this;
        }
        
        /**
         * Set invoiceDateLte
         * @param invoiceDateLte Return balances issued on this date or earlier (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder invoiceDateLte(String invoiceDateLte) {
            this.invoiceDateLte = invoiceDateLte;
            return this;
        }
        
        /**
         * Set invoiceDateGt
         * @param invoiceDateGt Return invoices issued after this date (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder invoiceDateGt(String invoiceDateGt) {
            this.invoiceDateGt = invoiceDateGt;
            return this;
        }
        
        /**
         * Set invoiceDateGte
         * @param invoiceDateGte Return invoices issued on this date or later (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder invoiceDateGte(String invoiceDateGte) {
            this.invoiceDateGte = invoiceDateGte;
            return this;
        }
        
        /**
         * Set invoiceDateRange
         * @param invoiceDateRange Return invoices issued within this date range (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder invoiceDateRange(String invoiceDateRange) {
            this.invoiceDateRange = invoiceDateRange;
            return this;
        }
        
        /**
         * Set invoiceIdentification
         * @param invoiceIdentification Return an invoice with this ID (as provided by the insitution). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder invoiceIdentification(String invoiceIdentification) {
            this.invoiceIdentification = invoiceIdentification;
            return this;
        }
        
        /**
         * Set invoiceIdentificationIn
         * @param invoiceIdentificationIn Return invoices with these IDs (as provided by the institution). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder invoiceIdentificationIn(String invoiceIdentificationIn) {
            this.invoiceIdentificationIn = invoiceIdentificationIn;
            return this;
        }
        
        /**
         * Set linkIn
         * @param linkIn Return invoices only for these &#x60;link.id&#x60;s. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder linkIn(String linkIn) {
            this.linkIn = linkIn;
            return this;
        }
        
        /**
         * Set status
         * @param status Return invoices with this status. Can be either &#x60;Vigente&#x60; (valid) or &#x60;Cancelado&#x60; (cancelled). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder status(String status) {
            this.status = status;
            return this;
        }
        
        /**
         * Set statusIn
         * @param statusIn Return invoices with these statuses. Can be either &#x60;Vigente&#x60; (valid) or &#x60;Cancelado&#x60; (cancelled). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder statusIn(String statusIn) {
            this.statusIn = statusIn;
            return this;
        }
        
        /**
         * Set totalAmount
         * @param totalAmount Return invoices matching exactly this value. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder totalAmount(String totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }
        
        /**
         * Set totalAmountLt
         * @param totalAmountLt Return invoices less than this value. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder totalAmountLt(String totalAmountLt) {
            this.totalAmountLt = totalAmountLt;
            return this;
        }
        
        /**
         * Set totalAmountLte
         * @param totalAmountLte Return invoices less than or equal to this value. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder totalAmountLte(String totalAmountLte) {
            this.totalAmountLte = totalAmountLte;
            return this;
        }
        
        /**
         * Set totalAmountGt
         * @param totalAmountGt Return invoices greater than this value. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder totalAmountGt(String totalAmountGt) {
            this.totalAmountGt = totalAmountGt;
            return this;
        }
        
        /**
         * Set totalAmountGte
         * @param totalAmountGte Return invoices greater than or equal to this value. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder totalAmountGte(String totalAmountGte) {
            this.totalAmountGte = totalAmountGte;
            return this;
        }
        
        /**
         * Set totalAmountRange
         * @param totalAmountRange Return invoices between these two values. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder totalAmountRange(String totalAmountRange) {
            this.totalAmountRange = totalAmountRange;
            return this;
        }
        
        /**
         * Set type
         * @param type Return invoices of this type. Can be either &#x60;OUTFLOW&#x60; or &#x60;INFLOW&#x60;. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder type(String type) {
            this.type = type;
            return this;
        }
        
        /**
         * Set typeIn
         * @param typeIn Return invoices of these types. Can be either &#x60;OUTFLOW&#x60; or &#x60;INFLOW&#x60;. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder typeIn(String typeIn) {
            this.typeIn = typeIn;
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
            return listCall(page, pageSize, omit, fields, link, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, id, idIn, invoiceDate, invoiceDateLt, invoiceDateLte, invoiceDateGt, invoiceDateGte, invoiceDateRange, invoiceIdentification, invoiceIdentificationIn, linkIn, status, statusIn, totalAmount, totalAmountLt, totalAmountLte, totalAmountGt, totalAmountGte, totalAmountRange, type, typeIn, _callback);
        }


        /**
         * Execute list request
         * @return InvoicesResponsePaginatedResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public InvoicesResponsePaginatedResponse execute() throws ApiException {
            ApiResponse<InvoicesResponsePaginatedResponse> localVarResp = listWithHttpInfo(page, pageSize, omit, fields, link, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, id, idIn, invoiceDate, invoiceDateLt, invoiceDateLte, invoiceDateGt, invoiceDateGte, invoiceDateRange, invoiceIdentification, invoiceIdentificationIn, linkIn, status, statusIn, totalAmount, totalAmountLt, totalAmountLte, totalAmountGt, totalAmountGte, totalAmountRange, type, typeIn);
            return localVarResp.getData();
        }

        /**
         * Execute list request with HTTP info returned
         * @return ApiResponse&lt;InvoicesResponsePaginatedResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<InvoicesResponsePaginatedResponse> executeWithHttpInfo() throws ApiException {
            return listWithHttpInfo(page, pageSize, omit, fields, link, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, id, idIn, invoiceDate, invoiceDateLt, invoiceDateLte, invoiceDateGt, invoiceDateGte, invoiceDateRange, invoiceIdentification, invoiceIdentificationIn, linkIn, status, statusIn, totalAmount, totalAmountLt, totalAmountLte, totalAmountGt, totalAmountGte, totalAmountRange, type, typeIn);
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
        public okhttp3.Call executeAsync(final ApiCallback<InvoicesResponsePaginatedResponse> _callback) throws ApiException {
            return listAsync(page, pageSize, omit, fields, link, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, id, idIn, invoiceDate, invoiceDateLt, invoiceDateLte, invoiceDateGt, invoiceDateGte, invoiceDateRange, invoiceIdentification, invoiceIdentificationIn, linkIn, status, statusIn, totalAmount, totalAmountLt, totalAmountLte, totalAmountGt, totalAmountGte, totalAmountRange, type, typeIn, _callback);
        }
    }

    /**
     * List all invoices
     * Get a paginated list of all existing invoices in your Belvo account. By default, we return 100 results per page.
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
    private okhttp3.Call retrieveCall(InvoicesRequest invoicesRequest, String omit, String fields, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = invoicesRequest;

        // create path and map variables
        String localVarPath = "/api/invoices";

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
    private okhttp3.Call retrieveValidateBeforeCall(InvoicesRequest invoicesRequest, String omit, String fields, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'invoicesRequest' is set
        if (invoicesRequest == null) {
            throw new ApiException("Missing the required parameter 'invoicesRequest' when calling retrieve(Async)");
        }

        return retrieveCall(invoicesRequest, omit, fields, _callback);

    }


    private ApiResponse<List<Object>> retrieveWithHttpInfo(InvoicesRequest invoicesRequest, String omit, String fields) throws ApiException {
        okhttp3.Call localVarCall = retrieveValidateBeforeCall(invoicesRequest, omit, fields, null);
        Type localVarReturnType = new TypeToken<List<Object>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call retrieveAsync(InvoicesRequest invoicesRequest, String omit, String fields, final ApiCallback<List<Object>> _callback) throws ApiException {

        okhttp3.Call localVarCall = retrieveValidateBeforeCall(invoicesRequest, omit, fields, _callback);
        Type localVarReturnType = new TypeToken<List<Object>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class RetrieveRequestBuilder {
        private final UUID link;
        private final String dateFrom;
        private final String dateTo;
        private final EnumInvoiceType type;
        private Boolean attachXml;
        private Boolean saveData;
        private String omit;
        private String fields;

        private RetrieveRequestBuilder(UUID link, String dateFrom, String dateTo, EnumInvoiceType type) {
            this.link = link;
            this.dateFrom = dateFrom;
            this.dateTo = dateTo;
            this.type = type;
        }

        /**
         * Set attachXml
         * @param attachXml When set to &#x60;true&#x60;, you will receive the XML invoice in the response. (optional, default to false)
         * @return RetrieveRequestBuilder
         */
        public RetrieveRequestBuilder attachXml(Boolean attachXml) {
            this.attachXml = attachXml;
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
            InvoicesRequest invoicesRequest = buildBodyParams();
            return retrieveCall(invoicesRequest, omit, fields, _callback);
        }

        private InvoicesRequest buildBodyParams() {
            InvoicesRequest invoicesRequest = new InvoicesRequest();
            invoicesRequest.link(this.link);
            invoicesRequest.dateFrom(this.dateFrom);
            invoicesRequest.dateTo(this.dateTo);
            invoicesRequest.type(this.type);
            invoicesRequest.attachXml(this.attachXml);
            invoicesRequest.saveData(this.saveData);
            return invoicesRequest;
        }

        /**
         * Execute retrieve request
         * @return List&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok (when &#x60;save_data&#x3D;false&#x60;) </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created (when &#x60;save_data&#x3D;true&#x60;) </td><td>  -  </td></tr>
         </table>
         */
        public List<Object> execute() throws ApiException {
            InvoicesRequest invoicesRequest = buildBodyParams();
            ApiResponse<List<Object>> localVarResp = retrieveWithHttpInfo(invoicesRequest, omit, fields);
            return localVarResp.getData();
        }

        /**
         * Execute retrieve request with HTTP info returned
         * @return ApiResponse&lt;List&lt;Object&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok (when &#x60;save_data&#x3D;false&#x60;) </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created (when &#x60;save_data&#x3D;true&#x60;) </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<Object>> executeWithHttpInfo() throws ApiException {
            InvoicesRequest invoicesRequest = buildBodyParams();
            return retrieveWithHttpInfo(invoicesRequest, omit, fields);
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
        public okhttp3.Call executeAsync(final ApiCallback<List<Object>> _callback) throws ApiException {
            InvoicesRequest invoicesRequest = buildBodyParams();
            return retrieveAsync(invoicesRequest, omit, fields, _callback);
        }
    }

    /**
     * Retrieve invoices for a link
     * Retrieve invoice information from a specific fiscal link. &lt;div style&#x3D;\&quot;background-color:#f4f6f8; border-left: 6px solid #0663F9;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\&quot;&gt; &lt;strong&gt;Info: &lt;/strong&gt; You can ask for up to **one** year (365 days) of invoices per request. If you need invoices for more than one year, just make another request. &lt;/div&gt; 
     * @param invoicesRequest  (required)
     * @return RetrieveRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok (when &#x60;save_data&#x3D;false&#x60;) </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created (when &#x60;save_data&#x3D;true&#x60;) </td><td>  -  </td></tr>
     </table>
     */
    public RetrieveRequestBuilder retrieve(UUID link, String dateFrom, String dateTo, EnumInvoiceType type) throws IllegalArgumentException {
        if (link == null) throw new IllegalArgumentException("\"link\" is required but got null");
        if (dateFrom == null) throw new IllegalArgumentException("\"dateFrom\" is required but got null");
        if (dateTo == null) throw new IllegalArgumentException("\"dateTo\" is required but got null");
        
        return new RetrieveRequestBuilder(link, dateFrom, dateTo, type);
    }
}
