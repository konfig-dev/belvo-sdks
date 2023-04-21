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
import com.belvo.client.model.Balance;
import com.belvo.client.model.BalancesPaginatedResponse;
import com.belvo.client.model.BalancesRequest;
import com.belvo.client.model.PatchBody;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BalancesApi
 */
@Disabled
public class BalancesApiTest {

    private static BalancesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new BalancesApi(apiClient);
    }

    /**
     * Complete a balances request
     *
     * Used to resume a Balance retrieve session that was paused because an MFA token was required by the institution.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void completeRequestTest() throws ApiException {
        String session = null;
        UUID link = null;
        String token = null;
        Boolean saveData = null;
        String omit = null;
        String fields = null;
        List<Balance> response = api.completeRequest(session, link)
                .token(token)
                .saveData(saveData)
                .omit(omit)
                .fields(fields)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a balance
     *
     * Delete a specific balance from your Belvo account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTest() throws ApiException {
        UUID id = null;
        api.delete(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a balance&#39;s details
     *
     * Get the details of a specific balance.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDetailsTest() throws ApiException {
        UUID id = null;
        String omit = null;
        String fields = null;
        Balance response = api.getDetails(id)
                .omit(omit)
                .fields(fields)
                .execute();
        // TODO: test validations
    }

    /**
     * List all balances
     *
     * Get a paginated list of all existing balances in your Belvo account. By default, we return up to 100 results per page.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTest() throws ApiException {
        Integer page = null;
        Integer pageSize = null;
        String omit = null;
        String fields = null;
        UUID link = null;
        UUID account = null;
        String accountIn = null;
        String accountType = null;
        String accountTypeIn = null;
        String balance = null;
        String balanceLt = null;
        String balanceLte = null;
        String balanceGt = null;
        String balanceGte = null;
        String balanceRange = null;
        String currency = null;
        String currencyIn = null;
        String id = null;
        String idIn = null;
        String institution = null;
        String institutionIn = null;
        String linkIn = null;
        String valueDate = null;
        String valueDateGt = null;
        String valueDateGte = null;
        String valueDateLt = null;
        String valueDateLte = null;
        String valueDateRange = null;
        BalancesPaginatedResponse response = api.list()
                .page(page)
                .pageSize(pageSize)
                .omit(omit)
                .fields(fields)
                .link(link)
                .account(account)
                .accountIn(accountIn)
                .accountType(accountType)
                .accountTypeIn(accountTypeIn)
                .balance(balance)
                .balanceLt(balanceLt)
                .balanceLte(balanceLte)
                .balanceGt(balanceGt)
                .balanceGte(balanceGte)
                .balanceRange(balanceRange)
                .currency(currency)
                .currencyIn(currencyIn)
                .id(id)
                .idIn(idIn)
                .institution(institution)
                .institutionIn(institutionIn)
                .linkIn(linkIn)
                .valueDate(valueDate)
                .valueDateGt(valueDateGt)
                .valueDateGte(valueDateGte)
                .valueDateLt(valueDateLt)
                .valueDateLte(valueDateLte)
                .valueDateRange(valueDateRange)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve balances for a link
     *
     * Retrieve balances from one or more accounts for a specific link within a specified date range.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retrieveTest() throws ApiException {
        UUID link = null;
        String dateFrom = null;
        String dateTo = null;
        UUID account = null;
        String token = null;
        Boolean saveData = null;
        String omit = null;
        String fields = null;
        List<Balance> response = api.retrieve(link, dateFrom, dateTo)
                .account(account)
                .token(token)
                .saveData(saveData)
                .omit(omit)
                .fields(fields)
                .execute();
        // TODO: test validations
    }

}
