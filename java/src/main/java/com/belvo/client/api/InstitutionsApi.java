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


import com.belvo.client.model.Institution;
import com.belvo.client.model.InstitutionsPaginatedResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class InstitutionsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public InstitutionsApi() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public InstitutionsApi(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getDetailsCall(String id, String omit, String fields, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/institutions/{id}"
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
    private okhttp3.Call getDetailsValidateBeforeCall(String id, String omit, String fields, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getDetails(Async)");
        }

        return getDetailsCall(id, omit, fields, _callback);

    }


    private ApiResponse<Institution> getDetailsWithHttpInfo(String id, String omit, String fields) throws ApiException {
        okhttp3.Call localVarCall = getDetailsValidateBeforeCall(id, omit, fields, null);
        Type localVarReturnType = new TypeToken<Institution>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getDetailsAsync(String id, String omit, String fields, final ApiCallback<Institution> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDetailsValidateBeforeCall(id, omit, fields, _callback);
        Type localVarReturnType = new TypeToken<Institution>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetDetailsRequestBuilder {
        private final String id;
        private String omit;
        private String fields;

        private GetDetailsRequestBuilder(String id) {
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
         * @return Institution
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public Institution execute() throws ApiException {
            ApiResponse<Institution> localVarResp = getDetailsWithHttpInfo(id, omit, fields);
            return localVarResp.getData();
        }

        /**
         * Execute getDetails request with HTTP info returned
         * @return ApiResponse&lt;Institution&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Institution> executeWithHttpInfo() throws ApiException {
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
        public okhttp3.Call executeAsync(final ApiCallback<Institution> _callback) throws ApiException {
            return getDetailsAsync(id, omit, fields, _callback);
        }
    }

    /**
     * Get an institution&#39;s details
     * Get the details of a specific institution.
     * @param id The &#x60;institution.id&#x60; you want to get detailed information about. (required)
     * @return GetDetailsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public GetDetailsRequestBuilder getDetails(String id) throws IllegalArgumentException {
        if (id == null) throw new IllegalArgumentException("\"id\" is required but got null");
        return new GetDetailsRequestBuilder(id);
    }
    private okhttp3.Call listCall(Integer page, Integer pageSize, String omit, String fields, String countryCode, String countryCodeIn, String displayName, String name, String nameIn, String resourcesAllin, String status, String statusIn, String type, String typeIn, String website, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/institutions";

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

        if (countryCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("country_code", countryCode));
        }

        if (countryCodeIn != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("country_code__in", countryCodeIn));
        }

        if (displayName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("display_name", displayName));
        }

        if (name != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("name", name));
        }

        if (nameIn != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("name__in", nameIn));
        }

        if (resourcesAllin != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("resources__allin", resourcesAllin));
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

        if (website != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("website", website));
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
    private okhttp3.Call listValidateBeforeCall(Integer page, Integer pageSize, String omit, String fields, String countryCode, String countryCodeIn, String displayName, String name, String nameIn, String resourcesAllin, String status, String statusIn, String type, String typeIn, String website, final ApiCallback _callback) throws ApiException {
        return listCall(page, pageSize, omit, fields, countryCode, countryCodeIn, displayName, name, nameIn, resourcesAllin, status, statusIn, type, typeIn, website, _callback);

    }


    private ApiResponse<InstitutionsPaginatedResponse> listWithHttpInfo(Integer page, Integer pageSize, String omit, String fields, String countryCode, String countryCodeIn, String displayName, String name, String nameIn, String resourcesAllin, String status, String statusIn, String type, String typeIn, String website) throws ApiException {
        okhttp3.Call localVarCall = listValidateBeforeCall(page, pageSize, omit, fields, countryCode, countryCodeIn, displayName, name, nameIn, resourcesAllin, status, statusIn, type, typeIn, website, null);
        Type localVarReturnType = new TypeToken<InstitutionsPaginatedResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listAsync(Integer page, Integer pageSize, String omit, String fields, String countryCode, String countryCodeIn, String displayName, String name, String nameIn, String resourcesAllin, String status, String statusIn, String type, String typeIn, String website, final ApiCallback<InstitutionsPaginatedResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listValidateBeforeCall(page, pageSize, omit, fields, countryCode, countryCodeIn, displayName, name, nameIn, resourcesAllin, status, statusIn, type, typeIn, website, _callback);
        Type localVarReturnType = new TypeToken<InstitutionsPaginatedResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListRequestBuilder {
        private Integer page;
        private Integer pageSize;
        private String omit;
        private String fields;
        private String countryCode;
        private String countryCodeIn;
        private String displayName;
        private String name;
        private String nameIn;
        private String resourcesAllin;
        private String status;
        private String statusIn;
        private String type;
        private String typeIn;
        private String website;

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
         * Set countryCode
         * @param countryCode Return institutions only for this two-letter country code. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder countryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        
        /**
         * Set countryCodeIn
         * @param countryCodeIn Return institutions only for these two-letter country codes. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder countryCodeIn(String countryCodeIn) {
            this.countryCodeIn = countryCodeIn;
            return this;
        }
        
        /**
         * Set displayName
         * @param displayName Return institutions that partially match this display name. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        
        /**
         * Set name
         * @param name  (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder name(String name) {
            this.name = name;
            return this;
        }
        
        /**
         * Set nameIn
         * @param nameIn Return institutions with one or more of these Belvo-designated names. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder nameIn(String nameIn) {
            this.nameIn = nameIn;
            return this;
        }
        
        /**
         * Set resourcesAllin
         * @param resourcesAllin Return institutions that support these resources. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder resourcesAllin(String resourcesAllin) {
            this.resourcesAllin = resourcesAllin;
            return this;
        }
        
        /**
         * Set status
         * @param status Return institutions with the given status. You can choose between &#x60;healthy&#x60; or &#x60;down&#x60;. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder status(String status) {
            this.status = status;
            return this;
        }
        
        /**
         * Set statusIn
         * @param statusIn Return institutions with one of the given statuses. You can choose between &#x60;healthy&#x60; or &#x60;down&#x60;. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder statusIn(String statusIn) {
            this.statusIn = statusIn;
            return this;
        }
        
        /**
         * Set type
         * @param type Return institutions of this type. You can choose between &#x60;bank&#x60; or &#x60;fiscal&#x60;. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder type(String type) {
            this.type = type;
            return this;
        }
        
        /**
         * Set typeIn
         * @param typeIn Return institutions of one of these types. You can choose between &#x60;bank&#x60; or &#x60;fiscal&#x60;. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder typeIn(String typeIn) {
            this.typeIn = typeIn;
            return this;
        }
        
        /**
         * Set website
         * @param website Return institutions with this website URL. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder website(String website) {
            this.website = website;
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
            return listCall(page, pageSize, omit, fields, countryCode, countryCodeIn, displayName, name, nameIn, resourcesAllin, status, statusIn, type, typeIn, website, _callback);
        }


        /**
         * Execute list request
         * @return InstitutionsPaginatedResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public InstitutionsPaginatedResponse execute() throws ApiException {
            ApiResponse<InstitutionsPaginatedResponse> localVarResp = listWithHttpInfo(page, pageSize, omit, fields, countryCode, countryCodeIn, displayName, name, nameIn, resourcesAllin, status, statusIn, type, typeIn, website);
            return localVarResp.getData();
        }

        /**
         * Execute list request with HTTP info returned
         * @return ApiResponse&lt;InstitutionsPaginatedResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<InstitutionsPaginatedResponse> executeWithHttpInfo() throws ApiException {
            return listWithHttpInfo(page, pageSize, omit, fields, countryCode, countryCodeIn, displayName, name, nameIn, resourcesAllin, status, statusIn, type, typeIn, website);
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
        public okhttp3.Call executeAsync(final ApiCallback<InstitutionsPaginatedResponse> _callback) throws ApiException {
            return listAsync(page, pageSize, omit, fields, countryCode, countryCodeIn, displayName, name, nameIn, resourcesAllin, status, statusIn, type, typeIn, website, _callback);
        }
    }

    /**
     * List all institutions
     * Get a paginated list of all the institutions currently supported by Belvo. By default, we return up to 100 results per page.
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
}
