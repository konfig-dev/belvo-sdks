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
import com.belvo.client.model.ChangeAccessMode;
import com.belvo.client.model.EnumLinkAccessModeRequest;
import com.belvo.client.model.Link;
import com.belvo.client.model.LinksPutRequest;
import com.belvo.client.model.LinksRequest;
import com.belvo.client.model.PaginatedResponseLink;
import com.belvo.client.model.PatchBodyWithoutSaveData;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LinksApi
 */
@Disabled
public class LinksApiTest {

    private static LinksApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new LinksApi(apiClient);
    }

    /**
     * Change a link&#39;s access mode
     *
     * Change a link&#39;s access mode from &#x60;single&#x60; to &#x60;recurrent&#x60; or from &#x60;recurrent&#x60; to single. ℹ️ **Note**: When you change a link from &#x60;single&#x60;&#x60; to &#x60;recurrent&#x60;, they will only be updated the next day at the scheduled interval.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void changeAccessModeTest() throws ApiException {
        EnumLinkAccessModeRequest accessMode = null;
        UUID id = null;
        String omit = null;
        String fields = null;
        Link response = api.changeAccessMode(accessMode, id)
                .omit(omit)
                .fields(fields)
                .execute();
        // TODO: test validations
    }

    /**
     * Complete a links request
     *
     * Used to resume a Link register session that was paused because an MFA token was required by the institution.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void completeRequestTest() throws ApiException {
        String session = null;
        UUID link = null;
        String token = null;
        String omit = null;
        String fields = null;
        Link response = api.completeRequest(session, link)
                .token(token)
                .omit(omit)
                .fields(fields)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a link
     *
     * Delete a specific link and all associated accounts, transactions, and owners from your Belvo account. # Deleting links in batches To delete links in bulk, we recommend looping through the list of links you want to delete and making the delete request.    &gt; 🚧 **Rate limiting and IP blocking**   &gt;    &gt; An important technical note for performing operations in batches is to take into consideration our rate-limiting: up to 80 requests every 30 seconds. If you exceed this limit, you run the risk of Belvo blocking your IP from making further requests.   &gt;    &gt; For more information, or if your IP address has been blocked, please contact our [support team](https://support.belvo.com/hc/en-us/requests/new).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void destroyTest() throws ApiException {
        UUID id = null;
        api.destroy(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a link&#39;s details
     *
     * Get the details of a specific link.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDetailsTest() throws ApiException {
        UUID id = null;
        String omit = null;
        String fields = null;
        Link response = api.getDetails(id)
                .omit(omit)
                .fields(fields)
                .execute();
        // TODO: test validations
    }

    /**
     * List all links
     *
     * Get a paginated list of all the existing links in your Belvo account. By default, we return up to 100 results per page.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTest() throws ApiException {
        Integer page = null;
        Integer pageSize = null;
        String omit = null;
        String fields = null;
        String accessMode = null;
        String createdAt = null;
        String createdAtGt = null;
        String createdAtGte = null;
        String createdAtLt = null;
        String createdAtLte = null;
        String createdAtRange = null;
        String createdByNotIn = null;
        String externalId = null;
        String externalIdIn = null;
        String id = null;
        String idIn = null;
        String institution = null;
        String institutionIn = null;
        String institutionUserId = null;
        String institutionUserIdIn = null;
        String refreshRate = null;
        String status = null;
        String statusIn = null;
        PaginatedResponseLink response = api.list()
                .page(page)
                .pageSize(pageSize)
                .omit(omit)
                .fields(fields)
                .accessMode(accessMode)
                .createdAt(createdAt)
                .createdAtGt(createdAtGt)
                .createdAtGte(createdAtGte)
                .createdAtLt(createdAtLt)
                .createdAtLte(createdAtLte)
                .createdAtRange(createdAtRange)
                .createdByNotIn(createdByNotIn)
                .externalId(externalId)
                .externalIdIn(externalIdIn)
                .id(id)
                .idIn(idIn)
                .institution(institution)
                .institutionIn(institutionIn)
                .institutionUserId(institutionUserId)
                .institutionUserIdIn(institutionUserIdIn)
                .refreshRate(refreshRate)
                .status(status)
                .statusIn(statusIn)
                .execute();
        // TODO: test validations
    }

    /**
     * Register a new link
     *
     * Register a new link with your Belvo account.  &lt;div style&#x3D;\&quot;background-color:#f4f6f8; border-left: 6px solid #4CAF50;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\&quot;&gt; &lt;strong&gt;Note: &lt;/strong&gt; We recommend using our &lt;a href&#x3D;\&quot;https://developers.belvo.com/docs/connect-widget\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Connect Widget&lt;/a&gt; to handle link creation and link status updates. &lt;/div&gt; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void registerTest() throws ApiException {
        String institution = null;
        String username = null;
        String password = null;
        String externalId = null;
        String username2 = null;
        String username3 = null;
        String password2 = null;
        String token = null;
        EnumLinkAccessModeRequest accessMode = null;
        Boolean fetchHistorical = null;
        String credentialsStorage = null;
        String usernameType = null;
        String certificate = null;
        String privateKey = null;
        String omit = null;
        String fields = null;
        Link response = api.register(institution, username)
                .password(password)
                .externalId(externalId)
                .username2(username2)
                .username3(username3)
                .password2(password2)
                .token(token)
                .accessMode(accessMode)
                .fetchHistorical(fetchHistorical)
                .credentialsStorage(credentialsStorage)
                .usernameType(usernameType)
                .certificate(certificate)
                .privateKey(privateKey)
                .omit(omit)
                .fields(fields)
                .execute();
        // TODO: test validations
    }

    /**
     * Update a link&#39;s credentials
     *
     * Update the credentials of a specific link. If the successfully updated link is a recurrent one, we automatically trigger an update of the link. If we find fresh data, you&#39;ll [receive historical update](https://developers.belvo.com/docs/webhooks) webhooks. &lt;div style&#x3D;\&quot;background-color:#f4f6f8; border-left: 6px solid #4CAF50;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\&quot;&gt; &lt;strong&gt;Note: &lt;/strong&gt; We recommend using our &lt;a href&#x3D;\&quot;https://developers.belvo.com/docs/connect-widget\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Connect Widget&lt;/a&gt; to handle updating &lt;code&gt;invalid&lt;/code&gt; or &lt;code&gt;token_required&lt;/code&gt; links. &lt;/div&gt; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTest() throws ApiException {
        String password = null;
        UUID id = null;
        String password2 = null;
        String token = null;
        String usernameType = null;
        String certificate = null;
        String privateKey = null;
        String omit = null;
        String fields = null;
        Link response = api.update(password, id)
                .password2(password2)
                .token(token)
                .usernameType(usernameType)
                .certificate(certificate)
                .privateKey(privateKey)
                .omit(omit)
                .fields(fields)
                .execute();
        // TODO: test validations
    }

}
