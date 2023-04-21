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


import com.belvo.client.model.ChangeAccessMode;
import com.belvo.client.model.EnumLinkAccessModeRequest;
import com.belvo.client.model.Link;
import com.belvo.client.model.LinksPutRequest;
import com.belvo.client.model.LinksRequest;
import com.belvo.client.model.PaginatedResponseLink;
import com.belvo.client.model.PatchBodyWithoutSaveData;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class LinksApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public LinksApi() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public LinksApi(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call changeAccessModeCall(UUID id, ChangeAccessMode changeAccessMode, String omit, String fields, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = changeAccessMode;

        // create path and map variables
        String localVarPath = "/api/links/{id}"
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
    private okhttp3.Call changeAccessModeValidateBeforeCall(UUID id, ChangeAccessMode changeAccessMode, String omit, String fields, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling changeAccessMode(Async)");
        }

        // verify the required parameter 'changeAccessMode' is set
        if (changeAccessMode == null) {
            throw new ApiException("Missing the required parameter 'changeAccessMode' when calling changeAccessMode(Async)");
        }

        return changeAccessModeCall(id, changeAccessMode, omit, fields, _callback);

    }


    private ApiResponse<Link> changeAccessModeWithHttpInfo(UUID id, ChangeAccessMode changeAccessMode, String omit, String fields) throws ApiException {
        okhttp3.Call localVarCall = changeAccessModeValidateBeforeCall(id, changeAccessMode, omit, fields, null);
        Type localVarReturnType = new TypeToken<Link>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call changeAccessModeAsync(UUID id, ChangeAccessMode changeAccessMode, String omit, String fields, final ApiCallback<Link> _callback) throws ApiException {

        okhttp3.Call localVarCall = changeAccessModeValidateBeforeCall(id, changeAccessMode, omit, fields, _callback);
        Type localVarReturnType = new TypeToken<Link>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ChangeAccessModeRequestBuilder {
        private final EnumLinkAccessModeRequest accessMode;
        private final UUID id;
        private String omit;
        private String fields;

        private ChangeAccessModeRequestBuilder(EnumLinkAccessModeRequest accessMode, UUID id) {
            this.accessMode = accessMode;
            this.id = id;
        }

        /**
         * Set omit
         * @param omit Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. (optional)
         * @return ChangeAccessModeRequestBuilder
         */
        public ChangeAccessModeRequestBuilder omit(String omit) {
            this.omit = omit;
            return this;
        }
        
        /**
         * Set fields
         * @param fields Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. (optional)
         * @return ChangeAccessModeRequestBuilder
         */
        public ChangeAccessModeRequestBuilder fields(String fields) {
            this.fields = fields;
            return this;
        }
        
        /**
         * Build call for changeAccessMode
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
            ChangeAccessMode changeAccessMode = buildBodyParams();
            return changeAccessModeCall(id, changeAccessMode, omit, fields, _callback);
        }

        private ChangeAccessMode buildBodyParams() {
            ChangeAccessMode changeAccessMode = new ChangeAccessMode();
            changeAccessMode.accessMode(this.accessMode);
            return changeAccessMode;
        }

        /**
         * Execute changeAccessMode request
         * @return Link
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public Link execute() throws ApiException {
            ChangeAccessMode changeAccessMode = buildBodyParams();
            ApiResponse<Link> localVarResp = changeAccessModeWithHttpInfo(id, changeAccessMode, omit, fields);
            return localVarResp.getData();
        }

        /**
         * Execute changeAccessMode request with HTTP info returned
         * @return ApiResponse&lt;Link&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Link> executeWithHttpInfo() throws ApiException {
            ChangeAccessMode changeAccessMode = buildBodyParams();
            return changeAccessModeWithHttpInfo(id, changeAccessMode, omit, fields);
        }

        /**
         * Execute changeAccessMode request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Link> _callback) throws ApiException {
            ChangeAccessMode changeAccessMode = buildBodyParams();
            return changeAccessModeAsync(id, changeAccessMode, omit, fields, _callback);
        }
    }

    /**
     * Change a link&#39;s access mode
     * Change a link&#39;s access mode from &#x60;single&#x60; to &#x60;recurrent&#x60; or from &#x60;recurrent&#x60; to single. ℹ️ **Note**: When you change a link from &#x60;single&#x60;&#x60; to &#x60;recurrent&#x60;, they will only be updated the next day at the scheduled interval.
     * @param id The &#x60;link.id&#x60; you want to change the &#x60;access_mode&#x60; for. (required)
     * @param changeAccessMode  (required)
     * @return ChangeAccessModeRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public ChangeAccessModeRequestBuilder changeAccessMode(EnumLinkAccessModeRequest accessMode, UUID id) throws IllegalArgumentException {
        if (accessMode == null) throw new IllegalArgumentException("\"accessMode\" is required but got null");
        if (id == null) throw new IllegalArgumentException("\"id\" is required but got null");
        return new ChangeAccessModeRequestBuilder(accessMode, id);
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
        String localVarPath = "/api/links";

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


    private ApiResponse<Link> completeRequestWithHttpInfo(PatchBodyWithoutSaveData patchBodyWithoutSaveData, String omit, String fields) throws ApiException {
        okhttp3.Call localVarCall = completeRequestValidateBeforeCall(patchBodyWithoutSaveData, omit, fields, null);
        Type localVarReturnType = new TypeToken<Link>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call completeRequestAsync(PatchBodyWithoutSaveData patchBodyWithoutSaveData, String omit, String fields, final ApiCallback<Link> _callback) throws ApiException {

        okhttp3.Call localVarCall = completeRequestValidateBeforeCall(patchBodyWithoutSaveData, omit, fields, _callback);
        Type localVarReturnType = new TypeToken<Link>(){}.getType();
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
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
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
         * @return Link
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public Link execute() throws ApiException {
            PatchBodyWithoutSaveData patchBodyWithoutSaveData = buildBodyParams();
            ApiResponse<Link> localVarResp = completeRequestWithHttpInfo(patchBodyWithoutSaveData, omit, fields);
            return localVarResp.getData();
        }

        /**
         * Execute completeRequest request with HTTP info returned
         * @return ApiResponse&lt;Link&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Link> executeWithHttpInfo() throws ApiException {
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
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Link> _callback) throws ApiException {
            PatchBodyWithoutSaveData patchBodyWithoutSaveData = buildBodyParams();
            return completeRequestAsync(patchBodyWithoutSaveData, omit, fields, _callback);
        }
    }

    /**
     * Complete a links request
     * Used to resume a Link register session that was paused because an MFA token was required by the institution.
     * @param patchBodyWithoutSaveData  (required)
     * @return CompleteRequestRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public CompleteRequestRequestBuilder completeRequest(String session, UUID link) throws IllegalArgumentException {
        if (session == null) throw new IllegalArgumentException("\"session\" is required but got null");
        if (link == null) throw new IllegalArgumentException("\"link\" is required but got null");
        return new CompleteRequestRequestBuilder(session, link);
    }
    private okhttp3.Call destroyCall(UUID id, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/links/{id}"
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
    private okhttp3.Call destroyValidateBeforeCall(UUID id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling destroy(Async)");
        }

        return destroyCall(id, _callback);

    }


    private ApiResponse<Void> destroyWithHttpInfo(UUID id) throws ApiException {
        okhttp3.Call localVarCall = destroyValidateBeforeCall(id, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call destroyAsync(UUID id, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = destroyValidateBeforeCall(id, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class DestroyRequestBuilder {
        private final UUID id;

        private DestroyRequestBuilder(UUID id) {
            this.id = id;
        }

        /**
         * Build call for destroy
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
            return destroyCall(id, _callback);
        }


        /**
         * Execute destroy request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            destroyWithHttpInfo(id);
        }

        /**
         * Execute destroy request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return destroyWithHttpInfo(id);
        }

        /**
         * Execute destroy request (asynchronously)
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
            return destroyAsync(id, _callback);
        }
    }

    /**
     * Delete a link
     * Delete a specific link and all associated accounts, transactions, and owners from your Belvo account. # Deleting links in batches To delete links in bulk, we recommend looping through the list of links you want to delete and making the delete request.    &gt; 🚧 **Rate limiting and IP blocking**   &gt;    &gt; An important technical note for performing operations in batches is to take into consideration our rate-limiting: up to 80 requests every 30 seconds. If you exceed this limit, you run the risk of Belvo blocking your IP from making further requests.   &gt;    &gt; For more information, or if your IP address has been blocked, please contact our [support team](https://support.belvo.com/hc/en-us/requests/new).
     * @param id The &#x60;link.id&#x60; that you want to delete. (required)
     * @return DestroyRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
     </table>
     */
    public DestroyRequestBuilder destroy(UUID id) throws IllegalArgumentException {
        if (id == null) throw new IllegalArgumentException("\"id\" is required but got null");
        return new DestroyRequestBuilder(id);
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
        String localVarPath = "/api/links/{id}"
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


    private ApiResponse<Link> getDetailsWithHttpInfo(UUID id, String omit, String fields) throws ApiException {
        okhttp3.Call localVarCall = getDetailsValidateBeforeCall(id, omit, fields, null);
        Type localVarReturnType = new TypeToken<Link>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getDetailsAsync(UUID id, String omit, String fields, final ApiCallback<Link> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDetailsValidateBeforeCall(id, omit, fields, _callback);
        Type localVarReturnType = new TypeToken<Link>(){}.getType();
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
         * @return Link
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public Link execute() throws ApiException {
            ApiResponse<Link> localVarResp = getDetailsWithHttpInfo(id, omit, fields);
            return localVarResp.getData();
        }

        /**
         * Execute getDetails request with HTTP info returned
         * @return ApiResponse&lt;Link&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Link> executeWithHttpInfo() throws ApiException {
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
        public okhttp3.Call executeAsync(final ApiCallback<Link> _callback) throws ApiException {
            return getDetailsAsync(id, omit, fields, _callback);
        }
    }

    /**
     * Get a link&#39;s details
     * Get the details of a specific link.
     * @param id The &#x60;link.id&#x60; you want to get detailed information about. (required)
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
    private okhttp3.Call listCall(Integer page, Integer pageSize, String omit, String fields, String accessMode, String createdAt, String createdAtGt, String createdAtGte, String createdAtLt, String createdAtLte, String createdAtRange, String createdByNotIn, String externalId, String externalIdIn, String id, String idIn, String institution, String institutionIn, String institutionUserId, String institutionUserIdIn, String refreshRate, String status, String statusIn, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/links";

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

        if (accessMode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("access_mode", accessMode));
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

        if (createdByNotIn != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("created_by__not_in", createdByNotIn));
        }

        if (externalId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("external_id", externalId));
        }

        if (externalIdIn != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("external_id__in", externalIdIn));
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

        if (institutionUserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("institution_user_id", institutionUserId));
        }

        if (institutionUserIdIn != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("institution_user_id__in", institutionUserIdIn));
        }

        if (refreshRate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("refresh_rate", refreshRate));
        }

        if (status != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("status", status));
        }

        if (statusIn != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("status__in", statusIn));
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
    private okhttp3.Call listValidateBeforeCall(Integer page, Integer pageSize, String omit, String fields, String accessMode, String createdAt, String createdAtGt, String createdAtGte, String createdAtLt, String createdAtLte, String createdAtRange, String createdByNotIn, String externalId, String externalIdIn, String id, String idIn, String institution, String institutionIn, String institutionUserId, String institutionUserIdIn, String refreshRate, String status, String statusIn, final ApiCallback _callback) throws ApiException {
        return listCall(page, pageSize, omit, fields, accessMode, createdAt, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, createdByNotIn, externalId, externalIdIn, id, idIn, institution, institutionIn, institutionUserId, institutionUserIdIn, refreshRate, status, statusIn, _callback);

    }


    private ApiResponse<PaginatedResponseLink> listWithHttpInfo(Integer page, Integer pageSize, String omit, String fields, String accessMode, String createdAt, String createdAtGt, String createdAtGte, String createdAtLt, String createdAtLte, String createdAtRange, String createdByNotIn, String externalId, String externalIdIn, String id, String idIn, String institution, String institutionIn, String institutionUserId, String institutionUserIdIn, String refreshRate, String status, String statusIn) throws ApiException {
        okhttp3.Call localVarCall = listValidateBeforeCall(page, pageSize, omit, fields, accessMode, createdAt, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, createdByNotIn, externalId, externalIdIn, id, idIn, institution, institutionIn, institutionUserId, institutionUserIdIn, refreshRate, status, statusIn, null);
        Type localVarReturnType = new TypeToken<PaginatedResponseLink>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listAsync(Integer page, Integer pageSize, String omit, String fields, String accessMode, String createdAt, String createdAtGt, String createdAtGte, String createdAtLt, String createdAtLte, String createdAtRange, String createdByNotIn, String externalId, String externalIdIn, String id, String idIn, String institution, String institutionIn, String institutionUserId, String institutionUserIdIn, String refreshRate, String status, String statusIn, final ApiCallback<PaginatedResponseLink> _callback) throws ApiException {

        okhttp3.Call localVarCall = listValidateBeforeCall(page, pageSize, omit, fields, accessMode, createdAt, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, createdByNotIn, externalId, externalIdIn, id, idIn, institution, institutionIn, institutionUserId, institutionUserIdIn, refreshRate, status, statusIn, _callback);
        Type localVarReturnType = new TypeToken<PaginatedResponseLink>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListRequestBuilder {
        private Integer page;
        private Integer pageSize;
        private String omit;
        private String fields;
        private String accessMode;
        private String createdAt;
        private String createdAtGt;
        private String createdAtGte;
        private String createdAtLt;
        private String createdAtLte;
        private String createdAtRange;
        private String createdByNotIn;
        private String externalId;
        private String externalIdIn;
        private String id;
        private String idIn;
        private String institution;
        private String institutionIn;
        private String institutionUserId;
        private String institutionUserIdIn;
        private String refreshRate;
        private String status;
        private String statusIn;

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
         * Set accessMode
         * @param accessMode Return links only with this access mode. Can be either &#x60;single&#x60; or &#x60;recurrent&#x60;. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder accessMode(String accessMode) {
            this.accessMode = accessMode;
            return this;
        }
        
        /**
         * Set createdAt
         * @param createdAt Return links that were last updated in Belvo&#39;s database on this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        
        /**
         * Set createdAtGt
         * @param createdAtGt Return links that were last updated in Belvo&#39;s database after this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder createdAtGt(String createdAtGt) {
            this.createdAtGt = createdAtGt;
            return this;
        }
        
        /**
         * Set createdAtGte
         * @param createdAtGte Return links that were last updated in Belvo&#39;s database after or on this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder createdAtGte(String createdAtGte) {
            this.createdAtGte = createdAtGte;
            return this;
        }
        
        /**
         * Set createdAtLt
         * @param createdAtLt Return links that were last updated in Belvo&#39;s database before this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder createdAtLt(String createdAtLt) {
            this.createdAtLt = createdAtLt;
            return this;
        }
        
        /**
         * Set createdAtLte
         * @param createdAtLte Return links that were last updated in Belvo&#39;s database before or on this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder createdAtLte(String createdAtLte) {
            this.createdAtLte = createdAtLte;
            return this;
        }
        
        /**
         * Set createdAtRange
         * @param createdAtRange Return links that were last updated in Belvo&#39;s database between two dates (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder createdAtRange(String createdAtRange) {
            this.createdAtRange = createdAtRange;
            return this;
        }
        
        /**
         * Set createdByNotIn
         * @param createdByNotIn Return links that were not created by these Belvo users. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder createdByNotIn(String createdByNotIn) {
            this.createdByNotIn = createdByNotIn;
            return this;
        }
        
        /**
         * Set externalId
         * @param externalId Return links with this external ID. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder externalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        
        /**
         * Set externalIdIn
         * @param externalIdIn Return links with these external IDs. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder externalIdIn(String externalIdIn) {
            this.externalIdIn = externalIdIn;
            return this;
        }
        
        /**
         * Set id
         * @param id Return information only for this &#x60;link.id&#x60;. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder id(String id) {
            this.id = id;
            return this;
        }
        
        /**
         * Set idIn
         * @param idIn Return information only for these &#x60;link.id&#x60;s. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder idIn(String idIn) {
            this.idIn = idIn;
            return this;
        }
        
        /**
         * Set institution
         * @param institution Return links created for this institution (use the Belvo-designated name, such as &#x60;erebor_mx_retail&#x60;). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder institution(String institution) {
            this.institution = institution;
            return this;
        }
        
        /**
         * Set institutionIn
         * @param institutionIn Return links created for these institutions (use the Belvo-designated name, such as &#x60;erebor_mx_retail&#x60; and &#x60;gringotts_co_retail&#x60;). (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder institutionIn(String institutionIn) {
            this.institutionIn = institutionIn;
            return this;
        }
        
        /**
         * Set institutionUserId
         * @param institutionUserId Return links with this specific institution user ID. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder institutionUserId(String institutionUserId) {
            this.institutionUserId = institutionUserId;
            return this;
        }
        
        /**
         * Set institutionUserIdIn
         * @param institutionUserIdIn Return links with these institution user IDs. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder institutionUserIdIn(String institutionUserIdIn) {
            this.institutionUserIdIn = institutionUserIdIn;
            return this;
        }
        
        /**
         * Set refreshRate
         * @param refreshRate Return links with this refresh rate. Choose between &#x60;6h&#x60;, &#x60;12h&#x60;, &#x60;24h&#x60;, &#x60;7d&#x60;, or &#x60;30d&#x60;. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder refreshRate(String refreshRate) {
            this.refreshRate = refreshRate;
            return this;
        }
        
        /**
         * Set status
         * @param status Return links with this status. Choose between &#x60;valid&#x60;, &#x60;invalid&#x60;, &#x60;unconfirmed&#x60;, or &#x60;token_required&#x60;. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder status(String status) {
            this.status = status;
            return this;
        }
        
        /**
         * Set statusIn
         * @param statusIn Return links with these statuses. Choose between &#x60;valid&#x60;, &#x60;invalid&#x60;, &#x60;unconfirmed&#x60;, or &#x60;token_required&#x60;. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder statusIn(String statusIn) {
            this.statusIn = statusIn;
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
            return listCall(page, pageSize, omit, fields, accessMode, createdAt, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, createdByNotIn, externalId, externalIdIn, id, idIn, institution, institutionIn, institutionUserId, institutionUserIdIn, refreshRate, status, statusIn, _callback);
        }


        /**
         * Execute list request
         * @return PaginatedResponseLink
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public PaginatedResponseLink execute() throws ApiException {
            ApiResponse<PaginatedResponseLink> localVarResp = listWithHttpInfo(page, pageSize, omit, fields, accessMode, createdAt, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, createdByNotIn, externalId, externalIdIn, id, idIn, institution, institutionIn, institutionUserId, institutionUserIdIn, refreshRate, status, statusIn);
            return localVarResp.getData();
        }

        /**
         * Execute list request with HTTP info returned
         * @return ApiResponse&lt;PaginatedResponseLink&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<PaginatedResponseLink> executeWithHttpInfo() throws ApiException {
            return listWithHttpInfo(page, pageSize, omit, fields, accessMode, createdAt, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, createdByNotIn, externalId, externalIdIn, id, idIn, institution, institutionIn, institutionUserId, institutionUserIdIn, refreshRate, status, statusIn);
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
        public okhttp3.Call executeAsync(final ApiCallback<PaginatedResponseLink> _callback) throws ApiException {
            return listAsync(page, pageSize, omit, fields, accessMode, createdAt, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, createdByNotIn, externalId, externalIdIn, id, idIn, institution, institutionIn, institutionUserId, institutionUserIdIn, refreshRate, status, statusIn, _callback);
        }
    }

    /**
     * List all links
     * Get a paginated list of all the existing links in your Belvo account. By default, we return up to 100 results per page.
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
    private okhttp3.Call registerCall(LinksRequest linksRequest, String omit, String fields, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = linksRequest;

        // create path and map variables
        String localVarPath = "/api/links";

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
    private okhttp3.Call registerValidateBeforeCall(LinksRequest linksRequest, String omit, String fields, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'linksRequest' is set
        if (linksRequest == null) {
            throw new ApiException("Missing the required parameter 'linksRequest' when calling register(Async)");
        }

        return registerCall(linksRequest, omit, fields, _callback);

    }


    private ApiResponse<Link> registerWithHttpInfo(LinksRequest linksRequest, String omit, String fields) throws ApiException {
        okhttp3.Call localVarCall = registerValidateBeforeCall(linksRequest, omit, fields, null);
        Type localVarReturnType = new TypeToken<Link>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call registerAsync(LinksRequest linksRequest, String omit, String fields, final ApiCallback<Link> _callback) throws ApiException {

        okhttp3.Call localVarCall = registerValidateBeforeCall(linksRequest, omit, fields, _callback);
        Type localVarReturnType = new TypeToken<Link>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class RegisterRequestBuilder {
        private final String institution;
        private final String username;
        private String password;
        private String externalId;
        private String username2;
        private String username3;
        private String password2;
        private String token;
        private EnumLinkAccessModeRequest accessMode;
        private Boolean fetchHistorical;
        private String credentialsStorage;
        private String usernameType;
        private String certificate;
        private String privateKey;
        private String omit;
        private String fields;

        private RegisterRequestBuilder(String institution, String username) {
            this.institution = institution;
            this.username = username;
        }

        /**
         * Set password
         * @param password The end-user&#39;s password used to log in to the institution.  ℹ️ **Note**: You must send through a password for all institutions except for IMSS (&#x60;imss_mx_employment&#x60;).  (optional)
         * @return RegisterRequestBuilder
         */
        public RegisterRequestBuilder password(String password) {
            this.password = password;
            return this;
        }
        
        /**
         * Set externalId
         * @param externalId An additional identifier for the link, provided by you, to store in the Belvo database. **Cannot** include any Personal Identifiable Information (PII). **Must** be at least three characters long.  If we identify that the identifier contains PII, we will force a &#x60;null&#x60; value. For more information, see our [Link creation article](https://developers.belvo.com/docs/link-creation-best-practices#adding-your-own-identifier). (optional)
         * @return RegisterRequestBuilder
         */
        public RegisterRequestBuilder externalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        
        /**
         * Set username2
         * @param username2 The end-user&#39;s second username (or email address) used to log in to the institution.  ℹ️ This is only required by some institutions. To know which institutions require a second username, get the [details](https://developers.belvo.com/reference/detailinstitution) for the institution and check the &#x60;form_fields&#x60; array in the response.  (optional)
         * @return RegisterRequestBuilder
         */
        public RegisterRequestBuilder username2(String username2) {
            this.username2 = username2;
            return this;
        }
        
        /**
         * Set username3
         * @param username3 The end-user&#39;s third username used to log in to the institution.  ℹ️ This is only required by some institutions. To know which institutions require a third username, get the [details](https://developers.belvo.com/reference/detailinstitution) for the institution and check the &#x60;form_fields&#x60; array in the response.  (optional)
         * @return RegisterRequestBuilder
         */
        public RegisterRequestBuilder username3(String username3) {
            this.username3 = username3;
            return this;
        }
        
        /**
         * Set password2
         * @param password2 The end-user&#39;s second password used to log in to the institution.  ℹ️ This is only required by some institutions. To know which institutions require a second password, get the [details](https://developers.belvo.com/reference/detailinstitution) for the institution and check the &#x60;form_fields&#x60; array in the response.  (optional)
         * @return RegisterRequestBuilder
         */
        public RegisterRequestBuilder password2(String password2) {
            this.password2 = password2;
            return this;
        }
        
        /**
         * Set token
         * @param token The MFA token required by the bank to log in.  We do not recommend sending the authentication token in the same request as registering the user. See our [Handling multi-factor authentication](https://developers.belvo.com/docs/handling-2-factor-authentication) article for more information and best practices.  (optional)
         * @return RegisterRequestBuilder
         */
        public RegisterRequestBuilder token(String token) {
            this.token = token;
            return this;
        }
        
        /**
         * Set accessMode
         * @param accessMode  (optional, default to recurrent)
         * @return RegisterRequestBuilder
         */
        public RegisterRequestBuilder accessMode(EnumLinkAccessModeRequest accessMode) {
            this.accessMode = accessMode;
            return this;
        }
        
        /**
         * Set fetchHistorical
         * @param fetchHistorical Indicates whether or not to retrieve historical information for the link or not. For links where &#x60;access_mode&#x3D;single&#x60;, the default is &#x60;false&#x60;. For links where &#x60;access_mode&#x3D;recurrent&#x60; this is hardcoded to &#x60;true&#x60;.  (optional)
         * @return RegisterRequestBuilder
         */
        public RegisterRequestBuilder fetchHistorical(Boolean fetchHistorical) {
            this.fetchHistorical = fetchHistorical;
            return this;
        }
        
        /**
         * Set credentialsStorage
         * @param credentialsStorage Indicates whether or not to store credentials (and the duration for which to store the credentials). By default, this is set to &#x60;store&#x60;. For links where &#x60;access_mode&#x3D;recurrent&#x60;, this must be set to &#x60;store&#x60;.  Choose either:   - &#x60;store&#x60; to store credentials   - &#x60;nostore&#x60; to not store credentials   - &#x60;30d&#x60; to store credentials only for 30 days  (optional)
         * @return RegisterRequestBuilder
         */
        public RegisterRequestBuilder credentialsStorage(String credentialsStorage) {
            this.credentialsStorage = credentialsStorage;
            return this;
        }
        
        /**
         * Set usernameType
         * @param usernameType Type of document to be used as a username.  Some banking institutions accept different documents to be used as the &#x60;username&#x60; to login. For example, the *Cédula de Ciudadanía*, *Cédula de Extranjería*, *Pasaporte&#39;*, and so on.  For banks that require a document to log in, you **must** provide the &#x60;username_type&#x60; parameter to specify which document is used when creating the link.  ℹ️ To know which institutions require the &#x60;username_type&#x60; parameter, get the [details](https://developers.belvo.com/reference/detailinstitution) for the institution and check the &#x60;form_fields&#x60; array in the response.  For a list of standards codes, see the table below.  | Code | Description | |-----------|-------| | &#x60;001&#x60; | Cédula de Ciudadanía | | &#x60;002&#x60; | Cédula de Extranjería | | &#x60;003&#x60; | Pasaporte | | &#x60;004&#x60; | Tarjeta de Identidad | | &#x60;005&#x60; | Registro Civil | | &#x60;006&#x60; | Número Identificación Personal | | &#x60;020&#x60; | NIT | | &#x60;021&#x60; | NIT Persona Natural | | &#x60;022&#x60; | NIT Persona Extranjera | | &#x60;023&#x60; | NIT Persona Jurídica | | &#x60;024&#x60; | NIT Menores | | &#x60;025&#x60; | NIT Desasociado | | &#x60;030&#x60; | Trj. Seguro Social Extranjero | | &#x60;031&#x60; | Sociedad Extranjera sin NIT en Colombia | | &#x60;032&#x60; | Fideicomiso | | &#x60;033&#x60; | RIF Venezuela | | &#x60;034&#x60; | CIF | | &#x60;035&#x60; | Número de Identidad | | &#x60;036&#x60; | RTN | | &#x60;037&#x60; | Cédula de Identidad | | &#x60;038&#x60; | DIMEX | | &#x60;039&#x60; | CED | | &#x60;040&#x60; | PAS | | &#x60;041&#x60; | Documento Único de Identidad | | &#x60;042&#x60; | NIT Salvadoreño | | &#x60;100&#x60; | Agência e conta | | &#x60;101&#x60; | Código do operador | | &#x60;102&#x60; | Cartão de crédito | | &#x60;103&#x60; | CPF |  (optional)
         * @return RegisterRequestBuilder
         */
        public RegisterRequestBuilder usernameType(String usernameType) {
            this.usernameType = usernameType;
            return this;
        }
        
        /**
         * Set certificate
         * @param certificate For certain fiscal institutions, it is possible to log in using a certificate and a private key, which enables a faster connection to the institution.  Belvo supports a base64 encoded &#x60;certificate&#x60;. If the &#x60;certificate&#x60; parameter is used, you *must* also provide the &#x60;private_key&#x60; parameter.  (optional)
         * @return RegisterRequestBuilder
         */
        public RegisterRequestBuilder certificate(String certificate) {
            this.certificate = certificate;
            return this;
        }
        
        /**
         * Set privateKey
         * @param privateKey For certain fiscal institutions, it is possible to log in using a certificate and a private key, which enables a faster connection to the institution.  Belvo supports a base64 encoded &#x60;private_key&#x60;. If the &#x60;private_key&#x60; parameter is used, you *must* also provide the &#x60;certificate&#x60; parameter.  (optional)
         * @return RegisterRequestBuilder
         */
        public RegisterRequestBuilder privateKey(String privateKey) {
            this.privateKey = privateKey;
            return this;
        }
        
        /**
         * Set omit
         * @param omit Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. (optional)
         * @return RegisterRequestBuilder
         */
        public RegisterRequestBuilder omit(String omit) {
            this.omit = omit;
            return this;
        }
        
        /**
         * Set fields
         * @param fields Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. (optional)
         * @return RegisterRequestBuilder
         */
        public RegisterRequestBuilder fields(String fields) {
            this.fields = fields;
            return this;
        }
        
        /**
         * Build call for register
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            LinksRequest linksRequest = buildBodyParams();
            return registerCall(linksRequest, omit, fields, _callback);
        }

        private LinksRequest buildBodyParams() {
            LinksRequest linksRequest = new LinksRequest();
            linksRequest.institution(this.institution);
            linksRequest.username(this.username);
            linksRequest.password(this.password);
            linksRequest.externalId(this.externalId);
            linksRequest.username2(this.username2);
            linksRequest.username3(this.username3);
            linksRequest.password2(this.password2);
            linksRequest.token(this.token);
            linksRequest.accessMode(this.accessMode);
            linksRequest.fetchHistorical(this.fetchHistorical);
            linksRequest.credentialsStorage(this.credentialsStorage);
            linksRequest.usernameType(this.usernameType);
            linksRequest.certificate(this.certificate);
            linksRequest.privateKey(this.privateKey);
            return linksRequest;
        }

        /**
         * Execute register request
         * @return Link
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
         </table>
         */
        public Link execute() throws ApiException {
            LinksRequest linksRequest = buildBodyParams();
            ApiResponse<Link> localVarResp = registerWithHttpInfo(linksRequest, omit, fields);
            return localVarResp.getData();
        }

        /**
         * Execute register request with HTTP info returned
         * @return ApiResponse&lt;Link&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Link> executeWithHttpInfo() throws ApiException {
            LinksRequest linksRequest = buildBodyParams();
            return registerWithHttpInfo(linksRequest, omit, fields);
        }

        /**
         * Execute register request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Link> _callback) throws ApiException {
            LinksRequest linksRequest = buildBodyParams();
            return registerAsync(linksRequest, omit, fields, _callback);
        }
    }

    /**
     * Register a new link
     * Register a new link with your Belvo account.  &lt;div style&#x3D;\&quot;background-color:#f4f6f8; border-left: 6px solid #4CAF50;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\&quot;&gt; &lt;strong&gt;Note: &lt;/strong&gt; We recommend using our &lt;a href&#x3D;\&quot;https://developers.belvo.com/docs/connect-widget\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Connect Widget&lt;/a&gt; to handle link creation and link status updates. &lt;/div&gt; 
     * @param linksRequest  (required)
     * @return RegisterRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public RegisterRequestBuilder register(String institution, String username) throws IllegalArgumentException {
        if (institution == null) throw new IllegalArgumentException("\"institution\" is required but got null");
        if (username == null) throw new IllegalArgumentException("\"username\" is required but got null");
        return new RegisterRequestBuilder(institution, username);
    }
    private okhttp3.Call updateCall(UUID id, LinksPutRequest linksPutRequest, String omit, String fields, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = linksPutRequest;

        // create path and map variables
        String localVarPath = "/api/links/{id}"
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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateValidateBeforeCall(UUID id, LinksPutRequest linksPutRequest, String omit, String fields, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling update(Async)");
        }

        // verify the required parameter 'linksPutRequest' is set
        if (linksPutRequest == null) {
            throw new ApiException("Missing the required parameter 'linksPutRequest' when calling update(Async)");
        }

        return updateCall(id, linksPutRequest, omit, fields, _callback);

    }


    private ApiResponse<Link> updateWithHttpInfo(UUID id, LinksPutRequest linksPutRequest, String omit, String fields) throws ApiException {
        okhttp3.Call localVarCall = updateValidateBeforeCall(id, linksPutRequest, omit, fields, null);
        Type localVarReturnType = new TypeToken<Link>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call updateAsync(UUID id, LinksPutRequest linksPutRequest, String omit, String fields, final ApiCallback<Link> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateValidateBeforeCall(id, linksPutRequest, omit, fields, _callback);
        Type localVarReturnType = new TypeToken<Link>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class UpdateRequestBuilder {
        private final String password;
        private final UUID id;
        private String password2;
        private String token;
        private String usernameType;
        private String certificate;
        private String privateKey;
        private String omit;
        private String fields;

        private UpdateRequestBuilder(String password, UUID id) {
            this.password = password;
            this.id = id;
        }

        /**
         * Set password2
         * @param password2 The end-user&#39;s second password used to log in to the institution.  ℹ️ This is only required by some institutions. To know which institutions require a second password, get the [details](https://developers.belvo.com/reference/detailinstitution) for the institution and check the &#x60;form_fields&#x60; array in the response.  (optional)
         * @return UpdateRequestBuilder
         */
        public UpdateRequestBuilder password2(String password2) {
            this.password2 = password2;
            return this;
        }
        
        /**
         * Set token
         * @param token The MFA token required by the bank to log in.  (optional)
         * @return UpdateRequestBuilder
         */
        public UpdateRequestBuilder token(String token) {
            this.token = token;
            return this;
        }
        
        /**
         * Set usernameType
         * @param usernameType Type of document to be used as a username.    Some banking institutions accept different documents to be used as the &#x60;username&#x60; to login. For example, the *Cédula de Ciudadanía*, *Cédula de Extranjería*, *Pasaporte&#39;*, and so on.    For banks that require a document to log in, you **must** provide the &#x60;username_type&#x60; parameter to specify which document is used when creating the link.    ℹ️ To know which institutions require the &#x60;username_type&#x60; parameter, get the [details](https://developers.belvo.com/reference/detailinstitution) for the institution and check the &#x60;form_fields&#x60; array in the response.    For a list of standards codes, see the table below.  | Code | Description | |-----------|-------| | &#x60;001&#x60; | Cédula de Ciudadanía | | &#x60;002&#x60; | Cédula de Extranjería | | &#x60;003&#x60; | Pasaporte | | &#x60;004&#x60; | Tarjeta de Identidad | | &#x60;005&#x60; | Registro Civil | | &#x60;006&#x60; | Número Identificación Personal | | &#x60;020&#x60; | NIT | | &#x60;021&#x60; | NIT Persona Natural | | &#x60;022&#x60; | NIT Persona Extranjera | | &#x60;023&#x60; | NIT Persona Jurídica | | &#x60;024&#x60; | NIT Menores | | &#x60;025&#x60; | NIT Desasociado | | &#x60;030&#x60; | Trj. Seguro Social Extranjero | | &#x60;031&#x60; | Sociedad Extranjera sin NIT en Colombia | | &#x60;032&#x60; | Fideicomiso | | &#x60;033&#x60; | RIF Venezuela | | &#x60;034&#x60; | CIF | | &#x60;035&#x60; | Número de Identidad | | &#x60;036&#x60; | RTN | | &#x60;037&#x60; | Cédula de Identidad | | &#x60;038&#x60; | DIMEX | | &#x60;039&#x60; | CED | | &#x60;040&#x60; | PAS | | &#x60;041&#x60; | Documento Único de Identidad | | &#x60;042&#x60; | NIT Salvadoreño | | &#x60;100&#x60; | Agência e conta | | &#x60;101&#x60; | Código do operador | | &#x60;102&#x60; | Cartão de crédito | | &#x60;103&#x60; | CPF |  (optional)
         * @return UpdateRequestBuilder
         */
        public UpdateRequestBuilder usernameType(String usernameType) {
            this.usernameType = usernameType;
            return this;
        }
        
        /**
         * Set certificate
         * @param certificate For certain fiscal institutions, it is possible to log in using a certificate and a private key, which enables a faster connection to the institution.  Belvo supports a base64 encoded &#x60;certificate&#x60;. If the &#x60;certificate&#x60; parameter is used, you *must* also provide the &#x60;private_key&#x60; parameter.  (optional)
         * @return UpdateRequestBuilder
         */
        public UpdateRequestBuilder certificate(String certificate) {
            this.certificate = certificate;
            return this;
        }
        
        /**
         * Set privateKey
         * @param privateKey For certain fiscal institutions, it is possible to log in using a certificate and a private key, which enables a faster connection to the institution.  Belvo supports a base64 encoded &#x60;private_key&#x60;. If the &#x60;private_key&#x60; parameter is used, you *must* also provide the &#x60;certificate&#x60; parameter.  (optional)
         * @return UpdateRequestBuilder
         */
        public UpdateRequestBuilder privateKey(String privateKey) {
            this.privateKey = privateKey;
            return this;
        }
        
        /**
         * Set omit
         * @param omit Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. (optional)
         * @return UpdateRequestBuilder
         */
        public UpdateRequestBuilder omit(String omit) {
            this.omit = omit;
            return this;
        }
        
        /**
         * Set fields
         * @param fields Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. (optional)
         * @return UpdateRequestBuilder
         */
        public UpdateRequestBuilder fields(String fields) {
            this.fields = fields;
            return this;
        }
        
        /**
         * Build call for update
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
            LinksPutRequest linksPutRequest = buildBodyParams();
            return updateCall(id, linksPutRequest, omit, fields, _callback);
        }

        private LinksPutRequest buildBodyParams() {
            LinksPutRequest linksPutRequest = new LinksPutRequest();
            linksPutRequest.password(this.password);
            linksPutRequest.password2(this.password2);
            linksPutRequest.token(this.token);
            linksPutRequest.usernameType(this.usernameType);
            linksPutRequest.certificate(this.certificate);
            linksPutRequest.privateKey(this.privateKey);
            return linksPutRequest;
        }

        /**
         * Execute update request
         * @return Link
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public Link execute() throws ApiException {
            LinksPutRequest linksPutRequest = buildBodyParams();
            ApiResponse<Link> localVarResp = updateWithHttpInfo(id, linksPutRequest, omit, fields);
            return localVarResp.getData();
        }

        /**
         * Execute update request with HTTP info returned
         * @return ApiResponse&lt;Link&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Link> executeWithHttpInfo() throws ApiException {
            LinksPutRequest linksPutRequest = buildBodyParams();
            return updateWithHttpInfo(id, linksPutRequest, omit, fields);
        }

        /**
         * Execute update request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Link> _callback) throws ApiException {
            LinksPutRequest linksPutRequest = buildBodyParams();
            return updateAsync(id, linksPutRequest, omit, fields, _callback);
        }
    }

    /**
     * Update a link&#39;s credentials
     * Update the credentials of a specific link. If the successfully updated link is a recurrent one, we automatically trigger an update of the link. If we find fresh data, you&#39;ll [receive historical update](https://developers.belvo.com/docs/webhooks) webhooks. &lt;div style&#x3D;\&quot;background-color:#f4f6f8; border-left: 6px solid #4CAF50;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\&quot;&gt; &lt;strong&gt;Note: &lt;/strong&gt; We recommend using our &lt;a href&#x3D;\&quot;https://developers.belvo.com/docs/connect-widget\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Connect Widget&lt;/a&gt; to handle updating &lt;code&gt;invalid&lt;/code&gt; or &lt;code&gt;token_required&lt;/code&gt; links. &lt;/div&gt; 
     * @param id The &#x60;link.id&#x60; you want to update. (required)
     * @param linksPutRequest  (required)
     * @return UpdateRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public UpdateRequestBuilder update(String password, UUID id) throws IllegalArgumentException {
        if (password == null) throw new IllegalArgumentException("\"password\" is required but got null");
        if (id == null) throw new IllegalArgumentException("\"id\" is required but got null");
        return new UpdateRequestBuilder(password, id);
    }
}
