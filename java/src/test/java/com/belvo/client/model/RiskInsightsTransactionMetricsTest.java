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


package com.belvo.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for RiskInsightsTransactionMetrics
 */
public class RiskInsightsTransactionMetricsTest {
    private final RiskInsightsTransactionMetrics model = new RiskInsightsTransactionMetrics();

    /**
     * Model tests for RiskInsightsTransactionMetrics
     */
    @Test
    public void testRiskInsightsTransactionMetrics() {
        // TODO: test RiskInsightsTransactionMetrics
    }

    /**
     * Test the property 'numTransactions1w'
     */
    @Test
    public void numTransactions1wTest() {
        // TODO: test numTransactions1w
    }

    /**
     * Test the property 'numTransactions1m'
     */
    @Test
    public void numTransactions1mTest() {
        // TODO: test numTransactions1m
    }

    /**
     * Test the property 'numTransactions3m'
     */
    @Test
    public void numTransactions3mTest() {
        // TODO: test numTransactions3m
    }

    /**
     * Test the property 'numIncomingTransactions1w'
     */
    @Test
    public void numIncomingTransactions1wTest() {
        // TODO: test numIncomingTransactions1w
    }

    /**
     * Test the property 'numIncomingTransactions1m'
     */
    @Test
    public void numIncomingTransactions1mTest() {
        // TODO: test numIncomingTransactions1m
    }

    /**
     * Test the property 'numIncomingTransactions3m'
     */
    @Test
    public void numIncomingTransactions3mTest() {
        // TODO: test numIncomingTransactions3m
    }

    /**
     * Test the property 'numOutgoingTransactions1w'
     */
    @Test
    public void numOutgoingTransactions1wTest() {
        // TODO: test numOutgoingTransactions1w
    }

    /**
     * Test the property 'numOutgoingTransactions1m'
     */
    @Test
    public void numOutgoingTransactions1mTest() {
        // TODO: test numOutgoingTransactions1m
    }

    /**
     * Test the property 'numOutgoingTransactions3m'
     */
    @Test
    public void numOutgoingTransactions3mTest() {
        // TODO: test numOutgoingTransactions3m
    }

    /**
     * Test the property 'sumIncomingAmount1w'
     */
    @Test
    public void sumIncomingAmount1wTest() {
        // TODO: test sumIncomingAmount1w
    }

    /**
     * Test the property 'sumIncomingAmount1m'
     */
    @Test
    public void sumIncomingAmount1mTest() {
        // TODO: test sumIncomingAmount1m
    }

    /**
     * Test the property 'sumIncomingAmount3m'
     */
    @Test
    public void sumIncomingAmount3mTest() {
        // TODO: test sumIncomingAmount3m
    }

    /**
     * Test the property 'sumOutgoingAmount1w'
     */
    @Test
    public void sumOutgoingAmount1wTest() {
        // TODO: test sumOutgoingAmount1w
    }

    /**
     * Test the property 'sumOutgoingAmount1m'
     */
    @Test
    public void sumOutgoingAmount1mTest() {
        // TODO: test sumOutgoingAmount1m
    }

    /**
     * Test the property 'sumOutgoingAmount3m'
     */
    @Test
    public void sumOutgoingAmount3mTest() {
        // TODO: test sumOutgoingAmount3m
    }

    /**
     * Test the property 'maxIncomingAmount1w'
     */
    @Test
    public void maxIncomingAmount1wTest() {
        // TODO: test maxIncomingAmount1w
    }

    /**
     * Test the property 'maxIncomingAmount1m'
     */
    @Test
    public void maxIncomingAmount1mTest() {
        // TODO: test maxIncomingAmount1m
    }

    /**
     * Test the property 'maxIncomingAmount3m'
     */
    @Test
    public void maxIncomingAmount3mTest() {
        // TODO: test maxIncomingAmount3m
    }

    /**
     * Test the property 'maxOutgoingAmount1w'
     */
    @Test
    public void maxOutgoingAmount1wTest() {
        // TODO: test maxOutgoingAmount1w
    }

    /**
     * Test the property 'maxOutgoingAmount1m'
     */
    @Test
    public void maxOutgoingAmount1mTest() {
        // TODO: test maxOutgoingAmount1m
    }

    /**
     * Test the property 'maxOutgoingAmount3m'
     */
    @Test
    public void maxOutgoingAmount3mTest() {
        // TODO: test maxOutgoingAmount3m
    }

    /**
     * Test the property 'meanIncomingAmount1w'
     */
    @Test
    public void meanIncomingAmount1wTest() {
        // TODO: test meanIncomingAmount1w
    }

    /**
     * Test the property 'meanIncomingAmount1m'
     */
    @Test
    public void meanIncomingAmount1mTest() {
        // TODO: test meanIncomingAmount1m
    }

    /**
     * Test the property 'meanIncomingAmount3m'
     */
    @Test
    public void meanIncomingAmount3mTest() {
        // TODO: test meanIncomingAmount3m
    }

    /**
     * Test the property 'meanOutgoingAmount1w'
     */
    @Test
    public void meanOutgoingAmount1wTest() {
        // TODO: test meanOutgoingAmount1w
    }

    /**
     * Test the property 'meanOutgoingAmount1m'
     */
    @Test
    public void meanOutgoingAmount1mTest() {
        // TODO: test meanOutgoingAmount1m
    }

    /**
     * Test the property 'meanOutgoingAmount3m'
     */
    @Test
    public void meanOutgoingAmount3mTest() {
        // TODO: test meanOutgoingAmount3m
    }

}
