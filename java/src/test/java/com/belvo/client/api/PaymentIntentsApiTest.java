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

import com.belvo.client.ApiException;
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.Configuration;
import com.belvo.client.model.PatchPaymentIntentPse;
import com.belvo.client.model.PaymentIntentPaginatedResponse;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentIntentsApi
 */
@Disabled
public class PaymentIntentsApiTest {

    private static PaymentIntentsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new PaymentIntentsApi(apiClient);
    }

    /**
     * Complete a payment intent
     *
     * Complete a new payment intent.  During the payment intent flow, you&#39;ll need to prompt your customer to provide additional information about their institution, bank account, and login credentials. This is done by sending PATCH calls with the information that Belvo asked you display in each &#x60;next_step&#x60; object. If you need more information on how to complete a payment intent, check our PSE payment initiation guides for  🇨🇴 Colombia.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void completeTest() throws ApiException {
        Object paymentMethodDetails = null;
        UUID id = null;
        Boolean confirm = null;
        Object response = api.complete(paymentMethodDetails, id)
                .confirm(confirm)
                .execute();
        // TODO: test validations
    }

    /**
     * Create a new payment intent
     *
     * Create a payment intent.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTest() throws ApiException {
        Object response = api.create()
                .execute();
        // TODO: test validations
    }

    /**
     * Get details about a payment intent.
     *
     * Get the details about a specific payment intent.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDetailsTest() throws ApiException {
        UUID id = null;
        Object response = api.getDetails(id)
                .execute();
        // TODO: test validations
    }

    /**
     * List all payment intents
     *
     * List all payment intents associated with your Belvo account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTest() throws ApiException {
        Integer page = null;
        String idIn = null;
        String createdAt = null;
        String createdAtGt = null;
        String createdAtGte = null;
        String createdAtLt = null;
        String createdAtLte = null;
        String createdAtRange = null;
        String provider = null;
        String paymentMethodType = null;
        String customer = null;
        String customerIn = null;
        String amount = null;
        String amountGt = null;
        String amountGte = null;
        String amountLt = null;
        String amountLte = null;
        String status = null;
        String statusIn = null;
        PaymentIntentPaginatedResponse response = api.list()
                .page(page)
                .idIn(idIn)
                .createdAt(createdAt)
                .createdAtGt(createdAtGt)
                .createdAtGte(createdAtGte)
                .createdAtLt(createdAtLt)
                .createdAtLte(createdAtLte)
                .createdAtRange(createdAtRange)
                .provider(provider)
                .paymentMethodType(paymentMethodType)
                .customer(customer)
                .customerIn(customerIn)
                .amount(amount)
                .amountGt(amountGt)
                .amountGte(amountGte)
                .amountLt(amountLt)
                .amountLte(amountLte)
                .status(status)
                .statusIn(statusIn)
                .execute();
        // TODO: test validations
    }

}
