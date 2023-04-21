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


import com.belvo.client.model.InvestmentsPortfolio;
import com.belvo.client.model.InvestmentsPortfoliosPaginatedResponse;
import com.belvo.client.model.PatchBodyWithoutSaveData;
import com.belvo.client.model.StandardRequest;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class InvestmentPortfoliosApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public InvestmentPortfoliosApi() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public InvestmentPortfoliosApi(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call completeRequestCall(PatchBodyWithoutSaveData patchBodyWithoutSaveData, String omit, String fields, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = patchBodyWithoutSaveData;

        // create path and map variables
        String localVarPath = "/investments/portfolios";

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
    private okhttp3.Call completeRequestValidateBeforeCall(PatchBodyWithoutSaveData patchBodyWithoutSaveData, String omit, String fields, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'patchBodyWithoutSaveData' is set
        if (patchBodyWithoutSaveData == null) {
            throw new ApiException("Missing the required parameter 'patchBodyWithoutSaveData' when calling completeRequest(Async)");
        }

        return completeRequestCall(patchBodyWithoutSaveData, omit, fields, _callback);

    }


    private ApiResponse<InvestmentsPortfolio> completeRequestWithHttpInfo(PatchBodyWithoutSaveData patchBodyWithoutSaveData, String omit, String fields) throws ApiException {
        okhttp3.Call localVarCall = completeRequestValidateBeforeCall(patchBodyWithoutSaveData, omit, fields, null);
        Type localVarReturnType = new TypeToken<InvestmentsPortfolio>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call completeRequestAsync(PatchBodyWithoutSaveData patchBodyWithoutSaveData, String omit, String fields, final ApiCallback<InvestmentsPortfolio> _callback) throws ApiException {

        okhttp3.Call localVarCall = completeRequestValidateBeforeCall(patchBodyWithoutSaveData, omit, fields, _callback);
        Type localVarReturnType = new TypeToken<InvestmentsPortfolio>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class CompleteRequestRequestBuilder {
        private final String session;
        private final UUID link;
        private String token;
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
            PatchBodyWithoutSaveData patchBodyWithoutSaveData = buildBodyParams();
            return completeRequestCall(patchBodyWithoutSaveData, omit, fields, _callback);
        }

        private PatchBodyWithoutSaveData buildBodyParams() {
            PatchBodyWithoutSaveData patchBodyWithoutSaveData = new PatchBodyWithoutSaveData();
            patchBodyWithoutSaveData.session(this.session);
            patchBodyWithoutSaveData.token(this.token);
            patchBodyWithoutSaveData.link(this.link);
            return patchBodyWithoutSaveData;
        }

        /**
         * Execute completeRequest request
         * @return InvestmentsPortfolio
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok (when &#x60;save_data&#x3D;false&#x60;) </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created (when &#x60;save_data&#x3D;true&#x60;) </td><td>  -  </td></tr>
         </table>
         */
        public InvestmentsPortfolio execute() throws ApiException {
            PatchBodyWithoutSaveData patchBodyWithoutSaveData = buildBodyParams();
            ApiResponse<InvestmentsPortfolio> localVarResp = completeRequestWithHttpInfo(patchBodyWithoutSaveData, omit, fields);
            return localVarResp.getData();
        }

        /**
         * Execute completeRequest request with HTTP info returned
         * @return ApiResponse&lt;InvestmentsPortfolio&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok (when &#x60;save_data&#x3D;false&#x60;) </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created (when &#x60;save_data&#x3D;true&#x60;) </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<InvestmentsPortfolio> executeWithHttpInfo() throws ApiException {
            PatchBodyWithoutSaveData patchBodyWithoutSaveData = buildBodyParams();
            return completeRequestWithHttpInfo(patchBodyWithoutSaveData, omit, fields);
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
        public okhttp3.Call executeAsync(final ApiCallback<InvestmentsPortfolio> _callback) throws ApiException {
            PatchBodyWithoutSaveData patchBodyWithoutSaveData = buildBodyParams();
            return completeRequestAsync(patchBodyWithoutSaveData, omit, fields, _callback);
        }
    }

    /**
     * Complete a portfolios request
     * Used to resume a portfolio retrieve session that was paused because an MFA token was required by the institution.
     * @param patchBodyWithoutSaveData  (required)
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
        String localVarPath = "/investments/portfolios/{id}"
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
     * Delete a portfolio
     * Delete a specific investment portfolio and all associated instruments, transactions, and owners from your Belvo account.
     * @param id The &#x60;portfolio.id&#x60; that you want to delete. (required)
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
        String localVarPath = "/investments/portfolios/{id}"
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


    private ApiResponse<InvestmentsPortfolio> getDetailsWithHttpInfo(UUID id, String omit, String fields) throws ApiException {
        okhttp3.Call localVarCall = getDetailsValidateBeforeCall(id, omit, fields, null);
        Type localVarReturnType = new TypeToken<InvestmentsPortfolio>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getDetailsAsync(UUID id, String omit, String fields, final ApiCallback<InvestmentsPortfolio> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDetailsValidateBeforeCall(id, omit, fields, _callback);
        Type localVarReturnType = new TypeToken<InvestmentsPortfolio>(){}.getType();
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
         * @return InvestmentsPortfolio
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public InvestmentsPortfolio execute() throws ApiException {
            ApiResponse<InvestmentsPortfolio> localVarResp = getDetailsWithHttpInfo(id, omit, fields);
            return localVarResp.getData();
        }

        /**
         * Execute getDetails request with HTTP info returned
         * @return ApiResponse&lt;InvestmentsPortfolio&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<InvestmentsPortfolio> executeWithHttpInfo() throws ApiException {
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
        public okhttp3.Call executeAsync(final ApiCallback<InvestmentsPortfolio> _callback) throws ApiException {
            return getDetailsAsync(id, omit, fields, _callback);
        }
    }

    /**
     * Get a portfolio&#39;s details
     * Get the details of a specific portfolio.
     * @param id The &#x60;portfolio.id&#x60; you want to get detailed information about. (required)
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
    private okhttp3.Call listCall(Integer page, Integer pageSize, String omit, String fields, UUID link, String createdAtGt, String createdAtGte, String createdAtLt, String createdAtLte, String createdAtRange, String linkIn, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/investments/portfolios";

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

        if (linkIn != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("link__in", linkIn));
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
    private okhttp3.Call listValidateBeforeCall(Integer page, Integer pageSize, String omit, String fields, UUID link, String createdAtGt, String createdAtGte, String createdAtLt, String createdAtLte, String createdAtRange, String linkIn, final ApiCallback _callback) throws ApiException {
        return listCall(page, pageSize, omit, fields, link, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, linkIn, _callback);

    }


    private ApiResponse<InvestmentsPortfoliosPaginatedResponse> listWithHttpInfo(Integer page, Integer pageSize, String omit, String fields, UUID link, String createdAtGt, String createdAtGte, String createdAtLt, String createdAtLte, String createdAtRange, String linkIn) throws ApiException {
        okhttp3.Call localVarCall = listValidateBeforeCall(page, pageSize, omit, fields, link, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, linkIn, null);
        Type localVarReturnType = new TypeToken<InvestmentsPortfoliosPaginatedResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listAsync(Integer page, Integer pageSize, String omit, String fields, UUID link, String createdAtGt, String createdAtGte, String createdAtLt, String createdAtLte, String createdAtRange, String linkIn, final ApiCallback<InvestmentsPortfoliosPaginatedResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listValidateBeforeCall(page, pageSize, omit, fields, link, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, linkIn, _callback);
        Type localVarReturnType = new TypeToken<InvestmentsPortfoliosPaginatedResponse>(){}.getType();
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
        private String linkIn;

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
         * @param createdAtGt  (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder createdAtGt(String createdAtGt) {
            this.createdAtGt = createdAtGt;
            return this;
        }
        
        /**
         * Set createdAtGte
         * @param createdAtGte  (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder createdAtGte(String createdAtGte) {
            this.createdAtGte = createdAtGte;
            return this;
        }
        
        /**
         * Set createdAtLt
         * @param createdAtLt  (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder createdAtLt(String createdAtLt) {
            this.createdAtLt = createdAtLt;
            return this;
        }
        
        /**
         * Set createdAtLte
         * @param createdAtLte  (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder createdAtLte(String createdAtLte) {
            this.createdAtLte = createdAtLte;
            return this;
        }
        
        /**
         * Set createdAtRange
         * @param createdAtRange  (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder createdAtRange(String createdAtRange) {
            this.createdAtRange = createdAtRange;
            return this;
        }
        
        /**
         * Set linkIn
         * @param linkIn  (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder linkIn(String linkIn) {
            this.linkIn = linkIn;
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
            return listCall(page, pageSize, omit, fields, link, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, linkIn, _callback);
        }


        /**
         * Execute list request
         * @return InvestmentsPortfoliosPaginatedResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public InvestmentsPortfoliosPaginatedResponse execute() throws ApiException {
            ApiResponse<InvestmentsPortfoliosPaginatedResponse> localVarResp = listWithHttpInfo(page, pageSize, omit, fields, link, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, linkIn);
            return localVarResp.getData();
        }

        /**
         * Execute list request with HTTP info returned
         * @return ApiResponse&lt;InvestmentsPortfoliosPaginatedResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<InvestmentsPortfoliosPaginatedResponse> executeWithHttpInfo() throws ApiException {
            return listWithHttpInfo(page, pageSize, omit, fields, link, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, linkIn);
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
        public okhttp3.Call executeAsync(final ApiCallback<InvestmentsPortfoliosPaginatedResponse> _callback) throws ApiException {
            return listAsync(page, pageSize, omit, fields, link, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, linkIn, _callback);
        }
    }

    /**
     * List all portfolios
     * Get a paginated list of all the existing portfolios (and their instruments) in your Belvo account. By default, we return up to 100 results per page.
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
    private okhttp3.Call retrieveCall(StandardRequest standardRequest, String omit, String fields, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = standardRequest;

        // create path and map variables
        String localVarPath = "/investments/portfolios";

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
    private okhttp3.Call retrieveValidateBeforeCall(StandardRequest standardRequest, String omit, String fields, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'standardRequest' is set
        if (standardRequest == null) {
            throw new ApiException("Missing the required parameter 'standardRequest' when calling retrieve(Async)");
        }

        return retrieveCall(standardRequest, omit, fields, _callback);

    }


    private ApiResponse<InvestmentsPortfolio> retrieveWithHttpInfo(StandardRequest standardRequest, String omit, String fields) throws ApiException {
        okhttp3.Call localVarCall = retrieveValidateBeforeCall(standardRequest, omit, fields, null);
        Type localVarReturnType = new TypeToken<InvestmentsPortfolio>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call retrieveAsync(StandardRequest standardRequest, String omit, String fields, final ApiCallback<InvestmentsPortfolio> _callback) throws ApiException {

        okhttp3.Call localVarCall = retrieveValidateBeforeCall(standardRequest, omit, fields, _callback);
        Type localVarReturnType = new TypeToken<InvestmentsPortfolio>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class RetrieveRequestBuilder {
        private final UUID link;
        private String token;
        private Boolean saveData;
        private String omit;
        private String fields;

        private RetrieveRequestBuilder(UUID link) {
            this.link = link;
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
            StandardRequest standardRequest = buildBodyParams();
            return retrieveCall(standardRequest, omit, fields, _callback);
        }

        private StandardRequest buildBodyParams() {
            StandardRequest standardRequest = new StandardRequest();
            standardRequest.link(this.link);
            standardRequest.token(this.token);
            standardRequest.saveData(this.saveData);
            return standardRequest;
        }

        /**
         * Execute retrieve request
         * @return InvestmentsPortfolio
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok (when &#x60;save_data&#x3D;false&#x60;) </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created (when &#x60;save_data&#x3D;true&#x60;) </td><td>  -  </td></tr>
         </table>
         */
        public InvestmentsPortfolio execute() throws ApiException {
            StandardRequest standardRequest = buildBodyParams();
            ApiResponse<InvestmentsPortfolio> localVarResp = retrieveWithHttpInfo(standardRequest, omit, fields);
            return localVarResp.getData();
        }

        /**
         * Execute retrieve request with HTTP info returned
         * @return ApiResponse&lt;InvestmentsPortfolio&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok (when &#x60;save_data&#x3D;false&#x60;) </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created (when &#x60;save_data&#x3D;true&#x60;) </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<InvestmentsPortfolio> executeWithHttpInfo() throws ApiException {
            StandardRequest standardRequest = buildBodyParams();
            return retrieveWithHttpInfo(standardRequest, omit, fields);
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
        public okhttp3.Call executeAsync(final ApiCallback<InvestmentsPortfolio> _callback) throws ApiException {
            StandardRequest standardRequest = buildBodyParams();
            return retrieveAsync(standardRequest, omit, fields, _callback);
        }
    }

    /**
     * Retrieve portfolios for a link
     * Retrieve all portfolios for an existing link.
     * @param standardRequest  (required)
     * @return RetrieveRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok (when &#x60;save_data&#x3D;false&#x60;) </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created (when &#x60;save_data&#x3D;true&#x60;) </td><td>  -  </td></tr>
     </table>
     */
    public RetrieveRequestBuilder retrieve(UUID link) throws IllegalArgumentException {
        if (link == null) throw new IllegalArgumentException("\"link\" is required but got null");
        return new RetrieveRequestBuilder(link);
    }
}
