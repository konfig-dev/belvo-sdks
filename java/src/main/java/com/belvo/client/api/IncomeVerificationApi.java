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


import com.belvo.client.model.EnumIncomeMinimumConfidenceLevelRequest;
import com.belvo.client.model.EnumInvoiceAllowedIncomeTypesRequest;
import com.belvo.client.model.EyodIncomeVerificationBodyRequest;
import com.belvo.client.model.EyodIncomeVerificationRequest;
import com.belvo.client.model.Income;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class IncomeVerificationApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public IncomeVerificationApi() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public IncomeVerificationApi(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call verifyCall(EyodIncomeVerificationRequest eyodIncomeVerificationRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = eyodIncomeVerificationRequest;

        // create path and map variables
        String localVarPath = "/api/enrich/incomes";

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
    private okhttp3.Call verifyValidateBeforeCall(EyodIncomeVerificationRequest eyodIncomeVerificationRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'eyodIncomeVerificationRequest' is set
        if (eyodIncomeVerificationRequest == null) {
            throw new ApiException("Missing the required parameter 'eyodIncomeVerificationRequest' when calling verify(Async)");
        }

        return verifyCall(eyodIncomeVerificationRequest, _callback);

    }


    private ApiResponse<List<Income>> verifyWithHttpInfo(EyodIncomeVerificationRequest eyodIncomeVerificationRequest) throws ApiException {
        okhttp3.Call localVarCall = verifyValidateBeforeCall(eyodIncomeVerificationRequest, null);
        Type localVarReturnType = new TypeToken<List<Income>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call verifyAsync(EyodIncomeVerificationRequest eyodIncomeVerificationRequest, final ApiCallback<List<Income>> _callback) throws ApiException {

        okhttp3.Call localVarCall = verifyValidateBeforeCall(eyodIncomeVerificationRequest, _callback);
        Type localVarReturnType = new TypeToken<List<Income>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class VerifyRequestBuilder {
        private final String language;
        private final List<EyodIncomeVerificationBodyRequest> transactions;
        private String dateFrom;
        private String dateTo;
        private List<EnumInvoiceAllowedIncomeTypesRequest> allowedIncomeTypes;
        private EnumIncomeMinimumConfidenceLevelRequest minimumConfidenceLevel;

        private VerifyRequestBuilder(String language, List<EyodIncomeVerificationBodyRequest> transactions) {
            this.language = language;
            this.transactions = transactions;
        }

        /**
         * Set dateFrom
         * @param dateFrom The date from which you want to start getting incomes for, in &#x60;YYYY-MM-DD&#x60; format, within the last 365 days. When you use this parameter, you must also send &#x60;date_to&#x60;.  ⚠️ The value of &#x60;date_from&#x60; cannot be greater than &#x60;date_to&#x60;. (optional)
         * @return VerifyRequestBuilder
         */
        public VerifyRequestBuilder dateFrom(String dateFrom) {
            this.dateFrom = dateFrom;
            return this;
        }
        
        /**
         * Set dateTo
         * @param dateTo The date you want to stop getting incomes for, in &#x60;YYYY-MM-DD&#x60; format, within the last 365 days. When you use this parameter, you must also send &#x60;date_from&#x60;.  ⚠️ The value of &#x60;date_to&#x60; cannot be greater than today&#39;s date (in other words, no future dates). (optional)
         * @return VerifyRequestBuilder
         */
        public VerifyRequestBuilder dateTo(String dateTo) {
            this.dateTo = dateTo;
            return this;
        }
        
        /**
         * Set allowedIncomeTypes
         * @param allowedIncomeTypes  (optional)
         * @return VerifyRequestBuilder
         */
        public VerifyRequestBuilder allowedIncomeTypes(List<EnumInvoiceAllowedIncomeTypesRequest> allowedIncomeTypes) {
            this.allowedIncomeTypes = allowedIncomeTypes;
            return this;
        }
        
        /**
         * Set minimumConfidenceLevel
         * @param minimumConfidenceLevel  (optional)
         * @return VerifyRequestBuilder
         */
        public VerifyRequestBuilder minimumConfidenceLevel(EnumIncomeMinimumConfidenceLevelRequest minimumConfidenceLevel) {
            this.minimumConfidenceLevel = minimumConfidenceLevel;
            return this;
        }
        
        /**
         * Build call for verify
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
            EyodIncomeVerificationRequest eyodIncomeVerificationRequest = buildBodyParams();
            return verifyCall(eyodIncomeVerificationRequest, _callback);
        }

        private EyodIncomeVerificationRequest buildBodyParams() {
            EyodIncomeVerificationRequest eyodIncomeVerificationRequest = new EyodIncomeVerificationRequest();
            eyodIncomeVerificationRequest.language(this.language);
            eyodIncomeVerificationRequest.transactions(this.transactions);
            eyodIncomeVerificationRequest.dateFrom(this.dateFrom);
            eyodIncomeVerificationRequest.dateTo(this.dateTo);
            eyodIncomeVerificationRequest.allowedIncomeTypes(this.allowedIncomeTypes);
            eyodIncomeVerificationRequest.minimumConfidenceLevel(this.minimumConfidenceLevel);
            return eyodIncomeVerificationRequest;
        }

        /**
         * Execute verify request
         * @return List&lt;Income&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public List<Income> execute() throws ApiException {
            EyodIncomeVerificationRequest eyodIncomeVerificationRequest = buildBodyParams();
            ApiResponse<List<Income>> localVarResp = verifyWithHttpInfo(eyodIncomeVerificationRequest);
            return localVarResp.getData();
        }

        /**
         * Execute verify request with HTTP info returned
         * @return ApiResponse&lt;List&lt;Income&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<Income>> executeWithHttpInfo() throws ApiException {
            EyodIncomeVerificationRequest eyodIncomeVerificationRequest = buildBodyParams();
            return verifyWithHttpInfo(eyodIncomeVerificationRequest);
        }

        /**
         * Execute verify request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<Income>> _callback) throws ApiException {
            EyodIncomeVerificationRequest eyodIncomeVerificationRequest = buildBodyParams();
            return verifyAsync(eyodIncomeVerificationRequest, _callback);
        }
    }

    /**
     * Verify incomes
     * Send through your raw data and receive enriched information for each of your user&#39;s income streams.  &lt;div style&#x3D;\&quot;background-color:#f4f6f8; border-left: 6px solid #5bc0de;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\&quot;&gt; &lt;strong&gt;Note: &lt;/strong&gt; Belvo can process up to 10,000 unique transactions per request. &lt;/div&gt;
     * @param eyodIncomeVerificationRequest  (required)
     * @return VerifyRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
     </table>
     */
    public VerifyRequestBuilder verify(String language, List<EyodIncomeVerificationBodyRequest> transactions) throws IllegalArgumentException {
        if (language == null) throw new IllegalArgumentException("\"language\" is required but got null");
        if (transactions == null) throw new IllegalArgumentException("\"transactions\" is required but got null");
        return new VerifyRequestBuilder(language, transactions);
    }
}
