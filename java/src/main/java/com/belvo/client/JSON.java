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


package com.belvo.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    {
        GsonBuilder gsonBuilder = createGson();
        gsonBuilder.registerTypeAdapter(Date.class, dateTypeAdapter);
        gsonBuilder.registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter);
        gsonBuilder.registerTypeAdapter(LocalDate.class, localDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(byte[].class, byteArrayAdapter);

        /**
         * For the "type: number" schema we accept both Double and Integer
         * In the case that we pass "1.0" or "1" we serialize the JsonPrimitive
         * as the "1" literal. This is useful when the server expects an integer.
         */
        gsonBuilder.registerTypeAdapter(Double.class, new JsonSerializer<Double>() {

            @Override
            public JsonElement serialize(Double src, Type typeOfSrc, JsonSerializationContext context) {
                if (src == src.longValue())
                    return new JsonPrimitive(src.longValue());
                return new JsonPrimitive(src);
            }
        });
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.AccessToResourceDenied.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.Account.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.AccountsBalance.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.AccountsCreditData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.AccountsFundsData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.AccountsFundsDataPublicIdentifications.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.AccountsLoanData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.AccountsLoanDataFees.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.AccountsLoanDataInterestRate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.AccountsPaginatedResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.AccountsReceivablesData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.AnnualCostsAndDeductionsStatementBusiness.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.AnnualIncomeStatementBusiness.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.AnnualIncomeStatementIndividual.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.AnnualTotalsIndividual.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.AsynchronousAccepted202.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.Balance.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.BalancesPaginatedResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.BalancesRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.BankAccountBusinessPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.BankAccountDetailsOfpi.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.BankAccountDetailsOfpiPix.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.BankAccountDetailsOpenFinance.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.BankAccountDetailsOpenFinancePix.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.BankAccountHolderRequestOfpi.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.BankAccountInformationContentPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.BankAccountInformationPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.BankAccountOfpiResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.BankAccountPaginatedResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.BeneficiaryBankAccountOfpi.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.BeneficiaryBankAccountPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.Categorization.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.CategorizationBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.CategorizationBodyRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.CategorizationMerchantData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.CategorizationRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.ChangeAccessMode.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.Charge.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.ChargePaymentMethodDetailsOfpi.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.ChargePaymentMethodDetailsOfpiContent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.ChargePaymentMethodDetailsPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.ChargePaymentMethodDetailsPseContent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.CreateBankAccountOfpi.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.CreateBankAccountPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.CreateCustomerOfpi.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.CreateCustomerPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.CreatePaymentIntentPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.CreatePaymentLinkOfpi.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.CreatePaymentLinkPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.CustomerOfpi.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.CustomerPaginatedResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.CustomerPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.DisplayConfirmationRequiredContentPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.DisplayConfirmationRequiredOfpi.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.DisplayCredentialsRequiredContentPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.DisplayCustomerBankAccountsContentPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.DisplayPaymentFailed.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.DisplayPaymentMethodInformationContentOfpi.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.DisplayPaymentMethodInformationContentPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.DisplayPaymentProcessing.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.DisplayPaymentSucceeded.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.DisplayTokenRequiredContentPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.DocumentIdBusiness.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.DocumentIdIndividual.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.DocumentInformationBusiness.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.DocumentInformationIndividual.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.EmploymentRecord.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.EmploymentRecordDetail.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.EmploymentRecordDocumentId.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.EmploymentRecordEmploymentStatusUpdates.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.EmploymentRecordEntitlement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.EmploymentRecordFile.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.EmploymentRecordPersonalData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.EmploymentRecordRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.EmploymentRecordSocialSecuritySummary.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.EmploymentRecordsPaginatedResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.EquityStatementBusiness.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.EquityStatementIndividual.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.EyodIncomeVerificationBodyRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.EyodIncomeVerificationRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.GrossIncomeIndividual.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.HolderBankAccountInformationPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.HolderBankAccountPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.HolderBusinessPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.HolderBusinessResponsePse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.HolderInformationBusinessOfpi.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.HolderInformationBusinessOfpiResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.HolderInformationBusinessPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.HolderInformationBusinessPseResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.HolderInformationIndividualOfpi.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.HolderInformationIndividualOfpiResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.HolderResponseOfpi.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.Income.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.IncomeStreamsBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.IncomesPaginatedResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.IncomesRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.Institution.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.InstitutionAccount.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.InstitutionDownError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.InstitutionFormField.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.InstitutionInactiveError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.InstitutionUnavailableError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.InstitutionsFeature.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.InstitutionsFormField.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.InstitutionsFormFieldValues.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.InstitutionsPaginatedResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.InvalidAccessMode.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.InvalidLinkError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.InvalidPeriodError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.InvestmentsPortfolio.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.InvestmentsPortfolioInstrument.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.InvestmentsPortfolioInstrumentFees.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.InvestmentsPortfolioInstrumentInterestRate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.InvestmentsPortfolioInstrumentPublicId.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.InvestmentsPortfolioInstrumentRedemptionConditions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.InvestmentsPortfoliosPaginatedResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.InvoiceDetailDian.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.InvoiceDetailRetainedTaxSat.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.InvoiceDetailSat.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.InvoiceDian.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.InvoiceSenderDetailsDian.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.InvoiceWarningsDian.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.InvoiceWarningsSat.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.InvoiceWithIdSat.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.InvoicesPaymentsDian.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.InvoicesPaymentsRelatedDocumentsDian.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.InvoicesPaymentsRelatedDocumentsSat.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.InvoicesPaymentsSat.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.InvoicesPayrollDian.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.InvoicesPayrollSat.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.InvoicesReceiverDetailsDian.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.InvoicesRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.InvoicesResponsePaginatedResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.LastErrorInvalidCredentials.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.LastErrorInvalidToken.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.LastErrorLoginError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.LastErrorPaymentError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.LastErrorSessionExpired.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.LastErrorTwoFactor.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.Link.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.LinksPutRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.LinksRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.Model400ValidationError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.Model401UnauthorizedError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.Model404NotFoundError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.Model408RequestTimeoutError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.Model500UnexpectedError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.NeedsRedirectContent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.NeedsRedirectContentPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.NetIncomeIndividual.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.NextStepDisplayConfirmationRequiredOfpi.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.NextStepDisplayConfirmationRequiredPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.NextStepDisplayCredentialsRequiredPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.NextStepDisplayCustomerBankAccountsPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.NextStepDisplayNeedsRedirectPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.NextStepDisplayPaymentFailed.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.NextStepDisplayPaymentMethodInformation.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.NextStepDisplayPaymentMethodInformationPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.NextStepDisplayPaymentProcessing.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.NextStepDisplayPaymentSucceeded.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.NextStepDisplayTokenRequiredPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.NextStepNeedsRedirect.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.NonTaxableIncomeIndividual.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.NotFoundError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.Owner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.OwnerDocumentId.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.OwnersPaginatedResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.PaginatedResponseLink.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.PatchBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.PatchBodyWithoutSaveData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.PatchPaymentIntentPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.PatchPaymentIntentsBodyPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.PatchPaymentMethodDetailsPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.PaymentInstitution.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.PaymentIntentOfpi.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.PaymentIntentOfpiPaymentMethodDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.PaymentIntentPaginatedResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.PaymentIntentPaymentMethodDetailsBodyBusinessOfpi.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.PaymentIntentPaymentMethodDetailsBodyIndividualOfpi.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.PaymentIntentPaymentMethodDetailsBodyPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.PaymentIntentPaymentMethodDetailsBusinessOfpi.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.PaymentIntentPaymentMethodDetailsIndividualOfpi.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.PaymentIntentPaymentMethodDetailsPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.PaymentIntentPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.PaymentIntentsPaymentMethodDetailsBodyPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.PaymentIntentsPaymentMethodDetailsPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.PaymentLinkCallbackUrls.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.PaymentLinkCallbackUrlsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.PaymentLinkListOfpi.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.PaymentLinkListPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.PaymentLinkOfpi.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.PaymentLinkPaginatedResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.PaymentLinkPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.PaymentLinksPaymentMethodDetailsBodyOfpi.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.PaymentLinksPaymentMethodDetailsBodyPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.PaymentMethodDetailsOfpi.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.PaymentMethodDetailsPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.PaymentMethodInfoCustomerBankAccountsPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.PaymentMethodInformationBodyOfpi.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.PaymentMethodInformationBodyPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.PaymentMethodInformationDetailsPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.PaymentMethodInformationOfpi.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.PaymentMethodInformationPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.PaymentTransaction.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.PaymentsInstitutionsPaginatedResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.PaymentsRequestApiKeysResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.PaymentsTransactionsPaginatedResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.PaymentsWay.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.PensionIncomeStatementIndividual.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.ProvidersPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.ReceivableTransactionRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.ReceivablesTransaction.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.ReceivablesTransactionAccount.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.ReceivablesTransactionNumberOfInstallments.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.ReceivablesTransactionsPaginatedResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.RecevablesTransactionFees.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.RecurringExpenseSourceTransaction.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.RecurringExpenses.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.RecurringExpensesPaginatedResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.RecurringExpensesRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.ReportingId.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.RetentionBreakdown.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.RiskInsights.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.RiskInsightsBalanceMetrics.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.RiskInsightsCashflowMetrics.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.RiskInsightsCreditCardMetrics.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.RiskInsightsLoansMetrics.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.RiskInsightsPaginatedResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.RiskInsightsTransactionMetrics.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.SecretKeys.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.SecretKeysPaginatedResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.SessionExpiredError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.StandardRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TaxAssessmentBusiness.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TaxAssessmentIndividual.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TaxComplianceStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TaxComplianceStatusPaginatedResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TaxComplianceStatusRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TaxDeclarationBusiness.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TaxDeclarationBusinessPaginated.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TaxDeclarationIndividual.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TaxDeclarationIndividualPaginated.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TaxDeclarationsRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TaxPayerInformationBusiness.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TaxPayerInformationIndividual.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TaxRetentions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TaxRetentionsPaginatedResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TaxRetentionsRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TaxReturnBusiness.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TaxReturnBusinessMonthly.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TaxReturnPersonal.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TaxReturnPersonalMonthly.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TaxReturnsBusinessMonthlyPaginated.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TaxReturnsBusinessPaginated.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TaxReturnsMonthlyRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TaxReturnsPersonalMonthlyPaginated.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TaxReturnsPersonalPaginated.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TaxReturnsYearlyRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TaxStatusAddressBetweenStreetDian.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TaxStatusAddressBetweenStreetSat.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TaxStatusAddressDian.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TaxStatusAddressSat.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TaxStatusDian.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TaxStatusEconomicActivityDian.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TaxStatusEconomicActivitySat.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TaxStatusObligationsDian.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TaxStatusObligationsSat.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TaxStatusPaginatedResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TaxStatusRegimensDian.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TaxStatusRegimensSat.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TaxStatusRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TaxStatusSat.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TaxStatusTaxPayerInformationDian.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TaxStatusTaxPayerInformationSat.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TokenRequiredResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TokenRequiredResponseTokenGenerationData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TooManySessionsError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.Transaction.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TransactionBankAccountBodyPse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TransactionCreditCardData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TransactionMerchantData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TransactionsPaginatedResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.TransactionsRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.UnconfirmedLinkError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.UnexpectedError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.UnsupportedOperationError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.belvo.client.model.ValidationError.CustomTypeAdapterFactory());
        gsonBuilder.disableHtmlEscaping();
        gson = gsonBuilder.create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}
